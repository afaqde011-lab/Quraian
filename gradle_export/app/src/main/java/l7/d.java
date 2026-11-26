package l7;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import e7.i0;
import g7.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public final class d implements w7.h {
    public final i A;

    public void a() {
        long j9;
        i iVar = this.A;
        synchronized (x7.b.f16473b) {
            try {
                j9 = x7.b.f16474c ? x7.b.f16475d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iVar.K = j9;
        iVar.x(true);
    }

    @Override
    public i9.d f(w7.j jVar, long j9, long j10, IOException iOException, int i10) {
        long jMin;
        w7.o oVar = (w7.o) jVar;
        long j11 = oVar.A;
        g7.j jVar2 = oVar.B;
        r rVar = oVar.D;
        s7.r rVar2 = new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B);
        int i11 = oVar.C;
        i iVar = this.A;
        iVar.m.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader$UnexpectedLoaderException)) {
            int i12 = DataSourceException.B;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).A == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        i9.d dVar = jMin == -9223372036854775807L ? w7.l.f15875e : new i9.d(0, jMin, false);
        int i13 = dVar.f7552a;
        iVar.f10077q.u(rVar2, i11, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, !(i13 == 0 || i13 == 1));
        return dVar;
    }

    @Override
    public void h(w7.j jVar, long j9, long j10, int i10) {
        s7.r rVar;
        w7.o oVar = (w7.o) jVar;
        if (i10 == 0) {
            long j11 = oVar.A;
            rVar = new s7.r(oVar.B, j9);
        } else {
            long j12 = oVar.A;
            g7.j jVar2 = oVar.B;
            r rVar2 = oVar.D;
            rVar = new s7.r(jVar2, rVar2.C, rVar2.D, j9, rVar2.B);
        }
        this.A.f10077q.w(rVar, oVar.C, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void r(w7.j jVar, long j9, long j10, boolean z10) {
        this.A.v((w7.o) jVar, j9);
    }

    @Override
    public void u(w7.j jVar, long j9, long j10) {
        w7.o oVar = (w7.o) jVar;
        i iVar = this.A;
        long j11 = oVar.A;
        g7.j jVar2 = oVar.B;
        r rVar = oVar.D;
        s7.r rVar2 = new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B);
        iVar.m.getClass();
        iVar.f10077q.t(rVar2, oVar.C, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        m7.c cVar = (m7.c) oVar.F;
        m7.c cVar2 = iVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j12 = cVar.a(0).f10607b;
        int i10 = 0;
        while (i10 < size && iVar.G.a(i10).f10607b < j12) {
            i10++;
        }
        if (cVar.f10583d) {
            if (size - i10 > cVar.m.size()) {
                e7.a.m("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = iVar.M;
                if (j13 == -9223372036854775807L || cVar.f10587h * 1000 > j13) {
                    iVar.L = 0;
                } else {
                    e7.a.m("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f10587h + ", " + iVar.M);
                }
            }
            int i11 = iVar.L;
            iVar.L = i11 + 1;
            if (i11 < iVar.m.n(oVar.C)) {
                iVar.D.postDelayed(iVar.f10082v, Math.min((iVar.L - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new DashManifestStaleException();
                return;
            }
        }
        iVar.G = cVar;
        iVar.H = cVar.f10583d & iVar.H;
        iVar.I = j9 - j10;
        iVar.J = j9;
        iVar.N += i10;
        synchronized (iVar.f10080t) {
            if (oVar.B.f6218a.equals(iVar.E)) {
                Uri uriY = iVar.G.f10590k;
                if (uriY == null) {
                    uriY = rd.a.Y(oVar.D.C);
                }
                iVar.E = uriY;
            }
        }
        m7.c cVar3 = iVar.G;
        if (!cVar3.f10583d || iVar.K != -9223372036854775807L) {
            iVar.x(true);
            return;
        }
        gd.d dVar = cVar3.f10588i;
        if (dVar == null) {
            iVar.u();
            return;
        }
        String str = dVar.f6314b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar.K = i0.K(dVar.f6315c) - iVar.J;
                iVar.x(true);
                return;
            } catch (ParserException e3) {
                iVar.w(e3);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            iVar.y(dVar, new g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            iVar.y(dVar, new gj.e(20));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            iVar.u();
        } else {
            iVar.w(new IOException("Unsupported UTC timing scheme"));
        }
    }
}
