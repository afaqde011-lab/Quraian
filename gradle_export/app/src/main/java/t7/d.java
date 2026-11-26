package t7;

import a8.d0;
import a8.l0;
import a8.q;
import a8.s;
import a8.u;
import android.util.SparseArray;
import androidx.media3.common.t;
import q3.e0;
import ta.c0;

public final class d implements s {
    public static final u K = new u();
    public final q A;
    public final int B;
    public final t C;
    public final SparseArray D = new SparseArray();
    public final c E = c.f14370a;
    public boolean F;
    public e0 G;
    public long H;
    public d0 I;
    public t[] J;

    public d(q qVar, int i10, t tVar) {
        this.A = qVar;
        this.B = i10;
        this.C = tVar;
    }

    public final a8.k a() {
        d0 d0Var = this.I;
        if (d0Var instanceof a8.k) {
            return (a8.k) d0Var;
        }
        if (d0Var instanceof s8.d) {
            return ((s8.d) d0Var).f13830a;
        }
        return null;
    }

    @Override
    public final void b(d0 d0Var) {
        this.I = d0Var;
    }

    public final void c(e0 e0Var, long j9, long j10) {
        this.G = e0Var;
        this.H = j10;
        boolean z10 = this.F;
        q qVar = this.A;
        if (!z10) {
            qVar.a(this);
            if (j9 != -9223372036854775807L) {
                qVar.b(0L, j9);
            }
            this.F = true;
            return;
        }
        if (j9 == -9223372036854775807L) {
            j9 = 0;
        }
        qVar.b(0L, j9);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.D;
            if (i10 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i10);
            if (e0Var == null) {
                bVar.f14368f = bVar.f14365c;
            } else {
                bVar.f14369g = j10;
                l0 l0VarU = e0Var.u(bVar.f14363a);
                bVar.f14368f = l0VarU;
                t tVar = bVar.f14367e;
                if (tVar != null) {
                    l0VarU.f(tVar);
                }
            }
            i10++;
        }
    }

    @Override
    public final void q() {
        SparseArray sparseArray = this.D;
        t[] tVarArr = new t[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            t tVar = ((b) sparseArray.valueAt(i10)).f14367e;
            tVar.getClass();
            tVarArr[i10] = tVar;
        }
        this.J = tVarArr;
    }

    @Override
    public final l0 w(int i10, int i11) {
        SparseArray sparseArray = this.D;
        b bVar = (b) sparseArray.get(i10);
        if (bVar == null) {
            c0.A(this.J == null);
            bVar = new b(i10, i11, i11 == this.B ? this.C : null, this.E);
            e0 e0Var = this.G;
            long j9 = this.H;
            if (e0Var == null) {
                bVar.f14368f = bVar.f14365c;
            } else {
                bVar.f14369g = j9;
                l0 l0VarU = e0Var.u(i11);
                bVar.f14368f = l0VarU;
                t tVar = bVar.f14367e;
                if (tVar != null) {
                    l0VarU.f(tVar);
                }
            }
            sparseArray.put(i10, bVar);
        }
        return bVar;
    }
}
