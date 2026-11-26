package jp;

import ri.t1;

public final class d0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e0 C;
    public final String D;

    public d0(e0 e0Var, String str, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
        this.D = str;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d0(this.C, this.D, cVar, 0);
            default:
                return new d0(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((d0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        String str;
        Integer num;
        int iIntValue;
        ep.s sVar;
        String str2;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                e0 e0Var = this.C;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                e0Var.i(x.b((x) e0Var.c.d.getValue(), true, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741758));
                wo.b0 b0Var = e0Var.e;
                String str3 = ((x) e0Var.c.d.getValue()).c;
                this.B = 1;
                if (b0Var.t(str3, this.D, this) == aVar) {
                    return aVar;
                }
                e0Var.f.signInCompleted("email");
                v vVar = new v(e0Var.d.a(2131886222, new Object[0]));
                this.B = 2;
                if (e0Var.c.a(vVar, this) == aVar) {
                    return aVar;
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                e0 e0Var2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    pm.b bVar = e0Var2.c;
                    wo.b0 b0Var2 = e0Var2.e;
                    pm.b bVar2 = e0Var2.c;
                    e0Var2.i(x.b((x) bVar.d.getValue(), true, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073692670));
                    boolean z = ((x) bVar2.d.getValue()).k;
                    String str4 = this.D;
                    if (z) {
                        String str5 = ((x) bVar2.d.getValue()).j;
                        this.B = 1;
                        objB = b0Var2.B(str5, str4, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                        ep.t tVar = (ep.t) objB;
                        x xVar = (x) e0Var2.c.d.getValue();
                        str = tVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String str6 = str;
                        num = tVar.d;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 60;
                        }
                        e0Var2.i(x.b(xVar, false, null, null, null, null, null, null, null, null, str6, false, iIntValue, 0, false, false, true, null, null, null, null, null, null, null, 0, null, null, false, 1073706494));
                        e0.j(e0Var2);
                    } else {
                        String str7 = ((x) bVar2.d.getValue()).i;
                        this.B = 2;
                        objA = b0Var2.A(str7, str4, this);
                        if (objA == aVar2) {
                            return aVar2;
                        }
                        sVar = (ep.s) objA;
                        if (sVar.b.equals("email_verified")) {
                            x xVar2 = (x) e0Var2.c.d.getValue();
                            str2 = sVar.a;
                            if (str2 == null) {
                                str2 = ((x) e0Var2.c.d.getValue()).i;
                            }
                            e0Var2.i(x.b(xVar2, false, null, null, null, null, null, null, null, str2, null, false, 0, 0, false, false, true, null, null, null, null, null, null, null, 0, null, null, false, 1073708798));
                            e0.j(e0Var2);
                        } else {
                            e0Var2.n(null);
                        }
                    }
                } else if (i2 == 1) {
                    t1.O(obj);
                    objB = obj;
                    ep.t tVar2 = (ep.t) objB;
                    x xVar3 = (x) e0Var2.c.d.getValue();
                    str = tVar2.a;
                    if (str == null) {
                        str = "";
                    }
                    String str8 = str;
                    num = tVar2.d;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 60;
                    }
                    e0Var2.i(x.b(xVar3, false, null, null, null, null, null, null, null, null, str8, false, iIntValue, 0, false, false, true, null, null, null, null, null, null, null, 0, null, null, false, 1073706494));
                    e0.j(e0Var2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objA = obj;
                    sVar = (ep.s) objA;
                    if (sVar.b.equals("email_verified")) {
                        x xVar4 = (x) e0Var2.c.d.getValue();
                        str2 = sVar.a;
                        if (str2 == null) {
                            str2 = ((x) e0Var2.c.d.getValue()).i;
                        }
                        e0Var2.i(x.b(xVar4, false, null, null, null, null, null, null, null, str2, null, false, 0, 0, false, false, true, null, null, null, null, null, null, null, 0, null, null, false, 1073708798));
                        e0.j(e0Var2);
                    } else {
                        e0Var2.n(null);
                    }
                }
                return g00.b0.a;
        }
    }
}
