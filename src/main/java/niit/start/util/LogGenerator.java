package niit.start.util;

import lombok.extern.slf4j.Slf4j;
import niit.start.entity.Log;
import niit.start.entity.VList;
import niit.start.repository.VListRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogGenerator {
    @Resource
    private VListRepository VListRepository;

    @GetMapping("/generate")
    @ResponseBody
    public boolean generateLog(@RequestParam int number) {
        List<VList> list;
        list = VListRepository.findAll();
        String[] city = {"上海", "广东", "北京", "江苏", "浙江"};
        Random random = new Random();
        boolean res = false;
        try {
            for (int i = 0; i < number; i++) {
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

    @PostMapping("/add")
    @ResponseBody
    public void addLog(@RequestBody Log logItem) {
        String author = logItem.getAuthor();
        String bvid = logItem.getBvid();
        String loc = logItem.getLocation().split(" ")[0];
        log.info("{}:{} from {}", author, bvid, loc);
    }
}
