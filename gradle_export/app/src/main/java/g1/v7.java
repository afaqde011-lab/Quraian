package g1;

public final class v7 implements u00.k {
    public final int A;
    public final b8 B;
    public final l1.z0 C;

    public v7(b8 b8Var, l1.z0 z0Var, int i10) {
        this.A = i10;
        this.B = b8Var;
        this.C = z0Var;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.A;
        b8 b8Var = this.B;
        l1.z0 z0Var = this.C;
        switch (i10) {
            case 0:
                int unicodeChar = ((t2.b) obj).f14351a.getUnicodeChar();
                if (48 <= unicodeChar && unicodeChar < 58) {
                    float f3 = z7.f6046a;
                    long j9 = ((r3.w) z0Var.getValue()).f13100b;
                    int i11 = m3.q0.f10519c;
                    if (((int) (j9 >> 32)) == 2 && ((r3.w) z0Var.getValue()).f13099a.B.length() == 2) {
                        b8Var.d(1);
                    }
                }
                return Boolean.FALSE;
            default:
                if (((t2.b) obj).f14351a.getUnicodeChar() == 0) {
                    float f10 = z7.f6046a;
                    long j10 = ((r3.w) z0Var.getValue()).f13100b;
                    int i12 = m3.q0.f10519c;
                    z10 = ((int) (j10 >> 32)) == 0;
                }
                if (z10) {
                    b8Var.d(0);
                }
                return Boolean.valueOf(z10);
        }
    }
}
