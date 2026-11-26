package pa;

import a10.h0;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import oa.i;

public final class d extends f {
    public final int D = 1;
    public final Object E;

    public d(na.a aVar, String str) {
        super(aVar, str);
        m.e(aVar, "db");
        m.e(str, "sql");
        this.E = aVar.q(str);
    }

    public d(na.a aVar, String str, c cVar) {
        super(aVar, str);
        m.e(aVar, "db");
        m.e(str, "sql");
        this.E = cVar;
    }

    public d(na.a aVar, String str, e eVar) {
        super(aVar, str);
        m.e(aVar, "db");
        m.e(str, "sql");
        this.E = eVar;
    }

    @Override
    public boolean C() {
        switch (this.D) {
            case 0:
                return ((e) this.E).C();
            default:
                return super.C();
        }
    }

    @Override
    public final String R(int i10) {
        switch (this.D) {
            case 0:
                return ((e) this.E).R(i10);
            case 1:
                a();
                h0.M(21, "no row");
                throw null;
            default:
                a();
                h0.M(21, "no row");
                throw null;
        }
    }

    @Override
    public final void close() throws IOException {
        switch (this.D) {
            case 0:
                ((e) this.E).close();
                break;
            case 1:
                ((i) this.E).close();
                this.C = true;
                break;
            default:
                this.C = true;
                break;
        }
    }

    @Override
    public final void d(int i10, long j9) {
        switch (this.D) {
            case 0:
                ((e) this.E).d(i10, j9);
                return;
            case 1:
                a();
                ((i) this.E).d(i10, j9);
                return;
            default:
                a();
                h0.M(25, "column index out of range");
                throw null;
        }
    }

    @Override
    public final boolean d0() throws NoWhenBranchMatchedException {
        switch (this.D) {
            case 0:
                e eVar = (e) this.E;
                boolean zD0 = eVar.d0();
                boolean zEqualsIgnoreCase = eVar.R(0).equalsIgnoreCase("wal");
                na.a aVar = this.A;
                if (zEqualsIgnoreCase) {
                    aVar.B();
                } else {
                    aVar.n();
                }
                return zD0;
            case 1:
                a();
                ((i) this.E).B.execute();
                return false;
            default:
                int iOrdinal = ((c) this.E).ordinal();
                na.a aVar2 = this.A;
                if (iOrdinal == 0) {
                    aVar2.E();
                    aVar2.P();
                    return false;
                }
                if (iOrdinal == 1) {
                    aVar2.P();
                    return false;
                }
                if (iOrdinal == 2) {
                    aVar2.k();
                    return false;
                }
                if (iOrdinal == 3) {
                    aVar2.H();
                    return false;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.u();
                return false;
        }
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        switch (this.D) {
            case 0:
                ((e) this.E).e(i10, bArr);
                return;
            case 1:
                a();
                ((i) this.E).e(i10, bArr);
                return;
            default:
                a();
                h0.M(25, "column index out of range");
                throw null;
        }
    }

    @Override
    public final void f(int i10) {
        switch (this.D) {
            case 0:
                ((e) this.E).f(i10);
                return;
            case 1:
                a();
                ((i) this.E).f(i10);
                return;
            default:
                a();
                h0.M(25, "column index out of range");
                throw null;
        }
    }

    @Override
    public final byte[] getBlob(int i10) {
        switch (this.D) {
            case 0:
                return ((e) this.E).getBlob(i10);
            case 1:
                a();
                h0.M(21, "no row");
                throw null;
            default:
                a();
                h0.M(21, "no row");
                throw null;
        }
    }

    @Override
    public final int getColumnCount() {
        switch (this.D) {
            case 0:
                return ((e) this.E).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    @Override
    public final String getColumnName(int i10) {
        switch (this.D) {
            case 0:
                return ((e) this.E).getColumnName(i10);
            case 1:
                a();
                h0.M(21, "no row");
                throw null;
            default:
                a();
                h0.M(21, "no row");
                throw null;
        }
    }

    @Override
    public final long getLong(int i10) {
        switch (this.D) {
            case 0:
                return ((e) this.E).getLong(i10);
            case 1:
                a();
                h0.M(21, "no row");
                throw null;
            default:
                a();
                h0.M(21, "no row");
                throw null;
        }
    }

    @Override
    public void h() {
        switch (this.D) {
            case 0:
                ((e) this.E).h();
                break;
            case 1:
                a();
                ((i) this.E).h();
                break;
            default:
                super.h();
                break;
        }
    }

    @Override
    public final boolean isNull(int i10) {
        switch (this.D) {
            case 0:
                return ((e) this.E).isNull(i10);
            case 1:
                a();
                h0.M(21, "no row");
                throw null;
            default:
                a();
                h0.M(21, "no row");
                throw null;
        }
    }

    @Override
    public void reset() {
        switch (this.D) {
            case 0:
                ((e) this.E).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override
    public final void y(int i10, String str) {
        switch (this.D) {
            case 0:
                m.e(str, "value");
                ((e) this.E).y(i10, str);
                return;
            case 1:
                m.e(str, "value");
                a();
                ((i) this.E).p(i10, str);
                return;
            default:
                m.e(str, "value");
                a();
                h0.M(25, "column index out of range");
                throw null;
        }
    }
}
