package y7;

import android.view.Surface;
import androidx.media3.common.w2;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import q3.e0;

public final class c implements c0 {

    public final u f16643a;

    public final v f16644b;

    public final y f16645c;

    public final ArrayDeque f16646d;

    public Surface f16647e;

    public androidx.media3.common.t f16648f;

    public long f16649g;

    public b0 f16650h;

    public Executor f16651i;

    public t f16652j;

    public c(u uVar, v vVar, e7.b0 b0Var) {
        this.f16643a = uVar;
        this.f16644b = vVar;
        uVar.l = b0Var;
        this.f16645c = new y(new e0(this), uVar, vVar);
        this.f16646d = new ArrayDeque();
        this.f16648f = new androidx.media3.common.t(new androidx.media3.common.s());
        this.f16649g = -9223372036854775807L;
        this.f16650h = b0.f16642a;
        this.f16651i = new f5.d(2);
        this.f16652j = new a();
    }

    @Override
    public final void a(t tVar) {
        this.f16652j = tVar;
    }

    @Override
    public final boolean b() {
        y yVar = this.f16645c;
        long j9 = yVar.f16772j;
        return j9 != -9223372036854775807L && yVar.f16771i == j9;
    }

    @Override
    public final Surface c() {
        Surface surface = this.f16647e;
        surface.getClass();
        return surface;
    }

    @Override
    public final void d() {
        this.f16644b.b();
        u uVar = this.f16643a;
        uVar.f16728d = false;
        uVar.f16733i = -9223372036854775807L;
        x xVar = uVar.f16726b;
        xVar.f16749d = false;
        w wVar = xVar.f16748c;
        if (wVar != null) {
            wVar.f16742b.unregisterDisplayListener(wVar);
            wVar.f16745e.removeCallbacksAndMessages(null);
            wVar.f16741a.removeVsyncCallback(wVar);
            wVar.f16743c = -9223372036854775807L;
            wVar.f16744d = -9223372036854775807L;
        }
        xVar.a();
    }

    @Override
    public final void e() {
        this.f16644b.b();
        this.f16643a.d();
    }

    @Override
    public final void f(long j9) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void g() {
        y yVar = this.f16645c;
        if (yVar.f16770h == -9223372036854775807L) {
            yVar.f16770h = Long.MIN_VALUE;
            yVar.f16771i = Long.MIN_VALUE;
        }
        yVar.f16772j = yVar.f16770h;
    }

    @Override
    public final void h(int i10) {
        x xVar = this.f16643a.f16726b;
        if (xVar.f16755j == i10) {
            return;
        }
        xVar.f16755j = i10;
        xVar.d(true);
    }

    @Override
    public final void i() {
        this.f16647e = null;
        this.f16643a.g(null);
    }

    @Override
    public final boolean isInitialized() {
        return true;
    }

    @Override
    public final void j(androidx.media3.common.t tVar, long j9, int i10, List list) {
        ta.c0.A(list.isEmpty());
        int i11 = tVar.f1601u;
        int i12 = tVar.f1602v;
        androidx.media3.common.t tVar2 = this.f16648f;
        int i13 = tVar2.f1601u;
        y yVar = this.f16645c;
        if (i11 != i13 || i12 != tVar2.f1602v) {
            q1 q1Var = yVar.f16766d;
            long j10 = yVar.f16770h;
            q1Var.f(new w2(i11, i12), j10 == -9223372036854775807L ? 0L : j10 + 1);
        }
        float f3 = tVar.f1605y;
        if (f3 != this.f16648f.f1605y) {
            this.f16643a.f(f3);
        }
        this.f16648f = tVar;
        if (j9 != this.f16649g) {
            if (yVar.f16768f.D == 0) {
                yVar.f16764b.e(i10);
                yVar.l = j9;
            } else {
                q1 q1Var2 = yVar.f16767e;
                long j11 = yVar.f16770h;
                q1Var2.f(Long.valueOf(j9), j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1);
            }
            this.f16649g = j9;
        }
    }

    @Override
    public final void k(boolean z10) {
        if (z10) {
            u uVar = this.f16643a;
            uVar.f16726b.b();
            uVar.f16732h = -9223372036854775807L;
            uVar.f16730f = -9223372036854775807L;
            uVar.f16729e = Math.min(uVar.f16729e, 1);
            uVar.f16733i = -9223372036854775807L;
        }
        this.f16644b.b();
        y yVar = this.f16645c;
        q1 q1Var = yVar.f16766d;
        com.google.android.material.datepicker.n nVar = yVar.f16768f;
        nVar.B = 0;
        nVar.C = -1;
        nVar.D = 0;
        yVar.f16770h = -9223372036854775807L;
        yVar.f16771i = -9223372036854775807L;
        yVar.f16772j = -9223372036854775807L;
        q1 q1Var2 = yVar.f16767e;
        if (q1Var2.a0() > 0) {
            ta.c0.s(q1Var2.a0() > 0);
            while (q1Var2.a0() > 1) {
                q1Var2.T();
            }
            Object objT = q1Var2.T();
            objT.getClass();
            yVar.l = ((Long) objT).longValue();
        }
        if (q1Var.a0() > 0) {
            ta.c0.s(q1Var.a0() > 0);
            while (q1Var.a0() > 1) {
                q1Var.T();
            }
            Object objT2 = q1Var.T();
            objT2.getClass();
            q1Var.f((w2) objT2, 0L);
        }
        this.f16646d.clear();
    }

    @Override
    public final void l(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void m(long j9, long j10) throws VideoSink$VideoSinkException {
        try {
            this.f16645c.a(j9, j10);
        } catch (ExoPlaybackException e3) {
            throw new VideoSink$VideoSinkException(e3, this.f16648f);
        }
    }

    @Override
    public final void n(Surface surface, e7.v vVar) {
        this.f16647e = surface;
        this.f16643a.g(surface);
    }

    @Override
    public final void o(boolean z10) {
        this.f16643a.c(z10);
    }

    @Override
    public final boolean p(boolean z10) {
        return this.f16643a.b(z10);
    }

    @Override
    public final void q() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean r(long j9, f fVar) {
        this.f16646d.add(fVar);
        y yVar = this.f16645c;
        com.google.android.material.datepicker.n nVar = yVar.f16768f;
        int i10 = nVar.D;
        long[] jArr = (long[]) nVar.F;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i11 = nVar.B;
            int i12 = length2 - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy((long[]) nVar.F, 0, jArr2, i12, i11);
            nVar.B = 0;
            nVar.C = nVar.D - 1;
            nVar.F = jArr2;
            nVar.E = length - 1;
        }
        int i13 = (nVar.C + 1) & nVar.E;
        nVar.C = i13;
        ((long[]) nVar.F)[i13] = j9;
        nVar.D++;
        yVar.f16770h = j9;
        yVar.f16772j = -9223372036854775807L;
        this.f16651i.execute(new m9.f(this, 20));
        return true;
    }

    @Override
    public final void release() {
    }

    @Override
    public final boolean s(androidx.media3.common.t tVar) {
        return true;
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        this.f16643a.h(f3);
    }

    @Override
    public final void t(e eVar) {
        this.f16650h = eVar;
        this.f16651i = kh.p.A;
    }

    @Override
    public final void u() {
        u uVar = this.f16643a;
        if (uVar.f16729e == 0) {
            uVar.f16729e = 1;
        }
    }
}
