package sample.com.navdrawernightmode;

import android.app.Application;

public class App extends Application{
    public boolean nightMode = false;
    private static App singleton;

    public static App getInstance() {
        return singleton;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }

    public boolean toggleNightMode(){
        nightMode = !nightMode;
        return nightMode;
    }
}
