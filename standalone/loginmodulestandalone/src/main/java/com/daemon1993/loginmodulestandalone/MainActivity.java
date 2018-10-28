package com.daemon1993.loginmodulestandalone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        startActivity(new Intent(this, com.daemon1993.loginmodule.MainActivity.class));
    }
}
