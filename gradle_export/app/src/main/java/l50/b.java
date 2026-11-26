package l50;

import ba.m;
import ca.p;
import com.google.android.gms.internal.measurement.z3;
import g00.k;
import h00.d0;
import h00.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import k50.c0;
import k50.f0;
import k50.z;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import r30.r;
import u00.n;

public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = z.B;
        z zVarI = gj.e.i("/", false);
        k[] kVarArr = {new k(zVarI, new g(zVarI))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.P(1));
        d0.W(linkedHashMap, kVarArr);
        for (g gVar : q.i1(arrayList, new m(10))) {
            if (((g) linkedHashMap.put(gVar.a, gVar)) == null) {
                while (true) {
                    z zVar = gVar.a;
                    z zVarC = zVar.c();
                    if (zVarC == null) {
                        break;
                    }
                    g gVar2 = (g) linkedHashMap.get(zVarC);
                    if (gVar2 != null) {
                        gVar2.h.add(zVar);
                        break;
                    }
                    g gVar3 = new g(zVarC);
                    linkedHashMap.put(zVarC, gVar3);
                    gVar3.h.add(zVar);
                    gVar = gVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i) {
        z3.r(16);
        String string = Integer.toString(i, 16);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final g d(c0 c0Var) throws IOException {
        Long lValueOf;
        int iL = c0Var.l();
        if (iL != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iL));
        }
        c0Var.skip(4L);
        short sV = c0Var.v();
        int i = sV & 65535;
        if ((sV & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int iV = c0Var.v() & 65535;
        short sV2 = c0Var.v();
        int i2 = sV2 & 65535;
        short sV3 = c0Var.v();
        int i3 = sV3 & 65535;
        if (i2 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i3 >> 9) & 127) + 1980, ((i3 >> 5) & 15) - 1, sV3 & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (sV2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = lValueOf;
        c0Var.l();
        y yVar = new y();
        yVar.A = ((long) c0Var.l()) & 4294967295L;
        y yVar2 = new y();
        yVar2.A = ((long) c0Var.l()) & 4294967295L;
        int iV2 = c0Var.v() & 65535;
        int iV3 = c0Var.v() & 65535;
        int iV4 = c0Var.v() & 65535;
        c0Var.skip(8L);
        y yVar3 = new y();
        yVar3.A = ((long) c0Var.l()) & 4294967295L;
        String strX = c0Var.x(iV2);
        if (r30.k.B0(strX, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = yVar2.A == 4294967295L ? 8 : 0L;
        if (yVar.A == 4294967295L) {
            j += (long) 8;
        }
        if (yVar3.A == 4294967295L) {
            j += (long) 8;
        }
        v vVar = new v();
        e(c0Var, iV3, new h(vVar, j, yVar2, c0Var, yVar, yVar3));
        if (j > 0 && !vVar.A) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strX2 = c0Var.x(iV4);
        String str = z.B;
        return new g(gj.e.i("/", false).e(strX), r.p0(strX, "/", false), strX2, yVar.A, yVar2.A, iV, l, yVar3.A);
    }

    public static final void e(c0 c0Var, int i, n nVar) throws IOException {
        k50.i iVar = c0Var.B;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iV = c0Var.v() & 65535;
            long jV = ((long) c0Var.v()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jV) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c0Var.e0(jV);
            long j3 = iVar.B;
            nVar.invoke(Integer.valueOf(iV), Long.valueOf(jV));
            long j4 = (iVar.B + jV) - j3;
            if (j4 < 0) {
                throw new IOException(g4.c.f(iV, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                iVar.skip(j4);
            }
            j = j2 - jV;
        }
    }

    public static final p f(c0 c0Var, p pVar) throws IOException {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.A = pVar != null ? (Long) pVar.g : null;
        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
        kotlin.jvm.internal.z zVar3 = new kotlin.jvm.internal.z();
        int iL = c0Var.l();
        if (iL != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iL));
        }
        c0Var.skip(2L);
        short sV = c0Var.v();
        int i = sV & 65535;
        if ((sV & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        c0Var.skip(18L);
        long jV = ((long) c0Var.v()) & 65535;
        int iV = 65535 & c0Var.v();
        c0Var.skip(jV);
        if (pVar == null) {
            c0Var.skip(iV);
            return null;
        }
        e(c0Var, iV, new i(c0Var, zVar, zVar2, zVar3, 0));
        return new p(pVar.b, pVar.c, (z) null, (Long) pVar.e, (Long) zVar3.A, (Long) zVar.A, (Long) zVar2.A);
    }

    public static final int g(f0 f0Var, int i) {
        int i2;
        int[] iArr = f0Var.F;
        int i3 = i + 1;
        int length = f0Var.E.length;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
