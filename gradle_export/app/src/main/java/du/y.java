package du;

import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import d40.d1;
import d40.p1;
import ri.t1;

public final class y extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final MainActivity C;

    public y(MainActivity mainActivity, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = mainActivity;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y(this.C, cVar, 0);
            case 1:
                return new y(this.C, cVar, 1);
            case 2:
                return new y(this.C, cVar, 2);
            case 3:
                return new y(this.C, cVar, 3);
            case 4:
                return new y(this.C, cVar, 4);
            case 5:
                return new y(this.C, cVar, 5);
            default:
                return new y(this.C, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 1:
                ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 2:
                ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 3:
                ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 4:
                return ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 5:
                ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            default:
                return ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        MainActivity mainActivity = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                d1 d1Var = ((bq.a) ((aq.a) mainActivity.A.getValue())).g;
                x xVar = new x(mainActivity, 0);
                this.B = 1;
                d1Var.getClass();
                d1.k(d1Var, xVar, this);
                return aVar;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                d1 d1Var2 = ((bq.a) ((aq.a) mainActivity.A.getValue())).d;
                x xVar2 = new x(mainActivity, 1);
                this.B = 1;
                d1Var2.getClass();
                d1.k(d1Var2, xVar2, this);
                return aVar2;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                d1 d1Var3 = ((bq.a) ((aq.a) mainActivity.A.getValue())).b;
                x xVar3 = new x(mainActivity, 2);
                this.B = 1;
                d1Var3.getClass();
                d1.k(d1Var3, xVar3, this);
                return aVar3;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i5 = this.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                d1 d1Var4 = ((bq.a) ((aq.a) mainActivity.A.getValue())).c;
                x xVar4 = new x(mainActivity, 3);
                this.B = 1;
                d1Var4.getClass();
                d1.k(d1Var4, xVar4, this);
                return aVar4;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i7 = MainActivity.R;
                p1 p1Var = ((t0) mainActivity.Q.getValue()).c.d;
                a1.c0 c0Var = new a1.c0(mainActivity, (k00.c) null, 15);
                this.B = 1;
                return d40.o.i(p1Var, c0Var, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i8 = this.B;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                d1 d1Var5 = ((bq.a) ((aq.a) mainActivity.A.getValue())).e;
                x xVar5 = new x(mainActivity, 4);
                this.B = 1;
                d1Var5.getClass();
                d1.k(d1Var5, xVar5, this);
                return aVar6;
            default:
                l00.a aVar7 = l00.a.A;
                int i9 = this.B;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                nw.b bVar = (nw.b) mainActivity.I.getValue();
                this.B = 1;
                boolean zAreNotificationsEnabled = new n4.p(bVar.a).b.areNotificationsEnabled();
                if (kotlin.jvm.internal.m.a(bVar.a() + "|" + zAreNotificationsEnabled, bVar.d.a.getString("push_permission_fingerprint", null)) || (objB = bVar.b(this)) != aVar7) {
                    objB = b0Var;
                }
                return objB == aVar7 ? aVar7 : b0Var;
        }
    }
}
