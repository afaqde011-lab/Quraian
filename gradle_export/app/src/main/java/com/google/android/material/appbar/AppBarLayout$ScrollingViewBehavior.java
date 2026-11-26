package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bg.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l4.d;
import z4.j0;

public class AppBarLayout$ScrollingViewBehavior extends a {

    public final int f4073b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17448x);
        this.f4073b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override
    public final void f(View view) {
    }

    @Override
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((d) view2.getLayoutParams()).f10017a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i10 = this.f4073b;
            int iK = bottom - (i10 == 0 ? 0 : rd.a.k((int) (0.0f * i10), 0, i10));
            WeakHashMap weakHashMap = j0.f17198a;
            view.offsetTopAndBottom(iK);
        }
        return false;
    }

    @Override
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 != -1 && i13 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i10) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i10);
    }
}
