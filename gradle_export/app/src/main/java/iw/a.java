package iw;

import android.content.Context;
import as.h0;
import b2.r;
import b3.g;
import b3.h;
import b3.i;
import c3.o0;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.o;
import h0.p1;
import h0.s;
import h0.t0;
import h0.v;
import h0.z1;
import i2.b0;
import java.util.WeakHashMap;
import k0.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import mb.l;
import q3.u;
import wr.k;
import y3.f;
import z.h1;
import z.n;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ax.a(23), -401201952, false);

    public static final void a(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1614736637);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            r rVarF = n.f(z1.c, dl.a.q, b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            k.h(null, 84, 0.0f, dl.a.h, g0Var, 48, 5);
            g0Var.r(true);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 14);
        }
    }

    public static final void b(dw.a playlist, u00.a onClick, r rVar, j jVar, int i) {
        boolean z;
        long jZ;
        long jZ2;
        m.e(playlist, "playlist");
        String str = playlist.f;
        m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-270634242);
        int i2 = 16;
        int i3 = i | (g0Var.g(playlist) ? 4 : 2) | (g0Var.i(onClick) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = 8;
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objN = oi.k.t(i2, g0Var);
            }
            float f = ((f) objN).A;
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    jZ2 = kh.o.z(18);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ2 = kh.o.z(22);
                }
                objN2 = new y3.o(jZ2);
                g0Var.n0(objN2);
            }
            long j = ((y3.o) objN2).a;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                int iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    jZ = kh.o.z(20);
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(24);
                }
                objN3 = new y3.o(jZ);
                g0Var.n0(objN3);
            }
            long j2 = ((y3.o) objN3).a;
            r rVarN = w50.c.n(f2.h.c(rVar, p0.f.a(10)), true, onClick);
            w0 w0VarD = o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarN, g0Var);
            i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            if (playlist.c()) {
                g0Var.c0(25981789);
                a(null, g0Var, 0);
                g0Var.r(false);
            } else if (r30.k.L0(str)) {
                g0Var.c0(25986297);
                e(null, g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(25984116);
                c(str, null, g0Var, 0);
                g0Var.r(false);
            }
            boolean z2 = playlist.g;
            b2.o oVar = b2.o.A;
            if (z2) {
                g0Var.c0(805660397);
                h(playlist, j, j2, h0.c.C(oVar, f), g0Var, 28102 | ((i3 << 3) & 112));
                g0Var.r(false);
                z = true;
            } else {
                g0Var.c0(805929322);
                z = true;
                g(28038, j, j2, h0.c.C(oVar, f), playlist.c, g0Var);
                g0Var.r(false);
            }
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 13, playlist, onClick, rVar);
        }
    }

    public static final void c(String str, r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1030668031);
        int i2 = (g0Var.g(str) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = str;
            mb.j jVarI = l.i(w.c.q(hVar, 600), (p) null, g0Var, 0, 62);
            n.c(jVarI, (String) null, rd.a.g0(10, 0, dl.a.s, z1.c, !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.m(str, rVar, i, 3);
        }
    }

    public static final void d(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1401906023);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            rVar = b2.o.A;
            float f = 10;
            o.a(rd.a.g0(f, 0, dl.a.s, f2.h.c(h0.c.m(z1.d(rVar, 1.0f), 1.0f), p0.f.a(f)), true), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 16);
        }
    }

    public static final void e(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1946966397);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            o.a(n.f(z1.c, dl.a.q, b0.b), g0Var, 0);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 15);
        }
    }

    public static final void f(u30.b playlists, boolean z, String headerTitle, u00.k onPlaylistClicked, y yVar, r rVar, j jVar, int i) {
        r rVar2;
        k0.a bVar;
        int i2;
        int i3;
        m.e(playlists, "playlists");
        m.e(headerTitle, "headerTitle");
        m.e(onPlaylistClicked, "onPlaylistClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1762740563);
        int i4 = 196608 | i | (g0Var.i(playlists) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.g(headerTitle) ? 256 : 128) | (g0Var.i(onPlaylistClicked) ? 2048 : 1024) | (g0Var.g(yVar) ? 16384 : 8192);
        if (g0Var.S(i4 & 1, (74899 & i4) != 74898)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            boolean zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                objN = oi.k.t(t0VarL.c() + n1Var.c() + 12, g0Var);
            }
            float f = ((f) objN).A;
            boolean zG = g0Var.g(n1Var) | g0Var.g(t0VarL);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
            }
            float f2 = ((f) objN2).A;
            boolean zE2 = g0Var.e(aVar.ordinal());
            Object objN3 = g0Var.N();
            if (zE2 || objN3 == cVar) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    bVar = new k0.b(2);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new k0.a(240);
                }
                objN3 = bVar;
                g0Var.n0(objN3);
            }
            k0.c cVar2 = (k0.c) objN3;
            boolean zE3 = g0Var.e(aVar.ordinal());
            Object objN4 = g0Var.N();
            if (zE3 || objN4 == cVar) {
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 8;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 16;
                }
                objN4 = oi.k.t(i2, g0Var);
            }
            float f3 = ((f) objN4).A;
            boolean zE4 = g0Var.e(aVar.ordinal());
            Object objN5 = g0Var.N();
            if (zE4 || objN5 == cVar) {
                int iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 16;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 24;
                }
                objN5 = oi.k.t(i3, g0Var);
            }
            float f4 = ((f) objN5).A;
            a0 a0Var = z1.c;
            h0.f fVarG = h0.i.g(f3);
            h0.f fVarG2 = h0.i.g(f3);
            p1 p1Var = new p1(f4, f, f4, f2);
            boolean zE5 = g0Var.e(aVar.ordinal()) | ((i4 & 896) == 256) | ((i4 & 112) == 32) | g0Var.i(playlists) | ((i4 & 7168) == 2048);
            Object objN6 = g0Var.N();
            if (zE5 || objN6 == cVar) {
                b1.o oVar = new b1.o(aVar, z, playlists, headerTitle, onPlaylistClicked);
                g0Var.n0(oVar);
                objN6 = oVar;
            }
            kh.n.i(cVar2, a0Var, yVar, p1Var, fVarG2, fVarG, (d0.t0) null, false, (h1) null, (u00.k) objN6, g0Var, (i4 >> 6) & 896, 0, 912);
            rVar2 = b2.o.A;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0(playlists, z, headerTitle, onPlaylistClicked, yVar, rVar2, i);
        }
    }

    public static final void g(int i, long j, long j2, r rVar, String str, j jVar) {
        j jVar2;
        j jVar3 = (g0) jVar;
        jVar3.e0(1049702892);
        int i2 = i | (jVar3.g(str) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 9363) != 9362)) {
            jVar2 = jVar3;
            z6.b(str, s.a.a(rVar, b2.b.G), dl.a.k, j, u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 2, false, 2, 0, (u00.k) null, (r0) null, jVar2, ((i2 >> 3) & 14) | 1597440, 25008, 239528);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new c(str, j, j2, rVar, i, 0);
        }
    }

    public static final void h(dw.a aVar, long j, long j2, r rVar, j jVar, int i) {
        int i2;
        dw.a aVar2;
        boolean z;
        r rVar2;
        b3.e eVar;
        boolean z2;
        b2.c cVar;
        u00.n nVar;
        long j3;
        long jZ;
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1610544394);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? g0Var.g(aVar) : g0Var.i(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        if (g0Var.S(i2 & 1, (i2 & 9361) != 9360)) {
            gm.a aVar3 = (gm.a) g0Var.k(dl.e.a);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (objN == cVar2) {
                int iOrdinal = aVar3.ordinal();
                if (iOrdinal == 0) {
                    i3 = 58;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 92;
                }
                objN = oi.k.t(i3, g0Var);
            }
            float f = ((f) objN).A;
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                int iOrdinal2 = aVar3.ordinal();
                if (iOrdinal2 == 0) {
                    jZ = kh.o.z(12);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(16);
                }
                objN2 = new y3.o(jZ);
                g0Var.n0(objN2);
            }
            long j4 = ((y3.o) objN2).a;
            r rVarV = rVar.V(z1.c);
            h0.d dVar = h0.i.c;
            b2.c cVar3 = b2.b.M;
            v vVarA = h0.u.a(dVar, cVar3, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarV, g0Var);
            i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            u00.n nVar2 = h.f;
            q.I(vVarA, g0Var, nVar2);
            b3.f fVar = h.e;
            q.I(m1VarM, g0Var, fVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = h.g;
            q.I(numValueOf, g0Var, fVar2);
            b3.e eVar2 = h.h;
            q.E(g0Var, eVar2);
            b3.f fVar3 = h.d;
            q.I(rVarC, g0Var, fVar3);
            String strB = aVar.b();
            r rVar3 = b2.o.A;
            if (strB == null) {
                g0Var.c0(-17691178);
                g0Var.r(false);
                rVar2 = rVar3;
                z = false;
                eVar = eVar2;
                cVar = cVar3;
                z2 = true;
                nVar = nVar2;
                j3 = j4;
            } else {
                g0Var.c0(-17691177);
                wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
                hVar.c = strB;
                z = false;
                rVar2 = rVar3;
                eVar = eVar2;
                z2 = true;
                cVar = cVar3;
                nVar = nVar2;
                j3 = j4;
                n.c(l.i(w.c.q(hVar, 600), (p) null, g0Var, 0, 62), (String) null, f2.h.c(z1.m(rVar3, f), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
                g0Var.r(false);
            }
            r rVarD = z1.d(rVar2, 1.0f);
            if (!(((double) 1.0f) > 0.0d ? z2 : z)) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            r rVarV2 = rVarD.V(new c1(1.0f, z2));
            v vVarA2 = h0.u.a(h0.i.d, cVar, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarV2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, nVar);
            q.I(m1VarM2, g0Var, fVar);
            a1.b.v(iHashCode2, g0Var, fVar2, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar3);
            z6.b(z3.U(g0Var, 2131886987), (r) null, dl.a.p, j3, (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            String strA = aVar.a();
            aVar2 = aVar;
            if (strA == null) {
                strA = aVar2.c;
            }
            z6.b(strA, (r) null, dl.a.k, j, u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, ((i2 << 6) & 57344) | 1572864, ((i2 >> 6) & 112) | 24960, 239530);
            g0Var = g0Var;
            g0Var.r(z2);
            g0Var.r(z2);
        } else {
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(aVar2, j, j2, rVar, i, 0);
        }
    }
}
