package m3;

import c3.o1;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import s10.w0;

public abstract class h0 {

    public static final w0 f10451a = new w0(new b0(11), new c0(1), 15);

    public static final w0 f10452b = new w0(new b0(12), new c0(2), 15);

    public static final w0 f10453c = new w0(new b0(13), new c0(3), 15);

    public static final w0 f10454d = new w0(new b0(14), new c0(4), 15);

    public static final w0 f10455e = new w0(new b0(15), new c0(5), 15);

    public static b a(String str, r0 r0Var, long j9, y3.c cVar, q3.h hVar, int i10, int i11) {
        h00.x xVar = h00.x.A;
        return new b(new u3.c(str, r0Var, xVar, xVar, hVar, cVar), i10, 1, j9);
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            s3.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j9 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = q0.f10519c;
        return j9;
    }

    public static final long c(int i10, long j9) {
        int i11 = q0.f10519c;
        int i12 = (int) (j9 >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j9);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j9 : b(i13, i10);
    }

    public static final int d(int i10, List list) {
        int i11;
        byte b7;
        int i12 = ((s) h00.q.T0(list)).f10527c;
        if (i10 > ((s) h00.q.T0(list)).f10527c) {
            s3.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            s sVar = (s) list.get(i11);
            if (sVar.f10526b > i10) {
                b7 = 1;
            } else {
                b7 = sVar.f10527c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b7 >= 0) {
                if (b7 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbQ = oi.k.q("Found paragraph index ", i11, " should be in range [0, ");
        sbQ.append(list.size());
        sbQ.append(").\nDebug info: index=");
        sbQ.append(i10);
        sbQ.append(", paragraphs=[");
        sbQ.append(a4.a.a(list, null, new ks.e(29), 31));
        sbQ.append(']');
        s3.a.a(sbQ.toString());
        return i11;
    }

    public static final int e(int i10, List list) {
        byte b7;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            s sVar = (s) list.get(i12);
            if (sVar.f10528d > i10) {
                b7 = 1;
            } else {
                b7 = sVar.f10529e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b7 < 0) {
                i11 = i12 + 1;
            } else {
                if (b7 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int f(ArrayList arrayList, float f3) {
        byte b7;
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((s) h00.q.T0(arrayList)).f10531g) {
            return va.a.M(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            s sVar = (s) arrayList.get(i11);
            if (sVar.f10530f > f3) {
                b7 = 1;
            } else {
                b7 = sVar.f10531g <= f3 ? (byte) -1 : (byte) 0;
            }
            if (b7 < 0) {
                i10 = i11 + 1;
            } else {
                if (b7 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void g(ArrayList arrayList, long j9, u00.k kVar) {
        int size = arrayList.size();
        for (int iD = d(q0.g(j9), arrayList); iD < size; iD++) {
            s sVar = (s) arrayList.get(iD);
            if (sVar.f10526b >= q0.f(j9)) {
                return;
            }
            if (sVar.f10526b != sVar.f10527c) {
                kVar.invoke(sVar);
            }
        }
    }

    public static void h(i2.s sVar, n0 n0Var) throws Throwable {
        i2.s sVar2;
        Throwable th2;
        q qVar = n0Var.f10497b;
        boolean zD = n0Var.d();
        m0 m0Var = n0Var.f10496a;
        boolean z10 = zD && m0Var.f10488f != 3;
        if (z10) {
            long j9 = n0Var.f10498c;
            h2.c cVarG = bi.b.g(0L, (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32));
            sVar.i();
            i2.s.s(sVar, cVarG);
        }
        i0 i0Var = m0Var.f10484b.f10522a;
        x3.l lVar = i0Var.m;
        x3.o oVar = i0Var.f10457a;
        if (lVar == null) {
            lVar = x3.l.f16417b;
        }
        x3.l lVar2 = lVar;
        i2.s0 s0Var = i0Var.f10468n;
        if (s0Var == null) {
            s0Var = i2.s0.f7158d;
        }
        i2.s0 s0Var2 = s0Var;
        k2.e eVar = i0Var.f10470p;
        if (eVar == null) {
            eVar = k2.g.f8922a;
        }
        k2.e eVar2 = eVar;
        try {
            i2.q qVarB = oVar.b();
            x3.n nVar = x3.n.f16422a;
            try {
                if (qVarB == null) {
                    long jA = oVar != nVar ? oVar.a() : i2.t.f7162b;
                    sVar2 = sVar;
                    try {
                        qVar.i(sVar2, jA, s0Var2, lVar2, eVar2);
                        if (z10) {
                            sVar2.q();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        if (!z10) {
                            throw th2;
                        }
                        sVar2.q();
                        throw th2;
                    }
                }
                float fC = oVar != nVar ? oVar.c() : 1.0f;
                sVar2 = sVar;
                try {
                    qVar.j(sVar2, qVarB, fC, s0Var2, lVar2, eVar2);
                    sVar2 = sVar2;
                    if (z10) {
                        sVar2.q();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z10) {
                        throw th2;
                    }
                    sVar2.q();
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                sVar2 = sVar;
            }
        } catch (Throwable th6) {
            th = th6;
            sVar2 = sVar;
        }
        if (!z10) {
            throw th2;
        }
        sVar2.q();
        throw th2;
    }

    public static final p0 i(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        q3.h hVar = (q3.h) g0Var.k(o1.f2737k);
        y3.c cVar = (y3.c) g0Var.k(o1.f2734h);
        y3.m mVar = (y3.m) g0Var.k(o1.f2738n);
        boolean zG = g0Var.g(hVar) | g0Var.g(cVar) | g0Var.e(mVar.ordinal()) | g0Var.e(8);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            objN = new p0(hVar, cVar, mVar, 8);
            g0Var.n0(objN);
        }
        return (p0) objN;
    }

    public static final r0 j(r0 r0Var, y3.m mVar) throws NoWhenBranchMatchedException {
        long j9;
        x3.q qVar;
        int i10;
        int i11;
        x3.s sVar;
        i0 i0Var = r0Var.f10522a;
        x3.o oVar = j0.f10474d;
        x3.o oVar2 = i0Var.f10457a;
        if (oVar2.equals(x3.n.f16422a)) {
            oVar2 = j0.f10474d;
        }
        x3.o oVar3 = oVar2;
        long j10 = i0Var.f10458b;
        y3.p[] pVarArr = y3.o.f16598b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = j0.f10471a;
        }
        long j11 = j10;
        q3.u uVar = i0Var.f10459c;
        if (uVar == null) {
            uVar = q3.u.J;
        }
        q3.u uVar2 = uVar;
        q3.o oVar4 = i0Var.f10460d;
        q3.o oVar5 = new q3.o(oVar4 != null ? oVar4.f12746a : 0);
        q3.p pVar = i0Var.f10461e;
        q3.p pVar2 = new q3.p(pVar != null ? pVar.f12747a : 65535);
        q3.i iVar = i0Var.f10462f;
        if (iVar == null) {
            iVar = q3.i.A;
        }
        q3.i iVar2 = iVar;
        String str = i0Var.f10463g;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        String str2 = str;
        long j12 = i0Var.f10464h;
        if ((j12 & 1095216660480L) == 0) {
            j12 = j0.f10472b;
        }
        long j13 = j12;
        x3.a aVar = i0Var.f10465i;
        float f3 = aVar != null ? aVar.f16399a : 0.0f;
        x3.a aVar2 = new x3.a(Float.isNaN(f3) ? 0.0f : f3);
        x3.p pVar3 = i0Var.f10466j;
        if (pVar3 == null) {
            pVar3 = x3.p.f16423c;
        }
        x3.p pVar4 = pVar3;
        t3.b bVarQ = i0Var.f10467k;
        if (bVarQ == null) {
            t3.b bVar = t3.b.C;
            bVarQ = t3.c.f14353a.q();
        }
        t3.b bVar2 = bVarQ;
        long j14 = i0Var.l;
        if (j14 == 16) {
            j14 = j0.f10473c;
        }
        long j15 = j14;
        x3.l lVar = i0Var.m;
        if (lVar == null) {
            lVar = x3.l.f16417b;
        }
        x3.l lVar2 = lVar;
        i2.s0 s0Var = i0Var.f10468n;
        if (s0Var == null) {
            s0Var = i2.s0.f7158d;
        }
        i2.s0 s0Var2 = s0Var;
        y yVar = i0Var.f10469o;
        k2.e eVar = i0Var.f10470p;
        if (eVar == null) {
            eVar = k2.g.f8922a;
        }
        i0 i0Var2 = new i0(oVar3, j11, uVar2, oVar5, pVar2, iVar2, str2, j13, aVar2, pVar4, bVar2, j15, lVar2, s0Var2, yVar, eVar);
        v vVar = r0Var.f10523b;
        int i12 = w.f10547b;
        int i13 = vVar.f10537a;
        int i14 = 5;
        if (i13 == 0) {
            i13 = 5;
        }
        int i15 = vVar.f10538b;
        if (i15 != 3) {
            if (i15 == 0) {
                int iOrdinal = mVar.ordinal();
                if (iOrdinal == 0) {
                    i15 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = 2;
                }
            }
            j9 = vVar.f10539c;
            if ((j9 & 1095216660480L) == 0) {
                j9 = w.f10546a;
            }
            qVar = vVar.f10540d;
            if (qVar == null) {
                qVar = x3.q.f16426c;
            }
            long j16 = j9;
            x xVar = vVar.f10541e;
            x3.i iVar3 = vVar.f10542f;
            i10 = vVar.f10543g;
            if (i10 == 0) {
                i10 = x3.e.f16404b;
            }
            i11 = vVar.f10544h;
            if (i11 == 0) {
                i11 = 1;
            }
            sVar = vVar.f10545i;
            if (sVar == null) {
                sVar = x3.s.f16430c;
            }
            return new r0(i0Var2, new v(i13, i15, j16, qVar, xVar, iVar3, i10, i11, sVar), r0Var.f10524c);
        }
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i14 = 4;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        i15 = i14;
        j9 = vVar.f10539c;
        if ((j9 & 1095216660480L) == 0) {
            j9 = w.f10546a;
        }
        qVar = vVar.f10540d;
        if (qVar == null) {
            qVar = x3.q.f16426c;
        }
        long j17 = j9;
        x xVar2 = vVar.f10541e;
        x3.i iVar4 = vVar.f10542f;
        i10 = vVar.f10543g;
        if (i10 == 0) {
            i10 = x3.e.f16404b;
        }
        i11 = vVar.f10544h;
        if (i11 == 0) {
            i11 = 1;
        }
        sVar = vVar.f10545i;
        if (sVar == null) {
            sVar = x3.s.f16430c;
        }
        return new r0(i0Var2, new v(i13, i15, j17, qVar, xVar2, iVar4, i10, i11, sVar), r0Var.f10524c);
    }

    public static final String k(long j9, CharSequence charSequence) {
        return charSequence.subSequence(q0.g(j9), q0.f(j9)).toString();
    }
}
