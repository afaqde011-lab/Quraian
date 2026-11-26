package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class c extends z4.b {
    public final ClockFaceView D;

    public c(ClockFaceView clockFaceView) {
        this.D = clockFaceView;
    }

    @Override
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(2131362797)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.D.f4232c0.get(iIntValue - 1));
        }
        gVar.i(a5.f.a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(a5.c.f171e);
    }

    @Override
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.D;
        view.getHitRect(clockFaceView.W);
        float fCenterX = clockFaceView.W.centerX();
        float fCenterY = clockFaceView.W.centerY();
        clockFaceView.V.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.V.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
