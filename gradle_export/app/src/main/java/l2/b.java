package l2;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import c7.i;
import i2.b0;
import i2.e;
import i2.g;
import i2.i0;
import i2.k0;
import i2.l0;
import i2.p0;
import java.util.Locale;
import k2.d;
import kh.n;
import u.j0;
import u.r0;
import u00.k;
import y3.l;
import y3.m;

public final class b {

    public final c f9973a;

    public Outline f9978f;

    public float f9982j;

    public l0 f9983k;
    public g l;
    public g m;

    public boolean f9984n;

    public k2.b f9985o;

    public e f9986p;

    public int f9987q;

    public boolean f9989s;

    public long f9990t;

    public long f9991u;

    public long f9992v;

    public boolean f9993w;

    public RectF f9994x;

    public y3.c f9974b = k2.c.f8920a;

    public m f9975c = m.A;

    public k f9976d = a.A;

    public final b3.a f9977e = new b3.a(this, 22);

    public boolean f9979g = true;

    public long f9980h = 0;

    public long f9981i = 9205357640488583168L;

    public final b50.e f9988r = new b50.e();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public b(c cVar) {
        this.f9973a = cVar;
        cVar.c(false);
        this.f9990t = 0L;
        this.f9991u = 0L;
        this.f9992v = 9205357640488583168L;
    }

