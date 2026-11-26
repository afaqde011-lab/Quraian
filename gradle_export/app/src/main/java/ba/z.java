package ba;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

public final class z extends w {

    public final a0 f2464q;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f2464q = a0Var;
    }

    @Override
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override
    public final int e(int i10) {
        return Math.min(100, super.e(i10));
    }

    @Override
    public final void h(View view, z0 z0Var) {
        a0 a0Var = this.f2464q;
        int[] iArrA = a0Var.a(a0Var.f2234a.getLayoutManager(), view);
        int i10 = iArrA[0];
        int i11 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
        if (iCeil > 0) {
            z0Var.f2465a = i10;
            z0Var.f2466b = i11;
            z0Var.f2467c = iCeil;
            z0Var.f2469e = this.f2454j;
            z0Var.f2470f = true;
        }
    }
}
