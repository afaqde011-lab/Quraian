package a1;

import android.graphics.Path;

public final class p0 implements u00.k {
    public final int A;
    public final int B;
    public final int C;
    public final Object D;

    public p0(int i10, int i11, n0 n0Var, int i12) {
        this.A = i12;
        this.B = i10;
        this.C = i11;
        this.D = n0Var;
    }

    public p0(Object obj, int i10, int i11, int i12) {
        this.A = i12;
        this.D = obj;
        this.B = i10;
        this.C = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                n0 n0Var = (n0) this.D;
                z0.a aVar = (z0.a) obj;
                long jD = n0Var.d(m3.h0.b(0, aVar.B.length()));
                int iG = m3.q0.g(jD);
                int iF = m3.q0.f(jD);
                int i10 = this.B;
                if (i10 >= iG) {
                    iG = i10;
                }
                if (iG <= iF) {
                    iF = iG;
                }
                int iG2 = m3.q0.g(jD);
                int iF2 = m3.q0.f(jD);
                int i11 = this.C;
                if (i11 >= iG2) {
                    iG2 = i11;
                }
                if (iG2 <= iF2) {
                    iF2 = iG2;
                }
                aVar.f(n0Var.b(m3.h0.b(iF, iF2)));
                break;
            case 1:
                n0 n0Var2 = (n0) this.D;
                z0.a aVar2 = (z0.a) obj;
                int i12 = this.B;
                int i13 = this.C;
                if (i12 < 0 || i13 < 0) {
                    g0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i13 + " respectively.");
                }
                long jD2 = n0Var2.d(aVar2.D);
                int iF3 = m3.q0.f(jD2);
                int iA = iF3 + i13;
                if (((i13 ^ iA) & (iF3 ^ iA)) < 0) {
                    iA = n0Var2.a();
                }
                long jB = n0Var2.b(m3.h0.b(m3.q0.f(jD2), Math.min(iA, n0Var2.a())));
                x0.u(aVar2, m3.q0.g(jB), m3.q0.f(jB));
                int iG3 = m3.q0.g(jD2);
                int i14 = iG3 - i12;
                if (((iG3 ^ i14) & (i12 ^ iG3)) < 0) {
                    i14 = 0;
                }
                long jB2 = n0Var2.b(m3.h0.b(Math.max(0, i14), m3.q0.g(jD2)));
                x0.u(aVar2, m3.q0.g(jB2), m3.q0.f(jB2));
                break;
            case 2:
                n0 n0Var3 = (n0) this.D;
                z0.a aVar3 = (z0.a) obj;
                m3.q0 q0Var = aVar3.E;
                d1 d1Var = aVar3.B;
                if (q0Var != null) {
                    aVar3.e(null);
                }
                int i15 = this.B;
                if (i15 < 0) {
                    i15 = 0;
                }
                int i16 = this.C;
                if (i16 < 0) {
                    i16 = 0;
                }
                long jB3 = n0Var3.b(m3.h0.b(i15, i16));
                int iY = ab.a0.y(m3.q0.g(jB3), 0, d1Var.length());
                int iY2 = ab.a0.y(m3.q0.f(jB3), 0, d1Var.length());
                if (iY != iY2) {
                    if (iY < iY2) {
                        aVar3.d(iY, iY2, null);
                    } else {
                        aVar3.d(iY2, iY, null);
                    }
                }
                return g00.b0.a;
            default:
                i2.g gVar = (i2.g) this.D;
                m3.s sVar = (m3.s) obj;
                m3.b bVar = sVar.f10525a;
                int iD = sVar.d(this.B);
                int iD2 = sVar.d(this.C);
                CharSequence charSequence = bVar.f10417e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbP = oi.k.p(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbP.append(charSequence.length());
                    sbP.append("], or start > end!");
                    s3.a.a(sbP.toString());
                }
                Path path = new Path();
                n3.i iVar = bVar.f10416d;
                iVar.f11043f.getSelectionPath(iD, iD2, path);
                int i17 = iVar.f11045h;
                if (i17 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i17);
                }
                i2.g gVar2 = new i2.g(path);
                gVar2.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sVar.f10530f)) & 4294967295L));
                i2.g.a(gVar, gVar2);
                break;
        }
        return g00.b0.a;
    }
}
