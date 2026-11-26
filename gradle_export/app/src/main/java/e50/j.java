package e50;

import java.io.IOException;

public final class j extends a50.a {
    public final m e;
    public final int f;
    public final k50.i g;
    public final int h;

    public j(String str, m mVar, int i, k50.i iVar, int i2, boolean z) {
        super(str, true);
        this.e = mVar;
        this.f = i;
        this.g = iVar;
        this.h = i2;
    }

    @Override
    public final long a() {
        try {
            x xVar = this.e.K;
            k50.i iVar = this.g;
            int i = this.h;
            xVar.getClass();
            iVar.skip(i);
            this.e.W.A(this.f, 9);
            synchronized (this.e) {
                this.e.Y.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
