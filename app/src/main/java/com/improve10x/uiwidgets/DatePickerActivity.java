package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
           DatePicker datePicker;
           TextView currentDateTxt;
           Button changeDateBtn;

           @Override
    protected void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_date_picker);
                datePicker = findViewById(R.id.date_picker);
                currentDateTxt = findViewById(R.id.currentdate_txt);
                changeDateBtn = findViewById(R.id.changedate_btn);
               showCurrentDate();
               showChangeDateBtn();
           }

    private void showChangeDateBtn() {
               String selectedDate = getSelectedDate();
               currentDateTxt.setText("Current Date :" + selectedDate);

    }

    private void showCurrentDate() {
               changeDateBtn.setOnClickListener(v -> {
                   String selectedDate = getSelectedDate();
                   currentDateTxt.setText("Changed Date :" + selectedDate);
               });
           }
          public  String getSelectedDate(){
               int day = datePicker.getDayOfMonth();
               int month = datePicker.getMonth() + 1;
               int year = datePicker.getYear();
               String selectedDate = createDate(day,month,year);
               return selectedDate;
    }

    public  String createDate(int date,int month,int year){
               return date + "/" + month + "/" + year ;
    }

}

