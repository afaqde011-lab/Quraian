package b4;

import android.view.WindowInsets;
import androidx.compose.ui.node.Owner;
import b3.l0;
import g00.b0;
import java.util.HashMap;
import z2.a0;
import z4.j0;
import z4.j1;

public final class d extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final z B;
    public final l0 C;

    public d(z zVar, l0 l0Var, int i10) {
        super(1);
        this.A = i10;
        this.B = zVar;
        this.C = l0Var;
    }

    public final Object invoke(Object obj) {
        WindowInsets windowInsetsF;
        switch (this.A) {
            case 0:
                Owner owner = (Owner) obj;
                c3.z zVar = owner instanceof c3.z ? (c3.z) owner : null;
                z zVar2 = this.B;
                if (zVar != null) {
                    HashMap<j, l0> holderToLayoutNode = zVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    l0 l0Var = this.C;
                    holderToLayoutNode.put(zVar2, l0Var);
                    zVar.getAndroidViewsHandler$ui().addView(zVar2);
                    zVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(l0Var, zVar2);
                    zVar2.setImportantForAccessibility(1);
                    j0.g(zVar2, new c3.p(zVar, l0Var, zVar));
                }
                if (zVar2.getView().getParent() != zVar2) {
                    zVar2.addView(zVar2.getView());
                }
                break;
            case 1:
                l.d(this.B, this.C);
                break;
            default:
                l0 l0Var2 = this.C;
                z zVar3 = this.B;
                l.d(zVar3, l0Var2);
                ((c3.z) zVar3.C).f2803k0 = true;
                int[] iArr = zVar3.N;
                int i10 = iArr[0];
                int i11 = iArr[1];
                zVar3.getView().getLocationOnScreen(iArr);
                long j9 = zVar3.O;
                long jP = ((a0) obj).p();
                zVar3.O = jP;
                j1 j1Var = zVar3.P;
                if (j1Var != null && ((i10 != iArr[0] || i11 != iArr[1] || !y3.l.b(j9, jP)) && (windowInsetsF = zVar3.m(j1Var).f()) != null)) {
                    zVar3.getView().dispatchApplyWindowInsets(windowInsetsF);
                }
                break;
        }
        return b0.a;
    }
}
