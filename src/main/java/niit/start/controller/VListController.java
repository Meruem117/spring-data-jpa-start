package niit.start.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.VListDao;
import niit.start.bean.VList;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("api")
public class VListController {
    @Resource(name = "VListDao")
    private VListDao VListDao;

    @RequestMapping("/getVList")
    @ResponseBody
    public List<VList> findAll() {
        List<VList> list;
        list = VListDao.findAll();
        return list;
    }

    @RequestMapping("/getVListByMid")
    @ResponseBody
    public List<VList> getVListByMid(String mid) {
        List<VList> list;
        list = VListDao.getVListByMid(mid);
//        log.info("view up: {}", mid);
        return list;
    }

    @RequestMapping("/getVideoByBvid")
    @ResponseBody
    public VList getVideoByBvid(String bvid) {
        VList vlist = VListDao.getVideoByBvid(bvid);
        log.info("{}:{} from {}", vlist.getAuthor(), vlist.getBvid(), "常州");
        return vlist;
    }

}
