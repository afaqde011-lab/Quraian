package bs;

import b2.r;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import g1.z7;
import gv.p;
import ix.o;
import l1.q;
import u00.n;

public final class b implements n {
    public final int A;
    public final r B;

    public b(r rVar, int i, int i2) {
        this.A = i2;
        this.B = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.c(this.B, jVar, q.K(1));
                break;
            case 1:
                a.i(this.B, jVar, q.K(7));
                break;
            case 2:
                a.b(this.B, jVar, q.K(1));
                break;
            case 3:
                cz.a.i(this.B, jVar, q.K(1));
                break;
            case 4:
                cz.a.j(this.B, jVar, q.K(1));
                break;
            case 5:
                eq.a.b(this.B, jVar, q.K(7));
                break;
            case 6:
                eu.a.m(this.B, jVar, q.K(1));
                break;
            case 7:
                eu.a.p(this.B, jVar, q.K(1));
                break;
            case 8:
                eu.a.q(this.B, jVar, q.K(1));
                break;
            case 9:
                z7.e(this.B, jVar, q.K(7));
                break;
            case 10:
                p.z(this.B, jVar, q.K(1));
                break;
            case 11:
                hv.i.a(this.B, jVar, q.K(7));
                break;
            case 12:
                rd.a.d(this.B, jVar, q.K(1));
                break;
            case 13:
                va.a.d(this.B, jVar, q.K(1));
                break;
            case 14:
                iw.a.a(this.B, jVar, q.K(1));
                break;
            case 15:
                iw.a.e(this.B, jVar, q.K(1));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                iw.a.d(this.B, jVar, q.K(1));
                break;
            case 17:
                o.b(this.B, jVar, q.K(7));
                break;
            case 18:
                iz.d.p(this.B, jVar, q.K(1));
                break;
            case 19:
                kx.a.d(this.B, jVar, q.K(7));
                break;
            case 20:
                kz.a.b(this.B, jVar, q.K(1));
                break;
            case 21:
                kz.a.d(this.B, jVar, q.K(1));
                break;
            case 22:
                mu.d.v(this.B, jVar, q.K(1));
                break;
            case 23:
                mu.d.y(this.B, jVar, q.K(1));
                break;
            case 24:
                mz.a.a(this.B, jVar, q.K(7));
                break;
            case 25:
                mz.a.b(this.B, jVar, q.K(7));
                break;
            case 26:
                mz.a.d(this.B, jVar, q.K(7));
                break;
            case 27:
                ox.g.c(this.B, jVar, q.K(1));
                break;
            case 28:
                ox.g.f(this.B, jVar, q.K(1));
                break;
            default:
                z3.l(this.B, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
