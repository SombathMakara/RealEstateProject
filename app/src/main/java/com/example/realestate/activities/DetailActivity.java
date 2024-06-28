package com.example.realestate.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTxt, addressTxt, bedTxt, bathTxt, wifiTxt, desciptionTxt;
    private ItemDomain item;
    private ImageView pic_detail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
initView();
 setBariable();

    }

    private void setBariable() {
        item =(ItemDomain) getIntent().getSerializableExtra("object");
        titleTxt.setText(item.getTitle());
        addressTxt.setText(item.getAddress());
        bedTxt.setText(item.getBed()+"Bed");
        desciptionTxt.setText(item.getDescription());
        if (item.isWifi()){
            wifiTxt.setText("No-wifi");
        }else {
            wifiTxt.setText("No-wifi");
        }
        int drawableRecourseId=getResources().getIdentifier(item.getPic(),"drawable",getPackageName());
        Glide.with(this).load(drawableRecourseId).into(pic_detail);
    }

    private void initView() {
        titleTxt=findViewById(R.id.titleTxt);
        addressTxt=findViewById(R.id.addressTxt);
        bedTxt= findViewById(R.id.bedTxt);
        bathTxt = findViewById(R.id.bathTxt);
        wifiTxt=findViewById(R.id.wifiTxt);
        desciptionTxt= findViewById(R.id.discriptionTxt);
        pic_detail = findViewById(R.id.pic_detail);

    }

}