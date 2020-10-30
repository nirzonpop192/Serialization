package com.example.serialization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    public static void open(AppCompatActivity activity, Student student) {
        try {
            Intent intent = new Intent(activity, Details.class);
            intent.putExtra("key", student);
            Toast.makeText(activity, "Data submit successfully", Toast.LENGTH_SHORT).show();
            activity.startActivity(intent);
        } catch (
                ActivityNotFoundException e) {
            Log.e("Main", "Activity not found");
        } finally {
            activity.finish();
        }

    }

    TextView name, roll, gmail, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.tv_name_id);
        roll = findViewById(R.id.tv_roll_id);
        gmail = findViewById(R.id.tv_mail_id);
        phone = findViewById(R.id.tv_phone_id);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Student student = (Student) bundle.getSerializable("key");
        name.setText(student.getName());
        roll.setText(student.getRoll());
        gmail.setText(student.getMail());
        phone.setText(student.getPhone());

        findViewById(R.id.back_btn_id).setOnClickListener((View view) -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });

    }
}
