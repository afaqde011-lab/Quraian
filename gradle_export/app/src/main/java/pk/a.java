package pk;

import c7.c;
import c7.i;
import h00.q;
import i2.i0;
import i2.k0;
import i2.l0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class a implements ok.b {

    public final b f12544b = b.f12546f;

    public final b f12545c = b.f12547g;

    public final l0 a(long j9) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i10) > Float.intBitsToFloat(i11)) {
            double dIntBitsToFloat = Float.intBitsToFloat(i10);
            double dIntBitsToFloat2 = Float.intBitsToFloat(i11);
            double d3 = dIntBitsToFloat2 * 0.5d;
            b bVar = this.f12545c;
            double d5 = bVar.f12548a;
            double d10 = (((dIntBitsToFloat * 0.5d) / d3) - 1.0d) / d5;
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            if (d10 > 1.0d) {
                d10 = 1.0d;
            }
            double d11 = d5 * d10;
            double d12 = (-d3) * d11;
            double d13 = bVar.f12550c;
            double d14 = ((this.f12544b.f12550c - d13) * d10) + d13;
            double d15 = bVar.f12549b;
            qk.a aVarB = b(new b(d11, d15, d14, 1.0d));
            qk.b bVarA = aVarB.f13034a.a(d3);
            double d16 = bVarA.f13039a;
            qk.b bVarA2 = aVarB.f13035b.a(d3);
            qk.b bVarA3 = aVarB.f13036c.a(d3);
            qk.b bVarA4 = aVarB.f13037d.a(d3);
            double d17 = bVarA4.f13039a;
            double d18 = d15 * 1.5707963267948966d;
            double d19 = (1.5707963267948966d - d18) * 0.5d;
            double d20 = (d19 + d18) * 2.0d;
            c cVar = new c(7);
            cVar.m(d3);
            cVar.a(new qk.b(d3, d3), d3, d19 + 1.5707963267948966d, d20);
            double d21 = bVarA3.f13039a;
            double d22 = bVarA3.f13040b;
            double d23 = d3 - d21;
            double d24 = d22 + 0.0d;
            double d25 = bVarA2.f13039a;
            double d26 = bVarA2.f13040b;
            double d27 = d3 - d25;
            double d28 = d26 + 0.0d;
            double d29 = bVarA.f13040b;
            cVar.f(d23, d24, d27, d28, d3 - (d16 < d12 ? d12 : d16), d29 + 0.0d);
            double d30 = dIntBitsToFloat - d3;
            cVar.l(d30 + d12, 0.0d);
            double d31 = d30 + d25;
            double d32 = d30 + d21;
            double d33 = bVarA4.f13040b;
            cVar.f(d31, d28, d32, d24, d30 + d17, d33 + 0.0d);
            cVar.a(new qk.b(d30, d3), d3, -(1.5707963267948966d - d19), d20);
            double d34 = dIntBitsToFloat2 - d22;
            double d35 = dIntBitsToFloat2 - d26;
            if (d16 < d12) {
                d16 = d12;
            }
            cVar.f(d32, d34, d31, d35, d30 + d16, dIntBitsToFloat2 - d29);
            cVar.l(d3 - d12, dIntBitsToFloat2);
            cVar.f(d27, d35, d23, d34, d3 - d17, dIntBitsToFloat2 - d33);
            return new i0(w00.a.J(q.n1((ArrayList) cVar.D)));
        }
        double d36 = 1.0d;
        if (Float.intBitsToFloat(i10) >= Float.intBitsToFloat(i11)) {
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            float f3 = fIntBitsToFloat * 0.5f;
            return new k0(i.c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat, f3, f3));
        }
        double dIntBitsToFloat3 = Float.intBitsToFloat(i10);
        double dIntBitsToFloat4 = Float.intBitsToFloat(i11);
        double d37 = dIntBitsToFloat3 * 0.5d;
        b bVar2 = this.f12545c;
        double d38 = bVar2.f12548a;
        double d39 = (((dIntBitsToFloat4 * 0.5d) / d37) - 1.0d) / d38;
        if (d39 < 0.0d) {
            d39 = 0.0d;
        }
        if (d39 <= 1.0d) {
            d36 = d39;
        }
        double d40 = d38 * d36;
        double d41 = (-d37) * d40;
        double d42 = bVar2.f12550c;
        double d43 = ((this.f12544b.f12550c - d42) * d36) + d42;
        double d44 = bVar2.f12549b;
        qk.a aVarB2 = b(new b(d40, d44, d43, 1.0d));
        qk.b bVarA5 = aVarB2.f13034a.a(d37);
        double d45 = bVarA5.f13040b;
        qk.b bVarA6 = aVarB2.f13035b.a(d37);
        qk.b bVarA7 = aVarB2.f13036c.a(d37);
        qk.b bVarA8 = aVarB2.f13037d.a(d37);
        double d46 = bVarA8.f13040b;
        double d47 = d44 * 1.5707963267948966d;
        double d48 = (1.5707963267948966d - d47) * 0.5d;
        double d49 = (d48 + d47) * 2.0d;
        c cVar2 = new c(7);
        cVar2.m(d37 - d41);
        double d50 = bVarA6.f13040b;
        double d51 = bVarA6.f13039a;
        double d52 = d50 + 0.0d;
        double d53 = d37 - d51;
        double d54 = bVarA7.f13040b;
        double d55 = bVarA7.f13039a;
        double d56 = d54 + 0.0d;
        double d57 = d37 - d55;
        double d58 = bVarA8.f13039a;
        cVar2.f(d52, d53, d56, d57, d46 + 0.0d, d37 - d58);
        cVar2.a(new qk.b(d37, d37), d37, -(3.141592653589793d - d48), d49);
        double d59 = dIntBitsToFloat3 - d54;
        double d60 = dIntBitsToFloat3 - d50;
        double d61 = bVarA5.f13039a;
        cVar2.f(d59, d57, d60, d53, dIntBitsToFloat3 - d45, d37 - (d61 < d41 ? d41 : d61));
        double d62 = dIntBitsToFloat4 - d37;
        cVar2.l(dIntBitsToFloat3, d62 + d41);
        double d63 = d62 + d51;
        double d64 = d62 + d55;
        cVar2.f(d60, d63, d59, d64, dIntBitsToFloat3 - d46, d62 + d58);
        cVar2.a(new qk.b(dIntBitsToFloat3 - d37, d62), d37, d48, d49);
        double d65 = d45 + 0.0d;
        if (d61 >= d41) {
            d41 = d61;
        }
        cVar2.f(d56, d64, d52, d63, d65, d62 + d41);
        qk.b bVar3 = (qk.b) cVar2.C;
        qk.b bVar4 = (qk.b) cVar2.B;
        ((ArrayList) cVar2.D).add(new rk.c(bVar3, bVar4));
        cVar2.C = bVar4;
        return new i0(w00.a.J(q.n1((ArrayList) cVar2.D)));
    }

    public final qk.a b(b bVar) {
        b bVar2 = this.f12544b;
        if (bVar.equals(bVar2)) {
            return bVar2.a();
        }
        b bVar3 = this.f12545c;
        return bVar.equals(bVar3) ? bVar3.a() : bVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f12544b, aVar.f12544b) && m.a(this.f12545c, aVar.f12545c);
    }

    public final int hashCode() {
        return this.f12545c.hashCode() + (this.f12544b.hashCode() * 31);
    }

    public final String toString() {
        return "G2Continuity(profile=" + this.f12544b + ", capsuleProfile=" + this.f12545c + ")";
    }
}
