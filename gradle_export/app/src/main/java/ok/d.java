package ok;

import h00.q;
import i2.i0;
import i2.j0;
import i2.l0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public class d extends p0.a {

    public final b f12135e;

    public d(p0.b bVar, p0.b bVar2, p0.b bVar3, p0.b bVar4, b bVar5) {
        super(bVar, bVar2, bVar3, bVar4);
        m.e(bVar, "topStart");
        m.e(bVar2, "topEnd");
        m.e(bVar3, "bottomEnd");
        m.e(bVar4, "bottomStart");
        m.e(bVar5, "continuity");
        this.f12135e = bVar5;
    }

    @Override
    public final p0.a b(p0.b bVar, p0.b bVar2, p0.b bVar3, p0.b bVar4) {
        m.e(bVar, "topStart");
        m.e(bVar2, "topEnd");
        m.e(bVar3, "bottomEnd");
        m.e(bVar4, "bottomStart");
        return new d(bVar, bVar2, bVar3, bVar4, e());
    }

    @Override
    public l0 d(long j9, float f3, float f10, float f11, float f12, y3.m mVar) {
        c7.c cVar;
        double d3;
        m.e(mVar, "layoutDirection");
        if (f3 + f10 + f11 + f12 == 0.0f) {
            return new j0(bi.b.g(0L, j9));
        }
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (4294967295L & j9);
        float fMin = Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)) * 0.5f;
        y3.m mVar2 = y3.m.A;
        float f13 = mVar == mVar2 ? f3 : f10;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > fMin) {
            f13 = fMin;
        }
        float f14 = mVar == mVar2 ? f10 : f3;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > fMin) {
            f14 = fMin;
        }
        float f15 = mVar == mVar2 ? f11 : f12;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > fMin) {
            f15 = fMin;
        }
        float f16 = mVar == mVar2 ? f12 : f11;
        float f17 = f16 >= 0.0f ? f16 : 0.0f;
        if (f17 <= fMin) {
            fMin = f17;
        }
        pk.a aVar = (pk.a) e();
        aVar.getClass();
        if ((f13 + f14 == Float.intBitsToFloat(i10) || f13 + fMin == Float.intBitsToFloat(i11)) && f13 == f14 && f15 == fMin && f13 == f15) {
            return aVar.a(j9);
        }
        double dIntBitsToFloat = Float.intBitsToFloat(i10);
        double dIntBitsToFloat2 = Float.intBitsToFloat(i11);
        double d5 = f13;
        double d10 = f14;
        double d11 = f15;
        double d12 = fMin;
        double d13 = dIntBitsToFloat * 0.5d;
        double d14 = dIntBitsToFloat2 * 0.5d;
        pk.b bVar = aVar.f12544b;
        double d15 = bVar.f12548a;
        double d16 = ((d14 / d5) - 1.0d) / d15;
        if (d16 < 0.0d) {
            d16 = 0.0d;
        }
        double d17 = d16 > 1.0d ? 1.0d : d16;
        double d18 = ((d13 / d5) - 1.0d) / d15;
        if (d18 < 0.0d) {
            d18 = 0.0d;
        }
        double d19 = d18 > 1.0d ? 1.0d : d18;
        double d20 = ((d13 / d10) - 1.0d) / d15;
        if (d20 < 0.0d) {
            d20 = 0.0d;
        }
        double d21 = d20 > 1.0d ? 1.0d : d20;
        double d22 = ((d14 / d10) - 1.0d) / d15;
        if (d22 < 0.0d) {
            d22 = 0.0d;
        }
        double d23 = d22 > 1.0d ? 1.0d : d22;
        double d24 = ((d14 / d11) - 1.0d) / d15;
        if (d24 < 0.0d) {
            d24 = 0.0d;
        }
        double d25 = d24 > 1.0d ? 1.0d : d24;
        double d26 = ((d13 / d11) - 1.0d) / d15;
        if (d26 < 0.0d) {
            d26 = 0.0d;
        }
        double d27 = d26 > 1.0d ? 1.0d : d26;
        double d28 = ((d13 / d12) - 1.0d) / d15;
        if (d28 < 0.0d) {
            d28 = 0.0d;
        }
        double d29 = d28 > 1.0d ? 1.0d : d28;
        double d30 = ((d14 / d12) - 1.0d) / d15;
        if (d30 < 0.0d) {
            d30 = 0.0d;
        }
        double d31 = d30 > 1.0d ? 1.0d : d30;
        double dMin = Math.min(d17, d19);
        double dMin2 = Math.min(d21, d23);
        double dMin3 = Math.min(d25, d27);
        double d32 = d21;
        double d33 = d31;
        double dMin4 = Math.min(d29, d33);
        pk.b bVar2 = aVar.f12545c;
        double d34 = d19;
        double d35 = bVar2.f12548a;
        double d36 = d15 - d35;
        double d37 = (d36 * dMin) + d35;
        double d38 = (d36 * dMin2) + d35;
        double d39 = (d36 * dMin3) + d35;
        double d40 = (d36 * dMin4) + d35;
        double d41 = d37 * d17;
        double d42 = d37 * d34;
        double d43 = d38 * d32;
        double d44 = d38 * d23;
        double d45 = d39 * d25;
        double d46 = d39 * d27;
        double d47 = d40 * d29;
        double d48 = d40 * d33;
        double d49 = d29;
        double d50 = -d5;
        double d51 = d50 * d41;
        double d52 = d50 * d42;
        double d53 = -d10;
        double d54 = d53 * d43;
        double d55 = d53 * d44;
        double d56 = -d11;
        double d57 = d56 * d45;
        double d58 = d56 * d46;
        double d59 = -d12;
        double d60 = d59 * d47;
        double d61 = d59 * d48;
        double d62 = bVar2.f12550c;
        double d63 = bVar.f12550c - d62;
        double d64 = (d17 * d63) + d62;
        double d65 = (d63 * d34) + d62;
        double d66 = (d32 * d63) + d62;
        double d67 = (d23 * d63) + d62;
        double d68 = (d25 * d63) + d62;
        double d69 = (d27 * d63) + d62;
        double d70 = (d49 * d63) + d62;
        double d71 = (d63 * d33) + d62;
        double d72 = bVar2.f12549b;
        double d73 = bVar.f12549b - d72;
        double d74 = (d73 * dMin) + d72;
        double d75 = (d73 * dMin2) + d72;
        double d76 = (d73 * dMin3) + d72;
        double d77 = (d73 * dMin4) + d72;
        double d78 = bVar.f12551d - 1.0d;
        double d79 = (dMin * d78) + 1.0d;
        double d80 = (dMin2 * d78) + 1.0d;
        double d81 = (dMin3 * d78) + 1.0d;
        double d82 = (d78 * dMin4) + 1.0d;
        qk.a aVarB = aVar.b(new pk.b(d41, d74, d64, d79));
        qk.a aVarB2 = aVar.b(new pk.b(d42, d74, d65, d79));
        qk.a aVarB3 = aVar.b(new pk.b(d43, d75, d66, d80));
        qk.a aVarB4 = aVar.b(new pk.b(d44, d75, d67, d80));
        qk.a aVarB5 = aVar.b(new pk.b(d45, d76, d68, d81));
        qk.a aVarB6 = aVar.b(new pk.b(d46, d76, d69, d81));
        qk.a aVarB7 = aVar.b(new pk.b(d47, d77, d70, d82));
        qk.a aVarB8 = aVar.b(new pk.b(d48, d77, d71, d82));
        c7.c cVar2 = new c7.c(7);
        cVar2.m(d5 - d51);
        if (d5 > 0.0d) {
            qk.b bVar3 = aVarB.f13035b;
            d3 = 1.5707963267948966d;
            double d83 = (bVar3.f13040b * d5) + 0.0d;
            double d84 = d5 - (bVar3.f13039a * d5);
            qk.b bVar4 = aVarB.f13036c;
            double d85 = (bVar4.f13040b * d5) + 0.0d;
            double d86 = d5 - (bVar4.f13039a * d5);
            qk.b bVar5 = aVarB.f13037d;
            cVar2.f(d83, d84, d85, d86, (bVar5.f13040b * d5) + 0.0d, d5 - (bVar5.f13039a * d5));
            double d87 = 1.0d / d79;
            double d88 = ((1.0d - d74) * 1.5707963267948966d * 0.5d) + 3.141592653589793d;
            double d89 = d74 * 1.5707963267948966d;
            double d90 = (d89 * 0.5d) + d88;
            double d91 = 1.0d - d87;
            cVar2.a(new qk.b(d5 + (Math.cos(d90) * d5 * d91), d5 + (Math.sin(d90) * d5 * d91)), d5 * d87, d88, d89);
            qk.b bVar6 = aVarB2.f13036c;
            double d92 = d5 - (bVar6.f13039a * d5);
            double d93 = (bVar6.f13040b * d5) + 0.0d;
            qk.b bVar7 = aVarB2.f13035b;
            double d94 = d5 - (bVar7.f13039a * d5);
            double d95 = (bVar7.f13040b * d5) + 0.0d;
            qk.b bVar8 = aVarB2.f13034a;
            double d96 = bVar8.f13039a * d5;
            cVar2.f(d92, d93, d94, d95, d5 - (d96 < d52 ? d52 : d96), (bVar8.f13040b * d5) + 0.0d);
            cVar = cVar2;
        } else {
            cVar = cVar2;
            d3 = 1.5707963267948966d;
        }
        double d97 = dIntBitsToFloat - d10;
        cVar.l(d97 + d54, 0.0d);
        if (d10 > 0.0d) {
            qk.b bVar9 = aVarB3.f13035b;
            double d98 = (bVar9.f13039a * d10) + d97;
            double d99 = (bVar9.f13040b * d10) + 0.0d;
            qk.b bVar10 = aVarB3.f13036c;
            double d100 = (bVar10.f13039a * d10) + d97;
            double d101 = (bVar10.f13040b * d10) + 0.0d;
            qk.b bVar11 = aVarB3.f13037d;
            c7.c cVar3 = cVar;
            cVar3.f(d98, d99, d100, d101, (bVar11.f13039a * d10) + d97, (bVar11.f13040b * d10) + 0.0d);
            double d102 = 1.0d / d80;
            double d103 = (((1.0d - d77) * d3) * 0.5d) - 1.5707963267948966d;
            double d104 = d75 * d3;
            double d105 = (d104 * 0.5d) + d103;
            double d106 = 1.0d - d102;
            cVar3.a(new qk.b(d97 + (Math.cos(d105) * d10 * d106), d10 + (Math.sin(d105) * d10 * d106)), d10 * d102, d103, d104);
            qk.b bVar12 = aVarB4.f13036c;
            double d107 = dIntBitsToFloat - (bVar12.f13040b * d10);
            double d108 = d10 - (bVar12.f13039a * d10);
            qk.b bVar13 = aVarB4.f13035b;
            double d109 = dIntBitsToFloat - (bVar13.f13040b * d10);
            double d110 = d10 - (bVar13.f13039a * d10);
            qk.b bVar14 = aVarB4.f13034a;
            double d111 = dIntBitsToFloat - (bVar14.f13040b * d10);
            double d112 = bVar14.f13039a * d10;
            cVar3.f(d107, d108, d109, d110, d111, d10 - (d112 < d55 ? d55 : d112));
            cVar = cVar3;
        }
        double d113 = dIntBitsToFloat2 - d11;
        cVar.l(dIntBitsToFloat, d113 + d57);
        if (d11 > 0.0d) {
            qk.b bVar15 = aVarB5.f13035b;
            double d114 = dIntBitsToFloat - (bVar15.f13040b * d11);
            double d115 = (bVar15.f13039a * d11) + d113;
            qk.b bVar16 = aVarB5.f13036c;
            double d116 = dIntBitsToFloat - (bVar16.f13040b * d11);
            double d117 = (bVar16.f13039a * d11) + d113;
            qk.b bVar17 = aVarB5.f13037d;
            c7.c cVar4 = cVar;
            cVar4.f(d114, d115, d116, d117, dIntBitsToFloat - (bVar17.f13040b * d11), (bVar17.f13039a * d11) + d113);
            double d118 = dIntBitsToFloat - d11;
            double d119 = 1.0d / d81;
            double d120 = ((1.0d - d76) * d3 * 0.5d) + 0.0d;
            double d121 = d76 * d3;
            double d122 = (d121 * 0.5d) + d120;
            double dCos = Math.cos(d122);
            double dSin = Math.sin(d122) * d11;
            double d123 = 1.0d - d119;
            cVar4.a(new qk.b((dCos * d11 * d123) + d118, d113 + (dSin * d123)), d11 * d119, d120, d121);
            qk.b bVar18 = aVarB6.f13036c;
            double d124 = (bVar18.f13039a * d11) + d118;
            double d125 = dIntBitsToFloat2 - (bVar18.f13040b * d11);
            qk.b bVar19 = aVarB6.f13035b;
            double d126 = (bVar19.f13039a * d11) + d118;
            double d127 = dIntBitsToFloat2 - (bVar19.f13040b * d11);
            qk.b bVar20 = aVarB6.f13034a;
            double d128 = bVar20.f13039a * d11;
            cVar4.f(d124, d125, d126, d127, d118 + (d128 < d58 ? d58 : d128), dIntBitsToFloat2 - (bVar20.f13040b * d11));
            cVar = cVar4;
        }
        cVar.l(d12 - d60, dIntBitsToFloat2);
        if (d12 > 0.0d) {
            qk.b bVar21 = aVarB7.f13035b;
            double d129 = d12 - (bVar21.f13039a * d12);
            double d130 = dIntBitsToFloat2 - (bVar21.f13040b * d12);
            qk.b bVar22 = aVarB7.f13036c;
            double d131 = d12 - (bVar22.f13039a * d12);
            double d132 = dIntBitsToFloat2 - (bVar22.f13040b * d12);
            qk.b bVar23 = aVarB7.f13037d;
            c7.c cVar5 = cVar;
            cVar5.f(d129, d130, d131, d132, d12 - (bVar23.f13039a * d12), dIntBitsToFloat2 - (bVar23.f13040b * d12));
            double d133 = dIntBitsToFloat2 - d12;
            double d134 = 1.0d / d82;
            double d135 = ((1.0d - d77) * d3 * 0.5d) + d3;
            double d136 = d77 * d3;
            double d137 = (d136 * 0.5d) + d135;
            double d138 = 1.0d - d134;
            cVar5.a(new qk.b(d12 + (Math.cos(d137) * d12 * d138), (Math.sin(d137) * d12 * d138) + d133), d12 * d134, d135, d136);
            qk.b bVar24 = aVarB8.f13036c;
            double d139 = (bVar24.f13040b * d12) + 0.0d;
            double d140 = (bVar24.f13039a * d12) + d133;
            qk.b bVar25 = aVarB8.f13035b;
            double d141 = (bVar25.f13040b * d12) + 0.0d;
            double d142 = (bVar25.f13039a * d12) + d133;
            qk.b bVar26 = aVarB8.f13034a;
            double d143 = (bVar26.f13040b * d12) + 0.0d;
            double d144 = bVar26.f13039a * d12;
            cVar5.f(d139, d140, d141, d142, d143, d133 + (d144 < d61 ? d61 : d144));
            cVar = cVar5;
        }
        qk.b bVar27 = (qk.b) cVar.C;
        qk.b bVar28 = (qk.b) cVar.B;
        ((ArrayList) cVar.D).add(new rk.c(bVar27, bVar28));
        cVar.C = bVar28;
        return new i0(w00.a.J(q.n1((ArrayList) cVar.D)));
    }

    public b e() {
        return this.f12135e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f12239a, dVar.f12239a) && m.a(this.f12240b, dVar.f12240b) && m.a(this.f12241c, dVar.f12241c) && m.a(this.f12242d, dVar.f12242d) && m.a(e(), dVar.e());
    }

    public int hashCode() {
        return e().hashCode() + ((this.f12242d.hashCode() + ((this.f12241c.hashCode() + ((this.f12240b.hashCode() + (this.f12239a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ContinuousRoundedRectangle(topStart=" + this.f12239a + ", topEnd=" + this.f12240b + ", bottomEnd=" + this.f12241c + ", bottomStart=" + this.f12242d + ", continuity=" + e() + ")";
    }
}
