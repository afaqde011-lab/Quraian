package j4;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class f {

    public final ConstraintLayout f8055a;

    public int f8056b;

    public int f8057c;

    public int f8058d;

    public int f8059e;

    public int f8060f;

    public int f8061g;

    public final ConstraintLayout f8062h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f8062h = constraintLayout;
        this.f8055a = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    public final void b(g4.e eVar, h4.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z10;
        int baseline;
        int i10;
        if (eVar == null) {
            return;
        }
        g4.d dVar = eVar.J;
        g4.d dVar2 = eVar.H;
        if (eVar.f6134f0 == 8) {
            bVar.f6569e = 0;
            bVar.f6570f = 0;
            bVar.f6571g = 0;
            return;
        }
        if (eVar.S == null) {
            return;
        }
        int i11 = bVar.f6565a;
        int i12 = bVar.f6566b;
        int i13 = bVar.f6567c;
        int i14 = bVar.f6568d;
        int i15 = this.f8056b + this.f8057c;
        int i16 = this.f8058d;
        View view = eVar.f6132e0;
        int iB = e4.f.b(i11);
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8060f, i16, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8060f, i16, -2);
            boolean z11 = eVar.f6152q == 1;
            int i17 = bVar.f6574j;
            if (i17 == 1 || i17 == 2) {
                boolean z12 = view.getMeasuredHeight() == eVar.k();
                if (bVar.f6574j == 2 || !z11 || ((z11 && z12) || eVar.x())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.n(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i18 = this.f8060f;
            int i19 = dVar2 != null ? dVar2.f6120g : 0;
            if (dVar != null) {
                i19 += dVar.f6120g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i16 + i19, -1);
        }
        int iB2 = e4.f.b(i12);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8061g, i15, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8061g, i15, -2);
            boolean z13 = eVar.f6153r == 1;
            int i20 = bVar.f6574j;
            if (i20 == 1 || i20 == 2) {
                boolean z14 = view.getMeasuredWidth() == eVar.n();
                if (bVar.f6574j == 2 || !z13 || ((z13 && z14) || eVar.y())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i21 = this.f8061g;
            int i22 = dVar2 != null ? eVar.I.f6120g : 0;
            if (dVar != null) {
                i22 += eVar.K.f6120g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i15 + i22, -1);
        }
        g4.f fVar = (g4.f) eVar.S;
        ConstraintLayout constraintLayout = this.f8062h;
        if (fVar != null && g4.k.c(constraintLayout.I, 256) && view.getMeasuredWidth() == eVar.n() && view.getMeasuredWidth() < fVar.n() && view.getMeasuredHeight() == eVar.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == eVar.Z && !eVar.w() && a(eVar.F, iMakeMeasureSpec, eVar.n()) && a(eVar.G, iMakeMeasureSpec2, eVar.k())) {
            bVar.f6569e = eVar.n();
            bVar.f6570f = eVar.k();
            bVar.f6571g = eVar.Z;
            return;
        }
        boolean z15 = i11 == 3;
        boolean z16 = i12 == 3;
        boolean z17 = i12 == 4 || i12 == 1;
        boolean z18 = i11 == 4 || i11 == 1;
        boolean z19 = z15 && eVar.V > 0.0f;
        boolean z20 = z16 && eVar.V > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i23 = bVar.f6574j;
        if (i23 != 1 && i23 != 2 && z15 && eVar.f6152q == 0 && z16 && eVar.f6153r == 0) {
            i10 = -1;
            z10 = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            if ((view instanceof t) && (eVar instanceof g4.h)) {
                ((t) view).j((g4.h) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            eVar.F = iMakeMeasureSpec;
            eVar.G = iMakeMeasureSpec2;
            eVar.f6135g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i24 = eVar.f6155t;
            iMax = i24 > 0 ? Math.max(i24, measuredWidth) : measuredWidth;
            int i25 = eVar.f6156u;
            if (i25 > 0) {
                iMax = Math.min(i25, iMax);
            }
            int i26 = eVar.f6158w;
            iMax2 = i26 > 0 ? Math.max(i26, measuredHeight) : measuredHeight;
            int i27 = iMakeMeasureSpec2;
            int i28 = eVar.f6159x;
            if (i28 > 0) {
                iMax2 = Math.min(i28, iMax2);
            }
            if (!g4.k.c(constraintLayout.I, 1)) {
                if (z19 && z17) {
                    iMax = (int) ((iMax2 * eVar.V) + 0.5f);
                } else if (z20 && z18) {
                    iMax2 = (int) ((iMax / eVar.V) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i10 = -1;
                z10 = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i27;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                eVar.F = iMakeMeasureSpec;
                eVar.G = iMakeMeasureSpec3;
                z10 = false;
                eVar.f6135g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i10 = -1;
            }
        }
        boolean z21 = baseline != i10 ? true : z10;
        bVar.f6573i = (iMax == bVar.f6567c && iMax2 == bVar.f6568d) ? z10 : true;
        boolean z22 = eVar2.f8019b0 ? true : z21;
        if (z22 && baseline != -1 && eVar.Z != baseline) {
            bVar.f6573i = true;
        }
        bVar.f6569e = iMax;
        bVar.f6570f = iMax2;
        bVar.f6572h = z22;
        bVar.f6571g = baseline;
    }
}
