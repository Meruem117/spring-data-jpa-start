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

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(int id) {
        User user = UserDao.getUserById(id);
        return user;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public boolean addUser(User u) {
//        User user = UserDao.getUserById(id);
        return true;
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public boolean deleteUserById(int id) {
        boolean res = false;
        try {
            UserDao.deleteUserById(id);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public boolean getUserById(User u) {
        boolean res = false;
        try {
            User user = UserDao.getUserById(u.getId());
            user.setName(u.getName());
            user.setPassword(u.getPassword());
            user.setRole(u.getRole());
            user.setLocation(u.getLocation());
            user.setBirthday(u.getBirthday());
            user.setGender(u.getGender());
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
