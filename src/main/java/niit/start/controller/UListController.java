package niit.start.controller;

import niit.start.entity.UList;
import niit.start.repository.UListRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ulist")
public class UListController {
    @Resource
    private UListRepository UListRepository;

    @GetMapping("/get")
    @ResponseBody
    public List<UList> findAll() {
        List<UList> list;
        list = UListRepository.findAll();
        return list;
    }

    @GetMapping("/getByMid")
    @ResponseBody
    public UList getUpByMid(@RequestParam("mid") String mid) {
        UList ulist = UListRepository.getUpByMid(mid);
        return ulist;
    }
}
