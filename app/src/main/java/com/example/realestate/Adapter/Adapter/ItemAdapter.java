package com.example.realestate.Adapter.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;
import com.example.realestate.activities.DetailActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Viewholder> {

    ArrayList<ItemDomain>items;
    DecimalFormat formatter;
    Context context;

    public ItemAdapter(ArrayList<ItemDomain> items) {
        this.items = items;
        formatter = new DecimalFormat("###,###,###,###");
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.parent,parent,false);
        context=parent.getContext();
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
holder.titleTxt.setText(items.get(position).getTitle());
holder.addressTxt.setText("$" + formatter.format(items.get(position).getAddress()));
holder.priceTxt.setText("$" + formatter.format(items.get(position).getPrice));

int drawableResouceId=holder.itemView.getResources().getIdentifier(items.get(position).getPic(),"drawable" ,holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                        .load(drawableResouceId)
                                .into(holder.pic);
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("object" , items.get(position));
            context.startActivity(intent);

        });

    }

    private void into(ImageView pic) {
    }

    private void load(int drawableResouceId) {
        
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView titleTxt,addressTxt,priceTxt ;
ImageView pic;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            addressTxt = itemView.findViewById(R.id.addressTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);
            pic = itemView.findViewById(R.id.pic);

        }
    }
}
