package ob;

import java.io.Closeable;
import r30.j;

public final class c implements Closeable {
    public final b A;
    public boolean B;
    public final e C;

    public c(e eVar, b bVar) {
        this.C = eVar;
        this.A = bVar;
    }

    @Override
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        e eVar = this.C;
        synchronized (eVar) {
            b bVar = this.A;
            int i10 = bVar.f11914h - 1;
            bVar.f11914h = i10;
            if (i10 == 0 && bVar.f11912f) {
                j jVar = e.Q;
                eVar.I(bVar);
            }
        }
    }
}
