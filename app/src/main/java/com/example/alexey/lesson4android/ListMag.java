package com.example.alexey.lesson4android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ListMag extends AppCompatActivity {

    private EditText magazName;
    private Button butadd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mag);
        Intent intent = getIntent();
        final String loginStr = intent.getStringExtra("login");
        magazName = (EditText) findViewById(R.id.editText_magaz);
        butadd = (Button) findViewById(R.id.button_add);
        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Magazine magaz = new Magazine(magazName.getText().toString(), "По умолчанию", loginStr);
               Magazine.MagazineList.add(magaz);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setAdapter(new MyAdapter(Magazine.MagazineList));
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
    }
}
