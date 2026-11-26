package ee;

import android.content.Context;
import wj.g0;
import wj.p0;

public final class k implements zd.b, yj.b {
    public final int A;
    public final f00.a B;

    public k(f00.a aVar, int i10) {
        this.A = i10;
        this.B = aVar;
    }

    public final Object get() {
        switch (this.A) {
            case 0:
                return new j(Integer.valueOf(j.D).intValue(), (Context) this.B.get(), "com.google.android.datatransport.events");
            default:
                return new g0((p0) this.B.get());
        }
    }
}
