package g1;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.Cast;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

public abstract class x5 {

    public static final f1.b f6026a = new f1.b();

    public static final void a(u00.a aVar, b2.r rVar, boolean z10, i2.t0 t0Var, r rVar2, u uVar, h0.n1 n1Var, f0.i iVar, u00.o oVar, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar3;
        int i13;
        boolean z11;
        int i14;
        i2.t0 t0VarA;
        u uVar2;
        int i15;
        int i16;
        h0.n1 n1Var2;
        int i17;
        int i18;
        f0.i iVar2;
        int i19;
        boolean z12;
        boolean z13;
        b2.r rVar4;
        h0.n1 n1Var3;
        boolean z14;
        i2.t0 t0Var2;
        u uVar3;
        f0.i iVar3;
        l1.r1 r1VarT;
        u uVar4;
        i2.t0 t0Var3;
        f0.i iVar4;
        Object obj;
        f0.i iVar5;
        long j9;
        long j10;
        int i20;
        Object objN;
        z1.p pVar;
        boolean zG;
        Object objN2;
        f0.h hVar;
        float f3;
        Object objN3;
        x.b bVar;
        boolean zI;
        Object objN4;
        u uVar5;
        x.j jVar2;
        ?? r4;
        float f10;
        Object objN5;
        f0.i iVar6;
        Object objN6;
        Object objN7;
        int i21;
        int i22;
        int i23;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1310015664);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                rVar3 = rVar;
                i12 |= g0Var.g(rVar3) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (g0Var.h(z11)) {
                        i14 = 256;
                    } else {
                        i14 = Cast.MAX_NAMESPACE_LENGTH;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        t0VarA = t0Var;
                        int i25 = g0Var.g(t0VarA) ? 2048 : 1024;
                        i12 |= i25;
                    } else {
                        t0VarA = t0Var;
                    }
                    i12 |= i25;
                } else {
                    t0VarA = t0Var;
                }
                if ((i10 & 24576) == 0) {
                    if (g0Var.g(rVar2)) {
                        i23 = 16384;
                    } else {
                        i23 = 8192;
                    }
                    i12 |= i23;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        uVar2 = uVar;
                        if (g0Var.g(uVar2)) {
                            i22 = 131072;
                        }
                        i12 |= i22;
                    } else {
                        uVar2 = uVar;
                    }
                    i22 = Cast.MAX_MESSAGE_LENGTH;
                    i12 |= i22;
                } else {
                    uVar2 = uVar;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (g0Var.g(null)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
                i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
                if (i16 != 0) {
                    i12 |= 12582912;
                    n1Var2 = n1Var;
                } else {
                    n1Var2 = n1Var;
                    if ((i10 & 12582912) == 0) {
                        if (g0Var.g(n1Var2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                }
                i18 = i11 & 256;
                if (i18 != 0) {
                    i12 |= 100663296;
                    iVar2 = iVar;
                } else {
                    iVar2 = iVar;
                    if ((i10 & 100663296) == 0) {
                        if (g0Var.g(iVar2)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 805306368) == 0) {
                    if (g0Var.i(oVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                z12 = true;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (g0Var.S(i12 & 1, z13)) {
                    g0Var.X();
                    if ((i10 & 1) != 0 || g0Var.A()) {
                        if (i24 != 0) {
                            rVar3 = b2.o.A;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var = s.f5954a;
                            i12 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var);
                        }
                        if ((i11 & 32) != 0) {
                            h0.p1 p1Var2 = s.f5954a;
                            uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                            i12 &= -458753;
                        } else {
                            uVar4 = uVar2;
                        }
                        if (i16 != 0) {
                            n1Var2 = s.f5954a;
                        }
                        t0Var3 = t0VarA;
                        if (i18 != 0) {
                            uVar2 = uVar4;
                            iVar4 = null;
                        } else {
                            iVar4 = iVar2;
                            uVar2 = uVar4;
                        }
                    } else {
                        g0Var.V();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        t0Var3 = t0VarA;
                        iVar4 = iVar2;
                    }
                    g0Var.s();
                    obj = l1.i.f9868a;
                    if (iVar4 == null) {
                        g0Var.c0(1691738187);
                        objN7 = g0Var.N();
                        if (objN7 == obj) {
                            objN7 = w.c.g(g0Var);
                        }
                        iVar5 = (f0.i) objN7;
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-499617780);
                        g0Var.r(false);
                        iVar5 = iVar4;
                    }
                    if (z11) {
                        j9 = rVar2.f5944a;
                    } else {
                        j9 = rVar2.f5946c;
                    }
                    long j11 = j9;
                    if (z11) {
                        j10 = rVar2.f5945b;
                    } else {
                        j10 = rVar2.f5947d;
                    }
                    if (uVar2 == null) {
                        g0Var.c0(1691921830);
                        g0Var.r(false);
                        iVar4 = iVar4;
                        r4 = 0;
                        iVar5 = iVar5;
                        n1Var2 = n1Var2;
                        uVar5 = uVar2;
                        jVar2 = null;
                    } else {
                        g0Var.c0(-499611205);
                        i20 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new z1.p();
                            g0Var.n0(objN);
                        }
                        pVar = (z1.p) objN;
                        zG = g0Var.g(iVar5);
                        objN2 = g0Var.N();
                        if (zG || objN2 == obj) {
                            objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                            g0Var.n0(objN2);
                        }
                        l1.q.i(iVar5, g0Var, (u00.n) objN2);
                        hVar = (f0.h) h00.q.U0(pVar);
                        if (!z11) {
                            f3 = uVar2.f5997e;
                        } else if (hVar instanceof f0.k) {
                            f3 = uVar2.f5994b;
                        } else if (hVar instanceof f0.f) {
                            f3 = uVar2.f5996d;
                        } else if (hVar instanceof f0.d) {
                            f3 = uVar2.f5995c;
                        } else {
                            f3 = uVar2.f5993a;
                        }
                        objN3 = g0Var.N();
                        if (objN3 == obj) {
                            objN3 = new x.b(new y3.f(f3), x.c.m, null, 12);
                            g0Var.n0(objN3);
                        }
                        bVar = (x.b) objN3;
                        y3.f fVar = new y3.f(f3);
                        boolean zI2 = g0Var.i(bVar) | g0Var.d(f3) | ((((i20 & 14) ^ 6) <= 4 && g0Var.h(z11)) || (i20 & 6) == 4);
                        if ((((i20 & 896) ^ 384) > 256 || !g0Var.g(uVar2)) && (i20 & 384) != 256) {
                        }
                        zI = zI2 | z12 | g0Var.i(hVar);
                        objN4 = g0Var.N();
                        if (!zI || objN4 == obj) {
                            uVar5 = uVar2;
                            objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                            g0Var.n0(objN4);
                        } else {
                            uVar5 = uVar2;
                        }
                        l1.q.i(fVar, g0Var, (u00.n) objN4);
                        jVar2 = bVar.f16234c;
                        r4 = 0;
                        g0Var.r(false);
                    }
                    if (jVar2 != null) {
                        f10 = ((y3.f) jVar2.B.getValue()).A;
                    } else {
                        f10 = (float) r4;
                    }
                    objN5 = g0Var.N();
                    if (objN5 == obj) {
                        objN5 = new e6.c(17);
                        g0Var.n0(objN5);
                    }
                    b2.r rVarC = j3.q.c(rVar3, r4, (u00.k) objN5);
                    h0.n1 n1Var4 = n1Var2;
                    v1.c cVarD = v1.d.d(-535639973, new x(j10, n1Var4, oVar, 0), g0Var);
                    l1.t tVar = s6.f5961a;
                    float f11 = (float) r4;
                    if (iVar5 == null) {
                        g0Var.c0(-1701037204);
                        objN6 = g0Var.N();
                        if (objN6 == obj) {
                            objN6 = w.c.g(g0Var);
                        }
                        g0Var.r(r4);
                        iVar6 = (f0.i) objN6;
                    } else {
                        g0Var.c0(2023337163);
                        g0Var.r(r4);
                        iVar6 = iVar5;
                    }
                    l1.t tVar2 = s6.f5961a;
                    float f12 = ((y3.f) g0Var.k(tVar2)).A + f11;
                    boolean z15 = z11;
                    l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(j10)), tVar2.a(new y3.f(f12))}, v1.d.d(849208527, new q6(rVarC, t0Var3, j11, f12, iVar6, z15, aVar, f10, cVarD), g0Var), g0Var, 56);
                    rVar4 = rVar3;
                    n1Var3 = n1Var4;
                    t0Var2 = t0Var3;
                    z14 = z15;
                    uVar3 = uVar5;
                    iVar3 = iVar4;
                } else {
                    g0Var.V();
                    rVar4 = rVar3;
                    n1Var3 = n1Var2;
                    z14 = z11;
                    t0Var2 = t0VarA;
                    uVar3 = uVar2;
                    iVar3 = iVar2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new v(aVar, rVar4, z14, t0Var2, rVar2, uVar3, n1Var3, iVar3, oVar, i10, i11);
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    t0VarA = t0Var;
                    if (g0Var.g(t0VarA)) {
                    }
                    i12 |= i25;
                } else {
                    t0VarA = t0Var;
                }
                i12 |= i25;
            } else {
                t0VarA = t0Var;
            }
            if ((i10 & 24576) == 0) {
                if (g0Var.g(rVar2)) {
                    i23 = 16384;
                } else {
                    i23 = 8192;
                }
                i12 |= i23;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    uVar2 = uVar;
                    if (g0Var.g(uVar2)) {
                        i22 = 131072;
                    }
                    i12 |= i22;
                } else {
                    uVar2 = uVar;
                }
                i22 = Cast.MAX_MESSAGE_LENGTH;
                i12 |= i22;
            } else {
                uVar2 = uVar;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (g0Var.g(null)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i16 != 0) {
                i12 |= 12582912;
                n1Var2 = n1Var;
            } else {
                n1Var2 = n1Var;
                if ((i10 & 12582912) == 0) {
                    if (g0Var.g(n1Var2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
            }
            i18 = i11 & 256;
            if (i18 != 0) {
                i12 |= 100663296;
                iVar2 = iVar;
            } else {
                iVar2 = iVar;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.g(iVar2)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 805306368) == 0) {
                if (g0Var.i(oVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            z12 = true;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (g0Var.S(i12 & 1, z13)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = b2.o.A;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var3 = s.f5954a;
                        i12 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var);
                    }
                    if ((i11 & 32) != 0) {
                        h0.p1 p1Var4 = s.f5954a;
                        uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                        i12 &= -458753;
                    } else {
                        uVar4 = uVar2;
                    }
                    if (i16 != 0) {
                        n1Var2 = s.f5954a;
                    }
                    t0Var3 = t0VarA;
                    if (i18 != 0) {
                        uVar2 = uVar4;
                        iVar4 = null;
                    } else {
                        iVar4 = iVar2;
                        uVar2 = uVar4;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = b2.o.A;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var5 = s.f5954a;
                        i12 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var);
                    }
                    if ((i11 & 32) != 0) {
                        h0.p1 p1Var6 = s.f5954a;
                        uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                        i12 &= -458753;
                    } else {
                        uVar4 = uVar2;
                    }
                    if (i16 != 0) {
                        n1Var2 = s.f5954a;
                    }
                    t0Var3 = t0VarA;
                    if (i18 != 0) {
                        uVar2 = uVar4;
                        iVar4 = null;
                    } else {
                        iVar4 = iVar2;
                        uVar2 = uVar4;
                    }
                }
                g0Var.s();
                obj = l1.i.f9868a;
                if (iVar4 == null) {
                    g0Var.c0(1691738187);
                    objN7 = g0Var.N();
                    if (objN7 == obj) {
                        objN7 = w.c.g(g0Var);
                    }
                    iVar5 = (f0.i) objN7;
                    g0Var.r(false);
                } else {
                    g0Var.c0(-499617780);
                    g0Var.r(false);
                    iVar5 = iVar4;
                }
                if (z11) {
                    j9 = rVar2.f5944a;
                } else {
                    j9 = rVar2.f5946c;
                }
                long j12 = j9;
                if (z11) {
                    j10 = rVar2.f5945b;
                } else {
                    j10 = rVar2.f5947d;
                }
                if (uVar2 == null) {
                    g0Var.c0(1691921830);
                    g0Var.r(false);
                    iVar4 = iVar4;
                    r4 = 0;
                    iVar5 = iVar5;
                    n1Var2 = n1Var2;
                    uVar5 = uVar2;
                    jVar2 = null;
                } else {
                    g0Var.c0(-499611205);
                    i20 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objN = g0Var.N();
                    if (objN == obj) {
                        objN = new z1.p();
                        g0Var.n0(objN);
                    }
                    pVar = (z1.p) objN;
                    zG = g0Var.g(iVar5);
                    objN2 = g0Var.N();
                    if (zG) {
                        objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                        g0Var.n0(objN2);
                    }
                    l1.q.i(iVar5, g0Var, (u00.n) objN2);
                    hVar = (f0.h) h00.q.U0(pVar);
                    if (!z11) {
                        f3 = uVar2.f5997e;
                    } else if (hVar instanceof f0.k) {
                        f3 = uVar2.f5994b;
                    } else if (hVar instanceof f0.f) {
                        f3 = uVar2.f5996d;
                    } else if (hVar instanceof f0.d) {
                        f3 = uVar2.f5995c;
                    } else {
                        f3 = uVar2.f5993a;
                    }
                    objN3 = g0Var.N();
                    if (objN3 == obj) {
                        objN3 = new x.b(new y3.f(f3), x.c.m, null, 12);
                        g0Var.n0(objN3);
                    }
                    bVar = (x.b) objN3;
                    y3.f fVar2 = new y3.f(f3);
                    boolean zI3 = g0Var.i(bVar) | g0Var.d(f3) | ((((i20 & 14) ^ 6) <= 4 && g0Var.h(z11)) || (i20 & 6) == 4);
                    z12 = ((i20 & 896) ^ 384) > 256 ? false : false;
                    zI = zI3 | z12 | g0Var.i(hVar);
                    objN4 = g0Var.N();
                    if (zI) {
                        uVar5 = uVar2;
                        objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                        g0Var.n0(objN4);
                    } else {
                        uVar5 = uVar2;
                        objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                        g0Var.n0(objN4);
                    }
                    l1.q.i(fVar2, g0Var, (u00.n) objN4);
                    jVar2 = bVar.f16234c;
                    r4 = 0;
                    g0Var.r(false);
                }
                if (jVar2 != null) {
                    f10 = ((y3.f) jVar2.B.getValue()).A;
                } else {
                    f10 = (float) r4;
                }
                objN5 = g0Var.N();
                if (objN5 == obj) {
                    objN5 = new e6.c(17);
                    g0Var.n0(objN5);
                }
                b2.r rVarC2 = j3.q.c(rVar3, r4, (u00.k) objN5);
                h0.n1 n1Var5 = n1Var2;
                v1.c cVarD2 = v1.d.d(-535639973, new x(j10, n1Var5, oVar, 0), g0Var);
                l1.t tVar3 = s6.f5961a;
                float f13 = (float) r4;
                if (iVar5 == null) {
                    g0Var.c0(-1701037204);
                    objN6 = g0Var.N();
                    if (objN6 == obj) {
                        objN6 = w.c.g(g0Var);
                    }
                    g0Var.r(r4);
                    iVar6 = (f0.i) objN6;
                } else {
                    g0Var.c0(2023337163);
                    g0Var.r(r4);
                    iVar6 = iVar5;
                }
                l1.t tVar4 = s6.f5961a;
                float f14 = ((y3.f) g0Var.k(tVar4)).A + f13;
                boolean z16 = z11;
                l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(j10)), tVar4.a(new y3.f(f14))}, v1.d.d(849208527, new q6(rVarC2, t0Var3, j12, f14, iVar6, z16, aVar, f10, cVarD2), g0Var), g0Var, 56);
                rVar4 = rVar3;
                n1Var3 = n1Var5;
                t0Var2 = t0Var3;
                z14 = z16;
                uVar3 = uVar5;
                iVar3 = iVar4;
            } else {
                g0Var.V();
                rVar4 = rVar3;
                n1Var3 = n1Var2;
                z14 = z11;
                t0Var2 = t0VarA;
                uVar3 = uVar2;
                iVar3 = iVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new v(aVar, rVar4, z14, t0Var2, rVar2, uVar3, n1Var3, iVar3, oVar, i10, i11);
            }
        }
        i12 |= 48;
        rVar3 = rVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (g0Var.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    t0VarA = t0Var;
                    if (g0Var.g(t0VarA)) {
                    }
                    i12 |= i25;
                } else {
                    t0VarA = t0Var;
                }
                i12 |= i25;
            } else {
                t0VarA = t0Var;
            }
            if ((i10 & 24576) == 0) {
                if (g0Var.g(rVar2)) {
                    i23 = 16384;
                } else {
                    i23 = 8192;
                }
                i12 |= i23;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    uVar2 = uVar;
                    if (g0Var.g(uVar2)) {
                        i22 = 131072;
                    }
                    i12 |= i22;
                } else {
                    uVar2 = uVar;
                }
                i22 = Cast.MAX_MESSAGE_LENGTH;
                i12 |= i22;
            } else {
                uVar2 = uVar;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (g0Var.g(null)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i16 != 0) {
                i12 |= 12582912;
                n1Var2 = n1Var;
            } else {
                n1Var2 = n1Var;
                if ((i10 & 12582912) == 0) {
                    if (g0Var.g(n1Var2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
            }
            i18 = i11 & 256;
            if (i18 != 0) {
                i12 |= 100663296;
                iVar2 = iVar;
            } else {
                iVar2 = iVar;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.g(iVar2)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 805306368) == 0) {
                if (g0Var.i(oVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            z12 = true;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (g0Var.S(i12 & 1, z13)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        rVar3 = b2.o.A;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var7 = s.f5954a;
                        i12 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var);
                    }
                    if ((i11 & 32) != 0) {
                        h0.p1 p1Var8 = s.f5954a;
                        uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                        i12 &= -458753;
                    } else {
                        uVar4 = uVar2;
                    }
                    if (i16 != 0) {
                        n1Var2 = s.f5954a;
                    }
                    t0Var3 = t0VarA;
                    if (i18 != 0) {
                        uVar2 = uVar4;
                        iVar4 = null;
                    } else {
                        iVar4 = iVar2;
                        uVar2 = uVar4;
                    }
                } else {
                    if (i24 != 0) {
                        rVar3 = b2.o.A;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var9 = s.f5954a;
                        i12 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var);
                    }
                    if ((i11 & 32) != 0) {
                        h0.p1 p1Var10 = s.f5954a;
                        uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                        i12 &= -458753;
                    } else {
                        uVar4 = uVar2;
                    }
                    if (i16 != 0) {
                        n1Var2 = s.f5954a;
                    }
                    t0Var3 = t0VarA;
                    if (i18 != 0) {
                        uVar2 = uVar4;
                        iVar4 = null;
                    } else {
                        iVar4 = iVar2;
                        uVar2 = uVar4;
                    }
                }
                g0Var.s();
                obj = l1.i.f9868a;
                if (iVar4 == null) {
                    g0Var.c0(1691738187);
                    objN7 = g0Var.N();
                    if (objN7 == obj) {
                        objN7 = w.c.g(g0Var);
                    }
                    iVar5 = (f0.i) objN7;
                    g0Var.r(false);
                } else {
                    g0Var.c0(-499617780);
                    g0Var.r(false);
                    iVar5 = iVar4;
                }
                if (z11) {
                    j9 = rVar2.f5944a;
                } else {
                    j9 = rVar2.f5946c;
                }
                long j13 = j9;
                if (z11) {
                    j10 = rVar2.f5945b;
                } else {
                    j10 = rVar2.f5947d;
                }
                if (uVar2 == null) {
                    g0Var.c0(1691921830);
                    g0Var.r(false);
                    iVar4 = iVar4;
                    r4 = 0;
                    iVar5 = iVar5;
                    n1Var2 = n1Var2;
                    uVar5 = uVar2;
                    jVar2 = null;
                } else {
                    g0Var.c0(-499611205);
                    i20 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objN = g0Var.N();
                    if (objN == obj) {
                        objN = new z1.p();
                        g0Var.n0(objN);
                    }
                    pVar = (z1.p) objN;
                    zG = g0Var.g(iVar5);
                    objN2 = g0Var.N();
                    if (zG) {
                        objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                        g0Var.n0(objN2);
                    }
                    l1.q.i(iVar5, g0Var, (u00.n) objN2);
                    hVar = (f0.h) h00.q.U0(pVar);
                    if (!z11) {
                        f3 = uVar2.f5997e;
                    } else if (hVar instanceof f0.k) {
                        f3 = uVar2.f5994b;
                    } else if (hVar instanceof f0.f) {
                        f3 = uVar2.f5996d;
                    } else if (hVar instanceof f0.d) {
                        f3 = uVar2.f5995c;
                    } else {
                        f3 = uVar2.f5993a;
                    }
                    objN3 = g0Var.N();
                    if (objN3 == obj) {
                        objN3 = new x.b(new y3.f(f3), x.c.m, null, 12);
                        g0Var.n0(objN3);
                    }
                    bVar = (x.b) objN3;
                    y3.f fVar3 = new y3.f(f3);
                    boolean zI4 = g0Var.i(bVar) | g0Var.d(f3) | ((((i20 & 14) ^ 6) <= 4 && g0Var.h(z11)) || (i20 & 6) == 4);
                    if (((i20 & 896) ^ 384) > 256) {
                    }
                    zI = zI4 | z12 | g0Var.i(hVar);
                    objN4 = g0Var.N();
                    if (zI) {
                        uVar5 = uVar2;
                        objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                        g0Var.n0(objN4);
                    } else {
                        uVar5 = uVar2;
                        objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                        g0Var.n0(objN4);
                    }
                    l1.q.i(fVar3, g0Var, (u00.n) objN4);
                    jVar2 = bVar.f16234c;
                    r4 = 0;
                    g0Var.r(false);
                }
                if (jVar2 != null) {
                    f10 = ((y3.f) jVar2.B.getValue()).A;
                } else {
                    f10 = (float) r4;
                }
                objN5 = g0Var.N();
                if (objN5 == obj) {
                    objN5 = new e6.c(17);
                    g0Var.n0(objN5);
                }
                b2.r rVarC3 = j3.q.c(rVar3, r4, (u00.k) objN5);
                h0.n1 n1Var6 = n1Var2;
                v1.c cVarD3 = v1.d.d(-535639973, new x(j10, n1Var6, oVar, 0), g0Var);
                l1.t tVar5 = s6.f5961a;
                float f15 = (float) r4;
                if (iVar5 == null) {
                    g0Var.c0(-1701037204);
                    objN6 = g0Var.N();
                    if (objN6 == obj) {
                        objN6 = w.c.g(g0Var);
                    }
                    g0Var.r(r4);
                    iVar6 = (f0.i) objN6;
                } else {
                    g0Var.c0(2023337163);
                    g0Var.r(r4);
                    iVar6 = iVar5;
                }
                l1.t tVar6 = s6.f5961a;
                float f16 = ((y3.f) g0Var.k(tVar6)).A + f15;
                boolean z17 = z11;
                l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(j10)), tVar6.a(new y3.f(f16))}, v1.d.d(849208527, new q6(rVarC3, t0Var3, j13, f16, iVar6, z17, aVar, f10, cVarD3), g0Var), g0Var, 56);
                rVar4 = rVar3;
                n1Var3 = n1Var6;
                t0Var2 = t0Var3;
                z14 = z17;
                uVar3 = uVar5;
                iVar3 = iVar4;
            } else {
                g0Var.V();
                rVar4 = rVar3;
                n1Var3 = n1Var2;
                z14 = z11;
                t0Var2 = t0VarA;
                uVar3 = uVar2;
                iVar3 = iVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new v(aVar, rVar4, z14, t0Var2, rVar2, uVar3, n1Var3, iVar3, oVar, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                t0VarA = t0Var;
                if (g0Var.g(t0VarA)) {
                }
                i12 |= i25;
            } else {
                t0VarA = t0Var;
            }
            i12 |= i25;
        } else {
            t0VarA = t0Var;
        }
        if ((i10 & 24576) == 0) {
            if (g0Var.g(rVar2)) {
                i23 = 16384;
            } else {
                i23 = 8192;
            }
            i12 |= i23;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                uVar2 = uVar;
                if (g0Var.g(uVar2)) {
                    i22 = 131072;
                }
                i12 |= i22;
            } else {
                uVar2 = uVar;
            }
            i22 = Cast.MAX_MESSAGE_LENGTH;
            i12 |= i22;
        } else {
            uVar2 = uVar;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (g0Var.g(null)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
        if (i16 != 0) {
            i12 |= 12582912;
            n1Var2 = n1Var;
        } else {
            n1Var2 = n1Var;
            if ((i10 & 12582912) == 0) {
                if (g0Var.g(n1Var2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
        }
        i18 = i11 & 256;
        if (i18 != 0) {
            i12 |= 100663296;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            if ((i10 & 100663296) == 0) {
                if (g0Var.g(iVar2)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
        }
        if ((i10 & 805306368) == 0) {
            if (g0Var.i(oVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i12 |= i21;
        }
        z12 = true;
        if ((i12 & 306783379) != 306783378) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (g0Var.S(i12 & 1, z13)) {
            g0Var.X();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = b2.o.A;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    h0.p1 p1Var11 = s.f5954a;
                    i12 &= -7169;
                    t0VarA = g6.a(k1.b.f8567b, g0Var);
                }
                if ((i11 & 32) != 0) {
                    h0.p1 p1Var12 = s.f5954a;
                    uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                    i12 &= -458753;
                } else {
                    uVar4 = uVar2;
                }
                if (i16 != 0) {
                    n1Var2 = s.f5954a;
                }
                t0Var3 = t0VarA;
                if (i18 != 0) {
                    uVar2 = uVar4;
                    iVar4 = null;
                } else {
                    iVar4 = iVar2;
                    uVar2 = uVar4;
                }
            } else {
                if (i24 != 0) {
                    rVar3 = b2.o.A;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    h0.p1 p1Var13 = s.f5954a;
                    i12 &= -7169;
                    t0VarA = g6.a(k1.b.f8567b, g0Var);
                }
                if ((i11 & 32) != 0) {
                    h0.p1 p1Var14 = s.f5954a;
                    uVar4 = new u(k1.l.f8787b, k1.l.f8796k, k1.l.f8793h, k1.l.f8794i, k1.l.f8789d);
                    i12 &= -458753;
                } else {
                    uVar4 = uVar2;
                }
                if (i16 != 0) {
                    n1Var2 = s.f5954a;
                }
                t0Var3 = t0VarA;
                if (i18 != 0) {
                    uVar2 = uVar4;
                    iVar4 = null;
                } else {
                    iVar4 = iVar2;
                    uVar2 = uVar4;
                }
            }
            g0Var.s();
            obj = l1.i.f9868a;
            if (iVar4 == null) {
                g0Var.c0(1691738187);
                objN7 = g0Var.N();
                if (objN7 == obj) {
                    objN7 = w.c.g(g0Var);
                }
                iVar5 = (f0.i) objN7;
                g0Var.r(false);
            } else {
                g0Var.c0(-499617780);
                g0Var.r(false);
                iVar5 = iVar4;
            }
            if (z11) {
                j9 = rVar2.f5944a;
            } else {
                j9 = rVar2.f5946c;
            }
            long j14 = j9;
            if (z11) {
                j10 = rVar2.f5945b;
            } else {
                j10 = rVar2.f5947d;
            }
            if (uVar2 == null) {
                g0Var.c0(1691921830);
                g0Var.r(false);
                iVar4 = iVar4;
                r4 = 0;
                iVar5 = iVar5;
                n1Var2 = n1Var2;
                uVar5 = uVar2;
                jVar2 = null;
            } else {
                g0Var.c0(-499611205);
                i20 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                objN = g0Var.N();
                if (objN == obj) {
                    objN = new z1.p();
                    g0Var.n0(objN);
                }
                pVar = (z1.p) objN;
                zG = g0Var.g(iVar5);
                objN2 = g0Var.N();
                if (zG) {
                    objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new d0.i2(iVar5, pVar, (k00.c) null, 27);
                    g0Var.n0(objN2);
                }
                l1.q.i(iVar5, g0Var, (u00.n) objN2);
                hVar = (f0.h) h00.q.U0(pVar);
                if (!z11) {
                    f3 = uVar2.f5997e;
                } else if (hVar instanceof f0.k) {
                    f3 = uVar2.f5994b;
                } else if (hVar instanceof f0.f) {
                    f3 = uVar2.f5996d;
                } else if (hVar instanceof f0.d) {
                    f3 = uVar2.f5995c;
                } else {
                    f3 = uVar2.f5993a;
                }
                objN3 = g0Var.N();
                if (objN3 == obj) {
                    objN3 = new x.b(new y3.f(f3), x.c.m, null, 12);
                    g0Var.n0(objN3);
                }
                bVar = (x.b) objN3;
                y3.f fVar4 = new y3.f(f3);
                boolean zI5 = g0Var.i(bVar) | g0Var.d(f3) | ((((i20 & 14) ^ 6) <= 4 && g0Var.h(z11)) || (i20 & 6) == 4);
                if (((i20 & 896) ^ 384) > 256) {
                }
                zI = zI5 | z12 | g0Var.i(hVar);
                objN4 = g0Var.N();
                if (zI) {
                    uVar5 = uVar2;
                    objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                    g0Var.n0(objN4);
                } else {
                    uVar5 = uVar2;
                    objN4 = new t(bVar, f3, z11, uVar5, hVar, null, 0);
                    g0Var.n0(objN4);
                }
                l1.q.i(fVar4, g0Var, (u00.n) objN4);
                jVar2 = bVar.f16234c;
                r4 = 0;
                g0Var.r(false);
            }
            if (jVar2 != null) {
                f10 = ((y3.f) jVar2.B.getValue()).A;
            } else {
                f10 = (float) r4;
            }
            objN5 = g0Var.N();
            if (objN5 == obj) {
                objN5 = new e6.c(17);
                g0Var.n0(objN5);
            }
            b2.r rVarC4 = j3.q.c(rVar3, r4, (u00.k) objN5);
            h0.n1 n1Var7 = n1Var2;
            v1.c cVarD4 = v1.d.d(-535639973, new x(j10, n1Var7, oVar, 0), g0Var);
            l1.t tVar7 = s6.f5961a;
            float f17 = (float) r4;
            if (iVar5 == null) {
                g0Var.c0(-1701037204);
                objN6 = g0Var.N();
                if (objN6 == obj) {
                    objN6 = w.c.g(g0Var);
                }
                g0Var.r(r4);
                iVar6 = (f0.i) objN6;
            } else {
                g0Var.c0(2023337163);
                g0Var.r(r4);
                iVar6 = iVar5;
            }
            l1.t tVar8 = s6.f5961a;
            float f18 = ((y3.f) g0Var.k(tVar8)).A + f17;
            boolean z18 = z11;
            l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(j10)), tVar8.a(new y3.f(f18))}, v1.d.d(849208527, new q6(rVarC4, t0Var3, j14, f18, iVar6, z18, aVar, f10, cVarD4), g0Var), g0Var, 56);
            rVar4 = rVar3;
            n1Var3 = n1Var7;
            t0Var2 = t0Var3;
            z14 = z18;
            uVar3 = uVar5;
            iVar3 = iVar4;
        } else {
            g0Var.V();
            rVar4 = rVar3;
            n1Var3 = n1Var2;
            z14 = z11;
            t0Var2 = t0VarA;
            uVar3 = uVar2;
            iVar3 = iVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new v(aVar, rVar4, z14, t0Var2, rVar2, uVar3, n1Var3, iVar3, oVar, i10, i11);
        }
    }

    public static final void b(b2.r rVar, i2.t0 t0Var, z zVar, a0 a0Var, z.u uVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        a0 a0VarJ;
        z.u uVar2;
        boolean z10;
        l1.g0 g0Var;
        a0 a0Var2;
        l1.r1 r1VarT;
        z.u uVar3;
        float f3;
        Object objN;
        int i13;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1359693790);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.g(t0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var2.g(zVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                a0VarJ = a0Var;
                int i14 = g0Var2.g(a0VarJ) ? 2048 : 1024;
                i12 |= i14;
            } else {
                a0VarJ = a0Var;
            }
            i12 |= i14;
        } else {
            a0VarJ = a0Var;
        }
        int i15 = i11 & 16;
        if (i15 == 0) {
            if ((i10 & 24576) == 0) {
                uVar2 = uVar;
                i12 |= g0Var2.g(uVar2) ? 16384 : 8192;
            }
            if ((196608 & i10) == 0) {
                if (g0Var2.i(cVar)) {
                    i13 = 131072;
                } else {
                    i13 = Cast.MAX_MESSAGE_LENGTH;
                }
                i12 |= i13;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var2.S(i12 & 1, z10)) {
                g0Var2.X();
                if ((i10 & 1) != 0 || g0Var2.A()) {
                    if ((i11 & 8) != 0) {
                        a0VarJ = j(63);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        uVar3 = null;
                    }
                    g0Var2.s();
                    long j9 = zVar.f6032a;
                    long j10 = zVar.f6033b;
                    f3 = a0VarJ.f5704a;
                    g0Var2.c0(-1763481333);
                    g0Var2.c0(167751211);
                    objN = g0Var2.N();
                    if (objN == l1.i.f9868a) {
                        objN = com.google.android.gms.internal.measurement.x5.s(f3, g0Var2);
                    }
                    g0Var2.r(false);
                    g0Var2.r(false);
                    g0Var = g0Var2;
                    s6.a(rVar, t0Var, j9, j10, 0.0f, ((y3.f) ((l1.z0) objN).getValue()).A, uVar3, v1.d.d(-97109725, new c0(cVar, 0), g0Var2), g0Var, (i12 & 14) | 12582912 | (i12 & 112) | ((i12 << 6) & 3670016), 16);
                    uVar2 = uVar3;
                } else {
                    g0Var2.V();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                uVar3 = uVar2;
                g0Var2.s();
                long j11 = zVar.f6032a;
                long j12 = zVar.f6033b;
                f3 = a0VarJ.f5704a;
                g0Var2.c0(-1763481333);
                g0Var2.c0(167751211);
                objN = g0Var2.N();
                if (objN == l1.i.f9868a) {
                    objN = com.google.android.gms.internal.measurement.x5.s(f3, g0Var2);
                }
                g0Var2.r(false);
                g0Var2.r(false);
                g0Var = g0Var2;
                s6.a(rVar, t0Var, j11, j12, 0.0f, ((y3.f) ((l1.z0) objN).getValue()).A, uVar3, v1.d.d(-97109725, new c0(cVar, 0), g0Var2), g0Var, (i12 & 14) | 12582912 | (i12 & 112) | ((i12 << 6) & 3670016), 16);
                uVar2 = uVar3;
            } else {
                g0Var = g0Var2;
                g0Var.V();
            }
            a0Var2 = a0VarJ;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new b0(rVar, t0Var, zVar, a0Var2, uVar2, cVar, i10, i11);
            }
        }
        i12 |= 24576;
        uVar2 = uVar;
        if ((196608 & i10) == 0) {
            if (g0Var2.i(cVar)) {
                i13 = 131072;
            } else {
                i13 = Cast.MAX_MESSAGE_LENGTH;
            }
            i12 |= i13;
        }
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var2.S(i12 & 1, z10)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                if ((i11 & 8) != 0) {
                    a0VarJ = j(63);
                    i12 &= -7169;
                }
                if (i15 != 0) {
                    uVar3 = null;
                } else {
                    uVar3 = uVar2;
                }
            } else {
                if ((i11 & 8) != 0) {
                    a0VarJ = j(63);
                    i12 &= -7169;
                }
                if (i15 != 0) {
                    uVar3 = null;
                } else {
                    uVar3 = uVar2;
                }
            }
            g0Var2.s();
            long j13 = zVar.f6032a;
            long j14 = zVar.f6033b;
            f3 = a0VarJ.f5704a;
            g0Var2.c0(-1763481333);
            g0Var2.c0(167751211);
            objN = g0Var2.N();
            if (objN == l1.i.f9868a) {
                objN = com.google.android.gms.internal.measurement.x5.s(f3, g0Var2);
            }
            g0Var2.r(false);
            g0Var2.r(false);
            g0Var = g0Var2;
            s6.a(rVar, t0Var, j13, j14, 0.0f, ((y3.f) ((l1.z0) objN).getValue()).A, uVar3, v1.d.d(-97109725, new c0(cVar, 0), g0Var2), g0Var, (i12 & 14) | 12582912 | (i12 & 112) | ((i12 << 6) & 3670016), 16);
            uVar2 = uVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        a0Var2 = a0VarJ;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b0(rVar, t0Var, zVar, a0Var2, uVar2, cVar, i10, i11);
        }
    }

    public static final void c(b2.r rVar, final float f3, final long j9, l1.j jVar, int i10, int i11) {
        int i12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(75144485);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = i10 | (g0Var.g(rVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= g0Var.d(f3) ? 32 : 16;
        }
        int i15 = i12 | (g0Var.f(j9) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        boolean z10 = true;
        if (g0Var.S(i15 & 1, (i15 & 147) != 146)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                if (i13 != 0) {
                    rVar = b2.o.A;
                }
                if (i14 != 0) {
                    f3 = j3.f5845a;
                }
            } else {
                g0Var.V();
            }
            g0Var.s();
            b2.r rVarE = h0.z1.e(h0.z1.d(rVar, 1.0f), f3);
            boolean z11 = (i15 & 112) == 32;
            if ((((i15 & 896) ^ 384) <= 256 || !g0Var.f(j9)) && (i15 & 384) != 256) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objN = g0Var.N();
            if (z12 || objN == l1.i.f9868a) {
                objN = new u00.k() {
                    public final Object invoke(Object obj) {
                        k2.d dVar = (k2.d) obj;
                        float f10 = f3;
                        float fA0 = dVar.A0(f10);
                        float f11 = 2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(dVar.A0(f10) / f11)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
                        dVar.P(j9, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.A0(f10) / f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fA0, 3);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            }
            z.n.b(0, rVarE, g0Var, (u00.k) objN);
        } else {
            g0Var.V();
        }
        b2.r rVar2 = rVar;
        float f10 = f3;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new cs.j(rVar2, f10, j9, i10, i11);
        }
    }

    public static final void d(u00.a aVar, b2.r rVar, boolean z10, l3 l3Var, i2.t0 t0Var, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar2;
        int i13;
        boolean z11;
        int i14;
        l3 l3Var2;
        int i15;
        i2.t0 t0Var2;
        boolean z12;
        boolean z13;
        l3 l3Var3;
        i2.t0 t0Var3;
        l1.r1 r1VarT;
        b2.r rVar3;
        boolean z14;
        l3 l3VarM;
        b2.r rVar4;
        l3 l3Var4;
        boolean z15;
        i2.t0 t0VarA;
        int i16;
        int i17;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1413012038);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (g0Var.h(z11)) {
                        i14 = 256;
                    } else {
                        i14 = Cast.MAX_NAMESPACE_LENGTH;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l3Var2 = l3Var;
                        int i19 = g0Var.g(l3Var2) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        l3Var2 = l3Var;
                    }
                    i12 |= i19;
                } else {
                    l3Var2 = l3Var;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (g0Var.g(null)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        t0Var2 = t0Var;
                        if (g0Var.g(t0Var2)) {
                            i17 = 131072;
                        }
                        i12 |= i17;
                    } else {
                        t0Var2 = t0Var;
                    }
                    i17 = Cast.MAX_MESSAGE_LENGTH;
                    i12 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i12 & 1, z12)) {
                    g0Var.X();
                    if ((i10 & 1) != 0 || g0Var.A()) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar2;
                        }
                        z14 = i13 == 0 ? z11 : true;
                        if ((i11 & 8) != 0) {
                            l3VarM = m(g0Var);
                            i12 &= -7169;
                        } else {
                            l3VarM = l3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            rVar4 = rVar3;
                            l3Var4 = l3VarM;
                            z15 = z14;
                            t0VarA = g6.a(k1.z.f8913b, g0Var);
                        } else {
                            rVar4 = rVar3;
                            l3Var4 = l3VarM;
                            z15 = z14;
                        }
                        g0Var.s();
                        int i20 = i12 << 3;
                        f(rVar4, aVar, z15, t0VarA, l3Var4, cVar, g0Var, ((i12 >> 3) & 14) | (i20 & 112) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i20) | (i20 & 458752) | (i12 & 3670016));
                        rVar2 = rVar4;
                        z13 = z15;
                        t0Var3 = t0VarA;
                        l3Var3 = l3Var4;
                    } else {
                        g0Var.V();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        rVar4 = rVar2;
                        z15 = z11;
                        l3Var4 = l3Var2;
                    }
                    t0VarA = t0Var2;
                    g0Var.s();
                    int i21 = i12 << 3;
                    f(rVar4, aVar, z15, t0VarA, l3Var4, cVar, g0Var, ((i12 >> 3) & 14) | (i21 & 112) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i21) | (i21 & 458752) | (i12 & 3670016));
                    rVar2 = rVar4;
                    z13 = z15;
                    t0Var3 = t0VarA;
                    l3Var3 = l3Var4;
                } else {
                    g0Var.V();
                    z13 = z11;
                    l3Var3 = l3Var2;
                    t0Var3 = t0Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new m3(aVar, rVar2, z13, l3Var3, t0Var3, cVar, i10, i11);
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l3Var2 = l3Var;
                    if (g0Var.g(l3Var2)) {
                    }
                    i12 |= i19;
                } else {
                    l3Var2 = l3Var;
                }
                i12 |= i19;
            } else {
                l3Var2 = l3Var;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (g0Var.g(null)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    t0Var2 = t0Var;
                    if (g0Var.g(t0Var2)) {
                        i17 = 131072;
                    }
                    i12 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                i17 = Cast.MAX_MESSAGE_LENGTH;
                i12 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i12 & 1, z12)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l3VarM = m(g0Var);
                        i12 &= -7169;
                    } else {
                        l3VarM = l3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = g6.a(k1.z.f8913b, g0Var);
                    } else {
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = t0Var2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l3VarM = m(g0Var);
                        i12 &= -7169;
                    } else {
                        l3VarM = l3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = g6.a(k1.z.f8913b, g0Var);
                    } else {
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = t0Var2;
                    }
                }
                g0Var.s();
                int i22 = i12 << 3;
                f(rVar4, aVar, z15, t0VarA, l3Var4, cVar, g0Var, ((i12 >> 3) & 14) | (i22 & 112) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i22) | (i22 & 458752) | (i12 & 3670016));
                rVar2 = rVar4;
                z13 = z15;
                t0Var3 = t0VarA;
                l3Var3 = l3Var4;
            } else {
                g0Var.V();
                z13 = z11;
                l3Var3 = l3Var2;
                t0Var3 = t0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new m3(aVar, rVar2, z13, l3Var3, t0Var3, cVar, i10, i11);
            }
        }
        i12 |= 48;
        rVar2 = rVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (g0Var.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l3Var2 = l3Var;
                    if (g0Var.g(l3Var2)) {
                    }
                    i12 |= i19;
                } else {
                    l3Var2 = l3Var;
                }
                i12 |= i19;
            } else {
                l3Var2 = l3Var;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (g0Var.g(null)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    t0Var2 = t0Var;
                    if (g0Var.g(t0Var2)) {
                        i17 = 131072;
                    }
                    i12 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                i17 = Cast.MAX_MESSAGE_LENGTH;
                i12 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i12 & 1, z12)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l3VarM = m(g0Var);
                        i12 &= -7169;
                    } else {
                        l3VarM = l3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = g6.a(k1.z.f8913b, g0Var);
                    } else {
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = t0Var2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l3VarM = m(g0Var);
                        i12 &= -7169;
                    } else {
                        l3VarM = l3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = g6.a(k1.z.f8913b, g0Var);
                    } else {
                        rVar4 = rVar3;
                        l3Var4 = l3VarM;
                        z15 = z14;
                        t0VarA = t0Var2;
                    }
                }
                g0Var.s();
                int i23 = i12 << 3;
                f(rVar4, aVar, z15, t0VarA, l3Var4, cVar, g0Var, ((i12 >> 3) & 14) | (i23 & 112) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i23) | (i23 & 458752) | (i12 & 3670016));
                rVar2 = rVar4;
                z13 = z15;
                t0Var3 = t0VarA;
                l3Var3 = l3Var4;
            } else {
                g0Var.V();
                z13 = z11;
                l3Var3 = l3Var2;
                t0Var3 = t0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new m3(aVar, rVar2, z13, l3Var3, t0Var3, cVar, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l3Var2 = l3Var;
                if (g0Var.g(l3Var2)) {
                }
                i12 |= i19;
            } else {
                l3Var2 = l3Var;
            }
            i12 |= i19;
        } else {
            l3Var2 = l3Var;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (g0Var.g(null)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                t0Var2 = t0Var;
                if (g0Var.g(t0Var2)) {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i17 = Cast.MAX_MESSAGE_LENGTH;
            i12 |= i17;
        } else {
            t0Var2 = t0Var;
        }
        if ((1572864 & i10) == 0) {
            if (g0Var.i(cVar)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i12 |= i16;
        }
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g0Var.S(i12 & 1, z12)) {
            g0Var.X();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    l3VarM = m(g0Var);
                    i12 &= -7169;
                } else {
                    l3VarM = l3Var2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    rVar4 = rVar3;
                    l3Var4 = l3VarM;
                    z15 = z14;
                    t0VarA = g6.a(k1.z.f8913b, g0Var);
                } else {
                    rVar4 = rVar3;
                    l3Var4 = l3VarM;
                    z15 = z14;
                    t0VarA = t0Var2;
                }
            } else {
                if (i18 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    l3VarM = m(g0Var);
                    i12 &= -7169;
                } else {
                    l3VarM = l3Var2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    rVar4 = rVar3;
                    l3Var4 = l3VarM;
                    z15 = z14;
                    t0VarA = g6.a(k1.z.f8913b, g0Var);
                } else {
                    rVar4 = rVar3;
                    l3Var4 = l3VarM;
                    z15 = z14;
                    t0VarA = t0Var2;
                }
            }
            g0Var.s();
            int i24 = i12 << 3;
            f(rVar4, aVar, z15, t0VarA, l3Var4, cVar, g0Var, ((i12 >> 3) & 14) | (i24 & 112) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i24) | (i24 & 458752) | (i12 & 3670016));
            rVar2 = rVar4;
            z13 = z15;
            t0Var3 = t0VarA;
            l3Var3 = l3Var4;
        } else {
            g0Var.V();
            z13 = z11;
            l3Var3 = l3Var2;
            t0Var3 = t0Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m3(aVar, rVar2, z13, l3Var3, t0Var3, cVar, i10, i11);
        }
    }

    public static final void e(u00.a aVar, b2.r rVar, boolean z10, l3 l3Var, v1.c cVar, l1.j jVar, int i10) {
        b2.r rVar2;
        v1.c cVar2;
        u00.a aVar2;
        l3 l3Var2;
        boolean z11;
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2096213317);
        int i12 = (g0Var.g(rVar) ? 32 : 16) | i10 | 25984;
        boolean z12 = true;
        if (g0Var.S(i12 & 1, (74899 & i12) != 74898)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                l3Var = m(g0Var);
                i11 = i12 & (-7169);
            } else {
                g0Var.V();
                i11 = i12 & (-7169);
                z12 = z10;
            }
            l3 l3Var3 = l3Var;
            g0Var.s();
            rVar2 = rVar;
            d(aVar, rVar2, z12, l3Var3, g6.a(k1.z.f8913b, g0Var), cVar, g0Var, (65534 & i11) | 1572864, 0);
            aVar2 = aVar;
            cVar2 = cVar;
            z11 = z12;
            l3Var2 = l3Var3;
        } else {
            rVar2 = rVar;
            cVar2 = cVar;
            aVar2 = aVar;
            g0Var.V();
            l3Var2 = l3Var;
            z11 = z10;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b1.k(aVar2, rVar2, z11, l3Var2, cVar2, i10);
        }
    }

    public static final void f(b2.r rVar, u00.a aVar, boolean z10, i2.t0 t0Var, l3 l3Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1134296466);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(t0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.g(l3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.g(null) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var.i(cVar) ? 1048576 : 524288;
        }
        int i12 = i11;
        if (g0Var.S(i12 & 1, (599187 & i12) != 599186)) {
            g0Var.c0(977045485);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = w.c.g(g0Var);
            }
            f0.i iVar = (f0.i) objN;
            g0Var.r(false);
            z2.r rVar2 = r3.f5951a;
            b2.r rVarV = rVar.V(a4.B);
            float f3 = k1.z.f8914c;
            long jB = f50.c.b(k1.z.f8915d + f3 + f3, k1.z.f8912a);
            h0.a0 a0Var = h0.z1.f6476a;
            b2.r rVarG = h1.f.g(androidx.compose.foundation.b.b(z.n.f(f2.h.c(h0.z1.n(rVarV, y3.h.b(jB), y3.h.a(jB)), t0Var), z10 ? l3Var.f5855a : l3Var.f5857c, t0Var), iVar, y5.a(0.0f, 7, false), z10, new j3.k(0), aVar, 8));
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            l1.q.a(y0.f6028a.a(new i2.t(z10 ? l3Var.f5856b : l3Var.f5858d)), cVar, g0Var, ((i12 >> 15) & 112) | 8);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c0.h(rVar, aVar, z10, t0Var, l3Var, cVar, i10);
        }
    }

    public static final void g(final u00.a aVar, final long j9, final u4 u4Var, x.b bVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        long j10;
        u4 u4Var2;
        y3.m mVar;
        boolean z10;
        boolean z11;
        Object obj;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(766784632);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j10 = j9;
            i11 |= g0Var.f(j10) ? 32 : 16;
        } else {
            j10 = j9;
        }
        if ((i10 & 384) == 0) {
            u4Var2 = u4Var;
            i11 |= g0Var.g(u4Var2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            u4Var2 = u4Var;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? g0Var.g(bVar) : g0Var.i(bVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(cVar) ? 16384 : 8192;
        }
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            View view = (View) g0Var.k(c3.o0.f2726f);
            y3.c cVar2 = (y3.c) g0Var.k(c3.o1.f2734h);
            y3.m mVar2 = (y3.m) g0Var.k(c3.o1.f2738n);
            l1.e0 e0VarF = l1.q.F(g0Var);
            l1.z0 z0VarG = l1.q.G(cVar, g0Var);
            Object[] objArr = new Object[0];
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = new e00.g(22);
                g0Var.n0(objN);
            }
            UUID uuid = (UUID) y1.k.c(objArr, (u00.a) objN, g0Var, 48);
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = l1.q.o(g0Var);
                g0Var.n0(objN2);
            }
            a40.z zVar = (a40.z) objN2;
            boolean zG = g0Var.g(view) | g0Var.g(cVar2);
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar3) {
                mVar = mVar2;
                z10 = true;
                z11 = false;
                g4 g4Var = new g4(aVar, u4Var2, j10, view, mVar, cVar2, uuid, bVar, zVar);
                v1.c cVar4 = new v1.c(new e1(z0VarG, 1), -1051373467, true);
                d4 d4Var = g4Var.I;
                d4Var.setParentCompositionContext(e0VarF);
                d4Var.K.setValue(cVar4);
                d4Var.L = true;
                d4Var.d();
                g0Var.n0(g4Var);
                obj = g4Var;
            } else {
                mVar = mVar2;
                z10 = true;
                z11 = false;
                obj = objN3;
            }
            final g4 g4Var2 = (g4) obj;
            boolean zI = g0Var.i(g4Var2);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar3) {
                objN4 = new a1.e1(g4Var2, 20);
                g0Var.n0(objN4);
            }
            l1.q.e(g4Var2, (u00.k) objN4, g0Var);
            int i12 = i11;
            boolean zI2 = g0Var.i(g4Var2) | ((i12 & 14) == 4 ? z10 : z11) | ((i12 & 896) == 256 ? z10 : z11) | ((i12 & 112) == 32 ? z10 : z11) | g0Var.e(mVar.ordinal());
            Object objN5 = g0Var.N();
            if (zI2 || objN5 == cVar3) {
                final y3.m mVar3 = mVar;
                objN5 = new u00.a() {
                    public final Object invoke() throws NoWhenBranchMatchedException {
                        g4Var2.c(aVar, u4Var, j9, mVar3);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN5);
            }
            l1.q.k((u00.a) objN5, g0Var);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new i1(aVar, j9, u4Var, bVar, cVar, i10);
        }
    }

    public static final void h(u00.a aVar, b2.r rVar, boolean z10, i2.t0 t0Var, r rVar2, h0.n1 n1Var, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar3;
        int i13;
        boolean z11;
        int i14;
        i2.t0 t0VarA;
        int i15;
        int i16;
        int i17;
        h0.n1 n1Var2;
        int i18;
        int i19;
        boolean z12;
        l1.g0 g0Var;
        b2.r rVar4;
        boolean z13;
        i2.t0 t0Var2;
        h0.n1 n1Var3;
        l1.r1 r1VarT;
        b2.r rVar5;
        boolean z14;
        h0.n1 n1Var4;
        b2.r rVar6;
        int i20;
        int i21;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1061374109);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                rVar3 = rVar;
                i12 |= g0Var2.g(rVar3) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (g0Var2.h(z11)) {
                        i14 = 256;
                    } else {
                        i14 = Cast.MAX_NAMESPACE_LENGTH;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        t0VarA = t0Var;
                        int i23 = g0Var2.g(t0VarA) ? 2048 : 1024;
                        i12 |= i23;
                    } else {
                        t0VarA = t0Var;
                    }
                    i12 |= i23;
                } else {
                    t0VarA = t0Var;
                }
                if ((i10 & 24576) == 0) {
                    if (g0Var2.g(rVar2)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i12 |= i21;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (g0Var2.g(null)) {
                        i15 = 131072;
                    } else {
                        i15 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i12 |= i15;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (g0Var2.g(null)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & Cast.MAX_NAMESPACE_LENGTH;
                if (i17 != 0) {
                    if ((12582912 & i10) == 0) {
                        n1Var2 = n1Var;
                        if (g0Var2.g(n1Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    i19 = i12 | 100663296;
                    if ((805306368 & i10) != 0) {
                        if (g0Var2.i(cVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i19 |= i20;
                    }
                    if ((306783379 & i19) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g0Var2.S(i19 & 1, z12)) {
                        g0Var2.X();
                        if ((i10 & 1) != 0 || g0Var2.A()) {
                            if (i22 != 0) {
                                rVar5 = b2.o.A;
                            } else {
                                rVar5 = rVar3;
                            }
                            boolean z15 = i13 == 0 ? z11 : true;
                            if ((i11 & 8) != 0) {
                                h0.p1 p1Var = s.f5954a;
                                i19 &= -7169;
                                t0VarA = g6.a(k1.b.f8567b, g0Var2);
                            }
                            if (i17 != 0) {
                                n1Var2 = s.f5955b;
                            }
                            z14 = z15;
                            n1Var4 = n1Var2;
                            rVar6 = rVar5;
                        } else {
                            g0Var2.V();
                            if ((i11 & 8) != 0) {
                                i19 &= -7169;
                            }
                            z14 = z11;
                            n1Var4 = n1Var2;
                            rVar6 = rVar3;
                        }
                        i2.t0 t0Var3 = t0VarA;
                        g0Var2.s();
                        g0Var = g0Var2;
                        a(aVar, rVar6, z14, t0Var3, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                        rVar4 = rVar6;
                        z13 = z14;
                        t0Var2 = t0Var3;
                        n1Var3 = n1Var4;
                    } else {
                        g0Var = g0Var2;
                        g0Var.V();
                        rVar4 = rVar3;
                        z13 = z11;
                        t0Var2 = t0VarA;
                        n1Var3 = n1Var2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
                    }
                }
                i12 |= 12582912;
                n1Var2 = n1Var;
                i19 = i12 | 100663296;
                if ((805306368 & i10) != 0) {
                    if (g0Var2.i(cVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i19 |= i20;
                }
                if ((306783379 & i19) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var2.S(i19 & 1, z12)) {
                    g0Var2.X();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var2 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    } else {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var3 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    }
                    i2.t0 t0Var4 = t0VarA;
                    g0Var2.s();
                    g0Var = g0Var2;
                    a(aVar, rVar6, z14, t0Var4, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                    rVar4 = rVar6;
                    z13 = z14;
                    t0Var2 = t0Var4;
                    n1Var3 = n1Var4;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    rVar4 = rVar3;
                    z13 = z11;
                    t0Var2 = t0VarA;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    t0VarA = t0Var;
                    if (g0Var2.g(t0VarA)) {
                    }
                    i12 |= i23;
                } else {
                    t0VarA = t0Var;
                }
                i12 |= i23;
            } else {
                t0VarA = t0Var;
            }
            if ((i10 & 24576) == 0) {
                if (g0Var2.g(rVar2)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i12 |= i21;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (g0Var2.g(null)) {
                    i15 = 131072;
                } else {
                    i15 = Cast.MAX_MESSAGE_LENGTH;
                }
                i12 |= i15;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (g0Var2.g(null)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i17 != 0) {
                if ((12582912 & i10) == 0) {
                    n1Var2 = n1Var;
                    if (g0Var2.g(n1Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                i19 = i12 | 100663296;
                if ((805306368 & i10) != 0) {
                    if (g0Var2.i(cVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i19 |= i20;
                }
                if ((306783379 & i19) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var2.S(i19 & 1, z12)) {
                    g0Var2.X();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var4 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    } else {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var5 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    }
                    i2.t0 t0Var5 = t0VarA;
                    g0Var2.s();
                    g0Var = g0Var2;
                    a(aVar, rVar6, z14, t0Var5, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                    rVar4 = rVar6;
                    z13 = z14;
                    t0Var2 = t0Var5;
                    n1Var3 = n1Var4;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    rVar4 = rVar3;
                    z13 = z11;
                    t0Var2 = t0VarA;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
                }
            }
            i12 |= 12582912;
            n1Var2 = n1Var;
            i19 = i12 | 100663296;
            if ((805306368 & i10) != 0) {
                if (g0Var2.i(cVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i19 |= i20;
            }
            if ((306783379 & i19) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var2.S(i19 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var6 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                } else {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var7 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                }
                i2.t0 t0Var6 = t0VarA;
                g0Var2.s();
                g0Var = g0Var2;
                a(aVar, rVar6, z14, t0Var6, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                rVar4 = rVar6;
                z13 = z14;
                t0Var2 = t0Var6;
                n1Var3 = n1Var4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar4 = rVar3;
                z13 = z11;
                t0Var2 = t0VarA;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
            }
        }
        i12 |= 48;
        rVar3 = rVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (g0Var2.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    t0VarA = t0Var;
                    if (g0Var2.g(t0VarA)) {
                    }
                    i12 |= i23;
                } else {
                    t0VarA = t0Var;
                }
                i12 |= i23;
            } else {
                t0VarA = t0Var;
            }
            if ((i10 & 24576) == 0) {
                if (g0Var2.g(rVar2)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i12 |= i21;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (g0Var2.g(null)) {
                    i15 = 131072;
                } else {
                    i15 = Cast.MAX_MESSAGE_LENGTH;
                }
                i12 |= i15;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (g0Var2.g(null)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i17 != 0) {
                if ((12582912 & i10) == 0) {
                    n1Var2 = n1Var;
                    if (g0Var2.g(n1Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                i19 = i12 | 100663296;
                if ((805306368 & i10) != 0) {
                    if (g0Var2.i(cVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i19 |= i20;
                }
                if ((306783379 & i19) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var2.S(i19 & 1, z12)) {
                    g0Var2.X();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var8 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    } else {
                        if (i22 != 0) {
                            rVar5 = b2.o.A;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            h0.p1 p1Var9 = s.f5954a;
                            i19 &= -7169;
                            t0VarA = g6.a(k1.b.f8567b, g0Var2);
                        }
                        if (i17 != 0) {
                            n1Var2 = s.f5955b;
                        }
                        z14 = z15;
                        n1Var4 = n1Var2;
                        rVar6 = rVar5;
                    }
                    i2.t0 t0Var7 = t0VarA;
                    g0Var2.s();
                    g0Var = g0Var2;
                    a(aVar, rVar6, z14, t0Var7, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                    rVar4 = rVar6;
                    z13 = z14;
                    t0Var2 = t0Var7;
                    n1Var3 = n1Var4;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    rVar4 = rVar3;
                    z13 = z11;
                    t0Var2 = t0VarA;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
                }
            }
            i12 |= 12582912;
            n1Var2 = n1Var;
            i19 = i12 | 100663296;
            if ((805306368 & i10) != 0) {
                if (g0Var2.i(cVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i19 |= i20;
            }
            if ((306783379 & i19) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var2.S(i19 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var10 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                } else {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var11 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                }
                i2.t0 t0Var8 = t0VarA;
                g0Var2.s();
                g0Var = g0Var2;
                a(aVar, rVar6, z14, t0Var8, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                rVar4 = rVar6;
                z13 = z14;
                t0Var2 = t0Var8;
                n1Var3 = n1Var4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar4 = rVar3;
                z13 = z11;
                t0Var2 = t0VarA;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                t0VarA = t0Var;
                if (g0Var2.g(t0VarA)) {
                }
                i12 |= i23;
            } else {
                t0VarA = t0Var;
            }
            i12 |= i23;
        } else {
            t0VarA = t0Var;
        }
        if ((i10 & 24576) == 0) {
            if (g0Var2.g(rVar2)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i12 |= i21;
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (g0Var2.g(null)) {
                i15 = 131072;
            } else {
                i15 = Cast.MAX_MESSAGE_LENGTH;
            }
            i12 |= i15;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (g0Var2.g(null)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i12 |= i16;
        }
        i17 = i11 & Cast.MAX_NAMESPACE_LENGTH;
        if (i17 != 0) {
            if ((12582912 & i10) == 0) {
                n1Var2 = n1Var;
                if (g0Var2.g(n1Var2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            i19 = i12 | 100663296;
            if ((805306368 & i10) != 0) {
                if (g0Var2.i(cVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i19 |= i20;
            }
            if ((306783379 & i19) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var2.S(i19 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var12 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                } else {
                    if (i22 != 0) {
                        rVar5 = b2.o.A;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        h0.p1 p1Var13 = s.f5954a;
                        i19 &= -7169;
                        t0VarA = g6.a(k1.b.f8567b, g0Var2);
                    }
                    if (i17 != 0) {
                        n1Var2 = s.f5955b;
                    }
                    z14 = z15;
                    n1Var4 = n1Var2;
                    rVar6 = rVar5;
                }
                i2.t0 t0Var9 = t0VarA;
                g0Var2.s();
                g0Var = g0Var2;
                a(aVar, rVar6, z14, t0Var9, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
                rVar4 = rVar6;
                z13 = z14;
                t0Var2 = t0Var9;
                n1Var3 = n1Var4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar4 = rVar3;
                z13 = z11;
                t0Var2 = t0VarA;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
            }
        }
        i12 |= 12582912;
        n1Var2 = n1Var;
        i19 = i12 | 100663296;
        if ((805306368 & i10) != 0) {
            if (g0Var2.i(cVar)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i19 |= i20;
        }
        if ((306783379 & i19) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g0Var2.S(i19 & 1, z12)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    rVar5 = b2.o.A;
                } else {
                    rVar5 = rVar3;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    h0.p1 p1Var14 = s.f5954a;
                    i19 &= -7169;
                    t0VarA = g6.a(k1.b.f8567b, g0Var2);
                }
                if (i17 != 0) {
                    n1Var2 = s.f5955b;
                }
                z14 = z15;
                n1Var4 = n1Var2;
                rVar6 = rVar5;
            } else {
                if (i22 != 0) {
                    rVar5 = b2.o.A;
                } else {
                    rVar5 = rVar3;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    h0.p1 p1Var15 = s.f5954a;
                    i19 &= -7169;
                    t0VarA = g6.a(k1.b.f8567b, g0Var2);
                }
                if (i17 != 0) {
                    n1Var2 = s.f5955b;
                }
                z14 = z15;
                n1Var4 = n1Var2;
                rVar6 = rVar5;
            }
            i2.t0 t0Var10 = t0VarA;
            g0Var2.s();
            g0Var = g0Var2;
            a(aVar, rVar6, z14, t0Var10, rVar2, null, n1Var4, null, cVar, g0Var, i19 & 2147483646, 0);
            rVar4 = rVar6;
            z13 = z14;
            t0Var2 = t0Var10;
            n1Var3 = n1Var4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar4 = rVar3;
            z13 = z11;
            t0Var2 = t0VarA;
            n1Var3 = n1Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k(aVar, rVar4, z13, t0Var2, rVar2, n1Var3, cVar, i10, i11);
        }
    }

    public static z i(long j9, long j10, l1.j jVar, int i10, int i11) {
        long jB = (i11 & 2) != 0 ? r0.b(j9, jVar) : j10;
        long j11 = i2.t.f7167g;
        long jB2 = i2.t.b(0.38f, jB);
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        z zVar = q0Var.Y;
        if (zVar == null) {
            k1.g gVar = k1.m.f8797a;
            z zVar2 = new z(r0.d(q0Var, gVar), r0.a(q0Var, r0.d(q0Var, gVar)), i2.b0.k(i2.t.b(k1.m.f8801e, r0.d(q0Var, k1.m.f8799c)), r0.d(q0Var, gVar)), i2.t.b(0.38f, r0.a(q0Var, r0.d(q0Var, gVar))));
            q0Var.Y = zVar2;
            zVar = zVar2;
        }
        long j12 = j9 != 16 ? j9 : zVar.f6032a;
        long j13 = jB != 16 ? jB : zVar.f6033b;
        if (j11 == 16) {
            j11 = zVar.f6034c;
        }
        long j14 = j11;
        if (jB2 == 16) {
            jB2 = zVar.f6035d;
        }
        return new z(j12, j13, j14, jB2);
    }

    public static a0 j(int i10) {
        float f3 = jl.c.a;
        if ((i10 & 1) != 0) {
            f3 = k1.m.f8798b;
        }
        return new a0(f3, k1.m.f8805i, k1.m.f8803g, k1.m.f8804h, k1.m.f8802f, k1.m.f8800d);
    }

    public static a7 k(long j9, long j10, long j11, long j12, long j13, long j14, long j15, l1.j jVar) {
        long j16 = i2.t.f7167g;
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        a7 a7Var = q0Var.f5918f0;
        if (a7Var == null) {
            a7 a7Var2 = new a7(r0.d(q0Var, k1.d0.f8589a), r0.d(q0Var, k1.d0.f8594f), r0.d(q0Var, k1.d0.f8598j), r0.d(q0Var, k1.d0.f8600n), r0.d(q0Var, k1.d0.f8592d), r0.d(q0Var, k1.d0.f8597i), r0.d(q0Var, k1.d0.f8602p), i2.t.f7166f, r0.d(q0Var, k1.d0.f8603q), r0.d(q0Var, k1.d0.f8604r), r0.d(q0Var, k1.d0.f8611y), r0.d(q0Var, k1.d0.A), r0.d(q0Var, k1.d0.f8612z), r0.d(q0Var, k1.d0.B));
            q0Var.f5918f0 = a7Var2;
            a7Var = a7Var2;
        }
        long j17 = j9 != 16 ? j9 : a7Var.f5715a;
        long j18 = j10 != 16 ? j10 : a7Var.f5716b;
        long j19 = j16 != 16 ? j16 : a7Var.f5717c;
        long j20 = j11 != 16 ? j11 : a7Var.f5718d;
        long j21 = j16 != 16 ? j16 : a7Var.f5719e;
        long j22 = j16 != 16 ? j16 : a7Var.f5720f;
        long j23 = j16 != 16 ? j16 : a7Var.f5721g;
        long j24 = j16 != 16 ? j16 : a7Var.f5722h;
        long j25 = j16 != 16 ? j16 : a7Var.f5723i;
        if (j16 == 16) {
            j16 = a7Var.f5724j;
        }
        return new a7(j17, j18, j19, j20, j21, j22, j23, j24, j25, j16, j12 != 16 ? j12 : a7Var.f5725k, j13 != 16 ? j13 : a7Var.l, j14 != 16 ? j14 : a7Var.m, j15 != 16 ? j15 : a7Var.f5726n);
    }

    public static long l(Context context, int i10) {
        return i2.b0.c(context.getResources().getColor(i10, context.getTheme()));
    }

    public static l3 m(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        long j9 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
        q0 q0Var = (q0) g0Var.k(r0.f5948a);
        l3 l3Var = q0Var.f5910b0;
        if (l3Var == null) {
            long j10 = i2.t.f7166f;
            l3 l3Var2 = new l3(j10, j9, j10, i2.t.b(k1.a0.f8565a, j9));
            q0Var.f5910b0 = l3Var2;
            l3Var = l3Var2;
        }
        long j11 = l3Var.f5856b;
        if (i2.t.c(j11, j9)) {
            return l3Var;
        }
        long jB = i2.t.b(k1.a0.f8565a, j9);
        long j12 = l3Var.f5855a;
        long j13 = l3Var.f5857c;
        if (j9 == 16) {
            j9 = j11;
        }
        if (jB == 16) {
            jB = l3Var.f5858d;
        }
        return new l3(j12, j9, j13, jB);
    }

    public static final boolean n(long j9) {
        if (i2.t.c(j9, i2.t.f7166f)) {
            return false;
        }
        j2.c cVarF = i2.t.f(j9);
        if (!j2.b.a(cVarF.f7861b, j2.b.f7855a)) {
            i2.f0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) j2.b.b(cVarF.f7861b)));
        }
        j2.m mVar = ((j2.r) cVarF).f7915p;
        float fB = (float) ((mVar.b(i2.t.e(j9)) * 0.0722d) + (mVar.b(i2.t.g(j9)) * 0.7152d) + (mVar.b(i2.t.h(j9)) * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            fB = 1.0f;
        }
        return ((double) fB) <= 0.5d;
    }

    public static final long o(float f3, long j9) {
        int iH;
        float f10;
        double d3;
        double[] dArr;
        double d5;
        char c10;
        double d10;
        double d11;
        double[] dArr2;
        boolean z10;
        boolean z11;
        int i10;
        double[] dArr3;
        double dG;
        double[] dArr4;
        int i11;
        double d12;
        double d13;
        int iCeil;
        double dFloor;
        int i12;
        double d14;
        int i13;
        int iFloor;
        double d15;
        double d16;
        double d17;
        double[] dArr5;
        double dG2;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double[] dArr6;
        double[] dArr7;
        double d25;
        double dG3;
        double d26;
        double d27 = f3;
        if ((d27 < 1.0E-4d) || (d27 > 99.9999d)) {
            return i2.b0.c(i1.b.b(d27));
        }
        i1.a aVarE = i1.b.e(i2.b0.C(j9));
        float f11 = aVarE.f7080a;
        float f12 = aVarE.f7081b;
        i1.c cVar = i1.c.f7095k;
        if (kotlin.jvm.internal.m.a(cVar, cVar)) {
            double d28 = f11;
            double d29 = f12;
            double[] dArr8 = i1.b.f7093h;
            if (d29 < 1.0E-4d || d27 < 1.0E-4d || d27 > 99.9999d) {
                iH = i1.b.b(d27);
            } else {
                double d30 = d28 % 360.0d;
                if (d30 < 0.0d) {
                    d30 += 360.0d;
                }
                double radians = Math.toRadians(d30);
                double dPow = (d27 > 8.0d ? Math.pow((d27 + 16.0d) / 116.0d, 3.0d) : d27 / 903.2962962962963d) * 100.0d;
                double dSqrt = Math.sqrt(dPow) * 11.0d;
                int i14 = 1;
                double dPow2 = ((double) 1) / Math.pow(1.64d - Math.pow(0.29d, cVar.f7096a), 0.73d);
                int i15 = 2;
                double dCos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) cVar.f7101f) * ((double) cVar.f7099d);
                double dSin = Math.sin(radians);
                double dCos2 = Math.cos(radians);
                int i16 = 0;
                while (true) {
                    double[] dArr9 = dArr8;
                    int i17 = 8;
                    if (i16 < 5) {
                        d3 = dPow;
                        double d31 = dSqrt / 100.0d;
                        double d32 = dSqrt;
                        double dPow3 = Math.pow(((d29 == 0.0d || dSqrt == 0.0d) ? 0.0d : d29 / Math.sqrt(d31)) * dPow2, 1.1111111111111112d);
                        double dPow4 = (Math.pow(d31, (1.0d / ((double) cVar.f7100e)) / ((double) cVar.f7105j)) * ((double) cVar.f7097b)) / ((double) cVar.f7098c);
                        double d33 = (((0.305d + dPow4) * 23.0d) * dPow3) / (((108.0d * dPow3) * dSin) + (((((double) 11) * dPow3) * dCos2) + (23.0d * dCos)));
                        double d34 = d33 * dCos2;
                        double d35 = d33 * dSin;
                        double d36 = 460.0d * dPow4;
                        double d37 = ((288.0d * d35) + ((451.0d * d34) + d36)) / 1403.0d;
                        double d38 = ((d36 - (891.0d * d34)) - (261.0d * d35)) / 1403.0d;
                        double d39 = ((d36 - (d34 * 220.0d)) - (d35 * 6300.0d)) / 1403.0d;
                        double dI = i1.b.i(d37);
                        double dI2 = i1.b.i(d38);
                        double dI3 = i1.b.i(d39);
                        double[][] dArr10 = i1.b.f7092g;
                        double[] dArr11 = dArr10[0];
                        double d40 = (dArr11[i15] * dI3) + (dArr11[1] * dI2) + (dArr11[0] * dI);
                        double[] dArr12 = dArr10[1];
                        double d41 = (dArr12[i15] * dI3) + (dArr12[1] * dI2) + (dArr12[0] * dI);
                        double[] dArr13 = dArr10[i15];
                        double d42 = (dI3 * dArr13[i15]) + (dI2 * dArr13[1]) + (dI * dArr13[0]);
                        if (d40 >= 0.0d && d41 >= 0.0d && d42 >= 0.0d) {
                            double d43 = (dArr9[i15] * d42) + (dArr9[1] * d41) + (dArr9[0] * d40);
                            if (d43 > 0.0d) {
                                if (i16 != 4) {
                                    double d44 = d43 - d3;
                                    if (Math.abs(d44) >= 0.002d) {
                                        dSqrt = d32 - ((d44 * d32) / (((double) i15) * d43));
                                        i16++;
                                        dArr8 = dArr9;
                                        dPow = d3;
                                        i15 = 2;
                                    }
                                }
                                if (d40 <= 100.01d && d41 <= 100.01d && d42 <= 100.01d) {
                                    iH = (i1.b.d(d42) & 255) | ((i1.b.d(d40) & 255) << 16) | (-16777216) | ((i1.b.d(d41) & 255) << 8);
                                }
                                if (iH == 0) {
                                    d5 = -1.0d;
                                    c10 = 2;
                                    dArr = new double[]{-1.0d, -1.0d, -1.0d};
                                    d10 = 0.0d;
                                    d11 = 0.0d;
                                    dArr2 = dArr;
                                    z10 = true;
                                    z11 = false;
                                    i10 = 0;
                                    while (i10 < 12) {
                                        d18 = dArr9[0];
                                        d19 = dArr9[i14];
                                        d20 = dArr9[c10];
                                        d21 = d5;
                                        if (i10 % 4 <= i14) {
                                            d22 = 0.0d;
                                        } else {
                                            d22 = 100.0d;
                                        }
                                        if (i10 % 2 == 0) {
                                            d23 = 0.0d;
                                        } else {
                                            d23 = 100.0d;
                                        }
                                        if (i10 < 4) {
                                            d26 = ((d3 - (d19 * d22)) - (d20 * d23)) / d18;
                                            if (i1.b.j(d26)) {
                                                dArr6 = new double[]{d26, d22, d23};
                                            } else {
                                                dArr6 = new double[]{d21, d21, d21};
                                            }
                                        } else {
                                            if (i10 < i17) {
                                                d25 = ((d3 - (d18 * d23)) - (d20 * d22)) / d19;
                                                if (i1.b.j(d25)) {
                                                    dArr7 = new double[]{d23, d25, d22};
                                                } else {
                                                    dArr6 = new double[]{d21, d21, d21};
                                                }
                                            } else {
                                                d24 = ((d3 - (d18 * d22)) - (d19 * d23)) / d20;
                                                if (i1.b.j(d24)) {
                                                    dArr7 = new double[]{d22, d23, d24};
                                                } else {
                                                    dArr6 = new double[]{d21, d21, d21};
                                                }
                                            }
                                            if (dArr7[0] < 0.0d) {
                                                dG3 = i1.b.g(dArr7);
                                                if (!z11) {
                                                    dArr = dArr7;
                                                    dArr2 = dArr;
                                                    d10 = dG3;
                                                    d11 = d10;
                                                    z11 = true;
                                                } else if (z10 || i1.b.a(d11, dG3, d10)) {
                                                    if (i1.b.a(d11, radians, dG3)) {
                                                        dArr2 = dArr7;
                                                        d10 = dG3;
                                                    } else {
                                                        dArr = dArr7;
                                                        d11 = dG3;
                                                    }
                                                    z10 = false;
                                                }
                                            }
                                            i10++;
                                            d5 = d21;
                                            c10 = 2;
                                            i14 = 1;
                                            i17 = 8;
                                        }
                                        dArr7 = dArr6;
                                        if (dArr7[0] < 0.0d) {
                                            dG3 = i1.b.g(dArr7);
                                            if (!z11) {
                                                dArr = dArr7;
                                                dArr2 = dArr;
                                                d10 = dG3;
                                                d11 = d10;
                                                z11 = true;
                                            } else if (z10) {
                                                if (i1.b.a(d11, radians, dG3)) {
                                                    dArr2 = dArr7;
                                                    d10 = dG3;
                                                } else {
                                                    dArr = dArr7;
                                                    d11 = dG3;
                                                }
                                                z10 = false;
                                            } else {
                                                if (i1.b.a(d11, radians, dG3)) {
                                                    dArr2 = dArr7;
                                                    d10 = dG3;
                                                } else {
                                                    dArr = dArr7;
                                                    d11 = dG3;
                                                }
                                                z10 = false;
                                            }
                                        }
                                        i10++;
                                        d5 = d21;
                                        c10 = 2;
                                        i14 = 1;
                                        i17 = 8;
                                    }
                                    double[][] dArr14 = {dArr, dArr2};
                                    dArr3 = dArr14[0];
                                    dG = i1.b.g(dArr3);
                                    dArr4 = dArr14[1];
                                    for (i11 = 0; i11 < 3; i11++) {
                                        d12 = dArr3[i11];
                                        d13 = dArr4[i11];
                                        if (d12 != d13) {
                                            if (d12 < d13) {
                                                iCeil = (int) Math.floor(i1.b.l(d12) - 0.5d);
                                                dFloor = Math.ceil(i1.b.l(dArr4[i11]) - 0.5d);
                                            } else {
                                                iCeil = (int) Math.ceil(i1.b.l(d12) - 0.5d);
                                                dFloor = Math.floor(i1.b.l(dArr4[i11]) - 0.5d);
                                            }
                                            i12 = (int) dFloor;
                                            d14 = dG;
                                            for (i13 = 0; i13 < 8 && Math.abs(i12 - iCeil) > 1.0d; i13++) {
                                                iFloor = (int) Math.floor(((double) (iCeil + i12)) / 2.0d);
                                                d15 = i1.b.f7094i[iFloor];
                                                d16 = dArr3[i11];
                                                d17 = dArr4[i11];
                                                if (d17 != d16) {
                                                    d17 = (d15 - d16) / (d17 - d16);
                                                }
                                                double d45 = dArr3[0];
                                                double d46 = ((dArr4[0] - d45) * d17) + d45;
                                                double d47 = dArr3[1];
                                                double d48 = ((dArr4[1] - d47) * d17) + d47;
                                                double d49 = dArr3[2];
                                                dArr5 = new double[]{d46, d48, ((dArr4[2] - d49) * d17) + d49};
                                                dG2 = i1.b.g(dArr5);
                                                if (i1.b.a(d14, radians, dG2)) {
                                                    i12 = iFloor;
                                                    dArr4 = dArr5;
                                                } else {
                                                    iCeil = iFloor;
                                                    dArr3 = dArr5;
                                                    d14 = dG2;
                                                }
                                            }
                                            dG = d14;
                                        }
                                    }
                                    double d50 = 2;
                                    iH = ((i1.b.d((dArr3[0] + dArr4[0]) / d50) & 255) << 16) | (-16777216) | ((i1.b.d((dArr3[1] + dArr4[1]) / d50) & 255) << 8) | (i1.b.d((dArr3[2] + dArr4[2]) / d50) & 255);
                                }
                            }
                        }
                    } else {
                        d3 = dPow;
                    }
                    iH = 0;
                    if (iH == 0) {
                        d5 = -1.0d;
                        c10 = 2;
                        dArr = new double[]{-1.0d, -1.0d, -1.0d};
                        d10 = 0.0d;
                        d11 = 0.0d;
                        dArr2 = dArr;
                        z10 = true;
                        z11 = false;
                        i10 = 0;
                        while (i10 < 12) {
                            d18 = dArr9[0];
                            d19 = dArr9[i14];
                            d20 = dArr9[c10];
                            d21 = d5;
                            if (i10 % 4 <= i14) {
                                d22 = 0.0d;
                            } else {
                                d22 = 100.0d;
                            }
                            if (i10 % 2 == 0) {
                                d23 = 0.0d;
                            } else {
                                d23 = 100.0d;
                            }
                            if (i10 < 4) {
                                d26 = ((d3 - (d19 * d22)) - (d20 * d23)) / d18;
                                if (i1.b.j(d26)) {
                                    dArr6 = new double[]{d26, d22, d23};
                                } else {
                                    dArr6 = new double[]{d21, d21, d21};
                                }
                            } else {
                                if (i10 < i17) {
                                    d25 = ((d3 - (d18 * d23)) - (d20 * d22)) / d19;
                                    if (i1.b.j(d25)) {
                                        dArr7 = new double[]{d23, d25, d22};
                                    } else {
                                        dArr6 = new double[]{d21, d21, d21};
                                    }
                                } else {
                                    d24 = ((d3 - (d18 * d22)) - (d19 * d23)) / d20;
                                    if (i1.b.j(d24)) {
                                        dArr7 = new double[]{d22, d23, d24};
                                    } else {
                                        dArr6 = new double[]{d21, d21, d21};
                                    }
                                }
                                if (dArr7[0] < 0.0d) {
                                    dG3 = i1.b.g(dArr7);
                                    if (!z11) {
                                        dArr = dArr7;
                                        dArr2 = dArr;
                                        d10 = dG3;
                                        d11 = d10;
                                        z11 = true;
                                    } else if (z10) {
                                        if (i1.b.a(d11, radians, dG3)) {
                                            dArr2 = dArr7;
                                            d10 = dG3;
                                        } else {
                                            dArr = dArr7;
                                            d11 = dG3;
                                        }
                                        z10 = false;
                                    } else {
                                        if (i1.b.a(d11, radians, dG3)) {
                                            dArr2 = dArr7;
                                            d10 = dG3;
                                        } else {
                                            dArr = dArr7;
                                            d11 = dG3;
                                        }
                                        z10 = false;
                                    }
                                }
                                i10++;
                                d5 = d21;
                                c10 = 2;
                                i14 = 1;
                                i17 = 8;
                            }
                            dArr7 = dArr6;
                            if (dArr7[0] < 0.0d) {
                                dG3 = i1.b.g(dArr7);
                                if (!z11) {
                                    dArr = dArr7;
                                    dArr2 = dArr;
                                    d10 = dG3;
                                    d11 = d10;
                                    z11 = true;
                                } else if (z10) {
                                    if (i1.b.a(d11, radians, dG3)) {
                                        dArr2 = dArr7;
                                        d10 = dG3;
                                    } else {
                                        dArr = dArr7;
                                        d11 = dG3;
                                    }
                                    z10 = false;
                                } else {
                                    if (i1.b.a(d11, radians, dG3)) {
                                        dArr2 = dArr7;
                                        d10 = dG3;
                                    } else {
                                        dArr = dArr7;
                                        d11 = dG3;
                                    }
                                    z10 = false;
                                }
                            }
                            i10++;
                            d5 = d21;
                            c10 = 2;
                            i14 = 1;
                            i17 = 8;
                        }
                        double[][] dArr15 = {dArr, dArr2};
                        dArr3 = dArr15[0];
                        dG = i1.b.g(dArr3);
                        dArr4 = dArr15[1];
                        while (i11 < 3) {
                            d12 = dArr3[i11];
                            d13 = dArr4[i11];
                            if (d12 != d13) {
                                if (d12 < d13) {
                                    iCeil = (int) Math.floor(i1.b.l(d12) - 0.5d);
                                    dFloor = Math.ceil(i1.b.l(dArr4[i11]) - 0.5d);
                                } else {
                                    iCeil = (int) Math.ceil(i1.b.l(d12) - 0.5d);
                                    dFloor = Math.floor(i1.b.l(dArr4[i11]) - 0.5d);
                                }
                                i12 = (int) dFloor;
                                d14 = dG;
                                while (i13 < 8) {
                                    iFloor = (int) Math.floor(((double) (iCeil + i12)) / 2.0d);
                                    d15 = i1.b.f7094i[iFloor];
                                    d16 = dArr3[i11];
                                    d17 = dArr4[i11];
                                    if (d17 != d16) {
                                        d17 = (d15 - d16) / (d17 - d16);
                                    }
                                    double d410 = dArr3[0];
                                    double d411 = ((dArr4[0] - d410) * d17) + d410;
                                    double d412 = dArr3[1];
                                    double d413 = ((dArr4[1] - d412) * d17) + d412;
                                    double d414 = dArr3[2];
                                    dArr5 = new double[]{d411, d413, ((dArr4[2] - d414) * d17) + d414};
                                    dG2 = i1.b.g(dArr5);
                                    if (i1.b.a(d14, radians, dG2)) {
                                        i12 = iFloor;
                                        dArr4 = dArr5;
                                    } else {
                                        iCeil = iFloor;
                                        dArr3 = dArr5;
                                        d14 = dG2;
                                    }
                                }
                                dG = d14;
                            }
                        }
                        double d51 = 2;
                        iH = ((i1.b.d((dArr3[0] + dArr4[0]) / d51) & 255) << 16) | (-16777216) | ((i1.b.d((dArr3[1] + dArr4[1]) / d51) & 255) << 8) | (i1.b.d((dArr3[2] + dArr4[2]) / d51) & 255);
                    }
                }
            }
        } else if (f12 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            iH = i1.b.h(f3);
        } else {
            float f13 = 0.0f;
            float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
            float f14 = 0.0f;
            float f15 = f12;
            boolean z12 = true;
            i1.a aVar = null;
            while (Math.abs(f14 - f12) >= 0.4000000059604645d) {
                float f16 = 1000.0f;
                f13 = f13;
                float f17 = f13;
                float f18 = 1000.0f;
                float f19 = 100.0f;
                i1.a aVar2 = null;
                while (true) {
                    z12 = z12;
                    if (Math.abs(f17 - f19) <= 0.009999999776482582d) {
                        f15 = f15;
                        break;
                    }
                    float f20 = ((f19 - f17) / 2) + f17;
                    int iC = i1.b.f(f20, f15, fMin).c(i1.c.f7095k);
                    float fK = i1.b.k((iC >> 16) & 255);
                    float fK2 = i1.b.k((iC >> 8) & 255);
                    float fK3 = i1.b.k(iC & 255);
                    double d52 = fK;
                    double[] dArr16 = i1.b.f7089d[1];
                    float f21 = ((float) ((((double) fK3) * dArr16[2]) + ((((double) fK2) * dArr16[1]) + (d52 * dArr16[0])))) / 100.0f;
                    float fCbrt = f21 <= 0.008856452f ? f21 * 903.2963f : (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                    f15 = f15;
                    float fAbs = (float) Math.abs(f3 - fCbrt);
                    if (fAbs < 0.2f) {
                        i1.a aVarE2 = i1.b.e(iC);
                        i1.a aVarF = i1.b.f(aVarE2.f7082c, aVarE2.f7081b, fMin);
                        float f22 = aVarE2.f7083d - aVarF.f7083d;
                        f10 = fCbrt;
                        float f23 = aVarE2.f7084e - aVarF.f7084e;
                        float f24 = aVarE2.f7085f - aVarF.f7085f;
                        float fPow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                        if (fPow <= 1.0f) {
                            f18 = fPow;
                            aVar2 = aVarE2;
                            f16 = fAbs;
                        }
                    } else {
                        f10 = fCbrt;
                    }
                    if (f16 == f13 && f18 == f13) {
                        break;
                    }
                    if (f10 < f3) {
                        f17 = f20;
                    } else {
                        f19 = f20;
                    }
                }
                i1.a aVar3 = aVar2;
                if (!z12) {
                    if (aVar3 == null) {
                        f12 = f15;
                    } else {
                        aVar = aVar3;
                        f14 = f15;
                    }
                    f15 = ((f12 - f14) / 2.0f) + f14;
                    z12 = z12;
                } else if (aVar3 != null) {
                    iH = aVar3.c(cVar);
                } else {
                    f15 = ((f12 - f14) / 2.0f) + f14;
                    z12 = false;
                }
            }
            iH = aVar == null ? i1.b.h(f3) : aVar.c(cVar);
        }
        return i2.b0.c(iH);
    }

    public static final x.b1 p(k1.q qVar, l1.j jVar) throws NoWhenBranchMatchedException {
        x4 x4Var = (x4) ((l1.g0) jVar).k(u3.f5999a);
        int iOrdinal = qVar.ordinal();
        if (iOrdinal == 0) {
            ((w4) x4Var).getClass();
            x.b1 b1Var = w4.f6017b;
            kotlin.jvm.internal.m.c(b1Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return b1Var;
        }
        if (iOrdinal == 1) {
            ((w4) x4Var).getClass();
            x.b1 b1Var2 = w4.f6018c;
            kotlin.jvm.internal.m.c(b1Var2, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return b1Var2;
        }
        if (iOrdinal == 2) {
            ((w4) x4Var).getClass();
            x.b1 b1Var3 = w4.f6019d;
            kotlin.jvm.internal.m.c(b1Var3, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return b1Var3;
        }
        if (iOrdinal == 3) {
            ((w4) x4Var).getClass();
            x.b1 b1Var4 = w4.f6020e;
            kotlin.jvm.internal.m.c(b1Var4, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return b1Var4;
        }
        if (iOrdinal == 4) {
            ((w4) x4Var).getClass();
            x.b1 b1Var5 = w4.f6021f;
            kotlin.jvm.internal.m.c(b1Var5, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return b1Var5;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        ((w4) x4Var).getClass();
        x.b1 b1Var6 = w4.f6022g;
        kotlin.jvm.internal.m.c(b1Var6, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return b1Var6;
    }
}
