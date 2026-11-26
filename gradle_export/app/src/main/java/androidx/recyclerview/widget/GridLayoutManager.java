package androidx.recyclerview.widget;

import a5.c;
import a5.f;
import a5.g;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import ba.b1;
import ba.f1;
import ba.g0;
import ba.n;
import ba.p0;
import ba.q;
import ba.q0;
import ba.s;
import ba.t;
import ba.u;
import ba.v;
import ba.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l9.f0;
import oi.k;
import z4.j0;

public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final f0 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new f0(7);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new f0(7);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(p0.H(context, attributeSet, i10, i11).f2369b);
    }

    @Override
    public final boolean C0() {
        return this.f1851z == null && !this.E;
    }

    @Override
    public final void E0(b1 b1Var, u uVar, n nVar) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = uVar.f2426d) >= 0 && i10 < b1Var.b() && i11 > 0; i12++) {
            nVar.b(uVar.f2426d, Math.max(0, uVar.f2429g));
            this.K.getClass();
            i11--;
            uVar.f2426d += uVar.f2427e;
        }
    }

    @Override
    public final int I(v0 v0Var, b1 b1Var) {
        if (this.f1841p == 0) {
            return Math.min(this.F, B());
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return o1(b1Var.b() - 1, v0Var, b1Var) + 1;
    }

    @Override
    public final View Q0(v0 v0Var, b1 b1Var, boolean z10, boolean z11) {
        int i10;
        int iV;
        int iV2 = v();
        int i11 = 1;
        if (z11) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
        }
        int iB = b1Var.b();
        J0();
        int iM = this.f1843r.m();
        int i12 = this.f1843r.i();
        View view = null;
        View view2 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iG = p0.G(viewU);
            if (iG >= 0 && iG < iB && p1(iG, v0Var, b1Var) == 0) {
                if (((q0) viewU.getLayoutParams()).f2392a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1843r.g(viewU) < i12 && this.f1843r.d(viewU) >= iM) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i11;
        }
        return view != null ? view : view2;
    }

    @Override
    public final android.view.View T(android.view.View r23, int r24, ba.v0 r25, ba.b1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, ba.v0, ba.b1):android.view.View");
    }

    @Override
    public final void V(v0 v0Var, b1 b1Var, g gVar) {
        super.V(v0Var, b1Var, gVar);
        gVar.g(GridView.class.getName());
        g0 g0Var = this.f2378b.M;
        if (g0Var == null || g0Var.getItemCount() <= 1) {
            return;
        }
        gVar.b(c.f182r);
    }

    @Override
    public final void W0(v0 v0Var, b1 b1Var, u uVar, t tVar) {
        int i10;
        int i11;
        int i12;
        int iF;
        int iD;
        int iF2;
        int iW;
        int iW2;
        ?? r12;
        int i13;
        View viewB;
        int iL = this.f1843r.l();
        boolean z10 = iL != 1073741824;
        int i14 = v() > 0 ? this.G[this.F] : 0;
        if (z10) {
            t1();
        }
        boolean z11 = uVar.f2427e == 1;
        int iP1 = this.F;
        if (!z11) {
            iP1 = p1(uVar.f2426d, v0Var, b1Var) + q1(uVar.f2426d, v0Var, b1Var);
        }
        int i15 = 0;
        while (i15 < this.F && (i13 = uVar.f2426d) >= 0 && i13 < b1Var.b() && iP1 > 0) {
            int i16 = uVar.f2426d;
            int iQ1 = q1(i16, v0Var, b1Var);
            if (iQ1 > this.F) {
                throw new IllegalArgumentException(g4.c.g(this.F, " spans.", k.p(i16, iQ1, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iP1 -= iQ1;
            if (iP1 < 0 || (viewB = uVar.b(v0Var)) == null) {
                break;
            }
            this.H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            tVar.f2415a = true;
            return;
        }
        if (z11) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.H[i10];
            q qVar = (q) view.getLayoutParams();
            int iQ2 = q1(p0.G(view), v0Var, b1Var);
            qVar.f2391f = iQ2;
            qVar.f2390e = i17;
            i17 += iQ2;
            i10 += i12;
        }
        float f3 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.H[i19];
            if (uVar.f2433k != null) {
                r12 = 0;
                r12 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z11) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f2378b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            r1(view2, iL, r12);
            int iE = this.f1843r.e(view2);
            if (iE > i18) {
                i18 = iE;
            }
            float f10 = (this.f1843r.f(view2) * 1.0f) / ((q) view2.getLayoutParams()).f2391f;
            if (f10 > f3) {
                f3 = f10;
            }
        }
        if (z10) {
            h1(Math.max(Math.round(f3 * this.F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.H[i20];
                r1(view3, 1073741824, true);
                int iE2 = this.f1843r.e(view3);
                if (iE2 > i18) {
                    i18 = iE2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.H[i21];
            if (this.f1843r.e(view4) != i18) {
                q qVar2 = (q) view4.getLayoutParams();
                Rect rect2 = qVar2.f2393b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar2).topMargin + ((ViewGroup.MarginLayoutParams) qVar2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) qVar2).leftMargin + ((ViewGroup.MarginLayoutParams) qVar2).rightMargin;
                int iN1 = n1(qVar2.f2390e, qVar2.f2391f);
                if (this.f1841p == 1) {
                    iW2 = p0.w(false, iN1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) qVar2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iW = p0.w(false, iN1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) qVar2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (z0(view4, iW2, iW, (q0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        int iF3 = 0;
        tVar.f2418d = i18;
        if (this.f1841p != 1) {
            if (uVar.f2428f == -1) {
                int i24 = uVar.f2424b;
                iD = i24 - i18;
                iF = i24;
            } else {
                int i25 = uVar.f2424b;
                iF = i25 + i18;
                iD = i25;
            }
            iF2 = iF3;
        } else if (uVar.f2428f == -1) {
            iF2 = uVar.f2424b;
            iF3 = iF2 - i18;
            iD = 0;
            iF = 0;
        } else {
            int i26 = uVar.f2424b;
            iF = 0;
            iF3 = i26;
            iF2 = i26 + i18;
            iD = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.H[i27];
            q qVar3 = (q) view5.getLayoutParams();
            if (this.f1841p != 1) {
                iF3 = F() + this.G[qVar3.f2390e];
                iF2 = this.f1843r.f(view5) + iF3;
            } else if (V0()) {
                int iD2 = D() + this.G[this.F - qVar3.f2390e];
                iF = iD2;
                iD = iD2 - this.f1843r.f(view5);
            } else {
                iD = D() + this.G[qVar3.f2390e];
                iF = this.f1843r.f(view5) + iD;
            }
            p0.N(view5, iD, iF3, iF, iF2);
            if (qVar3.f2392a.h() || qVar3.f2392a.k()) {
                tVar.f2416b = true;
            }
            tVar.f2417c = view5.hasFocusable() | tVar.f2417c;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override
    public final void X(v0 v0Var, b1 b1Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof q)) {
            W(view, gVar);
            return;
        }
        q qVar = (q) layoutParams;
        int iO1 = o1(qVar.f2392a.b(), v0Var, b1Var);
        if (this.f1841p == 0) {
            gVar.i(f.a(false, qVar.f2390e, qVar.f2391f, iO1, 1));
        } else {
            gVar.i(f.a(false, iO1, 1, qVar.f2390e, qVar.f2391f));
        }
    }

    @Override
    public final void X0(v0 v0Var, b1 b1Var, s sVar, int i10) {
        t1();
        if (b1Var.b() > 0 && !b1Var.f2244g) {
            boolean z10 = i10 == 1;
            int iP1 = p1(sVar.f2410b, v0Var, b1Var);
            if (z10) {
                while (iP1 > 0) {
                    int i11 = sVar.f2410b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    sVar.f2410b = i12;
                    iP1 = p1(i12, v0Var, b1Var);
                }
            } else {
                int iB = b1Var.b() - 1;
                int i13 = sVar.f2410b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iP2 = p1(i14, v0Var, b1Var);
                    if (iP2 <= iP1) {
                        break;
                    }
                    i13 = i14;
                    iP1 = iP2;
                }
                sVar.f2410b = i13;
            }
        }
        i1();
    }

    @Override
    public final void Y(int i10, int i11) {
        f0 f0Var = this.K;
        f0Var.m();
        ((SparseIntArray) f0Var.C).clear();
    }

    @Override
    public final void Z() {
        f0 f0Var = this.K;
        f0Var.m();
        ((SparseIntArray) f0Var.C).clear();
    }

    @Override
    public final void a0(int i10, int i11) {
        f0 f0Var = this.K;
        f0Var.m();
        ((SparseIntArray) f0Var.C).clear();
    }

    @Override
    public final void b0(int i10, int i11) {
        f0 f0Var = this.K;
        f0Var.m();
        ((SparseIntArray) f0Var.C).clear();
    }

    @Override
    public final void c0(int i10, int i11) {
        f0 f0Var = this.K;
        f0Var.m();
        ((SparseIntArray) f0Var.C).clear();
    }

    @Override
    public final void d0(v0 v0Var, b1 b1Var) {
        boolean z10 = b1Var.f2244g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                q qVar = (q) u(i10).getLayoutParams();
                int iB = qVar.f2392a.b();
                sparseIntArray2.put(iB, qVar.f2391f);
                sparseIntArray.put(iB, qVar.f2390e);
            }
        }
        super.d0(v0Var, b1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void d1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d1(false);
    }

    @Override
    public final void e0(b1 b1Var) {
        View viewQ;
        super.e0(b1Var);
        this.E = false;
        int i10 = this.M;
        if (i10 == -1 || (viewQ = q(i10)) == null) {
            return;
        }
        viewQ.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override
    public final boolean f(q0 q0Var) {
        return q0Var instanceof q;
    }

    public final void h1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    @Override
    public final boolean i0(int i10, Bundle bundle) {
        View viewU;
        f1 f1VarL;
        int iIntValue;
        int i11;
        TreeMap treeMap;
        int i12;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i13;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i10 == c.f182r.a() && i10 != -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= v()) {
                    viewU = null;
                    break;
                }
                View viewU2 = u(i14);
                Objects.requireNonNull(viewU2);
                if (viewU2.isAccessibilityFocused()) {
                    viewU = u(i14);
                    break;
                }
                i14++;
            }
            if (viewU != null && bundle != null) {
                int i15 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i15)) && (f1VarL = this.f2378b.L(viewU)) != null) {
                    RecyclerView recyclerView = f1VarL.f2290r;
                    int iJ = recyclerView == null ? -1 : recyclerView.J(f1VarL);
                    int iK1 = k1(iJ);
                    int iJ1 = j1(iJ);
                    if (iK1 >= 0 && iJ1 >= 0) {
                        if (!l1(iJ).contains(Integer.valueOf(this.N)) || !m1(j1(iJ), iJ).contains(Integer.valueOf(this.O))) {
                            this.N = iK1;
                            this.O = iJ1;
                        }
                        int i16 = this.N;
                        if (i16 == -1) {
                            i16 = iK1;
                        }
                        int i17 = this.O;
                        if (i17 != -1) {
                            iJ1 = i17;
                        }
                        if (i15 == 17) {
                            iIntValue = iJ - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iK2 = k1(iIntValue);
                                    int iJ2 = j1(iIntValue);
                                    if (iK2 >= 0 && iJ2 >= 0) {
                                        if (this.f1841p != 1) {
                                            if (l1(iIntValue).contains(Integer.valueOf(i16)) && iJ2 < iJ1) {
                                                this.O = iJ2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iK2 == i16 && iJ2 < iJ1) || iK2 < i16) {
                                                this.N = iK2;
                                                this.O = iJ2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < B()) {
                                                    it2 = l1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < B()) {
                                                it4 = l1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 33) {
                            iIntValue = iJ - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iK3 = k1(iIntValue);
                                    int iJ3 = j1(iIntValue);
                                    if (iK3 >= 0 && iJ3 >= 0) {
                                        if (this.f1841p != 1) {
                                            if (iK3 < i16 && iJ3 == iJ1) {
                                                this.N = ((Integer) Collections.max(l1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iK3 < i16 && m1(j1(iIntValue), iIntValue).contains(Integer.valueOf(iJ1))) {
                                                this.N = iK3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < B()) {
                                                    it2 = l1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < B()) {
                                                it4 = l1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 66) {
                            iIntValue = iJ + 1;
                            while (true) {
                                if (iIntValue < B()) {
                                    int iK4 = k1(iIntValue);
                                    int iJ4 = j1(iIntValue);
                                    if (iK4 >= 0 && iJ4 >= 0) {
                                        if (this.f1841p != 1) {
                                            if (iJ4 > iJ1 && l1(iIntValue).contains(Integer.valueOf(i16))) {
                                                this.O = iJ4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iK4 == i16 && iJ4 > iJ1) || iK4 > i16) {
                                                this.N = iK4;
                                                this.O = iJ4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iK1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < B()) {
                                                    it2 = l1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iK1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break;
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                } else {
                                    if (iK1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < B()) {
                                                it4 = l1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iK1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = j1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                    iIntValue = -1;
                                    break;
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 130) {
                            iIntValue = iJ + 1;
                            while (true) {
                                if (iIntValue < B()) {
                                    int iK5 = k1(iIntValue);
                                    int iJ5 = j1(iIntValue);
                                    if (iK5 >= 0 && iJ5 >= 0) {
                                        if (this.f1841p != 1) {
                                            if (iK5 > i16 && iJ5 == iJ1) {
                                                this.N = k1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iK5 > i16 && (iJ5 == iJ1 || m1(j1(iIntValue), iIntValue).contains(Integer.valueOf(iJ1)))) {
                                                this.N = iK5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i11 = this.f1841p) == 0) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iK1 < 0 || i11 == 1) {
                                            iIntValue = -1;
                                            break;
                                        }
                                        treeMap = new TreeMap();
                                        i12 = 0;
                                        loop5: while (true) {
                                            if (i12 < B()) {
                                                it2 = l1(i12).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i12));
                                                            }
                                                        }
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iK1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.N = iIntValue2;
                                                            this.O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break;
                                        }
                                    }
                                } else {
                                    if (iK1 < 0 || i11 == 1) {
                                        iIntValue = -1;
                                        break;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i13 = 0;
                                    loop2: while (true) {
                                        if (i13 < B()) {
                                            it4 = l1(i13).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i13));
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iK1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = iIntValue3;
                                                        this.O = j1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                q0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i10 != 16908343 || bundle == null) {
                return super.i0(i10, bundle);
            }
            int i18 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i19 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i18 != -1 && i19 != -1) {
                int itemCount = this.f2378b.M.getItemCount();
                int i20 = 0;
                while (true) {
                    if (i20 >= itemCount) {
                        i20 = -1;
                        break;
                    }
                    RecyclerView recyclerView2 = this.f2378b;
                    int iP1 = p1(i20, recyclerView2.C, recyclerView2.G0);
                    RecyclerView recyclerView3 = this.f2378b;
                    int iO1 = o1(i20, recyclerView3.C, recyclerView3.G0);
                    if (this.f1841p != 1) {
                        if (iP1 == i18 && iO1 == i19) {
                            break;
                        }
                        i20++;
                    } else {
                        if (iP1 == i19 && iO1 == i18) {
                            break;
                        }
                        i20++;
                    }
                }
                if (i20 > -1) {
                    this.f1849x = i20;
                    this.f1850y = 0;
                    v vVar = this.f1851z;
                    if (vVar != null) {
                        vVar.A = -1;
                    }
                    o0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i10) {
        if (this.f1841p == 0) {
            RecyclerView recyclerView = this.f2378b;
            return o1(i10, recyclerView.C, recyclerView.G0);
        }
        RecyclerView recyclerView2 = this.f2378b;
        return p1(i10, recyclerView2.C, recyclerView2.G0);
    }

    @Override
    public final int k(b1 b1Var) {
        return G0(b1Var);
    }

    public final int k1(int i10) {
        if (this.f1841p == 1) {
            RecyclerView recyclerView = this.f2378b;
            return o1(i10, recyclerView.C, recyclerView.G0);
        }
        RecyclerView recyclerView2 = this.f2378b;
        return p1(i10, recyclerView2.C, recyclerView2.G0);
    }

    @Override
    public final int l(b1 b1Var) {
        return H0(b1Var);
    }

    public final HashSet l1(int i10) {
        return m1(k1(i10), i10);
    }

    public final HashSet m1(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f2378b;
        int iQ1 = q1(i11, recyclerView.C, recyclerView.G0);
        for (int i12 = i10; i12 < i10 + iQ1; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @Override
    public final int n(b1 b1Var) {
        return G0(b1Var);
    }

    public final int n1(int i10, int i11) {
        if (this.f1841p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override
    public final int o(b1 b1Var) {
        return H0(b1Var);
    }

    public final int o1(int i10, v0 v0Var, b1 b1Var) {
        boolean z10 = b1Var.f2244g;
        f0 f0Var = this.K;
        if (!z10) {
            int i11 = this.F;
            f0Var.getClass();
            return f0.l(i10, i11);
        }
        int iB = v0Var.b(i10);
        if (iB != -1) {
            int i12 = this.F;
            f0Var.getClass();
            return f0.l(iB, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override
    public final int p0(int i10, v0 v0Var, b1 b1Var) {
        t1();
        i1();
        return super.p0(i10, v0Var, b1Var);
    }

    public final int p1(int i10, v0 v0Var, b1 b1Var) {
        boolean z10 = b1Var.f2244g;
        f0 f0Var = this.K;
        if (!z10) {
            int i11 = this.F;
            f0Var.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = v0Var.b(i10);
        if (iB != -1) {
            int i13 = this.F;
            f0Var.getClass();
            return iB % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int q1(int i10, v0 v0Var, b1 b1Var) {
        boolean z10 = b1Var.f2244g;
        f0 f0Var = this.K;
        if (!z10) {
            f0Var.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (v0Var.b(i10) != -1) {
            f0Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override
    public final q0 r() {
        return this.f1841p == 0 ? new q(-2, -1) : new q(-1, -2);
    }

    @Override
    public final int r0(int i10, v0 v0Var, b1 b1Var) {
        t1();
        i1();
        return super.r0(i10, v0Var, b1Var);
    }

    public final void r1(View view, int i10, boolean z10) {
        int iW;
        int iW2;
        q qVar = (q) view.getLayoutParams();
        Rect rect = qVar.f2393b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        int iN1 = n1(qVar.f2390e, qVar.f2391f);
        if (this.f1841p == 1) {
            iW2 = p0.w(false, iN1, i10, i12, ((ViewGroup.MarginLayoutParams) qVar).width);
            iW = p0.w(true, this.f1843r.n(), this.m, i11, ((ViewGroup.MarginLayoutParams) qVar).height);
        } else {
            int iW3 = p0.w(false, iN1, i10, i11, ((ViewGroup.MarginLayoutParams) qVar).height);
            int iW4 = p0.w(true, this.f1843r.n(), this.l, i12, ((ViewGroup.MarginLayoutParams) qVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10 ? z0(view, iW2, iW, q0Var) : x0(view, iW2, iW, q0Var)) {
            view.measure(iW2, iW);
        }
    }

    @Override
    public final q0 s(Context context, AttributeSet attributeSet) {
        q qVar = new q(context, attributeSet);
        qVar.f2390e = -1;
        qVar.f2391f = 0;
        return qVar;
    }

    public final void s1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(g4.c.f(i10, "Span count should be at least 1. Provided "));
        }
        this.F = i10;
        this.K.m();
        o0();
    }

    @Override
    public final q0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            q qVar = new q((ViewGroup.MarginLayoutParams) layoutParams);
            qVar.f2390e = -1;
            qVar.f2391f = 0;
            return qVar;
        }
        q qVar2 = new q(layoutParams);
        qVar2.f2390e = -1;
        qVar2.f2391f = 0;
        return qVar2;
    }

    public final void t1() {
        int iC;
        int iF;
        if (this.f1841p == 1) {
            iC = this.f2388n - E();
            iF = D();
        } else {
            iC = this.f2389o - C();
            iF = F();
        }
        h1(iC - iF);
    }

    @Override
    public final void u0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.u0(rect, i10, i11);
        }
        int iE = E() + D();
        int iC = C() + F();
        if (this.f1841p == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.f2378b;
            WeakHashMap weakHashMap = j0.f17198a;
            iG2 = p0.g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = p0.g(i10, iArr[iArr.length - 1] + iE, this.f2378b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.f2378b;
            WeakHashMap weakHashMap2 = j0.f17198a;
            iG = p0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = p0.g(i11, iArr2[iArr2.length - 1] + iC, this.f2378b.getMinimumHeight());
        }
        this.f2378b.setMeasuredDimension(iG, iG2);
    }

    @Override
    public final int x(v0 v0Var, b1 b1Var) {
        if (this.f1841p == 1) {
            return Math.min(this.F, B());
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return o1(b1Var.b() - 1, v0Var, b1Var) + 1;
    }
}
