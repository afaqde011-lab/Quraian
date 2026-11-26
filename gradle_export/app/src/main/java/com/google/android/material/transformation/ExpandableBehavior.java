package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import l4.a;

@Deprecated
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override
    public abstract void f(View view);

    @Override
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i11 = 0; i11 < size; i11++) {
                f(view);
            }
        }
        return false;
    }
}
