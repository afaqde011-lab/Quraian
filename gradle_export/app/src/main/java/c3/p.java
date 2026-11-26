package c3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class p extends z4.b {
    public final z D;
    public final b3.l0 E;
    public final z F;

    public p(z zVar, b3.l0 l0Var, z zVar2) {
        this.D = zVar;
        this.E = l0Var;
        this.F = zVar2;
    }

    @Override
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        z zVar = this.D;
        f0 f0Var = zVar.f2787c0;
        if (f0Var.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        b3.l0 l0Var = this.E;
        b3.l0 l0VarX = l0Var.x();
        while (true) {
            if (l0VarX == null) {
                l0VarX = null;
                break;
            } else if (l0VarX.f2059g0.j(8)) {
                break;
            } else {
                l0VarX = l0VarX.x();
            }
        }
        Integer numValueOf = l0VarX != null ? Integer.valueOf(l0VarX.B) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == zVar.getSemanticsOwner().a().f7970f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        gVar.f188b = iIntValue;
        z zVar2 = this.F;
        accessibilityNodeInfo.setParent(zVar2, iIntValue);
        int i10 = l0Var.B;
        int iD = f0Var.f2657b0.d(i10, -1);
        if (iD != -1) {
            b4.j jVarV = m0.v(zVar.getAndroidViewsHandler$ui(), iD);
            if (jVarV != null) {
                accessibilityNodeInfo.setTraversalBefore(jVarV);
            } else {
                accessibilityNodeInfo.setTraversalBefore(zVar2, iD);
            }
            z.c(zVar, i10, accessibilityNodeInfo, f0Var.f2659d0);
        }
        int iD2 = f0Var.f2658c0.d(i10, -1);
        if (iD2 != -1) {
            b4.j jVarV2 = m0.v(zVar.getAndroidViewsHandler$ui(), iD2);
            if (jVarV2 != null) {
                accessibilityNodeInfo.setTraversalAfter(jVarV2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(zVar2, iD2);
            }
            z.c(zVar, i10, accessibilityNodeInfo, f0Var.f2660e0);
        }
    }
}
