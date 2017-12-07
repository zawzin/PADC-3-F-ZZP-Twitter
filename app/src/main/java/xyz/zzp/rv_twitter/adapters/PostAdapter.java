package xyz.zzp.rv_twitter.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.zzp.rv_twitter.R;
import xyz.zzp.rv_twitter.viewholders.ItemPostViewHolder;

/**
 * Created by Lenovo on 12/7/2017.
 */

public class PostAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View postItemView = layoutInflater.inflate(R.layout.item_twitter,parent,false);
        ItemPostViewHolder itemPostViewHolder = new ItemPostViewHolder(postItemView);
        return itemPostViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
