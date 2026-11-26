package ba;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class m0 {

    public d0 f2347a;

    public ArrayList f2348b;

    public long f2349c;

    public long f2350d;

    public long f2351e;

    public long f2352f;

    public static void b(f1 f1Var) {
        RecyclerView recyclerView;
        int i10 = f1Var.f2284j;
        if (f1Var.f() || (i10 & 4) != 0 || (recyclerView = f1Var.f2290r) == null) {
            return;
        }
        recyclerView.J(f1Var);
    }

    public abstract boolean a(f1 f1Var, f1 f1Var2, androidx.media3.common.w0 w0Var, androidx.media3.common.w0 w0Var2);

    public final void c(f1 f1Var) {
        d0 d0Var = this.f2347a;
        if (d0Var != null) {
            RecyclerView recyclerView = d0Var.f2262a;
            boolean z10 = true;
            f1Var.n(true);
            View view = f1Var.f2275a;
            if (f1Var.f2282h != null && f1Var.f2283i == null) {
                f1Var.f2282h = null;
            }
            f1Var.f2283i = null;
            if ((f1Var.f2284j & 16) != 0) {
                return;
            }
            v0 v0Var = recyclerView.C;
            recyclerView.k0();
            a20.g gVar = recyclerView.F;
            a8.i0 i0Var = (a8.i0) gVar.D;
            d0 d0Var2 = (d0) gVar.C;
            int i10 = gVar.B;
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    gVar.B = 2;
                    int iIndexOfChild = d0Var2.f2262a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        gVar.L(view);
                    } else if (i0Var.E(iIndexOfChild)) {
                        i0Var.J(iIndexOfChild);
                        gVar.L(view);
                        d0Var2.c(iIndexOfChild);
                    } else {
                        gVar.B = 0;
                    }
                    gVar.B = 0;
                    if (z10) {
                        f1 f1VarM = RecyclerView.M(view);
                        v0Var.p(f1VarM);
                        v0Var.m(f1VarM);
                        if (RecyclerView.f1853c1) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m0(!z10);
                    if (z10 && f1Var.j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th2) {
                    gVar.B = 0;
                    throw th2;
                }
            }
            if (((View) gVar.F) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z10 = false;
            if (z10) {
                f1 f1VarM2 = RecyclerView.M(view);
                v0Var.p(f1VarM2);
                v0Var.m(f1VarM2);
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.m0(!z10);
            if (z10) {
            }
        }
    }

    public abstract void d(f1 f1Var);

    public abstract void e();

    public abstract boolean f();
}
