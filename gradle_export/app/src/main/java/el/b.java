package el;

import ab.a0;
import j0.o;
import j0.q;
import j0.v;

public final class b implements u00.a {
    public final int A;
    public final v B;

    public b(v vVar, int i) {
        this.A = i;
        this.B = vVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(this.B.j.a());
            case 1:
                return Boolean.valueOf(this.B.j.a());
            case 2:
                q qVar = this.B.e;
                return Float.valueOf(qVar.b.h() == 0 ? -qVar.c.h() : -400.0f);
            case 3:
                return Integer.valueOf(this.B.e.b.h());
            case 4:
                return Boolean.valueOf(this.B.j.a());
            case 5:
                q qVar2 = this.B.e;
                return Float.valueOf(qVar2.b.h() == 0 ? -qVar2.c.h() : -400.0f);
            case 6:
                q qVar3 = this.B.e;
                return Float.valueOf(qVar3.b.h() == 0 ? -qVar3.c.h() : -400.0f);
            case 7:
                return Boolean.valueOf(this.B.j.a());
            case 8:
                return Integer.valueOf(this.B.h().n);
            case 9:
                v vVar = this.B;
                return Float.valueOf(vVar.e.b.h() == 0 ? -vVar.e.c.h() : -400.0f);
            case 10:
                return Integer.valueOf(this.B.h().n);
            case 11:
                v vVar2 = this.B;
                o oVar = (o) h00.q.N0(vVar2.h().k);
                q qVar4 = vVar2.e;
                int iH = qVar4.b.h();
                int iH2 = qVar4.c.h();
                int i = oVar != null ? oVar.p : 0;
                float fX = 1.0f;
                if (iH <= 0) {
                    fX = i <= 0 ? 0.0f : a0.x(iH2 / i, 0.0f, 1.0f);
                }
                return Float.valueOf(fX);
            case 12:
                q qVar5 = this.B.e;
                return Float.valueOf(qVar5.b.h() == 0 ? -qVar5.c.h() : -400.0f);
            default:
                return Integer.valueOf(this.B.h().n);
        }
    }
}
