package d0;

import java.io.Serializable;

public final class v1 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public Object C;
    public final float D;
    public Object E;
    public Serializable F;

    public v1(float f3, k00.c cVar) {
        super(2, cVar);
        this.D = f3;
    }

    public v1(float f3, x.i iVar, kotlin.jvm.internal.w wVar, k00.c cVar) {
        super(2, cVar);
        this.D = f3;
        this.E = iVar;
        this.F = wVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                v1 v1Var = new v1(this.D, (x.i) this.E, this.F, cVar);
                v1Var.C = obj;
                return v1Var;
            default:
                v1 v1Var2 = new v1(this.D, cVar);
                v1Var2.C = obj;
                return v1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        y1 y1Var = (y1) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return create(y1Var, cVar).invokeSuspend(g00.b0.a);
            default:
                create(y1Var, cVar).invokeSuspend(g00.b0.a);
                return l00.a.A;
        }
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        kotlin.jvm.internal.y yVar3;
        l3 l3Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    y1 y1Var = (y1) this.C;
                    x.i iVar = (x.i) this.E;
                    al.i iVar2 = new al.i(this.F, y1Var, 7);
                    this.B = 1;
                    if (x.c.f(0.0f, this.D, iVar, iVar2, this, 4) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                y1 y1Var2 = (y1) this.C;
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    yVar = new kotlin.jvm.internal.y();
                    u00.k aVar3 = new wp.a(1);
                    this.C = y1Var2;
                    this.E = yVar;
                    this.F = yVar;
                    this.B = 1;
                    obj = l1.q.u(getContext()).b0(aVar3, this);
                    if (obj != aVar2) {
                        yVar2 = yVar;
                    }
                    return aVar2;
                }
                if (i11 == 1) {
                    yVar = (kotlin.jvm.internal.y) this.F;
                    yVar2 = (kotlin.jvm.internal.y) this.E;
                    ri.t1.O(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar3 = (kotlin.jvm.internal.y) this.E;
                    ri.t1.O(obj);
                }
                do {
                    l3Var = new l3(y1Var2, yVar3, this.D);
                    this.C = y1Var2;
                    this.E = yVar3;
                    this.F = null;
                    this.B = 2;
                } while (l1.q.u(getContext()).b0(l3Var, this) != aVar2);
                return aVar2;
                yVar.A = ((Number) obj).longValue();
                yVar3 = yVar2;
                do {
                    l3Var = new l3(y1Var2, yVar3, this.D);
                    this.C = y1Var2;
                    this.E = yVar3;
                    this.F = null;
                    this.B = 2;
                } while (l1.q.u(getContext()).b0(l3Var, this) != aVar2);
                return aVar2;
        }
    }
}
