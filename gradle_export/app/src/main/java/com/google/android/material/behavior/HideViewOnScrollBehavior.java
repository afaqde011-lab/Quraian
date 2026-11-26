package com.google.android.material.behavior;

import a1.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c3.j3;
import cg.c;
import com.google.android.gms.internal.measurement.z3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l4.a;
import l4.d;

public class HideViewOnScrollBehavior<V extends View> extends a {

    public z3 f4088a;

    public AccessibilityManager f4089b;

    public cg.a f4090c;

    public int f4092e;

    public int f4093f;

    public TimeInterpolator f4094g;

    public TimeInterpolator f4095h;

    public ViewPropertyAnimator f4098k;

    public final LinkedHashSet f4091d = new LinkedHashSet();

    public int f4096i = 0;

    public int f4097j = 2;

    public HideViewOnScrollBehavior() {
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (this.f4089b == null) {
            this.f4089b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f4089b;
        if (accessibilityManager != null && this.f4090c == null) {
            cg.a aVar = new cg.a(this, view, 1);
            this.f4090c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new j3(this, 2));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((d) view.getLayoutParams()).f10019c;
        if (i11 == 80 || i11 == 81) {
            v(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i10);
            v((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f4096i = this.f4088a.B(view, marginLayoutParams);
        this.f4092e = ze.d.P(view.getContext(), 2130969578, 225);
        this.f4093f = ze.d.P(view.getContext(), 2130969584, 175);
        this.f4094g = ze.d.Q(view.getContext(), 2130969594, ag.a.f468d);
        this.f4095h = ze.d.Q(view.getContext(), 2130969594, ag.a.f467c);
        return false;
    }

    @Override
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 <= 0) {
            if (i10 < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.f4097j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f4089b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f4098k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f4097j = 1;
            Iterator it = this.f4091d.iterator();
            if (it.hasNext()) {
                throw b.j(it);
            }
            this.f4098k = this.f4088a.D(view, this.f4096i).setInterpolator(this.f4095h).setDuration(this.f4093f).setListener(new cg.b(this, 1));
        }
    }

    @Override
    public final boolean s(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void v(int i10) {
        z3 z3Var = this.f4088a;
        if (z3Var == null || z3Var.C() != i10) {
            if (i10 == 0) {
                this.f4088a = new c(2);
            } else if (i10 == 1) {
                this.f4088a = new c(0);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException(g4.c.i("Invalid view edge position value: ", i10, ". Must be 0, 1 or 2."));
                }
                this.f4088a = new c(1);
            }
        }
    }

    public final void w(View view) {
        if (this.f4097j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4098k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4097j = 2;
        Iterator it = this.f4091d.iterator();
        if (it.hasNext()) {
            throw b.j(it);
        }
        this.f4088a.getClass();
        this.f4098k = this.f4088a.D(view, 0).setInterpolator(this.f4094g).setDuration(this.f4092e).setListener(new cg.b(this, 1));
    }
}
