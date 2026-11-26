package l50;

import g00.b0;
import java.io.IOException;
import k50.c0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;

public final class h extends n implements u00.n {
    public final v A;
    public final long B;
    public final y C;
    public final c0 D;
    public final y E;
    public final y F;

    public h(v vVar, long j, y yVar, c0 c0Var, y yVar2, y yVar3) {
        super(2);
        this.A = vVar;
        this.B = j;
        this.C = yVar;
        this.D = c0Var;
        this.E = yVar2;
        this.F = yVar3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            v vVar = this.A;
            if (vVar.A) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            vVar.A = true;
            if (jLongValue < this.B) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            y yVar = this.C;
            long jR = yVar.A;
            c0 c0Var = this.D;
            if (jR == 4294967295L) {
                jR = c0Var.r();
            }
            yVar.A = jR;
            y yVar2 = this.E;
            yVar2.A = yVar2.A == 4294967295L ? c0Var.r() : 0L;
            y yVar3 = this.F;
            yVar3.A = yVar3.A == 4294967295L ? c0Var.r() : 0L;
        }
        return b0.a;
    }
}
