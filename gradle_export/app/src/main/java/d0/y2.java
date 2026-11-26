package d0;

public final class y2 extends m00.i implements u00.n {
    public final int A;
    public final t1 B;

    public y2(t1 t1Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = t1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y2(this.B, cVar, 0);
            case 1:
                return new y2(this.B, cVar, 1);
            case 2:
                return new y2(this.B, cVar, 2);
            case 3:
                return new y2(this.B, cVar, 3);
            case 4:
                return new y2(this.B, cVar, 4);
            case 5:
                return new y2(this.B, cVar, 5);
            case 6:
                return new y2(this.B, cVar, 6);
            default:
                return new y2(this.B, cVar, 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                y2 y2VarCreate = create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                y2VarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                y2 y2VarCreate2 = create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                y2VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                y2 y2VarCreate3 = create(zVar, cVar);
                g00.b0 b0Var3 = g00.b0.a;
                y2VarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                y2 y2VarCreate4 = create(zVar, cVar);
                g00.b0 b0Var4 = g00.b0.a;
                y2VarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                y2 y2VarCreate5 = create(zVar, cVar);
                g00.b0 b0Var5 = g00.b0.a;
                y2VarCreate5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                y2 y2VarCreate6 = create(zVar, cVar);
                g00.b0 b0Var6 = g00.b0.a;
                y2VarCreate6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                y2 y2VarCreate7 = create(zVar, cVar);
                g00.b0 b0Var7 = g00.b0.a;
                y2VarCreate7.invokeSuspend(b0Var7);
                return b0Var7;
            default:
                y2 y2VarCreate8 = create(zVar, cVar);
                g00.b0 b0Var8 = g00.b0.a;
                y2VarCreate8.invokeSuspend(b0Var8);
                return b0Var8;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        t1 t1Var = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                t1Var.a();
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                t1Var.d();
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                t1Var.d();
                break;
            case 3:
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                t1Var.a();
                break;
            case 4:
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                t1Var.d();
                break;
            case 5:
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                t1Var.d();
                break;
            case 6:
                l00.a aVar7 = l00.a.A;
                ri.t1.O(obj);
                t1Var.a();
                break;
            default:
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                t1Var.d();
                break;
        }
        return b0Var;
    }
}
