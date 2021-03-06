package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);
    }

    public void Next(View view) {
        String n=name.getText().toString();
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void Dial(View view) {
        String n=number.getText().toString();
        Uri uri=Uri.parse("tel:"+n);
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void search(View view) {
        String n=link.getText().toString();
        Uri uri=Uri.parse("https://:"+n);
        Intent i=new Intent(Intent.ACTION_SEARCH,uri);
        startActivity(i);

    }
}