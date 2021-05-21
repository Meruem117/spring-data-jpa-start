package niit.start.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.UListDao;
import niit.start.bean.UList;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class UListController {
    @Resource(name = "UListDao")
    private UListDao UListDao;

    @RequestMapping("/getUList")
    @ResponseBody
    public List<UList> findAll() {
        List<UList> list;
        list = UListDao.findAll();
        return list;
    }

    @RequestMapping("/getUpByMid")
    @ResponseBody
    public UList getUpByMid(String mid) {
        UList ulist = UListDao.getUpByMid(mid);
        return ulist;
    }
}
