package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import com.google.android.gms.internal.measurement.y3;
import java.math.RoundingMode;
import java.util.Objects;

public final class u {

    public final Context f9147a;

    public final d0 f9148b;

    public final h7.b f9149c;

    public final hf.c f9150d;

    public e7.p f9151e;

    public e7.b0 f9152f;

    public b f9153g;

    public e f9154h;

    public Looper f9155i;

    public Context f9156j;

    public u(oj.q qVar) {
        Context context = (Context) qVar.B;
        this.f9147a = context;
        h7.b bVar = (h7.b) qVar.C;
        bVar.getClass();
        this.f9149c = bVar;
        this.f9148b = (d0) qVar.D;
        this.f9153g = (b) qVar.E;
        this.f9150d = context == null ? null : new hf.c(this, 12);
        this.f9152f = e7.b0.f5117a;
    }

    public final s a(k kVar) throws Exception {
        Context context;
        Context context2;
        try {
            int i10 = kVar.f9107h;
            int i11 = kVar.f9108i;
            if (i11 == -1 || (context2 = this.f9147a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f9156j;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f9156j = context2.createDeviceContext(i11);
                }
                context = this.f9156j;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(kVar.f9103d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : kVar.f9106g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(kVar.f9101b).setChannelMask(kVar.f9102c).setEncoding(kVar.f9100a).build()).setTransferMode(1).setBufferSizeInBytes(kVar.f9105f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            sessionId.setOffloadedPlayback(kVar.f9104e);
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new s(audioTrackBuild, kVar, this.f9150d, this.f9152f);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new Exception() {
            };
        } catch (IllegalArgumentException | UnsupportedOperationException e3) {
            throw new Exception(e3) {
            };
        }
    }

    public final i b(h hVar) {
        e(hVar);
        androidx.media3.common.t tVar = hVar.f9071a;
        androidx.media3.common.d dVar = hVar.f9072b;
        g gVarO = this.f9149c.o(tVar, dVar);
        ba.t tVar2 = new ba.t();
        String str = tVar.f1594n;
        int i10 = tVar.H;
        int i11 = 0;
        if (Objects.equals(str, "audio/raw")) {
            if (!e7.i0.D(i10)) {
                a1.b.y("Invalid PCM encoding: ", i10, "ATAudioOutputProvider");
            } else if (i10 != 2) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        } else if (this.f9153g.d(tVar, dVar) != null) {
            i11 = 2;
        }
        tVar2.f2418d = i11;
        tVar2.f2415a = gVarO.f9056a;
        tVar2.f2416b = gVarO.f9057b;
        tVar2.f2417c = gVarO.f9058c;
        return tVar2.a();
    }

    public final k c(h hVar) {
        int iIntValue;
        char c10;
        int iP;
        boolean z10;
        boolean z11;
        int i10;
        int iMax;
        int minBufferSize;
        boolean z12;
        double d3;
        int i11;
        boolean z13;
        int iH;
        int iK;
        boolean z14;
        int iK2;
        boolean z15;
        boolean z16;
        boolean z17;
        androidx.media3.common.t tVar = hVar.f9071a;
        boolean z18 = hVar.f9074d;
        androidx.media3.common.d dVar = hVar.f9072b;
        e(hVar);
        String str = tVar.f1594n;
        int i12 = tVar.G;
        int iIntValue2 = tVar.H;
        int i13 = tVar.F;
        if (!Objects.equals(str, "audio/raw")) {
            g gVarO = z18 ? this.f9149c.o(tVar, dVar) : g.f9055d;
            if (z18 && gVarO.f9056a) {
                str.getClass();
                int iC = x0.c(str, tVar.f1593k);
                int iN = e7.i0.n(i13);
                boolean z19 = gVarO.f9057b;
                iIntValue2 = iC;
                iIntValue = iN;
                z10 = z19;
                iP = -1;
                c10 = 1;
                z11 = true;
            } else {
                Pair pairD = this.f9153g.d(tVar, dVar);
                if (pairD == null) {
                    String str2 = "Unable to configure passthrough for: " + tVar;
                    str2.getClass();
                    throw new AudioOutputProvider$ConfigurationException(str2);
                }
                iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                c10 = 2;
                iP = -1;
                z10 = false;
            }
            i10 = tVar.f1592j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i10 == -1) {
                i10 = 768000;
            }
            iMax = hVar.f9078h;
            if (iMax != -1) {
                z13 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ta.c0.A(z12);
                if (iP == -1) {
                    iP = 1;
                }
                if (z11) {
                    d3 = 8.0d;
                } else {
                    d3 = 1.0d;
                }
                this.f9148b.getClass();
                i11 = 250000;
                if (c10 != 0) {
                    z13 = true;
                    long j9 = i12;
                    long j10 = iP;
                    iH = e7.i0.h(minBufferSize * 4, bi.b.s(((((long) 250000) * j9) * j10) / 1000000), bi.b.s(((((long) 750000) * j9) * j10) / 1000000));
                } else if (c10 != 1) {
                    z13 = true;
                    iK = a8.b.k(iIntValue2);
                    if (iK != -2147483647) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ta.c0.A(z14);
                    iH = bi.b.s((((long) 50000000) * ((long) iK)) / 1000000);
                } else {
                    if (c10 == 2) {
                        throw new IllegalArgumentException();
                    }
                    z13 = true;
                    if (iIntValue2 == 5) {
                        i11 = 500000;
                    } else if (iIntValue2 == 8) {
                        i11 = 1000000;
                    }
                    if (i10 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iK2 = y3.A(i10, 8);
                    } else {
                        iK2 = a8.b.k(iIntValue2);
                        if (iK2 != -2147483647) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        ta.c0.A(z15);
                    }
                    iH = bi.b.s((((long) i11) * ((long) iK2)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iH) * d3)) + iP) - 1) / iP) * iP;
            }
            j jVar = new j();
            androidx.media3.common.d dVar2 = androidx.media3.common.d.f1142i;
            jVar.f9097i = -1;
            jVar.f9090b = i12;
            jVar.f9091c = iIntValue;
            jVar.f9089a = iIntValue2;
            jVar.f9094f = iMax;
            jVar.f9096h = hVar.f9075e;
            jVar.f9095g = dVar;
            z16 = z13;
            if (c10 == z16) {
                z17 = z16;
            } else {
                z17 = false;
            }
            jVar.f9093e = z17;
            jVar.f9092d = hVar.f9077g;
            jVar.f9098j = z11;
            jVar.f9099k = z10;
            jVar.f9097i = hVar.f9076f;
            return new k(jVar);
        }
        ta.c0.s(e7.i0.D(iIntValue2));
        iIntValue = e7.i0.n(i13);
        iP = e7.i0.p(iIntValue2) * i13;
        z10 = false;
        c10 = 0;
        z11 = false;
        i10 = tVar.f1592j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i10 = 768000;
        }
        iMax = hVar.f9078h;
        if (iMax != -1) {
            z13 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z12 = true;
            } else {
                z12 = false;
            }
            ta.c0.A(z12);
            if (iP == -1) {
                iP = 1;
            }
            if (z11) {
                d3 = 8.0d;
            } else {
                d3 = 1.0d;
            }
            this.f9148b.getClass();
            i11 = 250000;
            if (c10 != 0) {
                z13 = true;
                long j11 = i12;
                long j12 = iP;
                iH = e7.i0.h(minBufferSize * 4, bi.b.s(((((long) 250000) * j11) * j12) / 1000000), bi.b.s(((((long) 750000) * j11) * j12) / 1000000));
            } else if (c10 != 1) {
                z13 = true;
                iK = a8.b.k(iIntValue2);
                if (iK != -2147483647) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ta.c0.A(z14);
                iH = bi.b.s((((long) 50000000) * ((long) iK)) / 1000000);
            } else {
                if (c10 == 2) {
                    throw new IllegalArgumentException();
                }
                z13 = true;
                if (iIntValue2 == 5) {
                    i11 = 500000;
                } else if (iIntValue2 == 8) {
                    i11 = 1000000;
                }
                if (i10 != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iK2 = y3.A(i10, 8);
                } else {
                    iK2 = a8.b.k(iIntValue2);
                    if (iK2 != -2147483647) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    ta.c0.A(z15);
                }
                iH = bi.b.s((((long) i11) * ((long) iK2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iH) * d3)) + iP) - 1) / iP) * iP;
        }
        j jVar2 = new j();
        androidx.media3.common.d dVar3 = androidx.media3.common.d.f1142i;
        jVar2.f9097i = -1;
        jVar2.f9090b = i12;
        jVar2.f9091c = iIntValue;
        jVar2.f9089a = iIntValue2;
        jVar2.f9094f = iMax;
        jVar2.f9096h = hVar.f9075e;
        jVar2.f9095g = dVar;
        z16 = z13;
        if (c10 == z16) {
            z17 = z16;
        } else {
            z17 = false;
        }
        jVar2.f9093e = z17;
        jVar2.f9092d = hVar.f9077g;
        jVar2.f9098j = z11;
        jVar2.f9099k = z10;
        jVar2.f9097i = hVar.f9076f;
        return new k(jVar2);
    }

    public final void d() {
        e7.p pVar = this.f9151e;
        if (pVar != null) {
            pVar.d();
        }
        e eVar = this.f9154h;
        if (eVar != null) {
            Context context = (Context) eVar.f9024b;
            if (eVar.f9023a) {
                eVar.f9030h = null;
                c7.i.C(context).unregisterAudioDeviceCallback((c) eVar.f9027e);
                context.unregisterReceiver((androidx.mediarouter.app.g) eVar.f9028f);
                d dVar = (d) eVar.f9029g;
                if (dVar != null) {
                    dVar.f9019a.unregisterContentObserver(dVar);
                }
                eVar.f9023a = false;
            }
        }
    }

    public final void e(h hVar) {
        Context context;
        b bVarB;
        AudioDeviceInfo audioDeviceInfo = hVar.f9073c;
        androidx.media3.common.d dVar = hVar.f9072b;
        f();
        e eVar = this.f9154h;
        if (eVar == null && (context = this.f9147a) != null) {
            e eVar2 = new e(context, new t(this, 0), dVar, audioDeviceInfo);
            this.f9154h = eVar2;
            Handler handler = (Handler) eVar2.f9026d;
            Context context2 = (Context) eVar2.f9024b;
            if (eVar2.f9023a) {
                bVarB = (b) eVar2.f9030h;
                bVarB.getClass();
            } else {
                eVar2.f9023a = true;
                d dVar2 = (d) eVar2.f9029g;
                if (dVar2 != null) {
                    dVar2.f9019a.registerContentObserver(dVar2.f9020b, false, dVar2);
                }
                c7.i.C(context2).registerAudioDeviceCallback((c) eVar2.f9027e, handler);
                bVarB = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) eVar2.f9028f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (androidx.media3.common.d) eVar2.f9032j, (AudioDeviceInfo) eVar2.f9031i);
                eVar2.f9030h = bVarB;
            }
            this.f9153g = bVarB;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) eVar.f9031i)) {
                eVar.f9031i = audioDeviceInfo;
                eVar.d(b.c((Context) eVar.f9024b, (androidx.media3.common.d) eVar.f9032j, audioDeviceInfo));
            }
            e eVar3 = this.f9154h;
            if (!Objects.equals(dVar, (androidx.media3.common.d) eVar3.f9032j)) {
                eVar3.f9032j = dVar;
                eVar3.d(b.c((Context) eVar3.f9024b, dVar, (AudioDeviceInfo) eVar3.f9031i));
            }
        }
        this.f9153g.getClass();
    }

    public final void f() {
        if (this.f9147a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f9155i;
        boolean z10 = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z10) {
            throw new IllegalStateException(ze.d.H("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f9155i = looperMyLooper;
    }
}
