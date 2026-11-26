package cg;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

public final class a implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final int A;
    public final View B;
    public final l4.a C;

    public a(l4.a aVar, View view, int i10) {
        this.A = i10;
        this.C = aVar;
        this.B = view;
    }

    @Override
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.A) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.C;
                if (z10 && hideBottomViewOnScrollBehavior.f4086j == 1) {
                    hideBottomViewOnScrollBehavior.v(this.B);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.C;
                if (z10 && hideViewOnScrollBehavior.f4097j == 1) {
                    hideViewOnScrollBehavior.w(this.B);
                    break;
                }
                break;
        }
    }
}
