package tech.rena.sea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Resources extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.resources);
        Button btn = findViewById(R.id.buttonR);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Resources.this, Resources1.class);
                startActivity(it);
                finish();
            }
        });

        Button btnMain = findViewById(R.id.mainpage);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Resources.this, MainButtons.class);
                startActivity(it);
                finish();
            }
        });

    }
}


