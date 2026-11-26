package rx;

import b3.o2;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import g2.x;
import g2.y;
import kotlin.jvm.internal.m;
import u00.k;
import ur.a0;
import ur.d0;
import ur.m0;
import ur.n0;
import ur.o;
import ur.q;
import ur.z;
import z.j0;
import z1.j;
import z1.l;

public final class c implements k {
    public final int A;
    public final k B;

    public c(int i, k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        k kVar = this.B;
        switch (i) {
            case 0:
                kVar.invoke(new qx.e(((Boolean) obj).booleanValue()));
                return b0.a;
            case 1:
                y it = (x) obj;
                m.e(it, "it");
                kVar.invoke(Boolean.valueOf(it.a()));
                return b0.a;
            case 2:
                String it2 = (String) obj;
                m.e(it2, "it");
                kVar.invoke(new qx.f(it2));
                return b0.a;
            case 3:
                kVar.invoke(new qx.e(((Boolean) obj).booleanValue()));
                return b0.a;
            case 4:
                tm.e eVar = (tm.e) obj;
                m.e(eVar, "<this>");
                kVar.invoke(eVar);
                return b0.a;
            case 5:
                kVar.invoke(new n0(((Integer) obj).intValue()));
                return b0.a;
            case 6:
                kVar.invoke(new d0(((Integer) obj).intValue()));
                return b0.a;
            case 7:
                kVar.invoke(new ur.d(((Integer) obj).intValue()));
                return b0.a;
            case 8:
                kVar.invoke(new ur.f(((Integer) obj).intValue()));
                return b0.a;
            case 9:
                kVar.invoke(new ur.e(((Integer) obj).intValue()));
                return b0.a;
            case 10:
                kVar.invoke(new ur.g(((Integer) obj).intValue()));
                return b0.a;
            case 11:
                kVar.invoke(new a0(((Integer) obj).intValue()));
                return b0.a;
            case 12:
                PlayerItem it3 = (PlayerItem) obj;
                m.e(it3, "it");
                kVar.invoke(new z(it3));
                return b0.a;
            case 13:
                PlayerItem it4 = (PlayerItem) obj;
                m.e(it4, "it");
                kVar.invoke(new m0(it4));
                return b0.a;
            case 14:
                PlayerItem it5 = (PlayerItem) obj;
                m.e(it5, "it");
                kVar.invoke(new q(it5));
                return b0.a;
            case 15:
                kVar.invoke(new o(((Integer) obj).intValue()));
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                String it6 = (String) obj;
                m.e(it6, "it");
                kVar.invoke(new wy.c(it6));
                return b0.a;
            case 17:
                String it7 = (String) obj;
                m.e(it7, "it");
                kVar.invoke(new wy.e(it7));
                return b0.a;
            case 18:
                String it8 = (String) obj;
                m.e(it8, "it");
                kVar.invoke(new wy.c(it8));
                return b0.a;
            case 19:
                String it9 = (String) obj;
                m.e(it9, "it");
                kVar.invoke(new wy.d(it9));
                return b0.a;
            case 20:
                String it10 = (String) obj;
                m.e(it10, "it");
                kVar.invoke(new wy.e(it10));
                return b0.a;
            case 21:
                Long l = (Long) obj;
                l.longValue();
                return kVar.invoke(l);
            case 22:
                j0 j0Var = (o2) obj;
                if (!(j0Var instanceof j0)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) kVar.invoke(j0Var.O);
                bool.getClass();
                return bool;
            case 23:
                z1.f fVar = (z1.f) kVar.invoke((j) obj);
                synchronized (l.c) {
                    l.d = l.d.i(fVar.g());
                }
                return fVar;
            default:
                String it11 = (String) obj;
                m.e(it11, "it");
                kVar.invoke(new zy.b(it11));
                return b0.a;
        }
    }
}
