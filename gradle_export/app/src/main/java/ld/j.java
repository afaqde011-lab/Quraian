package ld;

import a40.z;
import g00.b0;
import ri.t1;
import u00.n;

public final class j extends m00.i implements n {
    public final int A;
    public final l B;
    public final String C;

    public j(l lVar, String str, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = lVar;
        this.C = str;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j(this.B, this.C, cVar, 0);
            case 1:
                return new j(this.B, this.C, cVar, 1);
            case 2:
                return new j(this.B, this.C, cVar, 2);
            default:
                return new j(this.B, this.C, cVar, 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                j jVarCreate = create(zVar, cVar);
                b0 b0Var = b0.a;
                jVarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                j jVarCreate2 = create(zVar, cVar);
                b0 b0Var2 = b0.a;
                jVarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                j jVarCreate3 = create(zVar, cVar);
                b0 b0Var3 = b0.a;
                jVarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                j jVarCreate4 = create(zVar, cVar);
                b0 b0Var4 = b0.a;
                jVarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        b0 b0Var = b0.a;
        String str = this.C;
        l lVar = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                lVar.f10277a.i(str);
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                lVar.f10277a.i(str);
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                lVar.f10277a.i(str);
                break;
            default:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                lVar.f10277a.i(str);
                break;
        }
        return b0Var;
    }
}
