package com.mnnit.hk.enviro.userauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mnnit.hk.enviro.OnStartActivity;
import com.mnnit.hk.enviro.R;

public class LoginSignupOptionActivity extends AppCompatActivity {

    public static String GET_USER="com.mnnit.hk.enviro.userauthentication.GET_USER";
    private OnStartActivity object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup_option);

        Toast.makeText(this,"LoginSignupOptionActivity",Toast.LENGTH_LONG).show();

//        Intent intent = getIntent();
//        object = intent.getParcelableExtra("onStartActivityObject");
    }

    public void performLogin(View view)
    {
        Intent intent = new Intent( this , LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void performSignup(View view)
    {
        Toast.makeText(this,"signup button pressed",Toast.LENGTH_LONG).show();
        Intent intent = new Intent( this , SignupActivity.class);
        startActivity(intent);
        finish();
    }


//    ------------The below code is to send back data to OnStartActivity via intent, in the result we have to return the firebaseUser class object
//    Intent intent = getIntent();
//    intent.putExtra("key", value);
//    setResult(RESULT_OK, intent);
//    finish();
}
