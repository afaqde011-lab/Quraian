package hv;

import bv.a0;
import bv.d0;
import bv.y;
import bv.z;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import g2.x;
import java.time.LocalDate;

public final class j implements u00.k {
    public final int A;
    public final u00.k B;

    public j(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                this.B.invoke(new bv.v(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.B.invoke(new bv.v(((Boolean) obj).booleanValue()));
                break;
            case 2:
                this.B.invoke(new bv.w(((Boolean) obj).booleanValue()));
                break;
            case 3:
                this.B.invoke(new bv.s(((Integer) obj).intValue()));
                break;
            case 4:
                this.B.invoke(new hx.f(((Integer) obj).intValue()));
                break;
            case 5:
                this.B.invoke(new hx.f(((Integer) obj).intValue()));
                break;
            case 6:
                this.B.invoke(new z(((Integer) obj).intValue()));
                break;
            case 7:
                this.B.invoke(new d0(((Integer) obj).intValue()));
                break;
            case 8:
                su.e it = (su.e) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.B.invoke(new a0(it));
                break;
            case 9:
                yu.e it2 = (yu.e) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                this.B.invoke(new y(it2));
                break;
            case 10:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                this.B.invoke(new hx.j(it3));
                break;
            case 11:
                this.B.invoke(new hx.k(((Integer) obj).intValue()));
                break;
            case 12:
                this.B.invoke(new hx.k(((Integer) obj).intValue()));
                break;
            case 13:
                String it4 = (String) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                this.B.invoke(new jx.f(it4));
                break;
            case 14:
                this.B.invoke(new jx.e(((Boolean) obj).booleanValue()));
                break;
            case 15:
                g2.y it5 = (x) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                this.B.invoke(Boolean.valueOf(it5.a()));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                String it6 = (String) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                this.B.invoke(new jx.f(it6));
                break;
            case 17:
                this.B.invoke(new jx.e(((Boolean) obj).booleanValue()));
                break;
            case 18:
                String it7 = (String) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                this.B.invoke(new jp.n(it7));
                break;
            case 19:
                String it8 = (String) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                this.B.invoke(new jp.m(it8));
                break;
            case 20:
                String it9 = (String) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                this.B.invoke(new jp.n(it9));
                break;
            case 21:
                String it10 = (String) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                this.B.invoke(new jp.m(it10));
                break;
            case 22:
                String it11 = (String) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                this.B.invoke(new jp.j(it11));
                break;
            case 23:
                String it12 = (String) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                this.B.invoke(new jp.c(it12));
                break;
            case 24:
                String it13 = (String) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                this.B.invoke(new jp.l(it13));
                break;
            case 25:
                ep.f it14 = (ep.f) obj;
                kotlin.jvm.internal.m.e(it14, "it");
                this.B.invoke(new jp.s(it14));
                break;
            case 26:
                LocalDate it15 = (LocalDate) obj;
                kotlin.jvm.internal.m.e(it15, "it");
                this.B.invoke(new jp.b(it15));
                break;
            case 27:
                this.B.invoke(new jp.g(((Boolean) obj).booleanValue()));
                break;
            case 28:
                String it16 = (String) obj;
                kotlin.jvm.internal.m.e(it16, "it");
                this.B.invoke(new jp.o(it16));
                break;
            default:
                String it17 = (String) obj;
                kotlin.jvm.internal.m.e(it17, "it");
                this.B.invoke(new jp.n(it17));
                break;
        }
        return b0.a;
    }
}
