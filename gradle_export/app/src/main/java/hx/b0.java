package hx;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ri.t1;

public final class b0 extends m00.i implements u00.p {
    public final int A;
    public boolean B;
    public Object C;
    public Object D;

    public b0(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b0 b0Var = new b0(4, (k00.c) obj4, 0);
                b0Var.B = zBooleanValue;
                b0Var.C = (List) obj2;
                b0Var.D = (List) obj3;
                return b0Var.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                b0 b0Var2 = new b0(4, (k00.c) obj4, 1);
                b0Var2.C = (CustomerInfo) obj;
                b0Var2.D = (Offerings) obj2;
                b0Var2.B = zBooleanValue2;
                return b0Var2.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                b0 b0Var3 = new b0(4, (k00.c) obj4, 2);
                b0Var3.D = (u30.b) obj;
                b0Var3.C = (List) obj2;
                b0Var3.B = zBooleanValue3;
                return b0Var3.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                boolean z = this.B;
                List list = (List) this.C;
                List list2 = (List) this.D;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((yt.b) it.next()).a));
                }
                List listG0 = h00.q.G0(arrayList);
                int iP = h00.d0.P(h00.r.q0(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP >= 16 ? iP : 16);
                for (Object obj2 : list2) {
                    linkedHashMap.put(new Integer(((bx.c) obj2).a), obj2);
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listG0.iterator();
                while (it2.hasNext()) {
                    bx.c cVar = (bx.c) linkedHashMap.get(new Integer(((Number) it2.next()).intValue()));
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                return new g00.q(boolValueOf, listG0, arrayList2);
            case 1:
                CustomerInfo customerInfo = (CustomerInfo) this.C;
                Offerings offerings = (Offerings) this.D;
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return new g00.q(customerInfo, offerings, Boolean.valueOf(z2));
            default:
                u30.b<PlayerItem> bVar = (u30.b) this.D;
                List list3 = (List) this.C;
                boolean z3 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                int iP2 = h00.d0.P(h00.r.q0(list3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP2 >= 16 ? iP2 : 16);
                for (Object obj3 : list3) {
                    yt.b bVar2 = (yt.b) obj3;
                    linkedHashMap2.put(new g00.k(new Integer(bVar2.a), new Long(bVar2.b)), obj3);
                }
                ArrayList arrayList3 = new ArrayList(h00.r.q0(bVar, 10));
                for (PlayerItem playerItemCopy$default : bVar) {
                    yt.b bVar3 = (yt.b) linkedHashMap2.get(new g00.k(new Integer(playerItemCopy$default.getReciterId()), new Long(playerItemCopy$default.getSurahId())));
                    String playerUrl = (!z3 || bVar3 == null) ? playerItemCopy$default.getPlayerUrl() : bVar3.f;
                    if (!kotlin.jvm.internal.m.a(playerItemCopy$default.getPlayerUri(), playerUrl)) {
                        playerItemCopy$default = PlayerItem.copy$default(playerItemCopy$default, 0L, null, null, null, 0, 0, null, null, null, playerUrl, null, 1535, null);
                    }
                    arrayList3.add(playerItemCopy$default);
                }
                return g4.d0(arrayList3);
        }
    }
}
