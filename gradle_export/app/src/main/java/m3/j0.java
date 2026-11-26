package m3;

import com.google.android.gms.internal.measurement.b5;
import i2.v0;
import kotlin.NoWhenBranchMatchedException;

public abstract class j0 {

    public static final long f10471a = kh.o.z(14);

    public static final long f10472b = kh.o.z(0);

    public static final long f10473c = i2.t.f7166f;

    public static final x3.o f10474d;

    static {
        long j9 = i2.t.f7162b;
        f10474d = j9 != 16 ? new x3.c(j9) : x3.n.f16422a;
    }

    public static final i0 a(i0 i0Var, long j9, i2.q qVar, float f3, long j10, q3.u uVar, q3.o oVar, q3.p pVar, q3.i iVar, String str, long j11, x3.a aVar, x3.p pVar2, t3.b bVar, long j12, x3.l lVar, i2.s0 s0Var, y yVar, k2.e eVar) {
        x3.a aVar2;
        i2.s0 s0Var2;
        y yVar2;
        k2.e eVar2;
        x3.n nVar;
        x3.o cVar;
        x3.o oVar2;
        boolean z10;
        long j13;
        q3.u uVar2;
        q3.o oVar3;
        x3.p pVar3;
        t3.b bVar2;
        long j14;
        x3.l lVar2;
        i2.s0 s0Var3;
        y yVar3;
        long jE;
        q3.p pVar4 = pVar;
        q3.i iVar2 = iVar;
        String str2 = str;
        long j15 = j11;
        y3.p[] pVarArr = y3.o.f16598b;
        long j16 = j10 & 1095216660480L;
        if ((j16 == 0 || y3.o.a(j10, i0Var.f10458b)) && ((qVar != null || j9 == 16 || i2.t.c(j9, i0Var.f10457a.a())) && ((oVar == null || oVar.equals(i0Var.f10460d)) && ((uVar == null || uVar.equals(i0Var.f10459c)) && ((iVar2 == null || iVar2 == i0Var.f10462f) && (((j15 & 1095216660480L) == 0 || y3.o.a(j15, i0Var.f10464h)) && ((lVar == null || lVar.equals(i0Var.m)) && kotlin.jvm.internal.m.a(qVar, i0Var.f10457a.b()) && ((qVar == null || f3 == i0Var.f10457a.c()) && ((pVar4 == null || pVar4.equals(i0Var.f10461e)) && (str2 == null || str2.equals(i0Var.f10463g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(i0Var.f10465i)) {
                }
                nVar = x3.n.f16422a;
                if (qVar != null) {
                    if (qVar instanceof v0) {
                        jE = kh.o.E(f3, ((v0) qVar).f7174a);
                        if (jE != 16) {
                            cVar = new x3.c(jE);
                        } else {
                            cVar = nVar;
                        }
                    } else {
                        if (!(qVar instanceof i2.r0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new x3.b((i2.r0) qVar, f3);
                    }
                } else if (j9 != 16) {
                    cVar = new x3.c(j9);
                } else {
                    cVar = nVar;
                }
                oVar2 = i0Var.f10457a;
                oVar2.getClass();
                z10 = cVar instanceof x3.b;
                if (!z10 && (oVar2 instanceof x3.b)) {
                    x3.b bVar3 = (x3.b) cVar;
                    i2.r0 r0Var = bVar3.f16400a;
                    float f10 = bVar3.f16401b;
                    if (Float.isNaN(f10)) {
                        f10 = ((x3.b) oVar2).f16401b;
                    }
                    cVar = new x3.b(r0Var, f10);
                } else if ((z10 || (oVar2 instanceof x3.b)) && ((!z10 && (oVar2 instanceof x3.b)) || cVar.equals(nVar))) {
                }
                if (iVar2 == null) {
                    iVar2 = i0Var.f10462f;
                }
                if (j16 == 0) {
                    j13 = i0Var.f10458b;
                } else {
                    j13 = j10;
                }
                if (uVar == null) {
                    uVar2 = i0Var.f10459c;
                } else {
                    uVar2 = uVar;
                }
                if (oVar == null) {
                    oVar3 = i0Var.f10460d;
                } else {
                    oVar3 = oVar;
                }
                if (pVar4 == null) {
                    pVar4 = i0Var.f10461e;
                }
                if (str2 == null) {
                    str2 = i0Var.f10463g;
                }
                if ((j15 & 1095216660480L) == 0) {
                    j15 = i0Var.f10464h;
                }
                if (aVar2 == null) {
                    aVar2 = i0Var.f10465i;
                }
                if (pVar2 == null) {
                    pVar3 = i0Var.f10466j;
                } else {
                    pVar3 = pVar2;
                }
                long j17 = j13;
                if (bVar == null) {
                    bVar2 = i0Var.f10467k;
                } else {
                    bVar2 = bVar;
                }
                if (j12 != 16) {
                    j14 = j12;
                } else {
                    j14 = i0Var.l;
                }
                long j18 = j14;
                if (lVar == null) {
                    lVar2 = i0Var.m;
                } else {
                    lVar2 = lVar;
                }
                if (s0Var2 == null) {
                    s0Var3 = i0Var.f10468n;
                } else {
                    s0Var3 = s0Var2;
                }
                yVar3 = i0Var.f10469o;
                if (yVar3 == null) {
                    yVar3 = yVar2;
                }
                if (eVar2 == null) {
                    eVar2 = i0Var.f10470p;
                }
                return new i0(cVar, j17, uVar2, oVar3, pVar4, iVar2, str2, j15, aVar2, pVar3, bVar2, j18, lVar2, s0Var3, yVar3, eVar2);
            }
            aVar2 = aVar;
            if (pVar2 == null || pVar2.equals(i0Var.f10466j)) {
                if (bVar == null || bVar.equals(i0Var.f10467k)) {
                    if (j12 == 16 || i2.t.c(j12, i0Var.l)) {
                        s0Var2 = s0Var;
                        if (s0Var2 == null || s0Var2.equals(i0Var.f10468n)) {
                            yVar2 = yVar;
                            if (yVar2 == null || yVar2.equals(i0Var.f10469o)) {
                                eVar2 = eVar;
                                if (eVar2 == null || eVar2.equals(i0Var.f10470p)) {
                                    return i0Var;
                                }
                            }
                        }
                        eVar2 = eVar;
                    }
                    yVar2 = yVar;
                    eVar2 = eVar;
                }
            }
            nVar = x3.n.f16422a;
            if (qVar != null) {
                if (qVar instanceof v0) {
                    jE = kh.o.E(f3, ((v0) qVar).f7174a);
                    if (jE != 16) {
                        cVar = new x3.c(jE);
                    } else {
                        cVar = nVar;
                    }
                } else {
                    if (!(qVar instanceof i2.r0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new x3.b((i2.r0) qVar, f3);
                }
            } else if (j9 != 16) {
                cVar = new x3.c(j9);
            } else {
                cVar = nVar;
            }
            oVar2 = i0Var.f10457a;
            oVar2.getClass();
            z10 = cVar instanceof x3.b;
            if (!z10) {
                cVar = z10 ? oVar2 : oVar2;
            } else if (z10) {
            }
            if (iVar2 == null) {
                iVar2 = i0Var.f10462f;
            }
            if (j16 == 0) {
                j13 = i0Var.f10458b;
            } else {
                j13 = j10;
            }
            if (uVar == null) {
                uVar2 = i0Var.f10459c;
            } else {
                uVar2 = uVar;
            }
            if (oVar == null) {
                oVar3 = i0Var.f10460d;
            } else {
                oVar3 = oVar;
            }
            if (pVar4 == null) {
                pVar4 = i0Var.f10461e;
            }
            if (str2 == null) {
                str2 = i0Var.f10463g;
            }
            if ((j15 & 1095216660480L) == 0) {
                j15 = i0Var.f10464h;
            }
            if (aVar2 == null) {
                aVar2 = i0Var.f10465i;
            }
            if (pVar2 == null) {
                pVar3 = i0Var.f10466j;
            } else {
                pVar3 = pVar2;
            }
            long j19 = j13;
            if (bVar == null) {
                bVar2 = i0Var.f10467k;
            } else {
                bVar2 = bVar;
            }
            if (j12 != 16) {
                j14 = j12;
            } else {
                j14 = i0Var.l;
            }
            long j110 = j14;
            if (lVar == null) {
                lVar2 = i0Var.m;
            } else {
                lVar2 = lVar;
            }
            if (s0Var2 == null) {
                s0Var3 = i0Var.f10468n;
            } else {
                s0Var3 = s0Var2;
            }
            yVar3 = i0Var.f10469o;
            if (yVar3 == null) {
                yVar3 = yVar2;
            }
            if (eVar2 == null) {
                eVar2 = i0Var.f10470p;
            }
            return new i0(cVar, j19, uVar2, oVar3, pVar4, iVar2, str2, j15, aVar2, pVar3, bVar2, j110, lVar2, s0Var3, yVar3, eVar2);
        }
        aVar2 = aVar;
        s0Var2 = s0Var;
        yVar2 = yVar;
        eVar2 = eVar;
        nVar = x3.n.f16422a;
        if (qVar != null) {
            if (qVar instanceof v0) {
                jE = kh.o.E(f3, ((v0) qVar).f7174a);
                if (jE != 16) {
                    cVar = new x3.c(jE);
                } else {
                    cVar = nVar;
                }
            } else {
                if (!(qVar instanceof i2.r0)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new x3.b((i2.r0) qVar, f3);
            }
        } else if (j9 != 16) {
            cVar = new x3.c(j9);
        } else {
            cVar = nVar;
        }
        oVar2 = i0Var.f10457a;
        oVar2.getClass();
        z10 = cVar instanceof x3.b;
        if (!z10) {
            if (z10) {
            }
        } else if (z10) {
        }
        if (iVar2 == null) {
            iVar2 = i0Var.f10462f;
        }
        if (j16 == 0) {
            j13 = i0Var.f10458b;
        } else {
            j13 = j10;
        }
        if (uVar == null) {
            uVar2 = i0Var.f10459c;
        } else {
            uVar2 = uVar;
        }
        if (oVar == null) {
            oVar3 = i0Var.f10460d;
        } else {
            oVar3 = oVar;
        }
        if (pVar4 == null) {
            pVar4 = i0Var.f10461e;
        }
        if (str2 == null) {
            str2 = i0Var.f10463g;
        }
        if ((j15 & 1095216660480L) == 0) {
            j15 = i0Var.f10464h;
        }
        if (aVar2 == null) {
            aVar2 = i0Var.f10465i;
        }
        if (pVar2 == null) {
            pVar3 = i0Var.f10466j;
        } else {
            pVar3 = pVar2;
        }
        long j111 = j13;
        if (bVar == null) {
            bVar2 = i0Var.f10467k;
        } else {
            bVar2 = bVar;
        }
        if (j12 != 16) {
            j14 = j12;
        } else {
            j14 = i0Var.l;
        }
        long j112 = j14;
        if (lVar == null) {
            lVar2 = i0Var.m;
        } else {
            lVar2 = lVar;
        }
        if (s0Var2 == null) {
            s0Var3 = i0Var.f10468n;
        } else {
            s0Var3 = s0Var2;
        }
        yVar3 = i0Var.f10469o;
        if (yVar3 == null) {
            yVar3 = yVar2;
        }
        if (eVar2 == null) {
            eVar2 = i0Var.f10470p;
        }
        return new i0(cVar, j111, uVar2, oVar3, pVar4, iVar2, str2, j15, aVar2, pVar3, bVar2, j112, lVar2, s0Var3, yVar3, eVar2);
    }

    public static final Object b(Object obj, Object obj2, float f3) {
        return ((double) f3) < 0.5d ? obj : obj2;
    }

    public static final long c(long j9, long j10, float f3) {
        y3.p[] pVarArr = y3.o.f16598b;
        long j11 = j9 & 1095216660480L;
        if (j11 == 0 || (1095216660480L & j10) == 0) {
            return ((y3.o) b(new y3.o(j9), new y3.o(j10), f3)).f16600a;
        }
        kh.o.p(j9, j10);
        return kh.o.F(b5.A(y3.o.c(j9), y3.o.c(j10), f3), j11);
    }
}
