package x;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import g1.t3;
import java.util.concurrent.CancellationException;

public abstract class c {

    public static final k f16248a = new k(Float.POSITIVE_INFINITY);

    public static final l f16249b = new l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final m f16250c = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final n f16251d = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final k f16252e = new k(Float.NEGATIVE_INFINITY);

    public static final l f16253f = new l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final m f16254g = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final n f16255h = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final float[] f16256i = new float[91];

    public static final wp.a f16257j = new wp.a(10);

    public static final r1 f16258k = new r1(new wp.a(11), new wp.a(28));
    public static final r1 l = new r1(new wp.a(12), new wp.a(13));
    public static final r1 m = new r1(new wp.a(14), new wp.a(15));

    public static final r1 f16259n = new r1(new wp.a(16), new wp.a(17));

    public static final r1 f16260o = new r1(new wp.a(18), new wp.a(19));

    public static final r1 f16261p = new r1(new wp.a(20), new wp.a(21));

    public static final r1 f16262q = new r1(new wp.a(22), new wp.a(23));

    public static final r1 f16263r = new r1(new wp.a(24), new wp.a(25));

    public static final r1 f16264s = new r1(new wp.a(26), new wp.a(27));

    public static final b a(float f3, float f10) {
        return new b(Float.valueOf(f3), f16258k, Float.valueOf(f10), 8);
    }

