package h1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import l1.i1;
import l1.p2;

public final class m0 implements AccessibilityManager.AccessibilityStateChangeListener, p2 {
    public final boolean A;
    public final boolean B;
    public final i1 C = l1.q.z(Boolean.FALSE);
    public final l0 D;
    public final k0 E;

    public m0(boolean z10, boolean z11, boolean z12) {
        this.A = z11;
        this.B = z12;
        this.D = z10 ? new l0() : null;
        this.E = (z11 || z12) ? new k0(this) : null;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && r30.k.A0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && r30.k.A0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object getValue() {
        boolean z10;
        if (((Boolean) this.C.getValue()).booleanValue()) {
            z10 = true;
            l0 l0Var = this.D;
            if (l0Var == null || !((Boolean) l0Var.A.getValue()).booleanValue()) {
                boolean z11 = this.A;
                k0 k0Var = this.E;
                if ((!z11 || k0Var == null || !((Boolean) k0Var.f6520a.getValue()).booleanValue()) && (!this.B || k0Var == null || !((Boolean) k0Var.f6521b.getValue()).booleanValue())) {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public final void onAccessibilityStateChanged(boolean z10) {
        this.C.setValue(Boolean.valueOf(z10));
    }
}
