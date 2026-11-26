package z4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

public final class j1 {

    public static final j1 f17201b;

    public final g1 f17202a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f17201b = e1.f17189s;
        } else {
            f17201b = c1.f17180r;
        }
    }

    public j1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f17202a = new f1(this, windowInsets);
        } else if (i10 >= 34) {
            this.f17202a = new e1(this, windowInsets);
        } else {
            this.f17202a = new d1(this, windowInsets);
        }
    }

    public j1(j1 j1Var) {
        if (j1Var == null) {
            this.f17202a = new g1(this);
            return;
        }
        g1 g1Var = j1Var.f17202a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35 && (g1Var instanceof f1)) {
            this.f17202a = new f1(this, (f1) g1Var);
        } else if (i10 >= 34 && (g1Var instanceof e1)) {
            this.f17202a = new e1(this, (e1) g1Var);
        } else if (g1Var instanceof d1) {
            this.f17202a = new d1(this, (d1) g1Var);
        } else if (g1Var instanceof c1) {
            this.f17202a = new c1(this, (c1) g1Var);
        } else if (g1Var instanceof b1) {
            this.f17202a = new b1(this, (b1) g1Var);
        } else if (g1Var instanceof a1) {
            this.f17202a = new a1(this, (a1) g1Var);
        } else if (g1Var instanceof z0) {
            this.f17202a = new z0(this, (z0) g1Var);
        } else if (g1Var instanceof y0) {
            this.f17202a = new y0(this, (y0) g1Var);
        } else {
            this.f17202a = new g1(this);
        }
        g1Var.e(this);
    }

    public static q4.b e(q4.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f12755a - i10);
        int iMax2 = Math.max(0, bVar.f12756b - i11);
        int iMax3 = Math.max(0, bVar.f12757c - i12);
        int iMax4 = Math.max(0, bVar.f12758d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : q4.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static j1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        j1 j1Var = new j1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = j0.f17198a;
            j1 j1VarA = e0.a(view);
            g1 g1Var = j1Var.f17202a;
            g1Var.y(j1VarA);
            View rootView = view.getRootView();
            g1Var.d(rootView);
            g1Var.p(rootView);
            g1Var.q();
            g1Var.z(view.getWindowSystemUiVisibility());
        }
        return j1Var;
    }

    public final int a() {
        return this.f17202a.n().f12758d;
    }

    public final int b() {
        return this.f17202a.n().f12755a;
    }

    public final int c() {
        return this.f17202a.n().f12757c;
    }

    public final int d() {
        return this.f17202a.n().f12756b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return Objects.equals(this.f17202a, ((j1) obj).f17202a);
        }
        return false;
    }

    public final WindowInsets f() {
        g1 g1Var = this.f17202a;
        if (g1Var instanceof y0) {
            return ((y0) g1Var).f17232c;
        }
        return null;
    }

    public final int hashCode() {
        g1 g1Var = this.f17202a;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }
}
