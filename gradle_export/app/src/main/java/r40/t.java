package r40;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import l1.q1;
import qd.j0;

public final class t extends p30.f implements q40.j {
    public final q40.c b;
    public final x c;
    public final a20.g d;
    public final ce.c e;
    public int f;
    public eh.l g;
    public final q1 h;
    public final i i;

    public t(q40.c cVar, x xVar, a20.g gVar, n40.e descriptor, eh.l lVar) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.b = cVar;
        this.c = xVar;
        this.d = gVar;
        this.e = cVar.b;
        this.f = -1;
        this.g = lVar;
        q1 q1Var = cVar.a;
        this.h = q1Var;
        this.i = q1Var.c ? null : new i(descriptor);
    }

    @Override
    public final byte B() {
        a20.g gVar = this.d;
        long jO = gVar.o();
        byte b = (byte) jO;
        if (jO == b) {
            return b;
        }
        a20.g.u(gVar, "Failed to parse byte for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override
    public final short C() {
        a20.g gVar = this.d;
        long jO = gVar.o();
        short s = (short) jO;
        if (jO == s) {
            return s;
        }
        a20.g.u(gVar, "Failed to parse short for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override
    public final float D() {
        a20.g gVar = this.d;
        String strQ = gVar.q();
        try {
            float f = Float.parseFloat(strQ);
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            j.q(gVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'float' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override
    public final double E() {
        a20.g gVar = this.d;
        String strQ = gVar.q();
        try {
            double d = Double.parseDouble(strQ);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            j.q(gVar, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'double' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override
    public final void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (this.b.a.b && descriptor.e() == 0) {
            while (l(descriptor) != -1) {
            }
        }
        a20.g gVar = this.d;
        if (gVar.J()) {
            j.l(gVar, "");
            throw null;
        }
        gVar.n(this.c.B);
        c50.h hVar = (c50.h) gVar.C;
        int i = hVar.B;
        int[] iArr = (int[]) hVar.D;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            hVar.B = i - 1;
        }
        int i2 = hVar.B;
        if (i2 != -1) {
            hVar.B = i2 - 1;
        }
    }

    @Override
    public final ce.c b() {
        return this.e;
    }

    @Override
    public final o40.a c(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        q40.c cVar = this.b;
        x xVarP = j.p(descriptor, cVar);
        a20.g gVar = this.d;
        c50.h hVar = (c50.h) gVar.C;
        int i = hVar.B + 1;
        hVar.B = i;
        Object[] objArr = (Object[]) hVar.C;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            hVar.C = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) hVar.D, i2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            hVar.D = iArrCopyOf;
        }
        ((Object[]) hVar.C)[i] = descriptor;
        gVar.n(xVarP.A);
        if (gVar.F() == 4) {
            a20.g.u(gVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = xVarP.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new t(cVar, xVarP, gVar, descriptor, this.g);
        }
        return (this.c == xVarP && cVar.a.c) ? this : new t(cVar, xVarP, gVar, descriptor, this.g);
    }

    @Override
    public final int d(n40.e enumDescriptor) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        a20.g gVar = this.d;
        return j.k(enumDescriptor, this.b, gVar.p(), " at path ".concat(((c50.h) gVar.C).n()));
    }

    @Override
    public final boolean e() {
        boolean z;
        boolean z2;
        a20.g gVar = this.d;
        int I = gVar.I();
        String str = (String) gVar.F;
        if (I == str.length()) {
            a20.g.u(gVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(I) == '\"') {
            I++;
            z = true;
        } else {
            z = false;
        }
        int iH = gVar.H(I);
        if (iH >= str.length() || iH == -1) {
            a20.g.u(gVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iH + 1;
        int iCharAt = str.charAt(iH) | ' ';
        if (iCharAt == 102) {
            gVar.j(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                a20.g.u(gVar, "Expected valid boolean literal prefix, but had '" + gVar.q() + '\'', 0, null, 6);
                throw null;
            }
            gVar.j(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (gVar.B == str.length()) {
            a20.g.u(gVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(gVar.B) == '\"') {
            gVar.B++;
            return z2;
        }
        a20.g.u(gVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override
    public final char f() {
        a20.g gVar = this.d;
        String strQ = gVar.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        a20.g.u(gVar, oi.k.g('\'', "Expected single char, but got '", strQ), 0, null, 6);
        throw null;
    }

    @Override
    public final Object j(l40.a deserializer) {
        String message;
        q40.c cVar = this.b;
        a20.g gVar = this.d;
        c50.h hVar = (c50.h) gVar.C;
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof l40.c)) {
                return deserializer.deserialize(this);
            }
            String strI = j.i(((l40.c) deserializer).getDescriptor(), cVar);
            String strE = gVar.E(strI);
            String strA = null;
            if (strE != null) {
                try {
                    l40.a aVarI = va.a.I((l40.c) deserializer, this, strE);
                    eh.l lVar = new eh.l(7);
                    lVar.B = strI;
                    this.g = lVar;
                    return aVarI.deserialize(this);
                } catch (SerializationException e) {
                    String message2 = e.getMessage();
                    kotlin.jvm.internal.m.b(message2);
                    String strS0 = r30.k.S0(r30.k.d1(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    kotlin.jvm.internal.m.b(message3);
                    a20.g.u(gVar, strS0, 0, r30.k.Z0('\n', message3, ""), 2);
                    throw null;
                }
            }
            if (!(deserializer instanceof l40.c)) {
                return deserializer.deserialize(this);
            }
            String strI2 = j.i(((l40.c) deserializer).getDescriptor(), cVar);
            q40.l lVarM = m();
            String strA2 = ((l40.c) deserializer).getDescriptor().a();
            if (!(lVarM instanceof q40.x)) {
                StringBuilder sb = new StringBuilder("Expected ");
                b0 b0Var = a0.a;
                sb.append(b0Var.b(q40.x.class).n());
                sb.append(", but had ");
                sb.append(b0Var.b(lVarM.getClass()).n());
                sb.append(" as the serialized body of ");
                sb.append(strA2);
                sb.append(" at element: ");
                sb.append(hVar.n());
                throw j.d(sb.toString(), lVarM.toString(), -1);
            }
            q40.x xVar = (q40.x) lVarM;
            q40.l lVar2 = (q40.l) xVar.get(strI2);
            if (lVar2 != null) {
                q40.b0 b0VarH = q40.m.h(lVar2);
                if (!(b0VarH instanceof q40.u)) {
                    strA = b0VarH.a();
                }
            }
            try {
                return j.o(cVar, strI2, xVar, va.a.I((l40.c) deserializer, this, strA));
            } catch (SerializationException e2) {
                String message4 = e2.getMessage();
                kotlin.jvm.internal.m.b(message4);
                throw j.d(message4, xVar.toString(), -1);
            }
            message = e.getMessage();
            kotlin.jvm.internal.m.b(message);
            if (r30.k.A0(message, "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.A, e.getMessage() + " at path: " + hVar.n(), e);
        } catch (MissingFieldException e3) {
            message = e3.getMessage();
            kotlin.jvm.internal.m.b(message);
            if (r30.k.A0(message, "at path", false)) {
                throw e3;
            }
            throw new MissingFieldException(e3.A, e3.getMessage() + " at path: " + hVar.n(), e3);
        }
    }

    @Override
    public final int l(n40.e descriptor) {
        a20.g gVar = this.d;
        c50.h hVar = (c50.h) gVar.C;
        String str = (String) gVar.F;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        x xVar = this.c;
        int iOrdinal = xVar.ordinal();
        char c = ':';
        int i = 0;
        zJ = false;
        boolean zJ = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zJ2 = gVar.J();
            while (true) {
                boolean zI = gVar.i();
                i iVar = this.i;
                if (zI) {
                    String strK = gVar.k();
                    gVar.n(c);
                    int iJ = j.j(descriptor, this.b, strK);
                    if (iJ != -3) {
                        if (iVar != null) {
                            p40.s sVar = iVar.a;
                            if (iJ < 64) {
                                sVar.c |= 1 << iJ;
                            } else {
                                int i3 = (iJ >>> 6) - 1;
                                long[] jArr = sVar.d;
                                jArr[i3] = jArr[i3] | (1 << (iJ & 63));
                            }
                        }
                        i2 = iJ;
                        break;
                    }
                    if (!this.h.b) {
                        eh.l lVar = this.g;
                        if (lVar == null || !kotlin.jvm.internal.m.a(lVar.B, strK)) {
                            gVar.t(oi.k.g('\'', "Encountered an unknown key '", strK), r30.k.N0(0, 6, str.subSequence(0, gVar.B).toString(), strK), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        lVar.B = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bF = gVar.F();
                    if (bF == 8 || bF == 6) {
                        while (true) {
                            byte bF2 = gVar.F();
                            if (bF2 == 1) {
                                gVar.k();
                            } else {
                                if (bF2 == 8 || bF2 == 6) {
                                    arrayList.add(Byte.valueOf(bF2));
                                } else if (bF2 == 9) {
                                    if (((Number) h00.q.T0(arrayList)).byteValue() != 8) {
                                        throw j.d("found ] instead of } at path: " + hVar, str, gVar.B);
                                    }
                                    h00.v.y0(arrayList);
                                } else if (bF2 == 7) {
                                    if (((Number) h00.q.T0(arrayList)).byteValue() != 6) {
                                        throw j.d("found } instead of ] at path: " + hVar, str, gVar.B);
                                    }
                                    h00.v.y0(arrayList);
                                } else if (bF2 == 10) {
                                    a20.g.u(gVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                gVar.l();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        gVar.q();
                    }
                    zJ2 = gVar.J();
                    c = ':';
                } else if (!zJ2) {
                    if (iVar == null) {
                        i2 = -1;
                        break;
                    }
                    p40.s sVar2 = iVar.a;
                    av.b bVar = sVar2.b;
                    n40.e eVar = sVar2.a;
                    int iE = eVar.e();
                    while (true) {
                        long j = sVar2.c;
                        if (j == -1) {
                            if (iE <= 64) {
                                i2 = -1;
                                break;
                            }
                            long[] jArr2 = sVar2.d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i >= length) {
                                    i2 = -1;
                                    break;
                                }
                                int i4 = i + 1;
                                int i5 = i4 * 64;
                                long j2 = jArr2[i];
                                while (true) {
                                    if (j2 != -1) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << iNumberOfTrailingZeros;
                                        int i6 = iNumberOfTrailingZeros + i5;
                                        if (((Boolean) bVar.invoke(eVar, Integer.valueOf(i6))).booleanValue()) {
                                            jArr2[i] = j2;
                                            i2 = i6;
                                            break;
                                        }
                                    } else {
                                        jArr2[i] = j2;
                                        i = i4;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            sVar2.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) bVar.invoke(eVar, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i2 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    j.l(gVar, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zJ3 = gVar.J();
            if (gVar.i()) {
                int i7 = this.f;
                if (i7 != -1 && !zJ3) {
                    a20.g.u(gVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.f = i2;
            } else if (zJ3) {
                j.l(gVar, "array");
                throw null;
            }
        } else {
            int i8 = this.f;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                gVar.n(':');
            } else if (i8 != -1) {
                zJ = gVar.J();
            }
            if (gVar.i()) {
                if (objArr != false) {
                    if (this.f == -1) {
                        int i9 = gVar.B;
                        if (zJ) {
                            a20.g.u(gVar, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else {
                        int i11 = gVar.B;
                        if (!zJ) {
                            a20.g.u(gVar, "Expected comma after the key-value pair", i11, null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.f + 1;
                this.f = i2;
            } else if (zJ) {
                j.l(gVar, "object");
                throw null;
            }
        }
        if (xVar != x.MAP) {
            ((int[]) hVar.D)[hVar.B] = i2;
        }
        return i2;
    }

    @Override
    public final q40.l m() {
        return new j0(this.b.a, this.d).l();
    }

    @Override
    public final int n() {
        a20.g gVar = this.d;
        long jO = gVar.o();
        int i = (int) jO;
        if (jO == i) {
            return i;
        }
        a20.g.u(gVar, "Failed to parse int for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override
    public final o40.c o(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return v.a(descriptor) ? new h(this.d, this.b) : this;
    }

    @Override
    public final String p() {
        return this.d.p();
    }

    @Override
    public final Object s(n40.e descriptor, int i, l40.a deserializer, Object obj) {
        c50.h hVar = (c50.h) this.d.C;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        boolean z = this.c == x.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) hVar.D;
            int i2 = hVar.B;
            if (iArr[i2] == -2) {
                ((Object[]) hVar.C)[i2] = k.a;
            }
        }
        Object objS = super.s(descriptor, i, deserializer, obj);
        if (z) {
            int[] iArr2 = (int[]) hVar.D;
            int i3 = hVar.B;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                hVar.B = i4;
                Object[] objArr = (Object[]) hVar.C;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    hVar.C = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) hVar.D, i5);
                    kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
                    hVar.D = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) hVar.C;
            int i6 = hVar.B;
            objArr2[i6] = objS;
            ((int[]) hVar.D)[i6] = -2;
        }
        return objS;
    }

    @Override
    public final long u() {
        return this.d.o();
    }

    @Override
    public final boolean w() {
        i iVar = this.i;
        if (!(iVar != null ? iVar.b : false)) {
            a20.g gVar = this.d;
            int iH = gVar.H(gVar.I());
            String str = (String) gVar.F;
            int length = str.length() - iH;
            boolean z = false;
            if (length >= 4 && iH != -1) {
                for (int i = 0; i < 4; i++) {
                    if ("null".charAt(i) == str.charAt(iH + i)) {
                    }
                }
                if (length <= 4 || j.g(str.charAt(iH + 4)) != 0) {
                    z = true;
                    gVar.B = iH + 4;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final q40.c y() {
        return this.b;
    }
}
