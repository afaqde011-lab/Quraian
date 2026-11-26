package h1;

import android.view.accessibility.AccessibilityManager;
import l1.i1;

public final class k0 implements AccessibilityManager.AccessibilityServicesStateChangeListener {

    public final i1 f6520a;

    public final i1 f6521b;

    public k0(m0 m0Var) {
        Boolean bool = Boolean.FALSE;
        this.f6520a = l1.q.z(bool);
        this.f6521b = l1.q.z(bool);
    }

    @Override
    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f6520a.setValue(Boolean.valueOf(m0.a(accessibilityManager)));
        this.f6521b.setValue(Boolean.valueOf(m0.c(accessibilityManager)));
    }
}
