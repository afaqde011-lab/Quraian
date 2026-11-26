package s7;

import androidx.media3.common.l2;
import java.util.List;

public final class h0 implements v7.r {

    public final v7.r f13684a;

    public final l2 f13685b;

    public h0(v7.r rVar, l2 l2Var) {
        this.f13684a = rVar;
        this.f13685b = l2Var;
    }

    @Override
    public final boolean a(int i10, long j9) {
        return this.f13684a.a(i10, j9);
    }

    @Override
    public final int b(androidx.media3.common.t tVar) {
        int i10 = 0;
        while (true) {
            androidx.media3.common.t[] tVarArr = this.f13685b.f1341d;
            if (i10 >= tVarArr.length) {
                i10 = -1;
                break;
            }
            if (tVar == tVarArr[i10]) {
                break;
            }
            i10++;
        }
        return this.f13684a.u(i10);
    }

    @Override
    public final void c(long j9, long j10, long j11, List list, t7.k[] kVarArr) {
        this.f13684a.c(j9, j10, j11, list, kVarArr);
    }

    @Override
    public final l2 d() {
        return this.f13685b;
    }

    @Override
    public final int e() {
        return this.f13684a.e();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof h0)) {
            return this.f13685b.equals(((h0) obj).f13685b);
        }
        return false;
    }

    @Override
    public final boolean f(long j9, t7.e eVar, List list) {
        return this.f13684a.f(j9, eVar, list);
    }

    @Override
    public final void g(boolean z10) {
        this.f13684a.g(z10);
    }

    @Override
    public final androidx.media3.common.t h(int i10) {
        return this.f13685b.f1341d[this.f13684a.j(i10)];
    }

    public final int hashCode() {
        return this.f13685b.hashCode() + (this.f13684a.hashCode() * 31);
    }

    @Override
    public final void i() {
        this.f13684a.i();
    }

    @Override
    public final int j(int i10) {
        return this.f13684a.j(i10);
    }

    @Override
    public final int k(long j9, List list) {
        return this.f13684a.k(j9, list);
    }

    @Override
    public final void l() {
        this.f13684a.l();
    }

    @Override
    public final int length() {
        return this.f13684a.length();
    }

    @Override
    public final int m() {
        return this.f13684a.m();
    }

    @Override
    public final androidx.media3.common.t n() {
        return this.f13685b.f1341d[this.f13684a.m()];
    }

    @Override
    public final int o() {
        return this.f13684a.o();
    }

    @Override
    public final boolean p(int i10, long j9) {
        return this.f13684a.p(i10, j9);
    }

    @Override
    public final void q(float f3) {
        this.f13684a.q(f3);
    }

    @Override
    public final Object r() {
        return this.f13684a.r();
    }

    @Override
    public final void s() {
        this.f13684a.s();
    }

    @Override
    public final void t() {
        this.f13684a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f13684a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return this.f13684a.equals(((h0) obj).f13684a);
        }
        return false;
    }
}
