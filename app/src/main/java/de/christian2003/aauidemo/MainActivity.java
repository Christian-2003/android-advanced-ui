package de.christian2003.aauidemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import de.christian2003.aaui.TestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestClass.testMethod();
    }

}
