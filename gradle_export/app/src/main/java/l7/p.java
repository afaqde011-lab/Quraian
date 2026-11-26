package l7;

import a8.k0;
import a8.l0;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.common.v0;
import e7.i0;
import e7.u;
import java.nio.charset.StandardCharsets;
import s7.x0;
import s7.z0;

public final class p implements l0 {

    public final z0 f10108a;

    public final h7.b f10109b = new h7.b();

    public final j8.a f10110c = new j8.a(1);

    public long f10111d = -9223372036854775807L;

    public final q f10112e;

    public p(q qVar, a1.i iVar) {
        this.f10112e = qVar;
        this.f10108a = new z0(iVar, null, null);
    }

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) {
        return this.f10108a.b(jVar, i10, z10);
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, k0 k0Var) {
        long jH;
        long jK;
        this.f10108a.d(j9, i10, i11, i12, k0Var);
        while (this.f10108a.s(false)) {
            j8.a aVar = this.f10110c;
            aVar.q();
            if (this.f10108a.v(this.f10109b, aVar, 0, false) == -4) {
                aVar.t();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j10 = aVar.G;
                v0 v0VarS = this.f10112e.C.s(aVar);
                if (v0VarS != null) {
                    l8.a aVar2 = (l8.a) v0VarS.f1660a[0];
                    String str = aVar2.f10115a;
                    String str2 = aVar2.f10116b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jK = i0.K(new String(aVar2.f10119e, StandardCharsets.UTF_8));
                        } catch (ParserException unused) {
                            jK = -9223372036854775807L;
                        }
                        if (jK != -9223372036854775807L) {
                            o oVar = new o(j10, jK);
                            Handler handler = this.f10112e.D;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        z0 z0Var = this.f10108a;
        x0 x0Var = z0Var.f13797a;
        synchronized (z0Var) {
            int i13 = z0Var.f13813s;
            jH = i13 == 0 ? -1L : z0Var.h(i13);
        }
        x0Var.a(jH);
    }

    @Override
    public final void e(u uVar, int i10, int i11) {
        this.f10108a.e(uVar, i10, 0);
    }

    @Override
    public final void f(t tVar) {
        this.f10108a.f(tVar);
    }
}
