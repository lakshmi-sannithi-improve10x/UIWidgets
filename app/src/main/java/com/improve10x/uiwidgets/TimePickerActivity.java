package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
         TimePicker timePicker;
         TextView timeTxt;
         Button changeTimeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timePicker = findViewById(R.id.time_picker);
        timeTxt = findViewById(R.id.time_txt);
        changeTimeBtn = findViewById(R.id.changetime_btn);
        displayCurrentTime();
        handleChangeTimeBtn();
    }

    private void handleChangeTimeBtn() {
        changeTimeBtn.setOnClickListener(v -> {
            String selectedTime = getSelectedTime();
            timeTxt.setText("Change Time :" + selectedTime);
        });


    }

    private void displayCurrentTime() {
        String selectedTime = getSelectedTime();
        timeTxt.setText("Current Time :" + selectedTime);

    }

    public  String getSelectedTime(){
        int minute = timePicker.getCurrentMinute();
        int hour = timePicker.getCurrentHour();
        String selectedTime = createTime(minute,hour);
        return selectedTime ;
    }
    public String createTime(int minute,int hour){
        return hour + "." + minute;
    }
}