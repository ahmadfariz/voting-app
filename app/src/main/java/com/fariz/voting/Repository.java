package com.fariz.voting;

import java.util.List;

public class Repository {
    UserDao userDao;
    List<User> list;

    public Repository() {
        DaoSession daoSession = com.fariz.voting.MyApp.getInstance().getDaoSession();
        userDao = daoSession.getUserDao();
    }


    public List<User> getAllData() {
        list = userDao.loadAll();

        return list;
    }
    public void addData( User user) { userDao.insert(user); }
}