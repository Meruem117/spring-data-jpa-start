package niit.start.controller;

import lombok.extern.slf4j.Slf4j;
import niit.start.entity.VList;
import niit.start.repository.VListRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/vlist")
public class VListController {
    @Resource
    private VListRepository VListRepository;

    @GetMapping("/get")
    @ResponseBody
    public List<VList> findAll() {
        List<VList> list;
        list = VListRepository.findAll();
        return list;
    }

    @GetMapping("/getByMid")
    @ResponseBody
    public List<VList> getVListByMid(@RequestParam("mid") String mid) {
        List<VList> list;
        list = VListRepository.getVListByMid(mid);
        return list;
    }

    @GetMapping("/getByBvid")
    @ResponseBody
    public VList getVideoByBvid(@RequestParam("bvid") String bvid) {
        VList vlist = VListRepository.getVideoByBvid(bvid);
        return vlist;
    }

}
