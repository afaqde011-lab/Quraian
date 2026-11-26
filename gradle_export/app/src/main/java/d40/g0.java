package d40;

import android.util.Log;
import bt.a2;
import java.util.List;
import java.util.Map;
import ri.t1;

public final class g0 extends m00.i implements u00.o {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public final Object E;

    public g0(is.c1 c1Var, int i, k00.c cVar) {
        super(3, cVar);
        this.A = 2;
        this.E = c1Var;
        this.B = i;
    }

    public g0(Object obj, k00.c cVar, int i) {
        super(3, cVar);
        this.A = i;
        this.E = obj;
    }

    public g0(k00.c cVar, Object obj, int i) {
        super(3, cVar);
        this.A = i;
        this.E = obj;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                g0 g0Var = new g0(this.E, (k00.c) obj3, 0);
                g0Var.C = (j) obj;
                g0Var.D = obj2;
                return g0Var.invokeSuspend(g00.b0.a);
            case 1:
                g0 g0Var2 = new g0((u00.o) this.E, (k00.c) obj3, 1);
                g0Var2.C = (j) obj;
                g0Var2.D = (Object[]) obj2;
                return g0Var2.invokeSuspend(g00.b0.a);
            case 2:
                g0 g0Var3 = new g0((is.c1) this.E, this.B, (k00.c) obj3);
                g0Var3.C = (ss.v) obj;
                g0Var3.D = (List) obj2;
                return g0Var3.invokeSuspend(g00.b0.a);
            case 3:
                g0 g0Var4 = new g0((k00.c) obj3, (jo.h) this.E, 3);
                g0Var4.C = (j) obj;
                g0Var4.D = obj2;
                return g0Var4.invokeSuspend(g00.b0.a);
            case 4:
                g0 g0Var5 = new g0((k00.c) obj3, (jr.b) this.E, 4);
                g0Var5.C = (j) obj;
                g0Var5.D = obj2;
                return g0Var5.invokeSuspend(g00.b0.a);
            default:
                g0 g0Var6 = new g0((wj.x0) this.E, (k00.c) obj3, 5);
                g0Var6.C = (j) obj;
                g0Var6.D = (Throwable) obj2;
                return g0Var6.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        int i = this.A;
        ?? r3 = this.E;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    jVar = (j) this.C;
                    Object obj2 = this.D;
                    this.C = jVar;
                    this.B = 1;
                    obj = r3.invoke(obj2, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                jVar = (j) this.C;
                t1.O(obj);
                this.C = null;
                this.B = 2;
                if (jVar.emit(obj, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    j jVar3 = (j) this.C;
                    Object[] objArr = (Object[]) this.D;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.C = jVar3;
                    this.B = 1;
                    Object objInvoke = ((u00.o) r3).invoke(obj3, obj4, this);
                    if (objInvoke != aVar2) {
                        jVar2 = jVar3;
                        obj = objInvoke;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                jVar2 = (j) this.C;
                t1.O(obj);
                this.C = null;
                this.B = 2;
                if (jVar2.emit(obj, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
            case 2:
                ss.v vVar = (ss.v) this.C;
                List list = (List) this.D;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return (vVar == null || list.isEmpty()) ? vVar : fs.l.d(vVar, list, this.B);
            case 3:
                jo.h hVar = (jo.h) r3;
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                j jVar4 = (j) this.C;
                String str = (String) this.D;
                i a2Var = (str == null || str.equals(hVar.b.a())) ? new a2(null, 1) : new jo.g(hVar.a.e(str, null), str, 0);
                this.C = null;
                this.D = null;
                this.B = 1;
                return o.q(jVar4, a2Var, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                j jVar5 = (j) this.C;
                a2 a2Var2 = new a2(new b1.f(((Boolean) this.D).booleanValue() ? 1000L : 60000L, (k00.c) null));
                this.C = null;
                this.D = null;
                this.B = 1;
                return o.q(jVar5, a2Var2, this) == aVar5 ? aVar5 : b0Var;
            default:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                j jVar6 = (j) this.C;
                Throwable th = (Throwable) this.D;
                wj.j0 j0VarA = ((wj.x0) r3).b.a((wj.j0) null);
                wj.f0 f0Var = new wj.f0(j0VarA, (wj.a1) null, (Map) null);
                Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + j0VarA.a);
                this.C = null;
                this.B = 1;
                return jVar6.emit(f0Var, this) == aVar6 ? aVar6 : b0Var;
        }
    }
}
