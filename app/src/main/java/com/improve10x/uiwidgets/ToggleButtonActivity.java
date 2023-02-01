package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        handleStatus();
    }

    private void handleStatus() {
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            ToggleButton toggleBtn1 = findViewById(R.id.toggle_btn1);
            ToggleButton toggleBtn2 = findViewById(R.id.toggle_btn2);
            String toggle1Status = toggleBtn1.getText().toString();
            String toggle2Status = toggleBtn2.getText().toString();
            String result = getStatus(toggle1Status,toggle2Status);
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }

    public String getStatus(String toggle1Status,String toggle2Status){
        StringBuilder result = new StringBuilder();
        result.append("\tToggle1 : ").append(toggle1Status);
        result.append("\tToggle2 : ").append(toggle2Status);
        return String.valueOf(result);
    }
}







