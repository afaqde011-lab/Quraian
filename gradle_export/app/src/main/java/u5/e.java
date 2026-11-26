package u5;

import android.animation.ValueAnimator;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import b1.i;
import java.util.ArrayList;
import kh.n;
import q3.e0;
import r3.a0;
import s10.w0;
import sg.v;
import ta.q;
import ta.z;

public final class e {

    public static final c f14957p = new c(1);

    public static final c f14958q = new c(2);

    public static final c f14959r = new c(3);

    public static final c f14960s = new c(4);

    public static final c f14961t = new c(5);

    public static final c f14962u = new c(0);

    public float f14963a;

    public float f14964b;

    public boolean f14965c;

    public final v f14966d;

    public final n f14967e;

    public boolean f14968f;

    public float f14969g;

    public float f14970h;

    public long f14971i;

    public float f14972j;

    public final ArrayList f14973k;
    public final ArrayList l;
    public f m;

    public float f14974n;

    public boolean f14975o;

    public e(i iVar) {
        this.f14963a = 0.0f;
        this.f14964b = Float.MAX_VALUE;
        this.f14965c = false;
        this.f14968f = false;
        this.f14969g = Float.MAX_VALUE;
        this.f14970h = -3.4028235E38f;
        this.f14971i = 0L;
        this.f14973k = new ArrayList();
        this.l = new ArrayList();
        this.f14966d = null;
        this.f14967e = new d(iVar);
        this.f14972j = 1.0f;
        this.m = null;
        this.f14974n = Float.MAX_VALUE;
        this.f14975o = false;
    }

    public e(v vVar, n nVar) {
        this.f14963a = 0.0f;
        this.f14964b = Float.MAX_VALUE;
        this.f14965c = false;
        this.f14968f = false;
        this.f14969g = Float.MAX_VALUE;
        this.f14970h = -3.4028235E38f;
        this.f14971i = 0L;
        this.f14973k = new ArrayList();
        this.l = new ArrayList();
        this.f14966d = vVar;
        this.f14967e = nVar;
        if (nVar == f14959r || nVar == f14960s || nVar == f14961t) {
            this.f14972j = 0.1f;
        } else if (nVar == f14962u) {
            this.f14972j = 0.00390625f;
        } else if (nVar == f14957p || nVar == f14958q) {
            this.f14972j = 0.002f;
        } else {
            this.f14972j = 1.0f;
        }
        this.m = null;
        this.f14974n = Float.MAX_VALUE;
        this.f14975o = false;
    }

    public static b b() {
        ThreadLocal threadLocal = b.f14946i;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new e0(12)));
        }
        return (b) threadLocal.get();
    }

    public final void a(float f3) {
        if (this.f14968f) {
            this.f14974n = f3;
            return;
        }
        if (this.m == null) {
            this.m = new f(f3);
        }
        f fVar = this.m;
        double d3 = f3;
        fVar.f14984i = d3;
        double d5 = (float) d3;
        if (d5 > this.f14969g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d5 < this.f14970h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f14972j * 0.75f);
        fVar.f14979d = dAbs;
        fVar.f14980e = dAbs * 62.5d;
        e0 e0Var = b().f14951e;
        e0Var.getClass();
        if (Thread.currentThread() != ((Looper) e0Var.C).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z10 = this.f14968f;
        if (z10 || z10) {
            return;
        }
        this.f14968f = true;
        if (!this.f14965c) {
            this.f14964b = this.f14967e.O(this.f14966d);
        }
        float f10 = this.f14964b;
        if (f10 > this.f14969g || f10 < this.f14970h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b bVarB = b();
        ArrayList arrayList = bVarB.f14948b;
        if (arrayList.size() == 0) {
            ((Choreographer) bVarB.f14951e.B).postFrameCallback(new a0(bVarB.f14950d, 1));
            bVarB.f14953g = ValueAnimator.getDurationScale();
            if (bVarB.f14954h == null) {
                bVarB.f14954h = new w0(bVarB, 8);
            }
            final w0 w0Var = bVarB.f14954h;
            if (((a) w0Var.B) == null) {
                ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() {
                    @Override
                    public final void onChanged(float f11) {
                        ((b) w0Var.C).f14953g = f11;
                    }
                };
                w0Var.B = durationScaleChangeListener;
                ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f3) {
        ArrayList arrayList;
        this.f14967e.c0(this.f14966d, f3);
        int i10 = 0;
        while (true) {
            arrayList = this.l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                q qVar = (q) arrayList.get(i10);
                float f10 = this.f14964b;
                z zVar = qVar.f14487h;
                long jMax = Math.max(-1L, Math.min(zVar.X + 1, Math.round(f10)));
                zVar.H(jMax, qVar.f14480a);
                qVar.f14480a = jMax;
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.f14977b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        e0 e0Var = b().f14951e;
        e0Var.getClass();
        if (Thread.currentThread() != ((Looper) e0Var.C).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f14968f) {
            this.f14975o = true;
        }
    }
}
