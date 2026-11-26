package ea;

import a10.h0;
import android.database.SQLException;
import kotlin.NoWhenBranchMatchedException;
import qd.s0;
import ri.t1;

public final class d0 implements ca.b0, e0 {

    public final gj.e f5215a;

    public final i f5216b;

    public final boolean f5217c;

    public final h00.m f5218d;

    public volatile boolean f5219e;

    public d0(gj.e eVar, i iVar, boolean z10) {
        kotlin.jvm.internal.m.e(eVar, "connectionElementKey");
        this.f5215a = eVar;
        this.f5216b = iVar;
        this.f5217c = z10;
        this.f5218d = new h00.m();
    }

    @Override
    public final Object a(ca.a0 a0Var, u00.n nVar, m00.i iVar) {
        if (this.f5219e) {
            h0.M(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(this.f5215a);
        if (aVar != null && aVar.B == this) {
            return g(a0Var, nVar, iVar);
        }
        h0.M(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override
    public final Boolean b(k00.c cVar) {
        if (this.f5219e) {
            h0.M(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) cVar.getContext().get(this.f5215a);
        if (aVar != null && aVar.B == this) {
            return Boolean.valueOf(!this.f5218d.isEmpty() || this.f5216b.A.g());
        }
        h0.M(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override
    public final Object c(String str, u00.k kVar, m00.c cVar) {
        c0 c0Var;
        i iVar;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.F = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.D;
        l00.a aVar = l00.a.A;
        int i11 = c0Var.F;
        if (i11 == 0) {
            t1.O(obj);
            if (this.f5219e) {
                h0.M(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) c0Var.getContext().get(this.f5215a);
            if (aVar2 == null || aVar2.B != this) {
                h0.M(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            iVar = this.f5216b;
            c0Var.A = str;
            c0Var.B = kVar;
            c0Var.C = iVar;
            c0Var.F = 1;
            if (iVar.B.l(c0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar2 = c0Var.C;
            kVar = c0Var.B;
            String str2 = c0Var.A;
            t1.O(obj);
            iVar = iVar2;
            str = str2;
        }
        try {
            x xVar = new x(this, this.f5216b.k0(str));
            try {
                Object objInvoke = kVar.invoke(xVar);
                ca.v.s(xVar, null);
                iVar.i((Object) null);
                return objInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ca.v.s(xVar, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            iVar.i((Object) null);
            throw th4;
        }
    }

    @Override
    public final ma.a d() {
        return this.f5216b;
    }

    public final Object e(ca.a0 a0Var, m00.c cVar) {
        z zVar;
        i iVar;
        h00.m mVar = this.f5218d;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.E = i10 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.C;
        l00.a aVar = l00.a.A;
        int i11 = zVar.E;
        i iVar2 = this.f5216b;
        if (i11 == 0) {
            t1.O(obj);
            zVar.A = a0Var;
            zVar.B = iVar2;
            zVar.E = 1;
            if (iVar2.B.l(zVar) == aVar) {
                return aVar;
            }
            iVar = iVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar3 = zVar.B;
            ca.a0 a0Var2 = zVar.A;
            t1.O(obj);
            iVar = iVar3;
            a0Var = a0Var2;
        }
        try {
            int i12 = mVar.C;
            if (mVar.isEmpty()) {
                int iOrdinal = a0Var.ordinal();
                if (iOrdinal == 0) {
                    h0.v(iVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    h0.v(iVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0.v(iVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                h0.v(iVar2, "SAVEPOINT '" + i12 + '\'');
            }
            mVar.addLast(new y(i12));
            g00.b0 b0Var = g00.b0.a;
            iVar.i((Object) null);
            return b0Var;
        } catch (Throwable th2) {
            iVar.i((Object) null);
            throw th2;
        }
    }

    public final Object f(boolean z10, m00.c cVar) {
        a0 a0Var;
        i iVar;
        h00.m mVar = this.f5218d;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i10 = a0Var.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.E = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object obj = a0Var.C;
        l00.a aVar = l00.a.A;
        int i11 = a0Var.E;
        i iVar2 = this.f5216b;
        if (i11 == 0) {
            t1.O(obj);
            a0Var.B = iVar2;
            a0Var.A = z10;
            a0Var.E = 1;
            if (iVar2.B.l(a0Var) == aVar) {
                return aVar;
            }
            iVar = iVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = a0Var.A;
            iVar = a0Var.B;
            t1.O(obj);
        }
        try {
            if (mVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            y yVar = (y) h00.v.y0(mVar);
            if (z10) {
                yVar.getClass();
                if (mVar.isEmpty()) {
                    h0.v(iVar2, "END TRANSACTION");
                } else {
                    h0.v(iVar2, "RELEASE SAVEPOINT '" + yVar.f5236a + '\'');
                }
            } else if (mVar.isEmpty()) {
                h0.v(iVar2, "ROLLBACK TRANSACTION");
            } else {
                h0.v(iVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + yVar.f5236a + '\'');
            }
            g00.b0 b0Var = g00.b0.a;
            iVar.i((Object) null);
            return b0Var;
        } catch (Throwable th2) {
            iVar.i((Object) null);
            throw th2;
        }
    }

    public final Object g(ca.a0 a0Var, u00.n nVar, m00.c cVar) throws Throwable {
        b0 b0Var;
        SQLException e3;
        Throwable th2;
        int i10;
        boolean z10;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i11 = b0Var.F;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b0Var.F = i11 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objInvoke = b0Var.D;
        Object obj = l00.a.A;
        int i12 = b0Var.F;
        try {
            if (i12 == 0) {
                t1.O(objInvoke);
                if (a0Var == null) {
                    a0Var = ca.a0.A;
                }
                b0Var.A = nVar;
                b0Var.F = 1;
                if (e(a0Var, b0Var) != obj) {
                }
                return obj;
            }
            if (i12 == 1) {
                nVar = (u00.n) b0Var.A;
                t1.O(objInvoke);
            } else {
                if (i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        Object obj2 = b0Var.A;
                        t1.O(objInvoke);
                        return obj2;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = b0Var.B;
                    th = (Throwable) b0Var.A;
                    try {
                        t1.O(objInvoke);
                        throw th2;
                    } catch (SQLException e10) {
                        e3 = e10;
                        if (th != null) {
                            throw e3;
                        }
                        s0.V(th, e3);
                        throw th2;
                    }
                }
                i10 = b0Var.C;
                t1.O(objInvoke);
            }
            z10 = i10 != 0;
            b0Var.A = objInvoke;
            b0Var.F = 3;
            if (f(z10, b0Var) != obj) {
                return obj;
            }
            return objInvoke;
            m mVar = new m(this, 1);
            b0Var.A = null;
            b0Var.C = 1;
            b0Var.F = 2;
            objInvoke = nVar.invoke(mVar, b0Var);
            if (objInvoke != obj) {
                i10 = 1;
                if (i10 != 0) {
                }
                b0Var.A = objInvoke;
                b0Var.F = 3;
                if (f(z10, b0Var) != obj) {
                    return objInvoke;
                }
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (Throwable th4) {
                try {
                    b0Var.A = th;
                    b0Var.B = th4;
                    b0Var.F = 5;
                    if (f(false, b0Var) != obj) {
                        throw th4;
                    }
                } catch (SQLException e11) {
                    e3 = e11;
                    th2 = th4;
                    if (th != null) {
                        throw e3;
                    }
                    s0.V(th, e3);
                    throw th2;
                }
            }
        }
    }
}
