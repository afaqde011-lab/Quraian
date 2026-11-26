package fl;

import a40.z;
import ab.a0;
import bv.o1;
import g00.b0;
import gv.z1;
import j0.o;
import j0.v;
import java.util.Iterator;
import l1.z0;
import m00.i;
import ri.t1;
import u00.k;
import u00.n;
import w.x0;
import x.q1;
import x.x;

public final class d extends i implements n {
    public final int A = 0;
    public int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;

    public d(v vVar, int i, boolean z, int i2, boolean z2, q2.a aVar, k kVar, k00.c cVar) {
        super(2, cVar);
        this.F = vVar;
        this.B = i;
        this.C = z;
        this.E = i2;
        this.D = z2;
        this.G = aVar;
        this.H = kVar;
    }

    public d(boolean z, o1 o1Var, boolean z2, int i, x.b bVar, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.C = z;
        this.F = o1Var;
        this.D = z2;
        this.E = i;
        this.G = bVar;
        this.H = z0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d((v) this.F, this.B, this.C, this.E, this.D, (q2.a) this.G, (k) this.H, cVar);
            default:
                return new d(this.C, (o1) this.F, this.D, this.E, (x.b) this.G, (z0) this.H, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                d dVar = (d) create(zVar, cVar);
                b0 b0Var = b0.a;
                dVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((d) create(zVar, cVar)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.A;
        int i2 = this.E;
        boolean z = this.D;
        Object obj3 = this.F;
        boolean z2 = this.C;
        b0 b0Var = b0.a;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                int i3 = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                v vVar = (v) obj3;
                if (!vVar.j.a()) {
                    j0.n nVarH = vVar.h();
                    float f = (nVarH.l + nVarH.m) / 2.0f;
                    Iterator it = nVarH.k.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            o oVar = (o) next;
                            float fAbs = Math.abs(((oVar.p / 2.0f) + oVar.o) - f);
                            do {
                                Object next2 = it.next();
                                o oVar2 = (o) next2;
                                float fAbs2 = Math.abs(((oVar2.p / 2.0f) + oVar2.o) - f);
                                if (Float.compare(fAbs, fAbs2) > 0) {
                                    next = next2;
                                    fAbs = fAbs2;
                                }
                            } while (it.hasNext());
                        }
                        obj2 = next;
                    } else {
                        obj2 = null;
                    }
                    o oVar3 = (o) obj2;
                    if (oVar3 != null && i3 > 0) {
                        int iY = z2 ? ((oVar3.a % i3) + i3) % i3 : a0.y(oVar3.a, 0, i3 - 1);
                        if (iY >= 0 && iY < i3 && iY != i2) {
                            if (z) {
                                ((q2.a) obj5).a(9);
                            }
                            ((k) obj4).invoke(new Integer(iY));
                        }
                    }
                }
                return b0Var;
            default:
                z0 z0Var = (z0) obj4;
                l00.a aVar2 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                if (!z2) {
                    return b0Var;
                }
                float f2 = (((o1) obj3).C || z) ? 0.0f : i2;
                x0 x0Var = z1.a;
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    x.b bVar = (x.b) obj5;
                    Float f3 = new Float(f2);
                    q1 q1VarW = x.c.w(420, 0, x.a, 2);
                    this.B = 2;
                    if (x.b.c(bVar, f3, q1VarW, (k) null, this, 12) != aVar2) {
                        return b0Var;
                    }
                } else {
                    z0Var.setValue(Boolean.TRUE);
                    Float f4 = new Float(f2);
                    this.B = 1;
                    if (((x.b) obj5).f(f4, this) != aVar2) {
                        return b0Var;
                    }
                }
                return aVar2;
        }
    }
}
