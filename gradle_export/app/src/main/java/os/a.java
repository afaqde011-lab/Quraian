package os;

import a40.c0;
import a40.z;
import bt.i2;
import bv.a2;
import com.google.android.gms.internal.measurement.g4;
import d40.g0;
import d40.u0;
import d40.v0;
import d40.z0;
import g00.b0;
import java.util.List;
import ri.t1;

public final class a extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x C;

    public a(int i, k00.c cVar, x xVar) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a(0, cVar, this.C);
            case 1:
                return new a(1, cVar, this.C);
            case 2:
                return new a(2, cVar, this.C);
            case 3:
                return new a(3, cVar, this.C);
            case 4:
                return new a(4, cVar, this.C);
            case 5:
                return new a(5, cVar, this.C);
            default:
                return new a(6, cVar, this.C);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((a) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = 0;
        int i2 = 1;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i3 = this.B;
                try {
                    if (i3 == 0) {
                        t1.O(obj);
                        x xVar = this.C;
                        this.B = 1;
                        if (xVar.o(false, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused) {
                }
                return b0.a;
            case 1:
                x xVar2 = this.C;
                l00.a aVar2 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    d40.i iVarO = d40.o.o(new u0(new z0(xVar2.j.c), xVar2.k.c, new a2(3, null, 3)));
                    b bVar = new b(xVar2, i);
                    this.B = 1;
                    if (iVarO.collect(bVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i5 = this.B;
                try {
                    if (i5 == 0) {
                        t1.O(obj);
                        x xVar3 = this.C;
                        this.B = 1;
                        if (xVar3.o(false, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                return b0.a;
            case 3:
                b0 b0Var = b0.a;
                x xVar4 = this.C;
                l00.a aVar4 = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                z0 z0Var = new z0(xVar4.j.c);
                d40.i iVarE = xVar4.b.e(7);
                i2 i2Var = new i2(3, null, 2);
                b bVar2 = new b(xVar4, i2);
                this.B = 1;
                Object objA = e40.b.a(bVar2, this, v0.A, new g0((Object) i2Var, (k00.c) null, 1), new d40.i[]{z0Var, iVarE});
                if (objA != aVar4) {
                    objA = b0Var;
                }
                return objA == aVar4 ? aVar4 : b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i7 = this.B;
                try {
                    if (i7 == 0) {
                        t1.O(obj);
                        x xVar5 = this.C;
                        this.B = 1;
                        if (xVar5.o(true, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused3) {
                }
                return b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i8 = this.B;
                try {
                    if (i8 == 0) {
                        t1.O(obj);
                        x xVar6 = this.C;
                        this.B = 1;
                        if (xVar6.o(false, this) == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused4) {
                }
                return b0.a;
            default:
                b0 b0Var2 = b0.a;
                l00.a aVar7 = l00.a.A;
                int i9 = this.B;
                if (i9 == 0) {
                    t1.O(obj);
                    s30.a aVar8 = s30.b.B;
                    List list = y.b;
                    int i11 = this.C.w;
                    int iM = va.a.M(list);
                    if (i11 > iM) {
                        i11 = iM;
                    }
                    long jB0 = g4.b0(((Number) list.get(i11)).intValue(), s30.d.SECONDS);
                    this.B = 1;
                    Object objL = c0.l(c0.G(jB0), this);
                    if (objL != aVar7) {
                        objL = b0Var2;
                    }
                    if (objL == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.C.w++;
                if (!this.C.f()) {
                    return b0Var2;
                }
                this.C.u();
                return b0Var2;
        }
    }
}