    public static j b(float f3, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return new j(f16258k, Float.valueOf(f3), new k(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void c(n1 n1Var, m1 m1Var, Object obj, Object obj2, y yVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(867041821);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(n1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(m1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? g0Var.g(obj) : g0Var.i(obj) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? g0Var.g(obj2) : g0Var.i(obj2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? g0Var.g(yVar) : g0Var.i(yVar) ? 16384 : 8192;
        }
        if (!g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            g0Var.V();
        } else if (n1Var.g()) {
            m1Var.g(obj, obj2, yVar);
        } else {
            m1Var.h(obj2, yVar);
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new t3(n1Var, m1Var, obj, obj2, yVar, i10, 5);
        }
    }

    public static final Object d(float f3, float f10, float f11, i iVar, u00.n nVar, m00.i iVar2) {
        Float f12 = new Float(f3);
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        r1 r1Var = f16258k;
        u00.k kVar = r1Var.f16363a;
        o oVarC = (o) kVar.invoke(f14);
        if (oVarC == null) {
            oVarC = ((o) kVar.invoke(f12)).c();
        }
        o oVar = oVarC;
        Object objE = e(new j(r1Var, f12, oVar, 56), new h1(iVar, r1Var, f12, f13, oVar), Long.MIN_VALUE, new q0.a(nVar, 21), iVar2);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objE != aVar) {
            objE = b0Var;
        }
        return objE == aVar ? objE : b0Var;
    }

    public static final Object e(j jVar, e eVar, long j9, final u00.k kVar, m00.c cVar) {
        g1 g1Var;
        final kotlin.jvm.internal.z zVar;
        final j jVar2;
        j jVar3;
        kotlin.jvm.internal.z zVar2;
        Object objB0;
        u00.k kVar2;
        h hVar;
        h hVar2;
        Object objB1;
        final e eVar2 = eVar;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i10 = g1Var.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g1Var.F = i10 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(cVar);
            }
        } else {
            g1Var = new g1(cVar);
        }
        g1 g1Var2 = g1Var;
        Object obj = g1Var2.E;
        l00.a aVar = l00.a.A;
        int i11 = g1Var2.F;
        if (i11 == 0) {
            ri.t1.O(obj);
            final Object objF = eVar2.f(0L);
            final o oVarD = eVar2.d(0L);
            zVar = new kotlin.jvm.internal.z();
            if (j9 == Long.MIN_VALUE) {
                try {
                    final float fQ = q(g1Var2.getContext());
                    jVar2 = jVar;
                    try {
                        u00.k kVar3 = new u00.k() {
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                e eVar3 = eVar2;
                                r1 r1VarC = eVar3.c();
                                Object objG = eVar3.g();
                                j jVar4 = jVar2;
                                h hVar3 = new h(objF, r1VarC, oVarD, jLongValue, objG, jLongValue, new f1(1, jVar4));
                                c.p(hVar3, jLongValue, fQ, eVar3, jVar4, kVar);
                                zVar.A = hVar3;
                                return g00.b0.a;
                            }
                        };
                        zVar2 = zVar;
                        try {
                            g1Var2.A = jVar2;
                            g1Var2.B = eVar2;
                            g1Var2.C = kVar;
                            g1Var2.D = zVar2;
                            g1Var2.F = 1;
                            if (eVar2.a()) {
                                objB0 = z(kVar3, g1Var2);
                            } else {
                                objB0 = l1.q.u(g1Var2.getContext()).b0(new rx.c(21, kVar3), g1Var2);
                            }
                            if (objB0 != aVar) {
                                jVar3 = jVar2;
                                kVar2 = kVar;
                                zVar = zVar2;
                            }
                            return aVar;
                        } catch (CancellationException e3) {
                            e = e3;
                            jVar3 = jVar2;
                            zVar = zVar2;
                            hVar = (h) zVar.A;
                            if (hVar != null) {
                                hVar.f16290i.setValue(Boolean.FALSE);
                            }
                            hVar2 = (h) zVar.A;
                            if (hVar2 != null) {
                                jVar3.F = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        jVar3 = jVar2;
                        hVar = (h) zVar.A;
                        if (hVar != null) {
                            hVar.f16290i.setValue(Boolean.FALSE);
                        }
                        hVar2 = (h) zVar.A;
                        if (hVar2 != null) {
                            jVar3.F = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e11) {
                    e = e11;
                    jVar2 = jVar;
                }
            } else {
                zVar2 = zVar;
                try {
                    h hVar3 = new h(objF, eVar2.c(), oVarD, j9, eVar2.g(), j9, new f1(0, jVar));
                    p(hVar3, j9, q(g1Var2.getContext()), eVar2, jVar, kVar);
                    zVar2.A = hVar3;
                    jVar3 = jVar;
                    eVar2 = eVar;
                    kVar2 = kVar;
                    zVar = zVar2;
                } catch (CancellationException e12) {
                    e = e12;
                    jVar3 = jVar;
                    zVar = zVar2;
                    hVar = (h) zVar.A;
                    if (hVar != null) {
                        hVar.f16290i.setValue(Boolean.FALSE);
                    }
                    hVar2 = (h) zVar.A;
                    if (hVar2 != null) {
                        jVar3.F = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = g1Var2.D;
            kVar2 = g1Var2.C;
            eVar2 = g1Var2.B;
            jVar3 = g1Var2.A;
            try {
                ri.t1.O(obj);
            } catch (CancellationException e13) {
                e = e13;
                hVar = (h) zVar.A;
                if (hVar != null) {
                    hVar.f16290i.setValue(Boolean.FALSE);
                }
                hVar2 = (h) zVar.A;
                if (hVar2 != null) {
                    jVar3.F = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = zVar.A;
            kotlin.jvm.internal.m.b(obj2);
            if (!((Boolean) ((h) obj2).f16290i.getValue()).booleanValue()) {
                return g00.b0.a;
            }
            kotlin.jvm.internal.z zVar3 = zVar;
            u00.k kVar4 = kVar2;
            e eVar3 = eVar2;
            j jVar4 = jVar3;
            try {
                pl.a aVar2 = new pl.a(zVar3, q(g1Var2.getContext()), eVar3, jVar4, kVar4);
                zVar = zVar3;
                eVar2 = eVar3;
                jVar3 = jVar4;
                kVar2 = kVar4;
                g1Var2.A = jVar3;
                g1Var2.B = eVar2;
                g1Var2.C = kVar2;
                g1Var2.D = zVar;
                g1Var2.F = 2;
                if (eVar2.a()) {
                    objB1 = z(aVar2, g1Var2);
                } else {
                    objB1 = l1.q.u(g1Var2.getContext()).b0(new rx.c(21, aVar2), g1Var2);
                }
            } catch (CancellationException e14) {
                e = e14;
                zVar = zVar3;
                jVar3 = jVar4;
                hVar = (h) zVar.A;
                if (hVar != null) {
                    hVar.f16290i.setValue(Boolean.FALSE);
                }
                hVar2 = (h) zVar.A;
                if (hVar2 != null && hVar2.f16288g == jVar3.D) {
                    jVar3.F = false;
                }
                throw e;
            }
        } while (objB1 != aVar);
        return aVar;
    }

    public static Object f(float f3, float f10, i iVar, u00.n nVar, m00.i iVar2, int i10) {
        if ((i10 & 8) != 0) {
            iVar = v(0.0f, 0.0f, null, 7);
        }
        return d(f3, f10, 0.0f, iVar, nVar, iVar2);
    }

    public static final Object g(j jVar, t tVar, boolean z10, u00.k kVar, m00.c cVar) {
        Object objE = e(jVar, new s(tVar, jVar.A, jVar.B.getValue(), jVar.C), z10 ? jVar.D : Long.MIN_VALUE, kVar, cVar);
        return objE == l00.a.A ? objE : g00.b0.a;
    }

    public static final e0 h(g0 g0Var, float f3, float f10, d0 d0Var, String str, l1.j jVar, int i10, int i11) {
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f10);
        l1.g0 g0Var2 = (l1.g0) jVar;
        Object objN = g0Var2.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = new e0(g0Var, fValueOf, fValueOf2, d0Var);
            g0Var2.n0(objN);
        }
        e0 e0Var = (e0) objN;
        boolean zI = g0Var2.i(d0Var);
        Object objN2 = g0Var2.N();
        if (zI || objN2 == cVar) {
            ct.m mVar = new ct.m(fValueOf, e0Var, fValueOf2, d0Var, 9);
            g0Var2.n0(mVar);
            objN2 = mVar;
        }
        l1.q.k((u00.a) objN2, jVar);
        boolean zI2 = g0Var2.i(g0Var);
        Object objN3 = g0Var2.N();
        if (zI2 || objN3 == cVar) {
            objN3 = new mu.q(g0Var, e0Var, 18);
            g0Var2.n0(objN3);
        }
        l1.q.e(e0Var, (u00.k) objN3, jVar);
        return e0Var;
    }

    public static final Object i(j jVar, Float f3, i iVar, boolean z10, u00.k kVar, m00.c cVar) {
        Object objE = e(jVar, new h1(iVar, jVar.A, jVar.B.getValue(), f3, jVar.C), z10 ? jVar.D : Long.MIN_VALUE, kVar, cVar);
        return objE == l00.a.A ? objE : g00.b0.a;
    }

    public static Object j(j jVar, Float f3, b1 b1Var, boolean z10, u00.k kVar, m00.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            b1Var = v(0.0f, 0.0f, null, 7);
        }
        b1 b1Var2 = b1Var;
        if ((i10 & 8) != 0) {
            kVar = new wp.a(9);
        }
        return i(jVar, f3, b1Var2, z10, kVar, cVar);
    }

    public static final o k(o oVar) {
        o oVarC = oVar.c();
        int iB = oVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            oVarC.e(oVar.a(i10), i10);
        }
        return oVarC;
    }

    public static j l(j jVar, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = ((Number) jVar.B.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f10 = ((k) jVar.C).f16308a;
        }
        return new j(jVar.A, Float.valueOf(f3), new k(f10), jVar.D, jVar.E, jVar.F);
    }

    public static final n1 m(n1 n1Var, Object obj, Object obj2, String str, l1.j jVar, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && ((l1.g0) jVar).g(n1Var)) || (i10 & 6) == 4;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (z11 || objN == cVar) {
            objN = new n1(new k0(obj), n1Var, w.c.l(new StringBuilder(), n1Var.f16325c, " > ", str));
            g0Var.n0(objN);
        }
        n1 n1Var2 = (n1) objN;
        if ((i11 <= 4 || !g0Var.g(n1Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zG = g0Var.g(n1Var2) | z10;
        Object objN2 = g0Var.N();
        if (zG || objN2 == cVar) {
            objN2 = new mu.q(n1Var, n1Var2, 20);
            g0Var.n0(objN2);
        }
        l1.q.e(n1Var2, (u00.k) objN2, jVar);
        if (n1Var.g()) {
            n1Var2.k(obj, obj2);
            return n1Var2;
        }
        n1Var2.p(obj2);
        n1Var2.f16333k.setValue(Boolean.FALSE);
        return n1Var2;
    }

    public static final j1 n(n1 n1Var, r1 r1Var, String str, l1.j jVar, int i10, int i11) {
        i1 i1Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zG = ((l1.g0) jVar).g(n1Var);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new j1(n1Var, r1Var, str);
            g0Var.n0(objN);
        }
        j1 j1Var = (j1) objN;
        boolean zG2 = g0Var.g(n1Var) | g0Var.i(j1Var);
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            objN2 = new mu.q(n1Var, j1Var, 21);
            g0Var.n0(objN2);
        }
        l1.q.e(j1Var, (u00.k) objN2, jVar);
        if (n1Var.g() && (i1Var = (i1) j1Var.f16306b.getValue()) != null) {
            n1 n1Var2 = j1Var.f16307c;
            i1Var.A.g(i1Var.C.invoke(n1Var2.f().a()), i1Var.C.invoke(n1Var2.f().c()), (y) i1Var.B.invoke(n1Var2.f()));
        }
        return j1Var;
    }

    public static final m1 o(n1 n1Var, Object obj, Object obj2, y yVar, r1 r1Var, l1.j jVar, int i10) {
        boolean zG = ((l1.g0) jVar).g(n1Var);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                o oVar = (o) r1Var.f16363a.invoke(obj2);
                oVar.d();
                m1 m1Var = new m1(n1Var, obj, oVar, r1Var);
                z1.q.n(fVarF, fVarK, kVarE);
                g0Var.n0(m1Var);
                objN = m1Var;
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        }
        m1 m1Var2 = (m1) objN;
        c(n1Var, m1Var2, obj, obj2, yVar, jVar, 0);
        boolean zG2 = g0Var.g(n1Var) | g0Var.g(m1Var2);
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            objN2 = new mu.q(n1Var, m1Var2, 22);
            g0Var.n0(objN2);
        }
        l1.q.e(m1Var2, (u00.k) objN2, jVar);
        return m1Var2;
    }

    public static final void p(h hVar, long j9, float f3, e eVar, j jVar, u00.k kVar) {
        long jB = f3 == 0.0f ? eVar.b() : (long) ((j9 - hVar.f16284c) / f3);
        hVar.f16288g = j9;
        hVar.f16286e.setValue(eVar.f(jB));
        hVar.f16287f = eVar.d(jB);
        if (eVar.e(jB)) {
            hVar.f16289h = hVar.f16288g;
            hVar.f16290i.setValue(Boolean.FALSE);
        }
        x(hVar, jVar);
        kVar.invoke(hVar);
    }

    public static final float q(k00.i iVar) {
        b2.s sVar = (b2.s) iVar.get(b2.b.P);
        float fI = sVar != null ? sVar.I() : 1.0f;
        if (fI >= 0.0f) {
            return fI;
        }
        o0.b("negative scale factor");
        return fI;
    }

    public static d0 r(u uVar, p0 p0Var, int i10) {
        if ((i10 & 2) != 0) {
            p0Var = p0.A;
        }
        return new d0(uVar, p0Var, 0);
    }

    public static final g0 s(String str, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = new g0();
            g0Var.n0(objN);
        }
        g0 g0Var2 = (g0) objN;
        g0Var2.a(jVar, 0);
        return g0Var2;
    }

    public static final n1 t(f5.c cVar, String str, l1.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && ((l1.g0) jVar).g(cVar)) || (i10 & 6) == 4;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar2 = l1.i.f9868a;
        if (z11 || objN == cVar2) {
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                n1 n1Var = new n1(cVar, null, str);
                z1.q.n(fVarF, fVarK, kVarE);
                g0Var.n0(n1Var);
                objN = n1Var;
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        }
        n1 n1Var2 = (n1) objN;
        if (cVar instanceof y0) {
            g0Var.c0(-1357590553);
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.o(jVar);
                g0Var.n0(objN2);
            }
            a40.z zVar = (a40.z) objN2;
            boolean zI = g0Var.i(zVar) | ((i12 > 4 && g0Var.g(cVar)) || (i10 & 6) == 4);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar2) {
                objN3 = new mu.q(cVar, zVar, 23);
                g0Var.n0(objN3);
            }
            l1.q.e(zVar, (u00.k) objN3, jVar);
            y0 y0Var = (y0) cVar;
            Object value = y0Var.D.getValue();
            Object value2 = y0Var.C.getValue();
            if ((i12 <= 4 || !g0Var.g(cVar)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objN4 = g0Var.N();
            if (z10 || objN4 == cVar2) {
                objN4 = new pz.k(cVar, (k00.c) null, 21);
                g0Var.n0(objN4);
            }
            l1.q.h(value, value2, (u00.n) objN4, jVar);
            g0Var.r(false);
        } else {
            g0Var.c0(-1356604288);
            n1Var2.a(cVar.L0(), jVar, 0);
            g0Var.r(false);
        }
        boolean zG = g0Var.g(n1Var2);
        Object objN5 = g0Var.N();
        if (zG || objN5 == cVar2) {
            objN5 = new o1(n1Var2, 1);
            g0Var.n0(objN5);
        }
        l1.q.e(n1Var2, (u00.k) objN5, jVar);
        return n1Var2;
    }

    public static z0 u() {
        return new z0(0);
    }

    public static b1 v(float f3, float f10, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new b1(f3, f10, obj);
    }

    public static q1 w(int i10, int i11, v vVar, int i12) {
        if ((i12 & 1) != 0) {
            i10 = MediaError.DetailedErrorCode.NETWORK_UNKNOWN;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            vVar = x.f16384a;
        }
        return new q1(i10, i11, vVar);
    }

    public static final void x(h hVar, j jVar) {
        jVar.B.setValue(hVar.f16286e.getValue());
        o oVar = jVar.C;
        o oVar2 = hVar.f16287f;
        int iB = oVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            oVar.e(oVar2.a(i10), i10);
        }
        jVar.E = hVar.f16289h;
        jVar.D = hVar.f16288g;
        jVar.F = ((Boolean) hVar.f16290i.getValue()).booleanValue();
    }

    public static final n1 y(Object obj, String str, l1.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = new n1(new k0(obj), null, str);
            g0Var.n0(objN);
        }
        n1 n1Var = (n1) objN;
        n1Var.a(obj, jVar, (i10 & 8) | 48 | (i10 & 14));
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = new o1(n1Var, 0);
            g0Var.n0(objN2);
        }
        l1.q.e(n1Var, (u00.k) objN2, jVar);
        return n1Var;
    }

    public static final Object z(u00.k kVar, m00.c cVar) {
        if (cVar.getContext().get(c3.y1.A) == null) {
            return l1.q.u(cVar.getContext()).b0(kVar, cVar);
        }
        throw new ClassCastException();
    }
}
