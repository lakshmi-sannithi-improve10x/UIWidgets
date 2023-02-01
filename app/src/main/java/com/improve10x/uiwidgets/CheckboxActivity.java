package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        handleOrder();
    }
    private void handleOrder(){
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
            CheckBox pizzaBtn = findViewById(R.id.pizza_btn);
            CheckBox coffeeBtn = findViewById(R.id.coffee_btn);
            CheckBox burgerBtn = findViewById(R.id.burger_btn);
            boolean isPizzaChecked = pizzaBtn.isChecked();
            boolean isCoffeeChecked = coffeeBtn.isChecked();
            boolean isBurgerChecked = burgerBtn.isChecked();
            String orderDetails = placeOrder(isPizzaChecked,isCoffeeChecked,isCoffeeChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String placeOrder(boolean isPizzaChecked, boolean isCoffeeChecked, boolean isBurgerChecked) {
        int billAmount = 0;
        String result = "Selected items";
        if (isPizzaChecked){
            billAmount += 100;
            result += "\nPizza Rs.100";

        }
        if (isCoffeeChecked){
            billAmount += 50;
            result +="\nCoffee RS.50";
        }
        if (isBurgerChecked){
            billAmount +=120;
            result +="\nBurger Rs.120";
        }
        result +="\nTotal:"+billAmount;
        return result;
    }
}