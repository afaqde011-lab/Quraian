package og;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public final class f extends a {

    public final float f11965g;

    public final float f11966h;

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f11965g = resources.getDimension(2131165437);
        this.f11966h = resources.getDimension(2131165438);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f11957b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new p6.a(1));
        return animatorSet;
    }

    public final void b(float f3) {
        float interpolation = this.f11956a.getInterpolation(f3);
        View view = this.f11957b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f10 = this.f11965g / width;
        float f11 = this.f11966h / height;
        float fA = 1.0f - ag.a.a(0.0f, f10, interpolation);
        float fA2 = 1.0f - ag.a.a(0.0f, f11, interpolation);
        if (Float.isNaN(fA) || Float.isNaN(fA2)) {
            return;
        }
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != 0.0f ? fA / fA2 : 1.0f);
            }
        }
    }
}
