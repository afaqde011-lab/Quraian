package dz;

import a40.z;
import bt.f2;
import bt.y1;
import d40.t0;
import d40.u0;
import g00.b0;
import ri.t1;

public final class o extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final s C;

    public o(s sVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = sVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new o(this.C, cVar, 0);
            case 1:
                return new o(this.C, cVar, 1);
            default:
                return new o(this.C, cVar, 2);
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
        }
        return ((o) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                b0 b0Var = b0.a;
                s sVar = this.C;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return b0Var;
                }
                t1.O(obj);
                zt.a aVar2 = sVar.d;
                this.B = 1;
                if (((ut.p) aVar2).c(this) == aVar) {
                    return aVar;
                }
                io.a aVar3 = sVar.g;
                this.B = 2;
                vn.o oVar = (vn.o) aVar3;
                oVar.d.j0("audio_story_download");
                r00.i.Y(oVar.b.a);
                Object objN = rd.a.N(oVar.a.a, false, true, new xn.a(2), this);
                if (objN != aVar) {
                    objN = b0Var;
                }
                if (objN != aVar) {
                    objN = b0Var;
                }
                if (objN == aVar) {
                    return aVar;
                }
                return b0Var;
            case 1:
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    s sVar2 = this.C;
                    t0 t0VarL = d40.o.l(((ut.p) sVar2.d).k(), sVar2.e.f(), sVar2.f.c.c, new q(sVar2, null));
                    r rVar = new r(sVar2, null, 0);
                    this.B = 1;
                    if (d40.o.i(t0VarL, rVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    s sVar3 = this.C;
                    e40.i iVarA = sVar3.h.a();
                    vn.o oVar2 = (vn.o) sVar3.g;
                    k00.c cVar = null;
                    u0 u0Var = new u0(iVarA, new y1(rd.a.o(oVar2.a.a, false, new String[]{"audio_story_download"}, new xn.a(1)), oVar2, 22), new f2(sVar3, cVar, 2));
                    r rVar2 = new r(sVar3, cVar, 1);
                    this.B = 1;
                    if (d40.o.i(u0Var, rVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
