package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import og.f;
import ta.t;
import ua.e;
import vg.k;

public final class b extends AnimatorListenerAdapter {

    public final int f3149a;

    public final Object f3150b;

    public b(Object obj, int i10) {
        this.f3149a = i10;
        this.f3150b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3149a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3150b;
                actionBarOverlayLayout.W = null;
                actionBarOverlayLayout.J = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3149a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f3150b).f4087k = null;
                break;
            case 1:
                ((HideViewOnScrollBehavior) this.f3150b).f4098k = null;
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3150b;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                f fVar = (f) this.f3150b;
                fVar.f11957b.setTranslationY(0.0f);
                fVar.b(0.0f);
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3150b;
                actionBarOverlayLayout.W = null;
                actionBarOverlayLayout.J = false;
                break;
            case 5:
                ((t) this.f3150b).o();
                animator.removeListener(this);
                break;
            case 6:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3150b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.f4191p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f4191p.get()).requestLayout();
                    break;
                }
                break;
            case 7:
                e eVar = (e) this.f3150b;
                ArrayList arrayList = new ArrayList(eVar.E);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ColorStateList colorStateList = ((hg.a) arrayList.get(i10)).f7058b.O;
                    if (colorStateList != null) {
                        eVar.setTintList(colorStateList);
                    }
                }
                break;
            default:
                k kVar = (k) this.f3150b;
                kVar.p();
                kVar.f15664r.start();
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3149a) {
            case 7:
                e eVar = (e) this.f3150b;
                ArrayList arrayList = new ArrayList(eVar.E);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((hg.a) arrayList.get(i10)).a(eVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
