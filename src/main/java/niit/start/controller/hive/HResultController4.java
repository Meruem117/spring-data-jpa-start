package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.hive.HResultDao4;
import niit.start.entity.hive.HResult4;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class HResultController4 {
    @Resource(name = "HResultDao4")
    private HResultDao4 HResultDao4;

    @RequestMapping("/getHResult4")
    @ResponseBody
    public List<HResult4> findAll() {
        List<HResult4> list;
        list = HResultDao4.findAll();
        return list;
    }

}
