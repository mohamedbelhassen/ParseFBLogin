package naveen.com.example.sampledemo2;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by DELL on 08-11-2015.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "SjcHUx871EIKRJeF9lyKvAv5ns15Qn4o2riCdq4u", "eT4B2Hh85v00dvOgoMJUYyDI3tWRYfm9QaI5xUTq");
        ParseFacebookUtils.initialize(this);
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}

