package w;

public final class z1 extends b2.q implements b3.y, b3.v1, b3.o, b3.j {
    public u1 O;

    @Override
    public final void J0() {
        this.O.f();
        b3.m.t(this, this.O.D);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new b3.n0(y0Var, this, l1VarO, 9));
    }

    @Override
    public final void i(b3.o0 o0Var) {
        h2.c cVarC;
        o0Var.a();
        u1 u1Var = this.O;
        u1Var.getClass();
        k2.b bVar = o0Var.A;
        z1.p pVar = u1Var.G;
        if (pVar.size() > 1) {
            h00.u.t0(pVar, new t1());
        }
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            k1 k1Var = (k1) pVar.get(i10);
            l2.b bVar2 = (l2.b) k1Var.M.getValue();
            if (bVar2 != null && (cVarC = k1Var.e().f15782c.d().c()) != null && k1Var.g()) {
                long jE = cVarC.e();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
                i2.g gVar = k1Var.J;
                if (gVar != null) {
                    a1.i iVar = bVar.B;
                    a1.i iVar2 = bVar.B;
                    long jQ = iVar.q();
                    iVar.n().i();
                    try {
                        ((a1.i) ((hf.c) iVar.B).B).n().e(gVar);
                        ((hf.c) iVar2.B).I(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            rd.a.x(o0Var, bVar2);
                            ((hf.c) iVar2.B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                            c.t(iVar, jQ);
                        } catch (Throwable th2) {
                            ((hf.c) iVar2.B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        c.t(iVar, jQ);
                        throw th3;
                    }
                } else {
                    a1.i iVar3 = bVar.B;
                    a1.i iVar4 = bVar.B;
                    ((hf.c) iVar3.B).I(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        rd.a.x(o0Var, bVar2);
                        ((hf.c) iVar4.B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                    } catch (Throwable th4) {
                        ((hf.c) iVar4.B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                        throw th4;
                    }
                }
            }
        }
    }

    @Override
    public final void t1() {
        b3.m.t(this, this.O.D);
        this.O.getClass();
    }

    @Override
    public final void u1() {
        this.O.getClass();
    }
}
