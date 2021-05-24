package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.hive.HResultDao1;
import niit.start.entity.hive.HResult1;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController1 {
    @Resource(name = "HResultDao1")
    private HResultDao1 HResultDao1;

    @RequestMapping("/getHResult1")
    @ResponseBody
    public List<HResult1> findAll() {
        List<HResult1> list;
        list = HResultDao1.findAll();
        return list;
    }

}
