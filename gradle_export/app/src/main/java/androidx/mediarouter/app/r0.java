package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

public final class r0 {

    public final BitmapDrawable f1792a;

    public final Rect f1794c;

    public Interpolator f1795d;

    public long f1796e;

    public final Rect f1797f;

    public int f1798g;

    public long f1800i;

    public boolean f1801j;

    public boolean f1802k;
    public l9.f0 l;

    public float f1793b = 1.0f;

    public float f1799h = 1.0f;

    public r0(BitmapDrawable bitmapDrawable, Rect rect) {
        this.f1792a = bitmapDrawable;
        this.f1797f = rect;
        Rect rect2 = new Rect(rect);
        this.f1794c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f1793b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
