package jl;

import b1.l;
import b2.o;
import c3.o1;
import c4.c0;
import c4.n;
import g1.x5;
import gv.r;
import i2.b0;
import i2.w0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.p2;
import l1.w;
import l1.z0;
import p0.e;
import u00.k;
import x.k0;
import x.k1;
import x.m1;
import x.n1;
import x.q1;
import x.r1;
import x.v;
import x.x;
import z.u;
import z1.f;
import z1.q;

public abstract class c {
    public static final float a = 8;
    public static final float b = 48;

    public static final void a(k0 k0Var, z0 transformOriginState, long j, e eVar, v1.c cVar, j jVar, int i) {
        Object objJ0;
        q1 q1VarW;
        boolean z;
        Object objJ1;
        m.e(transformOriginState, "transformOriginState");
        g0 g0Var = (g0) jVar;
        g0Var.e0(433178997);
        int i2 = i | (g0Var.g(k0Var) ? 4 : 2) | (g0Var.f(j) ? 256 : 128) | (g0Var.g(eVar) ? 2048 : 1024);
        o oVar = o.A;
        int i3 = i2 | (g0Var.g(oVar) ? 16384 : 8192) | (g0Var.i(cVar) ? 131072 : 65536);
        boolean z2 = false;
        if (g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            n1 n1VarT = x.c.t(k0Var, "DropDownMenu", g0Var, 48 | (i3 & 14), 0);
            r1 r1Var = x.c.k;
            boolean zG = n1VarT.g();
            f5.c cVar2 = n1VarT.a;
            l1.c cVar3 = i.a;
            if (zG) {
                g0Var.c0(1666827533);
                g0Var.r(false);
                objJ0 = cVar2.J0();
            } else {
                g0Var.c0(1666573488);
                boolean zG2 = g0Var.g(n1VarT);
                objJ0 = g0Var.N();
                if (zG2 || objJ0 == cVar3) {
                    f fVarF = q.f();
                    k kVarE = fVarF != null ? fVarF.e() : null;
                    f fVarK = q.k(fVarF);
                    try {
                        Object objJ2 = cVar2.J0();
                        q.n(fVarF, fVarK, kVarE);
                        g0Var.n0(objJ2);
                        objJ0 = objJ2;
                        z2 = false;
                    } catch (Throwable th) {
                        q.n(fVarF, fVarK, kVarE);
                        throw th;
                    }
                }
                g0Var.r(z2);
            }
            boolean zBooleanValue = ((Boolean) objJ0).booleanValue();
            g0Var.c0(-1828932903);
            float f = zBooleanValue ? 1.0f : 0.8f;
            g0Var.r(false);
            Float fValueOf = Float.valueOf(f);
            boolean zG3 = g0Var.g(n1VarT);
            Object objN = g0Var.N();
            Object obj = objN;
            if (zG3 || objN == cVar3) {
                w wVarR = l1.q.r(new al.f(n1VarT, 4));
                g0Var.n0(wVarR);
                obj = wVarR;
            }
            boolean zBooleanValue2 = ((Boolean) ((p2) obj).getValue()).booleanValue();
            g0Var.c0(-1828932903);
            float f2 = zBooleanValue2 ? 1.0f : 0.8f;
            g0Var.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG4 = g0Var.g(n1VarT);
            Object objN2 = g0Var.N();
            Object obj2 = objN2;
            if (zG4 || objN2 == cVar3) {
                w wVarR2 = l1.q.r(new al.f(n1VarT, 5));
                g0Var.n0(wVarR2);
                obj2 = wVarR2;
            }
            k1 animateFloat = (k1) ((p2) obj2).getValue();
            m.e(animateFloat, "$this$animateFloat");
            g0Var.c0(1314947870);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (animateFloat.b(bool, bool2)) {
                q1VarW = x.c.w(120, 0, x.b, 2);
                z = false;
            } else {
                q1VarW = x.c.w(1, 74, (v) null, 4);
                z = false;
            }
            g0Var.r(z);
            boolean z3 = z;
            m1 m1VarO = x.c.o(n1VarT, fValueOf, fValueOf2, q1VarW, r1Var, g0Var, 196608);
            if (n1VarT.g()) {
                g0Var.c0(1666827533);
                g0Var.r(z3);
                objJ1 = cVar2.J0();
            } else {
                g0Var.c0(1666573488);
                boolean zG5 = g0Var.g(n1VarT);
                objJ1 = g0Var.N();
                if (zG5 || objJ1 == cVar3) {
                    f fVarF2 = q.f();
                    k kVarE2 = fVarF2 != null ? fVarF2.e() : null;
                    f fVarK2 = q.k(fVarF2);
                    try {
                        Object objJ3 = cVar2.J0();
                        q.n(fVarF2, fVarK2, kVarE2);
                        g0Var.n0(objJ3);
                        objJ1 = objJ3;
                    } catch (Throwable th2) {
                        q.n(fVarF2, fVarK2, kVarE2);
                        throw th2;
                    }
                }
                g0Var.r(z3);
            }
            boolean zBooleanValue3 = ((Boolean) objJ1).booleanValue();
            g0Var.c0(1505520709);
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            g0Var.r(z3);
            Float fValueOf3 = Float.valueOf(f3);
            boolean zG6 = g0Var.g(n1VarT);
            Object objN3 = g0Var.N();
            Object obj3 = objN3;
            if (zG6 || objN3 == cVar3) {
                w wVarR3 = l1.q.r(new al.f(n1VarT, 6));
                g0Var.n0(wVarR3);
                obj3 = wVarR3;
            }
            boolean zBooleanValue4 = ((Boolean) ((p2) obj3).getValue()).booleanValue();
            g0Var.c0(1505520709);
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            g0Var.r(z3);
            Float fValueOf4 = Float.valueOf(f4);
            boolean zG7 = g0Var.g(n1VarT);
            Object objN4 = g0Var.N();
            Object obj4 = objN4;
            if (zG7 || objN4 == cVar3) {
                w wVarR4 = l1.q.r(new al.f(n1VarT, 7));
                g0Var.n0(wVarR4);
                obj4 = wVarR4;
            }
            k1 animateFloat2 = (k1) ((p2) obj4).getValue();
            m.e(animateFloat2, "$this$animateFloat");
            g0Var.c0(354434186);
            q1 q1VarW2 = animateFloat2.b(bool, bool2) ? x.c.w(30, z3 ? 1 : 0, (v) null, 6) : x.c.w(75, z3 ? 1 : 0, (v) null, 6);
            g0Var.r(z3);
            m1 m1VarO2 = x.c.o(n1VarT, fValueOf3, fValueOf4, q1VarW2, r1Var, g0Var, 196608);
            boolean zG8 = g0Var.g(m1VarO) | g0Var.g(m1VarO2);
            Object objN5 = g0Var.N();
            Object obj5 = objN5;
            if (zG8 || objN5 == cVar3) {
                l lVar = new l(transformOriginState, m1VarO, m1VarO2, 18);
                g0Var.n0(lVar);
                obj5 = lVar;
            }
            int i4 = i3 >> 6;
            x5.b(b0.p(oVar, (k) obj5), eVar, x5.i(j, dl.a.k, g0Var, (i4 & 14) | 48, 12), x5.j(62), (u) null, v1.d.d(-850904089, new r(cVar), g0Var), g0Var, (i4 & 112) | 196608, 16);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a(k0Var, transformOriginState, j, eVar, cVar, i);
        }
    }

