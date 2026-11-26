package bb;

import ab.f;
import ab.k;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.cast.s;
import androidx.media3.common.b1;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.l;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b5;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import fh.e1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k9.c4;
import k9.e2;
import k9.p;
import k9.q2;
import k9.s1;
import k9.t2;
import k9.v3;
import k9.z1;
import k9.z3;
import kh.q;
import kh.r;
import kotlin.jvm.internal.m;
import l9.c0;
import l9.f0;
import l9.l0;
import l9.v;
import me.i;
import tf.b0;
import tf.h1;
import tf.w0;
import tf.y3;

public final class d implements q, z1 {
    public long A;
    public Object B;
    public Object C;
    public Object D;
    public final Object E;

    public d(d dVar, t0 t0Var, String str, Uri uri, long j9) {
        this.E = dVar;
        this.B = t0Var;
        this.C = str;
        this.D = uri;
        this.A = j9;
    }

    public d(t2 t2Var) {
        this.E = t2Var;
        this.B = t0.K;
        this.C = RuntimeVersion.SUFFIX;
        this.A = -9223372036854775807L;
    }

    public d(i iVar, f0 f0Var) {
        m.e(iVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.B = iVar;
        this.C = f0Var;
        this.A = millis;
        this.D = new Object();
        this.E = new LinkedHashMap();
    }

    public d(w0 w0Var, long j9) {
        this.E = w0Var;
        d0.e("health_monitor");
        d0.b(j9 > 0);
        this.B = "health_monitor:start";
        this.C = "health_monitor:count";
        this.D = "health_monitor:value";
        this.A = j9;
    }

    public void A() {
        w0 w0Var = (w0) this.E;
        w0Var.V0();
        ((h1) w0Var.B).K.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = w0Var.Z0().edit();
        editorEdit.remove((String) this.C);
        editorEdit.remove((String) this.D);
        editorEdit.putLong((String) this.B, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public void c(ab.m mVar) {
        Runnable runnable;
        m.e(mVar, "token");
        synchronized (this.D) {
            runnable = (Runnable) ((LinkedHashMap) this.E).remove(mVar);
        }
        if (runnable != null) {
            ((Handler) ((i) this.B).B).removeCallbacks(runnable);
        }
    }

    public void e(androidx.media3.common.d dVar) {
        t2 t2Var = (t2) this.E;
        if (t2Var.f9463f.f9430t.getDeviceInfo().f1318a == 0) {
            f0 f0Var = t2Var.f9467j;
            int i10 = 1;
            if ((dVar.f1149b & 1) != 1) {
                switch (dVar.f1150c) {
                    case 2:
                        i10 = 0;
                        break;
                    case 3:
                        i10 = 8;
                        break;
                    case 4:
                        i10 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i10 = 5;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 11:
                        i10 = 10;
                        break;
                    case 12:
                    default:
                        i10 = 3;
                        break;
                    case 13:
                        break;
                }
            }
            c0 c0Var = (c0) f0Var.B;
            c0Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            c0Var.f10126a.setPlaybackToLocal(builder.build());
        }
    }

    @Override
    public void f(int i10, c4 c4Var, boolean z10, boolean z11, int i11) {
        t2 t2Var = (t2) this.E;
        t2Var.P(t2Var.f9463f.f9430t);
    }

    @Override
    public void g() {
    }

    public void h() {
        int i10;
        q2 q2Var;
        t2 t2Var = (t2) this.E;
        f0 f0Var = t2Var.f9467j;
        v3 v3Var = t2Var.f9463f.f9430t;
        int i11 = 2;
        if (v3Var.getDeviceInfo().f1318a == 0) {
            q2Var = null;
        } else {
            b1 availableCommands = v3Var.getAvailableCommands();
            if (availableCommands.f1103a.a(26, 34)) {
                i10 = availableCommands.f1103a.a(25, 33) ? 2 : 1;
            } else {
                i10 = 0;
            }
            Handler handler = new Handler(v3Var.getApplicationLooper());
            int deviceVolume = v3Var.isCommandAvailable(23) ? v3Var.getDeviceVolume() : 0;
            l deviceInfo = v3Var.getDeviceInfo();
            q2Var = new q2(i10, deviceInfo.f1320c, deviceVolume, deviceInfo.f1321d, handler, v3Var);
        }
        t2Var.m = q2Var;
        if (q2Var != null) {
            MediaSession mediaSession = ((c0) f0Var.B).f10126a;
            if (q2Var.f9404e == null) {
                q2Var.f9404e = new l0(q2Var, q2Var.f9400a, q2Var.f9401b, q2Var.f9403d, q2Var.f9402c, 0);
            }
            mediaSession.setPlaybackToRemote(q2Var.f9404e);
            return;
        }
        androidx.media3.common.d audioAttributes = v3Var.isCommandAvailable(21) ? v3Var.getAudioAttributes() : androidx.media3.common.d.f1142i;
        if ((audioAttributes.f1149b & 1) != 1) {
            switch (audioAttributes.f1150c) {
                case 2:
                    i11 = 0;
                    break;
                case 3:
                    i11 = 8;
                    break;
                case 4:
                    i11 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i11 = 5;
                    break;
                case 6:
                    break;
                case 11:
                    i11 = 10;
                    break;
                case 12:
                default:
                    i11 = 3;
                    break;
                case 13:
                    i11 = 1;
                    break;
            }
        } else {
            i11 = 1;
        }
        c0 c0Var = (c0) f0Var.B;
        c0Var.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i11);
        c0Var.f10126a.setPlaybackToLocal(builder.build());
    }

    @Override
    public void h0(Throwable th2) {
        if (this != ((t2) ((d) this.E).E).f9471p) {
            return;
        }
        e7.a.m("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void i(int i10, List list) {
        t2 t2Var = (t2) this.E;
        t2Var.P(t2Var.f9463f.f9430t);
    }

    public void k(q0 q0Var) {
        t2 t2Var = (t2) this.E;
        f0 f0Var = t2Var.f9467j;
        x();
        if (q0Var == null) {
            ((c0) f0Var.B).f10126a.setRatingType(0);
        } else {
            ((c0) f0Var.B).f10126a.setRatingType(p.w(q0Var.f1416d.f1635i));
        }
        t2Var.P(t2Var.f9463f.f9430t);
    }

    public void l(int i10, v3 v3Var, v3 v3Var2) {
        t2 t2Var = (t2) this.E;
        k2 k2VarD = v3Var2.d();
        if (v3Var == null || !Objects.equals(v3Var.d(), k2VarD)) {
            v(k2VarD);
        }
        t0 playlistMetadata = v3Var2.isCommandAvailable(18) ? v3Var2.getPlaylistMetadata() : t0.K;
        if (v3Var == null) {
            n(playlistMetadata);
        } else {
            if (!Objects.equals(v3Var.isCommandAvailable(18) ? v3Var.getPlaylistMetadata() : t0.K, playlistMetadata)) {
                n(playlistMetadata);
            }
        }
        t0 t0VarE = v3Var2.e();
        if (v3Var == null || !Objects.equals(v3Var.e(), t0VarE)) {
            x();
        }
        if (v3Var == null || v3Var.getShuffleModeEnabled() != v3Var2.getShuffleModeEnabled()) {
            q(v3Var2.getShuffleModeEnabled());
        }
        if (v3Var == null || v3Var.getRepeatMode() != v3Var2.getRepeatMode()) {
            o(v3Var2.getRepeatMode());
        }
        v3Var2.getDeviceInfo();
        h();
        int i11 = v3Var2.isCommandAvailable(20) ? 4 : 0;
        if (t2Var.f9472q != i11) {
            t2Var.f9472q = i11;
            ((c0) t2Var.f9467j.B).f10126a.setFlags(i11 | 3);
        }
        q0 q0VarC = v3Var2.c();
        if (v3Var == null || !Objects.equals(v3Var.c(), q0VarC)) {
            k(q0VarC);
        } else {
            t2Var.P(v3Var2);
        }
    }

    @Override
    public void m(int i10, z3 z3Var) {
        Bundle bundle = z3Var.f9580c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        f0 f0Var = ((t2) this.E).f9467j;
        String str = z3Var.f9579b;
        f0Var.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((c0) f0Var.B).f10126a.sendSessionEvent(str, bundle);
    }

    public void n(t0 t0Var) {
        t2 t2Var = (t2) this.E;
        f0 f0Var = t2Var.f9467j;
        CharSequence queueTitle = ((v) ((h7.b) f0Var.C).A).f10183a.getQueueTitle();
        CharSequence charSequence = t0Var.f1627a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        v3 v3Var = t2Var.f9463f.f9430t;
        if (!t2Var.f9478w.a(17) || !v3Var.getAvailableCommands().a(17)) {
            charSequence = null;
        }
        ((c0) f0Var.B).f10126a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        f0 f0Var = ((t2) this.E).f9467j;
        int iP = p.p(i10);
        c0 c0Var = (c0) f0Var.B;
        if (c0Var.f10135j != iP) {
            c0Var.f10135j = iP;
            synchronized (c0Var.f10129d) {
                for (int iBeginBroadcast = c0Var.f10131f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((l9.b) c0Var.f10131f.getBroadcastItem(iBeginBroadcast)).e(iP);
                    } catch (RemoteException | SecurityException e3) {
                        e7.a.e("MediaSessionCompat", "Dead object in setRepeatMode.", e3);
                    }
                }
                c0Var.f10131f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        t2 t2Var = (t2) ((d) this.E).E;
        if (this != t2Var.f9471p) {
            return;
        }
        t2.E(t2Var.f9467j, p.n((t0) this.B, (String) this.C, (Uri) this.D, this.A, bitmap));
        s1 s1Var = t2Var.f9463f;
        i0.M(s1Var.f9425o, new e2(s1Var, 1));
    }

    public void q(boolean z10) {
        f0 f0Var = ((t2) this.E).f9467j;
        e1 e1Var = p.f9381a;
        c0 c0Var = (c0) f0Var.B;
        if (c0Var.f10136k != z10) {
            c0Var.f10136k = z10 ? 1 : 0;
            synchronized (c0Var.f10129d) {
                for (int iBeginBroadcast = c0Var.f10131f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((l9.b) c0Var.f10131f.getBroadcastItem(iBeginBroadcast)).u1(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e3) {
                        e7.a.e("MediaSessionCompat", "Dead object in setShuffleMode.", e3);
                    }
                }
                c0Var.f10131f.finishBroadcast();
            }
        }
    }

    @Override
    public void s(int i10, b1 b1Var) {
        t2 t2Var = (t2) this.E;
        v3 v3Var = t2Var.f9463f.f9430t;
        int i11 = v3Var.isCommandAvailable(20) ? 4 : 0;
        if (t2Var.f9472q != i11) {
            t2Var.f9472q = i11;
            ((c0) t2Var.f9467j.B).f10126a.setFlags(i11 | 3);
        }
        t2Var.P(v3Var);
    }

    public void v(k2 k2Var) {
        y(k2Var);
        x();
    }

    public void w(ab.m mVar) {
        m.e(mVar, "token");
        f fVar = new f(this, mVar, 2);
        synchronized (this.D) {
        }
        i iVar = (i) this.B;
        ((Handler) iVar.B).postDelayed(fVar, this.A);
    }

    public void x() {
        long j9;
        Uri uri;
        t0 t0Var;
        Uri uri2;
        t2 t2Var = (t2) this.E;
        s1 s1Var = t2Var.f9463f;
        v3 v3Var = s1Var.f9430t;
        q0 q0VarC = v3Var.c();
        t0 t0VarE = v3Var.e();
        long duration = -9223372036854775807L;
        if ((!v3Var.isCommandAvailable(16) || !v3Var.isCurrentMediaItemLive()) && v3Var.isCommandAvailable(16)) {
            duration = v3Var.getDuration();
        }
        String str = q0VarC != null ? q0VarC.f1413a : RuntimeVersion.SUFFIX;
        Bitmap bitmap = null;
        Uri uri3 = (q0VarC == null || (uri2 = q0VarC.f1418f.f1348a) == null) ? null : uri2;
        if (Objects.equals((t0) this.B, t0VarE) && Objects.equals((String) this.C, str) && Objects.equals((Uri) this.D, uri3) && this.A == duration) {
            return;
        }
        this.C = str;
        this.D = uri3;
        this.B = t0VarE;
        this.A = duration;
        kh.v vVarX0 = s1Var.m.x0(t0VarE);
        if (vVarX0 != null) {
            t2Var.f9471p = null;
            if (vVarX0.isDone()) {
                try {
                    bitmap = (Bitmap) b5.u(vVarX0);
                } catch (CancellationException | ExecutionException e3) {
                    e7.a.m("MediaSessionLegacyStub", "Failed to load bitmap: " + e3.getMessage());
                }
                j9 = duration;
                uri = uri3;
                t0Var = t0VarE;
            } else {
                j9 = duration;
                uri = uri3;
                t0Var = t0VarE;
                d dVar = new d(this, t0Var, str, uri, j9);
                str = str;
                t2Var.f9471p = dVar;
                Handler handler = s1Var.l;
                Objects.requireNonNull(handler);
                vVarX0.a(new r(vVarX0, dVar, 0), new s(handler));
            }
        } else {
            j9 = duration;
            uri = uri3;
            t0Var = t0VarE;
        }
        t2.E(t2Var.f9467j, p.n(t0Var, str, uri, j9, bitmap));
    }

    public void y(k2 k2Var) {
        t2 t2Var = (t2) this.E;
        s1 s1Var = t2Var.f9463f;
        v3 v3Var = s1Var.f9430t;
        if (!t2Var.f9478w.a(17) || !v3Var.getAvailableCommands().a(17) || k2Var.isEmpty()) {
            t2.D(t2Var.f9467j, null);
            return;
        }
        e1 e1Var = p.f9381a;
        ArrayList arrayList = new ArrayList();
        j2 j2Var = new j2();
        for (int i10 = 0; i10 < k2Var.getWindowCount(); i10++) {
            arrayList.add(k2Var.getWindow(i10, j2Var).f1285c);
        }
        ArrayList arrayList2 = new ArrayList();
        k kVar = new k((Object) this, (Object) new AtomicInteger(0), (Object) arrayList, (Object) arrayList2, 9);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr = ((q0) arrayList.get(i11)).f1416d.f1637k;
            if (bArr == null) {
                arrayList2.add(null);
                kVar.run();
            } else {
                kh.v vVarO0 = s1Var.m.o0(bArr);
                arrayList2.add(vVarO0);
                Handler handler = s1Var.l;
                Objects.requireNonNull(handler);
                vVarO0.a(kVar, new s(handler));
            }
        }
    }

    public boolean z(long j9, a3 a3Var) {
        int size;
        if (((ArrayList) this.D) == null) {
            this.D = new ArrayList();
        }
        if (((ArrayList) this.C) == null) {
            this.C = new ArrayList();
        }
        if (((ArrayList) this.D).isEmpty() || ((((a3) ((ArrayList) this.D).get(0)).u() / 1000) / 60) / 60 == ((a3Var.u() / 1000) / 60) / 60) {
            long jK = this.A + ((long) a3Var.k());
            y3 y3Var = (y3) this.E;
            if (!y3Var.b0().f1(null, b0.f14556d1)) {
                y3Var.b0();
                if (jK < Math.max(0, ((Integer) b0.f14572j.a(null)).intValue())) {
                    this.A = jK;
                    ((ArrayList) this.D).add(a3Var);
                    ((ArrayList) this.C).add(Long.valueOf(j9));
                    size = ((ArrayList) this.D).size();
                    y3Var.b0();
                    if (size < Math.max(1, ((Integer) b0.f14575k.a(null)).intValue())) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.D).isEmpty()) {
                this.A = jK;
                ((ArrayList) this.D).add(a3Var);
                ((ArrayList) this.C).add(Long.valueOf(j9));
                size = ((ArrayList) this.D).size();
                y3Var.b0();
                if (size < Math.max(1, ((Integer) b0.f14575k.a(null)).intValue())) {
                    return true;
                }
            } else {
                y3Var.b0();
                if (jK < Math.max(0, ((Integer) b0.f14572j.a(null)).intValue())) {
                    this.A = jK;
                    ((ArrayList) this.D).add(a3Var);
                    ((ArrayList) this.C).add(Long.valueOf(j9));
                    size = ((ArrayList) this.D).size();
                    y3Var.b0();
                    if (size < Math.max(1, ((Integer) b0.f14575k.a(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
