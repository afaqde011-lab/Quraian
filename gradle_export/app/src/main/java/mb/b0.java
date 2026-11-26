package mb;

import l1.g0;
import x.n1;
import z2.l1;
import z2.v0;
import z2.y0;

public final class b0 extends kotlin.jvm.internal.n implements u00.o {
    public final int A;
    public final g00.e B;
    public final Object C;

    public b0(g00.e eVar, Object obj, int i10) {
        super(3);
        this.A = i10;
        this.B = eVar;
        this.C = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVarJ;
        boolean z10;
        g0 g0Var;
        u00.p pVar;
        g0 g0Var2;
        u00.p pVar2;
        long j9;
        switch (this.A) {
            case 0:
                x xVar = (x) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((g0) jVar).g(xVar) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    g0 g0Var3 = (g0) jVar;
                    if (g0Var3.C()) {
                        g0Var3.V();
                    } else {
                        hVarJ = xVar.f10819b.j();
                        z10 = true;
                        if (hVarJ instanceof f) {
                            g0Var2 = (g0) jVar;
                            g0Var2.d0(-418317557);
                            pVar2 = this.B;
                            if (pVar2 != null) {
                                pVar2.invoke(xVar, hVarJ, g0Var2, Integer.valueOf((iIntValue & 14) | 64));
                                z10 = false;
                            }
                            g0Var2.r(false);
                        } else if (hVarJ instanceof g) {
                            g0 g0Var4 = (g0) jVar;
                            g0Var4.d0(-418317557);
                            g0Var4.r(false);
                        } else if (hVarJ instanceof e) {
                            g0Var = (g0) jVar;
                            g0Var.d0(-418317557);
                            pVar = (u00.p) this.C;
                            if (pVar != null) {
                                pVar.invoke(xVar, hVarJ, g0Var, Integer.valueOf((iIntValue & 14) | 64));
                                z10 = false;
                            }
                            g0Var.r(false);
                        } else if (hVarJ instanceof d) {
                            g0 g0Var5 = (g0) jVar;
                            g0Var5.d0(-418301399);
                            g0Var5.r(false);
                        } else {
                            g0 g0Var6 = (g0) jVar;
                            g0Var6.d0(-418301339);
                            g0Var6.r(false);
                        }
                        if (z10) {
                            l.f(xVar, null, null, null, null, 0.0f, false, jVar, iIntValue & 14);
                        }
                    }
                } else {
                    hVarJ = xVar.f10819b.j();
                    z10 = true;
                    if (hVarJ instanceof f) {
                        g0Var2 = (g0) jVar;
                        g0Var2.d0(-418317557);
                        pVar2 = this.B;
                        if (pVar2 != null) {
                            pVar2.invoke(xVar, hVarJ, g0Var2, Integer.valueOf((iIntValue & 14) | 64));
                            z10 = false;
                        }
                        g0Var2.r(false);
                    } else if (hVarJ instanceof g) {
                        g0 g0Var7 = (g0) jVar;
                        g0Var7.d0(-418317557);
                        g0Var7.r(false);
                    } else if (hVarJ instanceof e) {
                        g0Var = (g0) jVar;
                        g0Var.d0(-418317557);
                        pVar = (u00.p) this.C;
                        if (pVar != null) {
                            pVar.invoke(xVar, hVarJ, g0Var, Integer.valueOf((iIntValue & 14) | 64));
                            z10 = false;
                        }
                        g0Var.r(false);
                    } else if (hVarJ instanceof d) {
                        g0 g0Var8 = (g0) jVar;
                        g0Var8.d0(-418301399);
                        g0Var8.r(false);
                    } else {
                        g0 g0Var9 = (g0) jVar;
                        g0Var9.d0(-418301339);
                        g0Var9.r(false);
                    }
                    if (z10) {
                        l.f(xVar, null, null, null, null, 0.0f, false, jVar, iIntValue & 14);
                    }
                }
                return g00.b0.a;
            default:
                y0 y0Var = (y0) obj;
                l1 l1VarO = ((v0) obj2).O(((y3.a) obj3).f16587a);
                if (!y0Var.w0() || ((Boolean) this.B.invoke(((n1) this.C).f16326d.getValue())).booleanValue()) {
                    j9 = (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L);
                } else {
                    j9 = 0;
                }
                return y0Var.o0((int) (j9 >> 32), (int) (4294967295L & j9), h00.y.A, new w.b0(l1VarO, 0));
        }
    }
}
