package com.example.thjen.searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/** library widget.SearchView have run **/
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView lv;
    MenuItem searchItem;
    SearchView searchView;

    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (ListView) findViewById(R.id.lv);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        arrayList = new ArrayList<>();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);

        arrayList.add("Hi 1");
        arrayList.add("A Hi 2");
        arrayList.add("B Hi 3");
        arrayList.add("C Hi 4");
        arrayList.add("D Hi 5");
        arrayList.add("E Hi 6");
        arrayList.add("F Hi 7");
        arrayList.add("G Hi 8");
        arrayList.add("H Hi 9");
        arrayList.add("A Hi 10");
        arrayList.add("B Hi 11");
        arrayList.add("C Hi 12");
        arrayList.add("D Hi 13");
        arrayList.add("E Hi 14");
        arrayList.add("J Hi 15");
        arrayList.add("K Hi 16");
        arrayList.add("L Hi 17");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        searchItem = menu.findItem(R.id.mn_search);
        searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

}
