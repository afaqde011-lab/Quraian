package ct;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.a3;
import g1.h1;
import g1.z6;
import java.util.List;
import l0.j0;
import l1.q1;
import m3.r0;
import x.n1;

public final class l implements u00.n {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;

    public l(int i, int i2, String str, String str2) {
        this.A = 4;
        this.B = i;
        this.C = str;
        this.D = str2;
    }

    public l(int i, Object obj, j0 j0Var) {
        this.A = 8;
        this.C = j0Var;
        this.B = i;
        this.D = obj;
    }

    public l(Object obj, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.C = rVar;
        this.B = i;
    }

    public l(Object obj, Object obj2, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.D = obj2;
        this.B = i;
    }

    public l(j0 j0Var, int i, Object obj, int i2, int i3) {
        this.A = i3;
        this.C = j0Var;
        this.B = i;
        this.D = obj;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                ab.a0.b((b2.r) this.C, (b) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ab.a0.i((ys.c) this.C, (u00.k) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                a3.l((h1) this.C, (h1.t) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                z6.a((r0) this.C, (v1.c) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rd.a.e(this.B, (String) this.C, (String) this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                hy.b.a((cy.e) this.D, (b2.r) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((j0.i) this.C).d(this.B, this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((k0.j) this.C).d(this.B, this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 8:
                j0 j0Var = (j0) this.C;
                l1.g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0Var.d(this.B, this.D, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 9:
                ((Integer) obj2).intValue();
                l1.q.a((q1) this.C, (u00.n) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                l1.q.b((q1[]) this.C, (u00.n) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((m0.o) this.C).d(this.B, this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ox.a.j((nx.i0) this.C, (u00.k) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                q0.e.a((m3.h) this.C, (List) this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ((v1.c) this.C).h(this.D, (l1.j) obj, l1.q.K(this.B) | 1);
                break;
            case 15:
                ((Integer) obj2).getClass();
                wr.h0.c((qr.v) this.D, (b2.r) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).intValue();
                ((n1) this.C).a(this.D, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            default:
                b2.r rVar = (b2.r) this.C;
                u00.k kVar = (u00.k) this.D;
                ((Integer) obj2).getClass();
                z.n.b(l1.q.K(this.B | 1), rVar, (l1.j) obj, kVar);
                break;
        }
        return g00.b0.a;
    }
}
