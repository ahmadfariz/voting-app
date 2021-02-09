package com.fariz.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Repository repository;
    DaoSession daoSession;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daoSession = ((MyApp) getApplication()).getDaoSession();
        repository = new Repository();

        button1=(Button)findViewById(R.id.btnA1);
        button2=(Button)findViewById(R.id.btnB1);
        button3=(Button)findViewById(R.id.btnC1);
        button4=(Button)findViewById(R.id.btnPie);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    public void onClick(View v) {
        UserDao userDao = daoSession.getUserDao();
        User user = new User();
        switch (v.getId()) {
            case R.id.btnA1:
                user.setPilihan(button1.getText().toString());
                userDao.insert(user);
                Toast.makeText(this,"Berhasil Memilih", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnB1:
                user.setPilihan(button2.getText().toString());
                userDao.insert(user);
                Toast.makeText(this,"Berhasil Memilih", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnC1:
                user.setPilihan(button3.getText().toString());
                userDao.insert(user);
                Toast.makeText(this,"Berhasil Memilih", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPie:
                startActivity(new Intent(MainActivity.this, PieChart.class));
                break;
        }
    }
}