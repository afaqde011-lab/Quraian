package b4;

import android.graphics.Rect;
import android.view.View;
import g00.b0;
import g2.a0;

public final class t extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final u B;

    public t(u uVar, int i10) {
        super(1);
        this.A = i10;
        this.B = uVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                g2.a aVar = (g2.a) obj;
                u uVar = this.B;
                View viewC = l.c(uVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    g2.l focusOwner = ((c3.z) b3.m.z(uVar)).getFocusOwner();
                    View viewA = b3.m.A(uVar);
                    Integer numC = g2.h.c(aVar.f6061a);
                    int[] iArr = new int[2];
                    viewA.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    a0 a0VarF = g2.d.f(((g2.n) focusOwner).f6073c);
                    Rect rect = null;
                    h2.c cVarI = a0VarF != null ? g2.d.i(a0VarF) : null;
                    if (cVarI != null) {
                        int i10 = (int) cVarI.f6546a;
                        int i11 = iArr[0];
                        int i12 = iArr2[0];
                        int i13 = (int) cVarI.f6547b;
                        int i14 = iArr[1];
                        int i15 = iArr2[1];
                        rect = new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) cVarI.f6548c) + i11) - i12, (((int) cVarI.f6549d) + i14) - i15);
                    }
                    if (!g2.h.b(viewC, numC, rect)) {
                        aVar.f6062b = true;
                    }
                }
                break;
            default:
                l.c(this.B);
                break;
        }
        return b0.a;
    }
}
