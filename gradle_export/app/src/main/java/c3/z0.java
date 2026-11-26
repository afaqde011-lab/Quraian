package c3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

public final class z0 extends ViewGroup {
    public final HashMap A;
    public final HashMap B;

    public z0(Context context) {
        super(context);
        setClipChildren(false);
        this.A = new HashMap();
        this.B = new HashMap();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<b4.j, b3.l0> getHolderToLayoutNode() {
        return this.A;
    }

    public final HashMap<b3.l0, b4.j> getLayoutNodeToHolder() {
        return this.B;
    }

    @Override
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (b4.j jVar : this.A.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            y2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            y2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (b4.j jVar : this.A.keySet()) {
            int i13 = jVar.V;
            if (i13 != Integer.MIN_VALUE && (i12 = jVar.W) != Integer.MIN_VALUE) {
                jVar.measure(i13, i12);
            }
        }
    }

    @Override
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b3.l0 l0Var = (b3.l0) this.A.get(childAt);
            if (childAt.isLayoutRequested() && l0Var != null) {
                b3.l0.X(l0Var, false, 7);
            }
        }
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
