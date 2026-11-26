package j7;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.l0;
import androidx.media3.common.t;
import e7.i0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import s7.a0;

public final class i {
    public int A;
    public boolean B;

    public final Context f8224a;

    public final h f8226c;

    public final PlaybackSession f8227d;

    public String f8233j;

    public PlaybackMetrics.Builder f8234k;
    public int l;

    public PlaybackException f8236o;

    public c50.h f8237p;

    public c50.h f8238q;

    public c50.h f8239r;

    public t f8240s;

    public t f8241t;

    public t f8242u;

    public boolean f8243v;

    public int f8244w;

    public boolean f8245x;

    public int f8246y;

    public int f8247z;

    public final Executor f8225b = e7.a.f();

    public final j2 f8229f = new j2();

    public final h2 f8230g = new h2();

    public final HashMap f8232i = new HashMap();

    public final HashMap f8231h = new HashMap();

    public final long f8228e = SystemClock.elapsedRealtime();
    public int m = 0;

    public int f8235n = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f8224a = context.getApplicationContext();
        this.f8227d = playbackSession;
        h hVar = new h();
        this.f8226c = hVar;
        hVar.f8220d = this;
    }

    public final boolean a(c50.h hVar) {
        String str;
        if (hVar == null) {
            return false;
        }
        String str2 = (String) hVar.D;
        h hVar2 = this.f8226c;
        synchronized (hVar2) {
            str = hVar2.f8222f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f8234k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f8234k.setVideoFramesDropped(this.f8246y);
            this.f8234k.setVideoFramesPlayed(this.f8247z);
            Long l = (Long) this.f8231h.get(this.f8233j);
            this.f8234k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l10 = (Long) this.f8232i.get(this.f8233j);
            this.f8234k.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f8234k.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f8225b.execute(new ab.f(this, this.f8234k.build(), 28));
        }
        this.f8234k = null;
        this.f8233j = null;
        this.A = 0;
        this.f8246y = 0;
        this.f8247z = 0;
        this.f8240s = null;
        this.f8241t = null;
        this.f8242u = null;
        this.B = false;
    }

    public final void c(k2 k2Var, a0 a0Var) {
        int indexOfPeriod;
        int i10;
        PlaybackMetrics.Builder builder = this.f8234k;
        if (a0Var == null || (indexOfPeriod = k2Var.getIndexOfPeriod(a0Var.f13644a)) == -1) {
            return;
        }
        h2 h2Var = this.f8230g;
        k2Var.getPeriod(indexOfPeriod, h2Var);
        int i11 = h2Var.f1233c;
        j2 j2Var = this.f8229f;
        k2Var.getWindow(i11, j2Var);
        l0 l0Var = j2Var.f1285c.f1414b;
        if (l0Var == null) {
            i10 = 0;
        } else {
            int iB = i0.B(l0Var.f1328a, l0Var.f1329b);
            if (iB == 0) {
                i10 = 3;
            } else if (iB != 1) {
                i10 = iB != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        if (j2Var.m != -9223372036854775807L && !j2Var.f1293k && !j2Var.f1291i && !j2Var.a()) {
            builder.setMediaDurationMillis(i0.W(j2Var.m));
        }
        builder.setPlaybackType(j2Var.a() ? 2 : 1);
        this.B = true;
    }

    public final void d(a aVar, String str) {
        a0 a0Var = aVar.f8201d;
        if ((a0Var == null || !a0Var.b()) && str.equals(this.f8233j)) {
            b();
        }
        this.f8231h.remove(str);
        this.f8232i.remove(str);
    }

    public final void e(int i10, long j9, t tVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j9 - this.f8228e);
        if (tVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = tVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = tVar.f1594n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = tVar.f1593k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = tVar.f1592j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = tVar.f1601u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = tVar.f1602v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = tVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = tVar.G;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = tVar.f1586d;
            if (str4 != null) {
                String str5 = i0.f5136a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = tVar.f1605y;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.f8225b.execute(new ab.f(this, timeSinceCreatedMillis.build(), 25));
    }
}
