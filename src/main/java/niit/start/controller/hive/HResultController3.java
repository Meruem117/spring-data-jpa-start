package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.hive.HResultRepository3;
import niit.start.entity.hive.HResult3;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController3 {
    @Resource(name = "HResultRepository3")
    private HResultRepository3 HResultRepository3;

    @RequestMapping("/getHResult3")
    @ResponseBody
    public List<HResult3> findAll() {
        List<HResult3> list;
        list = HResultRepository3.findAll();
        return list;
    }

}
