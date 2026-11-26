package ea;

import a10.h0;
import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import qd.s0;
import ri.t1;

public final class r implements ca.b0, e0 {

    public final kotlin.jvm.internal.j f5224a;

    public final ma.a f5225b;

    public final AtomicInteger f5226c;

    public ca.a0 f5227d;

    public r(u00.n nVar, ma.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "delegate");
        this.f5224a = (kotlin.jvm.internal.j) nVar;
        this.f5225b = aVar;
        this.f5226c = new AtomicInteger(0);
    }

    @Override
    public final Object a(ca.a0 a0Var, u00.n nVar, m00.i iVar) {
        Object objInvoke = this.f5224a.invoke(new q(this, a0Var, nVar, null), iVar);
        l00.a aVar = l00.a.A;
        return objInvoke;
    }

    @Override
    public final Boolean b(k00.c cVar) {
        return Boolean.valueOf(this.f5227d != null || this.f5225b.g());
    }

    @Override
    public final Object c(String str, u00.k kVar, m00.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.E = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objB = oVar.C;
        Object obj = l00.a.A;
        int i11 = oVar.E;
        if (i11 == 0) {
            t1.O(objB);
            oVar.A = str;
            oVar.B = kVar;
            oVar.E = 1;
            objB = b(oVar);
            if (objB != obj) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
            return objB;
        }
        kVar = oVar.B;
        str = oVar.A;
        t1.O(objB);
        if (((Boolean) objB).booleanValue()) {
            p pVar = new p(this, str, kVar, null);
            oVar.A = null;
            oVar.B = null;
            oVar.E = 2;
            Object objInvoke = this.f5224a.invoke(pVar, oVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        ma.c cVarK0 = this.f5225b.k0(str);
        try {
            Object objInvoke2 = kVar.invoke(cVarK0);
            ca.v.s(cVarK0, null);
            return objInvoke2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.v.s(cVarK0, th2);
                throw th3;
            }
        }
    }

    @Override
    public final ma.a d() {
        return this.f5225b;
    }

    public final Object e(ca.a0 a0Var, u00.n nVar, m00.c cVar) throws NoWhenBranchMatchedException {
        n nVar2;
        if (cVar instanceof n) {
            nVar2 = (n) cVar;
            int i10 = nVar2.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar2.D = i10 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(this, cVar);
            }
        } else {
            nVar2 = new n(this, cVar);
        }
        Object objInvoke = nVar2.B;
        l00.a aVar = l00.a.A;
        int i11 = nVar2.D;
        AtomicInteger atomicInteger = this.f5226c;
        int i12 = 1;
        ma.a aVar2 = this.f5225b;
        try {
            if (i11 == 0) {
                t1.O(objInvoke);
                int iOrdinal = a0Var.ordinal();
                if (iOrdinal == 0) {
                    h0.v(aVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    h0.v(aVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0.v(aVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f5227d = a0Var;
                }
                m mVar = new m(this, 0);
                nVar2.A = 1;
                nVar2.D = 1;
                objInvoke = nVar.invoke(mVar, nVar2);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = nVar2.A;
                t1.O(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f5227d = null;
            }
            if (i12 != 0) {
                h0.v(aVar2, "END TRANSACTION");
                return objInvoke;
            }
            h0.v(aVar2, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f5227d = null;
                    }
                    h0.v(aVar2, "ROLLBACK TRANSACTION");
                } catch (SQLException e3) {
                    s0.V(th2, e3);
                }
                throw th3;
            }
        }
    }
}
