package ea;

import c3.y2;
import java.util.Iterator;
import qd.s0;

public final class i implements ma.a, j40.a {
    public final ma.a A;
    public final j40.a B;
    public k00.i C;
    public Throwable D;
    public final h E;

    public i(ma.a aVar) {
        j40.c cVarA = j40.d.a();
        kotlin.jvm.internal.m.e(aVar, "delegate");
        this.A = aVar;
        this.B = cVarA;
        this.E = new h(this);
    }

    public final boolean a(Object obj) {
        return this.B.a(obj);
    }

    @Override
    public final void close() throws Exception {
        h hVar = this.E;
        if (hVar != null) {
            hVar.h(-1);
        }
        this.A.close();
    }

    @Override
    public final boolean g() {
        return this.A.g();
    }

    public final void i(Object obj) {
        this.B.i(obj);
    }

    @Override
    public final ma.c k0(String str) {
        kotlin.jvm.internal.m.e(str, "sql");
        h hVar = this.E;
        if (hVar == null) {
            return this.A.k0(str);
        }
        Object objC = hVar.c(str);
        kotlin.jvm.internal.m.b(objC);
        return new g((ma.c) objC);
    }

    public final Object l(k00.c cVar) {
        return this.B.l(cVar);
    }

    public final void r(StringBuilder sb2) {
        int i10;
        h hVar = this.E;
        if (this.C == null && this.D == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            k00.i iVar = this.C;
            if (iVar != null) {
                sb2.append("\t\tCoroutine: " + iVar);
                sb2.append('\n');
            }
            Throwable th2 = this.D;
            if (th2 != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                Iterator it = h00.q.H0(q30.l.u0(new y2(s0.s0(th2), 8)), 1).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (hVar != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (hVar.f14893c) {
                i10 = hVar.f14894d;
            }
            sb3.append(i10);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.A.toString();
    }
}
