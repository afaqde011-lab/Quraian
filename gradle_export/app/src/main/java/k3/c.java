package k3;

import java.util.Arrays;
import y3.j;

public final class c {

    public final long f8942a;

    public final long f8943b;

    public final long f8944c;

    public final long f8945d;

    public final long f8946e;

    public final float[] f8947f;

    public final l0.c f8948g;

    public c(long j9, long j10, long j11, long j12, long j13, float[] fArr, l0.c cVar) {
        this.f8942a = j9;
        this.f8943b = j10;
        this.f8944c = j11;
        this.f8945d = j12;
        this.f8946e = j13;
        this.f8947f = fArr;
        this.f8948g = cVar;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f8942a == cVar.f8942a && this.f8943b == cVar.f8943b && this.f8946e == cVar.f8946e && j.b(this.f8944c, cVar.f8944c) && j.b(this.f8945d, cVar.f8945d)) {
                    float[] fArr = cVar.f8947f;
                    float[] fArr2 = this.f8947f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.f8948g.equals(cVar.f8948g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iF = w.c.f(w.c.f(w.c.f(w.c.f(Long.hashCode(this.f8942a) * 31, this.f8943b, 31), this.f8946e, 31), this.f8944c, 31), this.f8945d, 31);
        float[] fArr = this.f8947f;
        return this.f8948g.hashCode() + ((iF + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
