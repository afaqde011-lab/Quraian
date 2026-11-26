package m9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class x extends AnimatorListenerAdapter {

    public final int f10771a;

    public final z f10772b;

    public x(z zVar, int i10) {
        this.f10771a = i10;
        this.f10772b = zVar;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f10771a) {
            case 0:
                z zVar = this.f10772b;
                View view = zVar.f10777b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = zVar.f10778c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = zVar.f10779d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = zVar.f10781f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f10772b.i(0);
                break;
            case 3:
                this.f10772b.i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = this.f10772b.f10782g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup5 = this.f10772b.f10784i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f10771a;
        z zVar = this.f10772b;
        switch (i10) {
            case 0:
                View view = zVar.f10786k;
                if ((view instanceof h) && !zVar.B) {
                    h hVar = (h) view;
                    ValueAnimator valueAnimator = hVar.f10675h0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(hVar.f10676i0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = zVar.f10777b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = zVar.f10778c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = zVar.f10779d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = zVar.f10781f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(zVar.B ? 0 : 4);
                }
                View view3 = zVar.f10786k;
                if ((view3 instanceof h) && !zVar.B) {
                    h hVar2 = (h) view3;
                    ValueAnimator valueAnimator2 = hVar2.f10675h0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    hVar2.f10677j0 = false;
                    valueAnimator2.setFloatValues(hVar2.f10676i0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                zVar.i(4);
                break;
            case 3:
                zVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = zVar.f10784i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    ViewGroup viewGroup5 = zVar.f10784i;
                    viewGroup5.setTranslationX(viewGroup5.getWidth());
                    ViewGroup viewGroup6 = zVar.f10784i;
                    viewGroup6.scrollTo(viewGroup6.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup7 = zVar.f10782g;
                if (viewGroup7 != null) {
                    viewGroup7.setVisibility(0);
                }
                break;
        }
    }
}
