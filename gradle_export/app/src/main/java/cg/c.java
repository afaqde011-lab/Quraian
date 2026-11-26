package cg;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.internal.measurement.z3;

public final class c extends z3 {

    public final int f3151d;

    @Override
    public final int B(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i10;
        switch (this.f3151d) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i10 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int C() {
        switch (this.f3151d) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public final ViewPropertyAnimator D(View view, int i10) {
        switch (this.f3151d) {
            case 0:
                return view.animate().translationY(i10);
            case 1:
                return view.animate().translationX(-i10);
            default:
                return view.animate().translationX(i10);
        }
    }
}
