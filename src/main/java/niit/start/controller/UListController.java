package niit.start.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.UListRepository;
import niit.start.entity.UList;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class UListController {
    @Resource(name = "UListRepository")
    private UListRepository UListRepository;

    @RequestMapping("/getUList")
    @ResponseBody
    public List<UList> findAll() {
        List<UList> list;
        list = UListRepository.findAll();
        return list;
    }

    @RequestMapping("/getUpByMid")
    @ResponseBody
    public UList getUpByMid(String mid) {
        UList ulist = UListRepository.getUpByMid(mid);
        return ulist;
    }
}
