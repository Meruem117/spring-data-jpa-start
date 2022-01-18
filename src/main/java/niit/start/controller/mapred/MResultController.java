package niit.start.controller.mapred;

import niit.start.entity.mapred.MResult;
import niit.start.repository.mapred.MResultRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/chart")
public class MResultController {
    @Resource
    private MResultRepository MResultRepository;

    @GetMapping("/getMResult")
    @ResponseBody
    public List<MResult> findAll() {
        List<MResult> list;
        list = MResultRepository.findAll();
        return list;
    }

    @GetMapping("/getDistinctTm")
    @ResponseBody
    public List<String> getDistinctTm() {
        List<String> list;
        list = MResultRepository.getDistinctTm();
        return list;
    }

    @GetMapping("/getMResultByType")
    @ResponseBody
    public List<MResult> getMResultByType(int type) {
        List<MResult> list;
        list = MResultRepository.getMResultByType(type);
        return list;
    }

    @GetMapping("/getMResultByTypeAndTm")
    @ResponseBody
    public List<MResult> getMResultByTypeAndTm(int type, String tm) {
        List<MResult> list;
        list = MResultRepository.getMResultByTypeAndTm(type, tm);
        return list;
    }

    @GetMapping("/getMResultByNameAndTm")
    @ResponseBody
    public MResult getMResultByNameAndTm(String name, String tm) {
        MResult mr;
        mr = MResultRepository.getMResultByNameAndTm(name, tm);
        return mr;
    }
}
