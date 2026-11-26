package b4;

import android.view.View;
import android.view.ViewGroup;
import b3.l0;
import java.util.List;
import z2.w0;
import z2.x0;
import z2.y0;

public final class f implements w0 {

    public final z f2149a;

    public final l0 f2150b;

    public f(z zVar, l0 l0Var) {
        this.f2149a = zVar;
        this.f2150b = l0Var;
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        z zVar = this.f2149a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        zVar.measure(j.k(zVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return zVar.getMeasuredHeight();
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        z zVar = this.f2149a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        zVar.measure(iMakeMeasureSpec, j.k(zVar, 0, i10, layoutParams.height));
        return zVar.getMeasuredWidth();
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        z zVar = this.f2149a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        zVar.measure(j.k(zVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return zVar.getMeasuredHeight();
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        z zVar = this.f2149a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        zVar.measure(iMakeMeasureSpec, j.k(zVar, 0, i10, layoutParams.height));
        return zVar.getMeasuredWidth();
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        z zVar = this.f2149a;
        int childCount = zVar.getChildCount();
        h00.y yVar = h00.y.A;
        if (childCount == 0) {
            return y0Var.o0(y3.a.j(j9), y3.a.i(j9), yVar, c.C);
        }
        if (y3.a.j(j9) != 0) {
            zVar.getChildAt(0).setMinimumWidth(y3.a.j(j9));
        }
        if (y3.a.i(j9) != 0) {
            zVar.getChildAt(0).setMinimumHeight(y3.a.i(j9));
        }
        int iJ = y3.a.j(j9);
        int iH = y3.a.h(j9);
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        int iK = j.k(zVar, iJ, iH, layoutParams.width);
        int i10 = y3.a.i(j9);
        int iG = y3.a.g(j9);
        ViewGroup.LayoutParams layoutParams2 = zVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams2);
        zVar.measure(iK, j.k(zVar, i10, iG, layoutParams2.height));
        return y0Var.o0(zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), yVar, new d(zVar, this.f2150b, 1));
    }
}
