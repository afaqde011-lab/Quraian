package l0;

import java.util.Arrays;

public final class d0 {

    public y3.a f9722b;

    public int f9723c;

    public int f9724d;

    public int f9726f;

    public int f9727g;

    public final f0 f9728h;

    public z[] f9721a = q.f9783a;

    public int f9725e = 1;

    public d0(f0 f0Var) {
        this.f9728h = f0Var;
    }

    public static void b(d0 d0Var, p0 p0Var, a40.z zVar, i2.y yVar, int i10, int i11) {
        d0Var.f9728h.getClass();
        long j9 = p0Var.j(0);
        d0Var.a(p0Var, zVar, yVar, i10, i11, (int) (!p0Var.h() ? j9 & 4294967295L : j9 >> 32));
    }

    public final void a(p0 p0Var, a40.z zVar, i2.y yVar, int i10, int i11, int i12) {
        z[] zVarArr = this.f9721a;
        int length = zVarArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                this.f9726f = i10;
                this.f9727g = i11;
                break;
            } else {
                z zVar2 = zVarArr[i13];
                if (zVar2 != null && zVar2.f9814g) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int length2 = this.f9721a.length;
        for (int iA = p0Var.a(); iA < length2; iA++) {
            z zVar3 = this.f9721a[iA];
            if (zVar3 != null) {
                zVar3.c();
            }
        }
        if (this.f9721a.length != p0Var.a()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f9721a, p0Var.a());
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f9721a = (z[]) objArrCopyOf;
        }
        this.f9722b = new y3.a(p0Var.g());
        this.f9723c = i12;
        this.f9724d = p0Var.k();
        this.f9725e = p0Var.e();
        int iA2 = p0Var.a();
        for (int i14 = 0; i14 < iA2; i14++) {
            Object objF = p0Var.f(i14);
            n nVar = objF instanceof n ? (n) objF : null;
            if (nVar == null) {
                z zVar4 = this.f9721a[i14];
                if (zVar4 != null) {
                    zVar4.c();
                }
                this.f9721a[i14] = null;
            } else {
                z zVar5 = this.f9721a[i14];
                if (zVar5 == null) {
                    zVar5 = new z(zVar, yVar, new g1.l0(this.f9728h, 17));
                    this.f9721a[i14] = zVar5;
                }
                zVar5.f9811d = nVar.O;
                zVar5.f9812e = nVar.P;
                zVar5.f9813f = nVar.Q;
            }
        }
    }
}
