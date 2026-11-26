package pm;

import d40.d1;
import d40.o;
import d40.p1;
import g00.b0;
import jz.z;

public final class b implements d {
    public final int b = 0;
    public final d1 c = o.b(0, 7, null);
    public final p1 d;

    public b(Object obj) {
        this.d = o.c(obj);
    }

    public b(z zVar) {
        this.d = o.c(zVar);
    }

    @Override
    public final Object a(Object obj, k00.c cVar) throws Throwable {
        switch (this.b) {
            case 0:
                Object objEmit = this.c.emit(obj, cVar);
                return objEmit == l00.a.A ? objEmit : b0.a;
            default:
                Object objEmit2 = this.c.emit(obj, cVar);
                return objEmit2 == l00.a.A ? objEmit2 : b0.a;
        }
    }
}
