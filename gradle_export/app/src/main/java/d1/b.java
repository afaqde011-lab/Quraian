package d1;

import m3.h0;
import m3.r0;

public final class b {

    public static b f4535h;

    public final y3.m f4536a;

    public final r0 f4537b;

    public final y3.d f4538c;

    public final q3.h f4539d;

    public final r0 f4540e;

    public float f4541f = Float.NaN;

    public float f4542g = Float.NaN;

    public b(y3.m mVar, r0 r0Var, y3.d dVar, q3.h hVar) {
        this.f4536a = mVar;
        this.f4537b = r0Var;
        this.f4538c = dVar;
        this.f4539d = hVar;
        this.f4540e = h0.j(r0Var, mVar);
    }

    public final long a(int i10, long j9) {
        int i11;
        float f3 = this.f4542g;
        float f10 = this.f4541f;
        if (Float.isNaN(f3) || Float.isNaN(f10)) {
            String str = c.f4543a;
            long jB = y3.b.b(0, 0, 0, 0, 15);
            r0 r0Var = this.f4540e;
            y3.d dVar = this.f4538c;
            float fB = h0.a(str, r0Var, jB, dVar, this.f4539d, 1, 96).b();
            float fB2 = h0.a(c.f4544b, this.f4540e, y3.b.b(0, 0, 0, 0, 15), dVar, this.f4539d, 2, 96).b() - fB;
            this.f4542g = fB;
            this.f4541f = fB2;
            f10 = fB2;
            f3 = fB;
        }
        if (i10 != 1) {
            int iRound = Math.round((f10 * (i10 - 1)) + f3);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = y3.a.g(j9);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = y3.a.i(j9);
        }
        return y3.b.a(y3.a.j(j9), y3.a.h(j9), i11, y3.a.g(j9));
    }
}
