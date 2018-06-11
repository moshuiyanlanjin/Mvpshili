package zz.mvpone.com.mvpshili.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.List;
import java.util.Observable;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import zz.mvpone.com.mvpshili.App;
import zz.mvpone.com.mvpshili.R;
import zz.mvpone.com.mvpshili.ToastUtil;
import zz.mvpone.com.mvpshili.cantract.ShowInterface;
import zz.mvpone.com.mvpshili.presenter.ShowPresenter;
import zz.mvpone.com.mvpshili.view.adapter.ShowAdapter;


public class MainActivity extends AppCompatActivity implements ShowInterface.view{

    RecyclerView recy;
    ShowPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = findViewById(R.id.recy);
        presenter = new ShowPresenter(this);
        presenter.loadDate();
        ceshiRxjava();
    }

    private void ceshiRxjava() {
        io.reactivex.Observable.create(new ObservableOnSubscribe<Integer>() {

            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);


            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer value) {
                switch (value){
                    case 1:
                        ToastUtil.showToast(App.appcontext,"1");
                        break;
                    case 2:
                        ToastUtil.showToast(App.appcontext,"2");
                        break;
                }
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        io.reactivex.Observable.just(1,2,3,4,5,6,7,8,9)
                .buffer(4,3)
                .subscribe(new Consumer<List<Integer>>() {
                    @Override
                    public void accept(List<Integer> integers) throws Exception {
                        Log.d("几数量",integers.size()+"");
                        for (Integer i : integers){
                            Log.d("几：",i+"");
                        }
                    }
                });
        io.reactivex.Observable.just(1,2,.3,4)
                .last(9)
                .subscribe(new Consumer<Number>() {
                    @Override
                    public void accept(Number number) throws Exception {
                        Log.d("是===",number+"");
                    }
                });

        io.reactivex.Observable.just(1,2, 3,4)
                .reduce(new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) throws Exception {
                        return integer+integer2;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                Log.d("王++++",integer+"");

            }
        });

    }

    @Override
    public void setDate(List<String> strings) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        ShowAdapter adapter = new ShowAdapter(this,strings);
        recy.setLayoutManager(layoutManager);
        recy.setAdapter(adapter);
        adapter.setOncli(new ShowAdapter.Oncli() {
            @SuppressLint("ShowToast")
            @Override
            public void onclic(String s) {
                Log.d("11",s);
                ToastUtil.showToast(App.appcontext,"请欣赏"+s);
                if(s.equals("逆流成河")){
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
