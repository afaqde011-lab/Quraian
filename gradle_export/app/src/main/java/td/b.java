package td;

import ab.a0;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import b3.j0;
import b3.o0;
import ca.v;
import g00.p;
import h2.e;
import i2.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.i1;
import l1.q;
import l1.y1;

public final class b extends m2.b implements y1 {
    public final Drawable E;
    public final i1 F;
    public final i1 G;
    public final p H;

    public b(Drawable drawable) {
        m.e(drawable, "drawable");
        this.E = drawable;
        this.F = q.z(0);
        Object obj = d.f14520a;
        this.G = q.z(new e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : v.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.H = rd.a.J(new j0(this, 24));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override
    public final void a(float f3) {
        this.E.setAlpha(a0.y(w00.a.F(f3 * 255), 0, 255));
    }

    @Override
    public final void b() {
        c();
    }

    @Override
    public final void c() {
        Drawable drawable = this.E;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.H.getValue();
        Drawable drawable = this.E;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override
    public final void e(i2.m mVar) {
        this.E.setColorFilter(mVar != null ? mVar.f7144a : null);
    }

    @Override
    public final void f(y3.m mVar) throws NoWhenBranchMatchedException {
        int i10;
        m.e(mVar, "layoutDirection");
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        this.E.setLayoutDirection(i10);
    }

    @Override
    public final long h() {
        return ((e) this.G.getValue()).f6558a;
    }

    @Override
    public final void i(o0 o0Var) {
        k2.b bVar = o0Var.A;
        s sVarN = bVar.B.n();
        ((Number) this.F.getValue()).intValue();
        int iF = w00.a.F(e.e(bVar.b()));
        int iF2 = w00.a.F(e.b(bVar.b()));
        Drawable drawable = this.E;
        drawable.setBounds(0, 0, iF, iF2);
        try {
            sVarN.i();
            drawable.draw(i2.b.a(sVarN));
        } finally {
            sVarN.q();
        }
    }
}
