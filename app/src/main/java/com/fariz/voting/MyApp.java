package com.fariz.voting;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

public class MyApp extends Application {
    private DaoSession daoSession;

    private static com.fariz.voting.MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"votea-db");
        Database db =  helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static synchronized com.fariz.voting.MyApp getInstance() {
        return mInstance;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}