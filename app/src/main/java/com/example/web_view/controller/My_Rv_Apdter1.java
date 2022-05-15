package com.example.web_view.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.web_view.R;
import com.example.web_view.model_class.Model_Class;
import com.example.web_view.view.MainActivity;
import com.example.web_view.view.Web_View;

import java.util.ArrayList;
import java.util.List;

public class My_Rv_Apdter1 extends  RecyclerView.Adapter<My_Rv_Apdter1.viewdata> {


    Activity activity;
    List<Model_Class> l1 = new ArrayList();
    public My_Rv_Apdter1(MainActivity mainActivity, List<Model_Class> l1) {
        activity = mainActivity;
        this.l1 = l1;
    }

    @NonNull
    @Override
    public viewdata onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item, parent, false);

        return new viewdata(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewdata holder, @SuppressLint("RecyclerView") int position) {
        String title = l1.get(position).getName();
        holder.txt_view.setText(l1.get(position).getName());
        holder.img.setImageResource(l1.get(position).getSet_img());
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            String p2 = title;
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity, Web_View.class);
                String p1 = l1.get(position).getLink();
                intent.putExtra("n1", p1);
                intent.putExtra("n2", p2);

                activity.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {

        return l1.size();
    }

    public class viewdata extends RecyclerView.ViewHolder {

            private final TextView txt_view;
            private final ImageView img;
//        private final TextView txt;
            public CardView card_view;

        public viewdata(@NonNull View itemView) {
                super(itemView);
                txt_view = itemView.findViewById(R.id.txt_view);
                card_view = itemView.findViewById(R.id.card_view);
                img = itemView.findViewById(R.id.img);

//            txt = itemView.findViewById(R.id.txt);
            }
        }

        }
