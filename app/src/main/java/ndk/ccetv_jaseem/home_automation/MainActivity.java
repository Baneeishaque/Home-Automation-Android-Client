package ndk.ccetv_jaseem.home_automation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hmomeni.verticalslider.VerticalSlider;

import ndk.utils_android1.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerticalSlider verticalSlider = findViewById(R.id.verticalSlider);
        verticalSlider.setProgress(0);

        verticalSlider.setEnabled(false);

        Button buttonBedroom1=findViewById(R.id.buttonBedroom1);
        Button buttonBedroom2=findViewById(R.id.buttonBedroom2);
        Button buttonDiningHall=findViewById(R.id.buttonDiningHall);
        Button buttonOfficeRoom=findViewById(R.id.buttonOfficeRoom);

        buttonBedroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.start_activity(MainActivity.this,RoomActivity.class);
            }
        });

        buttonBedroom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.start_activity(MainActivity.this,RoomActivity.class);
            }
        });

        buttonDiningHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.start_activity(MainActivity.this,Room2Activity.class);
            }
        });

        buttonOfficeRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.start_activity(MainActivity.this,Room2Activity.class);
            }
        });
    }
}
