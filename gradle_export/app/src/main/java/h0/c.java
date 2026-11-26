package h0;

import c3.y2;
import com.google.android.gms.cast.Cast;
import g1.j7;
import g1.t3;
import java.util.ArrayList;
import java.util.List;

public abstract class c {

    public static final b f6382a = new b(0);

    public static final b f6383b = new b(1);

    public static final c0 f6384c = new c0(0, 0);

    public static final j7 f6385d = new j7(9);

    public static final j7 f6386e = new j7(10);

    public static final j7 f6387f = new j7(11);

    public static final j7 f6388g = new j7(12);

    public static final int f6389h = 9;

    public static final int f6390i = 6;

    public static final int f6391j = 10;

    public static final int f6392k = 5;
    public static final int l = 15;

    public static b2.r A(b2.r rVar, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        return z(rVar, f3, f10);
    }

    public static final b2.r B(b2.r rVar, n1 n1Var) {
        return rVar.V(new o1(n1Var, new a1.e1(n1Var, 29)));
    }

    public static final b2.r C(b2.r rVar, float f3) {
        return rVar.V(new k1(f3, f3, f3, f3, new cs.i(f3, 2)));
    }

    public static final b2.r D(b2.r rVar, float f3, float f10) {
        return rVar.V(new k1(f3, f10, f3, f10, new g1(f3, f10, 2)));
    }

    public static b2.r E(b2.r rVar, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        return D(rVar, f3, f10);
    }

    public static final b2.r F(b2.r rVar, final float f3, final float f10, final float f11, final float f12) {
        return rVar.V(new k1(f3, f10, f11, f12, new u00.k() {
            public final Object invoke(Object obj) {
                c3.d2 d2Var = (c3.d2) obj;
                d2Var.f2644a = "padding";
                y2 y2Var = d2Var.f2646c;
                y2Var.c(new y3.f(f3), "start");
                y2Var.c(new y3.f(f10), "top");
                y2Var.c(new y3.f(f11), "end");
                y2Var.c(new y3.f(f12), "bottom");
                return g00.b0.a;
            }
        }));
    }

    public static b2.r G(b2.r rVar, float f3, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return F(rVar, f3, f10, f11, f12);
    }

    public static final long H(long j9) {
        b1 b1Var = b1.A;
        return y3.b.a(y3.a.j(j9), y3.a.h(j9), y3.a.i(j9), y3.a.g(j9));
    }

    public static final u0 I(q4.b bVar) {
        return new u0(bVar.f12755a, bVar.f12756b, bVar.f12757c, bVar.f12758d);
    }

