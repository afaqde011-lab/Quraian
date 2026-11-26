package a8;

public final class m0 {

    public final byte[] f292a = new byte[10];

    public boolean f293b;

    public int f294c;

    public long f295d;

    public int f296e;

    public int f297f;

    public int f298g;

    public final void a(l0 l0Var, k0 k0Var) {
        if (this.f294c > 0) {
            l0Var.d(this.f295d, this.f296e, this.f297f, this.f298g, k0Var);
            this.f294c = 0;
        }
    }

    public final void b(l0 l0Var, long j9, int i10, int i11, int i12, k0 k0Var) {
        ta.c0.z("TrueHD chunk samples must be contiguous in the sample queue.", this.f298g <= i11 + i12);
        if (this.f293b) {
            int i13 = this.f294c;
            int i14 = i13 + 1;
            this.f294c = i14;
            if (i13 == 0) {
                this.f295d = j9;
                this.f296e = i10;
                this.f297f = 0;
            }
            this.f297f += i11;
            this.f298g = i12;
            if (i14 >= 16) {
                a(l0Var, k0Var);
            }
        }
    }

    public final void c(r rVar) {
        if (this.f293b) {
            return;
        }
        int i10 = 0;
        byte[] bArr = this.f292a;
        rVar.a(0, 10, bArr);
        rVar.t();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                i10 = 40 << ((bArr[((b7 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f293b = true;
    }
}
