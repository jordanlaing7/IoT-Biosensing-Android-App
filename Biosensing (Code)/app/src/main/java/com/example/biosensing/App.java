package com.example.jorda.graph;

import android.app.Application;
import android.content.Context;

/**
 * Created by Ripton on 3/28/2017.
 */

public class App extends Application {
    public static Context context;

    @Override public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
