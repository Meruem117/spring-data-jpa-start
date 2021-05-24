package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.hive.HResultDao2;
import niit.start.entity.hive.HResult2;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController2 {
    @Resource(name = "HResultDao2")
    private HResultDao2 HResultDao2;

    @RequestMapping("/getHResult2")
    @ResponseBody
    public List<HResult2> findAll() {
        List<HResult2> list;
        list = HResultDao2.findAll();
        return list;
    }

}
