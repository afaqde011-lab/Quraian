package wk;

import b2.i;
import b2.o;
import g00.b0;
import h00.q;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import q3.u;
import r30.k;
import r9.e;
import ta.c0;
import u00.n;

public final class a implements n {
    public final int A;
    public final long B;
    public final long C;
    public final u D;

    public a(int i, long j, long j2, u uVar) {
        this.A = i;
        this.B = j;
        this.C = j2;
        this.D = uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws IOException {
        g0 g0Var = (j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 0;
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i2 = this.A;
            String string = new StringBuilder((CharSequence) k.R0(String.valueOf(i2), "-")).reverse().toString();
            m.e(string, "<this>");
            c0.B(3, 3);
            int length = string.length();
            ArrayList arrayList = new ArrayList((length / 3) + (length % 3 == 0 ? 0 : 1));
            while (i >= 0 && i < length) {
                int i3 = i + 3;
                CharSequence it = string.subSequence(i, (i3 < 0 || i3 > length) ? length : i3);
                m.e(it, "it");
                arrayList.add(it.toString());
                i = i3;
            }
            String strR0 = q.R0(arrayList, " ", null, null, null, 62);
            m.e(strR0, "<this>");
            String string2 = new StringBuilder((CharSequence) strR0).reverse().toString();
            if (i2 < 0) {
                string2 = a1.b.o("-", string2);
            }
            i iVar = b2.b.E;
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new e(25);
                g0Var2.n0(objN);
            }
            u00.k kVar = (u00.k) objN;
            Object objN2 = g0Var2.N();
            if (objN2 == cVar) {
                objN2 = new e(26);
                g0Var2.n0(objN2);
            }
            w.m.a(string2, o.A, kVar, iVar, "animatedNumber", (u00.k) objN2, v1.d.d(1244664619, new c(0, this.B, this.C, this.D), g0Var), g0Var, 1797504, 0);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }
}
