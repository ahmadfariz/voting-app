package com.fariz.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Repository repository;
    DaoSession daoSession;

    Calendar calander;
    SimpleDateFormat simpledateformat , simpletimeformat;

    TextView DisplayDate;
    TextView DisplayTime;

    TextClock jamdigital;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button exit;

    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        DisplayDate = (TextView)findViewById(R.id.Date);
        DisplayTime = (TextView)findViewById(R.id.Time);

        calander = Calendar.getInstance();
        Date date = new Date();
        simpledateformat = new SimpleDateFormat(" dd-MM-yyyy");

        simpletimeformat = new SimpleDateFormat("HH:mm:ss");
        String GetDataAboutDate=null;
        String GetDataAboutTime=null;
        GetDataAboutDate = simpledateformat.format(date);
        GetDataAboutTime = simpletimeformat.format(calander.getTime());
        String Date="" + GetDataAboutDate;
        DisplayDate.setText(Date);
        String Time="" + GetDataAboutTime;
        DisplayTime.setText(Time);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView textViewDate = findViewById(R.id.Tanggal);
        textViewDate.setText(currentDate);

        TextClock jam = (TextClock) findViewById(R.id.jam);

        daoSession = ((MyApp) getApplication()).getDaoSession();
        repository = new Repository();

        button1=(Button)findViewById(R.id.btnA1);
        button2=(Button)findViewById(R.id.btnB1);
        button3=(Button)findViewById(R.id.btnC1);
        button4=(Button)findViewById(R.id.btnPie);
        button5=(Button)findViewById(R.id.btnD1);
        exit=(Button)findViewById(R.id.btnExit);

        text1=(TextView)findViewById(R.id.Date);
        text2=(TextView)findViewById(R.id.Time);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        exit.setOnClickListener(this);

    }

    public void onClick(View v) {
        UserDao userDao = daoSession.getUserDao();
        User user = new User();
        switch (v.getId()) {
            case R.id.btnA1:
                user.setPilihan(button1.getText().toString());
                user.setTanggal(text1.getText().toString());
                user.setJam(text2.getText().toString());
                userDao.insert(user);

                LayoutInflater inflater = getLayoutInflater();
                View mView = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_terimakasih,null);
                AlertDialog builder = new AlertDialog.Builder(MainActivity.this)
                        .setView(mView).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        builder.dismiss();
                    }
                }, 3000);
                break;

            case R.id.btnB1:
                user.setPilihan(button2.getText().toString());
                user.setTanggal(text1.getText().toString());
                user.setJam(text2.getText().toString());
                userDao.insert(user);

                inflater = getLayoutInflater();
                mView = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_terimakasih, null);
                builder = new AlertDialog.Builder(MainActivity.this)
                        .setView(mView).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        builder.dismiss();
                    }
                }, 3000);

                break;
            case R.id.btnC1:
                user.setPilihan(button3.getText().toString());
                user.setTanggal(text1.getText().toString());
                user.setJam(text2.getText().toString());
                userDao.insert(user);

                inflater = getLayoutInflater();
                mView = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_terimakasih, null);
                builder = new AlertDialog.Builder(MainActivity.this)
                        .setView(mView).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        builder.dismiss();
                    }
                }, 3000);

                break;
            case R.id.btnD1:
                user.setPilihan(button5.getText().toString());
                user.setTanggal(text1.getText().toString());
                user.setJam(text2.getText().toString());
                userDao.insert(user);

                inflater = getLayoutInflater();
                mView = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_terimakasih, null);
                builder = new AlertDialog.Builder(MainActivity.this)
                        .setView(mView).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        builder.dismiss();
                    }
                }, 3000);

                break;
            case R.id.btnExit:
                startActivity(new Intent(MainActivity.this, Exit.class));
                break;
            case R.id.btnPie:
                startActivity(new Intent(MainActivity.this, PieChart.class));
                break;
        }
    }
}