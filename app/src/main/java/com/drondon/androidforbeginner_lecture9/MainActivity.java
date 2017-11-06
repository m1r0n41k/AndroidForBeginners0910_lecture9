package com.drondon.androidforbeginner_lecture9;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find ListView
        ListView listView = findViewById(R.id.list_view);

        //Create User 1
        Map<String, String> user = new HashMap<>();
        user.put("name", "Bob");
        user.put("lastname", "Marlay");
        user.put("age", "12");

        //Create User 2
        Map<String, String> user2 = new HashMap<>();
        user2.put("name", "Sam");
        user2.put("lastname", "Gamgee");
        user2.put("age", "30");

        List<Map<String, String>> users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(),
                users,
                R.layout.item_user,
                new String[]{"name", "lastname", "age"},
                new int[]{R.id.text_name, R.id.text_last_name, R.id.text_age}
        );

        listView.setAdapter(adapter);
    }


}
