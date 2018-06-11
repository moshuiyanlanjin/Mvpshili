package zz.mvpone.com.mvpshili.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import zz.mvpone.com.mvpshili.R;
import zz.mvpone.com.mvpshili.view.MainActivity;

/**
 * Created by Administrator on 2018-05-30.
 */

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ViewHolder>{
    private Context context;
    private List<String> strings;
    private Oncli oncli;
    public ShowAdapter(MainActivity mainActivity, List<String> strings) {
        this.context = mainActivity;
        this.strings = strings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_show, parent,false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.textView.setText(strings.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oncli.onclic(strings.get(position));
                Log.d("11","11");
            }
        });
    }

    public interface Oncli{
        void onclic(String s);
    }
    public void setOncli(Oncli oncli){
        this.oncli = oncli;
    }
    @Override
    public int getItemCount() {
        return strings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
