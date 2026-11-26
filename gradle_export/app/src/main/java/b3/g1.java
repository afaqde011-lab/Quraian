package b3;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k9.y3;

public final class g1 {

    public final int f2027a;

    public int f2028b;

    public boolean f2029c;

    public Object f2030d;

    public Object f2031e;

    public Object f2032f;

    public Object f2033g;

    public g1() {
        this.f2027a = 1;
        this.f2030d = new Object();
        this.f2031e = new u.e(0);
    }

    public g1(a1.n nVar, b2.q qVar, int i10, m1.e eVar, m1.e eVar2, boolean z10) {
        this.f2027a = 0;
        this.f2033g = nVar;
        this.f2030d = qVar;
        this.f2028b = i10;
        this.f2031e = eVar;
        this.f2032f = eVar2;
        this.f2029c = z10;
    }

    public g1(MediaCodec mediaCodec, HandlerThread handlerThread, p7.j jVar, k9.x0 x0Var) {
        this.f2027a = 2;
        this.f2030d = mediaCodec;
        this.f2031e = new p7.e(handlerThread);
        this.f2032f = jVar;
        this.f2033g = x0Var;
        this.f2028b = 0;
    }

    public static void a(g1 g1Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        k9.x0 x0Var;
        LoudnessCodecController loudnessCodecController;
        p7.e eVar = (p7.e) g1Var.f2031e;
        MediaCodec mediaCodec = (MediaCodec) g1Var.f2030d;
        HandlerThread handlerThread = eVar.f12382b;
        ta.c0.A(eVar.f12383c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(eVar, handler);
        eVar.f12383c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        ((p7.j) g1Var.f2032f).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (x0Var = (k9.x0) g1Var.f2033g) != null && ((loudnessCodecController = (LoudnessCodecController) x0Var.D) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            ta.c0.A(((HashSet) x0Var.B).add(mediaCodec));
        }
        g1Var.f2028b = 1;
    }

    public static String d(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public boolean b(int i10, int i11) {
        m1.e eVar = (m1.e) this.f2031e;
        int i12 = this.f2028b;
        b2.p pVar = (b2.p) eVar.A[i10 + i12];
        b2.p pVar2 = (b2.p) ((m1.e) this.f2032f).A[i12 + i11];
        return kotlin.jvm.internal.m.a(pVar, pVar2) || pVar.getClass() == pVar2.getClass();
    }

    public y3 c(Object obj) {
        y3 y3Var;
        synchronized (this.f2030d) {
            try {
                int iF = f();
                y3Var = new y3(iF, obj);
                if (this.f2029c) {
                    y3Var.o();
                } else {
                    ((u.e) this.f2031e).put(Integer.valueOf(iF), y3Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y3Var;
    }

    public void e() {
        ((p7.j) this.f2032f).flush();
        ((MediaCodec) this.f2030d).flush();
        p7.e eVar = (p7.e) this.f2031e;
        synchronized (eVar.f12381a) {
            eVar.l++;
            Handler handler = eVar.f12383c;
            String str = e7.i0.f5136a;
            handler.post(new m9.f(eVar, 10));
        }
        ((MediaCodec) this.f2030d).start();
    }

    public int f() {
        int i10;
        synchronized (this.f2030d) {
            i10 = this.f2028b;
            this.f2028b = i10 + 1;
        }
        return i10;
    }

    public void g(int i10, int i11, int i12, long j9) {
        ((p7.j) this.f2032f).p(i10, i11, i12, j9);
    }

    public void h() {
        ArrayList arrayList;
        k9.x0 x0Var;
        k9.x0 x0Var2;
        switch (this.f2027a) {
            case 1:
                synchronized (this.f2030d) {
                    try {
                        this.f2029c = true;
                        arrayList = new ArrayList(((u.e) this.f2031e).values());
                        ((u.e) this.f2031e).clear();
                        if (((k9.z) this.f2032f) != null) {
                            Handler handler = (Handler) this.f2033g;
                            handler.getClass();
                            handler.post((k9.z) this.f2032f);
                            this.f2032f = null;
                            this.f2033g = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y3) it.next()).o();
                }
                return;
            default:
                try {
                    if (this.f2028b == 1) {
                        ((p7.j) this.f2032f).shutdown();
                        p7.e eVar = (p7.e) this.f2031e;
                        synchronized (eVar.f12381a) {
                            eVar.m = true;
                            eVar.f12382b.quit();
                            eVar.a();
                        }
                    }
                    this.f2028b = 2;
                    if (this.f2029c) {
                        return;
                    }
                    try {
                        return;
                    } finally {
                        if (Build.VERSION.SDK_INT >= 35 && (x0Var2 = (k9.x0) this.f2033g) != null) {
                            x0Var2.P((MediaCodec) this.f2030d);
                        }
                        ((MediaCodec) this.f2030d).release();
                        this.f2029c = true;
                    }
                } catch (Throwable th3) {
                    if (!this.f2029c) {
                        try {
                        } finally {
                            if (Build.VERSION.SDK_INT >= 35 && (x0Var = (k9.x0) this.f2033g) != null) {
                                x0Var.P((MediaCodec) this.f2030d);
                            }
                            ((MediaCodec) this.f2030d).release();
                            this.f2029c = true;
                        }
                    }
                    throw th3;
                }
                break;
        }
    }

    public void i(int i10) {
        ((MediaCodec) this.f2030d).releaseOutputBuffer(i10, false);
    }

    public void j(int i10, Object obj) {
        synchronized (this.f2030d) {
            try {
                y3 y3Var = (y3) ((u.e) this.f2031e).remove(Integer.valueOf(i10));
                if (y3Var != null) {
                    if (y3Var.I.getClass() == obj.getClass()) {
                        y3Var.l(obj);
                    } else {
                        e7.a.m("SequencedFutureManager", "Type mismatch, expected " + y3Var.I.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((k9.z) this.f2032f) != null && ((u.e) this.f2031e).isEmpty()) {
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(Bundle bundle) {
        ((p7.j) this.f2032f).j(bundle);
    }

    public void l(int i10) {
        ((MediaCodec) this.f2030d).setVideoScalingMode(i10);
    }

    public void m(ArrayList arrayList) {
        ((MediaCodec) this.f2030d).subscribeToVendorParameters(arrayList);
    }
}
