package pl;

import g00.b0;
import h00.x;

public final class b implements u00.k {
    public final int A;
    public final int B;
    public final long C;
    public final Object D;

    public b(int i, Object obj, long j, int i2) {
        this.A = i2;
        this.B = i;
        this.D = obj;
        this.C = j;
    }

    @Override
    public final Object invoke(Object obj) throws Exception {
        switch (this.A) {
            case 0:
                z1.p pVar = (z1.p) this.D;
                k2.d Canvas = (k2.d) obj;
                kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                if (this.B >= 0) {
                    f50.c.u(Canvas, pVar, this.C, x.A);
                }
                return b0.a;
            default:
                int i = this.B;
                String str = (String) this.D;
                long j = this.C;
                ma.a _connection = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection, "_connection");
                ma.c cVarK0 = _connection.k0("UPDATE audio_story_progress SET needs_upload = 0 WHERE episode_id = ? AND language = ? AND updated_at = ?");
                try {
                    cVarK0.d(1, i);
                    cVarK0.y(2, str);
                    cVarK0.d(3, j);
                    cVarK0.d0();
                    return b0.a;
                } finally {
                    cVarK0.close();
                }
        }
    }
}
