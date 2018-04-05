package com.example.alexey.lesson4android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button butent;
    private EditText login, password;
    User user1 = new User ("login", "123");
    Magazine magazine1 = new Magazine("Магазин верхней одежды", "г. Саратов, Советская 23", "Алексей");
    Magazine magazine2 = new Magazine("Магазин Костюмов", "г. Саратов, Садовая 23", "Алексей");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Magazine.MagazineList.add(magazine1);
        Magazine.MagazineList.add(magazine2);
        login = (EditText) findViewById(R.id.editText_log);
        password = (EditText) findViewById(R.id.editText_pass);
        butent = (Button) findViewById(R.id.button_ent);
        butent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().equals(user1.getLogin()) && password.getText().toString().equals(user1.getPassword())) {
                    Intent intent = new Intent(".ListMag");
                    intent.putExtra("login", login.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,"Не верный логин или пароль", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}