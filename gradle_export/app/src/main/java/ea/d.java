package ea;

import a10.h0;
import android.database.SQLException;
import d40.d1;
import d40.w0;

public final class d implements u00.a {
    public final int A;
    public final boolean B;
    public final Object C;

    public d(f fVar, boolean z10) {
        this.A = 0;
        this.C = fVar;
        this.B = z10;
    }

    public d(boolean z10, Object obj, int i10) {
        this.A = i10;
        this.B = z10;
        this.C = obj;
    }

    public final Object invoke() {
        d1 d1VarI;
        switch (this.A) {
            case 0:
                f fVar = (f) this.C;
                String str = this.B ? "reader" : "writer";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                fVar.B.d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                fVar.A.d(sb2);
                try {
                    h0.M(5, sb2.toString());
                    throw null;
                } catch (SQLException e3) {
                    int i10 = fVar.G;
                    if (i10 == 1) {
                        throw e3;
                    }
                    if (i10 == 2) {
                        e3.printStackTrace();
                    }
                    return g00.b0.a;
                }
            case 1:
                w0 w0Var = (w0) this.C;
                boolean z10 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (z10) {
                    w0Var.f(b0Var);
                }
                return b0Var;
            default:
                a1.h hVar = (a1.h) this.C;
                boolean z11 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (z11 && (d1VarI = hVar.i()) != null) {
                    d1VarI.f(b0Var2);
                }
                return b0Var2;
        }
    }
}
