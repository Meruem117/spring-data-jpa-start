package niit.start.controller;

import niit.start.entity.UList;
import niit.start.repository.UListRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ulist")
public class UListController {
    @Resource
    private UListRepository UListRepository;

    @GetMapping("/get")
    @ResponseBody
    public List<UList> getUList(@RequestParam("start") int start, @RequestParam("size") int size) {
        PageRequest pageRequest = PageRequest.of(start, size);
        Page<UList> page = UListRepository.findAll(pageRequest);
        List<UList> list = page.getContent();
        return list;
    }
}
