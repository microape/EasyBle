package com.microape.easyble;

import android.app.Application;

/**
 *  * Author：pengl on 2019/3/13 09:42
 *  * Email ：pengle609@163.com
 *  
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        EasyBle.newInstance().init(this);
    }
}
