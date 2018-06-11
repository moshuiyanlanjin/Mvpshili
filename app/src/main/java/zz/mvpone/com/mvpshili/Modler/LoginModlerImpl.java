package zz.mvpone.com.mvpshili.Modler;

import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean;

/**
 * Created by Administrator on 2018-06-07.
 */

public interface LoginModlerImpl {

    void getDates(String account, String password,Getpass getpass);



    public interface Getpass{
        void getpassword(PasswordBean passwordBean);
    }
}
