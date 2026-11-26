package g1;

import com.google.android.gms.cast.MediaError;

public final class y3 implements u00.n {
    public final int A = 2;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;

    public y3(a7 a7Var, u.v vVar, h hVar, boolean z10) {
        this.C = a7Var;
        this.D = vVar;
        this.E = hVar;
        this.B = z10;
    }

    public y3(w3 w3Var, boolean z10, u00.n nVar, v1.c cVar) {
        this.C = w3Var;
        this.B = z10;
        this.D = nVar;
        this.E = cVar;
    }

    public y3(boolean z10, f0.i iVar, t6 t6Var, i2.t0 t0Var) {
        this.B = z10;
        this.C = iVar;
        this.D = t6Var;
        this.E = t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                u00.n nVar = (u00.n) this.D;
                w3 w3Var = (w3) this.C;
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.c0(-864293207);
                    g0Var.r(false);
                    l1.t tVar = y0.f6028a;
                    boolean z10 = this.B;
                    l1.q.a(tVar.a(new i2.t(z10 ? w3Var.f6010a : w3Var.f6013d)), v1.d.d(-893579015, new n1(nVar, (v1.c) this.E, 2), jVar), jVar, 56);
                    if (nVar != null) {
                        g0Var.c0(-863394951);
                        l1.q.a(tVar.a(new i2.t(z10 ? w3Var.f6012c : w3Var.f6015f)), v1.d.d(-782441013, new i2(1, nVar), jVar), jVar, 56);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-863072055);
                        g0Var.r(false);
                    }
                } else {
                    g0Var.V();
                }
                break;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5.f5746a.a(true, this.B, (f0.i) this.C, null, (t6) this.D, (i2.t0) this.E, 0.0f, 0.0f, jVar2, 100663296, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l1.q.a(y0.f6028a.a(new i2.t(((a7) this.C).f5720f)), v1.d.d(-596940007, new p7((u.v) this.D, (h) this.E, this.B), jVar3), jVar3, 56);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
