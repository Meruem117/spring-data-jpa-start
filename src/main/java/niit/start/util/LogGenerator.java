package niit.start.util;

import niit.start.entity.Log;
import niit.start.entity.VList;
import niit.start.repository.VListRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/log")
public class LogGenerator {
    @Resource
    private VListRepository VListRepository;

    private static final Logger logger = LoggerFactory.getLogger(LogGenerator.class);

    @GetMapping("/generate")
    @ResponseBody
    public boolean generateLog(@RequestParam int number) {
        List<VList> list;
        list = VListRepository.findAll();
        String[] city = {"上海", "广东", "北京", "江苏", "浙江"};
        int size = list.size();
        int length = city.length;
        Random random = new Random();
        boolean res = false;
        try {
            for (int i = 0; i < number; i++) {
                int t1 = random.nextInt(size);
                int t2 = random.nextInt(length);
                logger.info("{}:{} from {}", list.get(t1).getAuthor(), list.get(t1).getBvid(), city[t2]);
            }
            res = true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return res;
    }

    @PostMapping("/add")
    @ResponseBody
    public void addLog(@RequestBody Log log) {
        String author = log.getAuthor();
        String bvid = log.getBvid();
        String loc = log.getLocation().split(" ")[0];
        logger.info("{}:{} from {}", author, bvid, loc);
    }
}
