package niit.start.util;

import java.util.List;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.repository.VListRepository;
import niit.start.entity.VList;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("api")
public class LogGenerator {
    @Resource(name = "VListRepository")
    private VListRepository VListRepository;

    @RequestMapping("/generateLog")
    @ResponseBody
    public boolean generateLog(int n) {
        List<VList> list;
        list = VListRepository.findAll();
        String[] city = {"上海", "广东", "北京", "江苏", "浙江"};
        Random random = new Random();
        boolean res = false;
        try {
            for (int i = 0; i < n; i++) {
                int t1 = random.nextInt(list.size());
                int t2 = random.nextInt(city.length);
                log.info("{}:{} from {}", list.get(t1).getAuthor(), list.get(t1).getBvid(), city[t2]);
            }
            res = true;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return res;
    }

    @PostMapping("/addLog")
    @ResponseBody
    public void addLog(String author, String bvid, String location) {
        String loc = location.split(" ")[0];
        log.info("{}:{} from {}", author, bvid, loc);
    }
}
