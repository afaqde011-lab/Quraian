package k;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.WeakHashMap;
import p.w2;
import z4.j1;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.w0;
import z4.x0;

public final class r implements z4.r, o.w {
    public final b0 A;

    public r(b0 b0Var) {
        this.A = b0Var;
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        boolean z10;
        x0 u0Var;
        boolean z11;
        j1 j1VarB = j1Var;
        int iD = j1VarB.d();
        b0 b0Var = this.A;
        Context context = b0Var.I;
        int iD2 = j1VarB.d();
        ActionBarContextView actionBarContextView = b0Var.T;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.T.getLayoutParams();
            boolean z12 = true;
            if (b0Var.T.isShown()) {
                if (b0Var.A0 == null) {
                    b0Var.A0 = new Rect();
                    b0Var.B0 = new Rect();
                }
                Rect rect = b0Var.A0;
                Rect rect2 = b0Var.B0;
                rect.set(j1VarB.b(), j1VarB.d(), j1VarB.c(), j1VarB.a());
                w2.a(b0Var.Y, rect, rect2);
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup = b0Var.Y;
                WeakHashMap weakHashMap = z4.j0.f17198a;
                j1 j1VarA = z4.e0.a(viewGroup);
                int iB = j1VarA == null ? 0 : j1VarA.b();
                int iC = j1VarA == null ? 0 : j1VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || b0Var.f8340a0 != null) {
                    View view2 = b0Var.f8340a0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            b0Var.f8340a0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    b0Var.f8340a0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    b0Var.Y.addView(b0Var.f8340a0, -1, layoutParams);
                }
                View view4 = b0Var.f8340a0;
                z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = b0Var.f8340a0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(2131099654) : context.getColor(2131099653));
                }
                if (!b0Var.f8345f0 && z12) {
                    iD2 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                b0Var.T.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = b0Var.f8340a0;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = j1VarB.b();
            int iC2 = j1VarB.c();
            int iA = j1VarB.a();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 36) {
                u0Var = new w0(j1VarB);
            } else if (i15 >= 35) {
                u0Var = new v0(j1VarB);
            } else {
                u0Var = i15 >= 34 ? new u0(j1VarB) : new t0(j1VarB);
            }
            u0Var.g(q4.b.c(iB2, iD2, iC2, iA));
            j1VarB = u0Var.b();
        }
        WeakHashMap weakHashMap2 = z4.j0.f17198a;
        WindowInsets windowInsetsF = j1VarB.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsF)) {
                return j1.g(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return j1VarB;
    }

    @Override
    public void c(o.l lVar, boolean z10) {
        this.A.q(lVar);
    }

    @Override
    public boolean x(o.l lVar) {
        Window.Callback callback = this.A.J.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}
