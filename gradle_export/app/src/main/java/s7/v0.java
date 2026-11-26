package s7;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.k2;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public final class v0 extends a {

    public final g7.e f13771h;

    public final k7.t f13772i;

    public final n7.l f13773j;

    public final tf.w f13774k;
    public final int l;
    public final androidx.media3.common.t m;

    public boolean f13775n = true;

    public long f13776o = -9223372036854775807L;

    public boolean f13777p;

    public boolean f13778q;

    public g7.s f13779r;

    public androidx.media3.common.q0 f13780s;

    public v0(androidx.media3.common.q0 q0Var, g7.e eVar, k7.t tVar, n7.l lVar, tf.w wVar, int i10, androidx.media3.common.t tVar2) {
        this.f13780s = q0Var;
        this.f13771h = eVar;
        this.f13772i = tVar;
        this.f13773j = lVar;
        this.f13774k = wVar;
        this.l = i10;
        this.m = tVar2;
    }

    @Override
    public final boolean a(androidx.media3.common.q0 q0Var) {
        androidx.media3.common.l0 l0Var = h().f1414b;
        l0Var.getClass();
        androidx.media3.common.l0 l0Var2 = q0Var.f1414b;
        return l0Var2 != null && l0Var2.f1328a.equals(l0Var.f1328a) && l0Var2.f1335h == l0Var.f1335h && Objects.equals(l0Var2.f1333f, l0Var.f1333f);
    }

    @Override
    public final y b(a0 a0Var, a1.i iVar, long j9) {
        g7.f fVarT = this.f13771h.t();
        g7.s sVar = this.f13779r;
        if (sVar != null) {
            fVarT.s(sVar);
        }
        androidx.media3.common.l0 l0Var = h().f1414b;
        l0Var.getClass();
        Uri uri = l0Var.f1328a;
        this.f13643g.getClass();
        return new s0(uri, fVarT, new k9.x0((a8.t) this.f13772i.B, 29), this.f13773j, new n7.h(this.f13640d.f11170c, 0, a0Var), this.f13774k, new c50.h((CopyOnWriteArrayList) this.f13639c.D, 0, a0Var), this, iVar, l0Var.f1333f, this.l, this.m, e7.i0.H(l0Var.f1335h), null);
    }

    @Override
    public final synchronized androidx.media3.common.q0 h() {
        return this.f13780s;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l(g7.s sVar) {
        this.f13779r = sVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        j7.j jVar = this.f13643g;
        jVar.getClass();
        n7.l lVar = this.f13773j;
        lVar.b(looperMyLooper, jVar);
        lVar.prepare();
        t();
    }

    @Override
    public final void n(y yVar) {
        s0 s0Var = (s0) yVar;
        if (s0Var.Y) {
            for (z0 z0Var : s0Var.V) {
                z0Var.j();
                n7.e eVar = z0Var.f13804h;
                if (eVar != null) {
                    eVar.c(z0Var.f13801e);
                    z0Var.f13804h = null;
                    z0Var.f13803g = null;
                }
            }
        }
        s0Var.M.c(s0Var);
        s0Var.R.removeCallbacksAndMessages(null);
        s0Var.S = null;
        s0Var.f13755q0 = true;
    }

    @Override
    public final void p() {
        this.f13773j.release();
    }

    @Override
    public final synchronized void s(androidx.media3.common.q0 q0Var) {
        this.f13780s = q0Var;
    }

    public final void t() {
        k2 e1Var = new e1(this.f13776o, this.f13777p, this.f13778q, h());
        if (this.f13775n) {
            e1Var = new t0(e1Var);
        }
        m(e1Var);
    }

    public final void u(long j9, a8.d0 d0Var, boolean z10) {
        if (j9 == -9223372036854775807L) {
            j9 = this.f13776o;
        }
        boolean zB = d0Var.b();
        if (!this.f13775n && this.f13776o == j9 && this.f13777p == zB && this.f13778q == z10) {
            return;
        }
        this.f13776o = j9;
        this.f13777p = zB;
        this.f13778q = z10;
        this.f13775n = false;
        t();
    }
}
