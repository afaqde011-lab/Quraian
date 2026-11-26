package g1;

public final class w7 implements u00.o {
    public final r3.w A;
    public final f0.i B;
    public final t6 C;

    public w7(r3.w wVar, f0.i iVar, t6 t6Var) {
        this.A = wVar;
        this.B = iVar;
        this.C = t6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u00.n nVar = (u00.n) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.g0) jVar).i(nVar) ? 4 : 2;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            c5 c5Var = c5.f5746a;
            String str = this.A.f13099a.B;
            float f3 = 0;
            h0.p1 p1Var = new h0.p1(f3, f3, f3, f3);
            f0.i iVar = this.B;
            t6 t6Var = this.C;
            c5Var.b(str, nVar, true, true, r3.d0.A, iVar, false, null, null, null, t6Var, p1Var, v1.d.d(769667466, new w(iVar, t6Var, 7), jVar), jVar, ((iIntValue << 3) & 112) | 224640, 14352384, 16320);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
