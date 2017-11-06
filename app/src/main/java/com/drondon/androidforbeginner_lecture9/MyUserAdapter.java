package com.drondon.androidforbeginner_lecture9;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by andriimiroshnychenko on 11/6/17.
 */

public class MyUserAdapter extends ArrayAdapter<User> {

    private static final String TAG = "MyUserAdapter_";

    private User[] users;

    public MyUserAdapter(@NonNull Context context, User[] users) {
        super(context, /*Not used*/ R.layout.item_user);
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.length * 10;
    }

    @Nullable
    @Override
    public User getItem(int position) {
        return users[position % users.length];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView() called with: position = [" + position + "], convertView = [" + (convertView == null) + "]");
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        convertView = inflater.inflate(R.layout.item_user, parent, false);

        User user = getItem(position);

        convertView.setBackgroundColor(user.getColor());

        TextView textViewName = convertView.findViewById(R.id.text_name);
        textViewName.setText(user.getName());

        TextView textViewLastName = convertView.findViewById(R.id.text_last_name);
        textViewLastName.setText(user.getLastName());

        TextView textViewAge = convertView.findViewById(R.id.text_age);
        textViewAge.setText(String.valueOf(user.getAge())); // Int not res id

        return convertView;
    }
}
