package mrgao.com.mrgaoviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mrgao.com.mrgaoviews.activitys.HuaWeiProgressActivity;
import mrgao.com.mrgaoviews.activitys.My360JumpActivity;
import mrgao.com.mrgaoviews.activitys.PanelCircleActivity;
import mrgao.com.mrgaoviews.activitys.RadarMenuActivity;
import mrgao.com.mrgaoviews.activitys.SimpleChartActivity;

public class MainActivity extends AppCompatActivity {


    private Button mRadarBtn;
    private Button mSimpleBtn;
    private Button mPanelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadarBtn = (Button) findViewById(R.id.radarViewBtn);
        mRadarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RadarMenuActivity.class));
            }
        });


        mSimpleBtn = (Button) findViewById(R.id.simpleBtn);
        mSimpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SimpleChartActivity.class));

            }
        });

        mPanelBtn = (Button) findViewById(R.id.panelBtn);
        mPanelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PanelCircleActivity.class));

            }
        });
        ((Button) findViewById(R.id.huaweiBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HuaWeiProgressActivity.class));
            }
        });

        ((Button) findViewById(R.id.jump)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, My360JumpActivity.class));
            }
        });
    }


}
