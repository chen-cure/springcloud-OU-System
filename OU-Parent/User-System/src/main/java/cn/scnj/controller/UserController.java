package cn.scnj.controller;

import cn.scnj.domain.User;
import cn.scnj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/query/point")
    public User query(String userId){
        return userService.queryPoint(userId);
    }

    @RequestMapping("/user/update/point")
    public Integer update(String userId,Integer money){
        try {
            userService.updateUserByUser(userId,money);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
