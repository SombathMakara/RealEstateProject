package com.example.realestate.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular,adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;

@Override
    protected void onCreate(Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    initRecyclerView();
}

    private void initRecyclerView() {
        ArrayList<ItemDomain> ItemArraylist = new ArrayList<>();


        recyclerViewPopular=findViewById(R.id.viewpopular);
recyclerViewNew=findViewById(R.id.viewnew);
recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

recyclerViewNew.setAdapter(adapterNew);
recyclerViewPopular.setAdapter(adapterPopular);

}

}
