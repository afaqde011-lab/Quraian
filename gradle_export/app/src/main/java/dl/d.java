package dl;

import com.google.android.gms.internal.measurement.y3;
import e1.v0;
import g00.b0;
import l1.j;
import l1.q;
import lo.k;
import u00.n;

public final class d implements n {
    public final int A;
    public final boolean B;
    public final Object C;

    public d(Object obj, boolean z, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.B = z;
    }

    public d(boolean z, v1.c cVar, int i) {
        this.A = 0;
        this.B = z;
        this.C = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(49);
                e.a(this.B, (v1.c) this.C, (j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                y3.g((ip.b) this.C, this.B, (j) obj, iK2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK3 = q.K(1);
                po.n.m((String) this.C, this.B, (j) obj, iK3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK4 = q.K(1);
                q0.q.m((v0) this.C, this.B, (j) obj, iK4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK5 = q.K(1);
                ro.f.c((k) this.C, this.B, (j) obj, iK5);
                break;
        }
        return b0.a;
    }
}
