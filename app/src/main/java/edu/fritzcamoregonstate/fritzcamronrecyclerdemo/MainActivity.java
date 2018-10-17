package edu.fritzcamoregonstate.fritzcamronrecyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Item> mItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //setup data
        mItems = new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            Item item = new Item("Item" + i, "This is item" + i);
            mItems.add(item);
        }

        //create adapter
        mAdapter = new RecyclerViewAdapter(mItems, MainActivity.this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
