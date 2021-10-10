package niit.start.controller;

import niit.start.entity.Up;
import niit.start.repository.UpRepository;
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
    public List<Up> getUps() {
        List<Up> list;
        list = upRepository.findAll();
        return list;
    }

    @PostMapping("/add")
    @ResponseBody
    public int addUp(@RequestBody Up up) {
        System.out.println(up);
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
