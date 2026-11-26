package l7;

import java.util.NoSuchElementException;

public final class l implements t7.k {
    public final long A;
    public final long B;
    public long C;
    public final k D;

    public l(k kVar, long j9, long j10) {
        this.A = j9;
        this.B = j10;
        this.C = j9 - 1;
        this.D = kVar;
    }

    @Override
    public final long a() {
        long j9 = this.C;
        if (j9 < this.A || j9 > this.B) {
            throw new NoSuchElementException();
        }
        return this.D.e(j9);
    }

    @Override
    public final long b() {
        long j9 = this.C;
        if (j9 < this.A || j9 > this.B) {
            throw new NoSuchElementException();
        }
        return this.D.d(j9);
    }

    @Override
    public final boolean next() {
        long j9 = this.C + 1;
        this.C = j9;
        return !(j9 > this.B);
    }
}
