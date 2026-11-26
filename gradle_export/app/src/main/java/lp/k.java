package lp;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import jp.n;
import kotlin.jvm.internal.m;
import lu.o;
import nx.r;
import oo.w;
import oo.y;

public final class k implements u00.k {
    public final int A;
    public final u00.k B;

    public k(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                String it = (String) obj;
                m.e(it, "it");
                this.B.invoke(new jp.m(it));
                break;
            case 1:
                String it2 = (String) obj;
                m.e(it2, "it");
                this.B.invoke(new n(it2));
                break;
            case 2:
                String it3 = (String) obj;
                m.e(it3, "it");
                this.B.invoke(new jp.m(it3));
                break;
            case 3:
                String it4 = (String) obj;
                m.e(it4, "it");
                this.B.invoke(new o(it4));
                break;
            case 4:
                this.B.invoke(new lu.l(((Integer) obj).intValue()));
                break;
            case 5:
                this.B.invoke(new lu.h(((Integer) obj).intValue()));
                break;
            case 6:
                String it5 = (String) obj;
                m.e(it5, "it");
                this.B.invoke(new r(it5));
                break;
            case 7:
                this.B.invoke(new nz.g(((Boolean) obj).booleanValue()));
                break;
            case 8:
                this.B.invoke(new nz.c(((Boolean) obj).booleanValue()));
                break;
            case 9:
                this.B.invoke(new oo.l(((Long) obj).longValue()));
                break;
            case 10:
                this.B.invoke(new oo.o(((Boolean) obj).booleanValue()));
                break;
            case 11:
                String it6 = (String) obj;
                m.e(it6, "it");
                this.B.invoke(new oo.i(it6));
                break;
            case 12:
                this.B.invoke(new oo.l(((Long) obj).longValue()));
                break;
            case 13:
                this.B.invoke(new oo.r(((Long) obj).longValue()));
                break;
            case 14:
                this.B.invoke(new y(((Float) obj).floatValue()));
                break;
            case 15:
                ru.d it7 = (ru.d) obj;
                m.e(it7, "it");
                this.B.invoke(new w(it7));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                String it8 = (String) obj;
                m.e(it8, "it");
                this.B.invoke(new oo.i(it8));
                break;
            case 17:
                this.B.invoke(new oo.d(((Integer) obj).intValue()));
                break;
            case 18:
                this.B.invoke(new oo.c(((Integer) obj).intValue()));
                break;
            case 19:
                this.B.invoke(new oo.l(((Long) obj).longValue()));
                break;
            case 20:
                String it9 = (String) obj;
                m.e(it9, "it");
                this.B.invoke(new oo.i(it9));
                break;
            case 21:
                String it10 = (String) obj;
                m.e(it10, "it");
                this.B.invoke(new oo.i(it10));
                break;
            case 22:
                this.B.invoke(new oo.l(((Long) obj).longValue()));
                break;
            case 23:
                this.B.invoke(new y(((Float) obj).floatValue()));
                break;
            case 24:
                ru.d it11 = (ru.d) obj;
                m.e(it11, "it");
                this.B.invoke(new w(it11));
                break;
            case 25:
                this.B.invoke(new oo.r(((Long) obj).longValue()));
                break;
            case 26:
                this.B.invoke(new oo.o(((Boolean) obj).booleanValue()));
                break;
            case 27:
                String it12 = (String) obj;
                m.e(it12, "it");
                this.B.invoke(new pz.d(it12));
                break;
            case 28:
                String it13 = (String) obj;
                m.e(it13, "it");
                this.B.invoke(new pz.e(it13));
                break;
            default:
                String it14 = (String) obj;
                m.e(it14, "it");
                this.B.invoke(new qx.f(it14));
                break;
        }
        return b0.a;
    }
}
