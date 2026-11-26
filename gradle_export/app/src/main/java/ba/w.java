package ba;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class w {

    public int f2445a = -1;

    public RecyclerView f2446b;

    public p0 f2447c;

    public boolean f2448d;

    public boolean f2449e;

    public View f2450f;

    public final z0 f2451g;

    public boolean f2452h;

    public final LinearInterpolator f2453i;

    public final DecelerateInterpolator f2454j;

    public PointF f2455k;
    public final DisplayMetrics l;
    public boolean m;

    public float f2456n;

    public int f2457o;

    public int f2458p;

    public w(Context context) {
        z0 z0Var = new z0();
        z0Var.f2468d = -1;
        z0Var.f2470f = false;
        z0Var.f2471g = 0;
        z0Var.f2465a = 0;
        z0Var.f2466b = 0;
        z0Var.f2467c = Integer.MIN_VALUE;
        z0Var.f2469e = null;
        this.f2451g = z0Var;
        this.f2453i = new LinearInterpolator();
        this.f2454j = new DecelerateInterpolator();
        this.m = false;
        this.f2457o = 0;
        this.f2458p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int b(View view, int i10) {
        p0 p0Var = this.f2447c;
        if (p0Var == null || !p0Var.d()) {
            return 0;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        return a((view.getLeft() - ((q0) view.getLayoutParams()).f2393b.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, view.getRight() + ((q0) view.getLayoutParams()).f2393b.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, p0Var.D(), p0Var.f2388n - p0Var.E(), i10);
    }

    public int c(View view, int i10) {
        p0 p0Var = this.f2447c;
        if (p0Var == null || !p0Var.e()) {
            return 0;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        return a((view.getTop() - ((q0) view.getLayoutParams()).f2393b.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getBottom() + ((q0) view.getLayoutParams()).f2393b.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, p0Var.F(), p0Var.f2389o - p0Var.C(), i10);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.m) {
            this.f2456n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.f2456n);
    }

    public PointF f(int i10) {
        Object obj = this.f2447c;
        if (obj instanceof a1) {
            return ((a1) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + a1.class.getCanonicalName());
        return null;
    }

    public final void g(int i10, int i11) {
        PointF pointFF;
        RecyclerView recyclerView = this.f2446b;
        if (this.f2445a == -1 || recyclerView == null) {
            i();
        }
        if (this.f2448d && this.f2450f == null && this.f2447c != null && (pointFF = f(this.f2445a)) != null) {
            float f3 = pointFF.x;
            if (f3 != 0.0f || pointFF.y != 0.0f) {
                recyclerView.f0(null, (int) Math.signum(f3), (int) Math.signum(pointFF.y));
            }
        }
        this.f2448d = false;
        View view = this.f2450f;
        z0 z0Var = this.f2451g;
        if (view != null) {
            this.f2446b.getClass();
            f1 f1VarM = RecyclerView.M(view);
            if ((f1VarM != null ? f1VarM.b() : -1) == this.f2445a) {
                View view2 = this.f2450f;
                b1 b1Var = recyclerView.G0;
                h(view2, z0Var);
                z0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2450f = null;
            }
        }
        if (this.f2449e) {
            b1 b1Var2 = recyclerView.G0;
            if (this.f2446b.N.v() == 0) {
                i();
            } else {
                int i12 = this.f2457o;
                int i13 = i12 - i10;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f2457o = i13;
                int i14 = this.f2458p;
                int i15 = i14 - i11;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f2458p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF pointFF2 = f(this.f2445a);
                    if (pointFF2 != null) {
                        float f10 = pointFF2.x;
                        if (f10 == 0.0f && pointFF2.y == 0.0f) {
                            z0Var.f2468d = this.f2445a;
                            i();
                        } else {
                            float f11 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                            float f12 = pointFF2.x / fSqrt;
                            pointFF2.x = f12;
                            float f13 = pointFF2.y / fSqrt;
                            pointFF2.y = f13;
                            this.f2455k = pointFF2;
                            this.f2457o = (int) (f12 * 10000.0f);
                            this.f2458p = (int) (f13 * 10000.0f);
                            int iE = e(10000);
                            int i16 = (int) (this.f2457o * 1.2f);
                            int i17 = (int) (this.f2458p * 1.2f);
                            z0Var.f2465a = i16;
                            z0Var.f2466b = i17;
                            z0Var.f2467c = (int) (iE * 1.2f);
                            z0Var.f2469e = this.f2453i;
                            z0Var.f2470f = true;
                        }
                    } else {
                        z0Var.f2468d = this.f2445a;
                        i();
                    }
                }
            }
            boolean z10 = z0Var.f2468d >= 0;
            z0Var.a(recyclerView);
            if (z10 && this.f2449e) {
                this.f2448d = true;
                recyclerView.D0.b();
            }
        }
    }

    public void h(View view, z0 z0Var) {
        int i10;
        PointF pointF = this.f2455k;
        int i11 = 0;
        if (pointF != null) {
            float f3 = pointF.x;
            if (f3 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f3 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iB = b(view, i10);
        PointF pointF2 = this.f2455k;
        if (pointF2 != null) {
            float f10 = pointF2.y;
            if (f10 != 0.0f) {
                i11 = f10 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i11);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            z0Var.f2465a = -iB;
            z0Var.f2466b = -iC;
            z0Var.f2467c = iCeil;
            z0Var.f2469e = this.f2454j;
            z0Var.f2470f = true;
        }
    }

    public final void i() {
        if (this.f2449e) {
            this.f2449e = false;
            this.f2458p = 0;
            this.f2457o = 0;
            this.f2455k = null;
            this.f2446b.G0.f2238a = -1;
            this.f2450f = null;
            this.f2445a = -1;
            this.f2448d = false;
            p0 p0Var = this.f2447c;
            if (p0Var.f2381e == this) {
                p0Var.f2381e = null;
            }
            this.f2447c = null;
            this.f2446b = null;
        }
    }
}
