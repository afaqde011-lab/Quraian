package a1;

import android.view.autofill.AutofillValue;
import java.util.List;

public final class v implements u00.k {
    public final int A;
    public final x B;

    public v(x xVar, int i10) {
        this.A = i10;
        this.B = xVar;
    }

    public v(x xVar, j3.a0 a0Var) {
        this.A = 3;
        this.B = xVar;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        boolean z10 = false;
        x xVar = this.B;
        switch (i10) {
            case 0:
                l1.i1 i1Var = xVar.S.f12655t;
                Boolean bool = Boolean.TRUE;
                i1Var.setValue(bool);
                xVar.S.f12654s.setValue(bool);
                q0.j1 j1Var = xVar.S;
                AutofillValue autofillValue = ((c2.f) obj).f2612a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                kotlin.jvm.internal.m.c(textValue, "null cannot be cast to non-null type kotlin.String");
                x.E1(j1Var, (String) textValue, xVar.T);
                return bool;
            case 1:
                List list = (List) obj;
                if (xVar.S.d() != null) {
                    q0.e2 e2VarD = xVar.S.d();
                    kotlin.jvm.internal.m.b(e2VarD);
                    list.add(e2VarD.f12608a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                x.E1(xVar.S, ((m3.h) obj).B, xVar.T);
                return Boolean.TRUE;
            default:
                m3.h hVar = (m3.h) obj;
                if (xVar.T) {
                    r3.b0 b0Var = xVar.S.f12642e;
                    if (b0Var != null) {
                        List listS = va.a.S(new r3.h(), new r3.a(hVar, 1));
                        q0.j1 j1Var2 = xVar.S;
                        q3.e0 e0Var = j1Var2.f12641d;
                        q0.r0 r0Var = j1Var2.f12657v;
                        r3.w wVarD = e0Var.d(listS);
                        b0Var.a(null, wVarD);
                        r0Var.invoke(wVarD);
                    } else {
                        r3.w wVar = xVar.R;
                        String str = wVar.f13099a.B;
                        long j9 = wVar.f13100b;
                        int i11 = m3.q0.f10519c;
                        String string = r30.k.T0(str, (int) (j9 >> 32), (int) (j9 & 4294967295L), hVar).toString();
                        int length = hVar.B.length() + ((int) (xVar.R.f13100b >> 32));
                        xVar.S.f12657v.invoke(new r3.w(string, m3.h0.b(length, length), 4));
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
