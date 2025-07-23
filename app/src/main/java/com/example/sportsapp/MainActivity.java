package com.example.sportsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Adapter view
    private RecyclerView recyclerView;
    // Data Source
    private List<Sport> sportList;
    // Adapter
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        sportList=new ArrayList<>();
        Sport s1=new Sport("Football",R.drawable.football);
        Sport s2=new Sport("Volleyball",R.drawable.volleyball);
        Sport s3=new Sport("Basketball",R.drawable.basketball);
        Sport s4=new Sport("Rugby",R.drawable.rugby);
        Sport s5=new Sport("Cricket",R.drawable.cricket);
        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);
        myAdapter= new CustomAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);








    }
}