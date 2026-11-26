package y7;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import b3.g1;
import com.google.android.gms.internal.play_billing.q1;
import e7.d0;
import e7.i0;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.List;
import java.util.Locale;

public final class l implements c0 {

    public t0 f16703a;

    public androidx.media3.common.t f16704b;

    public long f16705c;

    public long f16706d;

    public int f16707e;

    public final p f16708f;

    public l(p pVar, Context context) {
        this.f16708f = pVar;
        i0.E(context);
        r0 r0Var = t0.B;
        this.f16703a = d2.E;
        this.f16706d = -9223372036854775807L;
    }

    @Override
    public final void a(t tVar) {
        this.f16708f.f16714e.f16652j = tVar;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final Surface c() {
        ta.c0.A(false);
        throw null;
    }

    @Override
    public final void d() {
        p pVar = this.f16708f;
        if (pVar.f16713d) {
            pVar.f16714e.d();
        }
    }

    @Override
    public final void e() {
        p pVar = this.f16708f;
        if (pVar.f16713d) {
            pVar.f16714e.e();
        }
    }

    @Override
    public final void f(long j9) {
        this.f16705c = j9;
    }

    @Override
    public final void g() {
        long j9 = this.f16706d;
        p pVar = this.f16708f;
        if (pVar.f16722o >= j9) {
            pVar.f16714e.g();
            pVar.f16723p = true;
        }
    }

    @Override
    public final void h(int i10) {
        this.f16708f.f16714e.h(i10);
    }

    @Override
    public final void i() {
        int i10 = e7.v.f5185c.f5187a;
        this.f16708f.l = null;
    }

    @Override
    public final boolean isInitialized() {
        return false;
    }

    @Override
    public final void j(androidx.media3.common.t tVar, long j9, int i10, List list) {
        ta.c0.A(false);
        this.f16703a = t0.o(list);
        this.f16704b = tVar;
        this.f16708f.f16723p = false;
        androidx.media3.common.s sVarA = tVar.a();
        androidx.media3.common.i iVar = tVar.D;
        if (iVar == null || !iVar.d()) {
            iVar = androidx.media3.common.i.f1238h;
        }
        sVarA.C = iVar;
        sVarA.a();
        throw null;
    }

    @Override
    public final void k(boolean z10) {
        this.f16706d = -9223372036854775807L;
        p pVar = this.f16708f;
        c cVar = pVar.f16714e;
        if (pVar.f16721n == 1) {
            pVar.m++;
            cVar.k(z10);
            while (pVar.f16719j.a0() > 1) {
                pVar.f16719j.T();
            }
            if (pVar.f16719j.a0() == 1) {
                ((o) pVar.f16719j.T()).getClass();
                throw null;
            }
            pVar.f16722o = -9223372036854775807L;
            if (z10) {
                pVar.f16723p = false;
            }
            d0 d0Var = pVar.f16720k;
            d0Var.getClass();
            d0Var.d(new m9.f(pVar, 21));
        }
    }

    @Override
    public final void l(List list) {
        if (this.f16703a.equals(list)) {
            return;
        }
        this.f16703a = t0.o(list);
        androidx.media3.common.t tVar = this.f16704b;
        if (tVar == null) {
            return;
        }
        androidx.media3.common.s sVarA = tVar.a();
        androidx.media3.common.i iVar = tVar.D;
        if (iVar == null || !iVar.d()) {
            iVar = androidx.media3.common.i.f1238h;
        }
        sVarA.C = iVar;
        sVarA.a();
        throw null;
    }

    @Override
    public final void m(long j9, long j10) throws VideoSink$VideoSinkException {
        this.f16708f.f16714e.m(j9 + this.f16705c, j10);
    }

    @Override
    public final void n(Surface surface, e7.v vVar) {
        p pVar = this.f16708f;
        Pair pair = pVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e7.v) pVar.l.second).equals(vVar)) {
            return;
        }
        pVar.l = Pair.create(surface, vVar);
        int i10 = vVar.f5187a;
    }

    @Override
    public final void o(boolean z10) {
        p pVar = this.f16708f;
        if (pVar.f16713d) {
            pVar.f16714e.o(z10);
        }
    }

    @Override
    public final boolean p(boolean z10) {
        return this.f16708f.f16714e.f16643a.b(false);
    }

    @Override
    public final void q() {
    }

    @Override
    public final boolean r(long j9, f fVar) {
        int i10;
        ta.c0.A(false);
        long j10 = j9 + this.f16705c;
        p pVar = this.f16708f;
        v vVar = pVar.f16718i;
        long j11 = vVar.f16737a;
        long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : (long) (((j10 - j11) * vVar.f16739c) + vVar.f16738b);
        if (j12 != -9223372036854775807L) {
            long j13 = pVar.f16717h;
            if (j13 != -9223372036854775807L && j12 < j13 && (i10 = this.f16707e) < 2) {
                this.f16707e = i10 + 1;
                h hVar = fVar.f16664c;
                g1 g1Var = fVar.f16662a;
                int i11 = fVar.f16663b;
                Trace.beginSection("dropVideoBuffer");
                g1Var.i(i11);
                Trace.endSection();
                hVar.Q0(0, 1);
                return true;
            }
        }
        int i12 = pVar.f16724q;
        if (i12 == -1 || i12 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void release() {
        p pVar = this.f16708f;
        if (pVar.f16721n == 2) {
            return;
        }
        d0 d0Var = pVar.f16720k;
        if (d0Var != null) {
            d0Var.f5120a.removeCallbacksAndMessages(null);
        }
        pVar.l = null;
        pVar.f16721n = 2;
    }

    @Override
    public final boolean s(androidx.media3.common.t tVar) throws VideoSink$VideoSinkException {
        boolean zG = true;
        ta.c0.A(!false);
        p pVar = this.f16708f;
        ta.c0.A(pVar.f16721n == 0);
        androidx.media3.common.i iVar = tVar.D;
        if (iVar == null || !iVar.d()) {
            iVar = androidx.media3.common.i.f1238h;
        }
        int i10 = iVar.f1245c;
        if (i10 == 7) {
            try {
                if (Build.VERSION.SDK_INT >= 34 || !e7.d.g("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    if (i10 == 6) {
                        zG = e7.d.g("EGL_EXT_gl_colorspace_bt2020_pq");
                    } else if (i10 == 7) {
                        zG = e7.d.g("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zG) {
                        Locale locale = Locale.US;
                        e7.a.m("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                        androidx.media3.common.i iVar2 = androidx.media3.common.i.f1238h;
                    } else if (i10 != 2 || i10 == 10) {
                        androidx.media3.common.i iVar3 = androidx.media3.common.i.f1238h;
                    }
                }
            } catch (GlUtil$GlException e3) {
                throw new VideoSink$VideoSinkException(e3, tVar);
            }
        } else {
            if (i10 == 6) {
                zG = e7.d.g("EGL_EXT_gl_colorspace_bt2020_pq");
            } else if (i10 == 7) {
                zG = e7.d.g("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zG) {
                Locale locale2 = Locale.US;
                e7.a.m("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                androidx.media3.common.i iVar4 = androidx.media3.common.i.f1238h;
            } else if (i10 != 2) {
                androidx.media3.common.i iVar5 = androidx.media3.common.i.f1238h;
            } else {
                androidx.media3.common.i iVar6 = androidx.media3.common.i.f1238h;
            }
        }
        e7.b0 b0Var = pVar.f16715f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        pVar.f16720k = b0Var.a(looperMyLooper, null);
        try {
            pVar.f16711b.a();
            throw null;
        } catch (VideoFrameProcessingException e10) {
            throw new VideoSink$VideoSinkException(e10, tVar);
        }
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        p pVar = this.f16708f;
        pVar.f16718i.c(f3);
        pVar.f16714e.setPlaybackSpeed(f3);
    }

    @Override
    public final void t(e eVar) {
    }

    @Override
    public final void u() {
        p pVar = this.f16708f;
        if (pVar.f16719j.a0() == 0) {
            pVar.f16714e.u();
            return;
        }
        q1 q1Var = new q1();
        if (pVar.f16719j.a0() <= 0) {
            pVar.f16719j = q1Var;
        } else {
            ((o) pVar.f16719j.T()).getClass();
            throw null;
        }
    }
}
