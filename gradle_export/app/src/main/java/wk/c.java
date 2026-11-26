package wk;

import b2.o;
import b2.r;
import b3.g;
import b3.h;
import g00.b0;
import g1.z6;
import h0.i;
import h0.t1;
import h0.v1;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import m3.r0;
import q3.u;
import r9.e;
import u00.k;
import u00.p;
import x3.l;

public final class c implements p {
    public final int A;
    public final long B;
    public final long C;
    public final u D;

    public c(int i, long j, long j2, u uVar) {
        this.A = i;
        this.B = j;
        this.C = j2;
        this.D = uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                w.p AnimatedContent = (w.p) obj;
                String text = (String) obj2;
                g0 g0Var = (j) obj3;
                ((Integer) obj4).getClass();
                m.e(AnimatedContent, "$this$AnimatedContent");
                m.e(text, "text");
                v1 v1VarA = t1.a(i.a, b2.b.J, g0Var, 0);
                g0 g0Var2 = g0Var;
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC = b2.a.c(o.A, g0Var);
                b3.i.c.getClass();
                g gVar = h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(v1VarA, g0Var, h.f);
                q.I(m1VarM, g0Var, h.e);
                q.I(Integer.valueOf(iHashCode), g0Var, h.g);
                q.E(g0Var, h.h);
                q.I(rVarC, g0Var, h.d);
                g0Var2.c0(-1579188318);
                int i = 0;
                int i2 = 0;
                while (i < text.length()) {
                    char cCharAt = text.charAt(i);
                    int i3 = i2 + 1;
                    g0Var2.Z(-1544936072, Integer.valueOf(text.length() - i2));
                    Character chValueOf = Character.valueOf(cCharAt);
                    Object objN = g0Var2.N();
                    if (objN == l1.i.a) {
                        objN = new e(27);
                        g0Var2.n0(objN);
                    }
                    w.m.a(chValueOf, (r) null, (k) objN, (b2.d) null, "animatedNumberDigit", (k) null, v1.d.d(1807076546, new c(1, this.B, this.C, this.D), g0Var), g0Var, 1597824, 42);
                    g0Var2.r(false);
                    i++;
                    i2 = i3;
                }
                g0Var2.r(false);
                g0Var2.r(true);
                break;
            default:
                w.p AnimatedContent2 = (w.p) obj;
                char cCharValue = ((Character) obj2).charValue();
                ((Integer) obj4).getClass();
                m.e(AnimatedContent2, "$this$AnimatedContent");
                String strValueOf = String.valueOf(cCharValue);
                long j = this.B;
                long j2 = this.C;
                z6.b(strValueOf, (r) null, j, j2, this.D, (q3.i) null, 0L, (l) null, (x3.k) null, j2, 0, false, 0, 0, (k) null, (r0) null, (j) obj3, 0, 0, 260010);
                break;
        }
        return b0.a;
    }
}
