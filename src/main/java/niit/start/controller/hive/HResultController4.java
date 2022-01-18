package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.hive.HResultRepository4;
import niit.start.entity.hive.HResult4;

import javax.annotation.Resource;

@RestController
@RequestMapping("/chart")
public class HResultController4 {
    @Resource(name = "HResultRepository4")
    private HResultRepository4 HResultRepository4;

    @RequestMapping("/getHResult4")
    @ResponseBody
    public List<HResult4> findAll() {
        List<HResult4> list;
        list = HResultRepository4.findAll();
        return list;
    }

}
