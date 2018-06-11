package zz.mvpone.com.mvpshili.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import zz.mvpone.com.mvpshili.Modler.bean.PasswordBean;
import zz.mvpone.com.mvpshili.R;
import zz.mvpone.com.mvpshili.cantract.LoginInterface;
import zz.mvpone.com.mvpshili.presenter.LoginPresenter;

/**
 * Created by Administrator on 2018-06-03.
 */

public class LoginActivity extends BaseActivity implements LoginInterface.View {
    LoginPresenter presenter;
    @BindView(R.id.account)
    EditText account;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);

    }

    @Override
    public void initView() {
        super.initView();
    }



    @OnClick(R.id.button)
    public void onViewClicked() {
        presenter.LodDete(account.getText().toString(),password.getText().toString());

    }

    @Override
    public void setDate(PasswordBean passwordBean) {
        Log.d("lidh","passwordBean = "+passwordBean.getData());
    }
}
