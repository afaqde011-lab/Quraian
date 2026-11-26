package m9;

import android.animation.ValueAnimator;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    public final int f10664a;

    public final Object f10665b;

    public g(Object obj, int i10) {
        this.f10664a = i10;
        this.f10665b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f10664a;
        Object obj = this.f10665b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                hVar.getClass();
                hVar.f10676i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.invalidate(hVar.A);
                break;
            default:
                vg.k kVar = (vg.k) obj;
                kVar.getClass();
                kVar.f15669d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
