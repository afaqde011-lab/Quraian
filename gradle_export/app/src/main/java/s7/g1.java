package s7;

import com.google.android.gms.internal.measurement.b5;
import java.util.Arrays;

public final class g1 implements w7.j {
    public final g7.j A;
    public final g7.r B;
    public byte[] C;

    public g1(g7.f fVar, g7.j jVar) {
        r.f13729f.getAndIncrement();
        this.A = jVar;
        this.B = new g7.r(fVar);
    }

    @Override
    public final void h() {
        g7.r rVar = this.B;
        rVar.B = 0L;
        try {
            rVar.p(this.A);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) rVar.B;
                byte[] bArr = this.C;
                if (bArr == null) {
                    this.C = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.C = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.C;
                i10 = rVar.read(bArr2, i11, bArr2.length - i11);
            }
        } finally {
            b5.n(rVar);
        }
    }

    @Override
    public final void l() {
    }
}