    public static final void J(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public static final b2.r K(b2.r rVar) {
        x0 x0Var = x0.A;
        return rVar.V(new z0());
    }

    public static final b2.r L(b2.r rVar, l2 l2Var) {
        return rVar.V(new r0(l2Var));
    }

    public static final b2.r M(b2.r rVar, u00.k kVar) {
        return rVar.V(new b2(kVar));
    }

    public static final void a(b2.r rVar, b2.d dVar, boolean z10, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(380139498);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= g0Var.g(dVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            if (i13 != 0) {
                dVar = b2.b.A;
            }
            boolean z12 = i14 != 0 ? false : z10;
            z2.w0 w0VarD = o.d(dVar, z12);
            boolean zG = g0Var.g(w0VarD) | ((i12 & 7168) == 2048);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new al.i(w0VarD, cVar, 22);
                g0Var.n0(objN);
            }
            z2.d0.b(rVar, (u00.n) objN, g0Var, i12 & 14);
            z11 = z12;
        } else {
            g0Var.V();
            z11 = z10;
        }
        b2.d dVar2 = dVar;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new gv.y(rVar, dVar2, z11, cVar, i10, i11);
        }
    }

    public static final void b(b2.r rVar, e eVar, h hVar, b2.h hVar2, int i10, int i11, v1.c cVar, l1.j jVar, int i12) {
        b2.h hVar3;
        int i13;
        int i14;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1303174015);
        int i15 = i12 | 224256;
        if (g0Var.S(i15 & 1, (599187 & i15) != 599186)) {
            b2.h hVar4 = b2.b.J;
            c(rVar, eVar, hVar, k0.m, cVar, g0Var, 14380470);
            i13 = Integer.MAX_VALUE;
            i14 = Integer.MAX_VALUE;
            hVar3 = hVar4;
        } else {
            g0Var.V();
            hVar3 = hVar2;
            i13 = i10;
            i14 = i11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new e0(rVar, eVar, hVar, hVar3, i13, i14, cVar, i12);
        }
    }

    public static final void c(b2.r rVar, e eVar, h hVar, k0 k0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.c cVar2;
        b2.h hVar2 = b2.b.J;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1956591841);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(hVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(hVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.e(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.e(Integer.MAX_VALUE) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.i(cVar) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if (g0Var.S(i12 & 1, (i12 & 4793491) != 4793490)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                k0Var.getClass();
                f0 f0Var = f0.A;
                objN = new h0();
                g0Var.n0(objN);
            }
            h0 h0Var = (h0) objN;
            int i13 = i12 >> 3;
            boolean zG = ((((i13 & 14) ^ 6) > 4 && g0Var.g(eVar)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && g0Var.g(hVar)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && g0Var.g(hVar2)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && g0Var.e(Integer.MAX_VALUE)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && g0Var.e(Integer.MAX_VALUE)) || (i13 & 24576) == 16384) | g0Var.g(h0Var);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar3) {
                cVar2 = cVar3;
                j0 j0Var = new j0(eVar, hVar, eVar.a(), new y(hVar2), hVar.a(), h0Var);
                g0Var.n0(j0Var);
                objN2 = j0Var;
            } else {
                cVar2 = cVar3;
            }
            j0 j0Var2 = (j0) objN2;
            boolean z10 = ((i12 & 29360128) == 8388608) | ((i12 & 458752) == 131072);
            Object objN3 = g0Var.N();
            Object obj = objN3;
            if (z10 || objN3 == cVar2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new v1.c(new al.j(cVar), -1192950673, true));
                k0Var.getClass();
                f0 f0Var2 = f0.A;
                g0Var.n0(arrayList);
                obj = arrayList;
            }
            v1.c cVar4 = new v1.c(new b2.n((List) obj, 7), 1271844412, true);
            boolean zG2 = g0Var.g(j0Var2);
            Object objN4 = g0Var.N();
            if (zG2 || objN4 == cVar2) {
                objN4 = new z2.c1(j0Var2);
                g0Var.n0(objN4);
            }
            z2.w0 w0Var = (z2.w0) objN4;
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar4.invoke(g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new t3(rVar, eVar, hVar, k0Var, cVar, i10, 1);
        }
    }

    public static final p1 d(float f3) {
        return new p1(f3, f3, f3, f3);
    }

    public static p1 e(float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        return new p1(f3, f10, f3, f10);
    }

    public static final p1 f(float f3, float f10, float f11, float f12) {
        return new p1(f3, f10, f11, f12);
    }

    public static p1 g(float f3, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return new p1(f3, f10, f11, f12);
    }

    public static final void h(b2.r rVar, l1.j jVar) {
        n nVar = n.f6445c;
        l1.g0 g0Var = (l1.g0) jVar;
        int iHashCode = Long.hashCode(g0Var.T);
        b2.r rVarC = b2.a.c(rVar, jVar);
        l1.m1 m1VarM = g0Var.m();
        b3.i.f2042c.getClass();
        b3.g gVar = b3.h.f2035b;
        g0Var.g0();
        if (g0Var.S) {
            g0Var.l(gVar);
        } else {
            g0Var.q0();
        }
        l1.q.I(nVar, jVar, b3.h.f2039f);
        l1.q.I(m1VarM, jVar, b3.h.f2038e);
        l1.q.E(jVar, b3.h.f2041h);
        l1.q.I(rVarC, jVar, b3.h.f2037d);
        l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
        g0Var.r(true);
    }

    public static c0 i(int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return new c0(0, i10);
    }

    public static b2.r j(float f3) {
        float f10 = 0;
        return new f1(f3, f10, false, new g1(f3, f10, 1));
    }

    public static final t0 l(l2 l2Var, l1.j jVar) {
        return new t0(l2Var, (y3.c) ((l1.g0) jVar).k(c3.o1.f2734h));
    }

    public static b2.r m(b2.r rVar, float f3) {
        return rVar.V(new j(f3));
    }

    public static final float n(n1 n1Var, y3.m mVar) {
        return mVar == y3.m.A ? n1Var.d(mVar) : n1Var.b(mVar);
    }

    public static final float o(n1 n1Var, y3.m mVar) {
        return mVar == y3.m.A ? n1Var.b(mVar) : n1Var.d(mVar);
    }

    public static long p(long j9, b1 b1Var) {
        b1 b1Var2 = b1.A;
        return y3.b.a(b1Var == b1Var2 ? y3.a.j(j9) : y3.a.i(j9), b1Var == b1Var2 ? y3.a.h(j9) : y3.a.g(j9), b1Var == b1Var2 ? y3.a.i(j9) : y3.a.j(j9), b1Var == b1Var2 ? y3.a.g(j9) : y3.a.h(j9));
    }

    public static final b2.r q(b2.r rVar, c0 c0Var) {
        return rVar.V(new e2(c0Var));
    }

    public static long r(int i10, long j9) {
        return y3.b.a(0, y3.a.h(j9), (i10 & 4) != 0 ? y3.a.i(j9) : 0, y3.a.g(j9));
    }

    public static final s1 s(z2.v0 v0Var) {
        Object objU = v0Var.U();
        if (objU instanceof s1) {
            return (s1) objU;
        }
        return null;
    }

    public static final float t(s1 s1Var) {
        if (s1Var != null) {
            return s1Var.f6457a;
        }
        return 0.0f;
    }

    public static final b2.r u(b2.r rVar) {
        x0 x0Var = x0.A;
        return rVar.V(new v0());
    }

    public static final boolean v(int i10, long j9, int i11) {
        int iJ = y3.a.j(j9);
        if (i10 > y3.a.h(j9) || iJ > i10) {
            return false;
        }
        return i11 <= y3.a.g(j9) && y3.a.i(j9) <= i11;
    }

    public static final z2.x0 w(r1 r1Var, int i10, int i11, int i12, int i13, int i14, z2.y0 y0Var, List list, z2.l1[] l1VarArr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        float f3;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j9 = i14;
        int i22 = i16 - i15;
        int[] iArr2 = new int[i22];
        int i23 = i15;
        int iMax = 0;
        int i24 = 0;
        int i25 = 0;
        int iMin = 0;
        float f10 = 0.0f;
        while (i23 < i16) {
            z2.v0 v0Var = (z2.v0) list2.get(i23);
            float fT = t(s(v0Var));
            if (fT > 0.0f) {
                f10 += fT;
                i24++;
                i19 = i23;
            } else {
                int i26 = i12 - i25;
                z2.l1 l1VarO = l1VarArr[i23];
                if (l1VarO == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i24;
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i19 = i23;
                        i20 = i24;
                        i21 = i26 < 0 ? 0 : i26;
                    }
                    l1VarO = v0Var.O(r1Var.c(0, i21, i13, false));
                } else {
                    i19 = i23;
                    i20 = i24;
                }
                z2.l1 l1Var = l1VarO;
                int iA = r1Var.a(l1Var);
                int iE = r1Var.e(l1Var);
                iArr2[i19 - i15] = iA;
                int i27 = i26 - iA;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i14, i27);
                i25 += iA + iMin;
                iMax = Math.max(iMax, iE);
                l1VarArr[i19] = l1Var;
                i24 = i20;
            }
            i23 = i19 + 1;
            j9 = j9;
        }
        long j10 = j9;
        int i28 = i24;
        if (i28 == 0) {
            i25 -= iMin;
            i18 = 0;
        } else {
            long j11 = ((long) (i28 - 1)) * j10;
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i25)) - j11;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i29 = i15; i29 < i16; i29++) {
                jRound -= (long) Math.round(t(s((z2.v0) list2.get(i29))) * f11);
            }
            int i30 = i15;
            int i31 = iMax;
            int i32 = 0;
            while (i30 < i16) {
                if (l1VarArr[i30] == null) {
                    z2.v0 v0Var2 = (z2.v0) list2.get(i30);
                    f3 = f11;
                    s1 s1VarS = s(v0Var2);
                    float fT2 = t(s1VarS);
                    if (fT2 <= 0.0f) {
                        i0.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j12 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fT2 * f3) + iSignum);
                    z2.l1 l1VarO2 = v0Var2.O(r1Var.c((!(s1VarS != null ? s1VarS.f6458b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iA2 = r1Var.a(l1VarO2);
                    int iE2 = r1Var.e(l1VarO2);
                    iArr2[i30 - i15] = iA2;
                    i32 += iA2;
                    int iMax3 = Math.max(i31, iE2);
                    l1VarArr[i30] = l1VarO2;
                    i31 = iMax3;
                    jRound = j12;
                } else {
                    f3 = f11;
                }
                i30++;
                list2 = list;
                f11 = f3;
            }
            i18 = (int) (((long) i32) + j11);
            int i33 = i12 - i25;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i33) {
                i18 = i33;
            }
            iMax = i31;
        }
        int i34 = i18 + i25;
        if (i34 < 0) {
            i34 = 0;
        }
        int iMax4 = Math.max(i34, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr3 = new int[i22];
        r1Var.h(iMax4, iArr2, iArr3, y0Var);
        return r1Var.f(l1VarArr, y0Var, iArr3, iMax4, iMax5, iArr, i17, i15, i16);
    }

    public static final void x(z2.v0 v0Var, j0 j0Var, long j9, u00.k kVar) {
        if (t(s(v0Var)) != 0.0f) {
            j0Var.getClass();
            v0Var.f0(v0Var.s(Integer.MAX_VALUE));
            return;
        }
        s(v0Var);
        z2.l1 l1VarO = v0Var.O(j9);
        kVar.invoke(l1VarO);
        j0Var.getClass();
        l1VarO.j0();
        l1VarO.i0();
    }

    public static final b2.r y(b2.r rVar, u00.k kVar) {
        return rVar.V(new i1(kVar, new as.d0(28, kVar)));
    }

    public static final b2.r z(b2.r rVar, float f3, float f10) {
        return rVar.V(new f1(f3, f10, true, new g1(f3, f10, 0)));
    }

    public abstract int k(int i10, int i11, y3.m mVar);
}
