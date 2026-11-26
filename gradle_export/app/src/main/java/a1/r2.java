package a1;

import com.google.android.gms.internal.measurement.g4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;

public final class r2 extends b3.l implements b3.y, b3.p, b3.j {
    public s2 Q;
    public boolean R;
    public final n0.e S;
    public Map T;

    public r2(s2 s2Var, w2 w2Var, m3.r0 r0Var, boolean z10, q0.i1 i1Var) {
        this.Q = s2Var;
        this.R = z10;
        n0.e eVar = new n0.e(s2Var.f122g);
        B1(eVar);
        this.S = eVar;
        s2 s2Var2 = this.Q;
        s2Var2.getClass();
        boolean z11 = this.R;
        boolean z12 = !z11;
        o2 o2Var = s2Var2.f116a;
        o2Var.getClass();
        o2Var.A.setValue(new n2(w2Var, r0Var, z11, z12, i1Var.f12627c == 4));
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.Q.f118c.setValue(p1Var);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) throws KotlinNothingValueException {
        s2 s2Var = this.Q;
        y3.m layoutDirection = y0Var.getLayoutDirection();
        q3.h hVar = (q3.h) b3.m.h(this, c3.o1.f2737k);
        o2 o2Var = s2Var.f116a;
        o2Var.getClass();
        m2 m2Var = new m2(y0Var, layoutDirection, hVar, j9);
        o2Var.B.setValue(m2Var);
        n2 n2Var = (n2) o2Var.A.getValue();
        if (n2Var == null) {
            g0.a.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            throw new KotlinNothingValueException();
        }
        m3.n0 n0VarF = o2Var.f(n2Var, m2Var);
        long j10 = n0VarF.f10498c;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        z2.l1 l1VarO = v0Var.O(g4.G(i10, i10, i11, i11));
        this.Q.f121f.setValue(new y3.f(this.R ? y0Var.h0(q0.q.r(n0VarF.f10497b.b(0))) : 0));
        Map linkedHashMap = this.T;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(z2.d.f17096a, Integer.valueOf(Math.round(n0VarF.f10499d)));
        linkedHashMap.put(z2.d.f17097b, Integer.valueOf(Math.round(n0VarF.f10500e)));
        this.T = linkedHashMap;
        return y0Var.o0(i10, i11, linkedHashMap, new q2(l1VarO, 0));
    }
}
