package com.rj.multilangu;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rj.multilangu.util.LanguageHelper;


public class MainActivity extends AppCompatActivity {
    TextView name,passsion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        passsion = findViewById(R.id.passion);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LanguageHelper languageHelper = new LanguageHelper(MainActivity.this);
                languageHelper.setLang("hi");
                MainActivity.this.setContentView(R.layout.activity_main);
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LanguageHelper languageHelper = new LanguageHelper(MainActivity.this);
                languageHelper.setLang("default");
                MainActivity.this.setContentView(R.layout.activity_main);
            }
        });
    }
}
