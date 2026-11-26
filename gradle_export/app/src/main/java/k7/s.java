package k7;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

public final class s {

    public static final Object f9131p = new Object();

    public static ScheduledExecutorService f9132q;

    public static int f9133r;

    public final AudioTrack f9134a;

    public final k f9135b;

    public final hf.c f9136c;

    public oj.q f9137d;

    public final v f9138e;

    public final boolean f9139f;

    public final int f9140g;

    public final a1.i f9141h;

    public final e7.p f9142i;

    public boolean f9143j;

    public long f9144k;
    public long l;
    public long m;

    public int f9145n;

    public int f9146o;

    public s(AudioTrack audioTrack, k kVar, hf.c cVar, e7.b0 b0Var) {
        this.f9134a = audioTrack;
        this.f9135b = kVar;
        this.f9136c = cVar;
        e7.p pVar = new e7.p(Thread.currentThread());
        this.f9142i = pVar;
        pVar.f5164i = false;
        boolean zD = e7.i0.D(kVar.f9100a);
        this.f9139f = zD;
        if (zD) {
            this.f9140g = e7.i0.p(kVar.f9100a) * Integer.bitCount(kVar.f9102c);
        } else {
            this.f9140g = -1;
        }
        this.f9138e = new v(new gi.c(this, 13), b0Var, audioTrack, kVar.f9100a, this.f9140g, kVar.f9105f);
        if (cVar != null) {
            this.f9137d = new oj.q(audioTrack, cVar);
        }
        this.f9141h = c() ? new a1.i(this) : null;
    }

