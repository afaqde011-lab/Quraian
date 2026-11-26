package e0;

import a40.c0;
import d0.a2;
import d0.e2;
import d0.g3;
import d0.q2;
import d0.t0;
import d0.y1;
import ri.t1;
import x.b1;
import x.t;

public final class h implements t0 {

    public final m f4946a;

    public final t f4947b;

    public final b1 f4948c;

    public final a2 f4949d = e2.f4425c;

    public h(m mVar, t tVar, b1 b1Var) {
        this.f4946a = mVar;
        this.f4947b = tVar;
        this.f4948c = b1Var;
    }

    public static final Object b(h hVar, y1 y1Var, float f3, float f10, e eVar, m00.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.C = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(hVar, cVar);
            }
        } else {
            gVar = new g(hVar, cVar);
        }
        g gVar2 = gVar;
        Object objL = gVar2.A;
        l00.a aVar = l00.a.A;
        int i11 = gVar2.C;
        if (i11 == 0) {
            t1.O(objL);
            if (Math.abs(f3) == 0.0f || Math.abs(f10) == 0.0f) {
                return x.c.b(f3, f10, 28);
            }
            gVar2.C = 1;
            t tVar = hVar.f4947b;
            objL = (Math.abs(tVar.f16373a.j(0.0f, f10)) >= Math.abs(f3) ? new me.i(tVar, 20) : new qj.c(hVar.f4948c, 19)).l(y1Var, new Float(f3), new Float(f10), eVar, gVar2);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objL);
        }
        return ((a) objL).f4942b;
    }

    @Override
    public Object a(q2 q2Var, float f3, k00.c cVar) {
        return d(q2Var, f3, g3.f4431a, (m00.c) cVar);
    }

    public final Object c(y1 y1Var, float f3, u00.k kVar, m00.c cVar) {
        d dVar;
        u00.k kVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.D = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.B;
        l00.a aVar = l00.a.A;
        int i11 = dVar.D;
        if (i11 == 0) {
            t1.O(objJ);
            d0.k kVar3 = new d0.k(this, f3, kVar, y1Var, null);
            dVar.A = kVar;
            dVar.D = 1;
            objJ = c0.J(kVar3, this.f4949d, dVar);
            if (objJ == aVar) {
                return aVar;
            }
            kVar2 = kVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = dVar.A;
            t1.O(objJ);
        }
        a aVar2 = (a) objJ;
        kVar2.invoke(new Float(0.0f));
        return aVar2;
    }

    public final Object d(y1 y1Var, float f3, u00.k kVar, m00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.C = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objC = fVar.A;
        Object obj = l00.a.A;
        int i11 = fVar.C;
        if (i11 == 0) {
            t1.O(objC);
            fVar.C = 1;
            objC = c(y1Var, f3, kVar, fVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objC);
        }
        a aVar = (a) objC;
        return new Float(aVar.f4941a.floatValue() != 0.0f ? ((Number) aVar.f4942b.a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f4948c.equals(this.f4948c) && kotlin.jvm.internal.m.a(hVar.f4947b, this.f4947b) && kotlin.jvm.internal.m.a(hVar.f4946a, this.f4946a);
    }

    public final int hashCode() {
        return this.f4946a.hashCode() + ((this.f4947b.hashCode() + (this.f4948c.hashCode() * 31)) * 31);
    }
}