    public static final void b(final boolean z, final u00.a onDismissRequest, final long j, final e eVar, b2.r rVar, long j2, boolean z2, c0 c0Var, final v1.c cVar, j jVar, final int i, final int i2) {
        int i3;
        e eVar2;
        long j3;
        boolean z3;
        int i4;
        boolean z4;
        final b2.r rVar2;
        final long j4;
        final boolean z5;
        final c0 c0Var2;
        l1.r1 r1VarT;
        long jFloatToRawIntBits;
        boolean z6;
        c0 c0Var3;
        Object objN;
        l1.c cVar2;
        k0 k0Var;
        Object objN2;
        z0 z0Var;
        Object objN3;
        int i5;
        m.e(onDismissRequest, "onDismissRequest");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-906462335);
        if ((i & 6) == 0) {
            i3 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onDismissRequest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            eVar2 = eVar;
            i3 |= g0Var.g(eVar2) ? 2048 : 1024;
        } else {
            eVar2 = eVar;
        }
        int i6 = i3 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i6 = 221184 | i3;
            j3 = j2;
        } else {
            j3 = j2;
            if ((196608 & i) == 0) {
                i6 |= g0Var.f(j3) ? 131072 : 65536;
            }
        }
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                z3 = z2;
                i6 |= g0Var.h(z3) ? 1048576 : 524288;
            }
            i4 = i6 | 12582912;
            if ((100663296 & i) != 0) {
                if (g0Var.i(cVar)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i4 |= i5;
            }
            if ((38347923 & i4) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i4 & 1, z4)) {
                if (i7 != 0) {
                    float f = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
                } else {
                    jFloatToRawIntBits = j3;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                c0Var3 = new c0(30, true);
                objN = g0Var.N();
                cVar2 = i.a;
                if (objN == cVar2) {
                    objN = new k0(Boolean.FALSE);
                    g0Var.n0(objN);
                }
                k0Var = (k0) objN;
                k0Var.W0(Boolean.valueOf(z));
                if (!((Boolean) k0Var.C.getValue()).booleanValue() || ((Boolean) k0Var.D.getValue()).booleanValue()) {
                    g0Var.c0(-1959454067);
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.z(new w0(w0.b));
                        g0Var.n0(objN2);
                    }
                    z0Var = (z0) objN2;
                    y3.c cVar3 = (y3.c) g0Var.k(o1.h);
                    objN3 = g0Var.N();
                    if (objN3 == cVar2) {
                        objN3 = new g1.i(z0Var, 1);
                        g0Var.n0(objN3);
                    }
                    n.a(new d(jFloatToRawIntBits, cVar3, z6, (u00.n) objN3), onDismissRequest, c0Var3, v1.d.d(-284008536, new a(k0Var, z0Var, j, eVar2, cVar), g0Var), g0Var, (i4 & 112) | 3072 | ((i4 >> 15) & 896), 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1958543039);
                    g0Var.r(false);
                }
                rVar2 = o.A;
                j4 = jFloatToRawIntBits;
                z5 = z6;
                c0Var2 = c0Var3;
            } else {
                g0Var.V();
                rVar2 = rVar;
                j4 = j3;
                z5 = z3;
                c0Var2 = c0Var;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        c.b(z, onDismissRequest, j, eVar, rVar2, j4, z5, c0Var2, cVar, (j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i6 |= 1572864;
        z3 = z2;
        i4 = i6 | 12582912;
        if ((100663296 & i) != 0) {
            if (g0Var.i(cVar)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i4 |= i5;
        }
        if ((38347923 & i4) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g0Var.S(i4 & 1, z4)) {
            if (i7 != 0) {
                float f2 = 0;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
            } else {
                jFloatToRawIntBits = j3;
            }
            if (i8 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            c0Var3 = new c0(30, true);
            objN = g0Var.N();
            cVar2 = i.a;
            if (objN == cVar2) {
                objN = new k0(Boolean.FALSE);
                g0Var.n0(objN);
            }
            k0Var = (k0) objN;
            k0Var.W0(Boolean.valueOf(z));
            if (((Boolean) k0Var.C.getValue()).booleanValue()) {
                g0Var.c0(-1959454067);
                objN2 = g0Var.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.z(new w0(w0.b));
                    g0Var.n0(objN2);
                }
                z0Var = (z0) objN2;
                y3.c cVar4 = (y3.c) g0Var.k(o1.h);
                objN3 = g0Var.N();
                if (objN3 == cVar2) {
                    objN3 = new g1.i(z0Var, 1);
                    g0Var.n0(objN3);
                }
                n.a(new d(jFloatToRawIntBits, cVar4, z6, (u00.n) objN3), onDismissRequest, c0Var3, v1.d.d(-284008536, new a(k0Var, z0Var, j, eVar2, cVar), g0Var), g0Var, (i4 & 112) | 3072 | ((i4 >> 15) & 896), 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1959454067);
                objN2 = g0Var.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.z(new w0(w0.b));
                    g0Var.n0(objN2);
                }
                z0Var = (z0) objN2;
                y3.c cVar5 = (y3.c) g0Var.k(o1.h);
                objN3 = g0Var.N();
                if (objN3 == cVar2) {
                    objN3 = new g1.i(z0Var, 1);
                    g0Var.n0(objN3);
                }
                n.a(new d(jFloatToRawIntBits, cVar5, z6, (u00.n) objN3), onDismissRequest, c0Var3, v1.d.d(-284008536, new a(k0Var, z0Var, j, eVar2, cVar), g0Var), g0Var, (i4 & 112) | 3072 | ((i4 >> 15) & 896), 0);
                g0Var.r(false);
            }
            rVar2 = o.A;
            j4 = jFloatToRawIntBits;
            z5 = z6;
            c0Var2 = c0Var3;
        } else {
            g0Var.V();
            rVar2 = rVar;
            j4 = j3;
            z5 = z3;
            c0Var2 = c0Var;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i | 1);
                    c.b(z, onDismissRequest, j, eVar, rVar2, j4, z5, c0Var2, cVar, (j) obj, iK, i2);
                    return g00.b0.a;
                }
            };
        }
    }
}
