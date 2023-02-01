package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleOrder();
    }

    private void  handleOrder() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            EditText numberTxt = findViewById(R.id.number_txt);
            EditText number2Txt = findViewById(R.id.number2_txt);
            String value1 = numberTxt.getText().toString();
            String value2 = number2Txt.getText().toString();
            String result = add(value1, value2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String value1, String value2) {
        int number1 = Integer.parseInt(value1);
        int number2 = Integer.parseInt(value2);
        int sum = number1+number2;
        return String.valueOf(sum);
    }

}







