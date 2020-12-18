package com.mmc.ssh.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mmc.ssh.dao.UserDao;
import com.mmc.ssh.entity.User;
import com.mmc.ssh.exception.MyException;

@Service("userService")
public class UserService {

    @Resource(name = "UserDao")
    private UserDao userDao;

    @Transactional
    public void saveUser(User u) {
        userDao.saveUser(u);
    }

    @Transactional
    public User getUserByUserName(String userName) throws MyException {
        User user = userDao.getUserByUserName(userName);
        if (user == null) {
            throw new MyException("此用户不存在");
        } else {
            return user;
        }
    }
}
