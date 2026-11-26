package androidx.recyclerview.widget;

import a1.u0;
import a5.f;
import a5.g;
import a50.d;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ba.a1;
import ba.b1;
import ba.j1;
import ba.k1;
import ba.l1;
import ba.m1;
import ba.n;
import ba.n1;
import ba.o0;
import ba.p0;
import ba.q0;
import ba.r;
import ba.v0;
import ba.w;
import ba.y;
import g4.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import z4.j0;

public class StaggeredGridLayoutManager extends p0 implements a1 {
    public final u0 B;
    public final int C;
    public boolean D;
    public boolean E;
    public m1 F;
    public final Rect G;
    public final j1 H;
    public final boolean I;
    public int[] J;
    public final d K;

    public final int f1888p;

    public final n1[] f1889q;

    public final y f1890r;

    public final y f1891s;

    public final int f1892t;

    public int f1893u;

    public final r f1894v;

    public boolean f1895w;

    public final BitSet f1897y;

    public boolean f1896x = false;

    public int f1898z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1888p = -1;
        this.f1895w = false;
        u0 u0Var = new u0(8, false);
        this.B = u0Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new j1(this);
        this.I = true;
        this.K = new d(this, 4);
        o0 o0VarH = p0.H(context, attributeSet, i10, i11);
        int i12 = o0VarH.f2368a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f1892t) {
            this.f1892t = i12;
            y yVar = this.f1890r;
            this.f1890r = this.f1891s;
            this.f1891s = yVar;
            o0();
        }
        int i13 = o0VarH.f2369b;
        c(null);
        if (i13 != this.f1888p) {
            u0Var.v();
            o0();
            this.f1888p = i13;
            this.f1897y = new BitSet(this.f1888p);
            this.f1889q = new n1[this.f1888p];
            for (int i14 = 0; i14 < this.f1888p; i14++) {
                this.f1889q[i14] = new n1(this, i14);
            }
            o0();
        }
        boolean z10 = o0VarH.f2370c;
        c(null);
        m1 m1Var = this.F;
        if (m1Var != null && m1Var.H != z10) {
            m1Var.H = z10;
        }
        this.f1895w = z10;
        o0();
        r rVar = new r();
        rVar.f2400a = true;
        rVar.f2405f = 0;
        rVar.f2406g = 0;
        this.f1894v = rVar;
        this.f1890r = y.b(this, this.f1892t);
        this.f1891s = y.b(this, 1 - this.f1892t);
    }

    public static int d1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override
    public final void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext());
        wVar.f2445a = i10;
        B0(wVar);
    }

    @Override
    public final boolean C0() {
        return this.F == null;
    }

    public final boolean D0() {
        int iK0;
        if (v() != 0 && this.C != 0 && this.f2383g) {
            if (this.f1896x) {
                iK0 = L0();
                K0();
            } else {
                iK0 = K0();
                L0();
            }
            if (iK0 == 0 && P0() != null) {
                this.B.v();
                this.f2382f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return ze.d.o(b1Var, this.f1890r, H0(z10), G0(z10), this, this.I, this.f1896x);
    }

    public final int F0(v0 v0Var, r rVar, b1 b1Var) {
        n1 n1Var;
        ?? r10;
        int iH;
        int iE;
        int iM;
        int iE2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f1897y.set(0, this.f1888p, true);
        r rVar2 = this.f1894v;
        int i15 = rVar2.f2408i ? rVar.f2404e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f2404e == 1 ? rVar.f2406g + rVar.f2401b : rVar.f2405f - rVar.f2401b;
        int i16 = rVar.f2404e;
        for (int i17 = 0; i17 < this.f1888p; i17++) {
            if (!((ArrayList) this.f1889q[i17].f2361e).isEmpty()) {
                c1(this.f1889q[i17], i16, i15);
            }
        }
        int i18 = this.f1896x ? this.f1890r.i() : this.f1890r.m();
        boolean z10 = false;
        while (true) {
            int i19 = rVar.f2402c;
            if (i19 < 0 || i19 >= b1Var.b() || (!rVar2.f2408i && this.f1897y.isEmpty())) {
                break;
            }
            View viewE = v0Var.e(rVar.f2402c);
            rVar.f2402c += rVar.f2403d;
            k1 k1Var = (k1) viewE.getLayoutParams();
            int iB = k1Var.f2392a.b();
            u0 u0Var = this.B;
            int[] iArr = (int[]) u0Var.B;
            int i20 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i20 == -1) {
                if (T0(rVar.f2404e)) {
                    i12 = this.f1888p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f1888p;
                    i12 = i13;
                }
                n1 n1Var2 = null;
                if (rVar.f2404e == i14) {
                    int iM2 = this.f1890r.m();
                    int i21 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        n1 n1Var3 = this.f1889q[i12];
                        int iF = n1Var3.f(iM2);
                        if (iF < i21) {
                            i21 = iF;
                            n1Var2 = n1Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int i22 = this.f1890r.i();
                    int i23 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        n1 n1Var4 = this.f1889q[i12];
                        int iH2 = n1Var4.h(i22);
                        if (iH2 > i23) {
                            n1Var2 = n1Var4;
                            i23 = iH2;
                        }
                        i12 += i10;
                    }
                }
                n1Var = n1Var2;
                u0Var.A(iB);
                ((int[]) u0Var.B)[iB] = n1Var.f2360d;
            } else {
                n1Var = this.f1889q[i20];
            }
            k1Var.f2322e = n1Var;
            if (rVar.f2404e == 1) {
                r10 = 0;
                b(viewE, -1, false);
            } else {
                r10 = 0;
                b(viewE, 0, false);
            }
            if (this.f1892t == 1) {
                R0(viewE, p0.w(r10, this.f1893u, this.l, r10, ((ViewGroup.MarginLayoutParams) k1Var).width), p0.w(true, this.f2389o, this.m, C() + F(), ((ViewGroup.MarginLayoutParams) k1Var).height));
            } else {
                R0(viewE, p0.w(true, this.f2388n, this.l, E() + D(), ((ViewGroup.MarginLayoutParams) k1Var).width), p0.w(false, this.f1893u, this.m, 0, ((ViewGroup.MarginLayoutParams) k1Var).height));
            }
            if (rVar.f2404e == 1) {
                iE = n1Var.f(i18);
                iH = this.f1890r.e(viewE) + iE;
            } else {
                iH = n1Var.h(i18);
                iE = iH - this.f1890r.e(viewE);
            }
            if (rVar.f2404e == 1) {
                n1 n1Var5 = k1Var.f2322e;
                n1Var5.getClass();
                k1 k1Var2 = (k1) viewE.getLayoutParams();
                k1Var2.f2322e = n1Var5;
                ArrayList arrayList = (ArrayList) n1Var5.f2361e;
                arrayList.add(viewE);
                n1Var5.f2358b = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n1Var5.f2357a = Integer.MIN_VALUE;
                }
                if (k1Var2.f2392a.h() || k1Var2.f2392a.k()) {
                    n1Var5.f2359c = ((StaggeredGridLayoutManager) n1Var5.f2362f).f1890r.e(viewE) + n1Var5.f2359c;
                }
            } else {
                n1 n1Var6 = k1Var.f2322e;
                n1Var6.getClass();
                k1 k1Var3 = (k1) viewE.getLayoutParams();
                k1Var3.f2322e = n1Var6;
                ArrayList arrayList2 = (ArrayList) n1Var6.f2361e;
                arrayList2.add(0, viewE);
                n1Var6.f2357a = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n1Var6.f2358b = Integer.MIN_VALUE;
                }
                if (k1Var3.f2392a.h() || k1Var3.f2392a.k()) {
                    n1Var6.f2359c = ((StaggeredGridLayoutManager) n1Var6.f2362f).f1890r.e(viewE) + n1Var6.f2359c;
                }
            }
            if (Q0() && this.f1892t == 1) {
                iE2 = this.f1891s.i() - (((this.f1888p - 1) - n1Var.f2360d) * this.f1893u);
                iM = iE2 - this.f1891s.e(viewE);
            } else {
                iM = this.f1891s.m() + (n1Var.f2360d * this.f1893u);
                iE2 = this.f1891s.e(viewE) + iM;
            }
            if (this.f1892t == 1) {
                p0.N(viewE, iM, iE, iE2, iH);
            } else {
                p0.N(viewE, iE, iM, iH, iE2);
            }
            c1(n1Var, rVar2.f2404e, i15);
            V0(v0Var, rVar2);
            if (rVar2.f2407h && viewE.hasFocusable()) {
                this.f1897y.set(n1Var.f2360d, false);
            }
            i14 = 1;
            z10 = true;
            i13 = 0;
        }
        if (!z10) {
            V0(v0Var, rVar2);
        }
        int iM3 = rVar2.f2404e == -1 ? this.f1890r.m() - N0(this.f1890r.m()) : M0(this.f1890r.i()) - this.f1890r.i();
        if (iM3 > 0) {
            return Math.min(rVar.f2401b, iM3);
        }
        return 0;
    }

    public final View G0(boolean z10) {
        int iM = this.f1890r.m();
        int i10 = this.f1890r.i();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iG = this.f1890r.g(viewU);
            int iD = this.f1890r.d(viewU);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z10) {
        int iM = this.f1890r.m();
        int i10 = this.f1890r.i();
        int iV = v();
        View view = null;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            int iG = this.f1890r.g(viewU);
            if (this.f1890r.d(viewU) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    @Override
    public final int I(v0 v0Var, b1 b1Var) {
        if (this.f1892t == 0) {
            return Math.min(this.f1888p, b1Var.b());
        }
        return -1;
    }

    public final void I0(v0 v0Var, b1 b1Var, boolean z10) {
        int i10;
        int iM0 = M0(Integer.MIN_VALUE);
        if (iM0 != Integer.MIN_VALUE && (i10 = this.f1890r.i() - iM0) > 0) {
            int i11 = i10 - (-Z0(-i10, v0Var, b1Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f1890r.q(i11);
        }
    }

    public final void J0(v0 v0Var, b1 b1Var, boolean z10) {
        int iM;
        int iN0 = N0(Integer.MAX_VALUE);
        if (iN0 != Integer.MAX_VALUE && (iM = iN0 - this.f1890r.m()) > 0) {
            int iZ0 = iM - Z0(iM, v0Var, b1Var);
            if (!z10 || iZ0 <= 0) {
                return;
            }
            this.f1890r.q(-iZ0);
        }
    }

    @Override
    public final boolean K() {
        return this.C != 0;
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return p0.G(u(0));
    }

    @Override
    public final boolean L() {
        return this.f1895w;
    }

    public final int L0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return p0.G(u(iV - 1));
    }

    public final int M0(int i10) {
        int iF = this.f1889q[0].f(i10);
        for (int i11 = 1; i11 < this.f1888p; i11++) {
            int iF2 = this.f1889q[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int N0(int i10) {
        int iH = this.f1889q[0].h(i10);
        for (int i11 = 1; i11 < this.f1888p; i11++) {
            int iH2 = this.f1889q[i11].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override
    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f1888p; i11++) {
            n1 n1Var = this.f1889q[i11];
            int i12 = n1Var.f2357a;
            if (i12 != Integer.MIN_VALUE) {
                n1Var.f2357a = i12 + i10;
            }
            int i13 = n1Var.f2358b;
            if (i13 != Integer.MIN_VALUE) {
                n1Var.f2358b = i13 + i10;
            }
        }
    }

    public final void O0(int i10, int i11, int i12) {
        int i13;
        int i14;
        u0 u0Var;
        int[] iArr;
        int iL0;
        ArrayList arrayList;
        l1 l1Var;
        int size;
        int i15;
        int i16;
        int size2;
        int iL1 = this.f1896x ? L0() : K0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            u0Var = this.B;
            iArr = (int[]) u0Var.B;
            if (iArr != null && i14 < iArr.length) {
                arrayList = (ArrayList) u0Var.C;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                l1Var = null;
                                break;
                            }
                            l1Var = (l1) ((ArrayList) u0Var.C).get(size2);
                            if (l1Var.A == i14) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        l1Var = null;
                        break;
                    }
                    if (l1Var != null) {
                        ((ArrayList) u0Var.C).remove(l1Var);
                    }
                    size = ((ArrayList) u0Var.C).size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((l1) ((ArrayList) u0Var.C).get(i15)).A >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        l1 l1Var2 = (l1) ((ArrayList) u0Var.C).get(i15);
                        ((ArrayList) u0Var.C).remove(i15);
                        i16 = l1Var2.A;
                    } else {
                        i16 = -1;
                    }
                } else {
                    i16 = -1;
                }
                if (i16 == -1) {
                    int[] iArr2 = (int[]) u0Var.B;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = ((int[]) u0Var.B).length;
                } else {
                    Arrays.fill((int[]) u0Var.B, i14, Math.min(i16 + 1, ((int[]) u0Var.B).length), -1);
                }
            }
            if (i12 != 1) {
                u0Var.N(i10, i11);
            } else if (i12 != 2) {
                u0Var.O(i10, i11);
            } else if (i12 == 8) {
                u0Var.O(i10, 1);
                u0Var.N(i11, 1);
            }
            if (i13 <= iL1) {
                return;
            }
            if (this.f1896x) {
                iL0 = K0();
            } else {
                iL0 = L0();
            }
            if (i14 <= iL0) {
                o0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        u0Var = this.B;
        iArr = (int[]) u0Var.B;
        if (iArr != null) {
            arrayList = (ArrayList) u0Var.C;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            l1Var = null;
                            break;
                        }
                        l1Var = (l1) ((ArrayList) u0Var.C).get(size2);
                        if (l1Var.A == i14) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    l1Var = null;
                    break;
                }
                if (l1Var != null) {
                    ((ArrayList) u0Var.C).remove(l1Var);
                }
                size = ((ArrayList) u0Var.C).size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((l1) ((ArrayList) u0Var.C).get(i15)).A >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    l1 l1Var3 = (l1) ((ArrayList) u0Var.C).get(i15);
                    ((ArrayList) u0Var.C).remove(i15);
                    i16 = l1Var3.A;
                } else {
                    i16 = -1;
                }
            } else {
                i16 = -1;
            }
            if (i16 == -1) {
                int[] iArr3 = (int[]) u0Var.B;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = ((int[]) u0Var.B).length;
            } else {
                Arrays.fill((int[]) u0Var.B, i14, Math.min(i16 + 1, ((int[]) u0Var.B).length), -1);
            }
        }
        if (i12 != 1) {
            u0Var.N(i10, i11);
        } else if (i12 != 2) {
            u0Var.O(i10, i11);
        } else if (i12 == 8) {
            u0Var.O(i10, 1);
            u0Var.N(i11, 1);
        }
        if (i13 <= iL1) {
            return;
        }
        if (this.f1896x) {
            iL0 = K0();
        } else {
            iL0 = L0();
        }
        if (i14 <= iL0) {
            o0();
        }
    }

    @Override
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f1888p; i11++) {
            n1 n1Var = this.f1889q[i11];
            int i12 = n1Var.f2357a;
            if (i12 != Integer.MIN_VALUE) {
                n1Var.f2357a = i12 + i10;
            }
            int i13 = n1Var.f2358b;
            if (i13 != Integer.MIN_VALUE) {
                n1Var.f2358b = i13 + i10;
            }
        }
    }

    public final View P0() {
        boolean z10;
        boolean z11;
        int iV = v();
        int i10 = iV - 1;
        BitSet bitSet = new BitSet(this.f1888p);
        bitSet.set(0, this.f1888p, true);
        byte b7 = (this.f1892t == 1 && Q0()) ? (byte) 1 : (byte) -1;
        if (this.f1896x) {
            iV = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iV ? 1 : -1;
        while (i10 != iV) {
            View viewU = u(i10);
            k1 k1Var = (k1) viewU.getLayoutParams();
            if (bitSet.get(k1Var.f2322e.f2360d)) {
                n1 n1Var = k1Var.f2322e;
                if (this.f1896x) {
                    int i12 = n1Var.f2358b;
                    if (i12 == Integer.MIN_VALUE) {
                        n1Var.a();
                        i12 = n1Var.f2358b;
                    }
                    if (i12 < this.f1890r.i()) {
                        ((k1) ((View) c.d(1, (ArrayList) n1Var.f2361e)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i13 = n1Var.f2357a;
                    ArrayList arrayList = (ArrayList) n1Var.f2361e;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        k1 k1Var2 = (k1) view.getLayoutParams();
                        n1Var.f2357a = ((StaggeredGridLayoutManager) n1Var.f2362f).f1890r.g(view);
                        k1Var2.getClass();
                        i13 = n1Var.f2357a;
                    }
                    if (i13 > this.f1890r.m()) {
                        ((k1) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(k1Var.f2322e.f2360d);
            }
            i10 += i11;
            if (i10 != iV) {
                View viewU2 = u(i10);
                if (this.f1896x) {
                    int iD = this.f1890r.d(viewU);
                    int iD2 = this.f1890r.d(viewU2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (k1Var.f2322e.f2360d - ((k1) viewU2.getLayoutParams()).f2322e.f2360d < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (b7 < 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 != z11) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iG = this.f1890r.g(viewU);
                int iG2 = this.f1890r.g(viewU2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (k1Var.f2322e.f2360d - ((k1) viewU2.getLayoutParams()).f2322e.f2360d < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b7 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    @Override
    public final void Q() {
        this.B.v();
        for (int i10 = 0; i10 < this.f1888p; i10++) {
            this.f1889q[i10].b();
        }
    }

    public final boolean Q0() {
        return this.f2378b.getLayoutDirection() == 1;
    }

    public final void R0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f2378b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        k1 k1Var = (k1) view.getLayoutParams();
        int iD1 = d1(i10, ((ViewGroup.MarginLayoutParams) k1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) k1Var).rightMargin + rect.right);
        int iD2 = d1(i11, ((ViewGroup.MarginLayoutParams) k1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) k1Var).bottomMargin + rect.bottom);
        if (x0(view, iD1, iD2, k1Var)) {
            view.measure(iD1, iD2);
        }
    }

    @Override
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2378b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f1888p; i10++) {
            this.f1889q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(v0 v0Var, b1 b1Var, boolean z10) {
        boolean z11;
        m1 m1Var;
        int iV;
        int i10;
        int iG;
        int iG2;
        int iV2;
        int i11;
        boolean z12;
        m1 m1Var2 = this.F;
        j1 j1Var = this.H;
        if (!(m1Var2 == null && this.f1898z == -1) && b1Var.b() == 0) {
            j0(v0Var);
            j1Var.a();
            return;
        }
        boolean z13 = j1Var.f2317e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = j1Var.f2319g;
        boolean z14 = (z13 && this.f1898z == -1 && this.F == null) ? false : true;
        u0 u0Var = this.B;
        if (z14) {
            j1Var.a();
            m1 m1Var3 = this.F;
            if (m1Var3 != null) {
                int i12 = m1Var3.C;
                if (i12 > 0) {
                    if (i12 == this.f1888p) {
                        for (int i13 = 0; i13 < this.f1888p; i13++) {
                            this.f1889q[i13].b();
                            m1 m1Var4 = this.F;
                            int i14 = m1Var4.D[i13];
                            if (i14 != Integer.MIN_VALUE) {
                                i14 += m1Var4.I ? this.f1890r.i() : this.f1890r.m();
                            }
                            n1 n1Var = this.f1889q[i13];
                            n1Var.f2357a = i14;
                            n1Var.f2358b = i14;
                        }
                    } else {
                        m1Var3.D = null;
                        m1Var3.C = 0;
                        m1Var3.E = 0;
                        m1Var3.F = null;
                        m1Var3.G = null;
                        m1Var3.A = m1Var3.B;
                    }
                }
                m1 m1Var5 = this.F;
                this.E = m1Var5.J;
                boolean z15 = m1Var5.H;
                c(null);
                m1 m1Var6 = this.F;
                if (m1Var6 != null && m1Var6.H != z15) {
                    m1Var6.H = z15;
                }
                this.f1895w = z15;
                o0();
                Y0();
                m1 m1Var7 = this.F;
                int i15 = m1Var7.A;
                if (i15 != -1) {
                    this.f1898z = i15;
                    j1Var.f2315c = m1Var7.I;
                } else {
                    j1Var.f2315c = this.f1896x;
                }
                if (m1Var7.E > 1) {
                    u0Var.B = m1Var7.F;
                    u0Var.C = m1Var7.G;
                }
            } else {
                Y0();
                j1Var.f2315c = this.f1896x;
            }
            if (b1Var.f2244g || (i11 = this.f1898z) == -1) {
                if (this.D) {
                    int iB = b1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iG2 = 0;
                            break;
                        }
                        iG2 = p0.G(u(iV2));
                        if (iG2 < 0 && iG2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = b1Var.b();
                    iV = v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iV) {
                            iG2 = 0;
                            break;
                        }
                        iG = p0.G(u(i10));
                        if (iG < 0 && iG < iB2) {
                            iG2 = iG;
                            break;
                        }
                        i10++;
                    }
                }
                j1Var.f2313a = iG2;
                j1Var.f2314b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= b1Var.b()) {
                this.f1898z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = b1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iG2 = 0;
                            break;
                        } else {
                            iG2 = p0.G(u(iV2));
                            if (iG2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = b1Var.b();
                    iV = v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iV) {
                            iG2 = 0;
                            break;
                        } else {
                            iG = p0.G(u(i10));
                            if (iG < 0) {
                            }
                            i10++;
                        }
                    }
                }
                j1Var.f2313a = iG2;
                j1Var.f2314b = Integer.MIN_VALUE;
            } else {
                m1 m1Var8 = this.F;
                if (m1Var8 == null || m1Var8.A == -1 || m1Var8.C < 1) {
                    View viewQ = q(this.f1898z);
                    if (viewQ != null) {
                        j1Var.f2313a = this.f1896x ? L0() : K0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (j1Var.f2315c) {
                                j1Var.f2314b = (this.f1890r.i() - this.A) - this.f1890r.d(viewQ);
                            } else {
                                j1Var.f2314b = (this.f1890r.m() + this.A) - this.f1890r.g(viewQ);
                            }
                        } else if (this.f1890r.e(viewQ) > this.f1890r.n()) {
                            j1Var.f2314b = j1Var.f2315c ? this.f1890r.i() : this.f1890r.m();
                        } else {
                            int iG3 = this.f1890r.g(viewQ) - this.f1890r.m();
                            if (iG3 < 0) {
                                j1Var.f2314b = -iG3;
                            } else {
                                int i16 = this.f1890r.i() - this.f1890r.d(viewQ);
                                if (i16 < 0) {
                                    j1Var.f2314b = i16;
                                } else {
                                    j1Var.f2314b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i17 = this.f1898z;
                        j1Var.f2313a = i17;
                        int i18 = this.A;
                        if (i18 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i17 < K0()) != this.f1896x) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            } else if (this.f1896x) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            j1Var.f2315c = z12;
                            j1Var.f2314b = z12 ? staggeredGridLayoutManager.f1890r.i() : staggeredGridLayoutManager.f1890r.m();
                        } else if (j1Var.f2315c) {
                            j1Var.f2314b = staggeredGridLayoutManager.f1890r.i() - i18;
                        } else {
                            j1Var.f2314b = staggeredGridLayoutManager.f1890r.m() + i18;
                        }
                        j1Var.f2316d = true;
                    }
                } else {
                    j1Var.f2314b = Integer.MIN_VALUE;
                    j1Var.f2313a = this.f1898z;
                }
            }
            j1Var.f2317e = true;
        }
        if (this.F == null && this.f1898z == -1 && (j1Var.f2315c != this.D || Q0() != this.E)) {
            u0Var.v();
            j1Var.f2316d = true;
        }
        if (v() > 0 && ((m1Var = this.F) == null || m1Var.C < 1)) {
            if (j1Var.f2316d) {
                for (int i19 = 0; i19 < this.f1888p; i19++) {
                    this.f1889q[i19].b();
                    int i20 = j1Var.f2314b;
                    if (i20 != Integer.MIN_VALUE) {
                        n1 n1Var2 = this.f1889q[i19];
                        n1Var2.f2357a = i20;
                        n1Var2.f2358b = i20;
                    }
                }
            } else if (z14 || j1Var.f2318f == null) {
                for (int i21 = 0; i21 < this.f1888p; i21++) {
                    n1 n1Var3 = this.f1889q[i21];
                    boolean z16 = this.f1896x;
                    int i22 = j1Var.f2314b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) n1Var3.f2362f;
                    int iF = z16 ? n1Var3.f(Integer.MIN_VALUE) : n1Var3.h(Integer.MIN_VALUE);
                    n1Var3.b();
                    if (iF != Integer.MIN_VALUE && ((!z16 || iF >= staggeredGridLayoutManager2.f1890r.i()) && (z16 || iF <= staggeredGridLayoutManager2.f1890r.m()))) {
                        if (i22 != Integer.MIN_VALUE) {
                            iF += i22;
                        }
                        n1Var3.f2358b = iF;
                        n1Var3.f2357a = iF;
                    }
                }
                n1[] n1VarArr = this.f1889q;
                int length = n1VarArr.length;
                int[] iArr = j1Var.f2318f;
                if (iArr == null || iArr.length < length) {
                    j1Var.f2318f = new int[staggeredGridLayoutManager.f1889q.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    j1Var.f2318f[i23] = n1VarArr[i23].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i24 = 0; i24 < this.f1888p; i24++) {
                    n1 n1Var4 = this.f1889q[i24];
                    n1Var4.b();
                    int i25 = j1Var.f2318f[i24];
                    n1Var4.f2357a = i25;
                    n1Var4.f2358b = i25;
                }
            }
        }
        p(v0Var);
        r rVar = this.f1894v;
        rVar.f2400a = false;
        int iN = this.f1891s.n();
        this.f1893u = iN / this.f1888p;
        View.MeasureSpec.makeMeasureSpec(iN, this.f1891s.k());
        b1(j1Var.f2313a, b1Var);
        if (j1Var.f2315c) {
            a1(-1);
            F0(v0Var, rVar, b1Var);
            a1(1);
            rVar.f2402c = j1Var.f2313a + rVar.f2403d;
            F0(v0Var, rVar, b1Var);
        } else {
            a1(1);
            F0(v0Var, rVar, b1Var);
            a1(-1);
            rVar.f2402c = j1Var.f2313a + rVar.f2403d;
            F0(v0Var, rVar, b1Var);
        }
        if (this.f1891s.k() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i26 = 0; i26 < iV3; i26++) {
                View viewU = u(i26);
                float fE = this.f1891s.e(viewU);
                if (fE >= fMax) {
                    ((k1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i27 = this.f1893u;
            int iRound = Math.round(fMax * this.f1888p);
            if (this.f1891s.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1891s.n());
            }
            this.f1893u = iRound / this.f1888p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f1891s.k());
            if (this.f1893u != i27) {
                for (int i28 = 0; i28 < iV3; i28++) {
                    View viewU2 = u(i28);
                    k1 k1Var = (k1) viewU2.getLayoutParams();
                    k1Var.getClass();
                    if (Q0() && this.f1892t == 1) {
                        int i29 = -((this.f1888p - 1) - k1Var.f2322e.f2360d);
                        viewU2.offsetLeftAndRight((this.f1893u * i29) - (i29 * i27));
                    } else {
                        int i30 = k1Var.f2322e.f2360d;
                        int i31 = this.f1893u * i30;
                        int i32 = i30 * i27;
                        if (this.f1892t == 1) {
                            viewU2.offsetLeftAndRight(i31 - i32);
                        } else {
                            viewU2.offsetTopAndBottom(i31 - i32);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1896x) {
                I0(v0Var, b1Var, true);
                J0(v0Var, b1Var, false);
            } else {
                J0(v0Var, b1Var, true);
                I0(v0Var, b1Var, false);
            }
        }
        if (z10 && !b1Var.f2244g && this.C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.f2378b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z11 = D0();
        }
        if (b1Var.f2244g) {
            j1Var.a();
        }
        this.D = j1Var.f2315c;
        this.E = Q0();
        if (z11) {
            j1Var.a();
            S0(v0Var, b1Var, false);
        }
    }

    @Override
    public final View T(View view, int i10, v0 v0Var, b1 b1Var) {
        View viewD;
        int i11;
        if (v() != 0) {
            RecyclerView recyclerView = this.f2378b;
            if (recyclerView == null || (viewD = recyclerView.D(view)) == null || ((ArrayList) this.f2377a.E).contains(viewD)) {
                viewD = null;
            }
            if (viewD != null) {
                Y0();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 == 66 ? this.f1892t == 0 : !(i10 != 130 || this.f1892t != 1)) {
                                    i11 = 1;
                                }
                            } else if (this.f1892t == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else if (this.f1892t == 0) {
                            i11 = -1;
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (this.f1892t != 1 && Q0()) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                } else if (this.f1892t != 1 && Q0()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                if (i11 != Integer.MIN_VALUE) {
                    k1 k1Var = (k1) viewD.getLayoutParams();
                    k1Var.getClass();
                    n1 n1Var = k1Var.f2322e;
                    int iL0 = i11 == 1 ? L0() : K0();
                    b1(iL0, b1Var);
                    a1(i11);
                    r rVar = this.f1894v;
                    rVar.f2402c = rVar.f2403d + iL0;
                    rVar.f2401b = (int) (this.f1890r.n() * 0.33333334f);
                    rVar.f2407h = true;
                    rVar.f2400a = false;
                    F0(v0Var, rVar, b1Var);
                    this.D = this.f1896x;
                    View viewG = n1Var.g(iL0, i11);
                    if (viewG != null && viewG != viewD) {
                        return viewG;
                    }
                    if (T0(i11)) {
                        for (int i12 = this.f1888p - 1; i12 >= 0; i12--) {
                            View viewG2 = this.f1889q[i12].g(iL0, i11);
                            if (viewG2 != null && viewG2 != viewD) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f1888p; i13++) {
                            View viewG3 = this.f1889q[i13].g(iL0, i11);
                            if (viewG3 != null && viewG3 != viewD) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z10 = (this.f1895w ^ true) == (i11 == -1);
                    View viewQ = q(z10 ? n1Var.c() : n1Var.d());
                    if (viewQ != null && viewQ != viewD) {
                        return viewQ;
                    }
                    if (T0(i11)) {
                        for (int i14 = this.f1888p - 1; i14 >= 0; i14--) {
                            if (i14 != n1Var.f2360d) {
                                View viewQ2 = q(z10 ? this.f1889q[i14].c() : this.f1889q[i14].d());
                                if (viewQ2 != null && viewQ2 != viewD) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.f1888p; i15++) {
                            View viewQ3 = q(z10 ? this.f1889q[i15].c() : this.f1889q[i15].d());
                            if (viewQ3 != null && viewQ3 != viewD) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean T0(int i10) {
        if (this.f1892t == 0) {
            return (i10 == -1) != this.f1896x;
        }
        return ((i10 == -1) == this.f1896x) == Q0();
    }

    @Override
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewH0 = H0(false);
            View viewG0 = G0(false);
            if (viewH0 == null || viewG0 == null) {
                return;
            }
            int iG = p0.G(viewH0);
            int iG2 = p0.G(viewG0);
            if (iG < iG2) {
                accessibilityEvent.setFromIndex(iG);
                accessibilityEvent.setToIndex(iG2);
            } else {
                accessibilityEvent.setFromIndex(iG2);
                accessibilityEvent.setToIndex(iG);
            }
        }
    }

    public final void U0(int i10, b1 b1Var) {
        int iK0;
        int i11;
        if (i10 > 0) {
            iK0 = L0();
            i11 = 1;
        } else {
            iK0 = K0();
            i11 = -1;
        }
        r rVar = this.f1894v;
        rVar.f2400a = true;
        b1(iK0, b1Var);
        a1(i11);
        rVar.f2402c = iK0 + rVar.f2403d;
        rVar.f2401b = Math.abs(i10);
    }

    @Override
    public final void V(v0 v0Var, b1 b1Var, g gVar) {
        super.V(v0Var, b1Var, gVar);
        gVar.g("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(v0 v0Var, r rVar) {
        int iMin;
        if (!rVar.f2400a || rVar.f2408i) {
            return;
        }
        if (rVar.f2401b == 0) {
            if (rVar.f2404e == -1) {
                W0(v0Var, rVar.f2406g);
                return;
            } else {
                X0(v0Var, rVar.f2405f);
                return;
            }
        }
        int i10 = 1;
        if (rVar.f2404e == -1) {
            int i11 = rVar.f2405f;
            int iH = this.f1889q[0].h(i11);
            while (i10 < this.f1888p) {
                int iH2 = this.f1889q[i10].h(i11);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i10++;
            }
            int i12 = i11 - iH;
            W0(v0Var, i12 < 0 ? rVar.f2406g : rVar.f2406g - Math.min(i12, rVar.f2401b));
            return;
        }
        int i13 = rVar.f2406g;
        int iF = this.f1889q[0].f(i13);
        while (i10 < this.f1888p) {
            int iF2 = this.f1889q[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - rVar.f2406g;
        if (i14 < 0) {
            iMin = rVar.f2405f;
        } else {
            iMin = Math.min(i14, rVar.f2401b) + rVar.f2405f;
        }
        X0(v0Var, iMin);
    }

    public final void W0(v0 v0Var, int i10) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1890r.g(viewU) < i10 || this.f1890r.p(viewU) < i10) {
                return;
            }
            k1 k1Var = (k1) viewU.getLayoutParams();
            k1Var.getClass();
            if (((ArrayList) k1Var.f2322e.f2361e).size() == 1) {
                return;
            }
            n1 n1Var = k1Var.f2322e;
            ArrayList arrayList = (ArrayList) n1Var.f2361e;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            k1 k1Var2 = (k1) view.getLayoutParams();
            k1Var2.f2322e = null;
            if (k1Var2.f2392a.h() || k1Var2.f2392a.k()) {
                n1Var.f2359c -= ((StaggeredGridLayoutManager) n1Var.f2362f).f1890r.e(view);
            }
            if (size == 1) {
                n1Var.f2357a = Integer.MIN_VALUE;
            }
            n1Var.f2358b = Integer.MIN_VALUE;
            l0(viewU, v0Var);
        }
    }

    @Override
    public final void X(v0 v0Var, b1 b1Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k1)) {
            W(view, gVar);
            return;
        }
        k1 k1Var = (k1) layoutParams;
        if (this.f1892t == 0) {
            n1 n1Var = k1Var.f2322e;
            gVar.i(f.a(false, n1Var == null ? -1 : n1Var.f2360d, 1, -1, -1));
        } else {
            n1 n1Var2 = k1Var.f2322e;
            gVar.i(f.a(false, -1, -1, n1Var2 == null ? -1 : n1Var2.f2360d, 1));
        }
    }

    public final void X0(v0 v0Var, int i10) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1890r.d(viewU) > i10 || this.f1890r.o(viewU) > i10) {
                return;
            }
            k1 k1Var = (k1) viewU.getLayoutParams();
            k1Var.getClass();
            if (((ArrayList) k1Var.f2322e.f2361e).size() == 1) {
                return;
            }
            n1 n1Var = k1Var.f2322e;
            ArrayList arrayList = (ArrayList) n1Var.f2361e;
            View view = (View) arrayList.remove(0);
            k1 k1Var2 = (k1) view.getLayoutParams();
            k1Var2.f2322e = null;
            if (arrayList.size() == 0) {
                n1Var.f2358b = Integer.MIN_VALUE;
            }
            if (k1Var2.f2392a.h() || k1Var2.f2392a.k()) {
                n1Var.f2359c -= ((StaggeredGridLayoutManager) n1Var.f2362f).f1890r.e(view);
            }
            n1Var.f2357a = Integer.MIN_VALUE;
            l0(viewU, v0Var);
        }
    }

    @Override
    public final void Y(int i10, int i11) {
        O0(i10, i11, 1);
    }

    public final void Y0() {
        if (this.f1892t == 1 || !Q0()) {
            this.f1896x = this.f1895w;
        } else {
            this.f1896x = !this.f1895w;
        }
    }

    @Override
    public final void Z() {
        this.B.v();
        o0();
    }

    public final int Z0(int i10, v0 v0Var, b1 b1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        U0(i10, b1Var);
        r rVar = this.f1894v;
        int iF0 = F0(v0Var, rVar, b1Var);
        if (rVar.f2401b >= iF0) {
            i10 = i10 < 0 ? -iF0 : iF0;
        }
        this.f1890r.q(-i10);
        this.D = this.f1896x;
        rVar.f2401b = 0;
        V0(v0Var, rVar);
        return i10;
    }

    @Override
    public final PointF a(int i10) {
        int i11 = -1;
        if (v() != 0) {
            if ((i10 < K0()) == this.f1896x) {
                i11 = 1;
            }
        } else if (this.f1896x) {
            i11 = 1;
        }
        PointF pointF = new PointF();
        if (i11 == 0) {
            return null;
        }
        if (this.f1892t == 0) {
            pointF.x = i11;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i11;
        return pointF;
    }

    @Override
    public final void a0(int i10, int i11) {
        O0(i10, i11, 8);
    }

    public final void a1(int i10) {
        r rVar = this.f1894v;
        rVar.f2404e = i10;
        rVar.f2403d = this.f1896x != (i10 == -1) ? -1 : 1;
    }

    @Override
    public final void b0(int i10, int i11) {
        O0(i10, i11, 2);
    }

    public final void b1(int i10, b1 b1Var) {
        int iN;
        int iN2;
        int i11;
        r rVar = this.f1894v;
        boolean z10 = false;
        rVar.f2401b = 0;
        rVar.f2402c = i10;
        w wVar = this.f2381e;
        if (wVar == null || !wVar.f2449e || (i11 = b1Var.f2238a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f1896x == (i11 < i10)) {
                iN = this.f1890r.n();
                iN2 = 0;
            } else {
                iN2 = this.f1890r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView == null || !recyclerView.H) {
            rVar.f2406g = this.f1890r.h() + iN;
            rVar.f2405f = -iN2;
        } else {
            rVar.f2405f = this.f1890r.m() - iN2;
            rVar.f2406g = this.f1890r.i() + iN;
        }
        rVar.f2407h = false;
        rVar.f2400a = true;
        if (this.f1890r.k() == 0 && this.f1890r.h() == 0) {
            z10 = true;
        }
        rVar.f2408i = z10;
    }

    @Override
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override
    public final void c0(int i10, int i11) {
        O0(i10, i11, 4);
    }

    public final void c1(n1 n1Var, int i10, int i11) {
        int i12 = n1Var.f2359c;
        int i13 = n1Var.f2360d;
        if (i10 != -1) {
            int i14 = n1Var.f2358b;
            if (i14 == Integer.MIN_VALUE) {
                n1Var.a();
                i14 = n1Var.f2358b;
            }
            if (i14 - i12 >= i11) {
                this.f1897y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = n1Var.f2357a;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) n1Var.f2361e).get(0);
            k1 k1Var = (k1) view.getLayoutParams();
            n1Var.f2357a = ((StaggeredGridLayoutManager) n1Var.f2362f).f1890r.g(view);
            k1Var.getClass();
            i15 = n1Var.f2357a;
        }
        if (i15 + i12 <= i11) {
            this.f1897y.set(i13, false);
        }
    }

    @Override
    public final boolean d() {
        return this.f1892t == 0;
    }

    @Override
    public final void d0(v0 v0Var, b1 b1Var) {
        S0(v0Var, b1Var, true);
    }

    @Override
    public final boolean e() {
        return this.f1892t == 1;
    }

    @Override
    public final void e0(b1 b1Var) {
        this.f1898z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override
    public final boolean f(q0 q0Var) {
        return q0Var instanceof k1;
    }

    @Override
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof m1) {
            m1 m1Var = (m1) parcelable;
            this.F = m1Var;
            if (this.f1898z != -1) {
                m1Var.A = -1;
                m1Var.B = -1;
                m1Var.D = null;
                m1Var.C = 0;
                m1Var.E = 0;
                m1Var.F = null;
                m1Var.G = null;
            }
            o0();
        }
    }

    @Override
    public final Parcelable g0() {
        int iH;
        int iM;
        int[] iArr;
        m1 m1Var = this.F;
        if (m1Var != null) {
            m1 m1Var2 = new m1();
            m1Var2.C = m1Var.C;
            m1Var2.A = m1Var.A;
            m1Var2.B = m1Var.B;
            m1Var2.D = m1Var.D;
            m1Var2.E = m1Var.E;
            m1Var2.F = m1Var.F;
            m1Var2.H = m1Var.H;
            m1Var2.I = m1Var.I;
            m1Var2.J = m1Var.J;
            m1Var2.G = m1Var.G;
            return m1Var2;
        }
        m1 m1Var3 = new m1();
        m1Var3.H = this.f1895w;
        m1Var3.I = this.D;
        m1Var3.J = this.E;
        u0 u0Var = this.B;
        if (u0Var == null || (iArr = (int[]) u0Var.B) == null) {
            m1Var3.E = 0;
        } else {
            m1Var3.F = iArr;
            m1Var3.E = iArr.length;
            m1Var3.G = (ArrayList) u0Var.C;
        }
        if (v() <= 0) {
            m1Var3.A = -1;
            m1Var3.B = -1;
            m1Var3.C = 0;
            return m1Var3;
        }
        m1Var3.A = this.D ? L0() : K0();
        View viewG0 = this.f1896x ? G0(true) : H0(true);
        m1Var3.B = viewG0 != null ? p0.G(viewG0) : -1;
        int i10 = this.f1888p;
        m1Var3.C = i10;
        m1Var3.D = new int[i10];
        for (int i11 = 0; i11 < this.f1888p; i11++) {
            if (this.D) {
                iH = this.f1889q[i11].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1890r.i();
                    iH -= iM;
                }
            } else {
                iH = this.f1889q[i11].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1890r.m();
                    iH -= iM;
                }
            }
            m1Var3.D[i11] = iH;
        }
        return m1Var3;
    }

    @Override
    public final void h(int i10, int i11, b1 b1Var, n nVar) {
        r rVar;
        int iF;
        int iH;
        if (this.f1892t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        U0(i10, b1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1888p) {
            this.J = new int[this.f1888p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f1888p;
            rVar = this.f1894v;
            if (i12 >= i14) {
                break;
            }
            if (rVar.f2403d == -1) {
                iF = rVar.f2405f;
                iH = this.f1889q[i12].h(iF);
            } else {
                iF = this.f1889q[i12].f(rVar.f2406g);
                iH = rVar.f2406g;
            }
            int i15 = iF - iH;
            if (i15 >= 0) {
                this.J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = rVar.f2402c;
            if (i17 < 0 || i17 >= b1Var.b()) {
                return;
            }
            nVar.b(rVar.f2402c, this.J[i16]);
            rVar.f2402c += rVar.f2403d;
        }
    }

    @Override
    public final void h0(int i10) {
        if (i10 == 0) {
            D0();
        }
    }

    @Override
    public final int j(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return ze.d.n(b1Var, this.f1890r, H0(z10), G0(z10), this, this.I);
    }

    @Override
    public final int k(b1 b1Var) {
        return E0(b1Var);
    }

    @Override
    public final int l(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return ze.d.p(b1Var, this.f1890r, H0(z10), G0(z10), this, this.I);
    }

    @Override
    public final int m(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return ze.d.n(b1Var, this.f1890r, H0(z10), G0(z10), this, this.I);
    }

    @Override
    public final int n(b1 b1Var) {
        return E0(b1Var);
    }

    @Override
    public final int o(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return ze.d.p(b1Var, this.f1890r, H0(z10), G0(z10), this, this.I);
    }

    @Override
    public final int p0(int i10, v0 v0Var, b1 b1Var) {
        return Z0(i10, v0Var, b1Var);
    }

    @Override
    public final void q0(int i10) {
        m1 m1Var = this.F;
        if (m1Var != null && m1Var.A != i10) {
            m1Var.D = null;
            m1Var.C = 0;
            m1Var.A = -1;
            m1Var.B = -1;
        }
        this.f1898z = i10;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override
    public final q0 r() {
        return this.f1892t == 0 ? new k1(-2, -1) : new k1(-1, -2);
    }

    @Override
    public final int r0(int i10, v0 v0Var, b1 b1Var) {
        return Z0(i10, v0Var, b1Var);
    }

    @Override
    public final q0 s(Context context, AttributeSet attributeSet) {
        return new k1(context, attributeSet);
    }

    @Override
    public final q0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k1((ViewGroup.MarginLayoutParams) layoutParams) : new k1(layoutParams);
    }

    @Override
    public final void u0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iE = E() + D();
        int iC = C() + F();
        int i12 = this.f1892t;
        int i13 = this.f1888p;
        if (i12 == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.f2378b;
            WeakHashMap weakHashMap = j0.f17198a;
            iG2 = p0.g(i11, iHeight, recyclerView.getMinimumHeight());
            iG = p0.g(i10, (this.f1893u * i13) + iE, this.f2378b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.f2378b;
            WeakHashMap weakHashMap2 = j0.f17198a;
            iG = p0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            iG2 = p0.g(i11, (this.f1893u * i13) + iC, this.f2378b.getMinimumHeight());
        }
        this.f2378b.setMeasuredDimension(iG, iG2);
    }

    @Override
    public final int x(v0 v0Var, b1 b1Var) {
        if (this.f1892t == 1) {
            return Math.min(this.f1888p, b1Var.b());
        }
        return -1;
    }
}
