package com.ekcoder.canvaspoc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FloorPlanView floorPlanView;
    Path path = new Path();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floorPlanView = findViewById(R.id.floor_plan);
//        Bitmap bitmap = Bitmap.createBitmap(floorPlanView.getWidth(), floorPlanView.getHeight(), Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas();
//        floorPlanView.draw(canvas);
        path.moveTo(100f, 100f);
        path.lineTo(100f, 400f);
        path.lineTo(200f, 400f);
        path.lineTo(200f, 200f);
        path.lineTo(300f, 200f);
        path.lineTo(300f, 100f);
        path.lineTo(100f, 100f);
        path.close();

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        floorPlanView.setPath(path);
                        floorPlanView.draw(new Canvas());
                    }
                },
                3000);

//        floorPlanView.draw();
    }
}
