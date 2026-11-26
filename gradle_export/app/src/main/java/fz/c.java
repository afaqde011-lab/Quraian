package fz;

import g00.b0;
import l1.j;
import l1.q;
import p30.f;
import u00.n;

public final class c implements n {
    public final int A;
    public final boolean B;
    public final u00.a C;
    public final int D;

    public c(boolean z, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = aVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.getClass();
                f.K(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 1:
                num.getClass();
                lz.a.b(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 2:
                num.getClass();
                lz.a.b(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 3:
                num.intValue();
                st.j.e(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            default:
                num.intValue();
                st.j.c(this.B, this.C, jVar, q.K(this.D | 1));
                break;
        }
        return b0.a;
    }
}
