package np;

import b2.b;
import b2.r;
import b3.g;
import b3.h;
import b3.i;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import eu.p;
import g1.z6;
import g2.d;
import h0.o;
import h0.z1;
import i2.t;
import i2.v0;
import iw.c;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.h0;
import m3.r0;
import p0.e;
import p0.f;
import q0.c0;
import q0.h1;
import q0.i1;
import q3.u;
import r3.e0;
import r3.w;
import w.b2;
import x.y;
import x3.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class a {
    public static final float a = 46;
    public static final float b = 56;
    public static final float c = 12;
    public static final float d = 8;

    public static final void a(int i, long j, long j2, r rVar, String str, j jVar) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1536802643);
        int i2 = i | (g0Var2.g(str) ? 4 : 2) | (g0Var2.f(j) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128) | (g0Var2.f(j2) ? 2048 : 1024);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            e eVarA = f.a(12);
            r rVarG = n.g(rVar, 1, j, eVarA);
            long j3 = dl.a.i;
            r rVarF = n.f(rVarG, t.b(0.08f, j3), eVarA);
            w0 w0VarD = o.d(b.E, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarF, g0Var2);
            i.c.getClass();
            g gVar = h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, h.f);
            q.I(m1VarM, g0Var2, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, h.g);
            q.E(g0Var2, h.h);
            q.I(rVarC, g0Var2, h.d);
            z6.b(str, (r) null, j3, j2, (u) null, (q3.i) null, 0L, (l) null, new k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, (i2 & 14) | ((i2 << 3) & 57344), 0, 261098);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(str, j, rVar, j2, i);
        }
    }

    public static final void b(String otpText, u00.k onOtpTextChange, r rVar, u00.a aVar, boolean z, boolean z2, g2.t tVar, j jVar, int i) {
        j jVar2;
        u00.a aVar2;
        long j;
        m.e(otpText, "otpText");
        m.e(onOtpTextChange, "onOtpTextChange");
        j jVar3 = (g0) jVar;
        jVar3.e0(-446374245);
        int i2 = i | (jVar3.g(otpText) ? 4 : 2) | (jVar3.i(onOtpTextChange) ? 256 : 128) | (jVar3.g(rVar) ? 2048 : 1024) | 24576 | (jVar3.h(z) ? 131072 : 65536) | (jVar3.h(z2) ? 1048576 : 524288);
        if (jVar3.S(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new h.e(15);
                jVar3.n0(objN);
            }
            u00.a aVar3 = (u00.a) objN;
            y3.c cVar2 = (y3.c) jVar3.k(o1.h);
            q2.a aVar4 = (q2.a) jVar3.k(o1.l);
            boolean zBooleanValue = ((Boolean) jVar3.k(tp.h.a)).booleanValue();
            Object objN2 = jVar3.N();
            if (objN2 == cVar) {
                objN2 = x5.s(Float.NaN, jVar3);
            }
            z0 z0Var = (z0) objN2;
            if (z) {
                j = dl.a.U;
            } else {
                j = z2 ? dl.a.C : t.f;
            }
            p2 p2VarA = b2.a(j, (y) null, "", jVar3, 0, 10);
            r rVarJ = tVar != null ? d.j(z1.d(rVar, 1.0f), tVar) : z1.d(rVar, 1.0f);
            int length = otpText.length();
            w wVar = new w(otpText, h0.b(length, length), 4);
            i1 i1Var = new i1(0, 8, 7, 115);
            Object objN3 = jVar3.N();
            if (objN3 == cVar) {
                objN3 = new ca.q(9, aVar3);
                jVar3.n0(objN3);
            }
            h1 h1Var = new h1((u00.k) objN3, (u00.k) null, 62);
            v0 v0Var = new v0(t.f);
            boolean zI = ((i2 & 14) == 4) | jVar3.i(aVar4) | ((i2 & 896) == 256);
            Object objN4 = jVar3.N();
            if (zI || objN4 == cVar) {
                objN4 = new b1.l(otpText, aVar4, onOtpTextChange, 23);
                jVar3.n0(objN4);
            }
            jVar2 = jVar3;
            c0.b(wVar, (u00.k) objN4, rVarJ, false, (r0) null, i1Var, h1Var, false, 0, 0, (e0) null, (u00.k) null, (f0.i) null, v0Var, v1.d.d(-1861626408, new p(3, cVar2, z0Var, otpText, p2VarA, zBooleanValue), jVar3), jVar2, 1572864, 221184, 16184);
            aVar2 = aVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            aVar2 = aVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new mu.j(otpText, onOtpTextChange, rVar, aVar2, z, z2, tVar, i);
        }
    }
}
