package com.example.hesham_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    Button first, second, bttnSubmit;
    String strgName;
    int birthDate;
    String gender;
    String job;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        first = (Button) findViewById(R.id.button3);
        second = (Button) findViewById(R.id.button4);
        bttnSubmit=(Button)findViewById(R.id.bttnSubmit);
//       bdate=(Button)findViewById(R.id.bdate);

        EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
        RadioButton radButtonMale=(RadioButton)findViewById(R.id.radioButton);
        RadioButton radButtonFemale=(RadioButton)findViewById(R.id.radioButton2);
        RadioButton std=(RadioButton)findViewById(R.id.radioButton3);
        RadioButton prof=(RadioButton)findViewById(R.id.radioButton5);
        TextView rslt=(TextView)findViewById(R.id.result);
        EditText birth=(EditText)findViewById(R.id.editTextDate2);


//        bdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                new DatePickerDialog(MainActivity2.this, d,
//                        c.get(Calendar.YEAR),
//                        c.get(Calendar.MONTH),
//                        c.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });

        bttnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                strgName=name.getText().toString();
                birthDate=Integer.parseInt(birth.getText().toString());


                if(radButtonFemale.isChecked())
                    gender="Mrs.";
                else if (radButtonMale.isChecked())
                    gender="Mr.";

                if(std.isChecked())
                    job= "Student";
                else if (prof.isChecked())
                        job= "Proffesor";


                rslt.setText("Hi "+gender+" "+strgName+" your birthdate is "+birthDate);

                Toast.makeText(MainActivity2.this,"Hi"+job+" "+name,
                        Toast.LENGTH_SHORT).show();

            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));

            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));

            }
        });
    }
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            c.set(Calendar.YEAR, i);
            c.set(Calendar.MONTH, i1);
            c.set(Calendar.DAY_OF_MONTH, i2);

        }
    };
    Calendar c = Calendar.getInstance();
}