package f1;

import a40.c0;
import a40.z;
import bt.a2;
import bt.m1;
import g00.b0;
import j0.v;
import java.util.ArrayList;
import l1.f1;
import l1.q;
import l1.y0;
import l1.z0;
import m00.i;
import ri.t1;
import to.m;
import u00.k;
import u00.n;
import x.i0;
import x.j0;
import x.n1;
import z.e1;

public final class g extends i implements n {
    public final int A;
    public int B;
    public float C;
    public Object D;
    public final Object E;

    public g(Object obj, float f3, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.C = f3;
        this.E = obj2;
    }

    public g(tm.e eVar, float f3, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.E = eVar;
        this.C = f3;
    }

    public g(x.b bVar, y0 y0Var, float f3, k00.c cVar) {
        super(2, cVar);
        this.A = 4;
        this.D = bVar;
        this.E = y0Var;
        this.C = f3;
    }

    public g(n1 n1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 5;
        this.E = n1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g((b50.e) this.D, this.C, (x.i) this.E, cVar, 0);
            case 1:
                return new g((v) this.D, this.C, (z0) this.E, cVar, 1);
            case 2:
                return new g((x.y0) this.D, this.C, (q9.c) this.E, cVar, 2);
            case 3:
                g gVar = new g((tm.e) this.E, this.C, cVar);
                gVar.D = obj;
                return gVar;
            case 4:
                return new g((x.b) this.D, (y0) this.E, this.C, cVar);
            default:
                g gVar2 = new g((n1) this.E, cVar);
                gVar2.D = obj;
                return gVar2;
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        float fQ;
        z zVar;
        int i10 = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.E;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    return x.b.c((x.b) ((b50.e) this.D).c, new Float(this.C), (x.i) obj2, null, this, 12) == aVar ? aVar : b0Var;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            case 1:
                v vVar = (v) this.D;
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                a2 a2VarJ = q.J(new el.b(vVar, 7));
                iv.f fVar = new iv.f(vVar, this.C, (z0) obj2);
                this.B = 1;
                Object objCollect = a2VarJ.collect(new m1(fVar, 27), this);
                if (objCollect != aVar2) {
                    objCollect = b0Var;
                }
                return objCollect == aVar2 ? aVar2 : b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    return ((x.y0) this.D).d1(this.C, (q9.c) obj2, this) == aVar3 ? aVar3 : b0Var;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            case 3:
                z zVar2 = (z) this.D;
                l00.a aVar4 = l00.a.A;
                int i14 = this.B;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                tm.e eVar = (tm.e) obj2;
                e1 e1Var = eVar.r;
                tm.b bVar = new tm.b(eVar, this.C, zVar2, (k00.c) null);
                this.D = null;
                this.B = 1;
                return e1.b(e1Var, bVar, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i15 = this.B;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                ArrayList arrayList = m.b;
                if (((f1) ((y0) obj2)).h() == 0) {
                    return b0Var;
                }
                x.b bVar2 = (x.b) this.D;
                Float f3 = new Float(0.0f);
                float f10 = this.C;
                i0 i0Var = new i0();
                i0Var.f16302a = 250;
                i0Var.a(33, Float.valueOf(15.0f * f10));
                i0Var.a(83, Float.valueOf(0.0f));
                i0Var.a(133, Float.valueOf(f10 * (-15.0f)));
                j0 j0Var = new j0(i0Var);
                this.B = 1;
                return x.b.c(bVar2, f3, j0Var, null, this, 12) == aVar5 ? aVar5 : b0Var;
            default:
                l00.a aVar6 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    t1.O(obj);
                    z zVar3 = (z) this.D;
                    fQ = x.c.q(zVar3.A());
                    zVar = zVar3;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fQ = this.C;
                    zVar = (z) this.D;
                    t1.O(obj);
                }
                while (c0.v(zVar)) {
                    k cVar = new kz.c((n1) obj2, fQ, 3);
                    this.D = zVar;
                    this.C = fQ;
                    this.B = 1;
                    if (q.u(getContext()).b0(cVar, this) == aVar6) {
                        return aVar6;
                    }
                }
                return b0Var;
        }
    }
}
