package zz.mvpone.com.mvpshili.cantract;

import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean;

/**
 * Created by Administrator on 2018-06-03.
 */

public interface LoginInterface {



    //建立view的
    interface View{
        void setDate(PasswordBean passwordBean);
    }
    //建立presenter的
    interface Presenter{
        void LodDete(String account,String password);
    }
}
