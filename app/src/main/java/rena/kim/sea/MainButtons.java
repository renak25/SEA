package rena.kim.sea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainButtons extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mainbuttons);

        Button btnFirst = findViewById(R.id.burnbook);
        Button btnSurvey = findViewById(R.id.survey);
        Button btnResources = findViewById(R.id.resources);
        Button btnContact = findViewById(R.id.contactus);
        Button btnAbout = findViewById(R.id.aboutus);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainButtons.this, Firstpage.class);
                startActivity(it);
                finish();
            }
        });

        btnSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainButtons.this, Survey.class);
                startActivity(it);
                finish();
            }
        });

        btnResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainButtons.this, Resources.class);
                startActivity(it);
                finish();
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainButtons.this, ContactUs.class);
                startActivity(it);
                finish();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainButtons.this, AboutUs.class);
                startActivity(it);
                finish();
            }
        });


    }


}


