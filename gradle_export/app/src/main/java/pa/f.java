package pa;

import a10.h0;

public abstract class f implements ma.c {
    public final na.a A;
    public final String B;
    public boolean C;

    public f(na.a aVar, String str) {
        this.A = aVar;
        this.B = str;
    }

    public final void a() {
        if (this.C) {
            h0.M(21, "statement is closed");
            throw null;
        }
    }

    @Override
    public void h() {
        a();
    }

    @Override
    public void reset() {
        a();
    }
}
