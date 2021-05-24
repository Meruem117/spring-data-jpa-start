package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.hive.HResultDao3;
import niit.start.entity.hive.HResult3;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController3 {
    @Resource(name = "HResultDao3")
    private HResultDao3 HResultDao3;

    @RequestMapping("/getHResult3")
    @ResponseBody
    public List<HResult3> findAll() {
        List<HResult3> list;
        list = HResultDao3.findAll();
        return list;
    }

}
