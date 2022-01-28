package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DepartmentActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton;
    final static public String NAME_KEY = "Name";

    public Boolean validationSuccess(){
        boolean results;
        if(radioGroup.getCheckedRadioButtonId()==-1){
            Toast.makeText(getApplicationContext(), "Please select a radio button!", Toast.LENGTH_SHORT).show();
            results = false;
        }else{
            results = true;
        }
        return results;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        radioGroup = findViewById(R.id.radioGroup);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                if (R.id.radioButton1 != checked){

                } else if(R.id.radioButton2 != checked){

                }else if(R.id.radioButton3 != checked){

                }else if(R.id.radioButton4 != checked){

                }else{

                }
            }
        });

        findViewById(R.id.deptSelectButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validationSuccess()) {
                    Intent intent = new Intent(DepartmentActivity.this, RegistrationActivity.class);
                    intent.putExtra(NAME_KEY, "Cornell Reddick");
                    startActivity(intent);


                }
            }
        });

        findViewById(R.id.deptCancelButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (validationSuccess()) {
                    Intent intent = new Intent(DepartmentActivity.this, RegistrationActivity.class);
                    startActivity(intent);
//                }
            }
        });

    }
}