package du;

import androidx.lifecycle.u0;
import com.mchutov.quranify.main.presentation.analytics.PaywallEvent;
import ri.t1;

public final class j0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final t0 C;

    public j0(t0 t0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                j0 j0Var = new j0(this.C, cVar, 0);
                j0Var.B = obj;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(this.C, cVar, 1);
                j0Var2.B = obj;
                return j0Var2;
            default:
                j0 j0Var3 = new j0(this.C, cVar, 2);
                j0Var3.B = obj;
                return j0Var3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                j0 j0Var = (j0) create(obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                j0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                j0 j0Var2 = (j0) create((g00.q) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                j0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                j0 j0Var3 = (j0) create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                j0Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        t0 t0Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                t0Var.l(new i(obj2));
                break;
            case 1:
                g00.q qVar = (g00.q) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                t0Var.p((String) qVar.C, ((Boolean) qVar.A).booleanValue(), ((Boolean) qVar.B).booleanValue());
                break;
            default:
                g00.k kVar = (g00.k) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                zp.a aVar4 = (zp.a) kVar.A;
                int i2 = 0;
                boolean z = aVar4.a && !((Boolean) kVar.B).booleanValue();
                zp.b bVar = aVar4.b;
                pm.b bVar2 = t0Var.c;
                if (z && !((n0) bVar2.d.getValue()).k) {
                    t0Var.v.logEvent(new PaywallEvent.PaywallOpened(bVar.A));
                }
                ta.c0.M(u0.i(t0Var), (k00.i) null, (u00.n) null, (u00.k) null, new o0(t0Var, null, i2), 31);
                t0Var.i(n0.a((n0) bVar2.d.getValue(), false, null, false, false, false, false, z, false, z, false, null, false, null, null, null, 129791));
                break;
        }
        return b0Var;
    }
}
