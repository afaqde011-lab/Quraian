package h1;

import android.view.accessibility.AccessibilityManager;
import l1.i1;

public final class l0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final i1 A = l1.q.z(Boolean.FALSE);

    @Override
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.A.setValue(Boolean.valueOf(z10));
    }
}
