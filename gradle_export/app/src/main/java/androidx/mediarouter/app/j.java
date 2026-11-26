package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.HashSet;

public final class j implements ViewTreeObserver.OnGlobalLayoutListener {
    public final v A;

    public j(v vVar) {
        this.A = vVar;
    }

    @Override
    public final void onGlobalLayout() {
        v vVar = this.A;
        vVar.f1815f0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = vVar.f1818i0;
        if (hashSet == null || hashSet.size() == 0) {
            vVar.i(true);
            return;
        }
        p pVar = new p(vVar, 1);
        int firstVisiblePosition = vVar.f1815f0.getFirstVisiblePosition();
        boolean z10 = false;
        for (int i10 = 0; i10 < vVar.f1815f0.getChildCount(); i10++) {
            View childAt = vVar.f1815f0.getChildAt(i10);
            if (vVar.f1818i0.contains((o9.b0) vVar.f1816g0.getItem(firstVisiblePosition + i10))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(vVar.J0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z10) {
                    alphaAnimation.setAnimationListener(pVar);
                    z10 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }
}
