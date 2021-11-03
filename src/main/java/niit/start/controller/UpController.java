package niit.start.controller;

import niit.start.entity.Up;
import niit.start.repository.UpRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/up")
public class UpController {
    @Resource
    private UpRepository upRepository;

    @GetMapping("/get")
    @ResponseBody
    public List<Up> getUps(@RequestParam("start") int start, @RequestParam("size") int size) {
        PageRequest pageRequest = PageRequest.of(start, size);
        Page<Up> page = upRepository.findAll(pageRequest);
        List<Up> list = page.getContent();
        return list;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Up> getAllUps() {
        List<Up> list = upRepository.findAll();
        return list;
    }

    @PostMapping("/add")
    @ResponseBody
    public int addUp(@RequestBody Up up) {
        upRepository.save(up);
        return up.getId();
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateUp(@RequestBody Up up) {
        upRepository.save(up);
        return up.getId();
    }

    @PostMapping("/delete")
    @ResponseBody
    public int deleteUp(@RequestBody int id) {
        upRepository.deleteById(id);
        return id;
    }
}