    public final long a() {
        long j9;
        long j10;
        boolean z10;
        long jNanoTime;
        boolean z11;
        v vVar;
        long jB;
        int playState;
        long j11;
        long j12;
        long jU;
        long j13;
        int i10;
        long j14;
        AudioTimestamp audioTimestamp;
        int i11;
        o oVar;
        int i12;
        Method method;
        Method method2;
        v vVar2 = this.f9138e;
        e7.b0 b0Var = vVar2.f9158b;
        p pVar = vVar2.f9164h;
        AudioTrack audioTrack = vVar2.f9160d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = vVar2.f9159c;
            b0Var.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - vVar2.l >= NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
                j9 = 1000;
                long jO = e7.i0.O(vVar2.f9161e, vVar2.a());
                if (jO != 0) {
                    jArr[vVar2.f9173s] = e7.i0.x(vVar2.f9165i, jO) - jNanoTime2;
                    vVar2.f9173s = (vVar2.f9173s + 1) % 10;
                    int i13 = vVar2.f9174t;
                    if (i13 < 10) {
                        vVar2.f9174t = i13 + 1;
                    }
                    vVar2.l = jNanoTime2;
                    vVar2.f9167k = 0L;
                    int i14 = 0;
                    while (true) {
                        int i15 = vVar2.f9174t;
                        if (i14 >= i15) {
                            break;
                        }
                        int i16 = i14;
                        vVar2.f9167k = (jArr[i16] / ((long) i15)) + vVar2.f9167k;
                        i14 = i16 + 1;
                    }
                }
            } else {
                j9 = 1000;
            }
            if (!vVar2.f9163g || (method = vVar2.m) == null || jNanoTime2 - vVar2.f9169o < 500000) {
                j14 = 5000000;
            } else {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = e7.i0.f5136a;
                    j14 = 5000000;
                    try {
                        long jIntValue = (((long) num.intValue()) * j9) - vVar2.f9162f;
                        vVar2.f9168n = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        vVar2.f9168n = jMax;
                        if (jMax > 5000000) {
                            e7.a.m("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            vVar2.f9168n = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        vVar2.m = method2;
                    }
                } catch (Exception unused2) {
                    j14 = 5000000;
                    method2 = null;
                }
                vVar2.f9169o = jNanoTime2;
            }
            float f3 = vVar2.f9165i;
            long jB2 = vVar2.b(jNanoTime2);
            o oVar2 = pVar.f9120a;
            o oVar3 = pVar.f9120a;
            int i17 = pVar.f9121b;
            j10 = 0;
            if (jNanoTime2 - pVar.f9126g >= pVar.f9125f) {
                pVar.f9126g = jNanoTime2;
                AudioTrack audioTrack2 = oVar2.f9113a;
                AudioTimestamp audioTimestamp2 = oVar2.f9114b;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j15 = audioTimestamp2.framePosition;
                    audioTrack = audioTrack;
                    long j16 = oVar2.f9116d;
                    if (j16 > j15) {
                        b0Var = b0Var;
                        if (oVar2.f9118f) {
                            oVar2.f9119g += j16;
                            oVar2.f9118f = false;
                        } else {
                            oVar2.f9115c++;
                        }
                    } else {
                        b0Var = b0Var;
                    }
                    oVar2.f9116d = j15;
                    oVar2.f9117e = j15 + oVar2.f9119g + (oVar2.f9115c << 32);
                } else {
                    b0Var = b0Var;
                    audioTrack = audioTrack;
                }
                if (timestamp != 0) {
                    gi.c cVar = pVar.f9122c;
                    long j17 = audioTimestamp2.nanoTime / j9;
                    long jU2 = e7.i0.u(f3, jNanoTime2 - (oVar3.f9114b.nanoTime / j9)) + e7.i0.O(i17, oVar3.f9117e);
                    if (Math.abs(j17 - jNanoTime2) > j14) {
                        long j18 = oVar2.f9117e;
                        cVar.getClass();
                        i11 = i17;
                        e7.a.m("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j18 + ", " + j17 + ", " + jNanoTime2 + ", " + jB2 + ", " + ((s) cVar.B).b());
                        pVar = pVar;
                        i12 = 4;
                        pVar.a(4);
                        vVar2 = vVar2;
                        audioTimestamp = audioTimestamp2;
                        oVar = oVar3;
                    } else {
                        i11 = i17;
                        pVar = pVar;
                        if (Math.abs(jU2 - jB2) > j14) {
                            audioTimestamp = audioTimestamp2;
                            long j19 = oVar2.f9117e;
                            cVar.getClass();
                            vVar2 = vVar2;
                            oVar = oVar3;
                            e7.a.m("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j19 + ", " + j17 + ", " + jNanoTime2 + ", " + jB2 + ", " + ((s) cVar.B).b());
                            i12 = 4;
                            pVar.a(4);
                        } else {
                            vVar2 = vVar2;
                            audioTimestamp = audioTimestamp2;
                            oVar = oVar3;
                            i12 = 4;
                            if (pVar.f9123d == 4) {
                                pVar.a(0);
                            }
                        }
                    }
                } else {
                    vVar2 = vVar2;
                    pVar = pVar;
                    audioTimestamp = audioTimestamp2;
                    i11 = i17;
                    oVar = oVar3;
                    i12 = 4;
                }
                int i18 = pVar.f9123d;
                if (i18 == 0) {
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    z10 = false;
                    if (timestamp != 0) {
                        long j20 = audioTimestamp3.nanoTime;
                        if (j20 / j9 >= pVar.f9124e) {
                            pVar.f9127h = oVar2.f9117e;
                            pVar.f9128i = j20 / j9;
                            pVar.a(1);
                        }
                    } else if (jNanoTime2 - pVar.f9124e > 500000) {
                        pVar.a(3);
                    }
                } else if (i18 == 1) {
                    int i19 = i11;
                    if (timestamp != 0) {
                        long j21 = oVar2.f9117e;
                        long j22 = pVar.f9127h;
                        if (j21 > j22) {
                            o oVar4 = oVar;
                            if (Math.abs((e7.i0.u(f3, jNanoTime2 - (oVar4.f9114b.nanoTime / j9)) + e7.i0.O(i19, oVar4.f9117e)) - (e7.i0.u(f3, jNanoTime2 - pVar.f9128i) + e7.i0.O(i19, j22))) < j9) {
                                pVar.a(2);
                            } else if (jNanoTime2 - pVar.f9124e > 2000000) {
                                pVar.a(3);
                            } else {
                                pVar.f9127h = oVar2.f9117e;
                                pVar.f9128i = audioTimestamp.nanoTime / j9;
                            }
                        } else if (jNanoTime2 - pVar.f9124e > 2000000) {
                            pVar.a(3);
                        } else {
                            pVar.f9127h = oVar2.f9117e;
                            pVar.f9128i = audioTimestamp.nanoTime / j9;
                        }
                    } else {
                        z10 = false;
                        pVar.a(0);
                    }
                } else if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 != i12) {
                            throw new IllegalStateException();
                        }
                    } else if (timestamp) {
                        z10 = false;
                        pVar.a(0);
                    }
                } else if (timestamp == 0) {
                    pVar.a(0);
                }
                b0Var.getClass();
                jNanoTime = System.nanoTime() / j9;
                if (pVar.f9123d == 2) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    vVar = vVar2;
                    float f10 = vVar.f9165i;
                    o oVar5 = pVar.f9120a;
                    jB = e7.i0.u(f10, jNanoTime - (oVar5.f9114b.nanoTime / j9)) + e7.i0.O(pVar.f9121b, oVar5.f9117e);
                } else {
                    vVar = vVar2;
                    jB = vVar.b(jNanoTime);
                }
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (z11 || ((i10 = pVar.f9123d) != 0 && i10 != 1)) {
                        vVar.d(jB);
                    }
                    j11 = vVar.f9180z;
                    if (j11 != -9223372036854775807L) {
                        j12 = jB - vVar.f9179y;
                        jU = e7.i0.u(vVar.f9165i, jNanoTime - j11);
                        j13 = vVar.f9179y + jU;
                        long jAbs = Math.abs(j13 - jB);
                        if (j12 != j10 && jAbs < 1000000) {
                            long j23 = (jU * 10) / 100;
                            jB = e7.i0.i(jB, j13 - j23, j13 + j23);
                        }
                    }
                    vVar.f9180z = jNanoTime;
                    vVar.f9179y = jB;
                } else if (playState == 1) {
                    vVar.d(jB);
                }
                return jB;
            }
            vVar2 = vVar2;
            b0Var = b0Var;
            pVar = pVar;
            audioTrack = audioTrack;
            z10 = false;
            b0Var.getClass();
            jNanoTime = System.nanoTime() / j9;
            if (pVar.f9123d == 2) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (z11) {
                vVar = vVar2;
                float f11 = vVar.f9165i;
                o oVar6 = pVar.f9120a;
                jB = e7.i0.u(f11, jNanoTime - (oVar6.f9114b.nanoTime / j9)) + e7.i0.O(pVar.f9121b, oVar6.f9117e);
            } else {
                vVar = vVar2;
                jB = vVar.b(jNanoTime);
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z11) {
                    vVar.d(jB);
                } else {
                    vVar.d(jB);
                }
                j11 = vVar.f9180z;
                if (j11 != -9223372036854775807L) {
                    j12 = jB - vVar.f9179y;
                    jU = e7.i0.u(vVar.f9165i, jNanoTime - j11);
                    j13 = vVar.f9179y + jU;
                    long jAbs2 = Math.abs(j13 - jB);
                    if (j12 != j10) {
                        long j24 = (jU * 10) / 100;
                        jB = e7.i0.i(jB, j13 - j24, j13 + j24);
                    }
                }
                vVar.f9180z = jNanoTime;
                vVar.f9179y = jB;
            } else if (playState == 1) {
                vVar.d(jB);
            }
            return jB;
        }
        j9 = 1000;
        j10 = 0;
        z10 = false;
        b0Var.getClass();
        jNanoTime = System.nanoTime() / j9;
        if (pVar.f9123d == 2) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if (z11) {
            vVar = vVar2;
            float f12 = vVar.f9165i;
            o oVar7 = pVar.f9120a;
            jB = e7.i0.u(f12, jNanoTime - (oVar7.f9114b.nanoTime / j9)) + e7.i0.O(pVar.f9121b, oVar7.f9117e);
        } else {
            vVar = vVar2;
            jB = vVar.b(jNanoTime);
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z11) {
                vVar.d(jB);
            } else {
                vVar.d(jB);
            }
            j11 = vVar.f9180z;
            if (j11 != -9223372036854775807L) {
                j12 = jB - vVar.f9179y;
                jU = e7.i0.u(vVar.f9165i, jNanoTime - j11);
                j13 = vVar.f9179y + jU;
                long jAbs3 = Math.abs(j13 - jB);
                if (j12 != j10) {
                    long j25 = (jU * 10) / 100;
                    jB = e7.i0.i(jB, j13 - j25, j13 + j25);
                }
            }
            vVar.f9180z = jNanoTime;
            vVar.f9179y = jB;
        } else if (playState == 1) {
            vVar.d(jB);
        }
        return jB;
    }

    public final long b() {
        if (!this.f9139f) {
            return this.l;
        }
        long j9 = this.f9144k;
        long j10 = this.f9140g;
        String str = e7.i0.f5136a;
        return ((j9 + j10) - 1) / j10;
    }

    public final boolean c() {
        return this.f9134a.isOffloadedPlayback();
    }

    public final boolean d(int i10, long j9, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z10;
        hf.c cVar;
        u uVar;
        e eVar;
        k kVar = this.f9135b;
        boolean z11 = this.f9139f;
        if (!z11 && this.f9145n == 0) {
            this.f9145n = c0.h(kVar.f9100a, byteBuffer);
        }
        b();
        AudioTrack audioTrack = this.f9134a;
        int underrunCount = audioTrack.getUnderrunCount();
        boolean z12 = underrunCount > this.f9146o;
        this.f9146o = underrunCount;
        if (z12) {
            this.f9142i.f(-1, new j7.e(6));
        }
        int iRemaining = byteBuffer.remaining();
        if (kVar.f9103d) {
            if (j9 == Long.MIN_VALUE) {
                j9 = this.m;
            } else {
                this.m = j9;
            }
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j9 * 1000);
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z10 = iWrite == iRemaining;
            if (z11) {
                this.f9144k += (long) iWrite;
                return z10;
            }
            if (z10) {
                this.l = (((long) this.f9145n) * ((long) i10)) + this.l;
            }
            return z10;
        }
        z10 = iWrite == -6 || iWrite == -32;
        if (z10 && (cVar = this.f9136c) != null && (eVar = (uVar = (u) cVar.B).f9154h) != null) {
            b bVar = b.f8983c;
            uVar.f9153g = bVar;
            eVar.d(bVar);
        }
        throw new AudioOutput$WriteException(iWrite, z10);
    }
}
