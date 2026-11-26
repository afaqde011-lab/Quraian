package hv;

import as.p0;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import g1.j7;
import g1.o3;
import g1.z6;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.Map;
import l1.g0;
import l1.m1;
import l1.r1;
import m3.r0;
import z2.w0;

public abstract class i {
    public static final v1.c a = new v1.c(new eu.b(16), -2096265381, false);

    public static final void a(b2.r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1725786789);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            float fA0 = ((y3.c) g0Var.k(o1.h)).A0(10);
            p0.e eVar = p0.f.a;
            long j = dl.a.i;
            b2.r rVarG = z.n.g(f2.h.c(rVar, eVar), 1, i2.t.b(0.22f, j), eVar);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new j7(26);
                g0Var.n0(objN);
            }
            b2.r rVarB = j3.q.b(rVarG, (u00.k) objN);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            h0.c.a(h0.s.a.b(), (b2.d) null, false, v1.d.d(15575881, new p0(fA0, 6), g0Var), g0Var, 3072, 6);
            float f = 14;
            b2.o oVar = b2.o.A;
            b2.r rVarD = h0.c.D(oVar, f, 8);
            v1 v1VarA = t1.a(h0.i.g(6), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            l1.q.I(rVarC2, g0Var, fVar4);
            o3.a(y3.R(2131231427, g0Var, 0), (String) null, z1.m(oVar, f), j, g0Var, 440, 0);
            z6.b("Quranify", (b2.r) null, j, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, 24582, 24576, 245738);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 11);
        }
    }

    public static final o b(int i, Map arabicTextByAyah, Map transcriptionTextByAyah, Map tafsirTextByAyah, ot.b cellVisibility, boolean z) {
        String str;
        kotlin.jvm.internal.m.e(arabicTextByAyah, "arabicTextByAyah");
        kotlin.jvm.internal.m.e(transcriptionTextByAyah, "transcriptionTextByAyah");
        kotlin.jvm.internal.m.e(tafsirTextByAyah, "tafsirTextByAyah");
        kotlin.jvm.internal.m.e(cellVisibility, "cellVisibility");
        String str2 = (String) transcriptionTextByAyah.get(Integer.valueOf(i));
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str = (String) arabicTextByAyah.get(Integer.valueOf(i));
            if (str == null) {
                str = "";
            }
        } else {
            str = str2;
        }
        boolean z2 = str2.length() > 0;
        if (cellVisibility.b) {
            if (z) {
                String str4 = (String) tafsirTextByAyah.get(Integer.valueOf(i));
                if (str4 != null) {
                    str3 = str4;
                }
            } else {
                str3 = "Translation placeholder text for layout.";
            }
        }
        return new o(str, str3, z2);
    }
}
