package l7;

import androidx.media3.common.t;
import g7.r;
import java.io.IOException;
import java.util.ConcurrentModificationException;

public final class h implements w7.h {
    public final int A;
    public final Object B;

    public h(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    private final void a(w7.j jVar, long j9, long j10, boolean z10) {
    }

    @Override
    public final i9.d f(w7.j jVar, long j9, long j10, IOException iOException, int i10) {
        switch (this.A) {
            case 0:
                w7.o oVar = (w7.o) jVar;
                i iVar = (i) this.B;
                c50.h hVar = iVar.f10077q;
                long j11 = oVar.A;
                g7.j jVar2 = oVar.B;
                r rVar = oVar.D;
                hVar.u(new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B), oVar.C, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                iVar.m.getClass();
                iVar.w(iOException);
                break;
            default:
                ((d) this.B).A.w(iOException);
                break;
        }
        return w7.l.f15874d;
    }

    @Override
    public final void r(w7.j jVar, long j9, long j10, boolean z10) {
        switch (this.A) {
            case 0:
                ((i) this.B).v((w7.o) jVar, j9);
                break;
        }
    }

    @Override
    public final void u(w7.j jVar, long j9, long j10) {
        boolean z10;
        switch (this.A) {
            case 0:
                w7.o oVar = (w7.o) jVar;
                i iVar = (i) this.B;
                long j11 = oVar.A;
                g7.j jVar2 = oVar.B;
                r rVar = oVar.D;
                s7.r rVar2 = new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B);
                iVar.m.getClass();
                iVar.f10077q.t(rVar2, oVar.C, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                iVar.K = ((Long) oVar.F).longValue() - j9;
                iVar.x(true);
                return;
            default:
                d dVar = (d) this.B;
                synchronized (x7.b.f16473b) {
                    z10 = x7.b.f16474c;
                    break;
                }
                if (z10) {
                    dVar.a();
                    return;
                } else {
                    dVar.A.w(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }
}
