package ha;

import ca.a0;
import ca.b0;
import ca.t;
import ea.e0;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.k;
import u00.n;

public final class b extends m00.i implements n {
    public final int A;
    public a0 B;
    public int C;
    public Object D;
    public final boolean E;
    public final boolean F;
    public final t G;
    public final k H;

    public b(boolean z10, boolean z11, t tVar, k00.c cVar, k kVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = z10;
        this.F = z11;
        this.G = tVar;
        this.H = kVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                b bVar = new b(this.E, this.F, this.G, cVar, this.H, 0);
                bVar.D = obj;
                return bVar;
            default:
                b bVar2 = new b(this.E, this.F, this.G, cVar, this.H, 1);
                bVar2.D = obj;
                return bVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(b0Var, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        b0 b0Var;
        a0 a0Var2;
        b0 b0Var2;
        b0 b0Var3;
        Boolean boolB;
        Object obj2;
        a0 a0Var3;
        b0 b0Var4;
        a0 a0Var4;
        b0 b0Var5;
        b0 b0Var6;
        Boolean boolB2;
        Object obj3;
        switch (this.A) {
            case 0:
                Boolean bool = l00.a.A;
                int i10 = this.C;
                k kVar = this.H;
                t tVar = this.G;
                boolean z10 = this.F;
                if (i10 == 0) {
                    t1.O(obj);
                    b0 b0Var7 = (b0) this.D;
                    if (!this.E) {
                        m.c(b0Var7, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return kVar.invoke(((e0) b0Var7).d());
                    }
                    a0Var = z10 ? a0.A : a0.B;
                    if (z10) {
                        a0 a0Var5 = a0Var;
                        b0Var = b0Var7;
                        a0Var2 = a0Var5;
                    } else {
                        this.D = b0Var7;
                        this.B = a0Var;
                        this.C = 1;
                        Boolean boolB3 = b0Var7.b(this);
                        if (boolB3 == bool) {
                            return bool;
                        }
                        b0Var2 = b0Var7;
                        obj = boolB3;
                    }
                    a aVar = new a(0, null, kVar);
                    this.D = b0Var;
                    this.B = null;
                    this.C = 3;
                    obj = b0Var.a(a0Var2, aVar, this);
                    if (obj == bool) {
                        return bool;
                    }
                    if (!z10) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB = b0Var.b(this);
                    if (boolB == bool) {
                        return bool;
                    }
                    obj2 = obj;
                    obj = boolB;
                    if (((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    ca.g gVarG = tVar.g();
                    gVarG.f3039b.e(gVarG.f3042e, gVarG.f3043f);
                    return obj2;
                }
                if (i10 == 1) {
                    a0Var = this.B;
                    b0Var2 = (b0) this.D;
                    t1.O(obj);
                } else if (i10 == 2) {
                    a0Var = this.B;
                    b0Var3 = (b0) this.D;
                    t1.O(obj);
                    a0Var2 = a0Var;
                    b0Var = b0Var3;
                    a aVar2 = new a(0, null, kVar);
                    this.D = b0Var;
                    this.B = null;
                    this.C = 3;
                    obj = b0Var.a(a0Var2, aVar2, this);
                    if (obj == bool) {
                        return bool;
                    }
                    if (!z10) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB = b0Var.b(this);
                    if (boolB == bool) {
                        return bool;
                    }
                    obj2 = obj;
                    obj = boolB;
                } else if (i10 == 3) {
                    b0Var = (b0) this.D;
                    t1.O(obj);
                    if (!z10) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB = b0Var.b(this);
                    if (boolB == bool) {
                        return bool;
                    }
                    obj2 = obj;
                    obj = boolB;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = this.D;
                    t1.O(obj);
                    obj2 = obj4;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                ca.g gVarG2 = tVar.g();
                gVarG2.f3039b.e(gVarG2.f3042e, gVarG2.f3043f);
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    a0Var2 = a0Var;
                    b0Var = b0Var2;
                } else {
                    ca.g gVarG3 = tVar.g();
                    this.D = b0Var2;
                    this.B = a0Var;
                    this.C = 2;
                    Object objF = gVarG3.f3039b.f(this);
                    if (objF != bool) {
                        objF = g00.b0.a;
                    }
                    if (objF == bool) {
                        return bool;
                    }
                    b0Var3 = b0Var2;
                    a0Var2 = a0Var;
                    b0Var = b0Var3;
                }
                a aVar3 = new a(0, null, kVar);
                this.D = b0Var;
                this.B = null;
                this.C = 3;
                obj = b0Var.a(a0Var2, aVar3, this);
                if (obj == bool) {
                    return bool;
                }
                if (!z10) {
                    return obj;
                }
                this.D = obj;
                this.C = 4;
                boolB = b0Var.b(this);
                if (boolB == bool) {
                    return bool;
                }
                obj2 = obj;
                obj = boolB;
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                ca.g gVarG4 = tVar.g();
                gVarG4.f3039b.e(gVarG4.f3042e, gVarG4.f3043f);
                return obj2;
            default:
                Boolean bool2 = l00.a.A;
                int i11 = this.C;
                k kVar2 = this.H;
                t tVar2 = this.G;
                boolean z11 = this.F;
                if (i11 == 0) {
                    t1.O(obj);
                    b0 b0Var8 = (b0) this.D;
                    if (!this.E) {
                        m.c(b0Var8, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return kVar2.invoke(((e0) b0Var8).d());
                    }
                    a0Var3 = z11 ? a0.A : a0.B;
                    if (z11) {
                        a0 a0Var6 = a0Var3;
                        b0Var4 = b0Var8;
                        a0Var4 = a0Var6;
                    } else {
                        this.D = b0Var8;
                        this.B = a0Var3;
                        this.C = 1;
                        Boolean boolB4 = b0Var8.b(this);
                        if (boolB4 == bool2) {
                            return bool2;
                        }
                        b0Var5 = b0Var8;
                        obj = boolB4;
                    }
                    a aVar4 = new a(1, null, kVar2);
                    this.D = b0Var4;
                    this.B = null;
                    this.C = 3;
                    obj = b0Var4.a(a0Var4, aVar4, this);
                    if (obj == bool2) {
                        return bool2;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB2 = b0Var4.b(this);
                    if (boolB2 == bool2) {
                        return bool2;
                    }
                    obj3 = obj;
                    obj = boolB2;
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    ca.g gVarG5 = tVar2.g();
                    gVarG5.f3039b.e(gVarG5.f3042e, gVarG5.f3043f);
                    return obj3;
                }
                if (i11 == 1) {
                    a0Var3 = this.B;
                    b0Var5 = (b0) this.D;
                    t1.O(obj);
                } else if (i11 == 2) {
                    a0Var3 = this.B;
                    b0Var6 = (b0) this.D;
                    t1.O(obj);
                    a0Var4 = a0Var3;
                    b0Var4 = b0Var6;
                    a aVar5 = new a(1, null, kVar2);
                    this.D = b0Var4;
                    this.B = null;
                    this.C = 3;
                    obj = b0Var4.a(a0Var4, aVar5, this);
                    if (obj == bool2) {
                        return bool2;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB2 = b0Var4.b(this);
                    if (boolB2 == bool2) {
                        return bool2;
                    }
                    obj3 = obj;
                    obj = boolB2;
                } else if (i11 == 3) {
                    b0Var4 = (b0) this.D;
                    t1.O(obj);
                    if (!z11) {
                        return obj;
                    }
                    this.D = obj;
                    this.C = 4;
                    boolB2 = b0Var4.b(this);
                    if (boolB2 == bool2) {
                        return bool2;
                    }
                    obj3 = obj;
                    obj = boolB2;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj5 = this.D;
                    t1.O(obj);
                    obj3 = obj5;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                ca.g gVarG6 = tVar2.g();
                gVarG6.f3039b.e(gVarG6.f3042e, gVarG6.f3043f);
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    a0Var4 = a0Var3;
                    b0Var4 = b0Var5;
                } else {
                    ca.g gVarG7 = tVar2.g();
                    this.D = b0Var5;
                    this.B = a0Var3;
                    this.C = 2;
                    Object objF2 = gVarG7.f3039b.f(this);
                    if (objF2 != bool2) {
                        objF2 = g00.b0.a;
                    }
                    if (objF2 == bool2) {
                        return bool2;
                    }
                    b0Var6 = b0Var5;
                    a0Var4 = a0Var3;
                    b0Var4 = b0Var6;
                }
                a aVar6 = new a(1, null, kVar2);
                this.D = b0Var4;
                this.B = null;
                this.C = 3;
                obj = b0Var4.a(a0Var4, aVar6, this);
                if (obj == bool2) {
                    return bool2;
                }
                if (!z11) {
                    return obj;
                }
                this.D = obj;
                this.C = 4;
                boolB2 = b0Var4.b(this);
                if (boolB2 == bool2) {
                    return bool2;
                }
                obj3 = obj;
                obj = boolB2;
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                ca.g gVarG8 = tVar2.g();
                gVarG8.f3039b.e(gVarG8.f3042e, gVarG8.f3043f);
                return obj3;
        }
    }
}
