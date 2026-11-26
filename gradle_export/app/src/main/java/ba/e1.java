package ba;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastStatusCodes;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class e1 implements Runnable {
    public int A;
    public int B;
    public OverScroller C;
    public Interpolator D;
    public boolean E;
    public boolean F;
    public final RecyclerView G;

    public e1(RecyclerView recyclerView) {
        this.G = recyclerView;
        c0 c0Var = RecyclerView.f1859i1;
        this.D = c0Var;
        this.E = false;
        this.F = false;
        this.C = new OverScroller(recyclerView.getContext(), c0Var);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.G;
        recyclerView.setScrollState(2);
        this.B = 0;
        this.A = 0;
        Interpolator interpolator = this.D;
        c0 c0Var = RecyclerView.f1859i1;
        if (interpolator != c0Var) {
            this.D = c0Var;
            this.C = new OverScroller(recyclerView.getContext(), c0Var);
        }
        this.C.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.E) {
            this.F = true;
            return;
        }
        RecyclerView recyclerView = this.G;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = z4.j0.f17198a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        RecyclerView recyclerView = this.G;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), CastStatusCodes.AUTHENTICATION_FAILED);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.f1859i1;
        }
        if (this.D != interpolator) {
            this.D = interpolator;
            this.C = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.B = 0;
        this.A = 0;
        recyclerView.setScrollState(2);
        this.C.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.G;
        int[] iArr = recyclerView.S0;
        if (recyclerView.N == null) {
            recyclerView.removeCallbacks(this);
            this.C.abortAnimation();
            return;
        }
        this.F = false;
        this.E = true;
        recyclerView.p();
        OverScroller overScroller = this.C;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.A;
            int i16 = currY - this.B;
            this.A = currX;
            this.B = currY;
            int iO = RecyclerView.o(i15, recyclerView.f1872k0, recyclerView.f1874m0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i16, recyclerView.f1873l0, recyclerView.f1875n0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.S0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.M != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.f0(iArr, iO, iO2);
                int i17 = iArr[0];
                int i18 = iArr[1];
                int i19 = iO - i17;
                int i20 = iO2 - i18;
                w wVar = recyclerView.N.f2381e;
                if (wVar != null && !wVar.f2448d && wVar.f2449e) {
                    int iB = recyclerView.G0.b();
                    if (iB == 0) {
                        wVar.i();
                    } else if (wVar.f2445a >= iB) {
                        wVar.f2445a = iB - 1;
                        wVar.g(i17, i18);
                    } else {
                        wVar.g(i17, i18);
                    }
                }
                i10 = i19;
                i12 = i17;
                i11 = i20;
                i13 = i18;
            } else {
                i10 = iO;
                i11 = iO2;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.P.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.S0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i12, i13, i10, i11, 1, null, iArr3);
            int i21 = i10 - iArr[0];
            int i22 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.w(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
            w wVar2 = recyclerView.N.f2381e;
            if ((wVar2 == null || !wVar2.f2448d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i21 < 0) {
                        i14 = -currVelocity;
                    } else {
                        i14 = i21 > 0 ? currVelocity : 0;
                    }
                    if (i22 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i22 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.y();
                        if (recyclerView.f1872k0.isFinished()) {
                            recyclerView.f1872k0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1874m0.isFinished()) {
                            recyclerView.f1874m0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1873l0.isFinished()) {
                            recyclerView.f1873l0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1875n0.isFinished()) {
                            recyclerView.f1875n0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1857g1) {
                    n nVar = recyclerView.F0;
                    int[] iArr4 = nVar.f2353a;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    nVar.f2356d = 0;
                }
            } else {
                b();
                p pVar = recyclerView.E0;
                if (pVar != null) {
                    pVar.a(recyclerView, i12, i13);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                j0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        w wVar3 = recyclerView.N.f2381e;
        if (wVar3 != null && wVar3.f2448d) {
            wVar3.g(0, 0);
        }
        this.E = false;
        if (!this.F) {
            recyclerView.setScrollState(0);
            recyclerView.n0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = z4.j0.f17198a;
            recyclerView.postOnAnimation(this);
        }
    }
}
