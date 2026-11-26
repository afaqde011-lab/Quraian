package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class k extends GestureDetector.SimpleOnGestureListener {
    public final TimePickerView A;

    public k(TimePickerView timePickerView) {
        this.A = timePickerView;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i10 = TimePickerView.T;
        this.A.getClass();
        return false;
    }
}
