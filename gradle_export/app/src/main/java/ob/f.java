package ob;

import java.io.IOException;
import k50.g0;
import k50.i;
import k50.p;

public final class f extends p {
    public final b3.a B;
    public boolean C;

    public f(g0 g0Var, b3.a aVar) {
        super(g0Var);
        this.B = aVar;
    }

    public final void c0(i iVar, long j9) throws Exception {
        if (this.C) {
            iVar.skip(j9);
            return;
        }
        try {
            ((p) this).A.c0(iVar, j9);
        } catch (IOException e3) {
            this.C = true;
            this.B.invoke(e3);
        }
    }

    public final void close() throws Exception {
        try {
            super.close();
        } catch (IOException e3) {
            this.C = true;
            this.B.invoke(e3);
        }
    }

    public final void flush() throws Exception {
        try {
            super.flush();
        } catch (IOException e3) {
            this.C = true;
            this.B.invoke(e3);
        }
    }
}
