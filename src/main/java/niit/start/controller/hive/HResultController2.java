package niit.start.controller.hive;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.hive.HResultRepository2;
import niit.start.entity.hive.HResult2;

import javax.annotation.Resource;

@RestController
@RequestMapping("/chart")
public class HResultController2 {
    @Resource(name = "HResultRepository2")
    private HResultRepository2 HResultRepository2;

    @RequestMapping("/getHResult2")
    @ResponseBody
    public List<HResult2> findAll() {
        List<HResult2> list;
        list = HResultRepository2.findAll();
        return list;
    }

}
