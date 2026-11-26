package h9;

import a8.l0;

public final class m {

    public final l0 f6778a;

    public boolean f6779b;

    public boolean f6780c;

    public boolean f6781d;

    public int f6782e;

    public int f6783f;

    public long f6784g;

    public long f6785h;

    public m(l0 l0Var) {
        this.f6778a = l0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f6780c) {
            int i12 = this.f6783f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f6783f = (i11 - i10) + i12;
            } else {
                this.f6781d = ((bArr[i13] & 192) >> 6) == 0;
                this.f6780c = false;
            }
        }
    }

    public final void b(int i10, long j9, boolean z10) {
        ta.c0.A(this.f6785h != -9223372036854775807L);
        if (this.f6782e == 182 && z10 && this.f6779b) {
            this.f6778a.d(this.f6785h, this.f6781d ? 1 : 0, (int) (j9 - this.f6784g), i10, null);
        }
        if (this.f6782e != 179) {
            this.f6784g = j9;
        }
    }
}
