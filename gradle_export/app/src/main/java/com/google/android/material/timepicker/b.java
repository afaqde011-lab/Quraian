package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final ClockFaceView A;

    public b(ClockFaceView clockFaceView) {
        this.A = clockFaceView;
    }

    @Override
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.A;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.V.D) - clockFaceView.f4236g0;
        if (height != clockFaceView.T) {
            clockFaceView.T = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.V;
            clockHandView.L = clockFaceView.T;
            clockHandView.invalidate();
        }
        return true;
    }
}
