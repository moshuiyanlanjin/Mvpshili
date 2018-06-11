package zz.mvpone.com.mvpshili.Modler;

import java.util.ArrayList;
import java.util.List;

import zz.mvpone.com.mvpshili.cantract.ShowInterface;

/**
 * Created by Administrator on 2018-05-29.
 */

public class ShowModler implements ShowInterface.modler{

    @Override
    public List<String> getDate() {
        List<String> strings=new ArrayList<>();
        strings.add(0,"MVP");
        strings.add(1,"凉凉");
        strings.add(2,"孙大剩");
        strings.add(3,"我们都是好孩子");
        return strings;
    }
}
