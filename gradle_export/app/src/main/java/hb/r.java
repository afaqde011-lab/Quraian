package hb;

import g00.b0;

public final class r implements u00.k {
    public final int A;
    public final long B;
    public final String C;

    public r(String str, long j9, int i10) {
        this.A = i10;
        this.B = j9;
        this.C = str;
    }

    public final Object invoke(Object obj) throws Exception {
        switch (this.A) {
            case 0:
                long j9 = this.B;
                String str = this.C;
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cVarK0.d(1, j9);
                    cVarK0.y(2, str);
                    cVarK0.d0();
                    return Integer.valueOf(w00.a.x(aVar));
                } finally {
                    cVarK0.close();
                }
            default:
                long j10 = this.B;
                String str2 = this.C;
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cVarK1.d(1, j10);
                    cVarK1.y(2, str2);
                    cVarK1.d0();
                    return b0.a;
                } finally {
                    cVarK1.close();
                }
        }
    }
}
