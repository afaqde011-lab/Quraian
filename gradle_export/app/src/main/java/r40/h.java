package r40;

import com.google.android.gms.internal.measurement.b5;
import g00.z;

public final class h extends p30.f {
    public final a20.g b;
    public final ce.c c;

    public h(a20.g gVar, q40.c json) {
        kotlin.jvm.internal.m.e(json, "json");
        this.b = gVar;
        this.c = json.b;
    }

    @Override
    public final byte B() {
        g00.r rVar;
        a20.g gVar = this.b;
        String strQ = gVar.q();
        try {
            kotlin.jvm.internal.m.e(strQ, "<this>");
            g00.u uVarP = b5.P(strQ);
            if (uVarP != null) {
                int i = uVarP.A;
                rVar = Integer.compareUnsigned(i, 255) > 0 ? null : new g00.r((byte) i);
            }
            if (rVar != null) {
                return rVar.A;
            }
            r30.r.r0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'UByte' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override
    public final short C() {
        z zVar;
        a20.g gVar = this.b;
        String strQ = gVar.q();
        try {
            kotlin.jvm.internal.m.e(strQ, "<this>");
            g00.u uVarP = b5.P(strQ);
            if (uVarP != null) {
                int i = uVarP.A;
                zVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new z((short) i);
            }
            if (zVar != null) {
                return zVar.A;
            }
            r30.r.r0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'UShort' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override
    public final ce.c b() {
        return this.c;
    }

    @Override
    public final int l(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final int n() {
        a20.g gVar = this.b;
        String strQ = gVar.q();
        try {
            kotlin.jvm.internal.m.e(strQ, "<this>");
            g00.u uVarP = b5.P(strQ);
            if (uVarP != null) {
                return uVarP.A;
            }
            r30.r.r0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'UInt' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override
    public final long u() {
        a20.g gVar = this.b;
        String strQ = gVar.q();
        try {
            kotlin.jvm.internal.m.e(strQ, "<this>");
            g00.w wVarQ = b5.Q(strQ);
            if (wVarQ != null) {
                return wVarQ.A;
            }
            r30.r.r0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a20.g.u(gVar, oi.k.g('\'', "Failed to parse type 'ULong' for input '", strQ), 0, null, 6);
            throw null;
        }
    }
}
