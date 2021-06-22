package niit.start.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.VListRepository;
import niit.start.entity.VList;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("api")
public class VListController {
    @Resource(name = "VListRepository")
    private VListRepository VListRepository;

    @RequestMapping("/getVList")
    @ResponseBody
    public List<VList> findAll() {
        List<VList> list;
        list = VListRepository.findAll();
        return list;
    }

    @RequestMapping("/getVListByMid")
    @ResponseBody
    public List<VList> getVListByMid(String mid) {
        List<VList> list;
        list = VListRepository.getVListByMid(mid);
        return list;
    }

    @RequestMapping("/getVideoByBvid")
    @ResponseBody
    public VList getVideoByBvid(String bvid) {
        VList vlist = VListRepository.getVideoByBvid(bvid);
        return vlist;
    }

}
