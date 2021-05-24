package niit.start.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import niit.start.dao.UserDao;
import niit.start.entity.User;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class UserController {
    @Resource(name = "userDao")
    private UserDao UserDao;

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> findAll() {
        List<User> list;
        list = UserDao.findAll();
        return list;
    }

    @RequestMapping("/getUserByName")
    @ResponseBody
    public User getUserByName(String name) {
        User user = UserDao.getUserByName(name);
        return user;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(int id) {
        User user = UserDao.getUserById(id);
        return user;
    }
}
