package niit.start.controller;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.UpRepository;
import niit.start.entity.Up;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class UpController {
    @Resource(name = "UpRepository")
    private UpRepository UpRepository;

    @RequestMapping("/getUp")
    @ResponseBody
    public List<Up> findAll() {
        List<Up> list;
        list = UpRepository.findAll();
        return list;
    }

    @PostMapping("/addUp")
    @ResponseBody
    public void addUp(int id, String mid, String name) {
        Up up = new Up();
        up.setId(id);
        up.setMid(mid);
        up.setName(name);
        UpRepository.save(up);
    }

    @Transactional
    @RequestMapping("/deleteUp")
    @ResponseBody
    public void deleteUp(int id) {
        UpRepository.deleteById(id);
    }

    @PostMapping("/updateUp")
    @ResponseBody
    public void updateUp(int id, String mid, String name) {
        Up up = UpRepository.getUpById(id);
        up.setId(id);
        up.setMid(mid);
        up.setName(name);
        UpRepository.save(up);
    }
}
