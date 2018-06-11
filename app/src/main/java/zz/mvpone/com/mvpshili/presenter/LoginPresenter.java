package zz.mvpone.com.mvpshili.presenter;

import android.util.Log;

import zz.mvpone.com.mvpshili.Modler.LoginModler;
import zz.mvpone.com.mvpshili.Modler.LoginModlerImpl;
import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean;
import zz.mvpone.com.mvpshili.cantract.LoginInterface;

/**
 * Created by Administrator on 2018-06-03.
 */

public class LoginPresenter implements LoginInterface.Presenter{

    private LoginInterface.View view;
    private LoginModlerImpl modler;
    public LoginPresenter(LoginInterface.View view){
        this.view = view;
        this.modler = new LoginModler();

    }
    @Override
    public void LodDete(String account,String password) {
         modler.getDates(account, password, new LoginModlerImpl.Getpass() {
             @Override
             public void getpassword(PasswordBean passwordBean) {
                 Log.d("ceshi",".......................1");
                 view.setDate(passwordBean);
             }
         });



    }

}
