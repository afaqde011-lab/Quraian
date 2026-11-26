package p;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class o0 extends p4.a {

    public final int f12187e;

    public final int f12188f;

    public final WeakReference f12189g;

    public final s0 f12190h;

    public o0(s0 s0Var, int i10, int i11, WeakReference weakReference) {
        this.f12190h = s0Var;
        this.f12187e = i10;
        this.f12188f = i11;
        this.f12189g = weakReference;
    }

    @Override
    public final void h(int i10) {
    }

    @Override
    public final void i(Typeface typeface) {
        int i10 = this.f12187e;
        if (i10 != -1) {
            typeface = r0.a(typeface, i10, (this.f12188f & 2) != 0);
        }
        s0 s0Var = this.f12190h;
        if (s0Var.m) {
            s0Var.l = typeface;
            TextView textView = (TextView) this.f12189g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new com.google.android.gms.internal.cast.t0(textView, typeface, s0Var.f12206j, 3));
                } else {
                    textView.setTypeface(typeface, s0Var.f12206j);
                }
            }
        }
    }
}
