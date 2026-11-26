package a5;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class h extends AccessibilityNodeProvider {

    public final qj.c f190a;

    public h(qj.c cVar) {
        this.f190a = cVar;
    }

    @Override
    public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f190a.G(i10, new g(accessibilityNodeInfo), str, bundle);
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        g gVarI = this.f190a.I(i10);
        if (gVarI == null) {
            return null;
        }
        return gVarI.f187a;
    }

    @Override
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f190a.getClass();
        return null;
    }

    @Override
    public final AccessibilityNodeInfo findFocus(int i10) {
        g gVarL = this.f190a.L(i10);
        if (gVarL == null) {
            return null;
        }
        return gVarL.f187a;
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f190a.O(i10, i11, bundle);
    }
}
