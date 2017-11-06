package com.drondon.androidforbeginner_lecture9;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find ListView
        ListView listView = findViewById(R.id.list_view);

        User user1 = new User("Bilbo", "Beginnd", 100, Color.GRAY);
        User user2 = new User("Frodo", "Beginnd", 56, Color.YELLOW);
        User user3 = new User("Sam", "Gamgee", 47, Color.RED);
        User user4 = new User("Gendalph", "Gray", 230, Color.WHITE);

        final User[] users = {user1, user2, user3, user4};

        ListAdapter adapter = new MyUserAdapter(getBaseContext(), users);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int realPos = position % users.length;

                Toast.makeText(MainActivity.this,
                        users[realPos].getName() + " " + users[realPos].
                getLastName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
