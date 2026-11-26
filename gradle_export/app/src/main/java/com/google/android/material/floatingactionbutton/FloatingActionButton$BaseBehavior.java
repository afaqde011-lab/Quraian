package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import l4.a;
import l4.d;

public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17433g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override
    public final void g(d dVar) {
        if (dVar.f10024h == 0) {
            dVar.f10024h = 80;
        }
    }

    @Override
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }
}
