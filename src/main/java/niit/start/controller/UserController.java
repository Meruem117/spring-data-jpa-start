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
import java.util.Objects;

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

    @GetMapping("/exist")
    @ResponseBody
    public Boolean existsByName(@RequestParam("name") String name) {
        Boolean res = UserRepository.existsByName(name);
        return res;
    }

    @PostMapping("/check")
    @ResponseBody
    public Boolean checkUser(@RequestBody User user) {
        String name = user.getName();
        String password = user.getPassword();
        return Objects.equals(password, UserRepository.getUserByName(name).getPassword());
    }

    @PostMapping("/login")
    @ResponseBody
    public User loginUser(@RequestBody User user) {
        String name = user.getName();
        String password = user.getPassword();
        if (Objects.equals(password, UserRepository.getUserByName(name).getPassword())) {
            return UserRepository.getUserByName(name);
        }
        return null;
    }

    @PostMapping("/add")
    @ResponseBody
    public Integer addUser(@RequestBody User user) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        user.setCreated(date);
        UserRepository.save(user);
        return user.getId();
    }

    @PostMapping("/update")
    @ResponseBody
    public Integer updateUser(@RequestBody User user) {
        UserRepository.save(user);
        return user.getId();
    }

    @PostMapping("/delete")
    @ResponseBody
    public Integer deleteUser(@RequestBody int id) {
        UserRepository.deleteUserById(id);
        return id;
    }
}
