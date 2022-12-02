package cn.scnj.service;

import cn.scnj.domain.User;
import cn.scnj.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryPoint(String userId) {
        return userMapper.selectByUserId(userId);
    }

    @Override
    public void updateUserByUser(String userId, Integer money) {
        userMapper.updateUserPoint(userId,money*3);
    }
}
