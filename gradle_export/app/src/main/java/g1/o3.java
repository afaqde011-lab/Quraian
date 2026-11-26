package g1;

import com.google.android.gms.cast.Cast;

public abstract class o3 {

    public static final b2.r f5895a = h0.z1.m(b2.o.A, k1.z.f8915d);

    public static final void a(m2.b bVar, String str, b2.r rVar, long j9, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar2;
        long j10;
        boolean z10;
        b2.r rVar3;
        long j11;
        l1.r1 r1VarT;
        int i13;
        b2.r rVar4;
        boolean z11;
        Object objN;
        b2.r rVarC;
        long jH;
        boolean z12;
        Object objN2;
        int i14;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2142239481);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.i(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var.g(str) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            if ((i10 & 3072) == 0) {
                j10 = j9;
                if ((i11 & 8) == 0 || !g0Var.f(j10)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i12 |= i14;
            } else {
                j10 = j9;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                g0Var.X();
                i13 = i10 & 1;
                rVar4 = b2.o.A;
                if (i13 != 0 || g0Var.A()) {
                    if (i15 != 0) {
                        rVar2 = rVar4;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                        i12 &= -7169;
                    }
                } else {
                    g0Var.V();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                g0Var.s();
                z11 = (((i12 & 7168) ^ 3072) <= 2048 && g0Var.f(j10)) || (i12 & 3072) == 2048;
                objN = g0Var.N();
                l1.c cVar = l1.i.f9868a;
                if (z11 || objN == cVar) {
                    if (i2.t.c(j10, i2.t.f7167g)) {
                        objN = null;
                    } else {
                        objN = new i2.m(j10, 5);
                    }
                    g0Var.n0(objN);
                }
                i2.m mVar = (i2.m) objN;
                if (str != null) {
                    g0Var.c0(-536990979);
                    if ((i12 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objN2 = g0Var.N();
                    if (z12 || objN2 == cVar) {
                        objN2 = new b6.o(str, 9);
                        g0Var.n0(objN2);
                    }
                    rVarC = j3.q.c(rVar4, false, (u00.k) objN2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-536832197);
                    g0Var.r(false);
                    rVarC = rVar4;
                }
                b2.r rVar5 = rVar2;
                if (h2.e.a(bVar.h(), 9205357640488583168L)) {
                    rVar4 = f5895a;
                } else {
                    jH = bVar.h();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jH & 4294967295L)))) {
                        rVar4 = f5895a;
                    }
                }
                h0.o.a(f2.h.h(rVar5.V(rVar4), bVar, null, z2.o.f17146b, 0.0f, mVar, 22).V(rVarC), g0Var, 0);
                rVar3 = rVar5;
                j11 = j10;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                j11 = j10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new n3(bVar, str, rVar3, j11, i10, i11, 0);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        if ((i10 & 3072) == 0) {
            j10 = j9;
            if ((i11 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        } else {
            j10 = j9;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i12 & 1, z10)) {
            g0Var.X();
            i13 = i10 & 1;
            rVar4 = b2.o.A;
            if (i13 != 0) {
                if (i15 != 0) {
                    rVar2 = rVar4;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                    i12 &= -7169;
                }
            } else {
                if (i15 != 0) {
                    rVar2 = rVar4;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                    i12 &= -7169;
                }
            }
            g0Var.s();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (z11) {
                if (i2.t.c(j10, i2.t.f7167g)) {
                    objN = null;
                } else {
                    objN = new i2.m(j10, 5);
                }
                g0Var.n0(objN);
            } else {
                if (i2.t.c(j10, i2.t.f7167g)) {
                    objN = null;
                } else {
                    objN = new i2.m(j10, 5);
                }
                g0Var.n0(objN);
            }
            i2.m mVar2 = (i2.m) objN;
            if (str != null) {
                g0Var.c0(-536990979);
                if ((i12 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objN2 = g0Var.N();
                if (z12) {
                    objN2 = new b6.o(str, 9);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new b6.o(str, 9);
                    g0Var.n0(objN2);
                }
                rVarC = j3.q.c(rVar4, false, (u00.k) objN2);
                g0Var.r(false);
            } else {
                g0Var.c0(-536832197);
                g0Var.r(false);
                rVarC = rVar4;
            }
            b2.r rVar6 = rVar2;
            if (h2.e.a(bVar.h(), 9205357640488583168L)) {
                jH = bVar.h();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32)))) {
                    rVar4 = f5895a;
                }
            } else {
                rVar4 = f5895a;
            }
            h0.o.a(f2.h.h(rVar6.V(rVar4), bVar, null, z2.o.f17146b, 0.0f, mVar2, 22).V(rVarC), g0Var, 0);
            rVar3 = rVar6;
            j11 = j10;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            j11 = j10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new n3(bVar, str, rVar3, j11, i10, i11, 0);
        }
    }

    public static final void b(o2.f fVar, String str, b2.r rVar, long j9, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar2;
        long j10;
        boolean z10;
        long j11;
        b2.r rVar3;
        l1.r1 r1VarT;
        b2.r rVar4;
        b2.r rVar5;
        long j12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-126890956);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.g(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var.g(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j10 = j9;
                    int i14 = g0Var.f(j10) ? 2048 : 1024;
                    i12 |= i14;
                } else {
                    j10 = j9;
                }
                i12 |= i14;
            } else {
                j10 = j9;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                g0Var.X();
                if ((i10 & 1) != 0 || g0Var.A()) {
                    if (i13 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        rVar5 = rVar4;
                        j12 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                    } else {
                        rVar5 = rVar4;
                    }
                    g0Var.s();
                    a(o2.b.d(fVar, g0Var), str, rVar5, j12, g0Var, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                    rVar3 = rVar5;
                    j11 = j12;
                } else {
                    g0Var.V();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    rVar5 = rVar2;
                }
                j12 = j10;
                g0Var.s();
                a(o2.b.d(fVar, g0Var), str, rVar5, j12, g0Var, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                rVar3 = rVar5;
                j11 = j12;
            } else {
                g0Var.V();
                j11 = j10;
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new n3(fVar, str, rVar3, j11, i10, i11, 2);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j10 = j9;
                if (g0Var.f(j10)) {
                }
                i12 |= i14;
            } else {
                j10 = j9;
            }
            i12 |= i14;
        } else {
            j10 = j9;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i12 & 1, z10)) {
            g0Var.X();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    rVar5 = rVar4;
                    j12 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                } else {
                    rVar5 = rVar4;
                    j12 = j10;
                }
            } else {
                if (i13 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    rVar5 = rVar4;
                    j12 = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
                } else {
                    rVar5 = rVar4;
                    j12 = j10;
                }
            }
            g0Var.s();
            a(o2.b.d(fVar, g0Var), str, rVar5, j12, g0Var, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
            rVar3 = rVar5;
            j11 = j12;
        } else {
            g0Var.V();
            j11 = j10;
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new n3(fVar, str, rVar3, j11, i10, i11, 2);
        }
    }
}
