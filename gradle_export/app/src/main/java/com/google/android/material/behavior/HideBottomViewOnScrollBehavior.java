package com.google.android.material.behavior;

import a1.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c3.j3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l4.a;
import ze.d;

@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    public int f4078b;

    public int f4079c;

    public TimeInterpolator f4080d;

    public TimeInterpolator f4081e;

    public AccessibilityManager f4083g;

    public cg.a f4084h;

    public ViewPropertyAnimator f4087k;

    public final LinkedHashSet f4077a = new LinkedHashSet();

    public int f4082f = 0;

    public final boolean f4085i = true;

    public int f4086j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f4082f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f4078b = d.P(view.getContext(), 2130969578, 225);
        this.f4079c = d.P(view.getContext(), 2130969584, 175);
        this.f4080d = d.Q(view.getContext(), 2130969594, ag.a.f468d);
        this.f4081e = d.Q(view.getContext(), 2130969594, ag.a.f467c);
        if (this.f4083g == null) {
            this.f4083g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f4083g;
        if (accessibilityManager == null || this.f4084h != null) {
            return false;
        }
        cg.a aVar = new cg.a(this, view, 0);
        this.f4084h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new j3(this, 1));
        return false;
    }

    @Override
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i10 <= 0) {
            if (i10 < 0) {
                v(view);
                return;
            }
            return;
        }
        if (this.f4086j == 1) {
            return;
        }
        if (this.f4085i && (accessibilityManager = this.f4083g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4087k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4086j = 1;
        Iterator it = this.f4077a.iterator();
        if (it.hasNext()) {
            throw b.j(it);
        }
        this.f4087k = view.animate().translationY(this.f4082f).setInterpolator(this.f4081e).setDuration(this.f4079c).setListener(new cg.b(this, 0));
    }

    @Override
    public boolean s(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void v(View view) {
        if (this.f4086j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4087k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4086j = 2;
        Iterator it = this.f4077a.iterator();
        if (it.hasNext()) {
            throw b.j(it);
        }
        this.f4087k = view.animate().translationY(0).setInterpolator(this.f4080d).setDuration(this.f4078b).setListener(new cg.b(this, 0));
    }
}
