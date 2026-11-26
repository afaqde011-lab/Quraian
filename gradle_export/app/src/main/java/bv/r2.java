package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class r2 extends m00.i implements u00.p {
    public final int A;
    public Object B;
    public boolean C;
    public boolean D;

    public r2(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                r2 r2Var = new r2(4, (k00.c) obj4, 0);
                r2Var.B = (PlayerItem) obj;
                r2Var.C = zBooleanValue;
                r2Var.D = zBooleanValue2;
                return r2Var.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                r2 r2Var2 = new r2(4, (k00.c) obj4, 1);
                r2Var2.B = (PlayerItem) obj;
                r2Var2.C = zBooleanValue3;
                r2Var2.D = zBooleanValue4;
                return r2Var2.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                r2 r2Var3 = new r2(4, (k00.c) obj4, 2);
                r2Var3.C = zBooleanValue5;
                r2Var3.D = zBooleanValue6;
                r2Var3.B = (String) obj3;
                return r2Var3.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                PlayerItem playerItem = (PlayerItem) this.B;
                boolean z = this.C;
                boolean z2 = this.D;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                return new dv.d(playerItem, z, z2);
            case 1:
                PlayerItem playerItem2 = (PlayerItem) this.B;
                boolean z3 = this.C;
                boolean z4 = this.D;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return new qr.m(playerItem2, z4, z3);
            default:
                boolean z5 = this.C;
                boolean z6 = this.D;
                String str = (String) this.B;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(new ot.b(z5, z6), str);
        }
    }
}
