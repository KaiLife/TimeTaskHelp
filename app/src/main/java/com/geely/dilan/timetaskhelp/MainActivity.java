package com.geely.dilan.timetaskhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TimeTaskHelp.OnTimeChangeListener {

    private TextView tv_time;
    private TimeTaskHelp timeTaskHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_time = (TextView) findViewById(R.id.tv_time);

        findViewById(R.id.btn_count_down).setOnClickListener(this);
        findViewById(R.id.btn_time_end).setOnClickListener(this);
        findViewById(R.id.btn_time_no_end).setOnClickListener(this);
        findViewById(R.id.btn_time_no_end_5s).setOnClickListener(this);

        timeTaskHelp = new TimeTaskHelp();
        timeTaskHelp.setOnTimeChangeListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        timeTaskHelp.stopTime();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_count_down:
                timeTaskHelp.startCountDownTime(30);
                break;

            case R.id.btn_time_end:
                timeTaskHelp.startTimeHaveEnd(30);
                break;

            case R.id.btn_time_no_end:
                timeTaskHelp.startTimeNoEnd(80);
                break;

            case R.id.btn_time_no_end_5s:
                timeTaskHelp.startTimeNoEnd(0, 5);
                break;

            default:
                break;
        }
    }

    @Override
    public void onTimeChange(String time) {
        tv_time.setText(time);
    }

    @Override
    public void onTimeCompletion() {

    }
}
