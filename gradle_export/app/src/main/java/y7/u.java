package y7;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import e7.i0;

public final class u {

    public final h f16725a;

    public final x f16726b;

    public final long f16727c;

    public boolean f16728d;

    public long f16731g;

    public boolean f16734j;
    public boolean m;

    public boolean f16736n;

    public int f16729e = 0;

    public long f16730f = -9223372036854775807L;

    public long f16732h = -9223372036854775807L;

    public long f16733i = -9223372036854775807L;

    public float f16735k = 1.0f;
    public e7.b0 l = e7.b0.f5117a;

    public u(Context context, h hVar, long j9) {
        this.f16725a = hVar;
        this.f16727c = j9;
        this.f16726b = new x(context);
    }

    public final int a(long j9, long j10, long j11, long j12, boolean z10, boolean z11, l50.d dVar) {
        long j13;
        long j14;
        long j15;
        int i10;
        int i11;
        boolean z12;
        x xVar;
        long j16;
        int i12;
        long j17;
        w wVar;
        long j18;
        boolean z13;
        long j19;
        int i13;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long jAbs;
        long j26;
        long j27;
        long j28;
        long j29;
        float f3;
        float f10;
        long j30;
        b1.q qVar;
        long j31;
        d dVar2;
        long j32;
        dVar.a = -9223372036854775807L;
        dVar.b = -9223372036854775807L;
        if (this.f16728d && this.f16730f == -9223372036854775807L) {
            this.f16730f = j10;
        }
        if (this.f16732h != j9) {
            x xVar2 = this.f16726b;
            j13 = -9223372036854775807L;
            long j33 = xVar2.f16757n;
            if (j33 != -1) {
                xVar2.f16760q = j33;
                xVar2.f16761r = xVar2.f16758o;
                xVar2.f16762s = xVar2.f16759p;
                xVar2.f16756k = xVar2.l;
            }
            xVar2.m++;
            b1.q qVar2 = xVar2.f16746a;
            j14 = 1000;
            long j34 = j9 * 1000;
            ((d) qVar2.D).b(j34);
            if (((d) qVar2.D).a()) {
                qVar2.A = false;
                j15 = 0;
            } else {
                j15 = 0;
                if (qVar2.B != -9223372036854775807L) {
                    if (qVar2.A) {
                        d dVar3 = (d) qVar2.E;
                        long j35 = dVar3.f16656d;
                        if (j35 == 0 ? false : dVar3.f16659g[(int) ((j35 - 1) % 15)]) {
                            ((d) qVar2.E).c();
                            ((d) qVar2.E).b(qVar2.B);
                        }
                    } else {
                        ((d) qVar2.E).c();
                        ((d) qVar2.E).b(qVar2.B);
                    }
                    qVar2.A = true;
                    ((d) qVar2.E).b(j34);
                }
            }
            if (qVar2.A && ((d) qVar2.E).a()) {
                d dVar4 = (d) qVar2.D;
                qVar2.D = (d) qVar2.E;
                qVar2.E = dVar4;
                qVar2.A = false;
            }
            qVar2.B = j34;
            qVar2.C = ((d) qVar2.D).a() ? 0 : qVar2.C + 1;
            xVar2.c();
            this.f16732h = j9;
        } else {
            j13 = -9223372036854775807L;
            j14 = 1000;
            j15 = 0;
        }
        long jH = (long) ((j9 - j10) / ((double) this.f16735k));
        if (this.f16728d) {
            this.l.getClass();
            jH -= i0.H(SystemClock.elapsedRealtime()) - j11;
        }
        dVar.a = jH;
        if (!z10 || z11) {
            if (this.m) {
                int i14 = 2;
                if (this.f16733i == j13 || this.f16734j) {
                    int i15 = this.f16729e;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            i10 = 3;
                            i11 = 5;
                        } else if (i15 == 2) {
                            i10 = 3;
                            i11 = 5;
                            if (j10 >= j12) {
                            }
                        } else {
                            if (i15 != 3) {
                                throw new IllegalStateException();
                            }
                            this.l.getClass();
                            i10 = 3;
                            i11 = 5;
                            long jH2 = i0.H(SystemClock.elapsedRealtime()) - this.f16731g;
                            if (this.f16728d) {
                                long j36 = this.f16730f;
                                if (j36 == j13 || j36 == j10 || jH >= -30000 || jH2 <= 100000) {
                                }
                            }
                        }
                        z12 = true;
                    } else {
                        i10 = 3;
                        i11 = 5;
                        z12 = this.f16728d;
                    }
                    if (z12) {
                        return 0;
                    }
                    if (this.f16728d && j10 != this.f16730f) {
                        this.l.getClass();
                        long jNanoTime = System.nanoTime();
                        xVar = this.f16726b;
                        j16 = (dVar.a * j14) + jNanoTime;
                        if (xVar.f16760q != -1) {
                            if (((d) xVar.f16746a.D).a()) {
                                qVar = xVar.f16746a;
                                if (((d) qVar.D).a()) {
                                    dVar2 = (d) qVar.D;
                                    j17 = -30000;
                                    j32 = dVar2.f16657e;
                                    i12 = 1;
                                    if (j32 == j15) {
                                        j31 = j15;
                                    } else {
                                        j31 = dVar2.f16658f / j32;
                                    }
                                } else {
                                    i12 = 1;
                                    j17 = -30000;
                                    j31 = j13;
                                }
                                f3 = (xVar.m - xVar.f16760q) * j31;
                                f10 = xVar.f16754i;
                            } else {
                                i12 = 1;
                                j17 = -30000;
                                f3 = (j9 - xVar.f16762s) * j14;
                                f10 = xVar.f16754i;
                            }
                            j30 = xVar.f16761r + ((long) (f3 / f10));
                            if (Math.abs(j16 - j30) <= 20000000) {
                                j16 = j30;
                            } else {
                                xVar.b();
                            }
                        } else {
                            i12 = 1;
                            j17 = -30000;
                            i14 = 2;
                        }
                        xVar.f16757n = xVar.m;
                        xVar.f16758o = j16;
                        xVar.f16759p = j9;
                        wVar = xVar.f16748c;
                        if (wVar != null) {
                            j20 = wVar.f16743c;
                            j21 = xVar.f16748c.f16744d;
                            if (j20 != j13 && j21 != j13) {
                                j22 = (((j16 - j20) / j21) * j21) + j20;
                                if (j16 <= j22) {
                                    j23 = j22 - j21;
                                } else {
                                    j22 += j21;
                                    j23 = j22;
                                }
                                j24 = j22 - j16;
                                j25 = j16 - j23;
                                jAbs = Math.abs(j24 - j25);
                                if (jAbs < j21 / 2) {
                                    j27 = j21;
                                    j28 = j27 / 4;
                                    if (jAbs < j28) {
                                        j26 = j23;
                                        j29 = xVar.f16756k;
                                        if (j29 != j15) {
                                            xVar.l = j29;
                                        } else {
                                            if (j24 < j25) {
                                                j28 = -j28;
                                            }
                                            xVar.l = j28;
                                        }
                                    } else {
                                        j26 = j23;
                                        xVar.l = j15;
                                    }
                                } else {
                                    j26 = j23;
                                    j27 = j21;
                                    xVar.l = xVar.f16756k;
                                }
                                if (j24 + xVar.l >= j25) {
                                    j22 = j26;
                                }
                                j16 = j22 - ((j27 * 80) / 100);
                            }
                        }
                        dVar.b = j16;
                        j18 = (j16 - jNanoTime) / j14;
                        dVar.a = j18;
                        if (this.f16733i != j13 || this.f16734j) {
                            z13 = 0;
                        } else {
                            z13 = i12;
                        }
                        if (this.f16725a.N0(j18, j10, z11, z13)) {
                            return 4;
                        }
                        j19 = dVar.a;
                        if (j19 < j17 || z11) {
                            i13 = 0;
                        } else {
                            i13 = i12;
                        }
                        if (i13 != 0) {
                            if (z13 != 0) {
                                return i10;
                            }
                            return i14;
                        }
                        if (j19 > 50000) {
                            return i12;
                        }
                    }
                    return i11;
                }
                i10 = 3;
                i11 = 5;
                z12 = false;
                if (z12) {
                    return 0;
                }
                if (this.f16728d) {
                    this.l.getClass();
                    long jNanoTime2 = System.nanoTime();
                    xVar = this.f16726b;
                    j16 = (dVar.a * j14) + jNanoTime2;
                    if (xVar.f16760q != -1) {
                        if (((d) xVar.f16746a.D).a()) {
                            qVar = xVar.f16746a;
                            if (((d) qVar.D).a()) {
                                dVar2 = (d) qVar.D;
                                j17 = -30000;
                                j32 = dVar2.f16657e;
                                i12 = 1;
                                if (j32 == j15) {
                                    j31 = j15;
                                } else {
                                    j31 = dVar2.f16658f / j32;
                                }
                            } else {
                                i12 = 1;
                                j17 = -30000;
                                j31 = j13;
                            }
                            f3 = (xVar.m - xVar.f16760q) * j31;
                            f10 = xVar.f16754i;
                        } else {
                            i12 = 1;
                            j17 = -30000;
                            f3 = (j9 - xVar.f16762s) * j14;
                            f10 = xVar.f16754i;
                        }
                        j30 = xVar.f16761r + ((long) (f3 / f10));
                        if (Math.abs(j16 - j30) <= 20000000) {
                            j16 = j30;
                        } else {
                            xVar.b();
                        }
                    } else {
                        i12 = 1;
                        j17 = -30000;
                        i14 = 2;
                    }
                    xVar.f16757n = xVar.m;
                    xVar.f16758o = j16;
                    xVar.f16759p = j9;
                    wVar = xVar.f16748c;
                    if (wVar != null) {
                        j20 = wVar.f16743c;
                        j21 = xVar.f16748c.f16744d;
                        if (j20 != j13) {
                            j22 = (((j16 - j20) / j21) * j21) + j20;
                            if (j16 <= j22) {
                                j23 = j22 - j21;
                            } else {
                                j22 += j21;
                                j23 = j22;
                            }
                            j24 = j22 - j16;
                            j25 = j16 - j23;
                            jAbs = Math.abs(j24 - j25);
                            if (jAbs < j21 / 2) {
                                j27 = j21;
                                j28 = j27 / 4;
                                if (jAbs < j28) {
                                    j26 = j23;
                                    j29 = xVar.f16756k;
                                    if (j29 != j15) {
                                        xVar.l = j29;
                                    } else {
                                        if (j24 < j25) {
                                            j28 = -j28;
                                        }
                                        xVar.l = j28;
                                    }
                                } else {
                                    j26 = j23;
                                    xVar.l = j15;
                                }
                            } else {
                                j26 = j23;
                                j27 = j21;
                                xVar.l = xVar.f16756k;
                            }
                            if (j24 + xVar.l >= j25) {
                                j22 = j26;
                            }
                            j16 = j22 - ((j27 * 80) / 100);
                        }
                    }
                    dVar.b = j16;
                    j18 = (j16 - jNanoTime2) / j14;
                    dVar.a = j18;
                    if (this.f16733i != j13) {
                        z13 = 0;
                    } else {
                        z13 = 0;
                    }
                    if (this.f16725a.N0(j18, j10, z11, z13)) {
                        return 4;
                    }
                    j19 = dVar.a;
                    if (j19 < j17) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        if (z13 != 0) {
                            return i10;
                        }
                        return i14;
                    }
                    if (j19 > 50000) {
                        return i12;
                    }
                }
                return i11;
            }
            if (this.f16725a.N0(jH, j10, z11, true)) {
                return 4;
            }
            if (!this.f16728d || dVar.a >= NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
                this.f16736n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f16729e == 3 || (!this.m && this.f16736n))) {
            this.f16733i = -9223372036854775807L;
            return true;
        }
        if (this.f16733i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.f16733i) {
            return true;
        }
        this.f16733i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z10) {
        long jElapsedRealtime;
        this.f16734j = z10;
        long j9 = this.f16727c;
        if (j9 > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j9;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f16733i = jElapsedRealtime;
    }

    public final void d() {
        w wVar;
        this.f16728d = true;
        this.l.getClass();
        this.f16731g = i0.H(SystemClock.elapsedRealtime());
        x xVar = this.f16726b;
        xVar.f16749d = true;
        xVar.b();
        DisplayManager displayManager = (DisplayManager) xVar.f16747b.getSystemService("display");
        if (displayManager == null) {
            wVar = null;
        } else {
            try {
                wVar = new w(Choreographer.getInstance(), displayManager);
            } catch (RuntimeException e3) {
                e7.a.n("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
                wVar = null;
            }
        }
        xVar.f16748c = wVar;
        if (wVar != null) {
            wVar.f16742b.registerDisplayListener(wVar, i0.l(null));
            wVar.f16741a.postVsyncCallback(wVar);
        }
        xVar.d(false);
    }

    public final void e(int i10) {
        if (i10 == 0) {
            this.f16729e = 1;
        } else if (i10 == 1) {
            this.f16729e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            this.f16729e = Math.min(this.f16729e, 2);
        }
        this.f16726b.b();
    }

    public final void f(float f3) {
        x xVar = this.f16726b;
        xVar.f16751f = f3;
        b1.q qVar = xVar.f16746a;
        ((d) qVar.D).c();
        ((d) qVar.E).c();
        qVar.A = false;
        qVar.B = -9223372036854775807L;
        qVar.C = 0;
        xVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.f16736n = false;
        x xVar = this.f16726b;
        if (xVar.f16750e != surface) {
            xVar.a();
            xVar.f16750e = surface;
            xVar.d(true);
        }
        this.f16729e = Math.min(this.f16729e, 1);
    }

    public final void h(float f3) {
        ta.c0.s(f3 > 0.0f);
        if (f3 == this.f16735k) {
            return;
        }
        this.f16735k = f3;
        x xVar = this.f16726b;
        xVar.f16754i = f3;
        xVar.d(false);
    }
}
