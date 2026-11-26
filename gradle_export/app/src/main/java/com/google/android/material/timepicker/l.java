package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class l implements View.OnTouchListener {
    public final GestureDetector A;

    public l(GestureDetector gestureDetector) {
        this.A = gestureDetector;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.A.onTouchEvent(motionEvent);
        }
        return false;
    }
}