    public final void a() {
        c cVar = this.f9973a;
        RenderNode renderNode = cVar.f9997c;
        if (this.f9979g) {
            boolean z10 = this.f9993w;
            if (z10 || cVar.f10007o > 0.0f) {
                g gVar = this.l;
                if (gVar != null) {
                    RectF rectF = this.f9994x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f9994x = rectF;
                    }
                    boolean z11 = gVar instanceof g;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    gVar.f7128a.computeBounds(rectF, false);
                    Outline outline = this.f9978f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f9978f = outline;
                    }
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    outline.setPath(gVar.f7128a);
                    this.f9984n = !outline.canClip();
                    this.l = gVar;
                    outline.setAlpha(cVar.f10002h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    cVar.f10001g = true;
                    cVar.a();
                    if (this.f9984n && this.f9993w) {
                        cVar.c(false);
                        renderNode.discardDisplayList();
                    } else {
                        cVar.c(this.f9993w);
                    }
                } else {
                    cVar.c(z10);
                    Outline outline2 = this.f9978f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f9978f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jM0 = n.m0(this.f9991u);
                    long j9 = this.f9980h;
                    long j10 = this.f9981i;
                    long j11 = j10 == 9205357640488583168L ? jM0 : j10;
                    int i10 = (int) (j9 >> 32);
                    int i11 = (int) (j9 & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11)), this.f9982j);
                    outline3.setAlpha(cVar.f10002h);
                    n.Y(j11);
                    renderNode.setOutline(outline3);
                    cVar.f10001g = true;
                    cVar.a();
                }
            } else {
                cVar.c(false);
                renderNode.setOutline(null);
                cVar.f10001g = false;
                cVar.a();
            }
        }
        this.f9979g = false;
    }

    public final void b() {
        if (this.f9989s && this.f9987q == 0) {
            b50.e eVar = this.f9988r;
            b bVar = (b) eVar.b;
            if (bVar != null) {
                bVar.f9987q--;
                bVar.b();
                eVar.b = null;
            }
            j0 j0Var = (j0) eVar.d;
            if (j0Var != null) {
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j9 = jArr[i10];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j9) < 128) {
                                    b bVar2 = (b) objArr[(i10 << 3) + i12];
                                    bVar2.f9987q--;
                                    bVar2.b();
                                }
                                j9 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                j0Var.b();
            }
            this.f9973a.f9997c.discardDisplayList();
        }
    }

    public final void c(d dVar) {
        b50.e eVar = this.f9988r;
        eVar.c = (b) eVar.b;
        j0 j0Var = (j0) eVar.d;
        if (j0Var != null && j0Var.h()) {
            j0 j0Var2 = (j0) eVar.e;
            if (j0Var2 == null) {
                j0 j0Var3 = r0.f14890a;
                j0Var2 = new j0();
                eVar.e = j0Var2;
            }
            j0Var2.k(j0Var);
            j0Var.b();
        }
        eVar.a = true;
        this.f9976d.invoke(dVar);
        eVar.a = false;
        b bVar = (b) eVar.c;
        if (bVar != null) {
            bVar.f9987q--;
            bVar.b();
        }
        j0 j0Var4 = (j0) eVar.e;
        if (j0Var4 == null || !j0Var4.h()) {
            return;
        }
        Object[] objArr = j0Var4.f14865b;
        long[] jArr = j0Var4.f14864a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            b bVar2 = (b) objArr[(i10 << 3) + i12];
                            bVar2.f9987q--;
                            bVar2.b();
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        j0Var4.b();
    }

    public final l0 d() {
        l0 j0Var;
        l0 l0Var = this.f9983k;
        g gVar = this.l;
        if (l0Var != null) {
            return l0Var;
        }
        if (gVar != null) {
            i0 i0Var = new i0(gVar);
            this.f9983k = i0Var;
            return i0Var;
        }
        long jM0 = n.m0(this.f9991u);
        long j9 = this.f9980h;
        long j10 = this.f9981i;
        if (j10 != 9205357640488583168L) {
            jM0 = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM0 & 4294967295L)) + fIntBitsToFloat2;
        float f3 = this.f9982j;
        if (f3 > 0.0f) {
            j0Var = new k0(i.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3)))));
        } else {
            j0Var = new i2.j0(new h2.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f9983k = j0Var;
        return j0Var;
    }

    public final void e(y3.c cVar, m mVar, long j9, k kVar) {
        boolean zB = l.b(this.f9991u, j9);
        c cVar2 = this.f9973a;
        if (!zB) {
            this.f9991u = j9;
            long j10 = this.f9990t;
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            cVar2.f9997c.setPosition(i10, i11, ((int) (j9 >> 32)) + i10, ((int) (4294967295L & j9)) + i11);
            cVar2.f9998d = n.m0(j9);
            if (this.f9981i == 9205357640488583168L) {
                this.f9979g = true;
                a();
            }
        }
        this.f9974b = cVar;
        this.f9975c = mVar;
        this.f9976d = kVar;
        b3.a aVar = this.f9977e;
        k2.b bVar = cVar2.f9996b;
        RenderNode renderNode = cVar2.f9997c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        try {
            hf.c cVar3 = cVar2.f9995a;
            i2.a aVar2 = (i2.a) cVar3.B;
            Canvas canvas = aVar2.f7106a;
            aVar2.f7106a = recordingCanvasBeginRecording;
            a1.i iVar = bVar.B;
            iVar.z(cVar);
            iVar.B(mVar);
            iVar.C = this;
            iVar.C(cVar2.f9998d);
            iVar.y(aVar2);
            aVar.invoke(bVar);
            ((i2.a) cVar3.B).f7106a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void f(float f3) {
        c cVar = this.f9973a;
        if (cVar.f10002h == f3) {
            return;
        }
        cVar.f10002h = f3;
        cVar.f9997c.setAlpha(f3);
    }

    public final void g(int i10) {
        c cVar = this.f9973a;
        if (cVar.f10003i == i10) {
            return;
        }
        cVar.f10003i = i10;
        Paint paint = cVar.f9999e;
        if (paint == null) {
            paint = new Paint();
            cVar.f9999e = paint;
        }
        paint.setBlendMode(b0.y(i10));
        cVar.d();
    }

    public final void h(boolean z10) {
        if (this.f9993w != z10) {
            this.f9993w = z10;
            this.f9979g = true;
            a();
        }
    }

    public final void i(int i10) {
        c cVar = this.f9973a;
        if (cVar.f10016x == i10) {
            return;
        }
        cVar.f10016x = i10;
        cVar.d();
    }

    public final void j(p0 p0Var) {
        RenderEffect renderEffectA;
        c cVar = this.f9973a;
        if (kotlin.jvm.internal.m.a(cVar.f10015w, p0Var)) {
            return;
        }
        cVar.f10015w = p0Var;
        RenderNode renderNode = cVar.f9997c;
        if (p0Var != null) {
            renderEffectA = p0Var.f7154a;
            if (renderEffectA == null) {
                renderEffectA = p0Var.a();
                p0Var.f7154a = renderEffectA;
            }
        } else {
            renderEffectA = null;
        }
        renderNode.setRenderEffect(renderEffectA);
    }

    public final void k(long j9, long j10, float f3) {
        if (h2.b.b(this.f9980h, j9) && h2.e.a(this.f9981i, j10) && this.f9982j == f3 && this.l == null) {
            return;
        }
        this.f9983k = null;
        this.l = null;
        this.f9979g = true;
        this.f9984n = false;
        this.f9980h = j9;
        this.f9981i = j10;
        this.f9982j = f3;
        a();
    }
}
