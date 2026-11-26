package du;

import com.mchutov.core.analytics.domain.model.QuranifyAnalyticsProperty;
import ri.t1;

public final class s0 extends m00.i implements u00.n {
    public Object A;
    public final t0 B;

    public s0(t0 t0Var, k00.c cVar) {
        super(2, cVar);
        this.B = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        s0 s0Var = new s0(this.B, cVar);
        s0Var.A = obj;
        return s0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        s0 s0Var = (s0) create((bx.c) obj, (k00.c) obj2);
        g00.b0 b0Var = g00.b0.a;
        s0Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String str;
        bx.c cVar = (bx.c) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (cVar != null && (str = cVar.b) != null) {
            ((tk.b) this.B.l).a(new QuranifyAnalyticsProperty.PreferredReciter(str));
        }
        return g00.b0.a;
    }
}
