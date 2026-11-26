package l60;

import java.io.IOException;

public final class v extends k50.q {
    public final int B = 1;
    public Object C;

    public v(k50.i0 i0Var) {
        super(i0Var);
    }

    public v(w wVar, k50.k kVar) {
        super(kVar);
        this.C = wVar;
    }

    @Override
    public final long s(k50.i iVar, long j) throws Exception {
        switch (this.B) {
            case 0:
                try {
                    return super.s(iVar, j);
                } catch (IOException e) {
                    ((w) this.C).D = e;
                    throw e;
                }
            default:
                try {
                    return super.s(iVar, j);
                } catch (Exception e2) {
                    this.C = e2;
                    throw e2;
                }
        }
    }
}
