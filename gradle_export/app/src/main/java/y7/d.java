package y7;

import java.util.Arrays;

public final class d {

    public long f16653a;

    public long f16654b;

    public long f16655c;

    public long f16656d;

    public long f16657e;

    public long f16658f;

    public final boolean[] f16659g = new boolean[15];

    public int f16660h;

    public final boolean a() {
        return this.f16656d > 15 && this.f16660h == 0;
    }

    public final void b(long j9) {
        long j10 = this.f16656d;
        if (j10 == 0) {
            this.f16653a = j9;
        } else if (j10 == 1) {
            long j11 = j9 - this.f16653a;
            this.f16654b = j11;
            this.f16658f = j11;
            this.f16657e = 1L;
        } else {
            long j12 = j9 - this.f16655c;
            int i10 = (int) (j10 % 15);
            long jAbs = Math.abs(j12 - this.f16654b);
            boolean[] zArr = this.f16659g;
            if (jAbs <= 1000000) {
                this.f16657e++;
                this.f16658f += j12;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f16660h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f16660h++;
            }
        }
        this.f16656d++;
        this.f16655c = j9;
    }

    public final void c() {
        this.f16656d = 0L;
        this.f16657e = 0L;
        this.f16658f = 0L;
        this.f16660h = 0;
        Arrays.fill(this.f16659g, false);
    }
}
