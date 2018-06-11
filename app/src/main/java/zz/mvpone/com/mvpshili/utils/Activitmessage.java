package zz.mvpone.com.mvpshili.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-03-06.
 */

public class Activitmessage {
    private static List<Activity> activitys = new ArrayList<>();

    public static void AddActivity(Activity activity){
        activitys.add(activity);
    }
    public static void RemoveActivity(Activity activity){
        activitys.remove(activity);
    }
    public static void AllActivityFinsh(){
        for (Activity activity:activitys){
            activity.finish();
        }
    }
}
