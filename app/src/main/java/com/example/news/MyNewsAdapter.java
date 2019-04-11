package com.example.news;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyNewsAdapter extends RecyclerView.Adapter<MyNewsAdapter.MyviewHolder>{
    List<Bean.DataBean.TechBean> list = new ArrayList<>();
    private Context  context;

   public  void  refresh( List<Bean.DataBean.TechBean> list){
       this.list.addAll(list);
       notifyDataSetChanged();
   }


    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_news, viewGroup, false);
        return new MyviewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, int i) {
        myviewHolder.text01.setText(list.get(i).getSource());
        myviewHolder.text02.setText(list.get(i).getTitle());
        myviewHolder.imageView.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  MyviewHolder  extends RecyclerView.ViewHolder {
        private ImageView  imageView;
        private TextView   text01,text02;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_btn);
            text01 = itemView.findViewById(R.id.news_text1);
            text02 = itemView.findViewById(R.id.news_text2);
        }
    }
}
