package as;

import bv.f1;
import c3.d2;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

public final class d0 implements u00.k {
    public final int A;
    public final u00.k B;

    public d0(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                g2.y it = (g2.x) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.B.invoke(new o(it.a()));
                break;
            case 1:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                this.B.invoke(new p(it2));
                break;
            case 2:
                qr.r it3 = (qr.r) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                this.B.invoke(new s(it3));
                break;
            case 3:
                String it4 = (String) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                this.B.invoke(new az.e(it4));
                break;
            case 4:
                String it5 = (String) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                this.B.invoke(new az.d(it5));
                break;
            case 5:
                ys.c it6 = (ys.c) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                this.B.invoke(new bt.q(it6));
                break;
            case 6:
                this.B.invoke(new bv.c(((Integer) obj).intValue()));
                break;
            case 7:
                this.B.invoke(bv.i.a);
                break;
            case 8:
                String it7 = (String) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                this.B.invoke(new c00.e(it7));
                break;
            case 9:
                this.B.invoke(new bt.h(((Integer) obj).intValue()));
                break;
            case 10:
                this.B.invoke(new ds.d(((Integer) obj).intValue()));
                break;
            case 11:
                this.B.invoke(new dz.f(((Integer) obj).intValue()));
                break;
            case 12:
                this.B.invoke(new dz.d(((Integer) obj).intValue()));
                break;
            case 13:
                this.B.invoke(new dz.e(((Integer) obj).intValue()));
                break;
            case 14:
                String it8 = (String) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                this.B.invoke(new ev.g(it8));
                break;
            case 15:
                String it9 = (String) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                this.B.invoke(new ez.f(it9));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                this.B.invoke(new fy.f(((Integer) obj).intValue()));
                break;
            case 17:
                this.B.invoke(new fy.e(((Integer) obj).intValue()));
                break;
            case 18:
                this.B.invoke(new fy.h(((Integer) obj).intValue()));
                break;
            case 19:
                this.B.invoke(new fy.d(((Integer) obj).intValue()));
                break;
            case 20:
                String it10 = (String) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                this.B.invoke(new fy.i(it10));
                break;
            case 21:
                ot.d it11 = (ot.d) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                this.B.invoke(new f1(it11));
                break;
            case 22:
                this.B.invoke(new bv.u(((Integer) obj).intValue()));
                break;
            case 23:
                this.B.invoke(new bv.k(((Boolean) obj).booleanValue()));
                break;
            case 24:
                ru.d it12 = (ru.d) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                this.B.invoke(new bv.p0(it12));
                break;
            case 25:
                this.B.invoke(new bv.m0(((Float) obj).floatValue()));
                break;
            case 26:
                this.B.invoke(new bv.h(((Float) obj).floatValue()));
                break;
            case 27:
                this.B.invoke(new bv.g(((Float) obj).floatValue()));
                break;
            case 28:
                d2 d2Var = (d2) obj;
                d2Var.a = "offset";
                d2Var.c.c(this.B, "offset");
                break;
            default:
                this.B.invoke(new bv.s(((Integer) obj).intValue()));
                break;
        }
        return g00.b0.a;
    }
}
