package to;

import b2.o;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import g1.o3;
import h0.z1;
import h00.r;
import hb.u;
import i2.b0;
import i2.c0;
import java.util.ArrayList;
import java.util.List;
import l1.f1;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.y0;
import u00.n;
import z2.w0;

public abstract class m {
    public static final long a = b0.h(0.4911009f, 0.49981034f);
    public static final ArrayList b;
    public static final oj.l c;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        g00.k kVar = new g00.k(fValueOf, fValueOf);
        g00.k kVar2 = new g00.k(Float.valueOf(0.017f), Float.valueOf(0.139f));
        Float fValueOf2 = Float.valueOf(0.033f);
        Float fValueOf3 = Float.valueOf(0.25f);
        g00.k kVar3 = new g00.k(fValueOf2, fValueOf3);
        g00.k kVar4 = new g00.k(Float.valueOf(0.05f), Float.valueOf(0.319f));
        g00.k kVar5 = new g00.k(Float.valueOf(0.067f), Float.valueOf(0.417f));
        g00.k kVar6 = new g00.k(Float.valueOf(0.083f), Float.valueOf(0.486f));
        g00.k kVar7 = new g00.k(Float.valueOf(0.1f), Float.valueOf(0.556f));
        g00.k kVar8 = new g00.k(Float.valueOf(0.117f), Float.valueOf(0.611f));
        g00.k kVar9 = new g00.k(Float.valueOf(0.133f), Float.valueOf(0.681f));
        g00.k kVar10 = new g00.k(Float.valueOf(0.15f), Float.valueOf(0.728f));
        g00.k kVar11 = new g00.k(Float.valueOf(0.167f), Float.valueOf(0.783f));
        g00.k kVar12 = new g00.k(Float.valueOf(0.183f), Float.valueOf(0.828f));
        g00.k kVar13 = new g00.k(Float.valueOf(0.2f), Float.valueOf(0.867f));
        g00.k kVar14 = new g00.k(Float.valueOf(0.217f), Float.valueOf(0.903f));
        g00.k kVar15 = new g00.k(Float.valueOf(0.233f), Float.valueOf(0.939f));
        g00.k kVar16 = new g00.k(fValueOf3, Float.valueOf(0.961f));
        g00.k kVar17 = new g00.k(Float.valueOf(0.267f), Float.valueOf(0.978f));
        g00.k kVar18 = new g00.k(Float.valueOf(0.283f), Float.valueOf(0.992f));
        Float fValueOf4 = Float.valueOf(0.3f);
        Float fValueOf5 = Float.valueOf(1.0f);
        List<g00.k> listS = va.a.S(new g00.k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, new g00.k(fValueOf4, fValueOf5), new g00.k(Float.valueOf(0.333f), Float.valueOf(1.008f)), new g00.k(Float.valueOf(0.367f), Float.valueOf(1.011f)), new g00.k(Float.valueOf(0.4f), Float.valueOf(1.006f)), new g00.k(Float.valueOf(0.45f), fValueOf5)});
        ArrayList arrayList = new ArrayList(r.q0(listS, 10));
        for (g00.k kVar19 : listS) {
            arrayList.add(new g00.k(Float.valueOf(((Number) kVar19.A).floatValue() / 0.45f), Float.valueOf(((Number) kVar19.B).floatValue())));
        }
        b = arrayList;
        c = new oj.l(22);
    }

    public static final void a(final int i, final boolean z, final String contentDescription, final u00.a onClick, b2.r rVar, float f, float f2, long j, l1.j jVar, final int i2, final int i3) {
        int i4;
        b2.r rVar2;
        int i5;
        float f3;
        int i6;
        int i7;
        final float f4;
        int i8;
        int i9;
        int i11;
        boolean z2;
        l1.j jVar2;
        final b2.r rVar3;
        final float f5;
        final long j2;
        r1 r1VarT;
        int i12;
        float f6;
        long j3;
        boolean z3;
        float f7;
        Object objN;
        l1.c cVar;
        f1 f1Var;
        Object objN2;
        x.b bVar;
        boolean zI;
        Object objN3;
        boolean z4;
        Object objN4;
        boolean z5;
        Object objN5;
        b3.g gVar;
        kotlin.jvm.internal.m.e(contentDescription, "contentDescription");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(478414185);
        if ((i2 & 6) == 0) {
            i4 = (jVar3.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= jVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= jVar3.g(contentDescription) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= jVar3.i(onClick) ? 2048 : 1024;
        }
        int i13 = i3 & 16;
        if (i13 == 0) {
            if ((i2 & 24576) == 0) {
                rVar2 = rVar;
                i4 |= jVar3.g(rVar2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f;
                    if (jVar3.d(f3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i2 & 1572864) == 0) {
                        if (jVar3.d(f4)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i9 = i13;
                        int i14 = jVar3.f(j) ? 8388608 : 4194304;
                        i4 |= i14;
                    } else {
                        i9 = i13;
                    }
                    i4 |= i14;
                } else {
                    i9 = i13;
                }
                i11 = i4;
                if ((i11 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (jVar3.S(i11 & 1, z2)) {
                    jVar3.X();
                    if ((i2 & 1) != 0 || jVar3.A()) {
                        if (i9 != 0) {
                            rVar2 = o.A;
                        }
                        if (i5 != 0) {
                            f3 = 44;
                        }
                        if (i7 != 0) {
                            f4 = 30;
                        }
                        if ((i3 & 128) != 0) {
                            i12 = i11 & (-29360129);
                            f6 = f3;
                            j3 = dl.a.n;
                        } else {
                            j3 = j;
                            f6 = f3;
                            i12 = i11;
                        }
                    } else {
                        jVar3.V();
                        if ((i3 & 128) != 0) {
                            j3 = j;
                            i12 = i11 & (-29360129);
                            f6 = f3;
                        } else {
                            j3 = j;
                            f6 = f3;
                            i12 = i11;
                        }
                    }
                    float f8 = f4;
                    jVar3.s();
                    if (jVar3.k(o1.n) == y3.m.B) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z != z3) {
                        f7 = 1.0f;
                    } else {
                        f7 = -1.0f;
                    }
                    objN = jVar3.N();
                    cVar = l1.i.a;
                    if (objN == cVar) {
                        objN = oi.k.s(0, jVar3);
                    }
                    f1Var = (y0) objN;
                    f1 f1Var2 = f1Var;
                    boolean z6 = z3;
                    p2 p2VarB = x.d.b(f1Var2.h() * 360.0f * f7, x.c.w(450, 0, c, 2), (String) null, jVar3, 48, 28);
                    objN2 = jVar3.N();
                    if (objN2 == cVar) {
                        objN2 = x.c.a(0.0f, 0.01f);
                        jVar3.n0(objN2);
                    }
                    bVar = (x.b) objN2;
                    Integer numValueOf = Integer.valueOf(f1Var2.h());
                    zI = jVar3.i(bVar) | jVar3.d(f7);
                    objN3 = jVar3.N();
                    if (zI || objN3 == cVar) {
                        objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                        jVar3.n0(objN3);
                    }
                    q.i(numValueOf, jVar3, (n) objN3);
                    b2.r rVarC = f2.h.c(z1.m(rVar2, f6), p0.f.a);
                    if ((i12 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objN4 = jVar3.N();
                    if (z4 || objN4 == cVar) {
                        objN4 = new l6.c(onClick, f1Var, 19);
                        jVar3.n0(objN4);
                    }
                    b2.r rVarN = w50.c.n(rVarC, true, (u00.a) objN4);
                    if ((i12 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objN5 = jVar3.N();
                    if (z5 || objN5 == cVar) {
                        objN5 = new u(contentDescription, 26);
                        jVar3.n0(objN5);
                    }
                    b2.r rVarC2 = j3.q.c(rVarN, false, (u00.k) objN5);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(((g0) jVar3).T);
                    m1 m1VarM = jVar3.m();
                    b2.r rVarC3 = b2.a.c(rVarC2, jVar3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    jVar3.g0();
                    if (((g0) jVar3).S) {
                        jVar3.l(gVar);
                    } else {
                        jVar3.q0();
                    }
                    q.I(w0VarD, jVar3, b3.h.f);
                    q.I(m1VarM, jVar3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), jVar3, b3.h.g);
                    q.E(jVar3, b3.h.h);
                    q.I(rVarC3, jVar3, b3.h.d);
                    int i15 = i12 >> 12;
                    jVar2 = jVar3;
                    b(i, ((Number) p2VarB.getValue()).floatValue(), f8, j3, z6, jVar2, (i12 & 14) | (i15 & 896) | (i15 & 7168), 0);
                    b(2131231378, ((Number) bVar.d()).floatValue(), f8, j3, false, jVar2, i15 & 8064, 16);
                    jVar3.r(true);
                    rVar3 = rVar2;
                    f4 = f8;
                    j2 = j3;
                    f5 = f6;
                } else {
                    jVar3.V();
                    jVar2 = jVar3;
                    rVar3 = rVar2;
                    f5 = f3;
                    j2 = j;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            m.a(i, z, contentDescription, onClick, rVar3, f5, f4, j2, (l1.j) obj, q.K(i2 | 1), i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 196608;
            f3 = f;
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                f4 = f2;
            } else {
                f4 = f2;
                if ((i2 & 1572864) == 0) {
                    if (jVar3.d(f4)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i9 = i13;
                    if (jVar3.f(j)) {
                    }
                    i4 |= i14;
                } else {
                    i9 = i13;
                }
                i4 |= i14;
            } else {
                i9 = i13;
            }
            i11 = i4;
            if ((i11 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (jVar3.S(i11 & 1, z2)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        rVar2 = o.A;
                    }
                    if (i5 != 0) {
                        f3 = 44;
                    }
                    if (i7 != 0) {
                        f4 = 30;
                    }
                    if ((i3 & 128) != 0) {
                        i12 = i11 & (-29360129);
                        f6 = f3;
                        j3 = dl.a.n;
                    } else {
                        j3 = j;
                        f6 = f3;
                        i12 = i11;
                    }
                } else {
                    if (i9 != 0) {
                        rVar2 = o.A;
                    }
                    if (i5 != 0) {
                        f3 = 44;
                    }
                    if (i7 != 0) {
                        f4 = 30;
                    }
                    if ((i3 & 128) != 0) {
                        i12 = i11 & (-29360129);
                        f6 = f3;
                        j3 = dl.a.n;
                    } else {
                        j3 = j;
                        f6 = f3;
                        i12 = i11;
                    }
                }
                float f9 = f4;
                jVar3.s();
                if (jVar3.k(o1.n) == y3.m.B) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z != z3) {
                    f7 = 1.0f;
                } else {
                    f7 = -1.0f;
                }
                objN = jVar3.N();
                cVar = l1.i.a;
                if (objN == cVar) {
                    objN = oi.k.s(0, jVar3);
                }
                f1Var = (y0) objN;
                f1 f1Var3 = f1Var;
                boolean z7 = z3;
                p2 p2VarB2 = x.d.b(f1Var3.h() * 360.0f * f7, x.c.w(450, 0, c, 2), (String) null, jVar3, 48, 28);
                objN2 = jVar3.N();
                if (objN2 == cVar) {
                    objN2 = x.c.a(0.0f, 0.01f);
                    jVar3.n0(objN2);
                }
                bVar = (x.b) objN2;
                Integer numValueOf2 = Integer.valueOf(f1Var3.h());
                zI = jVar3.i(bVar) | jVar3.d(f7);
                objN3 = jVar3.N();
                if (zI) {
                    objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                    jVar3.n0(objN3);
                } else {
                    objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                    jVar3.n0(objN3);
                }
                q.i(numValueOf2, jVar3, (n) objN3);
                b2.r rVarC4 = f2.h.c(z1.m(rVar2, f6), p0.f.a);
                if ((i12 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objN4 = jVar3.N();
                if (z4) {
                    objN4 = new l6.c(onClick, f1Var, 19);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new l6.c(onClick, f1Var, 19);
                    jVar3.n0(objN4);
                }
                b2.r rVarN2 = w50.c.n(rVarC4, true, (u00.a) objN4);
                if ((i12 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN5 = jVar3.N();
                if (z5) {
                    objN5 = new u(contentDescription, 26);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new u(contentDescription, 26);
                    jVar3.n0(objN5);
                }
                b2.r rVarC5 = j3.q.c(rVarN2, false, (u00.k) objN5);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(((g0) jVar3).T);
                m1 m1VarM2 = jVar3.m();
                b2.r rVarC6 = b2.a.c(rVarC5, jVar3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar3.g0();
                if (((g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                q.I(w0VarD2, jVar3, b3.h.f);
                q.I(m1VarM2, jVar3, b3.h.e);
                q.I(Integer.valueOf(iHashCode2), jVar3, b3.h.g);
                q.E(jVar3, b3.h.h);
                q.I(rVarC6, jVar3, b3.h.d);
                int i16 = i12 >> 12;
                jVar2 = jVar3;
                b(i, ((Number) p2VarB2.getValue()).floatValue(), f9, j3, z7, jVar2, (i12 & 14) | (i16 & 896) | (i16 & 7168), 0);
                b(2131231378, ((Number) bVar.d()).floatValue(), f9, j3, false, jVar2, i16 & 8064, 16);
                jVar3.r(true);
                rVar3 = rVar2;
                f4 = f9;
                j2 = j3;
                f5 = f6;
            } else {
                jVar3.V();
                jVar2 = jVar3;
                rVar3 = rVar2;
                f5 = f3;
                j2 = j;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m.a(i, z, contentDescription, onClick, rVar3, f5, f4, j2, (l1.j) obj, q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 24576;
        rVar2 = rVar;
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                f3 = f;
                if (jVar3.d(f3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                f4 = f2;
            } else {
                f4 = f2;
                if ((i2 & 1572864) == 0) {
                    if (jVar3.d(f4)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i9 = i13;
                    if (jVar3.f(j)) {
                    }
                    i4 |= i14;
                } else {
                    i9 = i13;
                }
                i4 |= i14;
            } else {
                i9 = i13;
            }
            i11 = i4;
            if ((i11 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (jVar3.S(i11 & 1, z2)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        rVar2 = o.A;
                    }
                    if (i5 != 0) {
                        f3 = 44;
                    }
                    if (i7 != 0) {
                        f4 = 30;
                    }
                    if ((i3 & 128) != 0) {
                        i12 = i11 & (-29360129);
                        f6 = f3;
                        j3 = dl.a.n;
                    } else {
                        j3 = j;
                        f6 = f3;
                        i12 = i11;
                    }
                } else {
                    if (i9 != 0) {
                        rVar2 = o.A;
                    }
                    if (i5 != 0) {
                        f3 = 44;
                    }
                    if (i7 != 0) {
                        f4 = 30;
                    }
                    if ((i3 & 128) != 0) {
                        i12 = i11 & (-29360129);
                        f6 = f3;
                        j3 = dl.a.n;
                    } else {
                        j3 = j;
                        f6 = f3;
                        i12 = i11;
                    }
                }
                float f11 = f4;
                jVar3.s();
                if (jVar3.k(o1.n) == y3.m.B) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z != z3) {
                    f7 = 1.0f;
                } else {
                    f7 = -1.0f;
                }
                objN = jVar3.N();
                cVar = l1.i.a;
                if (objN == cVar) {
                    objN = oi.k.s(0, jVar3);
                }
                f1Var = (y0) objN;
                f1 f1Var4 = f1Var;
                boolean z8 = z3;
                p2 p2VarB3 = x.d.b(f1Var4.h() * 360.0f * f7, x.c.w(450, 0, c, 2), (String) null, jVar3, 48, 28);
                objN2 = jVar3.N();
                if (objN2 == cVar) {
                    objN2 = x.c.a(0.0f, 0.01f);
                    jVar3.n0(objN2);
                }
                bVar = (x.b) objN2;
                Integer numValueOf3 = Integer.valueOf(f1Var4.h());
                zI = jVar3.i(bVar) | jVar3.d(f7);
                objN3 = jVar3.N();
                if (zI) {
                    objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                    jVar3.n0(objN3);
                } else {
                    objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                    jVar3.n0(objN3);
                }
                q.i(numValueOf3, jVar3, (n) objN3);
                b2.r rVarC7 = f2.h.c(z1.m(rVar2, f6), p0.f.a);
                if ((i12 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objN4 = jVar3.N();
                if (z4) {
                    objN4 = new l6.c(onClick, f1Var, 19);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new l6.c(onClick, f1Var, 19);
                    jVar3.n0(objN4);
                }
                b2.r rVarN3 = w50.c.n(rVarC7, true, (u00.a) objN4);
                if ((i12 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN5 = jVar3.N();
                if (z5) {
                    objN5 = new u(contentDescription, 26);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new u(contentDescription, 26);
                    jVar3.n0(objN5);
                }
                b2.r rVarC8 = j3.q.c(rVarN3, false, (u00.k) objN5);
                w0 w0VarD3 = h0.o.d(b2.b.E, false);
                int iHashCode3 = Long.hashCode(((g0) jVar3).T);
                m1 m1VarM3 = jVar3.m();
                b2.r rVarC9 = b2.a.c(rVarC8, jVar3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar3.g0();
                if (((g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                q.I(w0VarD3, jVar3, b3.h.f);
                q.I(m1VarM3, jVar3, b3.h.e);
                q.I(Integer.valueOf(iHashCode3), jVar3, b3.h.g);
                q.E(jVar3, b3.h.h);
                q.I(rVarC9, jVar3, b3.h.d);
                int i17 = i12 >> 12;
                jVar2 = jVar3;
                b(i, ((Number) p2VarB3.getValue()).floatValue(), f11, j3, z8, jVar2, (i12 & 14) | (i17 & 896) | (i17 & 7168), 0);
                b(2131231378, ((Number) bVar.d()).floatValue(), f11, j3, false, jVar2, i17 & 8064, 16);
                jVar3.r(true);
                rVar3 = rVar2;
                f4 = f11;
                j2 = j3;
                f5 = f6;
            } else {
                jVar3.V();
                jVar2 = jVar3;
                rVar3 = rVar2;
                f5 = f3;
                j2 = j;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m.a(i, z, contentDescription, onClick, rVar3, f5, f4, j2, (l1.j) obj, q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 196608;
        f3 = f;
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            f4 = f2;
        } else {
            f4 = f2;
            if ((i2 & 1572864) == 0) {
                if (jVar3.d(f4)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
        }
        if ((i2 & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                i9 = i13;
                if (jVar3.f(j)) {
                }
                i4 |= i14;
            } else {
                i9 = i13;
            }
            i4 |= i14;
        } else {
            i9 = i13;
        }
        i11 = i4;
        if ((i11 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jVar3.S(i11 & 1, z2)) {
            jVar3.X();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    rVar2 = o.A;
                }
                if (i5 != 0) {
                    f3 = 44;
                }
                if (i7 != 0) {
                    f4 = 30;
                }
                if ((i3 & 128) != 0) {
                    i12 = i11 & (-29360129);
                    f6 = f3;
                    j3 = dl.a.n;
                } else {
                    j3 = j;
                    f6 = f3;
                    i12 = i11;
                }
            } else {
                if (i9 != 0) {
                    rVar2 = o.A;
                }
                if (i5 != 0) {
                    f3 = 44;
                }
                if (i7 != 0) {
                    f4 = 30;
                }
                if ((i3 & 128) != 0) {
                    i12 = i11 & (-29360129);
                    f6 = f3;
                    j3 = dl.a.n;
                } else {
                    j3 = j;
                    f6 = f3;
                    i12 = i11;
                }
            }
            float f12 = f4;
            jVar3.s();
            if (jVar3.k(o1.n) == y3.m.B) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z != z3) {
                f7 = 1.0f;
            } else {
                f7 = -1.0f;
            }
            objN = jVar3.N();
            cVar = l1.i.a;
            if (objN == cVar) {
                objN = oi.k.s(0, jVar3);
            }
            f1Var = (y0) objN;
            f1 f1Var5 = f1Var;
            boolean z9 = z3;
            p2 p2VarB4 = x.d.b(f1Var5.h() * 360.0f * f7, x.c.w(450, 0, c, 2), (String) null, jVar3, 48, 28);
            objN2 = jVar3.N();
            if (objN2 == cVar) {
                objN2 = x.c.a(0.0f, 0.01f);
                jVar3.n0(objN2);
            }
            bVar = (x.b) objN2;
            Integer numValueOf4 = Integer.valueOf(f1Var5.h());
            zI = jVar3.i(bVar) | jVar3.d(f7);
            objN3 = jVar3.N();
            if (zI) {
                objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                jVar3.n0(objN3);
            } else {
                objN3 = new f1.g(bVar, f1Var, f7, (k00.c) null);
                jVar3.n0(objN3);
            }
            q.i(numValueOf4, jVar3, (n) objN3);
            b2.r rVarC10 = f2.h.c(z1.m(rVar2, f6), p0.f.a);
            if ((i12 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            objN4 = jVar3.N();
            if (z4) {
                objN4 = new l6.c(onClick, f1Var, 19);
                jVar3.n0(objN4);
            } else {
                objN4 = new l6.c(onClick, f1Var, 19);
                jVar3.n0(objN4);
            }
            b2.r rVarN4 = w50.c.n(rVarC10, true, (u00.a) objN4);
            if ((i12 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            objN5 = jVar3.N();
            if (z5) {
                objN5 = new u(contentDescription, 26);
                jVar3.n0(objN5);
            } else {
                objN5 = new u(contentDescription, 26);
                jVar3.n0(objN5);
            }
            b2.r rVarC11 = j3.q.c(rVarN4, false, (u00.k) objN5);
            w0 w0VarD4 = h0.o.d(b2.b.E, false);
            int iHashCode4 = Long.hashCode(((g0) jVar3).T);
            m1 m1VarM4 = jVar3.m();
            b2.r rVarC12 = b2.a.c(rVarC11, jVar3);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar3.g0();
            if (((g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            q.I(w0VarD4, jVar3, b3.h.f);
            q.I(m1VarM4, jVar3, b3.h.e);
            q.I(Integer.valueOf(iHashCode4), jVar3, b3.h.g);
            q.E(jVar3, b3.h.h);
            q.I(rVarC12, jVar3, b3.h.d);
            int i18 = i12 >> 12;
            jVar2 = jVar3;
            b(i, ((Number) p2VarB4.getValue()).floatValue(), f12, j3, z9, jVar2, (i12 & 14) | (i18 & 896) | (i18 & 7168), 0);
            b(2131231378, ((Number) bVar.d()).floatValue(), f12, j3, false, jVar2, i18 & 8064, 16);
            jVar3.r(true);
            rVar3 = rVar2;
            f4 = f12;
            j2 = j3;
            f5 = f6;
        } else {
            jVar3.V();
            jVar2 = jVar3;
            rVar3 = rVar2;
            f5 = f3;
            j2 = j;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.a(i, z, contentDescription, onClick, rVar3, f5, f4, j2, (l1.j) obj, q.K(i2 | 1), i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final int i, final float f, final float f2, final long j, boolean z, l1.j jVar, final int i2, final int i3) {
        int i4;
        boolean z2;
        boolean z3;
        final boolean z4;
        r1 r1VarT;
        final boolean z5;
        boolean z6;
        boolean z7;
        Object objN;
        g0 g0Var = (g0) jVar;
        g0Var.e0(932671911);
        if ((i2 & 6) == 0) {
            i4 = (g0Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g0Var.d(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g0Var.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g0Var.f(j) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                i4 |= g0Var.h(z2) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i4 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                m2.b bVarR = y3.R(i, g0Var, i4 & 14);
                b2.r rVarM = z1.m(o.A, f2);
                if ((i4 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((57344 & i4) == 16384);
                objN = g0Var.N();
                if (z7 || objN == l1.i.a) {
                    objN = new u00.k() {
                        @Override
                        public final Object invoke(Object obj) {
                            c0 graphicsLayer = (c0) obj;
                            kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.v(f);
                            graphicsLayer.I0(z5 ? -1.0f : 1.0f);
                            graphicsLayer.S0(m.a);
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(objN);
                }
                o3.a(bVarR, (String) null, b0.p(rVarM, (u00.k) objN), j, g0Var, 56 | (i4 & 7168), 0);
                z4 = z5;
            } else {
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m.b(i, f, f2, j, z4, (l1.j) obj, q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i4 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            m2.b bVarR2 = y3.R(i, g0Var, i4 & 14);
            b2.r rVarM2 = z1.m(o.A, f2);
            if ((i4 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | ((57344 & i4) == 16384);
            objN = g0Var.N();
            if (z7) {
                objN = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        c0 graphicsLayer = (c0) obj;
                        kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.v(f);
                        graphicsLayer.I0(z5 ? -1.0f : 1.0f);
                        graphicsLayer.S0(m.a);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            } else {
                objN = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        c0 graphicsLayer = (c0) obj;
                        kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.v(f);
                        graphicsLayer.I0(z5 ? -1.0f : 1.0f);
                        graphicsLayer.S0(m.a);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            }
            o3.a(bVarR2, (String) null, b0.p(rVarM2, (u00.k) objN), j, g0Var, 56 | (i4 & 7168), 0);
            z4 = z5;
        } else {
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.b(i, f, f2, j, z4, (l1.j) obj, q.K(i2 | 1), i3);
                    return g00.b0.a;
                }
            };
        }
    }
}
