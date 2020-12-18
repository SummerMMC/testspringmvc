package com.mmc.ssh.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mmc.ssh.entity.User;

@Repository("UserDao")
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User u) {
        sessionFactory.getCurrentSession().save(u);
    }

    public User getUserByUserName(String userName) {
        User user = (User) sessionFactory.getCurrentSession().createQuery("from User where name = ?").setParameter(0, userName).uniqueResult();
        return user;
    }

}
