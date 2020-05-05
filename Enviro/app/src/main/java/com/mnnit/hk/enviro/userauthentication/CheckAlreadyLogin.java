package com.mnnit.hk.enviro.userauthentication;

import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mnnit.hk.enviro.OnStartActivity;



public class CheckAlreadyLogin {

    public static int REQUEST_CODE = 1;
    private static FirebaseUser user = null;
    private static boolean userLoggedIn = false;
    private static OnStartActivity onStartActivityObject;

    public static FirebaseUser returnUser(OnStartActivity object)
    {
        onStartActivityObject = object;                                // we need this object for future reference
        user = FirebaseAuth.getInstance().getCurrentUser();
        //Toast.makeText(object,"CheckAlreadyLogin  returnUser",Toast.LENGTH_LONG).show();
        if(user == null)
        {
            Toast.makeText(object,"user is null",Toast.LENGTH_LONG).show();
            userLoggedIn = false;
            Intent intent = new Intent(object,LoginSignupOptionActivity.class);
//            intent.("onStartActivityObject",object);

            object.startActivity(intent);
        }
        //Toast.makeText(object,"user is not null"+user,Toast.LENGTH_LONG).show();

        return user ;
    }

    public static void setUser(FirebaseUser user1)
    {
        if(userLoggedIn == false) {
            user = user1;
            userLoggedIn = true;
        }
    }
}
