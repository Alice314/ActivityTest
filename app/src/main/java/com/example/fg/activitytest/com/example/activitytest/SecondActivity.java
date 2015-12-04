package com.example.fg.activitytest.com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fg.activitytest.R;

/**
 * Created by fg on 2015/12/1.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        EditText edit_text2 =(EditText) findViewById(R.id.edit_text2);
        edit_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "用户名不能为空", Toast.LENGTH_SHORT);

            }
        });
    }
}
