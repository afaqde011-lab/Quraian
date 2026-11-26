package bt;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.CustomerInfo;

public final class i2 extends m00.i implements u00.o {
    public final int A;
    public boolean B;
    public Object C;

    public i2(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i2 i2Var = new i2(3, (k00.c) obj3, 0);
                i2Var.B = zBooleanValue;
                i2Var.C = (ss.z) obj2;
                return i2Var.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                i2 i2Var2 = new i2(3, (k00.c) obj3, 1);
                i2Var2.C = (PlayerItem) obj;
                i2Var2.B = zBooleanValue2;
                return i2Var2.invokeSuspend(g00.b0.a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                i2 i2Var3 = new i2(3, (k00.c) obj3, 2);
                i2Var3.B = zBooleanValue3;
                i2Var3.C = (ss.v) obj2;
                return i2Var3.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                i2 i2Var4 = new i2(3, (k00.c) obj3, 3);
                i2Var4.C = (CustomerInfo) obj;
                i2Var4.B = zBooleanValue4;
                return i2Var4.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                boolean z = this.B;
                ss.z zVar = (ss.z) this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                if (z) {
                    return zVar;
                }
                return null;
            case 1:
                PlayerItem playerItem = (PlayerItem) this.C;
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(playerItem, Boolean.valueOf(z2));
            case 2:
                boolean z3 = this.B;
                ss.v vVar = (ss.v) this.C;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                if (z3) {
                    return vVar;
                }
                return null;
            default:
                CustomerInfo customerInfo = (CustomerInfo) this.C;
                boolean z4 = this.B;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                return Boolean.valueOf((customerInfo == null || z4) ? false : true);
        }
    }
}
