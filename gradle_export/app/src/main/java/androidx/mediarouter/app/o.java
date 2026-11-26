package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class o implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Map A;
    public final Map B;
    public final v C;

    public o(v vVar, HashMap map, HashMap map2) {
        this.C = vVar;
        this.A = map;
        this.B = map2;
    }

    @Override
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        r0 r0Var;
        v vVar = this.C;
        vVar.f1815f0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = vVar.f1818i0;
        if (hashSet == null || vVar.f1819j0 == null) {
            return;
        }
        int size = hashSet.size() - vVar.f1819j0.size();
        p pVar = new p(vVar, 0);
        int firstVisiblePosition = vVar.f1815f0.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = vVar.f1815f0.getChildCount();
            map = this.A;
            map2 = this.B;
            if (i10 >= childCount) {
                break;
            }
            View childAt = vVar.f1815f0.getChildAt(i10);
            o9.b0 b0Var = (o9.b0) vVar.f1816g0.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(b0Var);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (vVar.f1825p0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = vVar.f1818i0;
            if (hashSet2 != null && hashSet2.contains(b0Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(vVar.J0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(vVar.I0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(vVar.L0);
            if (!z10) {
                animationSet.setAnimationListener(pVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(b0Var);
            map2.remove(b0Var);
            i10++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            o9.b0 b0Var2 = (o9.b0) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(b0Var2);
            if (vVar.f1819j0.contains(b0Var2)) {
                r0Var = new r0(bitmapDrawable, rect2);
                r0Var.f1799h = 0.0f;
                r0Var.f1796e = vVar.K0;
                r0Var.f1795d = vVar.L0;
            } else {
                int i12 = vVar.f1825p0 * size;
                r0 r0Var2 = new r0(bitmapDrawable, rect2);
                r0Var2.f1798g = i12;
                r0Var2.f1796e = vVar.I0;
                r0Var2.f1795d = vVar.L0;
                r0Var2.l = new l9.f0(5, (Object) vVar, (Object) b0Var2, false);
                vVar.f1820k0.add(b0Var2);
                r0Var = r0Var2;
            }
            vVar.f1815f0.A.add(r0Var);
        }
    }
}
