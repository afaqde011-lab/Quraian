package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class n extends Animation {
    public final int A;
    public final int B;
    public final int C;
    public final View D;

    public n(int i10, int i11, View view, int i12) {
        this.A = i12;
        this.B = i10;
        this.C = i11;
        this.D = view;
    }

    @Override
    public final void applyTransformation(float f3, Transformation transformation) {
        int i10 = this.A;
        View view = this.D;
        int i11 = this.C;
        int i12 = this.B;
        switch (i10) {
            case 0:
                v.m(view, i12 - ((int) ((i12 - i11) * f3)));
                break;
            default:
                int i13 = i11 + ((int) ((i12 - i11) * f3));
                int i14 = q0.f1766u0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
