package z4;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class g1 {

    public static final j1 f17194b;

    public final j1 f17195a;

    static {
        x0 u0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            u0Var = new w0();
        } else if (i10 >= 35) {
            u0Var = new v0();
        } else {
            u0Var = i10 >= 34 ? new u0() : new t0();
        }
        f17194b = u0Var.b().f17202a.a().f17202a.b().f17202a.c();
    }

    public g1(j1 j1Var) {
        this.f17195a = j1Var;
    }

    public void A(Rect[][] rectArr) {
    }

    public void B(Rect[][] rectArr) {
    }

    public j1 a() {
        return this.f17195a;
    }

    public j1 b() {
        return this.f17195a;
    }

    public j1 c() {
        return this.f17195a;
    }

    public void d(View view) {
    }

    public void e(j1 j1Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return t() == g1Var.t() && s() == g1Var.s() && Objects.equals(n(), g1Var.n()) && Objects.equals(l(), g1Var.l()) && Objects.equals(h(), g1Var.h());
    }

    public List<Rect> f(int i10) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i10) {
        return Collections.EMPTY_LIST;
    }

    public f h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public q4.b i(int i10) {
        return q4.b.f12754e;
    }

    public q4.b j(int i10) {
        if ((i10 & 8) == 0) {
            return q4.b.f12754e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public q4.b k() {
        return n();
    }

    public q4.b l() {
        return q4.b.f12754e;
    }

    public q4.b m() {
        return n();
    }

    public q4.b n() {
        return q4.b.f12754e;
    }

    public q4.b o() {
        return n();
    }

    public void p(View view) {
    }

    public void q() {
    }

    public j1 r(int i10, int i11, int i12, int i13) {
        return f17194b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i10) {
        return true;
    }

    public void v(h hVar) {
    }

    public void w(q4.b[] bVarArr) {
    }

    public void x(q4.b bVar) {
    }

    public void y(j1 j1Var) {
    }

    public void z(int i10) {
    }
}
