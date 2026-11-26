package androidx.recyclerview.widget;

import a5.c;
import a5.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ba.a1;
import ba.b1;
import ba.f1;
import ba.g0;
import ba.n;
import ba.o0;
import ba.p0;
import ba.q0;
import ba.s;
import ba.t;
import ba.u;
import ba.v;
import ba.v0;
import ba.w;
import ba.y;
import java.util.ArrayList;
import java.util.List;
import ze.d;

public class LinearLayoutManager extends p0 implements a1 {
    public final s A;
    public final t B;
    public final int C;
    public final int[] D;

    public int f1841p;

    public u f1842q;

    public y f1843r;

    public boolean f1844s;

    public final boolean f1845t;

    public boolean f1846u;

    public boolean f1847v;

    public final boolean f1848w;

    public int f1849x;

    public int f1850y;

    public v f1851z;

    public LinearLayoutManager(int i10) {
        this.f1841p = 1;
        this.f1845t = false;
        this.f1846u = false;
        this.f1847v = false;
        this.f1848w = true;
        this.f1849x = -1;
        this.f1850y = Integer.MIN_VALUE;
        this.f1851z = null;
        this.A = new s();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        c1(i10);
        c(null);
        if (this.f1845t) {
            this.f1845t = false;
            o0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1841p = 1;
        this.f1845t = false;
        this.f1846u = false;
        this.f1847v = false;
        this.f1848w = true;
        this.f1849x = -1;
        this.f1850y = Integer.MIN_VALUE;
        this.f1851z = null;
        this.A = new s();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        o0 o0VarH = p0.H(context, attributeSet, i10, i11);
        c1(o0VarH.f2368a);
        boolean z10 = o0VarH.f2370c;
        c(null);
        if (z10 != this.f1845t) {
            this.f1845t = z10;
            o0();
        }
        d1(o0VarH.f2371d);
    }

    @Override
    public void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext());
        wVar.f2445a = i10;
        B0(wVar);
    }

    @Override
    public boolean C0() {
        return this.f1851z == null && this.f1844s == this.f1847v;
    }

    public void D0(b1 b1Var, int[] iArr) {
        int i10;
        int iN = b1Var.f2238a != -1 ? this.f1843r.n() : 0;
        if (this.f1842q.f2428f == -1) {
            i10 = 0;
        } else {
            i10 = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i10;
    }

    public void E0(b1 b1Var, u uVar, n nVar) {
        int i10 = uVar.f2426d;
        if (i10 < 0 || i10 >= b1Var.b()) {
            return;
        }
        nVar.b(i10, Math.max(0, uVar.f2429g));
    }

    public final int F0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        y yVar = this.f1843r;
        boolean z10 = !this.f1848w;
        return d.n(b1Var, yVar, M0(z10), L0(z10), this, this.f1848w);
    }

    public final int G0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        y yVar = this.f1843r;
        boolean z10 = !this.f1848w;
        return d.o(b1Var, yVar, M0(z10), L0(z10), this, this.f1848w, this.f1846u);
    }

    public final int H0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        y yVar = this.f1843r;
        boolean z10 = !this.f1848w;
        return d.p(b1Var, yVar, M0(z10), L0(z10), this, this.f1848w);
    }

    public final int I0(int i10) {
        if (i10 == 1) {
            return (this.f1841p != 1 && V0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f1841p != 1 && V0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f1841p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f1841p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f1841p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f1841p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void J0() {
        if (this.f1842q == null) {
            u uVar = new u();
            uVar.f2423a = true;
            uVar.f2430h = 0;
            uVar.f2431i = 0;
            uVar.f2433k = null;
            this.f1842q = uVar;
        }
    }

    @Override
    public final boolean K() {
        return true;
    }

    public final int K0(v0 v0Var, u uVar, b1 b1Var, boolean z10) {
        int i10;
        int i11 = uVar.f2425c;
        int i12 = uVar.f2429g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                uVar.f2429g = i12 + i11;
            }
            Y0(v0Var, uVar);
        }
        int i13 = uVar.f2425c + uVar.f2430h;
        while (true) {
            if ((!uVar.l && i13 <= 0) || (i10 = uVar.f2426d) < 0 || i10 >= b1Var.b()) {
                break;
            }
            t tVar = this.B;
            tVar.f2418d = 0;
            tVar.f2415a = false;
            tVar.f2416b = false;
            tVar.f2417c = false;
            W0(v0Var, b1Var, uVar, tVar);
            if (!tVar.f2415a) {
                int i14 = uVar.f2424b;
                int i15 = tVar.f2418d;
                uVar.f2424b = (uVar.f2428f * i15) + i14;
                if (!tVar.f2416b || uVar.f2433k != null || !b1Var.f2244g) {
                    uVar.f2425c -= i15;
                    i13 -= i15;
                }
                int i16 = uVar.f2429g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    uVar.f2429g = i17;
                    int i18 = uVar.f2425c;
                    if (i18 < 0) {
                        uVar.f2429g = i17 + i18;
                    }
                    Y0(v0Var, uVar);
                }
                if (z10 && tVar.f2417c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - uVar.f2425c;
    }

    @Override
    public final boolean L() {
        return this.f1845t;
    }

    public final View L0(boolean z10) {
        return this.f1846u ? P0(0, v(), z10) : P0(v() - 1, -1, z10);
    }

    public final View M0(boolean z10) {
        return this.f1846u ? P0(v() - 1, -1, z10) : P0(0, v(), z10);
    }

    public final int N0() {
        View viewP0 = P0(v() - 1, -1, false);
        if (viewP0 == null) {
            return -1;
        }
        return p0.G(viewP0);
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        J0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f1843r.g(u(i10)) < this.f1843r.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f1841p == 0 ? this.f2379c.i(i10, i11, i12, i13) : this.f2380d.i(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10) {
        J0();
        int i12 = z10 ? 24579 : 320;
        return this.f1841p == 0 ? this.f2379c.i(i10, i11, i12, 320) : this.f2380d.i(i10, i11, i12, 320);
    }

    public View Q0(v0 v0Var, b1 b1Var, boolean z10, boolean z11) {
        int i10;
        int iV;
        int i11;
        J0();
        int iV2 = v();
        if (z11) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
            i11 = 1;
        }
        int iB = b1Var.b();
        int iM = this.f1843r.m();
        int i12 = this.f1843r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iG = p0.G(viewU);
            int iG2 = this.f1843r.g(viewU);
            int iD = this.f1843r.d(viewU);
            if (iG >= 0 && iG < iB) {
                if (!((q0) viewU.getLayoutParams()).f2392a.h()) {
                    boolean z12 = iD <= iM && iG2 < iM;
                    boolean z13 = iG2 >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return viewU;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z12) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int R0(int i10, v0 v0Var, b1 b1Var, boolean z10) {
        int i11;
        int i12 = this.f1843r.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -b1(-i12, v0Var, b1Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f1843r.i() - i14) <= 0) {
            return i13;
        }
        this.f1843r.q(i11);
        return i11 + i13;
    }

    @Override
    public final void S(RecyclerView recyclerView) {
    }

    public final int S0(int i10, v0 v0Var, b1 b1Var, boolean z10) {
        int iM;
        int iM2 = i10 - this.f1843r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -b1(iM2, v0Var, b1Var);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f1843r.m()) <= 0) {
            return i11;
        }
        this.f1843r.q(-iM);
        return i11 - iM;
    }

    @Override
    public View T(View view, int i10, v0 v0Var, b1 b1Var) {
        int iI0;
        View viewO0;
        a1();
        if (v() != 0 && (iI0 = I0(i10)) != Integer.MIN_VALUE) {
            J0();
            e1(iI0, (int) (this.f1843r.n() * 0.33333334f), false, b1Var);
            u uVar = this.f1842q;
            uVar.f2429g = Integer.MIN_VALUE;
            uVar.f2423a = false;
            K0(v0Var, uVar, b1Var, true);
            if (iI0 == -1) {
                viewO0 = this.f1846u ? O0(v() - 1, -1) : O0(0, v());
            } else {
                viewO0 = this.f1846u ? O0(0, v()) : O0(v() - 1, -1);
            }
            View viewU0 = iI0 == -1 ? U0() : T0();
            if (!viewU0.hasFocusable()) {
                return viewO0;
            }
            if (viewO0 != null) {
                return viewU0;
            }
        }
        return null;
    }

    public final View T0() {
        return u(this.f1846u ? 0 : v() - 1);
    }

    @Override
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewP0 = P0(0, v(), false);
            accessibilityEvent.setFromIndex(viewP0 == null ? -1 : p0.G(viewP0));
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        return u(this.f1846u ? v() - 1 : 0);
    }

    @Override
    public void V(v0 v0Var, b1 b1Var, g gVar) {
        super.V(v0Var, b1Var, gVar);
        g0 g0Var = this.f2378b.M;
        if (g0Var == null || g0Var.getItemCount() <= 0) {
            return;
        }
        gVar.b(c.m);
    }

    public final boolean V0() {
        return this.f2378b.getLayoutDirection() == 1;
    }

    public void W0(v0 v0Var, b1 b1Var, u uVar, t tVar) {
        int iF;
        int iF2;
        int i10;
        int i11;
        int iF3;
        View viewB = uVar.b(v0Var);
        if (viewB == null) {
            tVar.f2415a = true;
            return;
        }
        q0 q0Var = (q0) viewB.getLayoutParams();
        if (uVar.f2433k == null) {
            if (this.f1846u == (uVar.f2428f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f1846u == (uVar.f2428f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        q0 q0Var2 = (q0) viewB.getLayoutParams();
        Rect rectN = this.f2378b.N(viewB);
        int i12 = rectN.left + rectN.right;
        int i13 = rectN.top + rectN.bottom;
        int iW = p0.w(d(), this.f2388n, this.l, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) q0Var2).width);
        int iW2 = p0.w(e(), this.f2389o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin + ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) q0Var2).height);
        if (x0(viewB, iW, iW2, q0Var2)) {
            viewB.measure(iW, iW2);
        }
        tVar.f2418d = this.f1843r.e(viewB);
        if (this.f1841p == 1) {
            if (V0()) {
                iF3 = this.f2388n - E();
                iF2 = iF3 - this.f1843r.f(viewB);
            } else {
                int iD = D();
                iF3 = this.f1843r.f(viewB) + iD;
                iF2 = iD;
            }
            if (uVar.f2428f == -1) {
                iF = uVar.f2424b;
                i11 = iF - tVar.f2418d;
            } else {
                i11 = uVar.f2424b;
                iF = tVar.f2418d + i11;
            }
        } else {
            int iF4 = F();
            iF = this.f1843r.f(viewB) + iF4;
            if (uVar.f2428f == -1) {
                int i14 = uVar.f2424b;
                i10 = i14;
                iF2 = i14 - tVar.f2418d;
            } else {
                int i15 = uVar.f2424b;
                iF2 = i15;
                i10 = tVar.f2418d + i15;
            }
            i11 = iF4;
            iF3 = i10;
        }
        p0.N(viewB, iF2, i11, iF3, iF);
        if (q0Var.f2392a.h() || q0Var.f2392a.k()) {
            tVar.f2416b = true;
        }
        tVar.f2417c = viewB.hasFocusable();
    }

    public void X0(v0 v0Var, b1 b1Var, s sVar, int i10) {
    }

    public final void Y0(v0 v0Var, u uVar) {
        if (!uVar.f2423a || uVar.l) {
            return;
        }
        int i10 = uVar.f2429g;
        int i11 = uVar.f2431i;
        if (uVar.f2428f == -1) {
            int iV = v();
            if (i10 < 0) {
                return;
            }
            int iH = (this.f1843r.h() - i10) + i11;
            if (this.f1846u) {
                for (int i12 = 0; i12 < iV; i12++) {
                    View viewU = u(i12);
                    if (this.f1843r.g(viewU) < iH || this.f1843r.p(viewU) < iH) {
                        Z0(v0Var, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iV - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewU2 = u(i14);
                if (this.f1843r.g(viewU2) < iH || this.f1843r.p(viewU2) < iH) {
                    Z0(v0Var, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iV2 = v();
        if (!this.f1846u) {
            for (int i16 = 0; i16 < iV2; i16++) {
                View viewU3 = u(i16);
                if (this.f1843r.d(viewU3) > i15 || this.f1843r.o(viewU3) > i15) {
                    Z0(v0Var, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iV2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewU4 = u(i18);
            if (this.f1843r.d(viewU4) > i15 || this.f1843r.o(viewU4) > i15) {
                Z0(v0Var, i17, i18);
                return;
            }
        }
    }

    public final void Z0(v0 v0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                m0(i10);
                v0Var.l(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            m0(i12);
            v0Var.l(viewU2);
        }
    }

    @Override
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < p0.G(u(0))) != this.f1846u ? -1 : 1;
        return this.f1841p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final void a1() {
        if (this.f1841p == 1 || !V0()) {
            this.f1846u = this.f1845t;
        } else {
            this.f1846u = !this.f1845t;
        }
    }

    public final int b1(int i10, v0 v0Var, b1 b1Var) {
        if (v() != 0 && i10 != 0) {
            J0();
            this.f1842q.f2423a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            e1(i11, iAbs, true, b1Var);
            u uVar = this.f1842q;
            int iK0 = K0(v0Var, uVar, b1Var, false) + uVar.f2429g;
            if (iK0 >= 0) {
                if (iAbs > iK0) {
                    i10 = i11 * iK0;
                }
                this.f1843r.q(-i10);
                this.f1842q.f2432j = i10;
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final void c(String str) {
        if (this.f1851z == null) {
            super.c(str);
        }
    }

    public final void c1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(g4.c.f(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f1841p || this.f1843r == null) {
            y yVarB = y.b(this, i10);
            this.f1843r = yVarB;
            this.A.f2414f = yVarB;
            this.f1841p = i10;
            o0();
        }
    }

    @Override
    public final boolean d() {
        return this.f1841p == 0;
    }

    @Override
    public void d0(v0 v0Var, b1 b1Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z10;
        boolean z11;
        View viewQ0;
        int iG;
        int iD;
        int iM;
        int i10;
        boolean z12;
        boolean z13;
        q0 q0Var;
        int i11;
        int iG2;
        int i12;
        int i13;
        List list;
        int i14;
        int i15;
        int iR0;
        int i16;
        View viewQ;
        int iG3;
        int i17;
        int i18;
        int i19 = -1;
        if (!(this.f1851z == null && this.f1849x == -1) && b1Var.b() == 0) {
            j0(v0Var);
            return;
        }
        v vVar = this.f1851z;
        if (vVar != null && (i18 = vVar.A) >= 0) {
            this.f1849x = i18;
        }
        J0();
        this.f1842q.f2423a = false;
        a1();
        RecyclerView recyclerView2 = this.f2378b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2377a.E).contains(focusedChild)) {
            focusedChild = null;
        }
        s sVar = this.A;
        if (!sVar.f2412d || this.f1849x != -1 || this.f1851z != null) {
            sVar.g();
            sVar.f2411c = this.f1846u ^ this.f1847v;
            if (b1Var.f2244g || (i11 = this.f1849x) == -1) {
                if (v() != 0) {
                    recyclerView = this.f2378b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2377a.E).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        q0Var = (q0) focusedChild2.getLayoutParams();
                        if (!q0Var.f2392a.h() || q0Var.f2392a.b() < 0 || q0Var.f2392a.b() >= b1Var.b()) {
                            z10 = this.f1844s;
                            z11 = this.f1847v;
                            if (z10 == z11 || (viewQ0 = Q0(v0Var, b1Var, sVar.f2411c, z11)) == null) {
                                sVar.b();
                                if (this.f1847v) {
                                    iB = b1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                sVar.f2410b = iB;
                            } else {
                                sVar.c(viewQ0, p0.G(viewQ0));
                                if (!b1Var.f2244g && C0()) {
                                    iG = this.f1843r.g(viewQ0);
                                    iD = this.f1843r.d(viewQ0);
                                    iM = this.f1843r.m();
                                    i10 = this.f1843r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (iG >= i10 || iD <= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z12 || z13) {
                                        if (sVar.f2411c) {
                                            iM = i10;
                                        }
                                        sVar.f2413e = iM;
                                    }
                                }
                            }
                        } else {
                            sVar.d(focusedChild2, p0.G(focusedChild2));
                        }
                    } else {
                        z10 = this.f1844s;
                        z11 = this.f1847v;
                        if (z10 == z11) {
                            sVar.b();
                            if (this.f1847v) {
                                iB = b1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            sVar.f2410b = iB;
                        } else {
                            sVar.c(viewQ0, p0.G(viewQ0));
                            if (!b1Var.f2244g) {
                                iG = this.f1843r.g(viewQ0);
                                iD = this.f1843r.d(viewQ0);
                                iM = this.f1843r.m();
                                i10 = this.f1843r.i();
                                if (iD <= iM) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iG >= i10) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (sVar.f2411c) {
                                        iM = i10;
                                    }
                                    sVar.f2413e = iM;
                                } else {
                                    if (sVar.f2411c) {
                                        iM = i10;
                                    }
                                    sVar.f2413e = iM;
                                }
                            }
                        }
                    }
                } else {
                    sVar.b();
                    if (this.f1847v) {
                        iB = b1Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    sVar.f2410b = iB;
                }
            } else if (i11 < 0 || i11 >= b1Var.b()) {
                this.f1849x = -1;
                this.f1850y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.f2378b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        q0Var = (q0) focusedChild2.getLayoutParams();
                        if (q0Var.f2392a.h()) {
                            z10 = this.f1844s;
                            z11 = this.f1847v;
                            if (z10 == z11) {
                                sVar.b();
                                if (this.f1847v) {
                                    iB = b1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                sVar.f2410b = iB;
                            } else {
                                sVar.c(viewQ0, p0.G(viewQ0));
                                if (!b1Var.f2244g) {
                                    iG = this.f1843r.g(viewQ0);
                                    iD = this.f1843r.d(viewQ0);
                                    iM = this.f1843r.m();
                                    i10 = this.f1843r.i();
                                    if (iD <= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iG >= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (sVar.f2411c) {
                                            iM = i10;
                                        }
                                        sVar.f2413e = iM;
                                    } else {
                                        if (sVar.f2411c) {
                                            iM = i10;
                                        }
                                        sVar.f2413e = iM;
                                    }
                                }
                            }
                        } else {
                            z10 = this.f1844s;
                            z11 = this.f1847v;
                            if (z10 == z11) {
                                sVar.b();
                                if (this.f1847v) {
                                    iB = b1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                sVar.f2410b = iB;
                            } else {
                                sVar.c(viewQ0, p0.G(viewQ0));
                                if (!b1Var.f2244g) {
                                    iG = this.f1843r.g(viewQ0);
                                    iD = this.f1843r.d(viewQ0);
                                    iM = this.f1843r.m();
                                    i10 = this.f1843r.i();
                                    if (iD <= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iG >= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (sVar.f2411c) {
                                            iM = i10;
                                        }
                                        sVar.f2413e = iM;
                                    } else {
                                        if (sVar.f2411c) {
                                            iM = i10;
                                        }
                                        sVar.f2413e = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z10 = this.f1844s;
                        z11 = this.f1847v;
                        if (z10 == z11) {
                            sVar.b();
                            if (this.f1847v) {
                                iB = b1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            sVar.f2410b = iB;
                        } else {
                            sVar.c(viewQ0, p0.G(viewQ0));
                            if (!b1Var.f2244g) {
                                iG = this.f1843r.g(viewQ0);
                                iD = this.f1843r.d(viewQ0);
                                iM = this.f1843r.m();
                                i10 = this.f1843r.i();
                                if (iD <= iM) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iG >= i10) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (sVar.f2411c) {
                                        iM = i10;
                                    }
                                    sVar.f2413e = iM;
                                } else {
                                    if (sVar.f2411c) {
                                        iM = i10;
                                    }
                                    sVar.f2413e = iM;
                                }
                            }
                        }
                    }
                } else {
                    sVar.b();
                    if (this.f1847v) {
                        iB = b1Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    sVar.f2410b = iB;
                }
            } else {
                int i20 = this.f1849x;
                sVar.f2410b = i20;
                v vVar2 = this.f1851z;
                if (vVar2 != null && vVar2.A >= 0) {
                    boolean z14 = vVar2.C;
                    sVar.f2411c = z14;
                    if (z14) {
                        sVar.f2413e = this.f1843r.i() - this.f1851z.B;
                    } else {
                        sVar.f2413e = this.f1843r.m() + this.f1851z.B;
                    }
                } else if (this.f1850y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i20);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            sVar.f2411c = (this.f1849x < p0.G(u(0))) == this.f1846u;
                        }
                        sVar.b();
                    } else if (this.f1843r.e(viewQ2) > this.f1843r.n()) {
                        sVar.b();
                    } else if (this.f1843r.g(viewQ2) - this.f1843r.m() < 0) {
                        sVar.f2413e = this.f1843r.m();
                        sVar.f2411c = false;
                    } else if (this.f1843r.i() - this.f1843r.d(viewQ2) < 0) {
                        sVar.f2413e = this.f1843r.i();
                        sVar.f2411c = true;
                    } else {
                        if (sVar.f2411c) {
                            int iD2 = this.f1843r.d(viewQ2);
                            y yVar = this.f1843r;
                            iG2 = (Integer.MIN_VALUE == yVar.f2461a ? 0 : yVar.n() - yVar.f2461a) + iD2;
                        } else {
                            iG2 = this.f1843r.g(viewQ2);
                        }
                        sVar.f2413e = iG2;
                    }
                } else {
                    boolean z15 = this.f1846u;
                    sVar.f2411c = z15;
                    if (z15) {
                        sVar.f2413e = this.f1843r.i() - this.f1850y;
                    } else {
                        sVar.f2413e = this.f1843r.m() + this.f1850y;
                    }
                }
            }
            sVar.f2412d = true;
        } else if (focusedChild != null && (this.f1843r.g(focusedChild) >= this.f1843r.i() || this.f1843r.d(focusedChild) <= this.f1843r.m())) {
            sVar.d(focusedChild, p0.G(focusedChild));
        }
        u uVar = this.f1842q;
        uVar.f2428f = uVar.f2432j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(b1Var, iArr);
        int iM2 = this.f1843r.m() + Math.max(0, iArr[0]);
        int iJ = this.f1843r.j() + Math.max(0, iArr[1]);
        if (b1Var.f2244g && (i16 = this.f1849x) != -1 && this.f1850y != Integer.MIN_VALUE && (viewQ = q(i16)) != null) {
            if (this.f1846u) {
                i17 = this.f1843r.i() - this.f1843r.d(viewQ);
                iG3 = this.f1850y;
            } else {
                iG3 = this.f1843r.g(viewQ) - this.f1843r.m();
                i17 = this.f1850y;
            }
            int i21 = i17 - iG3;
            if (i21 > 0) {
                iM2 += i21;
            } else {
                iJ -= i21;
            }
        }
        if (!sVar.f2411c ? !this.f1846u : this.f1846u) {
            i19 = 1;
        }
        X0(v0Var, b1Var, sVar, i19);
        p(v0Var);
        this.f1842q.l = this.f1843r.k() == 0 && this.f1843r.h() == 0;
        this.f1842q.getClass();
        this.f1842q.f2431i = 0;
        if (sVar.f2411c) {
            g1(sVar.f2410b, sVar.f2413e);
            u uVar2 = this.f1842q;
            uVar2.f2430h = iM2;
            K0(v0Var, uVar2, b1Var, false);
            u uVar3 = this.f1842q;
            i13 = uVar3.f2424b;
            int i22 = uVar3.f2426d;
            int i23 = uVar3.f2425c;
            if (i23 > 0) {
                iJ += i23;
            }
            f1(sVar.f2410b, sVar.f2413e);
            u uVar4 = this.f1842q;
            uVar4.f2430h = iJ;
            uVar4.f2426d += uVar4.f2427e;
            K0(v0Var, uVar4, b1Var, false);
            u uVar5 = this.f1842q;
            i12 = uVar5.f2424b;
            int i24 = uVar5.f2425c;
            if (i24 > 0) {
                g1(i22, i13);
                u uVar6 = this.f1842q;
                uVar6.f2430h = i24;
                K0(v0Var, uVar6, b1Var, false);
                i13 = this.f1842q.f2424b;
            }
        } else {
            f1(sVar.f2410b, sVar.f2413e);
            u uVar7 = this.f1842q;
            uVar7.f2430h = iJ;
            K0(v0Var, uVar7, b1Var, false);
            u uVar8 = this.f1842q;
            i12 = uVar8.f2424b;
            int i25 = uVar8.f2426d;
            int i26 = uVar8.f2425c;
            if (i26 > 0) {
                iM2 += i26;
            }
            g1(sVar.f2410b, sVar.f2413e);
            u uVar9 = this.f1842q;
            uVar9.f2430h = iM2;
            uVar9.f2426d += uVar9.f2427e;
            K0(v0Var, uVar9, b1Var, false);
            u uVar10 = this.f1842q;
            int i27 = uVar10.f2424b;
            int i28 = uVar10.f2425c;
            if (i28 > 0) {
                f1(i25, i12);
                u uVar11 = this.f1842q;
                uVar11.f2430h = i28;
                K0(v0Var, uVar11, b1Var, false);
                i12 = this.f1842q.f2424b;
            }
            i13 = i27;
        }
        if (v() > 0) {
            if (this.f1846u ^ this.f1847v) {
                int iR1 = R0(i12, v0Var, b1Var, true);
                i14 = i13 + iR1;
                i15 = i12 + iR1;
                iR0 = S0(i14, v0Var, b1Var, false);
            } else {
                int iS0 = S0(i13, v0Var, b1Var, true);
                i14 = i13 + iS0;
                i15 = i12 + iS0;
                iR0 = R0(i15, v0Var, b1Var, false);
            }
            i13 = i14 + iR0;
            i12 = i15 + iR0;
        }
        if (b1Var.f2248k && v() != 0 && !b1Var.f2244g && C0()) {
            List list2 = (List) v0Var.f2437a;
            int size = list2.size();
            int iG4 = p0.G(u(0));
            int iE = 0;
            int iE2 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                f1 f1Var = (f1) list2.get(i29);
                boolean zH = f1Var.h();
                View view = f1Var.f2275a;
                if (!zH) {
                    if ((f1Var.b() < iG4) != this.f1846u) {
                        iE += this.f1843r.e(view);
                    } else {
                        iE2 += this.f1843r.e(view);
                    }
                }
            }
            this.f1842q.f2433k = list2;
            if (iE > 0) {
                g1(p0.G(U0()), i13);
                u uVar12 = this.f1842q;
                uVar12.f2430h = iE;
                uVar12.f2425c = 0;
                uVar12.a(null);
                K0(v0Var, this.f1842q, b1Var, false);
            }
            if (iE2 > 0) {
                f1(p0.G(T0()), i12);
                u uVar13 = this.f1842q;
                uVar13.f2430h = iE2;
                uVar13.f2425c = 0;
                list = null;
                uVar13.a(null);
                K0(v0Var, this.f1842q, b1Var, false);
            } else {
                list = null;
            }
            this.f1842q.f2433k = list;
        }
        if (b1Var.f2244g) {
            sVar.g();
        } else {
            y yVar2 = this.f1843r;
            yVar2.f2461a = yVar2.n();
        }
        this.f1844s = this.f1847v;
    }

    public void d1(boolean z10) {
        c(null);
        if (this.f1847v == z10) {
            return;
        }
        this.f1847v = z10;
        o0();
    }

    @Override
    public final boolean e() {
        return this.f1841p == 1;
    }

    @Override
    public void e0(b1 b1Var) {
        this.f1851z = null;
        this.f1849x = -1;
        this.f1850y = Integer.MIN_VALUE;
        this.A.g();
    }

    public final void e1(int i10, int i11, boolean z10, b1 b1Var) {
        int iM;
        this.f1842q.l = this.f1843r.k() == 0 && this.f1843r.h() == 0;
        this.f1842q.f2428f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(b1Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        u uVar = this.f1842q;
        int i12 = z11 ? iMax2 : iMax;
        uVar.f2430h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        uVar.f2431i = iMax;
        if (z11) {
            uVar.f2430h = this.f1843r.j() + i12;
            View viewT0 = T0();
            u uVar2 = this.f1842q;
            uVar2.f2427e = this.f1846u ? -1 : 1;
            int iG = p0.G(viewT0);
            u uVar3 = this.f1842q;
            uVar2.f2426d = iG + uVar3.f2427e;
            uVar3.f2424b = this.f1843r.d(viewT0);
            iM = this.f1843r.d(viewT0) - this.f1843r.i();
        } else {
            View viewU0 = U0();
            u uVar4 = this.f1842q;
            uVar4.f2430h = this.f1843r.m() + uVar4.f2430h;
            u uVar5 = this.f1842q;
            uVar5.f2427e = this.f1846u ? 1 : -1;
            int iG2 = p0.G(viewU0);
            u uVar6 = this.f1842q;
            uVar5.f2426d = iG2 + uVar6.f2427e;
            uVar6.f2424b = this.f1843r.g(viewU0);
            iM = (-this.f1843r.g(viewU0)) + this.f1843r.m();
        }
        u uVar7 = this.f1842q;
        uVar7.f2425c = i11;
        if (z10) {
            uVar7.f2425c = i11 - iM;
        }
        uVar7.f2429g = iM;
    }

    @Override
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof v) {
            v vVar = (v) parcelable;
            this.f1851z = vVar;
            if (this.f1849x != -1) {
                vVar.A = -1;
            }
            o0();
        }
    }

    public final void f1(int i10, int i11) {
        this.f1842q.f2425c = this.f1843r.i() - i11;
        u uVar = this.f1842q;
        uVar.f2427e = this.f1846u ? -1 : 1;
        uVar.f2426d = i10;
        uVar.f2428f = 1;
        uVar.f2424b = i11;
        uVar.f2429g = Integer.MIN_VALUE;
    }

    @Override
    public final Parcelable g0() {
        v vVar = this.f1851z;
        if (vVar != null) {
            v vVar2 = new v();
            vVar2.A = vVar.A;
            vVar2.B = vVar.B;
            vVar2.C = vVar.C;
            return vVar2;
        }
        v vVar3 = new v();
        if (v() <= 0) {
            vVar3.A = -1;
            return vVar3;
        }
        J0();
        boolean z10 = this.f1844s ^ this.f1846u;
        vVar3.C = z10;
        if (z10) {
            View viewT0 = T0();
            vVar3.B = this.f1843r.i() - this.f1843r.d(viewT0);
            vVar3.A = p0.G(viewT0);
            return vVar3;
        }
        View viewU0 = U0();
        vVar3.A = p0.G(viewU0);
        vVar3.B = this.f1843r.g(viewU0) - this.f1843r.m();
        return vVar3;
    }

    public final void g1(int i10, int i11) {
        this.f1842q.f2425c = i11 - this.f1843r.m();
        u uVar = this.f1842q;
        uVar.f2426d = i10;
        uVar.f2427e = this.f1846u ? 1 : -1;
        uVar.f2428f = -1;
        uVar.f2424b = i11;
        uVar.f2429g = Integer.MIN_VALUE;
    }

    @Override
    public final void h(int i10, int i11, b1 b1Var, n nVar) {
        if (this.f1841p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        J0();
        e1(i10 > 0 ? 1 : -1, Math.abs(i10), true, b1Var);
        E0(b1Var, this.f1842q, nVar);
    }

    @Override
    public final void i(int i10, n nVar) {
        boolean z10;
        int i11;
        v vVar = this.f1851z;
        if (vVar == null || (i11 = vVar.A) < 0) {
            a1();
            z10 = this.f1846u;
            i11 = this.f1849x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = vVar.C;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            nVar.b(i11, 0);
            i11 += i12;
        }
    }

    @Override
    public boolean i0(int i10, Bundle bundle) {
        int iMin;
        v vVar;
        if (super.i0(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f1841p == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 >= 0) {
                    RecyclerView recyclerView = this.f2378b;
                    iMin = Math.min(i11, I(recyclerView.C, recyclerView.G0) - 1);
                    if (iMin >= 0) {
                        this.f1849x = iMin;
                        this.f1850y = 0;
                        vVar = this.f1851z;
                        if (vVar != null) {
                            vVar.A = -1;
                        }
                        o0();
                        return true;
                    }
                }
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 >= 0) {
                    RecyclerView recyclerView2 = this.f2378b;
                    iMin = Math.min(i12, x(recyclerView2.C, recyclerView2.G0) - 1);
                    if (iMin >= 0) {
                        this.f1849x = iMin;
                        this.f1850y = 0;
                        vVar = this.f1851z;
                        if (vVar != null) {
                            vVar.A = -1;
                        }
                        o0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int j(b1 b1Var) {
        return F0(b1Var);
    }

    @Override
    public int k(b1 b1Var) {
        return G0(b1Var);
    }

    @Override
    public int l(b1 b1Var) {
        return H0(b1Var);
    }

    @Override
    public final int m(b1 b1Var) {
        return F0(b1Var);
    }

    @Override
    public int n(b1 b1Var) {
        return G0(b1Var);
    }

    @Override
    public int o(b1 b1Var) {
        return H0(b1Var);
    }

    @Override
    public int p0(int i10, v0 v0Var, b1 b1Var) {
        if (this.f1841p == 1) {
            return 0;
        }
        return b1(i10, v0Var, b1Var);
    }

    @Override
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iG = i10 - p0.G(u(0));
        if (iG >= 0 && iG < iV) {
            View viewU = u(iG);
            if (p0.G(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override
    public final void q0(int i10) {
        this.f1849x = i10;
        this.f1850y = Integer.MIN_VALUE;
        v vVar = this.f1851z;
        if (vVar != null) {
            vVar.A = -1;
        }
        o0();
    }

    @Override
    public q0 r() {
        return new q0(-2, -2);
    }

    @Override
    public int r0(int i10, v0 v0Var, b1 b1Var) {
        if (this.f1841p == 0) {
            return 0;
        }
        return b1(i10, v0Var, b1Var);
    }

    @Override
    public final boolean y0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
