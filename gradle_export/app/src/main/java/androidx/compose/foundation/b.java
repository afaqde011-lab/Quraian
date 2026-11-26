package androidx.compose.foundation;

import android.view.KeyEvent;
import b2.o;
import b2.r;
import f0.i;
import j3.k;
import t2.d;
import z.s0;
import z.v0;

public abstract class b {
    public static final r a(r rVar, i iVar, v0 v0Var, boolean z10, k kVar, u00.a aVar) {
        r rVarV;
        if (v0Var != null) {
            rVarV = new ClickableElement(iVar, v0Var, false, z10, null, kVar, aVar);
        } else if (v0Var == null) {
            rVarV = new ClickableElement(iVar, null, false, z10, null, kVar, aVar);
        } else {
            o oVar = o.A;
            rVarV = iVar != null ? s0.a(oVar, iVar, v0Var).V(new ClickableElement(iVar, null, false, z10, null, kVar, aVar)) : b2.a.a(oVar, new a(v0Var, z10, kVar, aVar));
        }
        return rVar.V(rVarV);
    }

    public static r b(r rVar, i iVar, v0 v0Var, boolean z10, k kVar, u00.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            kVar = null;
        }
        return a(rVar, iVar, v0Var, z11, kVar, aVar);
    }

    public static r c(String str, u00.a aVar, r rVar, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rVar.V(new ClickableElement(null, null, true, z11, str, null, aVar));
    }

    public static r d(r rVar, i iVar, u00.a aVar) {
        return rVar.V(new CombinedClickableElement(iVar, aVar));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jB = d.b(keyEvent);
        int i10 = t2.a.O;
        return t2.a.a(jB, t2.a.f14334h) || t2.a.a(jB, t2.a.f14342r) || t2.a.a(jB, t2.a.E) || t2.a.a(jB, t2.a.f14341q);
    }
}
