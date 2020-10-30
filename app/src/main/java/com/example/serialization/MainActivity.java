package com.example.serialization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Sname, Sroll, Smail, Sphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sname = findViewById(R.id.edtName);
        Sroll = findViewById(R.id.edtRoll);
        Smail = findViewById(R.id.edt_mail_id);
        Sphone = findViewById(R.id.edt_phone_id);

        findViewById(R.id.submit_btn_id).setOnClickListener((View view)->{

            String name = Sname.getText().toString();
            String roll = Sroll.getText().toString();
            //int roll = Integer.parseInt(rollNo);
            String mail = Smail.getText().toString();
            String phone = Sphone.getText().toString();

            if (Sname.length()==0){
                Sname.setError("Insert value");
                Toast.makeText(getApplicationContext(),"Insert value",Toast.LENGTH_SHORT).show();
                return;
            }else if(Sroll.length()==0){
                Sroll.setError("Insert value");
                return;
            }else if(Smail.length()==0){
                Smail.setError("Insert value");
                return;
            }else if(Sphone.length()==0){
                Sphone.setError("Insert value");
                return;
            }

            Student student = new Student(name, roll, mail, phone);
            Details.open(MainActivity.this,student);
            /*try{
                Student student = new Student(name, roll, mail, phone);

                Intent intent = new Intent(getApplicationContext(),Details.class);
                intent.putExtra("key", student);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Data submit successfully", Toast.LENGTH_SHORT).show();

            }catch (ActivityNotFoundException e){
                Log.e("Main","Activity not found");
            }finally {
                finish();
            }*/



        });

    }

}
