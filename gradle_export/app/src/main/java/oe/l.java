package oe;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.media3.common.w2;
import androidx.media3.exoplayer.ExoPlaybackException;
import b3.g1;
import com.google.android.gms.cloudmessaging.zzt;
import e7.i0;
import oi.r;
import y7.u;

public final class l implements Handler.Callback {
    public final int A;
    public final Object B;

    public l(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public l(y7.h hVar, final g1 g1Var) {
        this.A = 2;
        this.B = hVar;
        ((MediaCodec) g1Var.f2030d).setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j9, long j10) {
                g1Var.getClass();
                this.a(j9);
            }
        }, i0.l(this));
    }

    public void a(long j9) {
        Surface surface;
        y7.h hVar = (y7.h) this.B;
        k7.n nVar = hVar.f16675g1;
        if (this != hVar.Q1 || hVar.f12429n0 == null) {
            return;
        }
        if (j9 == Long.MAX_VALUE) {
            hVar.R0 = true;
            return;
        }
        try {
            hVar.B0(j9);
            w2 w2Var = hVar.L1;
            if (!w2Var.equals(w2.f1669d) && !w2Var.equals(hVar.M1)) {
                hVar.M1 = w2Var;
                nVar.b(w2Var);
            }
            hVar.T0.f7238e++;
            u uVar = hVar.f16678j1;
            boolean z10 = uVar.f16729e != 3;
            uVar.f16729e = 3;
            uVar.l.getClass();
            uVar.f16731g = i0.H(SystemClock.elapsedRealtime());
            if (z10 && (surface = hVar.f16690v1) != null) {
                Handler handler = nVar.f9111a;
                if (handler != null) {
                    handler.post(new r(nVar, surface, SystemClock.elapsedRealtime()));
                }
                hVar.f16693y1 = true;
            }
            hVar.g0(j9);
        } catch (ExoPlaybackException e3) {
            hVar.S0 = e3;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.A) {
            case 0:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                m mVar = (m) this.B;
                synchronized (mVar) {
                    try {
                        n nVar = (n) mVar.E.get(i10);
                        if (nVar != null) {
                            mVar.E.remove(i10);
                            mVar.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (nVar.f11954e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            nVar.b(new zzt("Invalid response to one way request", null));
                                        } else {
                                            nVar.c(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        nVar.c(bundle);
                                        break;
                                }
                            } else {
                                nVar.b(new zzt("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                nf.c cVar = (nf.c) this.B;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (cVar.A) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                int i11 = message.arg1;
                int i12 = message.arg2;
                String str = i0.f5136a;
                a(((((long) i11) & 4294967295L) << 32) | (4294967295L & ((long) i12)));
                return true;
        }
    }
}
