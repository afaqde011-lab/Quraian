package lp;

import a40.z;
import g00.b0;
import g2.t;
import ri.t1;
import u00.n;

public final class i extends m00.i implements n {
    public final int A;
    public Object B;
    public final boolean C;
    public final t D;

    public i(boolean z, t tVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = z;
        this.D = tVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                i iVar = new i(this.C, this.D, cVar, 0);
                iVar.B = obj;
                return iVar;
            case 1:
                i iVar2 = new i(this.C, this.D, cVar, 1);
                iVar2.B = obj;
                return iVar2;
            default:
                i iVar3 = new i(this.C, this.D, cVar, 2);
                iVar3.B = obj;
                return iVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                i iVar = (i) create(zVar, cVar);
                b0 b0Var = b0.a;
                iVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                i iVar2 = (i) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                iVar2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                i iVar3 = (i) create(zVar, cVar);
                b0 b0Var3 = b0.a;
                iVar3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        t tVar = this.D;
        boolean z = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (z) {
                    try {
                        t.a(tVar);
                    } catch (Throwable th) {
                        t1.s(th);
                    }
                }
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (z) {
                    try {
                        t.a(tVar);
                    } catch (Throwable th2) {
                        t1.s(th2);
                    }
                }
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (z) {
                    try {
                        t.a(tVar);
                    } catch (Throwable th3) {
                        t1.s(th3);
                    }
                }
                break;
        }
        return b0Var;
        return b0Var;
        return b0Var;
    }
}
