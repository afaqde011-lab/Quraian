package j1;

import a40.z;
import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final q C;

    public n(q qVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = qVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new n(this.C, cVar, 0);
            case 1:
                return new n(this.C, cVar, 1);
            default:
                return new n(this.C, cVar, 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                b0 b0Var = b0.a;
                if (i10 == 0) {
                    t1.O(obj);
                    q qVar = this.C;
                    r rVar = qVar.T;
                    float f3 = qVar.Q ? 1.0f : 0.0f;
                    this.B = 1;
                    Object objF = rVar.f7852a.f(new Float(f3), this);
                    if (objF != aVar) {
                        objF = b0Var;
                    }
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                b0 b0Var2 = b0.a;
                if (i11 == 0) {
                    t1.O(obj);
                    q qVar2 = this.C;
                    if (!qVar2.T.f7852a.e()) {
                        r rVar2 = qVar2.T;
                        float fH = qVar2.W.h() / qVar2.H1();
                        this.B = 1;
                        Object objF2 = rVar2.f7852a.f(new Float(fH), this);
                        if (objF2 != aVar2) {
                            objF2 = b0Var2;
                        }
                        if (objF2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
            default:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    q qVar3 = this.C;
                    if (qVar3.Q) {
                        this.B = 2;
                        if (q.E1(qVar3, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        this.B = 1;
                        if (qVar3.F1(this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
