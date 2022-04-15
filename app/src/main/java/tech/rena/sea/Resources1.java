package tech.rena.sea;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Resources1 extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.resources1);
        Button btnMain = findViewById(R.id.mainpage);
        TextView tv  = findViewById(R.id.toWeb);
        Button btnvid = findViewById(R.id.meditate);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Resources1.this, MainButtons.class);
                startActivity(it);
                finish();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Resources1.this, ResourcesWeb.class);
                startActivity(it);
                //finish();
            }
        });

        btnvid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Resources1.this, VideoList.class);
                startActivity(it);
            }
        });



    }


}





