package j3;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import b3.l0;
import u.d0;

public final class u {

    public final l0 f7973a;

    public final f f7974b;

    public final u.l f7975c;

    public final d0 f7976d = new d0(2);

    public u(l0 l0Var, f fVar, u.w wVar) {
        this.f7973a = l0Var;
        this.f7974b = fVar;
        this.f7975c = wVar;
    }

    public final s a() {
        return new s(this.f7974b, false, this.f7973a, new o());
    }

    public final void b(l0 l0Var, o oVar) {
        String str;
        String strH1;
        l3.a aVar;
        l3.a aVar2;
        c2.f fVar;
        c2.f fVar2;
        d0 d0Var = this.f7976d;
        Object[] objArr = d0Var.f14837a;
        int i10 = d0Var.f14838b;
        for (int i11 = 0; i11 < i10; i11++) {
            c2.c cVar = (c2.c) objArr[i11];
            u.x xVar = cVar.H;
            c3.z zVar = cVar.C;
            me.i iVar = cVar.A;
            AutofillManager autofillManager = (AutofillManager) iVar.B;
            o oVarZ = l0Var.z();
            int i12 = l0Var.B;
            if (oVar != null) {
                Object objG = oVar.A.g(w.F);
                if (objG == null) {
                    objG = null;
                }
                m3.h hVar = (m3.h) objG;
                if (hVar != null) {
                    str = hVar.B;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (oVarZ != null) {
                Object objG2 = oVarZ.A.g(w.F);
                if (objG2 == null) {
                    objG2 = null;
                }
                m3.h hVar2 = (m3.h) objG2;
                if (hVar2 != null) {
                    strH1 = hVar2.B;
                } else {
                    strH1 = null;
                }
            } else {
                strH1 = null;
            }
            if (str != strH1) {
                if (str == null) {
                    iVar.G(zVar, i12, true);
                } else if (strH1 == null) {
                    iVar.G(zVar, i12, false);
                } else if (kotlin.jvm.internal.m.a((c2.d) v.f(oVarZ, w.f7994s), c2.k.f2615a)) {
                    if (strH1.length() >= 5000) {
                        strH1 = (Character.isHighSurrogate(strH1.charAt(4999)) && Character.isLowSurrogate(strH1.charAt(5000))) ? r30.k.h1(4999, strH1) : r30.k.h1(5000, strH1);
                    }
                    autofillManager.notifyValueChanged(zVar, i12, AutofillValue.forText(strH1));
                }
            }
            if (oVar != null) {
                Object objG3 = oVar.A.g(w.L);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar = (l3.a) objG3;
            } else {
                aVar = null;
            }
            if (oVarZ != null) {
                Object objG4 = oVarZ.A.g(w.L);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar2 = (l3.a) objG4;
            } else {
                aVar2 = null;
            }
            if (aVar != aVar2) {
                if (aVar == null) {
                    iVar.G(zVar, i12, true);
                } else if (aVar2 == null) {
                    iVar.G(zVar, i12, false);
                } else if (kotlin.jvm.internal.m.a((c2.d) v.f(oVarZ, w.f7994s), c2.k.f2616b)) {
                    int iOrdinal = aVar2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(zVar, i12, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (oVar != null) {
                Object objG5 = oVar.A.g(w.f7995t);
                if (objG5 == null) {
                    objG5 = null;
                }
                fVar = (c2.f) objG5;
            } else {
                fVar = null;
            }
            if (oVarZ != null) {
                Object objG6 = oVarZ.A.g(w.f7995t);
                if (objG6 == null) {
                    objG6 = null;
                }
                fVar2 = (c2.f) objG6;
            } else {
                fVar2 = null;
            }
            if (!kotlin.jvm.internal.m.a(fVar, fVar2)) {
                if (fVar == null) {
                    iVar.G(zVar, i12, true);
                } else if (fVar2 == null) {
                    iVar.G(zVar, i12, false);
                } else {
                    autofillManager.notifyValueChanged(zVar, i12, fVar2.f2612a);
                }
            }
            boolean z10 = oVar != null && oVar.A.b(w.f7993r);
            boolean z11 = oVarZ != null && oVarZ.A.b(w.f7993r);
            if (z10 != z11) {
                if (z11) {
                    xVar.a(i12);
                } else {
                    xVar.g(i12);
                }
            }
        }
    }
}
