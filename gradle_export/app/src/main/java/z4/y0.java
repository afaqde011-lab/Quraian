package z4;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class y0 extends g1 {

    public final WindowInsets f17232c;

    public q4.b[] f17233d;

    public q4.b f17234e;

    public j1 f17235f;

    public q4.b f17236g;

    public int f17237h;

    public h f17238i;

    public int f17239j;

    public int f17240k;
    public Rect[][] l;
    public Rect[][] m;

    public y0(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var);
        this.f17234e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.f17232c = windowInsets;
    }

    public y0(j1 j1Var, y0 y0Var) {
        this(j1Var, new WindowInsets(y0Var.f17232c));
    }

    private h C(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f17195a.f17202a.t()) {
            return h.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        t tVarH = y3.H(display, 0);
        t tVarH2 = y3.H(display, 1);
        t tVarH3 = y3.H(display, 2);
        t tVarH4 = y3.H(display, 3);
        return h.a(point.x, point.y, false, tVarH != null ? tVarH.f17224b : 0, tVarH2 != null ? tVarH2.f17224b : 0, tVarH3 != null ? tVarH3.f17224b : 0, tVarH4 != null ? tVarH4.f17224b : 0);
    }

    private static List<Rect> D(Rect[][] rectArr, int i10) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && (rectArr2 = rectArr[f50.c.K(i11)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] E(q4.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = bVar.f12755a;
        int i11 = bVar.f12758d;
        int i12 = bVar.f12757c;
        int i13 = bVar.f12756b;
        if (i10 != 0) {
            arrayList.add(new Rect(0, 0, bVar.f12755a, this.f17239j));
        }
        if (i13 != 0) {
            arrayList.add(new Rect(0, 0, this.f17240k, i13));
        }
        if (i12 != 0) {
            int i14 = this.f17240k;
            arrayList.add(new Rect(i14 - i12, 0, i14, this.f17239j));
        }
        if (i11 != 0) {
            int i15 = this.f17239j;
            arrayList.add(new Rect(0, i15 - i11, this.f17240k, i15));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private q4.b F(int i10, boolean z10) {
        q4.b bVarA = q4.b.f12754e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVarA = q4.b.a(bVarA, G(i11, z10));
            }
        }
        return bVarA;
    }

    private q4.b H() {
        j1 j1Var = this.f17235f;
        return j1Var != null ? j1Var.f17202a.l() : q4.b.f12754e;
    }

    private q4.b I(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public static boolean K(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    @Override
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public q4.b G(int i10, boolean z10) {
        q4.b bVarL;
        int i11;
        q4.b bVar = q4.b.f12754e;
        if (i10 == 1) {
            if (z10) {
                return q4.b.c(0, Math.max(H().f12756b, n().f12756b), 0, 0);
            }
            return (this.f17237h & 4) != 0 ? bVar : q4.b.c(0, n().f12756b, 0, 0);
        }
        if (i10 == 2) {
            if (z10) {
                q4.b bVarH = H();
                q4.b bVarL2 = l();
                return q4.b.c(Math.max(bVarH.f12755a, bVarL2.f12755a), 0, Math.max(bVarH.f12757c, bVarL2.f12757c), Math.max(bVarH.f12758d, bVarL2.f12758d));
            }
            if ((this.f17237h & 2) != 0) {
                return bVar;
            }
            q4.b bVarN = n();
            j1 j1Var = this.f17235f;
            bVarL = j1Var != null ? j1Var.f17202a.l() : null;
            int iMin = bVarN.f12758d;
            if (bVarL != null) {
                iMin = Math.min(iMin, bVarL.f12758d);
            }
            return q4.b.c(bVarN.f12755a, 0, bVarN.f12757c, iMin);
        }
        if (i10 == 8) {
            q4.b[] bVarArr = this.f17233d;
            bVarL = bVarArr != null ? bVarArr[f50.c.K(8)] : null;
            if (bVarL != null) {
                return bVarL;
            }
            q4.b bVarN2 = n();
            q4.b bVarH2 = H();
            int i12 = bVarN2.f12758d;
            if (i12 > bVarH2.f12758d) {
                return q4.b.c(0, 0, 0, i12);
            }
            q4.b bVar2 = this.f17236g;
            return (bVar2 == null || bVar2.equals(bVar) || (i11 = this.f17236g.f12758d) <= bVarH2.f12758d) ? bVar : q4.b.c(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return m();
        }
        if (i10 == 32) {
            return k();
        }
        if (i10 == 64) {
            return o();
        }
        if (i10 != 128) {
            return bVar;
        }
        j1 j1Var2 = this.f17235f;
        f fVarH = j1Var2 != null ? j1Var2.f17202a.h() : h();
        if (fVarH == null) {
            return bVar;
        }
        DisplayCutout displayCutout = fVarH.f17190a;
        return q4.b.c(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
    }

    public boolean J(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !G(i10, false).equals(q4.b.f12754e);
    }

    @Override
    public void d(View view) {
        this.f17240k = view.getWidth();
        this.f17239j = view.getHeight();
        q4.b bVarI = I(view);
        if (bVarI == null) {
            bVarI = q4.b.f12754e;
        }
        x(bVarI);
    }

    @Override
    public void e(j1 j1Var) {
        j1Var.f17202a.y(this.f17235f);
        q4.b bVar = this.f17236g;
        g1 g1Var = j1Var.f17202a;
        g1Var.x(bVar);
        g1Var.z(this.f17237h);
        g1Var.v(this.f17238i);
        g1Var.A(this.l);
        g1Var.B(this.m);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Objects.equals(this.f17236g, y0Var.f17236g) && K(this.f17237h, y0Var.f17237h);
    }

    @Override
    public List<Rect> f(int i10) {
        return D(this.l, i10);
    }

    @Override
    public List<Rect> g(int i10) {
        return D(this.m, i10);
    }

    @Override
    public q4.b i(int i10) {
        return F(i10, false);
    }

    @Override
    public q4.b j(int i10) {
        return F(i10, true);
    }

    @Override
    public final q4.b n() {
        if (this.f17234e == null) {
            WindowInsets windowInsets = this.f17232c;
            this.f17234e = q4.b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f17234e;
    }

    @Override
    public void p(View view) {
        this.f17238i = C(view);
    }

    @Override
    public void q() {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int iK = f50.c.K(i10);
            this.l[iK] = E(i(i10));
            if (i10 != 8) {
                this.m[iK] = E(j(i10));
            }
        }
    }

    @Override
    public j1 r(int i10, int i11, int i12, int i13) {
        x0 u0Var;
        j1 j1VarG = j1.g(null, this.f17232c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 36) {
            u0Var = new w0(j1VarG);
        } else if (i14 >= 35) {
            u0Var = new v0(j1VarG);
        } else {
            u0Var = i14 >= 34 ? new u0(j1VarG) : new t0(j1VarG);
        }
        u0Var.g(j1.e(n(), i10, i11, i12, i13));
        u0Var.e(j1.e(l(), i10, i11, i12, i13));
        return u0Var.b();
    }

    @Override
    public boolean t() {
        return this.f17232c.isRound();
    }

    @Override
    public boolean u(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !J(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void v(h hVar) {
        this.f17238i = hVar;
    }

    @Override
    public void w(q4.b[] bVarArr) {
        this.f17233d = bVarArr;
    }

    @Override
    public void x(q4.b bVar) {
        this.f17236g = bVar;
    }

    @Override
    public void y(j1 j1Var) {
        this.f17235f = j1Var;
    }

    @Override
    public void z(int i10) {
        this.f17237h = i10;
    }
}
