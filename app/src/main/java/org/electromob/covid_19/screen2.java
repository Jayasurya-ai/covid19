package org.electromob.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class screen2 extends AppCompatActivity {

    private Button submit;
    private CheckBox cb1,cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        submit = findViewById(R.id.submit);
        cb1 = findViewById(R.id.checkBox4);

        if (cb1.isChecked())
        {
            Toast.makeText(getApplicationContext(),"Risk of getting Covid-19 is low",Toast.LENGTH_LONG).show();
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Risk of getting Covid-19 is low",Toast.LENGTH_LONG).show();
                }
                startActivity(new Intent(getApplicationContext(),screen3.class));
            }
        });
    }
}
