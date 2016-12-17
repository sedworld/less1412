package com.example.library1412.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by Victor on 14.12.2016.
 */

public class SwipeItemView extends FrameLayout implements GestureDetector.OnGestureListener{
    private GestureDetectorCompat mGestureDetectorCompat;
    private View mTopView;
    private View mBottomView;

    public SwipeItemView(Context context) {
        super(context);
        mGestureDetectorCompat = new GestureDetectorCompat(getContext(), this);
    }


    public SwipeItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mGestureDetectorCompat = new GestureDetectorCompat(getContext(), this);
        mTopView = new View(getContext());
        mBottomView = new View((getContext()));
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ViewCompat.setBackground(mTopView, new ColorDrawable(Color.RED));
        ViewCompat.setBackground(mBottomView, new ColorDrawable(Color.GREEN));
        addView(mBottomView);
        addView(mTopView);
    }

    public SwipeItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SwipeItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("touch","onTouch");
        return super.onTouchEvent(event);
    }
    boolean leftDir = false;
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("touch","dispatchTouchEvent");
        mGestureDetectorCompat.onTouchEvent(ev);
        if(ev.getAction() == MotionEvent.ACTION_UP){

        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d("SwipeItem","x1 = " + motionEvent1.getX() + " x2 = " + motionEvent.getX());
        if(Math.abs(motionEvent.getX() - motionEvent1.getX())>100){

            if(motionEvent1.getX() < (mTopView.getMeasuredWidth()/2)) {
                mTopView.setX(motionEvent1.getX());
            }
        }
        //mTopView.setX(motionEvent1.getX());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Log.d("SwipeItem","longPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d("SwipeItem","fling");

        return false;
    }
}
