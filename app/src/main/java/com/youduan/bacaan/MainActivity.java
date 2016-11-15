package com.youduan.bacaan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;


    String[] items = new String[]{
        "Image",
        "Check box",
        "Button",
        "Edit Text"
    };
    Integer[] images = {
            R.drawable.image,
            R.drawable.checkbox,
            R.drawable.button,
            R.drawable.edittext
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = (ListView) findViewById(R.id.list);

        //
        CustomListAdapter adapter = new CustomListAdapter(this, items, images);
        list.setAdapter(adapter);

        // listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                String  itemValue    = (String) list.getItemAtPosition(position);

                switch (itemValue){
                    case "Image":
                        startActivity(new Intent(MainActivity.this, ImageActivity.class));
                        break;
                    case "Check box":
                        startActivity(new Intent(MainActivity.this, checkboxActivity.class));
                        break;
                    case "Button":
                        startActivity(new Intent(MainActivity.this, buttonActivity.class));
                        break;
                    case "Edit Text":
                        startActivity(new Intent(MainActivity.this, EditTextActivity.class));
                        break;
                }


                // Show Alert for debuging
//                Toast.makeText(getApplicationContext(),
//                        "Position :"+position+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                        .show();

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        if (id == R.id.action_exit) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
