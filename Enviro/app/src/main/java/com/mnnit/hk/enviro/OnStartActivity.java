package com.mnnit.hk.enviro;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.AuthStateListener;
import com.google.firebase.auth.FirebaseUser;
import com.mnnit.hk.enviro.userauthentication.CheckAlreadyLogin;

public class OnStartActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_start);


//        mAuth = FirebaseAuth.getInstance();
//        mAuthStateListener = new AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//
//                updateUI2(firebaseAuth.getCurrentUser());
//                /*if(firebaseAuth.getCurrentUser()==null)
//                {
//                    Toast.makeText(OnStartActivity.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
//                }
//                else
//                {
//
//                }*/
//
//            }
//        };

    }
    @Override
    public void onStart() {
        super.onStart();
        //Toast.makeText(this,"OnStartActivity onStart() method",Toast.LENGTH_LONG).show();
        mUser = CheckAlreadyLogin.returnUser(this);
        //while(true)
        Toast.makeText(this,"success "+mUser,Toast.LENGTH_LONG).show();
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
//        mAuth.addAuthStateListener(mAuthStateListener);
    }

}
