package niit.start.util;

import java.util.List;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.VListDao;
import niit.start.entity.VList;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("api")
public class LogGenerator {
    @Resource(name = "VListDao")
    private VListDao VListDao;

    @RequestMapping("/generateLog")
    @ResponseBody
    public boolean findAll() {
        List<VList> list;
        list = VListDao.findAll();
        String[] city = {"上海", "广东", "北京", "江苏", "浙江"};
        Random random = new Random();
        boolean res = false;
        try {
            for (int i = 0; i < 100; i++) {
                int t1 = random.nextInt(list.size());
                int t2 = random.nextInt(city.length);
//                System.out.print(list.get(t1).getAuthor() + ':' + list.get(t1).getBvid() + "from" + city[t2] + "\n");
                log.info("{}:{} from {}", list.get(t1).getAuthor(), list.get(t1).getBvid(), city[t2]);
            }
            res = true;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return res;
    }
}