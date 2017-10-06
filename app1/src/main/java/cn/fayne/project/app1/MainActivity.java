package cn.fayne.project.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.widget.Toast.*;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnStartMyAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent("cn.fayne.project.learnintent.MyAty"));
                } catch (Exception e) {
                    makeText(MainActivity.this, "无法启动指定的Activity", LENGTH_SHORT).show();
                }
            }
        });
    }
}
