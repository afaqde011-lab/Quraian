package qp;

import b2.r;
import c00.s;
import g1.c5;
import g1.n5;
import g1.w6;
import g2.d;
import g2.t;
import h0.p1;
import h0.z1;
import ix.l;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.q;
import l1.r1;
import m3.r0;
import p0.e;
import p0.f;
import q0.i1;
import u00.k;
import u00.n;
import v1.c;
import z0.g;
import z0.h;

public abstract class a {
    public static final c a = new c(new ou.a(18), 1379516060, false);

    public static final void a(String emailValue, boolean z, k onEmailChanged, u00.a onClear, u00.a onDone, r rVar, boolean z2, t tVar, j jVar, int i) {
        j jVar2;
        c cVar;
        m.e(emailValue, "emailValue");
        m.e(onEmailChanged, "onEmailChanged");
        m.e(onClear, "onClear");
        m.e(onDone, "onDone");
        j jVar3 = (g0) jVar;
        jVar3.e0(-428343499);
        int i2 = i | (jVar3.g(emailValue) ? 4 : 2) | (jVar3.h(z) ? 32 : 16) | (jVar3.i(onEmailChanged) ? 256 : 128) | (jVar3.i(onClear) ? 2048 : 1024) | (jVar3.i(onDone) ? 16384 : 8192) | (jVar3.h(z2) ? 1048576 : 524288);
        if (jVar3.S(i2 & 1, (4793491 & i2) != 4793490)) {
            jVar3.X();
            if ((i & 1) != 0 && !jVar3.A()) {
                jVar3.V();
            }
            jVar3.s();
            int i3 = i2 & 14;
            g gVarH = h.h(emailValue, jVar3, i3);
            boolean zG = (i3 == 4) | jVar3.g(gVarH);
            Object objN = jVar3.N();
            Object obj = i.a;
            if (zG || objN == obj) {
                objN = new l(emailValue, gVarH, null, 1);
                jVar3.n0(objN);
            }
            q.i(emailValue, jVar3, (n) objN);
            boolean zG2 = jVar3.g(gVarH) | ((i2 & 896) == 256);
            Object objN2 = jVar3.N();
            if (zG2 || objN2 == obj) {
                objN2 = new s(gVarH, onEmailChanged, null, 7);
                jVar3.n0(objN2);
            }
            q.i(gVarH, jVar3, (n) objN2);
            r rVarJ = d.j(z1.e(rVar, 48), tVar);
            e eVarA = f.a(32);
            z0.e eVar = z0.e.B;
            p1 p1VarE = h0.c.e(16, 0.0f, 2);
            i1 i1Var = new i1(0, 6, 7, 115);
            boolean z3 = (57344 & i2) == 16384;
            Object objN3 = jVar3.N();
            if (z3 || objN3 == obj) {
                objN3 = new b(onDone, 0);
                jVar3.n0(objN3);
            }
            b bVar = (b) objN3;
            if (emailValue.length() > 0) {
                jVar3.c0(-431828747);
                c cVarD = v1.d.d(55144922, new eu.d(17, onClear), jVar3);
                jVar3.r(false);
                cVar = cVarD;
            } else {
                jVar3.c0(-431737359);
                jVar3.r(false);
                cVar = null;
            }
            c5 c5Var = c5.a;
            long j = dl.a.Z;
            long jB = i2.t.b(0.19f, j);
            long jB2 = i2.t.b(0.08f, j);
            long jB3 = i2.t.b(0.08f, dl.a.i);
            long j2 = z2 ? dl.a.C : i2.t.f;
            long j3 = z2 ? dl.a.C : i2.t.f;
            long j4 = i2.t.f;
            long j5 = dl.a.U;
            jVar2 = jVar3;
            long jB4 = i2.t.b(0.19f, j);
            long j6 = dl.a.k;
            n5.c(gVarH, rVarJ, false, (r0) null, (w6) null, a, (n) null, cVar, z, i1Var, bVar, eVar, (z.p1) null, eVarA, c5.c(j6, j6, j6, j6, jB, jB2, jB3, jB4, dl.a.H, j2, j3, j4, j5, i2.t.b(0.5f, j6), i2.t.b(0.5f, j6), i2.t.b(0.5f, j6), jVar2, 1207928320), p1VarE, jVar2, 12582912, ((i2 << 6) & 7168) | 102236160, 18406780);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ox.c(emailValue, z, onEmailChanged, onClear, onDone, rVar, z2, tVar, i);
        }
    }
}
