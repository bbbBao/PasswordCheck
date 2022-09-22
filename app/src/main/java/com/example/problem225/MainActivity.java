package com.example.problem225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void button (View view){
        TextView pass = findViewById(R.id.firstPassword);
        TextView checkPass = findViewById(R.id.checkPassword);
        TextView disp = findViewById(R.id.display);

        if ((pass.getText().toString()).equals(checkPass.getText().toString())){
            disp.setText("THANK YOU");
        } else{
            disp.setText("PASSWORDS MUST MATCH");
        }
    }

}