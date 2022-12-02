package cn.scnj.service;

import cn.scnj.domain.User;

public interface UserService {
    User queryPoint(String userId);

    void updateUserByUser(String userId,Integer moenry);
}
