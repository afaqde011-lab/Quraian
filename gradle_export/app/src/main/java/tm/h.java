package tm;

import a40.z;
import g00.b0;
import ri.t1;
import ta.c0;
import u00.k;
import u00.n;

public final class h extends m00.i implements n {
    public final int A;
    public Object B;
    public final i C;

    public h(i iVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = iVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                h hVar = new h(this.C, cVar, 0);
                hVar.B = obj;
                return hVar;
            case 1:
                h hVar2 = new h(this.C, cVar, 1);
                hVar2.B = obj;
                return hVar2;
            default:
                h hVar3 = new h(this.C, cVar, 2);
                hVar3.B = obj;
                return hVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                h hVar = (h) create(zVar, cVar);
                b0 b0Var = b0.a;
                hVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                h hVar2 = (h) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                hVar2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                h hVar3 = (h) create(zVar, cVar);
                b0 b0Var3 = b0.a;
                hVar3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        k00.c cVar = null;
        i iVar = this.C;
        z zVar = (z) this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 0), 31);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 1), 31);
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 2), 31);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 3), 31);
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 4), 31);
                c0.M(zVar, (k00.i) null, (n) null, (k) null, new g(iVar, cVar, 5), 31);
                break;
        }
        return b0Var;
    }
}
