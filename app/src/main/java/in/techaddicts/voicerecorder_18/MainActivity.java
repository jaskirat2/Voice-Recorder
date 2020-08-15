package in.techaddicts.voicerecorder_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void alphamethod(View view)                                                     // This method is for: there is my round dp in fragment_record.xml file,
    {                                                                                // I placed transparent button on it and assigned alpha method to onclick for
        final Intent y1 = new Intent(this,SocialmediaActivity.class);  // that transparent button, now that alpha method cannot be placed inside
        startActivity(y1);                                                           // RecordFragment.java class(as it causes error when i do so), so i tried
    }                                                                                // placing that alpha method here in MainActivity and it worked

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}