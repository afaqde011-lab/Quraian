package j7;

import a8.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.i0;
import androidx.media3.common.d1;
import com.google.android.gms.common.api.k;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.protobuf.RuntimeVersion;
import e7.m;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import k7.d0;
import k7.e0;
import k7.l;
import k7.s;
import k7.x;
import k7.y;
import k9.c1;
import k9.i2;
import k9.t0;
import k9.u;
import k9.v3;
import k9.z1;
import sd.y1;
import ta.c0;
import v7.p;

public final class e implements m, ii.e, c1, i2, e7.h {
    public final int A;

    public e(int i10) {
        this.A = i10;
    }

    @Override
    public void accept(Object obj) {
        v3 v3Var = (v3) obj;
        switch (this.A) {
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                v3Var.mute();
                break;
            case k.RECONNECTION_TIMED_OUT:
                v3Var.pause();
                break;
            case 23:
                v3Var.seekToNextMediaItem();
                break;
            case 24:
                v3Var.increaseDeviceVolume();
                break;
            case 25:
                v3Var.seekBack();
                break;
            case RuntimeVersion.MINOR:
                v3Var.seekToPrevious();
                break;
            case 27:
                v3Var.seekToPreviousMediaItem();
                break;
            case 28:
                v3Var.seekForward();
                break;
            default:
                v3Var.seekToNext();
                break;
        }
    }

    @Override
    public void c(z1 z1Var, int i10) {
        switch (this.A) {
            case TYPE_SINT64_VALUE:
                z1Var.getClass();
                break;
            case k.REMOTE_EXCEPTION:
                z1Var.getClass();
                break;
            default:
                z1Var.a(i10);
                break;
        }
    }

    @Override
    public void g(t0 t0Var) {
        switch (this.A) {
            case 14:
                if (t0Var.isConnected()) {
                    u uVar = t0Var.f9438a;
                    uVar.getClass();
                    c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                    uVar.f9522e.getClass();
                    return;
                }
                return;
            case 15:
                t0Var.f9446i.f(26, new n(7));
                return;
            case 16:
                u uVar2 = t0Var.f9438a;
                Objects.requireNonNull(uVar2);
                uVar2.b(new i0(uVar2, 26));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override
    public void invoke(Object obj) {
        long jO;
        gi.c cVar;
        i7.c0 c0Var;
        p pVar;
        switch (this.A) {
            case 0:
                ((i) obj).getClass();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 11:
            default:
                ((d1) obj).n(0.0f);
                return;
            case 6:
                y yVar = (y) obj;
                k7.c0 c0Var2 = yVar.f9185b;
                if (yVar.equals(c0Var2.f9004j) && c0Var2.f9006n != null) {
                    k0.n nVar = c0Var2.f9008p;
                    int i10 = nVar.f8478b;
                    if (i10 != -1) {
                        long j9 = ((k7.k) nVar.f8481e).f9105f / i10;
                        s sVar = c0Var2.f9012t;
                        sVar.getClass();
                        jO = e7.i0.O(sVar.f9134a.getSampleRate(), j9);
                    } else {
                        jO = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c0Var2.W;
                    gi.c cVar2 = c0Var2.f9006n;
                    int i11 = ((k7.k) c0Var2.f9008p.f8481e).f9105f;
                    long jW = e7.i0.W(jO);
                    k7.n nVar2 = ((e0) cVar2.B).f9033e1;
                    Handler handler = nVar2.f9111a;
                    if (handler != null) {
                        handler.post(new l(nVar2, i11, jW, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                y yVar2 = (y) obj;
                yVar2.getClass();
                k7.c0.f8992c0.getAndDecrement();
                gi.c cVar3 = yVar2.f9185b.f9006n;
                if (cVar3 != null) {
                    int i12 = yVar2.f9184a.f9100a;
                    d0 d0Var = new d0();
                    k7.n nVar3 = ((e0) cVar3.B).f9033e1;
                    Handler handler2 = nVar3.f9111a;
                    if (handler2 != null) {
                        handler2.post(new l(nVar3, d0Var, 3));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                y yVar3 = (y) obj;
                k7.c0 c0Var3 = yVar3.f9185b;
                if (yVar3.equals(c0Var3.f9004j) && (cVar = c0Var3.f9006n) != null && c0Var3.O && (c0Var = ((e0) cVar.B).f12424i0) != null) {
                    c0Var.a();
                    return;
                }
                return;
            case 9:
                y yVar4 = (y) obj;
                k7.c0 c0Var4 = yVar4.f9185b;
                if (yVar4.equals(c0Var4.f9004j)) {
                    c0Var4.N = true;
                    return;
                }
                return;
            case 10:
                gi.c cVar4 = ((x) obj).f9183a.f9006n;
                if (cVar4 != null) {
                    e0 e0Var = (e0) cVar4.B;
                    synchronized (e0Var.A) {
                        pVar = e0Var.R;
                        break;
                    }
                    if (pVar != null) {
                        synchronized (pVar.f15512c) {
                            pVar.f15515f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((d1) obj).r(1);
                return;
        }
    }

    @Override
    public Object m(y1 y1Var) {
        switch (this.A) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4342a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4344c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4343b.get();
            case 4:
                ii.l lVar = ExecutorsRegistrar.f4342a;
                return ji.l.A;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(y1Var);
        }
    }
}
