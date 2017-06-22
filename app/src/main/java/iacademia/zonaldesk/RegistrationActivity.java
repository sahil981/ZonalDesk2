package iacademia.zonaldesk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class RegistrationActivity extends AppCompatActivity {
    public static Context c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    SharedPreferences p= PreferenceManager.getDefaultSharedPreferences(this);


        boolean firstInstall=p.getBoolean("FIRST_INSTALL",true);
        p.edit().putBoolean("FIRST_INSTALL",false).apply();
        boolean isVerified = p.getBoolean("VERIFICATION_STATUS",false);
        c=this;

        //Only If the entry is not immediate after first install and if the user is verified , Redirect to the Home Activity
        //else continue with the Registration Activity
        //Note: Include the line "SharedPreferences.edit().putBoolean("VERIFICATION_STATUS",true).apply()" once the verification is done
        //Note that after entering to HomeActivity Registration Activity must be removed from the back stack by mentioning in the manifest file
        if(!firstInstall ){
            p.edit().putBoolean("VERIFICATION_STATUS",true).apply();//I ve included it here to make the app stable.
            // Remove this and update the status once the verification is done
            Intent i = new Intent(this,HomeActivity.class);
            startActivity(i);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



    }
}
