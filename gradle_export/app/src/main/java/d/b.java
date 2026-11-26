package d;

import android.os.Build;
import android.window.BackEvent;

public final class b {

    public final float f4375a;

    public final float f4376b;

    public final float f4377c;

    public final int f4378d;

    public final long f4379e;

    public b(float f3, float f10, float f11, int i10, long j9) {
        this.f4375a = f3;
        this.f4376b = f10;
        this.f4377c = f11;
        this.f4378d = i10;
        this.f4379e = j9;
    }

    public b(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    public b(s9.b bVar) {
        this(bVar.f13907c, bVar.f13908d, bVar.f13906b, bVar.f13905a, bVar.f13909e);
        kotlin.jvm.internal.m.e(bVar, "navigationEvent");
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f4375a + ", touchY=" + this.f4376b + ", progress=" + this.f4377c + ", swipeEdge=" + this.f4378d + ", frameTimeMillis=" + this.f4379e + ')';
    }
}
