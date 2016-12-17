package com.example.victor.less1412;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.example.library1412.view.SwipeItemView;

public class MainActivity extends AppCompatActivity {

    SwipeItemView swipeItemView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeItemView = (SwipeItemView) findViewById(R.id.customView);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        swipeItemView.dispatchTouchEvent(event);
        return super.onTouchEvent(event);
//        return true; //false


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

//        switch (ev.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                Log.d("touch","down");
//                break;
//            case MotionEvent.ACTION_MOVE:         {Log.d("touch","move");}
//            break;
//            case MotionEvent.ACTION_UP:         {Log.d("touch","up");}
//            break;
//            case MotionEvent.ACTION_SCROLL:         {Log.d("touch","scroll");}
//            break;
//            default: break;
//        }

        return super.dispatchTouchEvent(ev);

    }


}
