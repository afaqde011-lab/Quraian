package bs;

import androidx.lifecycle.w;
import as.u0;
import b2.r;
import b6.m;
import com.google.android.gms.internal.measurement.b5;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d00.x0;
import g00.b0;
import g1.a3;
import g1.h1;
import g1.k8;
import gv.p;
import java.time.LocalDate;
import l0.g1;
import l0.j0;
import l1.p1;
import l1.q;
import l1.z0;
import lo.s;
import oo.o0;
import q0.g2;
import qx.o;
import u00.k;
import u00.n;
import wr.h0;

public final class f implements n {
    public final int A;
    public final Object B;
    public final int C;
    public final Object D;
    public final Object E;

    public f(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A = i2;
        this.D = obj;
        this.E = obj2;
        this.B = obj3;
        this.C = i;
    }

    public f(int i, String str, String str2, k kVar, int i2) {
        this.A = 13;
        this.C = i;
        this.E = str;
        this.D = str2;
        this.B = kVar;
    }

    public f(r rVar, int i, k kVar, h1 h1Var, int i2) {
        this.A = 6;
        this.D = rVar;
        this.C = i;
        this.B = kVar;
        this.E = h1Var;
    }

    public f(k8 k8Var, z0 z0Var, v1.c cVar, int i) {
        this.A = 8;
        this.D = k8Var;
        this.E = z0Var;
        this.B = cVar;
        this.C = i;
    }

    public f(Object obj, Object obj2, g00.e eVar, int i, int i2, int i3) {
        this.A = i3;
        this.D = obj;
        this.E = obj2;
        this.B = eVar;
        this.C = i2;
    }

    public f(Object obj, k kVar, Object obj2, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.B = kVar;
        this.E = obj2;
        this.C = i;
    }

    public f(String str, Object obj, Comparable comparable, int i, int i2, int i3) {
        this.A = i3;
        this.E = str;
        this.D = obj;
        this.B = comparable;
        this.C = i2;
    }

    public f(String str, u00.a aVar, r rVar, int i) {
        this.A = 17;
        this.E = str;
        this.D = aVar;
        this.B = rVar;
        this.C = i;
    }

    public f(j0 j0Var, Object obj, int i, Object obj2, int i2) {
        this.A = 11;
        this.D = j0Var;
        this.E = obj;
        this.C = i;
        this.B = obj2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.g((u0) this.D, (String) this.E, (k) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c0.i.b((r) this.D, (c0.c) this.E, (k) this.B, (l1.j) obj, q.K(1), this.C);
                break;
            case 2:
                ((Integer) obj2).getClass();
                c0.i.a((c0.c) this.D, (r) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                cz.a.g((ry.a) this.D, (m3.h) this.E, (u00.a) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kh.n.r((String) this.E, (m) this.D, (y3.f) this.B, (l1.j) obj, q.K(1), this.C);
                break;
            case 5:
                ((Integer) obj2).getClass();
                a.a.a((e1.n) this.D, (b2.d) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iK = q.K(7);
                a3.f((r) this.D, this.C, (k) this.B, (h1) this.E, (l1.j) obj, iK);
                break;
            case 7:
                ((Integer) obj2).getClass();
                p.o((x0) this.D, (r) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                h1.f.e((k8) this.D, (z0) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                iv.a.d((su.e) this.D, (k) this.B, (r) this.E, (l1.j) obj, q.K(this.C | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                va.a.b((m) this.D, (j6.c) this.E, (v1.c) this.B, (l1.j) obj, q.K(385), this.C);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                l0.q.d((j0) this.D, this.E, this.C, this.B, (l1.j) obj, iK2);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int iK3 = q.K(this.C | 1);
                ((g1) this.D).f(this.E, (v1.c) this.B, (l1.j) obj, iK3);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iK4 = q.K(7);
                mz.a.g(this.C, (String) this.E, (String) this.D, (k) this.B, (l1.j) obj, iK4);
                break;
            case 14:
                ((Integer) obj2).getClass();
                mz.a.e((String) this.E, (r) this.D, (Integer) this.B, (l1.j) obj, q.K(1), this.C);
                break;
            case 15:
                ((Integer) obj2).getClass();
                o0.q((oo.z0) this.D, (k) this.B, (r) this.E, (l1.j) obj, q.K(this.C | 1));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                o0.l((jk.a) this.D, (r) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ox.a.i((String) this.E, (u00.a) this.D, (r) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                pp.c.a((LocalDate) this.D, (k) this.B, (u00.a) this.E, (l1.j) obj, q.K(this.C | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                ((g2) this.D).b((Object[]) this.E, (k) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                kh.n.k((w) this.D, (r6.c) this.E, (k) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                rx.a.a((o) this.D, (k) this.B, (kk.c) this.E, (l1.j) obj, q.K(this.C | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                to.b.b((s) this.D, (u00.a) this.E, (r) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                v0.i.c((t0.g) this.D, (x0.e) this.E, (u00.a) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                int iK5 = q.K(this.C) | 1;
                ((v1.c) this.D).g(this.E, this.B, (l1.j) obj, iK5);
                break;
            case 25:
                ((Integer) obj2).intValue();
                b5.c((u00.a) this.D, (u00.a) this.E, (u00.a) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                h0.d((u30.b) this.D, (u00.a) this.E, (r) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                a10.h0.g((r) this.D, (p1) this.E, (v1.c) this.B, (l1.j) obj, q.K(this.C | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iK6 = q.K(this.C | 1);
                ((y1.d) this.D).f(this.E, (v1.c) this.B, (l1.j) obj, iK6);
                break;
        }
        return b0.a;
    }
}
