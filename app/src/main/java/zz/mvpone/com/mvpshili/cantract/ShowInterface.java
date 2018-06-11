package zz.mvpone.com.mvpshili.cantract;

import java.util.List;

/**
 * Created by Administrator on 2018-05-29.
 */

public interface ShowInterface {
    //建立modler的桥梁
    interface modler{
        List<String> getDate();
    }
    //建立view的桥梁
    interface view{
        void setDate(List<String> strings);
    }
    //建立presenter的桥梁
    interface presenter{
        void loadDate();
    }
}
