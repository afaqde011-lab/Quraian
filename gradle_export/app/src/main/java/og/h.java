package og;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

public final class h extends a {

    public final float f11970g;

    public final float f11971h;

    public final float f11972i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f11970g = resources.getDimension(2131165442);
        this.f11971h = resources.getDimension(2131165441);
        this.f11972i = resources.getDimension(2131165443);
    }

    public final void a(float f3, int i10, boolean z10) {
        float interpolation = this.f11956a.getInterpolation(f3);
        View view = this.f11957b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = view.getWidth();
        int height = view.getHeight();
        float f10 = width;
        if (f10 > 0.0f) {
            float f11 = height;
            if (f11 <= 0.0f) {
                return;
            }
            float f12 = this.f11970g / f10;
            float f13 = this.f11971h / f10;
            float f14 = this.f11972i / f11;
            if (z11) {
                f10 = 0.0f;
            }
            view.setPivotX(f10);
            if (!z12) {
                f13 = -f12;
            }
            float fA = ag.a.a(0.0f, f13, interpolation);
            float f15 = fA + 1.0f;
            float fA2 = 1.0f - ag.a.a(0.0f, f14, interpolation);
            if (Float.isNaN(f15) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f15);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f16 = z12 ? 1.0f - fA : 1.0f;
                    float f17 = fA2 != 0.0f ? (f15 / fA2) * f16 : 1.0f;
                    if (!Float.isNaN(f16) && !Float.isNaN(f17)) {
                        childAt.setScaleX(f16);
                        childAt.setScaleY(f17);
                    }
                }
            }
        }
    }
}
