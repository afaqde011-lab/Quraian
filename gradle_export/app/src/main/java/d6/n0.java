package d6;

import android.os.Bundle;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.Iterator;
import java.util.List;

public final class n0 extends m00.i implements u00.p {
    public final int A;
    public int B;
    public Object C;
    public Object D;

    public n0(int i10, k00.c cVar) {
        super(i10, cVar);
        this.A = 2;
    }

    public n0(Object obj, k00.c cVar, int i10) {
        super(4, cVar);
        this.A = i10;
        this.D = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                ((Boolean) obj3).getClass();
                n0 n0Var = new n0((Bundle) this.D, (k00.c) obj4, 0);
                n0Var.C = (r) obj2;
                return n0Var.invokeSuspend(g00.b0.a);
            case 1:
                ((Boolean) obj3).getClass();
                n0 n0Var2 = new n0((String) this.D, (k00.c) obj4, 1);
                n0Var2.C = (r) obj2;
                return n0Var2.invokeSuspend(g00.b0.a);
            default:
                int iIntValue = ((Number) obj2).intValue();
                n0 n0Var3 = new n0(4, (k00.c) obj4);
                n0Var3.C = (PlayerItem) obj;
                n0Var3.B = iIntValue;
                n0Var3.D = (List) obj3;
                return n0Var3.invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        boolean z10 = true;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                r rVar = (r) this.C;
                Bundle bundle = (Bundle) this.D;
                this.B = 1;
                rVar.getClass();
                Object objF = rVar.f(new k(bundle), this);
                if (objF != aVar) {
                    objF = b0Var;
                }
                return objF == aVar ? aVar : b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                r rVar2 = (r) this.C;
                String str = (String) this.D;
                this.B = 1;
                rVar2.getClass();
                Object objF2 = rVar2.f(new j(str), this);
                if (objF2 != aVar2) {
                    objF2 = b0Var;
                }
                return objF2 == aVar2 ? aVar2 : b0Var;
            default:
                PlayerItem playerItem = (PlayerItem) this.C;
                int i13 = this.B;
                List list = (List) this.D;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                if (playerItem == null || (list != null && list.isEmpty())) {
                    z10 = false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((zq.a) it.next()).a == playerItem.getSurahId()) {
                        }
                    }
                    z10 = false;
                }
                return new g00.k(Boolean.valueOf(z10), new Integer(i13));
        }
    }
}
