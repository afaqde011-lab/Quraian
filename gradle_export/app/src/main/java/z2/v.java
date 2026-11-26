package z2;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;
import java.util.WeakHashMap;

public final class v extends f7.e implements Runnable, z4.r, View.OnAttachStateChangeListener {
    public boolean C;
    public int D;
    public z4.j1 E;
    public final u.i0 F;
    public final l1.f1 G;
    public final u.d0 H;
    public final z1.p I;

    public v() {
        super(1, 3);
        u.i0 i0Var = new u.i0(9);
        b2.f17091a.getClass();
        i0Var.m(a2.f17079b, new e2("caption bar"));
        i0Var.m(a2.f17080c, new e2("display cutout"));
        i0Var.m(a2.f17081d, new e2("ime"));
        i0Var.m(a2.f17082e, new e2("mandatory system gestures"));
        i0Var.m(a2.f17083f, new e2("navigation bars"));
        i0Var.m(a2.f17084g, new e2("status bars"));
        i0Var.m(a2.f17085h, new e2("system gestures"));
        i0Var.m(a2.f17086i, new e2("tappable element"));
        i0Var.m(a2.f17087j, new e2("waterfall"));
        this.F = i0Var;
        this.G = new l1.f1(0);
        this.H = new u.d0(4);
        this.I = new z1.p();
    }

    @Override
    public final z4.j1 B(View view, z4.j1 j1Var) {
        if (this.C) {
            this.E = j1Var;
            return j1Var;
        }
        if (this.D == 0) {
            q(j1Var);
        }
        return j1Var;
    }

