package i7;

import android.os.Looper;
import android.view.View;
import b3.i2;
import com.google.android.material.sidesheet.SideSheetBehavior;
import k9.f4;

public final class a0 implements Runnable {
    public final int A;
    public final int B;
    public final Object C;

    public a0(i0 i0Var, int i10, boolean z10) {
        this.A = 0;
        this.C = i0Var;
        this.B = i10;
    }

    public a0(Object obj, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        int i11 = 1;
        int i12 = this.B;
        Object obj = this.C;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                j7.f fVar = i0Var.X;
                int i13 = ((a) i0Var.A[i12].f7384e).B;
                fVar.b0(fVar.a0(), 1033, new j2.n(18));
                break;
            case 1:
                v vVar = ((k7.n) obj).f9112b;
                String str = e7.i0.f5136a;
                i2 i2Var = vVar.A.C;
                androidx.media3.cast.n nVar = new androidx.media3.cast.n(i12, 4);
                i2Var.getClass();
                ta.c0.A(Looper.myLooper() == ((e7.d0) i2Var.f2046c).f5120a.getLooper());
                i2Var.f2044a++;
                i2Var.u(new ab.f(i2Var, nVar, 12));
                i2Var.A(Integer.valueOf(i12));
                break;
            case 2:
                k9.t0 t0Var = (k9.t0) obj;
                u.f fVar2 = t0Var.f9448k;
                fVar2.remove(Integer.valueOf(i12));
                t0Var.l.delete(i12);
                f4 f4Var = t0Var.f9449n;
                if (f4Var != null && f4Var.f9293a.f() < 5 && fVar2.isEmpty()) {
                    t0Var.m.postDelayed(new k9.z(t0Var, i11), 500L);
                    break;
                }
                break;
            case 3:
                ((p4.a) obj).h(i12);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f4191p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, i12, false);
                }
                break;
        }
    }
}
