package zz.mvpone.com.mvpshili.presenter;

import java.util.List;

import zz.mvpone.com.mvpshili.Modler.ShowModler;
import zz.mvpone.com.mvpshili.cantract.ShowInterface;

/**
 * Created by Administrator on 2018-05-29.
 */

public class ShowPresenter implements ShowInterface.presenter{

    private ShowInterface.view view;
    private ShowInterface.modler modler;
    public ShowPresenter(ShowInterface.view view){
       this.view = view;
       this.modler = new ShowModler();
    }
    @Override
    public void loadDate() {
        modler.getDate();
        view.setDate(modler.getDate());
    }
}
