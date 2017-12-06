package com.programmingplum.thegradingbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAdd;
    private ListView lvItems;
    private ClassWrapper classList = new ClassWrapper();
    private RubricFactoryWrapper rubricList = new RubricFactoryWrapper();;
    private ArrayAdapter<Class> aaClasses;
    private ArrayAdapter<RubricFactory> aaRubrics;
    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.listViewData);
        fabAdd = (FloatingActionButton) findViewById(R.id.fabAdd);

        // Set Array Adapters
        aaClasses = new ArrayAdapter<Class>(this, android.R.layout.simple_list_item_1, classList.data);
        aaRubrics = new ArrayAdapter<RubricFactory>(this, android.R.layout.simple_list_item_1, rubricList.data);
        // Set Bottom Navigation View
        bnv = (BottomNavigationView) findViewById(R.id.navigation);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_classes:
                        lvItems.setAdapter(aaClasses);
                        fabAdd.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //classList.data.add(new Class("Journalism", "101"));
                                //aaClasses.notifyDataSetChanged();
                                Intent intent = new Intent(MainActivity.this, NewClassActivity.class);
                                startActivity(intent);
                            }
                        });

                        return true;
                    case R.id.navigation_rubrics:
                        lvItems.setAdapter(aaRubrics);
                        fabAdd.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(MainActivity.this, NewRubricActivity.class);
                                startActivity(intent);
                            }
                        });

                        return true;
                }
                return false;
            }
        });

        bnv.setSelectedItemId(R.id.navigation_classes);
    }

}
