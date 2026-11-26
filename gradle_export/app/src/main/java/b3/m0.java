package b3;

import java.util.HashMap;
import java.util.Map;

public final class m0 {

    public final z2.l1 f2072a;

    public boolean f2074c;

    public boolean f2075d;

    public boolean f2076e;

    public boolean f2077f;

    public boolean f2078g;

    public b f2079h;

    public final int f2081j;

    public boolean f2073b = true;

    public final HashMap f2080i = new HashMap();

    public m0(b bVar, int i10) {
        this.f2081j = i10;
        this.f2072a = (z2.l1) bVar;
    }

    public static final void a(m0 m0Var, z2.a aVar, int i10, p1 p1Var) {
        HashMap map = m0Var.f2080i;
        float f3 = i10;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f3)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        while (true) {
            long jY = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (m0Var.f2081j) {
                    case 0:
                        z1 z1Var = p1Var.f2107n0;
                        if (z1Var != null) {
                            jY = ((c3.v1) z1Var).c(false, jY);
                        }
                        jY = f50.k.y(jY, p1Var.f2095b0);
                        break;
                    default:
                        v0 v0VarX1 = p1Var.x1();
                        kotlin.jvm.internal.m.b(v0VarX1);
                        long j9 = v0VarX1.P;
                        jY = h2.b.f((((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32), jY);
                        break;
                }
                p1Var = p1Var.S;
                kotlin.jvm.internal.m.b(p1Var);
                if (p1Var.equals(m0Var.f2072a.g())) {
                    int iRound = Math.round(aVar instanceof z2.r ? Float.intBitsToFloat((int) (jY & 4294967295L)) : Float.intBitsToFloat((int) (jY >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) h00.d0.O(map, aVar)).intValue();
                        z2.r rVar = z2.d.f17096a;
                        iRound = ((Number) aVar.f17077a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!m0Var.b(p1Var).containsKey(aVar));
            float fC = m0Var.c(p1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(p1 p1Var) {
        switch (this.f2081j) {
            case 0:
                return p1Var.Z0().a();
            default:
                v0 v0VarX1 = p1Var.x1();
                kotlin.jvm.internal.m.b(v0VarX1);
                return v0VarX1.Z0().a();
        }
    }

    public final int c(p1 p1Var, z2.a aVar) {
        switch (this.f2081j) {
            case 0:
                return p1Var.J0(aVar);
            default:
                v0 v0VarX1 = p1Var.x1();
                kotlin.jvm.internal.m.b(v0VarX1);
                return v0VarX1.J0(aVar);
        }
    }

    public final boolean d() {
        return this.f2074c || this.f2076e || this.f2077f || this.f2078g;
    }

    public final boolean e() {
        h();
        return this.f2079h != null;
    }

    public final void f() {
        this.f2073b = true;
        ?? r4 = this.f2072a;
        b bVarJ = r4.j();
        if (bVarJ == null) {
            return;
        }
        if (this.f2074c) {
            bVarJ.e0();
        } else if (this.f2076e || this.f2075d) {
            bVarJ.requestLayout();
        }
        if (this.f2077f) {
            r4.e0();
        }
        if (this.f2078g) {
            r4.requestLayout();
        }
        bVarJ.a().f();
    }

    public final void g() {
        HashMap map = this.f2080i;
        map.clear();
        a aVar = new a(this, 0);
        ?? r4 = this.f2072a;
        r4.Y(aVar);
        map.putAll(b(r4.g()));
        this.f2073b = false;
    }

    public final void h() {
        b bVar;
        m0 m0VarA;
        m0 m0VarA2;
        boolean zD = d();
        ?? r4 = this.f2072a;
        ?? r7 = r4;
        if (!zD) {
            b bVarJ = r4.j();
            if (bVarJ == null) {
                return;
            }
            b bVar2 = bVarJ.a().f2079h;
            if (bVar2 == null) {
                bVar = this.f2079h;
                if (bVar != null) {
                    return;
                } else {
                    return;
                }
            }
            boolean zD2 = bVar2.a().d();
            r7 = bVar2;
            if (!zD2) {
                bVar = this.f2079h;
                if (bVar != null || bVar.a().d()) {
                    return;
                }
                b bVarJ2 = bVar.j();
                if (bVarJ2 != null && (m0VarA2 = bVarJ2.a()) != null) {
                    m0VarA2.h();
                }
                b bVarJ3 = bVar.j();
                r7 = (bVarJ3 == null || (m0VarA = bVarJ3.a()) == null) ? 0 : m0VarA.f2079h;
            }
        }
        this.f2079h = r7;
    }
}
