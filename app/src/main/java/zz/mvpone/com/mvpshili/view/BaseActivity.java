package zz.mvpone.com.mvpshili.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import zz.mvpone.com.mvpshili.utils.Activitmessage;


/**
 * Created by xiongwenwei@aliyun.com
 * CreateTime: 2017/1/12
 * Note:
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("活动名：",getClass().getSimpleName());

        Activitmessage.AddActivity(this);
        initView();
    }

    public void initView() {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Activitmessage.RemoveActivity(this);
    }
}
