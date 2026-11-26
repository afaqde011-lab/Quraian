package ct;

import com.google.android.gms.internal.measurement.g4;
import e1.v0;
import g1.z7;

public final class h implements u00.n {
    public final int A;
    public final Object B;
    public final boolean C;
    public final int D;
    public final Object E;

    public h(b2.r rVar, g1.h hVar, int i, boolean z, int i2) {
        this.A = 3;
        this.B = rVar;
        this.E = hVar;
        this.D = i;
        this.C = z;
    }

    public h(Object obj, b2.r rVar, boolean z, int i, int i2) {
        this.A = i2;
        this.E = obj;
        this.B = rVar;
        this.C = z;
        this.D = i;
    }

    public h(Object obj, boolean z, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.E = obj;
        this.C = z;
        this.B = kVar;
        this.D = i;
    }

    public h(ru.d dVar, int i, boolean z, u00.a aVar, int i2) {
        this.A = 4;
        this.E = dVar;
        this.D = i;
        this.C = z;
        this.B = aVar;
    }

    public h(u00.a aVar, boolean z, b2.r rVar, int i) {
        this.A = 1;
        this.B = rVar;
        this.E = aVar;
        this.C = z;
        this.D = i;
    }

    public h(boolean z, x3.j jVar, v0 v0Var, int i) {
        this.A = 2;
        this.C = z;
        this.E = jVar;
        this.B = v0Var;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(this.D | 1);
                i.c((ys.a) this.E, (b2.r) this.B, this.C, (l1.j) obj, iK);
                break;
            case 1:
                b2.r rVar = (b2.r) this.B;
                u00.a aVar = (u00.a) this.E;
                ((Integer) obj2).getClass();
                a.a.e(l1.q.K(this.D | 1), rVar, (l1.j) obj, aVar, this.C);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.D | 1);
                g4.n(this.C, (x3.j) this.E, (v0) this.B, (l1.j) obj, iK2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(1);
                z7.d((b2.r) this.B, (g1.h) this.E, this.D, this.C, (l1.j) obj, iK3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iK4 = l1.q.K(1);
                gv.p.y((ru.d) this.E, this.D, this.C, (u00.a) this.B, (l1.j) obj, iK4);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iK5 = l1.q.K(this.D | 1);
                iv.n.c((yu.a) this.E, this.C, (u00.k) this.B, (l1.j) obj, iK5);
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iK6 = l1.q.K(this.D | 1);
                rl.d.e((String) this.E, this.C, (u00.k) this.B, (l1.j) obj, iK6);
                break;
            default:
                String str = (String) this.E;
                ((Integer) obj2).getClass();
                up.d.a(l1.q.K(this.D | 1), (b2.r) this.B, str, (l1.j) obj, this.C);
                break;
        }
        return g00.b0.a;
    }
}
