package zz.mvpone.com.mvpshili;

import android.app.Application;
import android.content.Context;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by Administrator on 2018-05-30.
 */

public class App extends Application{
    public static Context appcontext;
    @Override
    public void onCreate() {
        super.onCreate();
        appcontext = this;
        AndroidNetworking.initialize(this);
    }
}
