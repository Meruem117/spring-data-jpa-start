package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.hive.HResultRepository1;
import niit.start.entity.hive.HResult1;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController1 {
    @Resource(name = "HResultRepository1")
    private HResultRepository1 HResultRepository1;

    @RequestMapping("/getHResult1")
    @ResponseBody
    public List<HResult1> findAll() {
        List<HResult1> list;
        list = HResultRepository1.findAll();
        return list;
    }

}
