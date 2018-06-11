package zz.mvpone.com.mvpshili.Modler;

import android.util.Log;

import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean;
import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean.DataBean;
import zz.mvpone.com.mvpshili.cantract.LoginInterface;

/**
 * Created by Administrator on 2018-06-03.
 */

public class LoginModler implements LoginModlerImpl {


    @Override
    public void getDates(String account, String password, Getpass getpass) {
        Rx2AndroidNetworking.post(HttpNtlis.SigninPas)
                .addBodyParameter("phone", account)
                .addBodyParameter("passWord", password)
                .build()
                .getObjectObservable(PasswordBean.class)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
               /* .doOnNext(new Consumer<PasswordBean>() {
                    @Override
                    public void accept(PasswordBean passwordBean) throws Exception {
                        Log.d("------------------","---------------------");
                    }
                })*/
                .map(new Function<PasswordBean, DataBean>() {
                    @Override
                    public DataBean apply(PasswordBean passwordBean) throws Exception {
                        Log.d("打印", passwordBean.toString());

                        return passwordBean.getData();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DataBean>() {
                    @Override
                    public void accept(DataBean dataBean) throws Exception {
                        Log.d("打印",dataBean.getToken());
                        if(dataBean != null){
                            //login.lgin(dataBean);

                        }
                    }
                });
    }


    //  private Login login;






}
