package jp;

import ri.t1;

public final class z extends m00.i implements u00.k {
    public final int A;
    public final e0 B;

    public z(e0 e0Var, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.B = e0Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new z(this.B, cVar, 0);
            case 1:
                return new z(this.B, cVar, 1);
            case 2:
                return new z(this.B, cVar, 2);
            case 3:
                return new z(this.B, cVar, 3);
            case 4:
                return new z(this.B, cVar, 4);
            case 5:
                return new z(this.B, cVar, 5);
            case 6:
                return new z(this.B, cVar, 6);
            default:
                return new z(this.B, cVar, 7);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                z zVar = (z) create(cVar);
                g00.b0 b0Var = g00.b0.a;
                zVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                z zVar2 = (z) create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                zVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                z zVar3 = (z) create(cVar);
                g00.b0 b0Var3 = g00.b0.a;
                zVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                z zVar4 = (z) create(cVar);
                g00.b0 b0Var4 = g00.b0.a;
                zVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                z zVar5 = (z) create(cVar);
                g00.b0 b0Var5 = g00.b0.a;
                zVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                z zVar6 = (z) create(cVar);
                g00.b0 b0Var6 = g00.b0.a;
                zVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                z zVar7 = (z) create(cVar);
                g00.b0 b0Var7 = g00.b0.a;
                zVar7.invokeSuspend(b0Var7);
                return b0Var7;
            default:
                z zVar8 = (z) create(cVar);
                g00.b0 b0Var8 = g00.b0.a;
                zVar8.invokeSuspend(b0Var8);
                return b0Var8;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        e0 e0Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, "", null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073725311));
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                e0Var.l = false;
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            case 3:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            case 4:
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            case 5:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                e0Var.k = false;
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            case 6:
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
            default:
                l00.a aVar8 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741822));
                break;
        }
        return b0Var;
    }
}
