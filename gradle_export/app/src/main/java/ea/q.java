package ea;

import a1.q1;
import androidx.glance.session.SessionWorker;
import g1.k8;
import java.util.List;
import z.b1;

public final class q extends m00.i implements u00.k {
    public final int A;
    public int B;
    public Object C;
    public final Object D;
    public final Object E;

    public q(r rVar, ca.a0 a0Var, u00.n nVar, k00.c cVar) {
        super(1, cVar);
        this.A = 0;
        this.C = rVar;
        this.D = a0Var;
        this.E = (m00.i) nVar;
    }

    public q(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public q(jq.e eVar, String str, k00.c cVar) {
        super(1, cVar);
        this.A = 3;
        this.D = eVar;
        this.E = str;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new q((r) this.C, (ca.a0) this.D, (m00.i) this.E, cVar);
            case 1:
                return new q((k8) this.C, (q1) this.D, (b1) this.E, cVar, 1);
            case 2:
                return new q((fc.n) this.C, this.D, (u00.p) this.E, cVar, 2);
            case 3:
                return new q((jq.e) this.D, (String) this.E, cVar);
            case 4:
                return new q((l6.y) this.C, (SessionWorker) this.D, (d6.r) this.E, cVar, 4);
            default:
                return new q((vn.b0) this.C, (List) this.D, (List) this.E, cVar, 5);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(cVar).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: ea.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