    @Override
    public final void m(z4.q0 q0Var) {
        boolean z10 = false;
        this.C = false;
        int typeMask = ((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask();
        this.D &= ~typeMask;
        this.E = null;
        b2 b2Var = (b2) d2.f17100a.b(typeMask);
        if (b2Var != null) {
            Object objG = this.F.g(b2Var);
            kotlin.jvm.internal.m.b(objG);
            e2 e2Var = (e2) objG;
            e2Var.f17104c.i(0.0f);
            e2Var.f17106e.i(1.0f);
            e2Var.f17105d.i(0L);
            e2Var.f17104c.i(0.0f);
            e2Var.f17103b.setValue(Boolean.FALSE);
            e2Var.f17111j = -1L;
            e2Var.f17112k = -1L;
            l1.f1 f1Var = this.G;
            f1Var.i(f1Var.h() + 1);
            synchronized (z1.l.f17038c) {
                u.j0 j0Var = z1.l.f17045j.f17005h;
                if (j0Var != null && j0Var.h()) {
                    z10 = true;
                }
            }
            if (z10) {
                z1.l.a();
            }
        }
    }

    @Override
    public final void n(z4.q0 q0Var) {
        this.C = true;
    }

    @Override
    public final z4.j1 o(z4.j1 j1Var, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            z4.q0 q0Var = (z4.q0) list.get(i10);
            b2 b2Var = (b2) d2.f17100a.b(((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask());
            if (b2Var != null) {
                Object objG = this.F.g(b2Var);
                kotlin.jvm.internal.m.b(objG);
                e2 e2Var = (e2) objG;
                if (((Boolean) e2Var.f17103b.getValue()).booleanValue()) {
                    wi.b bVar = q0Var.f17221a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) bVar.B;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) bVar.B;
                    e2Var.f17104c.i(windowInsetsAnimation.getInterpolatedFraction());
                    e2Var.f17106e.i(windowInsetsAnimation2.getAlpha());
                    e2Var.f17105d.i(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        q(j1Var);
        return j1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.d0.b(view, this);
        z4.j0.i(view, this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.d0.b(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    @Override
    public final q3.e0 p(z4.q0 q0Var, q3.e0 e0Var) {
        z4.j1 j1Var = this.E;
        boolean z10 = false;
        this.C = false;
        this.E = null;
        if (((WindowInsetsAnimation) q0Var.f17221a.B).getDurationMillis() > 0 && j1Var != null) {
            int typeMask = ((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask();
            this.D |= typeMask;
            b2 b2Var = (b2) d2.f17100a.b(typeMask);
            if (b2Var != null) {
                Object objG = this.F.g(b2Var);
                kotlin.jvm.internal.m.b(objG);
                e2 e2Var = (e2) objG;
                q4.b bVarI = j1Var.f17202a.i(typeMask);
                long j9 = (((long) bVarI.f12755a) << 48) | (((long) bVarI.f12756b) << 32) | (((long) bVarI.f12757c) << 16) | ((long) bVarI.f12758d);
                long j10 = e2Var.f17109h;
                if (!d0.h(j9, j10)) {
                    e2Var.f17111j = j10;
                    e2Var.f17112k = j9;
                    e2Var.f17103b.setValue(Boolean.TRUE);
                    wi.b bVar = q0Var.f17221a;
                    e2Var.f17104c.i(((WindowInsetsAnimation) bVar.B).getInterpolatedFraction());
                    e2Var.f17106e.i(((WindowInsetsAnimation) bVar.B).getAlpha());
                    e2Var.f17105d.i(((WindowInsetsAnimation) bVar.B).getDurationMillis());
                    l1.f1 f1Var = this.G;
                    f1Var.i(f1Var.h() + 1);
                    synchronized (z1.l.f17038c) {
                        u.j0 j0Var = z1.l.f17045j.f17005h;
                        if (j0Var != null && j0Var.h()) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        z1.l.a();
                        return e0Var;
                    }
                }
            }
        }
        return e0Var;
    }

    public final void q(z4.j1 j1Var) {
        char c10;
        char c11;
        boolean z10;
        char c12;
        boolean z11;
        boolean z12;
        long j9;
        boolean z13;
        boolean z14;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i10;
        u.w wVar = d2.f17100a;
        int[] iArr2 = wVar.f14872b;
        Object[] objArr3 = wVar.f14873c;
        long[] jArr2 = wVar.f14871a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            z11 = false;
            z12 = false;
            c10 = 16;
            c11 = ' ';
            while (true) {
                long j10 = jArr2[i11];
                z10 = true;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    c12 = '0';
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr2[i15];
                            b2 b2Var = (b2) objArr3[i15];
                            q4.b bVarI = j1Var.f17202a.i(i16);
                            long j11 = (((long) bVarI.f12755a) << 48) | (((long) bVarI.f12756b) << 32) | (((long) bVarI.f12757c) << 16) | ((long) bVarI.f12758d);
                            Object objG = this.F.g(b2Var);
                            kotlin.jvm.internal.m.b(objG);
                            e2 e2Var = (e2) objG;
                            if (!d0.h(j11, e2Var.f17109h)) {
                                e2Var.f17109h = j11;
                                z11 = true;
                                if (!d0.h(j11, 0L)) {
                                    z12 = true;
                                }
                            }
                            if (i16 != 8) {
                                q4.b bVarJ = j1Var.f17202a.j(i16);
                                objArr2 = objArr3;
                                long j12 = (((long) bVarJ.f12756b) << 32) | (((long) bVarJ.f12755a) << 48) | (((long) bVarJ.f12757c) << 16) | ((long) bVarJ.f12758d);
                                if (!d0.h(e2Var.f17110i, j12)) {
                                    e2Var.f17110i = j12;
                                    z11 = true;
                                    if (!d0.h(j12, 0L)) {
                                        z12 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            e2Var.f17102a.setValue(Boolean.valueOf(j1Var.f17202a.u(i16)));
                            i10 = 8;
                        } else {
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c12 = '0';
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c10 = 16;
            c11 = ' ';
            z10 = true;
            c12 = '0';
            z11 = false;
            z12 = false;
        }
        z4.f fVarH = j1Var.f17202a.h();
        if (fVarH == null) {
            j9 = 0;
        } else {
            q4.b bVarD = q4.b.d(fVarH.f17190a.getWaterfallInsets());
            j9 = (((long) bVarD.f12755a) << c12) | (((long) bVarD.f12756b) << c11) | (((long) bVarD.f12757c) << c10) | ((long) bVarD.f12758d);
        }
        u.i0 i0Var = this.F;
        b2.f17091a.getClass();
        Object objG2 = i0Var.g(a2.f17087j);
        kotlin.jvm.internal.m.b(objG2);
        e2 e2Var2 = (e2) objG2;
        e2Var2.f17102a.setValue(Boolean.valueOf(!d0.h(j9, 0L)));
        if (!d0.h(e2Var2.f17109h, j9)) {
            e2Var2.f17109h = j9;
            e2Var2.f17110i = j9;
            z11 = z10;
            if (!d0.h(j9, 0L)) {
                z12 = z11;
            }
        }
        if (fVarH == null) {
            u.d0 d0Var = this.H;
            if (d0Var.f14838b > 0) {
                d0Var.d();
                this.I.clear();
                z11 = z10;
            }
        } else {
            List<Rect> boundingRects = fVarH.f17190a.getBoundingRects();
            int size = boundingRects.size();
            u.d0 d0Var2 = this.H;
            if (size < d0Var2.f14838b) {
                d0Var2.l(boundingRects.size(), this.H.f14838b);
                this.I.h(boundingRects.size(), this.I.size());
                z11 = z10;
            } else {
                int size2 = boundingRects.size() - this.H.f14838b;
                int i17 = 0;
                while (i17 < size2) {
                    u.d0 d0Var3 = this.H;
                    d0Var3.a(l1.q.z(boundingRects.get(d0Var3.f14838b)));
                    this.I.add(new u("display cutout rect " + this.H.f14838b));
                    i17++;
                    z11 = z10;
                }
            }
            int size3 = boundingRects.size();
            for (int i18 = 0; i18 < size3; i18++) {
                Rect rect = boundingRects.get(i18);
                l1.z0 z0Var = (l1.z0) this.H.f(i18);
                if (!kotlin.jvm.internal.m.a(z0Var.getValue(), rect)) {
                    z0Var.setValue(rect);
                    z11 = z10;
                }
            }
            if (!boundingRects.isEmpty()) {
                z12 = z10;
            }
        }
        if ((z12 || this.G.h() != 0) && z11) {
            l1.f1 f1Var = this.G;
            f1Var.i(f1Var.h() + 1);
            synchronized (z1.l.f17038c) {
                u.j0 j0Var = z1.l.f17045j.f17005h;
                z13 = (j0Var == null || j0Var.h() != (z14 = z10)) ? false : z14;
            }
            if (z13) {
                z1.l.a();
            }
        }
    }

    @Override
    public final void run() {
        if (this.C) {
            this.D = 0;
            this.C = false;
            z4.j1 j1Var = this.E;
            if (j1Var != null) {
                q(j1Var);
                this.E = null;
            }
        }
    }
}
