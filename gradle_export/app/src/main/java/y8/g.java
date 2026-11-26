package y8;

import h00.q;
import h1.v0;
import java.util.List;
import u00.n;
import z1.l;

public final class g {

    public final int f16837a;

    public final Object f16838b;

    public g(Object obj, int i10) {
        this.f16837a = i10;
        this.f16838b = obj;
    }

    public void a() {
        int i10 = this.f16837a;
        Object obj = this.f16838b;
        switch (i10) {
            case 1:
                v0 v0Var = (v0) obj;
                synchronized (l.f17038c) {
                    l.f17044i = q.V0((List) l.f17044i, v0Var);
                }
                l.a();
                return;
            default:
                n nVar = (n) obj;
                synchronized (l.f17038c) {
                    l.f17043h = q.V0((List) l.f17043h, nVar);
                }
                return;
        }
    }
}
