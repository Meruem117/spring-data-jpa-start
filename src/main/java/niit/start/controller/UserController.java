package niit.start.controller;

import niit.start.entity.User;
import niit.start.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserRepository UserRepository;

    @GetMapping("/get")
    @ResponseBody
    public List<User> getUsers(@RequestParam("start") int start, @RequestParam("size") int size) {
        PageRequest pageRequest = PageRequest.of(start, size);
        Page<User> page = UserRepository.findAll(pageRequest);
        List<User> list = page.getContent();
        return list;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers() {
        List<User> list = UserRepository.findAll();
        return list;
    }

    @GetMapping("/getById")
    @ResponseBody
    public User getUserById(@RequestParam("id") int id) {
        User user = UserRepository.getUserById(id);
        return user;
    }

    @GetMapping("/getByName")
    @ResponseBody
    public User getUserByName(@RequestParam("name") String name) {
        User user = UserRepository.getUserByName(name);
        return user;
    }

    @GetMapping("/check")
    @ResponseBody
    public String checkUser(@RequestParam("name") String name) {
        User user = UserRepository.getUserByName(name);
        return user.getPassword();
    }

    @PostMapping("/add")
    @ResponseBody
    public int addUser(@RequestBody User user) {
        user.setRole("user");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        user.setCreated(date);
        UserRepository.save(user);
        return user.getId();
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateUser(@RequestBody User user) {
        UserRepository.save(user);
        return user.getId();
    }

    @PostMapping("/delete")
    @ResponseBody
    public int deleteUser(@RequestBody int id) {
        UserRepository.deleteUserById(id);
        return id;
    }
}
