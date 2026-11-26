package eg;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.j;
import com.google.android.material.datepicker.l;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.d0;
import k9.x0;
import z4.j0;

public final class f extends d0 {
    public BottomSheetBehavior G;
    public FrameLayout H;
    public CoordinatorLayout I;
    public FrameLayout J;
    public boolean K;
    public boolean L;
    public boolean M;
    public e N;
    public boolean O;
    public x0 P;
    public av.h Q;

    @Override
    public final void cancel() {
        f();
        super.cancel();
    }

    public final void e() {
        if (this.H == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), 2131558730, null);
            this.H = frameLayout;
            this.I = (CoordinatorLayout) frameLayout.findViewById(2131362074);
            FrameLayout frameLayout2 = (FrameLayout) this.H.findViewById(2131362091);
            this.J = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout2);
            this.G = bottomSheetBehaviorA;
            av.h hVar = this.Q;
            ArrayList arrayList = bottomSheetBehaviorA.Y;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            this.G.I(this.K);
            this.P = new x0(this.G, this.J);
        }
    }

    public final BottomSheetBehavior f() {
        if (this.G == null) {
            e();
        }
        return this.G;
    }

    public final FrameLayout g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.H.findViewById(2131362074);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.O) {
            FrameLayout frameLayout = this.H;
            qj.c cVar = new qj.c(this, 22);
            WeakHashMap weakHashMap = j0.f17198a;
            z4.d0.b(frameLayout, cVar);
        }
        this.J.removeAllViews();
        if (layoutParams == null) {
            this.J.addView(view);
        } else {
            this.J.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(2131363106).setOnClickListener(new l(this, 1));
        j0.g(this.J, new j(this, 1));
        this.J.setOnTouchListener(new d(0));
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.O && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.H;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.I;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            b5.M(window, !z10);
            e eVar = this.N;
            if (eVar != null) {
                eVar.e(window);
            }
        }
        x0 x0Var = this.P;
        if (x0Var == null) {
            return;
        }
        View view = (View) x0Var.D;
        og.c cVar = (og.c) x0Var.B;
        if (this.K) {
            if (cVar != null) {
                cVar.b((og.b) x0Var.C, view, false);
            }
        } else if (cVar != null) {
            cVar.c(view);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        og.c cVar;
        e eVar = this.N;
        if (eVar != null) {
            eVar.e(null);
        }
        x0 x0Var = this.P;
        if (x0Var == null || (cVar = (og.c) x0Var.B) == null) {
            return;
        }
        cVar.c((View) x0Var.D);
    }

    @Override
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.G;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.K(4);
    }

    @Override
    public final void setCancelable(boolean z10) {
        x0 x0Var;
        super.setCancelable(z10);
        if (this.K != z10) {
            this.K = z10;
            BottomSheetBehavior bottomSheetBehavior = this.G;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z10);
            }
            if (getWindow() == null || (x0Var = this.P) == null) {
                return;
            }
            View view = (View) x0Var.D;
            og.c cVar = (og.c) x0Var.B;
            if (this.K) {
                if (cVar != null) {
                    cVar.b((og.b) x0Var.C, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    @Override
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.K) {
            this.K = true;
        }
        this.L = z10;
        this.M = true;
    }

    @Override
    public final void setContentView(int i10) {
        super.setContentView(g(null, i10, null));
    }

    @Override
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}
