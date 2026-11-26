package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import ba.n1;
import ba.v0;
import fh.q0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import k9.y0;
import k9.z0;
import l9.j0;
import l9.y;

public final class f extends Handler {

    public final int f492a;

    public boolean f493b;

    public final Object f494c;

    public f(IBinder.DeathRecipient deathRecipient, Looper looper, int i10) {
        super(looper);
        this.f492a = i10;
        this.f494c = deathRecipient;
        this.f493b = false;
    }

    public f(n7.b bVar, Looper looper) {
        super(looper);
        this.f492a = 2;
        this.f494c = bVar;
    }

    @Override
    public final void handleMessage(Message message) {
        int repeatMode;
        boolean zI;
        long jMin;
        Object objH;
        s7.r rVar;
        switch (this.f492a) {
            case 0:
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.f494c;
                if (this.f493b) {
                    switch (message.what) {
                        case 1:
                            t.a(message.getData());
                            return;
                        case 2:
                            sVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            sVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            t.a((Bundle) message.obj);
                            return;
                        case 8:
                            sVar.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
            case 1:
                y0 y0Var = (y0) this.f494c;
                z0 z0Var = y0Var.f9550e;
                if (this.f493b) {
                    int i10 = message.what;
                    if (i10 == 2) {
                        y0Var.b((j0) message.obj);
                        return;
                    }
                    if (i10 == 8) {
                        z0Var.f9558b.release();
                        return;
                    }
                    if (i10 == 9) {
                        int iIntValue = ((Integer) message.obj).intValue();
                        v0 v0Var = z0Var.f9568n;
                        z0Var.f9568n = new v0((n1) v0Var.f2440d, (j0) v0Var.f2441e, (y) v0Var.f2442f, (List) v0Var.f2437a, (CharSequence) v0Var.f2443g, iIntValue, v0Var.f2439c, (Bundle) v0Var.f2444h);
                        y0Var.e();
                        return;
                    }
                    switch (i10) {
                        case 11:
                            y0Var.a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            v0 v0Var2 = z0Var.f9568n;
                            z0Var.f9568n = new v0((n1) v0Var2.f2440d, (j0) v0Var2.f2441e, (y) v0Var2.f2442f, (List) v0Var2.f2437a, (CharSequence) v0Var2.f2443g, v0Var2.f2438b, iIntValue2, (Bundle) v0Var2.f2444h);
                            y0Var.e();
                            return;
                        case 13:
                            if (!z0Var.l) {
                                z0Var.m();
                                return;
                            }
                            v0 v0Var3 = z0Var.f9568n;
                            j0 j0VarH = z0.h(z0Var.f9565i.r());
                            l9.d dVarA = ((l9.v) z0Var.f9565i.A).f10187e.a();
                            int iH = -1;
                            if (dVarA != null) {
                                try {
                                    repeatMode = dVarA.getRepeatMode();
                                } catch (RemoteException | SecurityException e3) {
                                    e7.a.e("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                    repeatMode = -1;
                                }
                            } else {
                                repeatMode = -1;
                            }
                            l9.d dVarA2 = ((l9.v) z0Var.f9565i.A).f10187e.a();
                            if (dVarA2 != null) {
                                try {
                                    iH = dVarA2.h();
                                } catch (RemoteException | SecurityException e10) {
                                    e7.a.e("MediaControllerCompat", "Dead object in getShuffleMode.", e10);
                                }
                                break;
                            }
                            z0Var.f9568n = new v0((n1) v0Var3.f2440d, j0VarH, (y) v0Var3.f2442f, (List) v0Var3.f2437a, (CharSequence) v0Var3.f2443g, repeatMode, iH, (Bundle) v0Var3.f2444h);
                            l9.d dVarA3 = ((l9.v) z0Var.f9565i.A).f10187e.a();
                            if (dVarA3 != null) {
                                try {
                                    zI = dVarA3.i();
                                } catch (RemoteException | SecurityException e11) {
                                    e7.a.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e11);
                                    zI = false;
                                }
                                break;
                            } else {
                                zI = false;
                            }
                            y0Var.a(zI);
                            y0Var.f9549d.removeMessages(1);
                            z0Var.j(false, z0Var.f9568n);
                            return;
                        default:
                            return;
                    }
                }
                return;
            default:
                n7.a aVar = (n7.a) message.obj;
                try {
                    int i11 = message.what;
                    if (i11 == 1) {
                        objH = ((n7.b) this.f494c).f11131k.h((n7.o) aVar.f11119c);
                    } else {
                        if (i11 != 2) {
                            throw new RuntimeException();
                        }
                        n7.b bVar = (n7.b) this.f494c;
                        n7.t tVarG = bVar.f11131k.g(bVar.l, (n7.n) aVar.f11119c);
                        synchronized (((n7.b) this.f494c).f11133o) {
                            try {
                                gi.c cVar = ((n7.b) this.f494c).f11143y;
                                if (cVar != null && (rVar = tVarG.f11184b) != null) {
                                    SystemClock.elapsedRealtime();
                                    ((q0) cVar.B).c(new s7.r(rVar.f13730a, rVar.f13731b, rVar.f13732c, rVar.f13733d, rVar.f13734e));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        objH = tVarG;
                    }
                } catch (MediaDrmCallbackException e12) {
                    n7.a aVar2 = (n7.a) message.obj;
                    objH = e12;
                    if (aVar2.f11118b) {
                        int i12 = aVar2.f11120d + 1;
                        aVar2.f11120d = i12;
                        ((n7.b) this.f494c).f11129i.getClass();
                        objH = e12;
                        if (i12 <= 3) {
                            g7.j jVar = e12.A;
                            Uri uri = e12.B;
                            Map map = e12.C;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            SystemClock.elapsedRealtime();
                            s7.r rVar2 = new s7.r(jVar, uri, map, jElapsedRealtime, e12.D);
                            Throwable defaultDrmSession$UnexpectedDrmSessionException = e12.getCause() instanceof IOException ? (IOException) e12.getCause() : new DefaultDrmSession$UnexpectedDrmSessionException(e12.getCause());
                            tf.w wVar = ((n7.b) this.f494c).f11129i;
                            int i13 = aVar2.f11120d;
                            wVar.getClass();
                            if ((defaultDrmSession$UnexpectedDrmSessionException instanceof ParserException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof FileNotFoundException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof HttpDataSource$CleartextNotPermittedException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof Loader$UnexpectedLoaderException)) {
                                jMin = -9223372036854775807L;
                            } else {
                                int i14 = DataSourceException.B;
                                while (true) {
                                    if (defaultDrmSession$UnexpectedDrmSessionException == null) {
                                        jMin = Math.min((i13 - 1) * 1000, 5000);
                                    } else if ((defaultDrmSession$UnexpectedDrmSessionException instanceof DataSourceException) && ((DataSourceException) defaultDrmSession$UnexpectedDrmSessionException).A == 2008) {
                                        jMin = -9223372036854775807L;
                                    } else {
                                        defaultDrmSession$UnexpectedDrmSessionException = defaultDrmSession$UnexpectedDrmSessionException.getCause();
                                    }
                                }
                            }
                            objH = e12;
                            if (jMin != -9223372036854775807L) {
                                synchronized (((n7.b) this.f494c).f11133o) {
                                    gi.c cVar2 = ((n7.b) this.f494c).f11143y;
                                    if (cVar2 != null) {
                                        ((q0) cVar2.B).c(rVar2);
                                    }
                                    synchronized (this) {
                                        try {
                                            if (!this.f493b) {
                                                sendMessageDelayed(Message.obtain(message), jMin);
                                                return;
                                            }
                                            objH = e12;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e13) {
                    e7.a.n("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e13);
                    objH = e13;
                }
                tf.w wVar2 = ((n7.b) this.f494c).f11129i;
                long j9 = aVar.f11117a;
                wVar2.getClass();
                synchronized (this) {
                    try {
                        if (!this.f493b) {
                            ((n7.b) this.f494c).f11132n.obtainMessage(message.what, Pair.create(aVar.f11119c, objH)).sendToTarget();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }
}
