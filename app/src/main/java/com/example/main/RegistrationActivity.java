package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    Button button;
    TextView textView, deptTextView;
    EditText regName, regEmail, regId;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regName = findViewById(R.id.registrationNameId);
        regEmail = findViewById(R.id.registrationEmailId);
        regId = findViewById(R.id.registrationId);

        deptTextView = findViewById(R.id.deptResultsId);

        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(DepartmentActivity.NAME_KEY)){
            String name = getIntent().getStringExtra(DepartmentActivity.NAME_KEY);
            deptTextView.setText(name);
        }



        findViewById(R.id.regSelectButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!regName.getText().toString().equals("") && !regEmail.getText().toString().equals("")  && !regId.getText().toString().equals("") ) {

                    Intent intent = new Intent(RegistrationActivity.this, DepartmentActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Please Enter All Input field!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.regSubmitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}