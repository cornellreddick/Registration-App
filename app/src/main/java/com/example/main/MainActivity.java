package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Button mainButton, regSelectButton, regSubmitButton, deptCancelButton, deptSelectButton;
//    TextView deptTextViewResults, nameTextViewResults, emailTextViewResults, idTextViewResults, deptProfileTextViewResults;
//    EditText regNameInput, regEmailInput, regIdInput;

    Button button;
    TextView textView;
    EditText editText;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.registerButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

    }
}