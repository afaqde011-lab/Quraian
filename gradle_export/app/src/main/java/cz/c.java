package cz;

import a40.z;
import ca.q;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import g1.k4;
import g1.m4;
import g1.m6;
import g1.n6;
import l1.i1;
import ta.c0;

public final class c implements u00.a {
    public final int A;
    public final z B;
    public final m6 C;
    public final u00.a D;

    public c(z zVar, m6 m6Var, u00.a aVar, int i) {
        this.A = i;
        this.B = zVar;
        this.C = m6Var;
        this.D = aVar;
    }

    public c(m6 m6Var, z zVar, u00.a aVar) {
        this.A = 5;
        this.C = m6Var;
        this.B = zVar;
        this.D = aVar;
    }

    public c(m6 m6Var, u00.a aVar, z zVar) {
        this.A = 6;
        this.C = m6Var;
        this.D = aVar;
        this.B = zVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 0), 31);
                break;
            case 1:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 2), 31);
                break;
            case 2:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 3), 31);
                break;
            case 3:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 4), 31);
                break;
            case 4:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 6), 31);
                break;
            case 5:
                m6 m6Var = this.C;
                if (((Boolean) ((u00.k) m6Var.d.d).invoke(n6.A)).booleanValue()) {
                    a40.c0.y(this.B, null, null, new m4(m6Var, (k00.c) null, 3), 3).f0(new k4(m6Var, this.D, 0));
                }
                return b0.a;
            case 6:
                m6 m6Var2 = this.C;
                int iOrdinal = ((n6) ((i1) m6Var2.d.g).getValue()).ordinal();
                if (iOrdinal != 1) {
                    z zVar = this.B;
                    if (iOrdinal != 2) {
                        a40.c0.y(zVar, null, null, new m4(m6Var2, (k00.c) null, 5), 3);
                    } else {
                        a40.c0.y(zVar, null, null, new m4(m6Var2, (k00.c) null, 4), 3);
                    }
                } else {
                    this.D.invoke();
                }
                return b0.a;
            case 7:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 7), 31);
                break;
            case 8:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 8), 31);
                break;
            case 9:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 9), 31);
                break;
            case 10:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 10), 31);
                break;
            case 11:
                a40.c0.y(this.B, null, null, new m4(this.C, (k00.c) null, 8), 3).f0(new q(11, this.D));
                break;
            case 12:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 11), 31);
                break;
            case 13:
                a40.c0.y(this.B, null, null, new m4(this.C, (k00.c) null, 9), 3).f0(new q(13, this.D));
                break;
            case 14:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 12), 31);
                break;
            case 15:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 13), 31);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 14), 31);
                break;
            case 17:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 15), 31);
                break;
            case 18:
                a40.c0.y(this.B, null, null, new m4(this.C, (k00.c) null, 10), 3).f0(new q(17, this.D));
                break;
            default:
                c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new e(this.C, this.D, null, 16), 31);
                break;
        }
        return b0.a;
    }
}
