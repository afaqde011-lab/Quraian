package f1;

import a1.z;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.i0;
import f0.k;
import i2.b0;
import i2.t;
import kotlin.jvm.internal.m;

public final class e extends View {
    public static final int[] F = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] G = new int[0];
    public h A;
    public Boolean B;
    public Long C;
    public i0 D;
    public z E;

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.C;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? F : G;
            h hVar = this.A;
            if (hVar != null) {
                hVar.setState(iArr);
            }
        } else {
            i0 i0Var = new i0(this, 16);
            this.D = i0Var;
            postDelayed(i0Var, 50L);
        }
        this.C = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(e eVar) {
        h hVar = eVar.A;
        if (hVar != null) {
            hVar.setState(G);
        }
        eVar.D = null;
    }

    public final void b(k kVar, boolean z10, long j9, int i10, long j10, z zVar) {
        if (this.A == null || !Boolean.valueOf(z10).equals(this.B)) {
            h hVar = new h(z10);
            setBackground(hVar);
            this.A = hVar;
            this.B = Boolean.valueOf(z10);
        }
        h hVar2 = this.A;
        m.b(hVar2);
        this.E = zVar;
        e(i10, j9, j10);
        if (z10) {
            hVar2.setHotspot(Float.intBitsToFloat((int) (kVar.f5478a >> 32)), Float.intBitsToFloat((int) (kVar.f5478a & 4294967295L)));
        } else {
            hVar2.setHotspot(hVar2.getBounds().centerX(), hVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.E = null;
        i0 i0Var = this.D;
        if (i0Var != null) {
            removeCallbacks(i0Var);
            i0 i0Var2 = this.D;
            m.b(i0Var2);
            i0Var2.run();
        } else {
            h hVar = this.A;
            if (hVar != null) {
                hVar.setState(G);
            }
        }
        h hVar2 = this.A;
        if (hVar2 == null) {
            return;
        }
        hVar2.setVisible(false, false);
        unscheduleDrawable(hVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i10, long j9, long j10) {
        h hVar = this.A;
        if (hVar == null) {
            return;
        }
        Integer num = hVar.C;
        if (num == null || num.intValue() != i10) {
            hVar.C = Integer.valueOf(i10);
            hVar.setRadius(i10);
        }
        long jB = t.b(0.1f, j10);
        t tVar = hVar.B;
        if (!(tVar == null ? false : t.c(tVar.f7169a, jB))) {
            hVar.B = new t(jB);
            hVar.setColor(ColorStateList.valueOf(b0.C(jB)));
        }
        Rect rect = new Rect(0, 0, w00.a.F(h2.e.e(j9)), w00.a.F(h2.e.b(j9)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hVar.setBounds(rect);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.invoke();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override
    public final void refreshDrawableState() {
    }
}
