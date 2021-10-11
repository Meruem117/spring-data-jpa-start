package niit.start.controller;

import lombok.extern.slf4j.Slf4j;
import niit.start.entity.VList;
import niit.start.repository.VListRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public List<VList> getVList(@RequestParam("start") int start, @RequestParam("size") int size) {
        PageRequest pageRequest = PageRequest.of(start, size);
        Page<VList> page = VListRepository.findAll(pageRequest);
        List<VList> list = page.getContent();
        return list;
    }

    @GetMapping("/getByMid")
    @ResponseBody
    public List<VList> getVListByMid(@RequestParam("mid") String mid, @RequestParam("start") int start, @RequestParam("size") int size) {
        // PageRequest pageRequest = PageRequest.of(start, size);
        List<VList> list = VListRepository.getVListByMid(mid);
        return list;
    }

    @GetMapping("/getByBvid")
    @ResponseBody
    public VList getVideoByBvid(@RequestParam("bvid") String bvid) {
        VList vlist = VListRepository.getVideoByBvid(bvid);
        return vlist;
    }

}
