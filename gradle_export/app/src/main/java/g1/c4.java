package g1;

import java.util.LinkedHashMap;

public final class c4 extends b2.q implements b3.j, b3.y {
    public LinkedHashMap O;

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        float f3 = ((y3.f) b3.m.h(this, r3.f5953c)).A;
        float f10 = 0;
        if (f3 < f10) {
            f3 = f10;
        }
        z2.l1 l1VarO = v0Var.O(j9);
        boolean z10 = this.N && !Float.isNaN(f3) && y3.f.a(f3, f10) > 0;
        int iR0 = !Float.isNaN(f3) ? y0Var.R0(f3) : 0;
        int iMax = z10 ? Math.max(l1VarO.A, iR0) : l1VarO.A;
        int iMax2 = z10 ? Math.max(l1VarO.B, iR0) : l1VarO.B;
        if (z10) {
            LinkedHashMap linkedHashMap = this.O;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.O = linkedHashMap;
            }
            z2.y1 y1Var = r3.f5952b;
            int iRound = Math.round((iR0 - l1VarO.A) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(y1Var, Integer.valueOf(iRound));
            z2.r rVar = r3.f5951a;
            int iRound2 = Math.round((iR0 - l1VarO.B) / 2.0f);
            linkedHashMap.put(rVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        h00.y yVar = this.O;
        if (yVar == null) {
            yVar = h00.y.A;
        }
        return y0Var.o0(iMax, iMax2, yVar, new b4(iMax, iMax2, l1VarO));
    }
}
