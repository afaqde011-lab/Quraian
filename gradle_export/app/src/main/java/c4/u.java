package c4;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import l1.g0;
import l1.i1;
import l1.r1;
import z4.j0;
import z4.j1;

public final class u extends c3.a implements w, z4.r {
    public final Window J;
    public final i1 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;

    public u(Context context, Window window) {
        super(context, null);
        this.J = window;
        this.K = l1.q.z(s.f2844a);
        WeakHashMap weakHashMap = j0.f17198a;
        z4.d0.b(this, this);
        j0.i(this, new b4.b(this, 1));
    }

    @Override
    public final j1 B(View view, j1 j1Var) {
        if (!this.M) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return j1Var.f17202a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return j1Var;
    }

    @Override
    public final void a(l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1735448596);
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            ((u00.n) this.K.getValue()).invoke(g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b2.n(this, i10, 4);
        }
    }

    @Override
    public final void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.O;
    }

    @Override
    public final Window getWindow() {
        return this.J;
    }

    @Override
    public final void h(int i10, int i11) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.J;
        int i12 = (mode != Integer.MIN_VALUE || this.L || window.getAttributes().height != -2 || this.M) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.M || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.L) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
