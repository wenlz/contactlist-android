package com.wenlypranata.www.contactlist;

import android.app.Application;
import android.content.Context;

/**
 * Created by wenlz on 11/4/2016.
 */

public class AppController extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        AppController.context = getApplicationContext();
    }
}
