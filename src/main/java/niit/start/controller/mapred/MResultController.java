package niit.start.controller.mapred;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.mapred.MResultDao;
import niit.start.entity.mapred.MResult;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api")
public class MResultController {
    @Resource(name = "MResultDao")
    private MResultDao MResultDao;

    @RequestMapping("/getMResult")
    @ResponseBody
    public List<MResult> findAll() {
        List<MResult> list;
        list = MResultDao.findAll();
        return list;
    }

    @RequestMapping("/getMResultByType")
    @ResponseBody
    public List<MResult> getMResultByType(int type) {
        List<MResult> list;
        list = MResultDao.getMResultByType(type);
        return list;
    }
}
