package rena.kim.sea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.firstpage);
        Button btn = findViewById(R.id.nextButton);
        Button btnMain = findViewById(R.id.mainpage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Firstpage.this, Survey.class);
                startActivity(it);
                finish();
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Firstpage.this, MainButtons.class);
                startActivity(it);
                finish();
            }
        });

    }
}
