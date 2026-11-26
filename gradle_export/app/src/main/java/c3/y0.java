package c3;

import android.os.Build;
import android.view.ViewConfiguration;

public final class y0 implements c3 {

    public final ViewConfiguration f2775a;

    public y0(ViewConfiguration viewConfiguration) {
        this.f2775a = viewConfiguration;
    }

    @Override
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final float c() {
        return this.f2775a.getScaledMinimumFlingVelocity();
    }

    @Override
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f2775a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override
    public final float f() {
        return this.f2775a.getScaledMaximumFlingVelocity();
    }

    @Override
    public final float g() {
        return this.f2775a.getScaledTouchSlop();
    }

    @Override
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f2775a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
