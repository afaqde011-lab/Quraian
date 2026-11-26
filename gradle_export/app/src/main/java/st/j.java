package st;

import a10.h0;
import a40.z;
import android.content.res.Configuration;
import b2.r;
import c3.l2;
import c3.m0;
import c3.o0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.e5;
import g1.o3;
import g1.z6;
import gv.d0;
import h0.c1;
import h0.e1;
import h0.m2;
import h0.p1;
import h0.s;
import h0.t0;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import j0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kh.o;
import kotlin.jvm.internal.m;
import l1.f1;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import l1.y0;
import l1.z0;
import m3.r0;
import ta.c0;
import x3.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class j {
    public static final float a = 16;
    public static final float b = 24;
    public static final float c = 6;

    public static final void a(String str, String str2, u00.a aVar, r rVar, l1.j jVar, int i) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1624439933);
        int i2 = i | (g0Var2.g(str) ? 4 : 2) | (g0Var2.g(str2) ? 32 : 16) | (g0Var2.i(aVar) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            r rVarD = z1.d(rVar, 1.0f);
            float f = 12;
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.g(4), b2.b.M, g0Var2, 6);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(c1Var, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            long j = dl.a.k;
            long jZ = o.z(16);
            long jZ2 = o.z(21);
            q3.u uVar = q3.u.K;
            z6.b(str, (r) null, j, jZ, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, (i2 & 14) | 1597440, 48, 260010);
            z6.b(str2, (r) null, t.b(0.5f, j), o.z(13), (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, o.z(18), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var2, ((i2 >> 3) & 14) | 24576, 25008, 239594);
            g0Var2.r(true);
            p0.e eVarA = p0.f.a(32);
            b2.o oVar = b2.o.A;
            r rVarN = w50.c.n(n.f(f2.h.c(oVar, eVarA), t.b(0.15f, dl.a.i), b0.b), true, aVar);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(rVarN, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, fVar);
            q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC3, g0Var2, fVar4);
            z6.b(z3.U(g0Var2, 2131887093), h0.c.D(oVar, f, 9), j, o.z(15), uVar, (q3.i) null, 0L, (l) null, (k) null, o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597488, 48, 260008);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ix.e(i, 2, rVar, str, str2, aVar);
        }
    }

    public static final void b(final ot.b lyricCellVisibility, final boolean z, final String appliedTafsirLanguageName, final String appliedTafsirAuthorName, final rt.g transcription, u00.a onClose, final u00.a onToggleQuran, final u00.a onToggleTafsir, final u00.a onOpenTafsirPicker, final u00.a onOpenTranscriptionPicker, final u00.k onSelectVerseScript, final int i, final u00.k onTextSizeStepChange, final boolean z2, final u00.k onCinematicModeChange, boolean z3, l1.j jVar, int i2, int i3) {
        int i4;
        int i5;
        g0 g0Var;
        boolean z4;
        r rVarA;
        m.e(lyricCellVisibility, "lyricCellVisibility");
        m.e(appliedTafsirLanguageName, "appliedTafsirLanguageName");
        m.e(appliedTafsirAuthorName, "appliedTafsirAuthorName");
        m.e(transcription, "transcription");
        m.e(onClose, "onClose");
        m.e(onToggleQuran, "onToggleQuran");
        m.e(onToggleTafsir, "onToggleTafsir");
        m.e(onOpenTafsirPicker, "onOpenTafsirPicker");
        m.e(onOpenTranscriptionPicker, "onOpenTranscriptionPicker");
        m.e(onSelectVerseScript, "onSelectVerseScript");
        m.e(onTextSizeStepChange, "onTextSizeStepChange");
        m.e(onCinematicModeChange, "onCinematicModeChange");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1243517333);
        if ((i2 & 6) == 0) {
            i4 = i2 | (g0Var2.g(lyricCellVisibility) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g0Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g0Var2.g(appliedTafsirLanguageName) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g0Var2.g(appliedTafsirAuthorName) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= g0Var2.g(transcription) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= g0Var2.i(onClose) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= g0Var2.i(onToggleQuran) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= g0Var2.i(onToggleTafsir) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= g0Var2.i(onOpenTafsirPicker) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= g0Var2.i(onOpenTranscriptionPicker) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (g0Var2.i(onSelectVerseScript) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g0Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g0Var2.i(onTextSizeStepChange) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g0Var2.h(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g0Var2.i(onCinematicModeChange) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= g0Var2.h(z3) ? 131072 : 65536;
        }
        int i7 = i5;
        if (g0Var2.S(i6 & 1, ((i6 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var2).e, g0Var2);
            j0.v vVarA = x.a(0, g0Var2, 3);
            l2 l2VarU = m0.u(g0Var2);
            Configuration configuration = (Configuration) g0Var2.k(o0.a);
            float f = (z3 || configuration.orientation != 2) ? b : (configuration.screenWidthDp * 0.39999998f) / 2;
            if (z3) {
                z4 = false;
                g0Var2.c0(1533252813);
                g0Var2.r(false);
            } else {
                g0Var2.c0(1533126922);
                g4.d(54, t.f, g0Var2, true);
                z4 = false;
                g0Var2.r(false);
            }
            r rVar = b2.o.A;
            r rVar2 = z3 ? rVar : z1.c;
            b2.i iVar = b2.b.B;
            w0 w0VarD = h0.o.d(iVar, z4);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVar2, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            i2.o0 o0Var = b0.b;
            if (z3) {
                rVarA = n.f(f2.h.c(z1.c(z1.f(z1.r(h0.c.E(rVar, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), 1.0f), p0.f.a(32)), dl.a.q, o0Var);
            } else {
                float f2 = 32;
                rVarA = u2.f.a(n.f(f2.h.c(z1.c, p0.f.c(f2, f2, 0.0f, 0.0f, 12)), dl.a.q, o0Var), l2VarU, (u2.d) null);
            }
            v vVarA2 = u.a(h0.i.c, b2.b.M, g0Var2, 0);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarA, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA2, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            c(!z3, onClose, g0Var2, (i6 >> 12) & 112);
            r rVarD = z1.d(rVar, 1.0f);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(rVarD, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD2, g0Var2, fVar);
            q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC3, g0Var2, fVar4);
            r rVarD2 = z1.d(rVar, 1.0f);
            p1 p1VarG = h0.c.g(f, 0.0f, f, z3 ? 24 : 24 + t0VarL.a(), 2);
            h0.f fVarG = h0.i.g(12);
            boolean z5 = ((i6 & 57344) == 16384) | ((i6 & 14) == 4) | ((i6 & 3670016) == 1048576) | ((i7 & 14) == 4) | ((i6 & 1879048192) == 536870912) | ((i6 & 112) == 32) | ((i6 & 896) == 256) | ((i6 & 7168) == 2048) | ((29360128 & i6) == 8388608) | ((i6 & 234881024) == 67108864) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 112) == 32) | ((i7 & 896) == 256);
            Object objN = g0Var2.N();
            if (z5 || objN == l1.i.a) {
                g0Var = g0Var2;
                u00.k kVar = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyColumn = (j0.h) obj;
                        m.e(LazyColumn, "$this$LazyColumn");
                        ot.b bVar = lyricCellVisibility;
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new bt.m0(bVar, transcription, onToggleQuran, onSelectVerseScript, onOpenTranscriptionPicker, 6), 27673516, true), 3);
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new ez.n(bVar, z, appliedTafsirLanguageName, appliedTafsirAuthorName, onToggleTafsir, onOpenTafsirPicker), -1992785757, true), 3);
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new sp.b(2, onCinematicModeChange, z2), 913722596, true), 3);
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new j0.f(i, onTextSizeStepChange), -474736347, true), 3);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar);
                objN = kVar;
            } else {
                g0Var = g0Var2;
            }
            k00.f.d(rVarD2, vVarA, p1VarG, fVarG, null, null, false, null, (u00.k) objN, g0Var, 24582, 488);
            f50.c.j(vVarA.b(), dl.a.q, s.a.a(rVar, iVar), 0.0f, g0Var, 0);
            x5.z(g0Var, true, true, true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e5(lyricCellVisibility, z, appliedTafsirLanguageName, appliedTafsirAuthorName, transcription, onClose, onToggleQuran, onToggleTafsir, onOpenTafsirPicker, onOpenTranscriptionPicker, onSelectVerseScript, i, onTextSizeStepChange, z2, onCinematicModeChange, z3, i2, i3);
        }
    }

    public static final void c(boolean z, u00.a aVar, l1.j jVar, int i) {
        int i2;
        int i3;
        r rVarL;
        u00.a aVar2 = aVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1365303394);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(aVar2) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVar = b2.o.A;
            r rVarD = z1.d(rVar, 1.0f);
            if (z) {
                g0Var.c0(-412899013);
                r rVarM = h0.c.M(rVar, h0.c.e);
                WeakHashMap weakHashMap = m2.w;
                rVarL = h0.c.L(rVarM, new e1(h0.b.e(g0Var).b, h0.c.l));
                g0Var.r(false);
            } else {
                g0Var.c0(-412698412);
                g0Var.r(false);
                rVarL = rVar;
            }
            r rVarG = h0.c.G(h0.c.E(rVarD.V(rVarL), b, 0.0f, 2), 0.0f, 16, 0.0f, 12, 5);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            r rVarA = s.a.a(rVar, b2.b.D);
            m2.b bVarR = y3.R(2131231104, g0Var, 0);
            String strU = z3.U(g0Var, 2131886127);
            kk.c cVarD = kk.e.d(g0Var);
            long j = dl.a.i;
            aVar2 = aVar;
            c0.a(bVarR, strU, aVar2, cVarD, t.b(0.1f, j), rVarA, 0.0f, 0.0f, j, g0Var, 8 | ((i2 << 3) & 896));
            i3 = 4;
            z6.b(z3.U(g0Var, 2131887255), h0.c.E(rVar, 48, 0.0f, 2), dl.a.k, o.z(17), q3.u.L, (q3.i) null, 0L, (l) null, new k(3), o.z(22), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597488, 25008, 238504);
            g0Var.r(true);
        } else {
            i3 = 4;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new fz.c(z, aVar2, i, i3);
        }
    }

    public static final void d(int i, String str, l1.j jVar, u00.a aVar, boolean z) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-665624736);
        int i2 = i | (jVar3.g(str) ? 4 : 2) | (jVar3.h(z) ? 32 : 16) | (jVar3.i(aVar) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            jVar2 = jVar3;
            z6.b(str, h0.c.D(w50.c.n(n.f(f2.h.c(b2.o.A, p0.f.a(f)), z ? dl.a.i : t.b(0.1f, dl.a.i), b0.b), !z, aVar), f, 8), z ? dl.a.q : dl.a.k, o.z(15), q3.u.K, (q3.i) null, 0L, (l) null, (k) null, o.z(20), 0, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 1597440, 24624, 243624);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new d0(str, z, aVar, i, 4);
        }
    }

    public static final void e(boolean z, u00.a aVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1502822481);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(aVar) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            z0 z0VarG = q.G(Boolean.valueOf(z), g0Var);
            z0 z0VarG2 = q.G(aVar, g0Var);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.o(g0Var);
                g0Var.n0(objN);
            }
            z zVar = (z) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = oi.k.s(0, g0Var);
            }
            f1 f1Var = (y0) objN2;
            boolean zE = g0Var.e(f1Var.h());
            Object objN3 = g0Var.N();
            if (zE || objN3 == obj) {
                objN3 = new ct.k(z0VarG, 19);
                g0Var.n0(objN3);
            }
            u00.a aVar2 = (u00.a) objN3;
            boolean zG = g0Var.g(z0VarG) | g0Var.g(z0VarG2) | g0Var.i(zVar);
            Object objN4 = g0Var.N();
            if (zG || objN4 == obj) {
                az.k kVar = new az.k(zVar, z0VarG, z0VarG2, f1Var, 15);
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            h0.f(aVar2, (u00.k) objN4, kk.e.d(g0Var), null, false, g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new fz.c(z, aVar, i, 3);
        }
    }

    public static final void f(String str, v1.c cVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1083599310);
        int i2 = (g0Var.g(str) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            h0.b bVar = h0.i.a;
            v vVarA = u.a(h0.i.g(c), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(b2.o.A, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            g(str, g0Var, i2 & 14);
            cVar.invoke(g0Var, 6);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(str, cVar, i, 22);
        }
    }

    public static final void g(String str, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(170881799);
        int i2 = i | (jVar3.g(str) ? 4 : 2);
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            jVar2 = jVar3;
            z6.b(str, h0.c.G(b2.o.A, 0.0f, 8, 0.0f, 0.0f, 13), t.b(0.5f, dl.a.k), o.z(13), (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 24624, 48, 260072);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.n(str, i, 8);
        }
    }

    public static final void h(final int i, final String str, final boolean z, final u00.a aVar, boolean z2, l1.j jVar, final int i2, final int i3) {
        boolean z3;
        int i4;
        final boolean z4;
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(1972190807);
        int i5 = i2 | (jVar2.e(i) ? 4 : 2) | (jVar2.g(str) ? 32 : 16) | (jVar2.h(z) ? 256 : 128) | (jVar2.i(aVar) ? 2048 : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i5 | (jVar2.h(z3) ? 16384 : 8192);
        }
        if (jVar2.S(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z5 = i6 != 0 ? false : z3;
            b2.o oVar = b2.o.A;
            r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, jVar2, 54);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            r rVarC = b2.a.c(rVarD, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            q.I(v1VarA, jVar2, b3.h.f);
            q.I(m1VarM, jVar2, b3.h.e);
            q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
            q.E(jVar2, b3.h.h);
            q.I(rVarC, jVar2, b3.h.d);
            r rVarM = z1.m(oVar, 24);
            m2.b bVarR = y3.R(i, jVar2, i4 & 14);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, rVarM, j, jVar2, 440, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            boolean z6 = z5;
            int i7 = i4;
            z6.b(str, new c1(1.0f, true), j, o.z(16), q3.u.K, (q3.i) null, 0L, (l) null, (k) null, o.z(21), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, ((i4 >> 3) & 14) | 1597440, 48, 260008);
            jVar2 = jVar2;
            z3.c(0.0f, (i7 >> 12) & 14, (r) null, jVar2, z6);
            e(z, aVar, jVar2, (i7 >> 6) & 126);
            jVar2.r(true);
            z4 = z6;
        } else {
            jVar2.V();
            z4 = z3;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(i, str, z, aVar, z4, i2, i3) {
                public final int A;
                public final String B;
                public final boolean C;
                public final u00.a D;
                public final boolean E;
                public final int F;

                {
                    this.F = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(1);
                    j.h(this.A, this.B, this.C, this.D, this.E, (l1.j) obj, iK, this.F);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void i(boolean z, boolean z2, String str, String str2, u00.a aVar, u00.a aVar2, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1672960039);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.h(z2) ? 32 : 16) | (g0Var.g(str) ? 256 : 128) | (g0Var.g(str2) ? 2048 : 1024) | (g0Var.i(aVar) ? 16384 : 8192) | (g0Var.i(aVar2) ? 131072 : 65536);
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            g0Var.c0(1396835841);
            String strU = r30.k.L0(str) ? z3.U(g0Var, 2131886631) : str;
            g0Var.r(false);
            g0Var.c0(1396838632);
            String strU2 = r30.k.L0(str2) ? z3.U(g0Var, 2131887330) : str2;
            g0Var.r(false);
            f50.k.e(null, v1.d.d(529215858, new nx.g0(z, aVar, z2, strU, strU2, aVar2), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iz.f(z, z2, str, str2, aVar, aVar2, i);
        }
    }

    public static final void j(boolean z, rt.g gVar, u00.a aVar, u00.k kVar, u00.a aVar2, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(225416990);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.g(gVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128) | (g0Var.i(kVar) ? 2048 : 1024) | (g0Var.i(aVar2) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = gVar.a == ot.d.B;
            g0Var.c0(1877377383);
            List listS = va.a.S(new String[]{gVar.d, gVar.e});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listS) {
                if (!r30.k.L0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String strR0 = h00.q.R0(arrayList, " · ", null, null, null, 62);
            if (strR0.length() == 0) {
                strR0 = z3.U(g0Var, 2131887100);
            }
            g0Var.r(false);
            f50.k.e(null, v1.d.d(-1939968077, new nx.g0(z, aVar, z2, kVar, strR0, aVar2), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.k(z, gVar, aVar, kVar, aVar2, i, 4);
        }
    }
}
