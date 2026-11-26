package bv;

import com.google.android.gms.internal.measurement.g4;

public final class e2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final e3 D;

    public e2(e3 e3Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = e3Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                e2 e2Var = new e2(this.D, cVar, 0);
                e2Var.C = obj;
                return e2Var;
            default:
                e2 e2Var2 = new e2(this.D, cVar, 1);
                e2Var2.C = obj;
                return e2Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((e2) create((g00.k) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((e2) create((ru.e) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Integer num;
        switch (this.A) {
            case 0:
                e3 e3Var = this.D;
                pm.b bVar = e3Var.c;
                g00.k kVar = (g00.k) this.C;
                l00.a aVar = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    ri.t1.O(obj);
                    Long l = (Long) kVar.A;
                    Integer num2 = (Integer) kVar.B;
                    e3Var.i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16252927));
                    if (l == null || num2 == null) {
                        e3Var.i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, g4.d0(h00.x.A), null, g4.e0(h00.y.A), null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, 268435455, 16777214));
                    } else {
                        long jLongValue = l.longValue();
                        int iIntValue = num2.intValue();
                        this.C = null;
                        this.B = 1;
                        if (e3.l(e3Var, jLongValue, iIntValue, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                ru.e eVar = (ru.e) this.C;
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    boolean z = eVar.d;
                    boolean z2 = eVar.a;
                    e3 e3Var2 = this.D;
                    if (z && (num = eVar.c) != null) {
                        int iIntValue2 = num.intValue();
                        String str = eVar.b;
                        this.C = null;
                        this.B = 2;
                        if (e3Var2.D(iIntValue2, z2, str, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (!z2) {
                        this.C = null;
                        this.B = 1;
                        if (e3Var2.r(this) == aVar2) {
                            return aVar2;
                        }
                    } else if (!z) {
                        e3Var2.i.g = false;
                        e3Var2.i(o1.a((o1) e3Var2.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16777199));
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
        }
    }
}
