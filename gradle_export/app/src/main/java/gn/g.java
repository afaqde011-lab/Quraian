package gn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import b6.k;
import dn.l;
import g00.b0;
import h00.q;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import u00.n;
import y3.h;

public final class g implements n {
    public final int A = 0;
    public final hn.b B;
    public final Context C;
    public final l D;
    public final long E;

    public g(Context context, long j, hn.b bVar, l lVar) {
        this.C = context;
        this.E = j;
        this.B = bVar;
        this.D = lVar;
    }

    public g(hn.b bVar, Context context, l lVar, long j) {
        this.B = bVar;
        this.C = context;
        this.D = lVar;
        this.E = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        u30.b bVar;
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else {
                    dn.a.E.getClass();
                    long j = this.E;
                    float f = 180;
                    dn.a aVar = y3.f.a(h.b(j), f) < 0 ? dn.a.F : y3.f.a(h.a(j), f) < 0 ? dn.a.G : dn.a.H;
                    Context context = this.C;
                    float fMin = Math.min(context.getResources().getDisplayMetrics().density, 512.0f / Math.max(h.b(j), h.a(j)));
                    int iF = w00.a.F(h.b(j) * fMin);
                    if (iF < 1) {
                        iF = 1;
                    }
                    int iF2 = w00.a.F(h.a(j) * fMin);
                    if (iF2 < 1) {
                        iF2 = 1;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF2, Bitmap.Config.ARGB_8888);
                    m.d(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawColor(-16777216);
                    float f2 = aVar.A / 2.0f;
                    float f3 = aVar.B / 2.0f;
                    float fSqrt = (float) Math.sqrt(((f2 * f2) / 4.0f) + 17030.25f);
                    float fSqrt2 = (float) Math.sqrt(((f3 * f3) / 4.0f) + 17030.25f);
                    int iF3 = w00.a.F(((f2 * f3) / ((fSqrt * 2.0f) * fSqrt2)) * 255.0f);
                    float f4 = iF - ((f2 - aVar.C) * fMin);
                    float f5 = (f3 + aVar.D) * fMin;
                    float f6 = fSqrt * 3.5f * fMin;
                    int i2 = 16;
                    float[] fArr = new float[16];
                    int i3 = 0;
                    while (i3 < i2) {
                        fArr[i3] = i3 / 15.0f;
                        i3++;
                        i2 = 16;
                    }
                    int i4 = i2;
                    int[] iArr = new int[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        float f7 = fArr[i5] * 3.5f;
                        int i6 = i5;
                        iArr[i6] = q4.a.h(-11694337, w00.a.F(iF3 * ((float) Math.exp((-(f7 * f7)) / 2.0f))));
                        i5 = i6 + 1;
                        context = context;
                        i4 = 16;
                    }
                    Context context2 = context;
                    Paint paint = new Paint(1);
                    paint.setShader(new RadialGradient(0.0f, 0.0f, f6, iArr, fArr, Shader.TileMode.CLAMP));
                    int iSave = canvas.save();
                    canvas.translate(f4, f5);
                    canvas.scale(1.0f, fSqrt2 / fSqrt);
                    canvas.drawCircle(0.0f, 0.0f, f6, paint);
                    canvas.restoreToCount(iSave);
                    b6.d dVar = new b6.d(bitmapCreateBitmap);
                    k kVar = k.a;
                    w50.c.d(dVar, null, ze.d.u(kVar), 2, null, g0Var, 48, 16);
                    b6.m mVarU = ze.d.u(kVar);
                    float f8 = dn.m.a;
                    va.a.b(w50.c.Y(mVarU), (j6.c) null, v1.d.d(87545415, new g(this.B, context2, this.D, j), g0Var), g0Var, 384, 2);
                }
                break;
            default:
                g0 g0Var3 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = (iIntValue2 & 3) != 2;
                int i7 = 1 & iIntValue2;
                g0 g0Var4 = g0Var3;
                if (!g0Var4.S(i7, z)) {
                    g0Var4.V();
                } else {
                    hn.b bVar2 = this.B;
                    hn.a aVar2 = (bVar2 == null || (bVar = bVar2.a) == null) ? null : (hn.a) q.N0(bVar);
                    if (aVar2 != null) {
                        l lVar = l.A;
                        l lVar2 = this.D;
                        if (lVar2 != lVar) {
                            l lVar3 = l.B;
                            long j2 = this.E;
                            if (lVar2 != lVar3) {
                                g0Var4.c0(-1768179890);
                                a.b(bVar2, h.a(j2) - (dn.m.b * 2), g0Var3, 0);
                                g0Var4.r(false);
                            } else {
                                g0Var4.c0(-1768186225);
                                a.d(bVar2, h.a(j2) - (dn.m.b * 2), g0Var3, 0);
                                g0Var4.r(false);
                            }
                        } else {
                            g0Var4.c0(-1768189302);
                            a.e(aVar2, g0Var3, 0);
                            g0Var4.r(false);
                        }
                    } else {
                        g0Var4.c0(-1768198104);
                        Context context3 = this.C;
                        String string = context3.getString(2131887361);
                        m.d(string, "getString(...)");
                        String string2 = context3.getString(2131887360);
                        m.d(string2, "getString(...)");
                        kh.n.s(string, string2, (b6.m) null, g0Var3, 0);
                        g0Var4.r(false);
                    }
                }
                break;
        }
        return b0Var;
    }
}
