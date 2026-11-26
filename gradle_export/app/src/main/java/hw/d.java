package hw;

import ab.a0;
import j0.q;
import k0.y;

public final class d implements u00.a {
    public final int A;
    public final y B;

    public d(y yVar, int i) {
        this.A = i;
        this.B = yVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                q qVar = this.B.d;
                return Float.valueOf(qVar.b.h() == 0 ? -qVar.c.h() : -400.0f);
            case 1:
                return Boolean.valueOf(this.B.d.b.h() > 0);
            case 2:
                return Boolean.valueOf(this.B.d.b.h() > 0);
            case 3:
                return Boolean.valueOf(this.B.d.b.h() > 0);
            default:
                y yVar = this.B;
                k0.q qVar2 = (k0.q) h00.q.N0(yVar.g().m);
                q qVar3 = yVar.d;
                int iH = qVar3.b.h();
                int iH2 = qVar3.c.h();
                int i = qVar2 != null ? (int) (qVar2.s & 4294967295L) : 0;
                float fX = 1.0f;
                if (iH <= 0) {
                    fX = i <= 0 ? 0.0f : a0.x(iH2 / i, 0.0f, 1.0f);
                }
                return Float.valueOf(fX);
        }
    }
}
