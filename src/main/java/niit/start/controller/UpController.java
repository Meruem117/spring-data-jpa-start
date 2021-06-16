package niit.start.controller;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.UpDao;
import niit.start.entity.Up;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class UpController {
    @Resource(name = "upDao")
    private UpDao UpDao;

    @RequestMapping("/getUp")
    @ResponseBody
    public List<Up> findAll() {
        List<Up> list;
        list = UpDao.findAll();
        return list;
    }

    @PostMapping("/addUp")
    @ResponseBody
    public void addUp(int id, String mid, String name) {
        Up up = new Up();
        up.setId(id);
        up.setMid(mid);
        up.setName(name);
        UpDao.save(up);
    }

    @Transactional
    @RequestMapping("/deleteUp")
    @ResponseBody
    public void deleteUp(int id) {
        UpDao.deleteById(id);
    }

    @PostMapping("/updateUp")
    @ResponseBody
    public void updateUp(int id, String mid, String name) {
        Up up = UpDao.getUpById(id);
        up.setId(id);
        up.setMid(mid);
        up.setName(name);
        UpDao.save(up);
    }
}
