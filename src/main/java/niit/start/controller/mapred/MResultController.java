package niit.start.controller.mapred;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.mapred.MResultRepository;
import niit.start.entity.mapred.MResult;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api")
public class MResultController {
    @Resource(name = "MResultRepository")
    private MResultRepository MResultRepository;

    @RequestMapping("/getMResult")
    @ResponseBody
    public List<MResult> findAll() {
        List<MResult> list;
        list = MResultRepository.findAll();
        return list;
    }

    @RequestMapping("/getDistinctTm")
    @ResponseBody
    public List<String> getDistinctTm() {
        List<String> list;
        list = MResultRepository.getDistinctTm();
        return list;
    }

    @RequestMapping("/getMResultByType")
    @ResponseBody
    public List<MResult> getMResultByType(int type) {
        List<MResult> list;
        list = MResultRepository.getMResultByType(type);
        return list;
    }

    @RequestMapping("/getMResultByTypeAndTm")
    @ResponseBody
    public List<MResult> getMResultByTypeAndTm(int type, String tm) {
        List<MResult> list;
        list = MResultRepository.getMResultByTypeAndTm(type, tm);
        return list;
    }

    @RequestMapping("/getMResultByNameAndTm")
    @ResponseBody
    public MResult getMResultByNameAndTm(String name, String tm) {
        MResult mr;
        mr = MResultRepository.getMResultByNameAndTm(name, tm);
        return mr;
    }
}
