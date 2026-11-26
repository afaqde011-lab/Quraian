package e50;

import java.io.IOException;

public final class l extends a50.a {
    public final m e;
    public final int f;
    public final long g;

    public l(String str, m mVar, int i, long j) {
        super(str, true);
        this.e = mVar;
        this.f = i;
        this.g = j;
    }

    @Override
    public final long a() {
        m mVar = this.e;
        try {
            mVar.W.F(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            mVar.a(2, 2, e);
            return -1L;
        }
    }
}
