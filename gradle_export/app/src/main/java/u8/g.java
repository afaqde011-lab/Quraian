package u8;

import a8.l0;
import com.google.android.gms.cast.Cast;
import e7.i0;
import e7.u;

public final class g {

    public final l0 f15017a;

    public t f15020d;

    public d f15021e;

    public int f15022f;

    public int f15023g;

    public int f15024h;

    public int f15025i;

    public final androidx.media3.common.t f15026j;
    public boolean m;

    public final s f15018b = new s();

    public final u f15019c = new u();

    public final u f15027k = new u(1);
    public final u l = new u();

    public g(l0 l0Var, t tVar, d dVar, androidx.media3.common.t tVar2) {
        this.f15017a = l0Var;
        this.f15020d = tVar;
        this.f15021e = dVar;
        this.f15026j = tVar2;
        this.f15020d = tVar;
        this.f15021e = dVar;
        l0Var.f(tVar2);
        e();
    }

    public final int a() {
        int i10;
        if (this.m) {
            i10 = this.f15018b.f15118j[this.f15022f] ? 1 : 0;
        } else {
            i10 = this.f15020d.f15130g[this.f15022f];
        }
        return b() != null ? 1073741824 | i10 : i10;
    }

    public final r b() {
        if (!this.m) {
            return null;
        }
        s sVar = this.f15018b;
        d dVar = sVar.f15109a;
        String str = i0.f5136a;
        int i10 = dVar.f15010a;
        r rVar = sVar.m;
        if (rVar == null) {
            rVar = this.f15020d.f15124a.l[i10];
        }
        if (rVar == null || !rVar.f15104a) {
            return null;
        }
        return rVar;
    }

    public final boolean c() {
        this.f15022f++;
        if (!this.m) {
            return false;
        }
        int i10 = this.f15023g + 1;
        this.f15023g = i10;
        int[] iArr = this.f15018b.f15115g;
        int i11 = this.f15024h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f15024h = i11 + 1;
        this.f15023g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        u uVar;
        r rVarB = b();
        if (rVarB == null) {
            return 0;
        }
        int length = rVarB.f15107d;
        s sVar = this.f15018b;
        if (length != 0) {
            uVar = sVar.f15120n;
        } else {
            byte[] bArr = rVarB.f15108e;
            String str = i0.f5136a;
            int length2 = bArr.length;
            u uVar2 = this.l;
            uVar2.L(length2, bArr);
            length = bArr.length;
            uVar = uVar2;
        }
        boolean z10 = sVar.f15119k && sVar.l[this.f15022f];
        boolean z11 = z10 || i11 != 0;
        u uVar3 = this.f15027k;
        uVar3.f5182a[0] = (byte) ((z11 ? Cast.MAX_NAMESPACE_LENGTH : 0) | length);
        uVar3.N(0);
        l0 l0Var = this.f15017a;
        l0Var.e(uVar3, 1, 1);
        l0Var.e(uVar, length, 1);
        if (!z11) {
            return length + 1;
        }
        u uVar4 = this.f15019c;
        if (!z10) {
            uVar4.K(8);
            byte[] bArr2 = uVar4.f5182a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            l0Var.e(uVar4, 8, 1);
            return length + 9;
        }
        u uVar5 = sVar.f15120n;
        int iH = uVar5.H();
        uVar5.O(-2);
        int i12 = (iH * 6) + 2;
        if (i11 != 0) {
            uVar4.K(i12);
            byte[] bArr3 = uVar4.f5182a;
            uVar5.k(0, i12, bArr3);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            uVar4 = uVar5;
        }
        l0Var.e(uVar4, i12, 1);
        return length + 1 + i12;
    }

    public final void e() {
        s sVar = this.f15018b;
        sVar.f15112d = 0;
        sVar.f15122p = 0L;
        sVar.f15123q = false;
        sVar.f15119k = false;
        sVar.f15121o = false;
        sVar.m = null;
        this.f15022f = 0;
        this.f15024h = 0;
        this.f15023g = 0;
        this.f15025i = 0;
        this.m = false;
    }
}
