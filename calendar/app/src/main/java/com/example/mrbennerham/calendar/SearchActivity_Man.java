package com.example.mrbennerham.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SearchActivity_Man extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_man);

        ImageView button = (ImageView) findViewById(R.id.searchButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText = (EditText) findViewById(R.id.searchTextbox);
                String _val = editText.getText().toString();
                if (_val.equals("")) {
                    Toast.makeText(getApplicationContext(), "กรุณาพิมพ์บทความที่ต้องการค้นหา", Toast.LENGTH_SHORT).show();
                    return;
                }
                System.out.println("_val: " + _val);

                Bundle bundle = new Bundle();
                bundle.putString("keyword", _val);
                v.getContext().startActivity(new Intent(v.getContext(), FeedArticleActivity_Man.class).putExtras(bundle));
            }
        });
        Button button1 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText = (EditText) findViewById(R.id.searchTextbox);
                String _val = editText.getText().toString();
                System.out.println("_val: " + _val);

                Bundle bundle = new Bundle();
                bundle.putString("keyword", _val);
                v.getContext().startActivity(new Intent(v.getContext(), FeedArticleActivity_Man.class).putExtras(bundle));
            }
        });

        final ImageView btn2 = (ImageView) findViewById(R.id.calendaricon);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), CalendarShowEvent.class);
                startActivity(intent1);

            }
        });
        final ImageView btn3 = (ImageView) findViewById(R.id.drugicon);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Main_Notifications_Man.class);
                startActivity(intent1);

            }
        });
        final ImageView btn4 = (ImageView) findViewById(R.id.faqicon);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), SearchActivity_Man.class);
                startActivity(intent1);

            }
        });
        final ImageView btn5 = (ImageView) findViewById(R.id.doctoricon);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), Calendar_Doctor_Man.class);
                startActivity(intent6);
            }
        });

    }
    public void onBackPressed() {
//        super.onBackPressed();
        Intent intent1 = new Intent(getApplicationContext(), MenuHome_Man.class);
        startActivity(intent1);
        finish();
    }
}
