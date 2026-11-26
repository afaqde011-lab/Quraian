package v7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.m2;
import androidx.media3.common.p2;
import androidx.media3.common.q2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class i extends p2 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public i() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }

    public i(j jVar) {
        e(jVar);
        this.J = jVar.f15506w0;
        this.K = jVar.f15507x0;
        this.L = jVar.f15508y0;
        this.M = jVar.f15509z0;
        this.N = jVar.A0;
        this.O = jVar.B0;
        this.P = jVar.C0;
        SparseArray sparseArray = jVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.Q = sparseArray2;
        this.R = jVar.E0.clone();
    }

    @Override
    public final void a(m2 m2Var) {
        this.H.put(m2Var.f1353a, m2Var);
    }

    @Override
    public final q2 b() {
        return new j(this);
    }

    @Override
    public final p2 c() {
        super.c();
        return this;
    }

    @Override
    public final p2 d(int i10) {
        super.d(i10);
        return this;
    }

    @Override
    public final p2 g() {
        this.C = -3;
        return this;
    }

    @Override
    public final p2 h(m2 m2Var) {
        super.h(m2Var);
        return this;
    }

    @Override
    public final p2 i() {
        super.i();
        return this;
    }

    @Override
    public final p2 j(String[] strArr) {
        super.j(strArr);
        return this;
    }

    @Override
    public final p2 k() {
        super.k();
        return this;
    }

    @Override
    public final p2 l(int i10, boolean z10) {
        super.l(i10, z10);
        return this;
    }

    public final void m(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }
}
