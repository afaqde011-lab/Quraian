package s7;

import android.util.Pair;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;

public final class v extends m1 {
    public final boolean l;
    public final j2 m;

    public final h2 f13765n;

    public t f13766o;

    public s f13767p;

    public boolean f13768q;

    public boolean f13769r;

    public boolean f13770s;

    public v(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.i();
        this.m = new j2();
        this.f13765n = new h2();
        k2 k2VarG = aVar.g();
        if (k2VarG == null) {
            this.f13766o = new t(new u(aVar.h()), j2.f1273q, t.f13756d);
        } else {
            this.f13766o = new t(k2VarG, null, null);
            this.f13770s = true;
        }
    }

    @Override
    public final void B() {
        if (this.l) {
            return;
        }
        this.f13768q = true;
        A();
    }

    @Override
    public final s b(a0 a0Var, a1.i iVar, long j9) {
        s sVar = new s(a0Var, iVar, j9);
        ta.c0.A(sVar.D == null);
        sVar.D = this.f13714k;
        if (!this.f13769r) {
            this.f13767p = sVar;
            if (!this.f13768q) {
                this.f13768q = true;
                A();
            }
            return sVar;
        }
        Object obj = a0Var.f13644a;
        if (this.f13766o.f13758c != null && obj.equals(t.f13756d)) {
            obj = this.f13766o.f13758c;
        }
        sVar.b(a0Var.a(obj));
        return sVar;
    }

    public final boolean D(long j9) {
        s sVar = this.f13767p;
        int indexOfPeriod = this.f13766o.getIndexOfPeriod(sVar.A.f13644a);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j10 = this.f13766o.getPeriod(indexOfPeriod, this.f13765n).f1234d;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            j9 = Math.max(0L, j10 - 1);
        }
        sVar.G = j9;
        return true;
    }

    @Override
    public final boolean a(androidx.media3.common.q0 q0Var) {
        return this.f13714k.a(q0Var);
    }

    @Override
    public final void n(y yVar) {
        s sVar = (s) yVar;
        if (sVar.E != null) {
            a aVar = sVar.D;
            aVar.getClass();
            aVar.n(sVar.E);
        }
        if (yVar == this.f13767p) {
            this.f13767p = null;
        }
    }

    @Override
    public final void p() {
        this.f13769r = false;
        this.f13768q = false;
        super.p();
    }

    @Override
    public final void s(androidx.media3.common.q0 q0Var) {
        if (this.f13770s) {
            t tVar = this.f13766o;
            this.f13766o = new t(new i7.g1(this.f13766o.f13728a, q0Var), tVar.f13757b, tVar.f13758c);
        } else {
            this.f13766o = new t(new u(q0Var), j2.f1273q, t.f13756d);
        }
        this.f13714k.s(q0Var);
    }

    @Override
    public final a0 y(a0 a0Var) {
        Object obj = a0Var.f13644a;
        Object obj2 = this.f13766o.f13758c;
        if (obj2 != null && obj2.equals(obj)) {
            obj = t.f13756d;
        }
        return a0Var.a(obj);
    }

    @Override
    public final void z(k2 k2Var) {
        long j9;
        t tVar;
        a0 a0VarA;
        t tVar2;
        if (this.f13769r) {
            t tVar3 = this.f13766o;
            this.f13766o = new t(k2Var, tVar3.f13757b, tVar3.f13758c);
            s sVar = this.f13767p;
            if (sVar != null) {
                D(sVar.G);
            }
        } else {
            if (!k2Var.isEmpty()) {
                j2 j2Var = this.m;
                k2Var.getWindow(0, j2Var);
                long j10 = j2Var.l;
                Object obj = j2Var.f1283a;
                s sVar2 = this.f13767p;
                if (sVar2 != null) {
                    long j11 = sVar2.B;
                    t tVar4 = this.f13766o;
                    Object obj2 = sVar2.A.f13644a;
                    h2 h2Var = this.f13765n;
                    tVar4.getPeriodByUid(obj2, h2Var);
                    long j12 = h2Var.f1235e + j11;
                    if (j12 != this.f13766o.getWindow(0, j2Var).l) {
                        j9 = j12;
                    } else {
                        j9 = j10;
                    }
                } else {
                    j9 = j10;
                }
                Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(this.m, this.f13765n, 0, j9);
                Object obj3 = periodPositionUs.first;
                long jLongValue = ((Long) periodPositionUs.second).longValue();
                if (this.f13770s) {
                    t tVar5 = this.f13766o;
                    tVar = new t(k2Var, tVar5.f13757b, tVar5.f13758c);
                } else {
                    tVar = new t(k2Var, obj, obj3);
                }
                this.f13766o = tVar;
                s sVar3 = this.f13767p;
                if (sVar3 != null && D(jLongValue)) {
                    a0 a0Var = sVar3.A;
                    Object obj4 = a0Var.f13644a;
                    if (this.f13766o.f13758c != null && obj4.equals(t.f13756d)) {
                        obj4 = this.f13766o.f13758c;
                    }
                    a0VarA = a0Var.a(obj4);
                }
                this.f13770s = true;
                this.f13769r = true;
                m(this.f13766o);
                if (a0VarA != null) {
                    s sVar4 = this.f13767p;
                    sVar4.getClass();
                    sVar4.b(a0VarA);
                }
            }
            if (this.f13770s) {
                t tVar6 = this.f13766o;
                tVar2 = new t(k2Var, tVar6.f13757b, tVar6.f13758c);
            } else {
                tVar2 = new t(k2Var, j2.f1273q, t.f13756d);
            }
            this.f13766o = tVar2;
        }
        a0VarA = null;
        this.f13770s = true;
        this.f13769r = true;
        m(this.f13766o);
        if (a0VarA != null) {
            s sVar5 = this.f13767p;
            sVar5.getClass();
            sVar5.b(a0VarA);
        }
    }
}
