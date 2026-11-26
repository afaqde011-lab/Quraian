package sd;

import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.DependencyException;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import k9.a4;
import k9.b3;
import k9.b4;
import k9.t3;

public final class y1 implements ii.c {

    public static HashSet f14131g;

    public Object f14132a;

    public Object f14133b;

    public Object f14134c;

    public Object f14135d;

    public Object f14136e;

    public Object f14137f;

    public y1(f5.c cVar, e60.a aVar, a10.d dVar) {
        this(cVar, aVar, dVar, null, null);
    }

    public y1(f5.c cVar, e60.a aVar, a10.d dVar, b60.a aVar2, a60.a aVar3) {
        kotlin.jvm.internal.m.e(cVar, "logger");
        kotlin.jvm.internal.m.e(aVar, "scope");
        kotlin.jvm.internal.m.e(dVar, "clazz");
        this.f14132a = cVar;
        this.f14133b = aVar;
        this.f14134c = dVar;
        this.f14135d = aVar2;
        this.f14136e = aVar3;
        g60.a.a(dVar);
        Objects.toString(aVar2);
    }

    public y1(t3 t3Var, a4 a4Var, androidx.media3.common.b1 b1Var, fh.t0 t0Var, Bundle bundle, b4 b4Var) {
        this.f14132a = t3Var;
        this.f14133b = a4Var;
        this.f14134c = b1Var;
        this.f14135d = t0Var;
        this.f14136e = bundle == null ? Bundle.EMPTY : bundle;
        this.f14137f = b4Var;
    }

    public y1(p7.k kVar, MediaFormat mediaFormat, androidx.media3.common.t tVar, Surface surface, MediaCrypto mediaCrypto, k9.x0 x0Var) {
        this.f14132a = kVar;
        this.f14133b = mediaFormat;
        this.f14134c = tVar;
        this.f14135d = surface;
        this.f14136e = mediaCrypto;
        this.f14137f = x0Var;
    }

    public static void A(k0 k0Var, String str) {
        w0 w0VarE = k0Var.f14129a.E(str);
        if (w0VarE == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(w0VarE instanceof k0)) {
            v("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (w0VarE == k0Var) {
            v("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        k0 k0Var2 = (k0) w0VarE;
        if (k0Var.f14003p == null) {
            k0Var.f14003p = k0Var2.f14003p;
        }
        if (k0Var.f14004q == null) {
            k0Var.f14004q = k0Var2.f14004q;
        }
        if (k0Var.f14005r == null) {
            k0Var.f14005r = k0Var2.f14005r;
        }
        if (k0Var.f14006s == null) {
            k0Var.f14006s = k0Var2.f14006s;
        }
        if (k0Var.f14007t == null) {
            k0Var.f14007t = k0Var2.f14007t;
        }
        if (k0Var.f14008u == null) {
            k0Var.f14008u = k0Var2.f14008u;
        }
        if (k0Var.f14009v == null) {
            k0Var.f14009v = k0Var2.f14009v;
        }
        if (k0Var.f14085i.isEmpty()) {
            k0Var.f14085i = k0Var2.f14085i;
        }
        if (k0Var.f13962o == null) {
            k0Var.f13962o = k0Var2.f13962o;
        }
        if (k0Var.f13946n == null) {
            k0Var.f13946n = k0Var2.f13946n;
        }
        String str2 = k0Var2.f14010w;
        if (str2 != null) {
            A(k0Var, str2);
        }
    }

    public static boolean G(q0 q0Var, long j9) {
        return (q0Var.A & j9) != 0;
    }

    public static Path J(l0 l0Var) {
        Path path = new Path();
        float[] fArr = l0Var.f14017o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = l0Var.f14017o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (l0Var instanceof m0) {
            path.close();
        }
        if (l0Var.f14093h == null) {
            l0Var.f14093h = j(path);
        }
        return path;
    }

    public static void X(w1 w1Var, boolean z10, z0 z0Var) {
        int i10;
        q0 q0Var = w1Var.f14108a;
        float fFloatValue = (z10 ? q0Var.C : q0Var.E).floatValue();
        if (z0Var instanceof t) {
            i10 = ((t) z0Var).A;
        } else if (!(z0Var instanceof u)) {
            return;
        } else {
            i10 = w1Var.f14108a.K.A;
        }
        int iP = p(fFloatValue, i10);
        if (z10) {
            w1Var.f14111d.setColor(iP);
        } else {
            w1Var.f14112e.setColor(iP);
        }
    }

    public static void h(float f3, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14, float f15, j0 j0Var) {
        if (f3 == f14 && f10 == f15) {
            return;
        }
        if (f11 == 0.0f || f12 == 0.0f) {
            j0Var.e(f14, f15);
            return;
        }
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        double radians = Math.toRadians(((double) f13) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = ((double) (f3 - f14)) / 2.0d;
        double d5 = ((double) (f10 - f15)) / 2.0d;
        double d10 = (dSin * d5) + (dCos * d3);
        double d11 = (dCos * d5) + ((-dSin) * d3);
        double d12 = fAbs * fAbs;
        double d13 = fAbs2 * fAbs2;
        double d14 = d10 * d10;
        double d15 = d11 * d11;
        double d16 = (d15 / d13) + (d14 / d12);
        if (d16 > 0.99999d) {
            double dSqrt = Math.sqrt(d16) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d12 = fAbs * fAbs;
            d13 = fAbs2 * fAbs2;
        }
        double d17 = z10 == z11 ? -1.0d : 1.0d;
        double d18 = d12 * d13;
        double d19 = d12 * d15;
        double d20 = d13 * d14;
        double d21 = ((d18 - d19) - d20) / (d19 + d20);
        if (d21 < 0.0d) {
            d21 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d21) * d17;
        double d22 = fAbs;
        double d23 = fAbs2;
        double d24 = ((d22 * d11) / d23) * dSqrt2;
        double d25 = dSqrt2 * (-((d23 * d10) / d22));
        double d26 = ((dCos * d24) - (dSin * d25)) + (((double) (f3 + f14)) / 2.0d);
        double d27 = (dCos * d25) + (dSin * d24) + (((double) (f10 + f15)) / 2.0d);
        double d28 = (d10 - d24) / d22;
        double d29 = (d11 - d25) / d23;
        double d30 = ((-d10) - d24) / d22;
        double d31 = ((-d11) - d25) / d23;
        double d32 = (d29 * d29) + (d28 * d28);
        double dAcos = Math.acos(d28 / Math.sqrt(d32)) * (d29 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d31 * d31) + (d30 * d30)) * d32);
        double d33 = (d29 * d31) + (d28 * d30);
        double d34 = d33 / dSqrt3;
        double dAcos2 = ((d28 * d31) - (d29 * d30) < 0.0d ? -1.0d : 1.0d) * (d34 < -1.0d ? 3.141592653589793d : d34 > 1.0d ? 0.0d : Math.acos(d34));
        if (!z11 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z11 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d35 = dAcos2 % 6.283185307179586d;
        double d36 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d35) * 2.0d) / 3.141592653589793d);
        double d37 = d35 / ((double) iCeil);
        double d38 = d37 / 2.0d;
        double dSin2 = (Math.sin(d38) * 1.3333333333333333d) / (Math.cos(d38) + 1.0d);
        int i10 = iCeil * 6;
        float[] fArr = new float[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d39 = d36;
            double d40 = (((double) i11) * d37) + d39;
            double dCos2 = Math.cos(d40);
            double dSin3 = Math.sin(d40);
            int i13 = i11;
            int i14 = i12;
            fArr[i14] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d41 = d40 + d37;
            double dCos3 = Math.cos(d41);
            double dSin4 = Math.sin(d41);
            fArr[i14 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i14 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i14 + 4] = (float) dCos3;
            i12 = i14 + 6;
            fArr[i14 + 5] = (float) dSin4;
            i11 = i13 + 1;
            d36 = d39;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f13);
        matrix.postTranslate((float) d26, (float) d27);
        matrix.mapPoints(fArr);
        fArr[i10 - 2] = f14;
        fArr[i10 - 1] = f15;
        for (int i15 = 0; i15 < i10; i15 += 6) {
            j0Var.c(fArr[i15], fArr[i15 + 1], fArr[i15 + 2], fArr[i15 + 3], fArr[i15 + 4], fArr[i15 + 5]);
        }
    }

    public static h2.a j(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new h2.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static android.graphics.Matrix l(h2.a r9, h2.a r10, sd.q r11) {
        throw new UnsupportedOperationException("Method not decompiled: sd.y1.l(h2.a, h2.a, sd.q):android.graphics.Matrix");
    }

    public static Typeface o(int i10, Integer num, String str) {
        int i11;
        boolean z10 = i10 == 2;
        if (num.intValue() > 500) {
            i11 = z10 ? 3 : 1;
        } else {
            i11 = z10 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i11);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "serif":
                return Typeface.create(Typeface.SERIF, i11);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            default:
                return null;
        }
    }

    public static int p(float f3, int i10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f3);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i11 << 24) | (i10 & 16777215);
    }

    public static void v(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void y(x xVar, String str) {
        w0 w0VarE = xVar.f14129a.E(str);
        if (w0VarE == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(w0VarE instanceof x)) {
            v("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (w0VarE == xVar) {
            v("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        x xVar2 = (x) w0VarE;
        if (xVar.f14117i == null) {
            xVar.f14117i = xVar2.f14117i;
        }
        if (xVar.f14118j == null) {
            xVar.f14118j = xVar2.f14118j;
        }
        if (xVar.f14119k == 0) {
            xVar.f14119k = xVar2.f14119k;
        }
        if (xVar.f14116h.isEmpty()) {
            xVar.f14116h = xVar2.f14116h;
        }
        try {
            if (xVar instanceof x0) {
                x0 x0Var = (x0) xVar;
                x0 x0Var2 = (x0) w0VarE;
                if (x0Var.m == null) {
                    x0Var.m = x0Var2.m;
                }
                if (x0Var.f14120n == null) {
                    x0Var.f14120n = x0Var2.f14120n;
                }
                if (x0Var.f14121o == null) {
                    x0Var.f14121o = x0Var2.f14121o;
                }
                if (x0Var.f14122p == null) {
                    x0Var.f14122p = x0Var2.f14122p;
                }
            } else {
                z((b1) xVar, (b1) w0VarE);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = xVar2.l;
        if (str2 != null) {
            y(xVar, str2);
        }
    }

    public static void z(b1 b1Var, b1 b1Var2) {
        if (b1Var.m == null) {
            b1Var.m = b1Var2.m;
        }
        if (b1Var.f13957n == null) {
            b1Var.f13957n = b1Var2.f13957n;
        }
        if (b1Var.f13958o == null) {
            b1Var.f13958o = b1Var2.f13958o;
        }
        if (b1Var.f13959p == null) {
            b1Var.f13959p = b1Var2.f13959p;
        }
        if (b1Var.f13960q == null) {
            b1Var.f13960q = b1Var2.f13960q;
        }
    }

    public w1 B(w0 w0Var) {
        w1 w1Var = new w1();
        d0(w1Var, q0.a());
        C(w0Var, w1Var);
        return w1Var;
    }

    public void C(y0 y0Var, w1 w1Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (y0Var instanceof w0) {
                arrayList.add(0, (w0) y0Var);
            }
            Object obj = y0Var.f14130b;
            if (obj == null) {
                break;
            } else {
                y0Var = (y0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e0(w1Var, (w0) it.next());
        }
        w1 w1Var2 = (w1) this.f14134c;
        w1Var.f14114g = w1Var2.f14114g;
        w1Var.f14113f = w1Var2.f14113f;
    }

    public int D() {
        int i10;
        q0 q0Var = ((w1) this.f14134c).f14108a;
        if (q0Var.f14056i0 == 1 || (i10 = q0Var.f14057j0) == 2) {
            return q0Var.f14057j0;
        }
        return i10 == 1 ? 3 : 1;
    }

    public Path.FillType E() {
        int i10 = ((w1) this.f14134c).f14108a.f14058k0;
        return (i10 == 0 || i10 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public ii.n F(Class cls) {
        return b(ii.p.a(cls));
    }

    public Path H(r rVar) {
        c0 c0Var = rVar.f14069o;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = rVar.f14070p;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        float fA = rVar.f14071q.a(this);
        float f3 = fD - fA;
        float f10 = fE - fA;
        float f11 = fD + fA;
        float f12 = fE + fA;
        if (rVar.f14093h == null) {
            float f13 = 2.0f * fA;
            rVar.f14093h = new h2.a(f3, f10, f13, f13);
        }
        float f14 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f10);
        float f15 = fD + f14;
        float f16 = fE - f14;
        path.cubicTo(f15, f10, f11, f16, f11, fE);
        float f17 = fE + f14;
        path.cubicTo(f11, f17, f15, f12, fD, f12);
        float f18 = fD - f14;
        path.cubicTo(f18, f12, f3, f17, f3, fE);
        path.cubicTo(f3, f16, f18, f10, fD, f10);
        path.close();
        return path;
    }

    public Path I(w wVar) {
        c0 c0Var = wVar.f14099o;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = wVar.f14100p;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        float fD2 = wVar.f14101q.d(this);
        float fE2 = wVar.f14102r.e(this);
        float f3 = fD - fD2;
        float f10 = fE - fE2;
        float f11 = fD + fD2;
        float f12 = fE + fE2;
        if (wVar.f14093h == null) {
            wVar.f14093h = new h2.a(f3, f10, fD2 * 2.0f, 2.0f * fE2);
        }
        float f13 = fD2 * 0.5522848f;
        float f14 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f10);
        float f15 = fD + f13;
        float f16 = fE - f14;
        path.cubicTo(f15, f10, f11, f16, f11, fE);
        float f17 = fE + f14;
        path.cubicTo(f11, f17, f15, f12, fD, f12);
        float f18 = fD - f13;
        path.cubicTo(f18, f12, f3, f17, f3, fE);
        path.cubicTo(f3, f16, f18, f10, fD, f10);
        path.close();
        return path;
    }

    public Path K(n0 n0Var) {
        float fD;
        float fE;
        float fMin;
        c0 c0Var;
        float fD2;
        c0 c0Var2;
        float fE2;
        float fD3;
        float fE3;
        float f3;
        float f10;
        Path path;
        c0 c0Var3 = n0Var.f14033s;
        if (c0Var3 == null && n0Var.f14034t == null) {
            fD = 0.0f;
        } else {
            if (c0Var3 != null) {
                if (n0Var.f14034t == null) {
                    fD = c0Var3.d(this);
                } else {
                    fD = c0Var3.d(this);
                    fE = n0Var.f14034t.e(this);
                }
                fMin = Math.min(fD, n0Var.f14031q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, n0Var.f14032r.e(this) / 2.0f);
                c0Var = n0Var.f14029o;
                if (c0Var != null) {
                    fD2 = c0Var.d(this);
                } else {
                    fD2 = 0.0f;
                }
                c0Var2 = n0Var.f14030p;
                if (c0Var2 != null) {
                    fE2 = c0Var2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = n0Var.f14031q.d(this);
                fE3 = n0Var.f14032r.e(this);
                if (n0Var.f14093h == null) {
                    n0Var.f14093h = new h2.a(fD2, fE2, fD3, fE3);
                }
                f3 = fD3 + fD2;
                f10 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f3, fE2);
                    path.lineTo(f3, f10);
                    path.lineTo(fD2, f10);
                    path.lineTo(fD2, fE2);
                } else {
                    float f11 = fMin * 0.5522848f;
                    float f12 = 0.5522848f * fMin2;
                    float f13 = fE2 + fMin2;
                    path.moveTo(fD2, f13);
                    float f14 = f13 - f12;
                    float f15 = fD2 + fMin;
                    float f16 = f15 - f11;
                    path.cubicTo(fD2, f14, f16, fE2, f15, fE2);
                    float f17 = f3 - fMin;
                    path.lineTo(f17, fE2);
                    float f18 = f17 + f11;
                    path.cubicTo(f18, fE2, f3, f14, f3, f13);
                    float f19 = f10 - fMin2;
                    path.lineTo(f3, f19);
                    float f20 = f19 + f12;
                    path.cubicTo(f3, f20, f18, f10, f17, f10);
                    path.lineTo(f15, f10);
                    float f21 = fD2;
                    path.cubicTo(f16, f10, f21, f20, fD2, f19);
                    path.lineTo(f21, f13);
                }
                path.close();
                return path;
            }
            fD = n0Var.f14034t.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, n0Var.f14031q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, n0Var.f14032r.e(this) / 2.0f);
        c0Var = n0Var.f14029o;
        if (c0Var != null) {
            fD2 = c0Var.d(this);
        } else {
            fD2 = 0.0f;
        }
        c0Var2 = n0Var.f14030p;
        if (c0Var2 != null) {
            fE2 = c0Var2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = n0Var.f14031q.d(this);
        fE3 = n0Var.f14032r.e(this);
        if (n0Var.f14093h == null) {
            n0Var.f14093h = new h2.a(fD2, fE2, fD3, fE3);
        }
        f3 = fD3 + fD2;
        f10 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f3, fE2);
            path.lineTo(f3, f10);
            path.lineTo(fD2, f10);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f3, fE2);
            path.lineTo(f3, f10);
            path.lineTo(fD2, f10);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public h2.a L(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        w1 w1Var = (w1) this.f14134c;
        h2.a aVar = w1Var.f14114g;
        if (aVar == null) {
            aVar = w1Var.f14113f;
        }
        return new h2.a(fD, fE, c0Var3 != null ? c0Var3.d(this) : aVar.f6542d, c0Var4 != null ? c0Var4.e(this) : aVar.f6543e);
    }

    public Path M(v0 v0Var, boolean z10) {
        Path pathJ;
        Path pathI;
        ((Stack) this.f14135d).push((w1) this.f14134c);
        w1 w1Var = new w1((w1) this.f14134c);
        this.f14134c = w1Var;
        e0(w1Var, v0Var);
        if (!r() || !g0()) {
            this.f14134c = (w1) ((Stack) this.f14135d).pop();
            return null;
        }
        if (v0Var instanceof n1) {
            if (!z10) {
                v("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            n1 n1Var = (n1) v0Var;
            w0 w0VarE = v0Var.f14129a.E(n1Var.f14035o);
            if (w0VarE == null) {
                v("Use reference '%s' not found", n1Var.f14035o);
                this.f14134c = (w1) ((Stack) this.f14135d).pop();
                return null;
            }
            if (!(w0VarE instanceof v0)) {
                this.f14134c = (w1) ((Stack) this.f14135d).pop();
                return null;
            }
            pathJ = M((v0) w0VarE, false);
            if (pathJ != null) {
                if (n1Var.f14093h == null) {
                    n1Var.f14093h = j(pathJ);
                }
                Matrix matrix = n1Var.f14138n;
                if (matrix != null) {
                    pathJ.transform(matrix);
                }
                if (((w1) this.f14134c).f14108a.X != null && (pathI = i(v0Var, v0Var.f14093h)) != null) {
                    pathJ.op(pathI, Path.Op.INTERSECT);
                }
                this.f14134c = (w1) ((Stack) this.f14135d).pop();
                return pathJ;
            }
            return null;
        }
        if (v0Var instanceof y) {
            y yVar = (y) v0Var;
            if (v0Var instanceof i0) {
                s1 s1Var = new s1(((i0) v0Var).f13999o);
                h2.a aVar = v0Var.f14093h;
                Path path = s1Var.f14082a;
                if (aVar == null) {
                    v0Var.f14093h = j(path);
                }
                pathJ = path;
            } else if (v0Var instanceof n0) {
                pathJ = K((n0) v0Var);
            } else if (v0Var instanceof r) {
                pathJ = H((r) v0Var);
            } else if (v0Var instanceof w) {
                pathJ = I((w) v0Var);
            } else {
                pathJ = v0Var instanceof l0 ? J((l0) v0Var) : null;
            }
            if (pathJ != null) {
                if (yVar.f14093h == null) {
                    yVar.f14093h = j(pathJ);
                }
                Matrix matrix2 = yVar.f14128n;
                if (matrix2 != null) {
                    pathJ.transform(matrix2);
                }
                pathJ.setFillType(E());
            }
            return null;
        }
        if (!(v0Var instanceof h1)) {
            v("Invalid %s element found in clipPath definition", v0Var.o());
            return null;
        }
        h1 h1Var = (h1) v0Var;
        ArrayList arrayList = h1Var.f14018n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((c0) h1Var.f14018n.get(0)).d(this);
        ArrayList arrayList2 = h1Var.f14019o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((c0) h1Var.f14019o.get(0)).e(this);
        ArrayList arrayList3 = h1Var.f14020p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) h1Var.f14020p.get(0)).d(this);
        ArrayList arrayList4 = h1Var.f14021q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((c0) h1Var.f14021q.get(0)).e(this);
        }
        if (((w1) this.f14134c).f14108a.f14057j0 != 1) {
            float fK = k(h1Var);
            if (((w1) this.f14134c).f14108a.f14057j0 == 2) {
                fK /= 2.0f;
            }
            fD -= fK;
        }
        if (h1Var.f14093h == null) {
            v1 v1Var = new v1(this, fD, fE2);
            u(h1Var, v1Var);
            RectF rectF = (RectF) v1Var.f14098f;
            h1Var.f14093h = new h2.a(rectF.left, rectF.top, rectF.width(), ((RectF) v1Var.f14098f).height());
        }
        Path path2 = new Path();
        u(h1Var, new v1(this, fD + fD2, fE2 + fE, path2));
        Matrix matrix3 = h1Var.f13988r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(E());
        pathJ = path2;
        if (((w1) this.f14134c).f14108a.X != null) {
            pathJ.op(pathI, Path.Op.INTERSECT);
        }
        this.f14134c = (w1) ((Stack) this.f14135d).pop();
        return pathJ;
    }

    public void N(h2.a aVar) {
        Canvas canvas = (Canvas) this.f14132a;
        if (((w1) this.f14134c).f14108a.Y != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            f0 f0Var = (f0) ((p1) this.f14133b).E(((w1) this.f14134c).f14108a.Y);
            U(f0Var, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            U(f0Var, aVar);
            canvas.restore();
            canvas.restore();
        }
        Z();
    }

    public boolean O() {
        w0 w0VarE;
        int i10 = 0;
        if (((w1) this.f14134c).f14108a.J.floatValue() >= 1.0f && ((w1) this.f14134c).f14108a.Y == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f14132a;
        int iFloatValue = (int) (((w1) this.f14134c).f14108a.J.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i10 = 255;
            if (iFloatValue <= 255) {
                i10 = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i10, 31);
        ((Stack) this.f14135d).push((w1) this.f14134c);
        w1 w1Var = new w1((w1) this.f14134c);
        this.f14134c = w1Var;
        String str = w1Var.f14108a.Y;
        if (str != null && ((w0VarE = ((p1) this.f14133b).E(str)) == null || !(w0VarE instanceof f0))) {
            v("Mask reference '%s' not found", ((w1) this.f14134c).f14108a.Y);
            ((w1) this.f14134c).f14108a.Y = null;
        }
        return true;
    }

    public void P(r0 r0Var, h2.a aVar, h2.a aVar2, q qVar) {
        Canvas canvas = (Canvas) this.f14132a;
        if (aVar.f6542d == 0.0f || aVar.f6543e == 0.0f) {
            return;
        }
        if (qVar == null && (qVar = r0Var.f13946n) == null) {
            qVar = q.f14045d;
        }
        e0((w1) this.f14134c, r0Var);
        if (r()) {
            w1 w1Var = (w1) this.f14134c;
            w1Var.f14113f = aVar;
            if (!w1Var.f14108a.O.booleanValue()) {
                h2.a aVar3 = ((w1) this.f14134c).f14113f;
                V(aVar3.f6540b, aVar3.f6541c, aVar3.f6542d, aVar3.f6543e);
            }
            m(r0Var, ((w1) this.f14134c).f14113f);
            if (aVar2 != null) {
                canvas.concat(l(((w1) this.f14134c).f14113f, aVar2, qVar));
                ((w1) this.f14134c).f14114g = r0Var.f13962o;
            } else {
                h2.a aVar4 = ((w1) this.f14134c).f14113f;
                canvas.translate(aVar4.f6540b, aVar4.f6541c);
            }
            boolean zO = O();
            f0();
            R(r0Var, true);
            if (zO) {
                N(r0Var.f14093h);
            }
            c0(r0Var);
        }
    }

    public void Q(y0 y0Var) {
        c0 c0Var;
        String str;
        int iIndexOf;
        Set setB;
        c0 c0Var2;
        Boolean bool;
        if (y0Var instanceof g0) {
            return;
        }
        a0();
        if ((y0Var instanceof w0) && (bool = ((w0) y0Var).f14104d) != null) {
            ((w1) this.f14134c).f14115h = bool.booleanValue();
        }
        if (y0Var instanceof r0) {
            r0 r0Var = (r0) y0Var;
            P(r0Var, L(r0Var.f14072p, r0Var.f14073q, r0Var.f14074r, r0Var.f14075s), r0Var.f13962o, r0Var.f13946n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (y0Var instanceof n1) {
                n1 n1Var = (n1) y0Var;
                Canvas canvas = (Canvas) this.f14132a;
                c0 c0Var3 = n1Var.f14038r;
                if ((c0Var3 == null || !c0Var3.g()) && ((c0Var2 = n1Var.f14039s) == null || !c0Var2.g())) {
                    e0((w1) this.f14134c, n1Var);
                    if (r()) {
                        y0 y0VarE = n1Var.f14129a.E(n1Var.f14035o);
                        if (y0VarE == null) {
                            v("Use reference '%s' not found", n1Var.f14035o);
                        } else {
                            Matrix matrix = n1Var.f14138n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            c0 c0Var4 = n1Var.f14036p;
                            float fD = c0Var4 != null ? c0Var4.d(this) : 0.0f;
                            c0 c0Var5 = n1Var.f14037q;
                            canvas.translate(fD, c0Var5 != null ? c0Var5.e(this) : 0.0f);
                            m(n1Var, n1Var.f14093h);
                            boolean zO = O();
                            ((Stack) this.f14136e).push(n1Var);
                            ((Stack) this.f14137f).push(((Canvas) this.f14132a).getMatrix());
                            if (y0VarE instanceof r0) {
                                r0 r0Var2 = (r0) y0VarE;
                                h2.a aVarL = L(null, null, n1Var.f14038r, n1Var.f14039s);
                                a0();
                                P(r0Var2, aVarL, r0Var2.f13962o, r0Var2.f13946n);
                                Z();
                            } else if (y0VarE instanceof e1) {
                                c0 c0Var6 = n1Var.f14038r;
                                if (c0Var6 == null) {
                                    c0Var6 = new c0(100.0f, 9);
                                }
                                c0 c0Var7 = n1Var.f14039s;
                                if (c0Var7 == null) {
                                    c0Var7 = new c0(100.0f, 9);
                                }
                                h2.a aVarL2 = L(null, null, c0Var6, c0Var7);
                                a0();
                                e1 e1Var = (e1) y0VarE;
                                if (aVarL2.f6542d != 0.0f && aVarL2.f6543e != 0.0f) {
                                    q qVar = e1Var.f13946n;
                                    if (qVar == null) {
                                        qVar = q.f14045d;
                                    }
                                    e0((w1) this.f14134c, e1Var);
                                    w1 w1Var = (w1) this.f14134c;
                                    w1Var.f14113f = aVarL2;
                                    if (!w1Var.f14108a.O.booleanValue()) {
                                        h2.a aVar = ((w1) this.f14134c).f14113f;
                                        V(aVar.f6540b, aVar.f6541c, aVar.f6542d, aVar.f6543e);
                                    }
                                    h2.a aVar2 = e1Var.f13962o;
                                    if (aVar2 != null) {
                                        canvas.concat(l(((w1) this.f14134c).f14113f, aVar2, qVar));
                                        ((w1) this.f14134c).f14114g = e1Var.f13962o;
                                    } else {
                                        h2.a aVar3 = ((w1) this.f14134c).f14113f;
                                        canvas.translate(aVar3.f6540b, aVar3.f6541c);
                                    }
                                    boolean zO2 = O();
                                    R(e1Var, true);
                                    if (zO2) {
                                        N(e1Var.f14093h);
                                    }
                                    c0(e1Var);
                                }
                                Z();
                            } else {
                                Q(y0VarE);
                            }
                            ((Stack) this.f14136e).pop();
                            ((Stack) this.f14137f).pop();
                            if (zO) {
                                N(n1Var.f14093h);
                            }
                            c0(n1Var);
                        }
                    }
                }
            } else if (y0Var instanceof d1) {
                d1 d1Var = (d1) y0Var;
                e0((w1) this.f14134c, d1Var);
                if (r()) {
                    Matrix matrix2 = d1Var.f14138n;
                    if (matrix2 != null) {
                        ((Canvas) this.f14132a).concat(matrix2);
                    }
                    m(d1Var, d1Var.f14093h);
                    boolean zO3 = O();
                    String language = Locale.getDefault().getLanguage();
                    for (y0 y0Var2 : d1Var.f14085i) {
                        if (y0Var2 instanceof s0) {
                            s0 s0Var = (s0) y0Var2;
                            if (s0Var.c() == null && ((setB = s0Var.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                                Set setF = s0Var.f();
                                if (setF != null) {
                                    if (f14131g == null) {
                                        synchronized (y1.class) {
                                            HashSet hashSet = new HashSet();
                                            f14131g = hashSet;
                                            hashSet.add("Structure");
                                            f14131g.add("BasicStructure");
                                            f14131g.add("ConditionalProcessing");
                                            f14131g.add("Image");
                                            f14131g.add("Style");
                                            f14131g.add("ViewportAttribute");
                                            f14131g.add("Shape");
                                            f14131g.add("BasicText");
                                            f14131g.add("PaintAttribute");
                                            f14131g.add("BasicPaintAttribute");
                                            f14131g.add("OpacityAttribute");
                                            f14131g.add("BasicGraphicsAttribute");
                                            f14131g.add("Marker");
                                            f14131g.add("Gradient");
                                            f14131g.add("Pattern");
                                            f14131g.add("Clip");
                                            f14131g.add("BasicClip");
                                            f14131g.add("Mask");
                                            f14131g.add("View");
                                        }
                                    }
                                    if (setF.isEmpty() || !f14131g.containsAll(setF)) {
                                    }
                                }
                                Set setL = s0Var.l();
                                if (setL == null) {
                                    Set setN = s0Var.n();
                                    if (setN == null) {
                                        Q(y0Var2);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zO3) {
                        N(d1Var.f14093h);
                    }
                    c0(d1Var);
                }
            } else if (y0Var instanceof z) {
                z zVar = (z) y0Var;
                e0((w1) this.f14134c, zVar);
                if (r()) {
                    Matrix matrix3 = zVar.f14138n;
                    if (matrix3 != null) {
                        ((Canvas) this.f14132a).concat(matrix3);
                    }
                    m(zVar, zVar.f14093h);
                    boolean zO4 = O();
                    R(zVar, true);
                    if (zO4) {
                        N(zVar.f14093h);
                    }
                    c0(zVar);
                }
            } else if (y0Var instanceof b0) {
                b0 b0Var = (b0) y0Var;
                Canvas canvas2 = (Canvas) this.f14132a;
                c0 c0Var8 = b0Var.f13954r;
                if (c0Var8 != null && !c0Var8.g() && (c0Var = b0Var.f13955s) != null && !c0Var.g() && (str = b0Var.f13951o) != null) {
                    q qVar2 = b0Var.f13946n;
                    if (qVar2 == null) {
                        qVar2 = q.f14045d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e3) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e3);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        h2.a aVar4 = new h2.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        e0((w1) this.f14134c, b0Var);
                        if (r() && g0()) {
                            Matrix matrix4 = b0Var.f13956t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            c0 c0Var9 = b0Var.f13952p;
                            float fD2 = c0Var9 != null ? c0Var9.d(this) : 0.0f;
                            c0 c0Var10 = b0Var.f13953q;
                            float fE2 = c0Var10 != null ? c0Var10.e(this) : 0.0f;
                            float fD3 = b0Var.f13954r.d(this);
                            float fD4 = b0Var.f13955s.d(this);
                            w1 w1Var2 = (w1) this.f14134c;
                            w1Var2.f14113f = new h2.a(fD2, fE2, fD3, fD4);
                            if (!w1Var2.f14108a.O.booleanValue()) {
                                h2.a aVar5 = ((w1) this.f14134c).f14113f;
                                V(aVar5.f6540b, aVar5.f6541c, aVar5.f6542d, aVar5.f6543e);
                            }
                            b0Var.f14093h = ((w1) this.f14134c).f14113f;
                            c0(b0Var);
                            m(b0Var, b0Var.f14093h);
                            boolean zO5 = O();
                            f0();
                            canvas2.save();
                            canvas2.concat(l(((w1) this.f14134c).f14113f, aVar4, qVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((w1) this.f14134c).f14108a.f14060m0 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zO5) {
                                N(b0Var.f14093h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof i0) {
                i0 i0Var = (i0) y0Var;
                if (i0Var.f13999o != null) {
                    e0((w1) this.f14134c, i0Var);
                    if (r() && g0()) {
                        w1 w1Var3 = (w1) this.f14134c;
                        if (w1Var3.f14110c || w1Var3.f14109b) {
                            Matrix matrix5 = i0Var.f14128n;
                            if (matrix5 != null) {
                                ((Canvas) this.f14132a).concat(matrix5);
                            }
                            Path path = new s1(i0Var.f13999o).f14082a;
                            if (i0Var.f14093h == null) {
                                i0Var.f14093h = j(path);
                            }
                            c0(i0Var);
                            n(i0Var);
                            m(i0Var, i0Var.f14093h);
                            boolean zO6 = O();
                            w1 w1Var4 = (w1) this.f14134c;
                            if (w1Var4.f14109b) {
                                int i10 = w1Var4.f14108a.f14051d0;
                                path.setFillType((i10 == 0 || i10 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                s(i0Var, path);
                            }
                            if (((w1) this.f14134c).f14110c) {
                                t(path);
                            }
                            T(i0Var);
                            if (zO6) {
                                N(i0Var.f14093h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof n0) {
                n0 n0Var = (n0) y0Var;
                c0 c0Var11 = n0Var.f14031q;
                if (c0Var11 != null && n0Var.f14032r != null && !c0Var11.g() && !n0Var.f14032r.g()) {
                    e0((w1) this.f14134c, n0Var);
                    if (r() && g0()) {
                        Matrix matrix6 = n0Var.f14128n;
                        if (matrix6 != null) {
                            ((Canvas) this.f14132a).concat(matrix6);
                        }
                        Path pathK = K(n0Var);
                        c0(n0Var);
                        n(n0Var);
                        m(n0Var, n0Var.f14093h);
                        boolean zO7 = O();
                        if (((w1) this.f14134c).f14109b) {
                            s(n0Var, pathK);
                        }
                        if (((w1) this.f14134c).f14110c) {
                            t(pathK);
                        }
                        if (zO7) {
                            N(n0Var.f14093h);
                        }
                    }
                }
            } else if (y0Var instanceof r) {
                r rVar = (r) y0Var;
                c0 c0Var12 = rVar.f14071q;
                if (c0Var12 != null && !c0Var12.g()) {
                    e0((w1) this.f14134c, rVar);
                    if (r() && g0()) {
                        Matrix matrix7 = rVar.f14128n;
                        if (matrix7 != null) {
                            ((Canvas) this.f14132a).concat(matrix7);
                        }
                        Path pathH = H(rVar);
                        c0(rVar);
                        n(rVar);
                        m(rVar, rVar.f14093h);
                        boolean zO8 = O();
                        if (((w1) this.f14134c).f14109b) {
                            s(rVar, pathH);
                        }
                        if (((w1) this.f14134c).f14110c) {
                            t(pathH);
                        }
                        if (zO8) {
                            N(rVar.f14093h);
                        }
                    }
                }
            } else if (y0Var instanceof w) {
                w wVar = (w) y0Var;
                c0 c0Var13 = wVar.f14101q;
                if (c0Var13 != null && wVar.f14102r != null && !c0Var13.g() && !wVar.f14102r.g()) {
                    e0((w1) this.f14134c, wVar);
                    if (r() && g0()) {
                        Matrix matrix8 = wVar.f14128n;
                        if (matrix8 != null) {
                            ((Canvas) this.f14132a).concat(matrix8);
                        }
                        Path pathI = I(wVar);
                        c0(wVar);
                        n(wVar);
                        m(wVar, wVar.f14093h);
                        boolean zO9 = O();
                        if (((w1) this.f14134c).f14109b) {
                            s(wVar, pathI);
                        }
                        if (((w1) this.f14134c).f14110c) {
                            t(pathI);
                        }
                        if (zO9) {
                            N(wVar.f14093h);
                        }
                    }
                }
            } else if (y0Var instanceof d0) {
                d0 d0Var = (d0) y0Var;
                e0((w1) this.f14134c, d0Var);
                if (r() && g0() && ((w1) this.f14134c).f14110c) {
                    Matrix matrix9 = d0Var.f14128n;
                    if (matrix9 != null) {
                        ((Canvas) this.f14132a).concat(matrix9);
                    }
                    c0 c0Var14 = d0Var.f13964o;
                    float fD5 = c0Var14 == null ? 0.0f : c0Var14.d(this);
                    c0 c0Var15 = d0Var.f13965p;
                    float fE3 = c0Var15 == null ? 0.0f : c0Var15.e(this);
                    c0 c0Var16 = d0Var.f13966q;
                    float fD6 = c0Var16 == null ? 0.0f : c0Var16.d(this);
                    c0 c0Var17 = d0Var.f13967r;
                    fE = c0Var17 != null ? c0Var17.e(this) : 0.0f;
                    if (d0Var.f14093h == null) {
                        d0Var.f14093h = new h2.a(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    c0(d0Var);
                    n(d0Var);
                    m(d0Var, d0Var.f14093h);
                    boolean zO10 = O();
                    t(path2);
                    T(d0Var);
                    if (zO10) {
                        N(d0Var.f14093h);
                    }
                }
            } else if (y0Var instanceof m0) {
                m0 m0Var = (m0) y0Var;
                e0((w1) this.f14134c, m0Var);
                if (r() && g0()) {
                    w1 w1Var5 = (w1) this.f14134c;
                    if (w1Var5.f14110c || w1Var5.f14109b) {
                        Matrix matrix10 = m0Var.f14128n;
                        if (matrix10 != null) {
                            ((Canvas) this.f14132a).concat(matrix10);
                        }
                        if (m0Var.f14017o.length >= 2) {
                            Path pathJ = J(m0Var);
                            c0(m0Var);
                            n(m0Var);
                            m(m0Var, m0Var.f14093h);
                            boolean zO11 = O();
                            if (((w1) this.f14134c).f14109b) {
                                s(m0Var, pathJ);
                            }
                            if (((w1) this.f14134c).f14110c) {
                                t(pathJ);
                            }
                            T(m0Var);
                            if (zO11) {
                                N(m0Var.f14093h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof l0) {
                l0 l0Var = (l0) y0Var;
                e0((w1) this.f14134c, l0Var);
                if (r() && g0()) {
                    w1 w1Var6 = (w1) this.f14134c;
                    if (w1Var6.f14110c || w1Var6.f14109b) {
                        Matrix matrix11 = l0Var.f14128n;
                        if (matrix11 != null) {
                            ((Canvas) this.f14132a).concat(matrix11);
                        }
                        if (l0Var.f14017o.length >= 2) {
                            Path pathJ2 = J(l0Var);
                            c0(l0Var);
                            int i11 = ((w1) this.f14134c).f14108a.f14051d0;
                            pathJ2.setFillType((i11 == 0 || i11 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            n(l0Var);
                            m(l0Var, l0Var.f14093h);
                            boolean zO12 = O();
                            if (((w1) this.f14134c).f14109b) {
                                s(l0Var, pathJ2);
                            }
                            if (((w1) this.f14134c).f14110c) {
                                t(pathJ2);
                            }
                            T(l0Var);
                            if (zO12) {
                                N(l0Var.f14093h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof h1) {
                h1 h1Var = (h1) y0Var;
                e0((w1) this.f14134c, h1Var);
                if (r()) {
                    Matrix matrix12 = h1Var.f13988r;
                    if (matrix12 != null) {
                        ((Canvas) this.f14132a).concat(matrix12);
                    }
                    ArrayList arrayList = h1Var.f14018n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((c0) h1Var.f14018n.get(0)).d(this);
                    ArrayList arrayList2 = h1Var.f14019o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((c0) h1Var.f14019o.get(0)).e(this);
                    ArrayList arrayList3 = h1Var.f14020p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) h1Var.f14020p.get(0)).d(this);
                    ArrayList arrayList4 = h1Var.f14021q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((c0) h1Var.f14021q.get(0)).e(this);
                    }
                    int iD = D();
                    if (iD != 1) {
                        float fK = k(h1Var);
                        if (iD == 2) {
                            fK /= 2.0f;
                        }
                        fD7 -= fK;
                    }
                    if (h1Var.f14093h == null) {
                        v1 v1Var = new v1(this, fD7, fE4);
                        u(h1Var, v1Var);
                        RectF rectF = (RectF) v1Var.f14098f;
                        h1Var.f14093h = new h2.a(rectF.left, rectF.top, rectF.width(), ((RectF) v1Var.f14098f).height());
                    }
                    c0(h1Var);
                    n(h1Var);
                    m(h1Var, h1Var.f14093h);
                    boolean zO13 = O();
                    u(h1Var, new u1(this, fD7 + fD8, fE4 + fE));
                    if (zO13) {
                        N(h1Var.f14093h);
                    }
                }
            }
        }
        Z();
    }

    public void R(t0 t0Var, boolean z10) {
        if (z10) {
            ((Stack) this.f14136e).push(t0Var);
            ((Stack) this.f14137f).push(((Canvas) this.f14132a).getMatrix());
        }
        Iterator it = t0Var.f14085i.iterator();
        while (it.hasNext()) {
            Q((y0) it.next());
        }
        if (z10) {
            ((Stack) this.f14136e).pop();
            ((Stack) this.f14137f).pop();
        }
    }

    public void S(e0 e0Var, r1 r1Var) {
        float fFloatValue;
        float f3;
        float f10;
        float f11;
        Canvas canvas = (Canvas) this.f14132a;
        a0();
        Float f12 = e0Var.f13973u;
        float f13 = 0.0f;
        if (f12 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f12.floatValue())) {
            float f14 = r1Var.f14078c;
            if (f14 == 0.0f && r1Var.f14079d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(r1Var.f14079d, f14));
            }
        } else {
            fFloatValue = e0Var.f13973u.floatValue();
        }
        float fC = e0Var.f13968p ? 1.0f : ((w1) this.f14134c).f14108a.F.c();
        this.f14134c = B(e0Var);
        Matrix matrix = new Matrix();
        matrix.preTranslate(r1Var.f14076a, r1Var.f14077b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fC, fC);
        c0 c0Var = e0Var.f13969q;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = e0Var.f13970r;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        c0 c0Var3 = e0Var.f13971s;
        float fD2 = c0Var3 != null ? c0Var3.d(this) : 3.0f;
        c0 c0Var4 = e0Var.f13972t;
        float fE2 = c0Var4 != null ? c0Var4.e(this) : 3.0f;
        h2.a aVar = e0Var.f13962o;
        if (aVar != null) {
            float fMax = fD2 / aVar.f6542d;
            float f15 = fE2 / aVar.f6543e;
            q qVar = e0Var.f13946n;
            if (qVar == null) {
                qVar = q.f14045d;
            }
            boolean zEquals = qVar.equals(q.f14044c);
            p pVar = qVar.f14046a;
            if (!zEquals) {
                fMax = qVar.f14047b == 2 ? Math.max(fMax, f15) : Math.min(fMax, f15);
                f15 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f15);
            canvas.concat(matrix);
            h2.a aVar2 = e0Var.f13962o;
            float f16 = aVar2.f6542d * fMax;
            float f17 = aVar2.f6543e * f15;
            int iOrdinal = pVar.ordinal();
            if (iOrdinal == 2) {
                f3 = (fD2 - f16) / 2.0f;
                f10 = 0.0f - f3;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f10 = 0.0f;
                                }
                            }
                        }
                    }
                    f3 = (fD2 - f16) / 2.0f;
                    f10 = 0.0f - f3;
                }
                f3 = fD2 - f16;
                f10 = 0.0f - f3;
            }
            switch (pVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f11 = (fE2 - f17) / 2.0f;
                    f13 = 0.0f - f11;
                    if (!((w1) this.f14134c).f14108a.O.booleanValue()) {
                        V(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f15);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f11 = fE2 - f17;
                    f13 = 0.0f - f11;
                    if (!((w1) this.f14134c).f14108a.O.booleanValue()) {
                        V(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f15);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((w1) this.f14134c).f14108a.O.booleanValue()) {
                        V(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f15);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((w1) this.f14134c).f14108a.O.booleanValue()) {
                V(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zO = O();
        R(e0Var, false);
        if (zO) {
            N(e0Var.f14093h);
        }
        Z();
    }

    public void T(y yVar) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        int i10;
        float f3;
        float f10;
        float f11;
        ArrayList arrayList;
        int size;
        q0 q0Var = ((w1) this.f14134c).f14108a;
        String str = q0Var.Q;
        if (str == null && q0Var.R == null && q0Var.S == null) {
            return;
        }
        if (str == null) {
            e0Var = null;
        } else {
            w0 w0VarE = yVar.f14129a.E(str);
            if (w0VarE != null) {
                e0Var = (e0) w0VarE;
            } else {
                v("Marker reference '%s' not found", ((w1) this.f14134c).f14108a.Q);
                e0Var = null;
            }
        }
        String str2 = ((w1) this.f14134c).f14108a.R;
        if (str2 == null) {
            e0Var2 = null;
        } else {
            w0 w0VarE2 = yVar.f14129a.E(str2);
            if (w0VarE2 != null) {
                e0Var2 = (e0) w0VarE2;
            } else {
                v("Marker reference '%s' not found", ((w1) this.f14134c).f14108a.R);
                e0Var2 = null;
            }
        }
        String str3 = ((w1) this.f14134c).f14108a.S;
        if (str3 == null) {
            e0Var3 = null;
        } else {
            w0 w0VarE3 = yVar.f14129a.E(str3);
            if (w0VarE3 != null) {
                e0Var3 = (e0) w0VarE3;
            } else {
                v("Marker reference '%s' not found", ((w1) this.f14134c).f14108a.S);
                e0Var3 = null;
            }
        }
        float f12 = 0.0f;
        if (yVar instanceof i0) {
            arrayList = new q1(this, ((i0) yVar).f13999o).f14061a;
            f10 = 0.0f;
            i10 = 1;
        } else if (yVar instanceof d0) {
            d0 d0Var = (d0) yVar;
            c0 c0Var = d0Var.f13964o;
            float fD = c0Var != null ? c0Var.d(this) : 0.0f;
            c0 c0Var2 = d0Var.f13965p;
            float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
            c0 c0Var3 = d0Var.f13966q;
            float fD2 = c0Var3 != null ? c0Var3.d(this) : 0.0f;
            c0 c0Var4 = d0Var.f13967r;
            float fE2 = c0Var4 != null ? c0Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f13 = fD2 - fD;
            i10 = 1;
            float f14 = fE2 - fE;
            arrayList2.add(new r1(fD, fE, f13, f14));
            arrayList2.add(new r1(fD2, fE2, f13, f14));
            f10 = 0.0f;
            arrayList = arrayList2;
        } else {
            i10 = 1;
            l0 l0Var = (l0) yVar;
            int length = l0Var.f14017o.length;
            if (length < 2) {
                arrayList = null;
                f10 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = l0Var.f14017o;
                r1 r1Var = new r1(fArr[0], fArr[1], 0.0f, 0.0f);
                int i11 = 2;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    f3 = r1Var.f14077b;
                    f10 = f12;
                    f11 = r1Var.f14076a;
                    if (i11 >= length) {
                        break;
                    }
                    float[] fArr2 = l0Var.f14017o;
                    float f17 = fArr2[i11];
                    float f18 = fArr2[i11 + 1];
                    r1Var.a(f17, f18);
                    arrayList3.add(r1Var);
                    r1Var = new r1(f17, f18, f17 - f11, f18 - f3);
                    i11 += 2;
                    f16 = f18;
                    f15 = f17;
                    f12 = f10;
                }
                if (l0Var instanceof m0) {
                    float[] fArr3 = l0Var.f14017o;
                    float f19 = fArr3[0];
                    if (f15 != f19) {
                        float f20 = fArr3[1];
                        if (f16 != f20) {
                            r1Var.a(f19, f20);
                            arrayList3.add(r1Var);
                            r1 r1Var2 = new r1(f19, f20, f19 - f11, f20 - f3);
                            r1Var2.b((r1) arrayList3.get(0));
                            arrayList3.add(r1Var2);
                            arrayList3.set(0, r1Var2);
                        }
                    }
                } else {
                    arrayList3.add(r1Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        q0 q0Var2 = ((w1) this.f14134c).f14108a;
        q0Var2.S = null;
        q0Var2.R = null;
        q0Var2.Q = null;
        if (e0Var != null) {
            S(e0Var, (r1) arrayList.get(0));
        }
        if (e0Var2 != null && arrayList.size() > 2) {
            r1 r1Var3 = (r1) arrayList.get(0);
            r1 r1Var4 = (r1) arrayList.get(i10);
            int i12 = 1;
            while (i12 < size - 1) {
                i12++;
                r1 r1Var5 = (r1) arrayList.get(i12);
                if (r1Var4.f14080e) {
                    float f21 = r1Var4.f14078c;
                    float f22 = r1Var4.f14079d;
                    float f23 = r1Var4.f14076a;
                    float f24 = f23 - r1Var3.f14076a;
                    float f25 = r1Var4.f14077b;
                    float f26 = ((f25 - r1Var3.f14077b) * f22) + (f24 * f21);
                    if (f26 == f10) {
                        f26 = ((r1Var5.f14076a - f23) * f21) + ((r1Var5.f14077b - f25) * f22);
                    }
                    if (f26 <= f10 && (f26 != f10 || (f21 <= f10 && f22 < f10))) {
                        r1Var4.f14078c = -f21;
                        r1Var4.f14079d = -f22;
                    }
                }
                S(e0Var2, r1Var4);
                r1Var3 = r1Var4;
                r1Var4 = r1Var5;
            }
        }
        if (e0Var3 != null) {
            S(e0Var3, (r1) arrayList.get(size - 1));
        }
    }

    public void U(f0 f0Var, h2.a aVar) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.f14132a;
        Boolean bool = f0Var.f13979n;
        if (bool == null || !bool.booleanValue()) {
            c0 c0Var = f0Var.f13981p;
            float fB = c0Var != null ? c0Var.b(this, 1.0f) : 1.2f;
            c0 c0Var2 = f0Var.f13982q;
            float fB2 = c0Var2 != null ? c0Var2.b(this, 1.0f) : 1.2f;
            fD = fB * aVar.f6542d;
            fE = fB2 * aVar.f6543e;
        } else {
            c0 c0Var3 = f0Var.f13981p;
            fD = c0Var3 != null ? c0Var3.d(this) : aVar.f6542d;
            c0 c0Var4 = f0Var.f13982q;
            fE = c0Var4 != null ? c0Var4.e(this) : aVar.f6543e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        a0();
        w1 w1VarB = B(f0Var);
        this.f14134c = w1VarB;
        w1VarB.f14108a.J = Float.valueOf(1.0f);
        boolean zO = O();
        canvas.save();
        Boolean bool2 = f0Var.f13980o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.f6540b, aVar.f6541c);
            canvas.scale(aVar.f6542d, aVar.f6543e);
        }
        R(f0Var, false);
        canvas.restore();
        if (zO) {
            N(aVar);
        }
        Z();
    }

    public void V(float f3, float f10, float f11, float f12) {
        float fD = f11 + f3;
        float fE = f12 + f10;
        p10.a aVar = ((w1) this.f14134c).f14108a.P;
        if (aVar != null) {
            f3 += ((c0) aVar.D).d(this);
            f10 += ((c0) ((w1) this.f14134c).f14108a.P.A).e(this);
            fD -= ((c0) ((w1) this.f14134c).f14108a.P.B).d(this);
            fE -= ((c0) ((w1) this.f14134c).f14108a.P.C).e(this);
        }
        ((Canvas) this.f14132a).clipRect(f3, f10, fD, fE);
    }

    public void W(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i11;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bi.g gVar = (bi.g) this.f14132a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f2533c.f2542b);
        oj.m mVar = (oj.m) this.f14133b;
        synchronized (mVar) {
            try {
                if (mVar.f12095a == 0 && (packageInfoD = mVar.d("com.google.android.gms")) != null) {
                    mVar.f12095a = packageInfoD.versionCode;
                }
                i10 = mVar.f12095a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((oj.m) this.f14133b).b());
        oj.m mVar2 = (oj.m) this.f14133b;
        synchronized (mVar2) {
            try {
                if (((String) mVar2.f12099e) == null) {
                    mVar2.f();
                }
                str3 = (String) mVar2.f12099e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bundle.putString("app_ver_name", str3);
        bi.g gVar2 = (bi.g) this.f14132a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f2532b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((jj.a) Tasks.await(((jj.c) ((jj.d) this.f14137f)).d())).f8290a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e3) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e3);
        }
        bundle.putString("appid", (String) Tasks.await(((jj.c) ((jj.d) this.f14137f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        gj.g gVar3 = (gj.g) ((ij.b) this.f14136e).get();
        qj.b bVar = (qj.b) ((ij.b) this.f14135d).get();
        if (gVar3 == null || bVar == null) {
            return;
        }
        gj.d dVar = (gj.d) gVar3;
        synchronized (dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            gj.i iVar = (gj.i) dVar.f6348a.get();
            synchronized (iVar) {
                zE = iVar.e(gj.i.f6353b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (iVar) {
                    iVar.f6356a.a(new al.l(iVar, iVar.b(System.currentTimeMillis()), 18));
                }
                i11 = 3;
            } else {
                i11 = 1;
            }
        }
        if (i11 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(e4.f.b(i11)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public Task Y(String str, String str2, Bundle bundle) {
        int i10;
        try {
            W(str, str2, bundle);
            oe.b bVar = (oe.b) this.f14134c;
            oe.h hVar = oe.h.C;
            bg.b bVar2 = bVar.f11943c;
            if (bVar2.w() < 12000000) {
                return bVar2.x() != 0 ? bVar.a(bundle).i(hVar, new h1.l(bVar, bundle, false)) : Tasks.c(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            oe.o oVarI = oe.o.i(bVar.f11942b);
            synchronized (oVarI) {
                i10 = oVarI.A;
                oVarI.A = i10 + 1;
            }
            return oVarI.j(new oe.n(i10, 1, bundle, 1)).h(hVar, oe.d.B);
        } catch (InterruptedException | ExecutionException e3) {
            return Tasks.c(e3);
        }
    }

    public void Z() {
        ((Canvas) this.f14132a).restore();
        this.f14134c = (w1) ((Stack) this.f14135d).pop();
    }

    @Override
    public Object a(Class cls) {
        if (!((Set) this.f14132a).contains(ii.p.a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((ii.c) this.f14137f).a(cls);
        if (!cls.equals(fj.b.class)) {
            return objA;
        }
        return new ii.q();
    }

    public void a0() {
        ((Canvas) this.f14132a).save();
        ((Stack) this.f14135d).push((w1) this.f14134c);
        this.f14134c = new w1((w1) this.f14134c);
    }

    @Override
    public ii.n b(ii.p pVar) {
        if (((Set) this.f14134c).contains(pVar)) {
            return ((ii.c) this.f14137f).b(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    public String b0(String str, boolean z10, boolean z11) {
        if (((w1) this.f14134c).f14115h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", RuntimeVersion.SUFFIX).replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", RuntimeVersion.SUFFIX);
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", RuntimeVersion.SUFFIX);
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    @Override
    public ij.b c(ii.p pVar) {
        if (((Set) this.f14136e).contains(pVar)) {
            return ((ii.c) this.f14137f).c(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + pVar + ">>.");
    }

    public void c0(v0 v0Var) {
        if (v0Var.f14130b == null || v0Var.f14093h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f14137f).peek()).invert(matrix)) {
            h2.a aVar = v0Var.f14093h;
            float f3 = aVar.f6540b;
            float f10 = aVar.f6541c;
            float fC = aVar.c();
            h2.a aVar2 = v0Var.f14093h;
            float f11 = aVar2.f6541c;
            float fC2 = aVar2.c();
            float fD = v0Var.f14093h.d();
            h2.a aVar3 = v0Var.f14093h;
            float[] fArr = {f3, f10, fC, f11, fC2, fD, aVar3.f6540b, aVar3.d()};
            matrix.preConcat(((Canvas) this.f14132a).getMatrix());
            matrix.mapPoints(fArr);
            float f12 = fArr[0];
            float f13 = fArr[1];
            RectF rectF = new RectF(f12, f13, f12, f13);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f14 = fArr[i10];
                if (f14 < rectF.left) {
                    rectF.left = f14;
                }
                if (f14 > rectF.right) {
                    rectF.right = f14;
                }
                float f15 = fArr[i10 + 1];
                if (f15 < rectF.top) {
                    rectF.top = f15;
                }
                if (f15 > rectF.bottom) {
                    rectF.bottom = f15;
                }
            }
            v0 v0Var2 = (v0) ((Stack) this.f14136e).peek();
            h2.a aVar4 = v0Var2.f14093h;
            if (aVar4 == null) {
                float f16 = rectF.left;
                float f17 = rectF.top;
                v0Var2.f14093h = new h2.a(f16, f17, rectF.right - f16, rectF.bottom - f17);
                return;
            }
            float f18 = rectF.left;
            float f19 = rectF.top;
            float f20 = rectF.right - f18;
            float f21 = rectF.bottom - f19;
            if (f18 < aVar4.f6540b) {
                aVar4.f6540b = f18;
            }
            if (f19 < aVar4.f6541c) {
                aVar4.f6541c = f19;
            }
            if (f18 + f20 > aVar4.c()) {
                aVar4.f6542d = (f18 + f20) - aVar4.f6540b;
            }
            if (f19 + f21 > aVar4.d()) {
                aVar4.f6543e = (f19 + f21) - aVar4.f6541c;
            }
        }
    }

    @Override
    public ij.b d(Class cls) {
        return e(ii.p.a(cls));
    }

    public void d0(w1 w1Var, q0 q0Var) {
        if (G(q0Var, MediaStatus.COMMAND_EDIT_TRACKS)) {
            w1Var.f14108a.K = q0Var.K;
        }
        if (G(q0Var, MediaStatus.COMMAND_QUEUE_REPEAT_ONE)) {
            w1Var.f14108a.J = q0Var.J;
        }
        boolean zG = G(q0Var, 1L);
        t tVar = t.C;
        if (zG) {
            w1Var.f14108a.B = q0Var.B;
            z0 z0Var = q0Var.B;
            w1Var.f14109b = (z0Var == null || z0Var == tVar) ? false : true;
        }
        if (G(q0Var, 4L)) {
            w1Var.f14108a.C = q0Var.C;
        }
        if (G(q0Var, 6149L)) {
            X(w1Var, true, w1Var.f14108a.B);
        }
        if (G(q0Var, 2L)) {
            w1Var.f14108a.f14051d0 = q0Var.f14051d0;
        }
        if (G(q0Var, 8L)) {
            w1Var.f14108a.D = q0Var.D;
            z0 z0Var2 = q0Var.D;
            w1Var.f14110c = (z0Var2 == null || z0Var2 == tVar) ? false : true;
        }
        if (G(q0Var, 16L)) {
            w1Var.f14108a.E = q0Var.E;
        }
        if (G(q0Var, 6168L)) {
            X(w1Var, false, w1Var.f14108a.D);
        }
        if (G(q0Var, 34359738368L)) {
            w1Var.f14108a.f14059l0 = q0Var.f14059l0;
        }
        if (G(q0Var, 32L)) {
            q0 q0Var2 = w1Var.f14108a;
            c0 c0Var = q0Var.F;
            q0Var2.F = c0Var;
            w1Var.f14112e.setStrokeWidth(c0Var.a(this));
        }
        if (G(q0Var, 64L)) {
            q0 q0Var3 = w1Var.f14108a;
            Paint paint = w1Var.f14112e;
            q0Var3.f14052e0 = q0Var.f14052e0;
            int iB = e4.f.b(q0Var.f14052e0);
            if (iB == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iB == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iB == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (G(q0Var, 128L)) {
            q0 q0Var4 = w1Var.f14108a;
            Paint paint2 = w1Var.f14112e;
            q0Var4.f14053f0 = q0Var.f14053f0;
            int iB2 = e4.f.b(q0Var.f14053f0);
            if (iB2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iB2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iB2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (G(q0Var, 256L)) {
            w1Var.f14108a.G = q0Var.G;
            w1Var.f14112e.setStrokeMiter(q0Var.G.floatValue());
        }
        if (G(q0Var, 512L)) {
            w1Var.f14108a.H = q0Var.H;
        }
        if (G(q0Var, MediaStatus.COMMAND_QUEUE_REPEAT_ALL)) {
            w1Var.f14108a.I = q0Var.I;
        }
        Typeface typefaceO = null;
        if (G(q0Var, 1536L)) {
            q0 q0Var5 = w1Var.f14108a;
            Paint paint3 = w1Var.f14112e;
            c0[] c0VarArr = q0Var5.H;
            if (c0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c0VarArr.length;
                int i10 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i10];
                float f3 = 0.0f;
                for (int i11 = 0; i11 < i10; i11++) {
                    float fA = q0Var5.H[i11 % length].a(this);
                    fArr[i11] = fA;
                    f3 += fA;
                }
                if (f3 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = q0Var5.I.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f3) + f3;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (G(q0Var, MediaStatus.COMMAND_LIKE)) {
            float textSize = ((w1) this.f14134c).f14111d.getTextSize();
            w1Var.f14108a.M = q0Var.M;
            w1Var.f14111d.setTextSize(q0Var.M.b(this, textSize));
            w1Var.f14112e.setTextSize(q0Var.M.b(this, textSize));
        }
        if (G(q0Var, MediaStatus.COMMAND_PLAYBACK_RATE)) {
            w1Var.f14108a.L = q0Var.L;
        }
        if (G(q0Var, MediaStatus.COMMAND_DISLIKE)) {
            if (q0Var.N.intValue() == -1 && w1Var.f14108a.N.intValue() > 100) {
                q0 q0Var6 = w1Var.f14108a;
                q0Var6.N = Integer.valueOf(q0Var6.N.intValue() - 100);
            } else if (q0Var.N.intValue() != 1 || w1Var.f14108a.N.intValue() >= 900) {
                w1Var.f14108a.N = q0Var.N;
            } else {
                q0 q0Var7 = w1Var.f14108a;
                q0Var7.N = Integer.valueOf(q0Var7.N.intValue() + 100);
            }
        }
        if (G(q0Var, MediaStatus.COMMAND_FOLLOW)) {
            w1Var.f14108a.f14054g0 = q0Var.f14054g0;
        }
        if (G(q0Var, 106496L)) {
            q0 q0Var8 = w1Var.f14108a;
            ArrayList arrayList = q0Var8.L;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceO = o(q0Var8.f14054g0, q0Var8.N, (String) it.next());
                    if (typefaceO != null) {
                        break;
                    }
                }
            }
            if (typefaceO == null) {
                typefaceO = o(q0Var8.f14054g0, q0Var8.N, "serif");
            }
            w1Var.f14111d.setTypeface(typefaceO);
            w1Var.f14112e.setTypeface(typefaceO);
        }
        if (G(q0Var, MediaStatus.COMMAND_UNFOLLOW)) {
            q0 q0Var9 = w1Var.f14108a;
            Paint paint4 = w1Var.f14112e;
            Paint paint5 = w1Var.f14111d;
            q0Var9.f14055h0 = q0Var.f14055h0;
            paint5.setStrikeThruText(q0Var.f14055h0 == 4);
            paint5.setUnderlineText(q0Var.f14055h0 == 2);
            paint4.setStrikeThruText(q0Var.f14055h0 == 4);
            paint4.setUnderlineText(q0Var.f14055h0 == 2);
        }
        if (G(q0Var, 68719476736L)) {
            w1Var.f14108a.f14056i0 = q0Var.f14056i0;
        }
        if (G(q0Var, MediaStatus.COMMAND_STREAM_TRANSFER)) {
            w1Var.f14108a.f14057j0 = q0Var.f14057j0;
        }
        if (G(q0Var, 524288L)) {
            w1Var.f14108a.O = q0Var.O;
        }
        if (G(q0Var, 2097152L)) {
            w1Var.f14108a.Q = q0Var.Q;
        }
        if (G(q0Var, 4194304L)) {
            w1Var.f14108a.R = q0Var.R;
        }
        if (G(q0Var, 8388608L)) {
            w1Var.f14108a.S = q0Var.S;
        }
        if (G(q0Var, 16777216L)) {
            w1Var.f14108a.T = q0Var.T;
        }
        if (G(q0Var, 33554432L)) {
            w1Var.f14108a.U = q0Var.U;
        }
        if (G(q0Var, 1048576L)) {
            w1Var.f14108a.P = q0Var.P;
        }
        if (G(q0Var, 268435456L)) {
            w1Var.f14108a.X = q0Var.X;
        }
        if (G(q0Var, 536870912L)) {
            w1Var.f14108a.f14058k0 = q0Var.f14058k0;
        }
        if (G(q0Var, 1073741824L)) {
            w1Var.f14108a.Y = q0Var.Y;
        }
        if (G(q0Var, 67108864L)) {
            w1Var.f14108a.V = q0Var.V;
        }
        if (G(q0Var, 134217728L)) {
            w1Var.f14108a.W = q0Var.W;
        }
        if (G(q0Var, 8589934592L)) {
            w1Var.f14108a.f14049b0 = q0Var.f14049b0;
        }
        if (G(q0Var, 17179869184L)) {
            w1Var.f14108a.f14050c0 = q0Var.f14050c0;
        }
        if (G(q0Var, 137438953472L)) {
            w1Var.f14108a.f14060m0 = q0Var.f14060m0;
        }
    }

    @Override
    public ij.b e(ii.p pVar) {
        if (((Set) this.f14133b).contains(pVar)) {
            return ((ii.c) this.f14137f).e(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public void e0(w1 w1Var, w0 w0Var) {
        boolean z10 = w0Var.f14130b == null;
        q0 q0Var = w1Var.f14108a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        q0Var.T = bool;
        if (!z10) {
            bool = Boolean.FALSE;
        }
        q0Var.O = bool;
        q0Var.P = null;
        q0Var.X = null;
        q0Var.J = fValueOf;
        q0Var.V = t.B;
        q0Var.W = fValueOf;
        q0Var.Y = null;
        q0Var.Z = null;
        q0Var.f14048a0 = fValueOf;
        q0Var.f14049b0 = null;
        q0Var.f14050c0 = fValueOf;
        q0Var.f14059l0 = 1;
        q0 q0Var2 = w0Var.f14105e;
        if (q0Var2 != null) {
            d0(w1Var, q0Var2);
        }
        ArrayList arrayList = ((db.g) ((p1) this.f14133b).C).B;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (l lVar : ((db.g) ((p1) this.f14133b).C).B) {
                if (c7.g.j(lVar.f14014a, w0Var)) {
                    d0(w1Var, lVar.f14015b);
                }
            }
        }
        q0 q0Var3 = w0Var.f14106f;
        if (q0Var3 != null) {
            d0(w1Var, q0Var3);
        }
    }

    @Override
    public Set f(ii.p pVar) {
        if (((Set) this.f14135d).contains(pVar)) {
            return ((ii.c) this.f14137f).f(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    public void f0() {
        int iP;
        q0 q0Var = ((w1) this.f14134c).f14108a;
        z0 z0Var = q0Var.f14049b0;
        if (z0Var instanceof t) {
            iP = ((t) z0Var).A;
        } else if (!(z0Var instanceof u)) {
            return;
        } else {
            iP = q0Var.K.A;
        }
        Float f3 = q0Var.f14050c0;
        if (f3 != null) {
            iP = p(f3.floatValue(), iP);
        }
        ((Canvas) this.f14132a).drawColor(iP);
    }

    @Override
    public Object g(ii.p pVar) {
        if (((Set) this.f14132a).contains(pVar)) {
            return ((ii.c) this.f14137f).g(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    public boolean g0() {
        Boolean bool = ((w1) this.f14134c).f14108a.U;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public Path i(v0 v0Var, h2.a aVar) {
        Path pathM;
        w0 w0VarE = v0Var.f14129a.E(((w1) this.f14134c).f14108a.X);
        if (w0VarE == null) {
            v("ClipPath reference '%s' not found", ((w1) this.f14134c).f14108a.X);
            return null;
        }
        s sVar = (s) w0VarE;
        ((Stack) this.f14135d).push((w1) this.f14134c);
        this.f14134c = B(sVar);
        Boolean bool = sVar.f14081o;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(aVar.f6540b, aVar.f6541c);
            matrix.preScale(aVar.f6542d, aVar.f6543e);
        }
        Matrix matrix2 = sVar.f14138n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (y0 y0Var : sVar.f14085i) {
            if ((y0Var instanceof v0) && (pathM = M((v0) y0Var, true)) != null) {
                path.op(pathM, Path.Op.UNION);
            }
        }
        if (((w1) this.f14134c).f14108a.X != null) {
            if (sVar.f14093h == null) {
                sVar.f14093h = j(path);
            }
            Path pathI = i(sVar, sVar.f14093h);
            if (pathI != null) {
                path.op(pathI, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f14134c = (w1) ((Stack) this.f14135d).pop();
        return path;
    }

    public float k(j1 j1Var) {
        x1 x1Var = new x1(this);
        u(j1Var, x1Var);
        return x1Var.f14123b;
    }

    public void m(v0 v0Var, h2.a aVar) {
        Path pathI;
        if (((w1) this.f14134c).f14108a.X == null || (pathI = i(v0Var, aVar)) == null) {
            return;
        }
        ((Canvas) this.f14132a).clipPath(pathI);
    }

    public void n(v0 v0Var) {
        z0 z0Var = ((w1) this.f14134c).f14108a.B;
        if (z0Var instanceof h0) {
            q(true, v0Var.f14093h, (h0) z0Var);
        }
        z0 z0Var2 = ((w1) this.f14134c).f14108a.D;
        if (z0Var2 instanceof h0) {
            q(false, v0Var.f14093h, (h0) z0Var2);
        }
    }

    public void q(boolean z10, h2.a aVar, h0 h0Var) {
        float fB;
        float f3;
        float fB2;
        float f10;
        float f11;
        float fB3;
        float f12;
        float fB4;
        float f13;
        int i10;
        w0 w0VarE = ((p1) this.f14133b).E(h0Var.A);
        if (w0VarE == null) {
            v("%s reference '%s' not found", z10 ? "Fill" : "Stroke", h0Var.A);
            z0 z0Var = h0Var.B;
            if (z0Var != null) {
                X((w1) this.f14134c, z10, z0Var);
                return;
            } else if (z10) {
                ((w1) this.f14134c).f14109b = false;
                return;
            } else {
                ((w1) this.f14134c).f14110c = false;
                return;
            }
        }
        boolean z11 = w0VarE instanceof x0;
        t tVar = t.B;
        if (z11) {
            x0 x0Var = (x0) w0VarE;
            String str = x0Var.l;
            if (str != null) {
                y(x0Var, str);
            }
            Boolean bool = x0Var.f14117i;
            boolean z12 = bool != null && bool.booleanValue();
            w1 w1Var = (w1) this.f14134c;
            Paint paint = z10 ? w1Var.f14111d : w1Var.f14112e;
            if (z12) {
                w1 w1Var2 = (w1) this.f14134c;
                f10 = 256.0f;
                h2.a aVar2 = w1Var2.f14114g;
                if (aVar2 == null) {
                    aVar2 = w1Var2.f14113f;
                }
                c0 c0Var = x0Var.m;
                float fD = c0Var != null ? c0Var.d(this) : 0.0f;
                c0 c0Var2 = x0Var.f14120n;
                fB3 = c0Var2 != null ? c0Var2.e(this) : 0.0f;
                f11 = 0.0f;
                c0 c0Var3 = x0Var.f14121o;
                float fD2 = c0Var3 != null ? c0Var3.d(this) : aVar2.f6542d;
                c0 c0Var4 = x0Var.f14122p;
                f13 = fD2;
                fB4 = c0Var4 != null ? c0Var4.e(this) : 0.0f;
                f12 = fD;
            } else {
                f10 = 256.0f;
                f11 = 0.0f;
                c0 c0Var5 = x0Var.m;
                float fB5 = c0Var5 != null ? c0Var5.b(this, 1.0f) : 0.0f;
                c0 c0Var6 = x0Var.f14120n;
                fB3 = c0Var6 != null ? c0Var6.b(this, 1.0f) : 0.0f;
                c0 c0Var7 = x0Var.f14121o;
                float fB6 = c0Var7 != null ? c0Var7.b(this, 1.0f) : 1.0f;
                c0 c0Var8 = x0Var.f14122p;
                f12 = fB5;
                fB4 = c0Var8 != null ? c0Var8.b(this, 1.0f) : 0.0f;
                f13 = fB6;
            }
            float f14 = fB3;
            a0();
            this.f14134c = B(x0Var);
            Matrix matrix = new Matrix();
            if (!z12) {
                matrix.preTranslate(aVar.f6540b, aVar.f6541c);
                matrix.preScale(aVar.f6542d, aVar.f6543e);
            }
            Matrix matrix2 = x0Var.f14118j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = x0Var.f14116h.size();
            if (size == 0) {
                Z();
                if (z10) {
                    ((w1) this.f14134c).f14109b = false;
                    return;
                } else {
                    ((w1) this.f14134c).f14110c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = x0Var.f14116h.iterator();
            int i11 = 0;
            float f15 = -1.0f;
            while (it.hasNext()) {
                p0 p0Var = (p0) ((y0) it.next());
                Float f16 = p0Var.f14043h;
                float fFloatValue = f16 != null ? f16.floatValue() : f11;
                if (i11 == 0 || fFloatValue >= f15) {
                    fArr[i11] = fFloatValue;
                    f15 = fFloatValue;
                } else {
                    fArr[i11] = f15;
                }
                a0();
                e0((w1) this.f14134c, p0Var);
                q0 q0Var = ((w1) this.f14134c).f14108a;
                t tVar2 = (t) q0Var.V;
                if (tVar2 == null) {
                    tVar2 = tVar;
                }
                iArr[i11] = p(q0Var.W.floatValue(), tVar2.A);
                i11++;
                Z();
            }
            if ((f12 == f13 && f14 == fB4) || size == 1) {
                Z();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i12 = x0Var.f14119k;
            if (i12 != 0) {
                if (i12 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i12 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            Z();
            LinearGradient linearGradient = new LinearGradient(f12, f14, f13, fB4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((w1) this.f14134c).f14108a.C.floatValue() * f10);
            if (iFloatValue < 0) {
                i10 = 0;
            } else {
                i10 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i10);
            return;
        }
        if (!(w0VarE instanceof b1)) {
            if (w0VarE instanceof o0) {
                o0 o0Var = (o0) w0VarE;
                if (z10) {
                    if (G(o0Var.f14105e, 2147483648L)) {
                        w1 w1Var3 = (w1) this.f14134c;
                        q0 q0Var2 = w1Var3.f14108a;
                        z0 z0Var2 = o0Var.f14105e.Z;
                        q0Var2.B = z0Var2;
                        w1Var3.f14109b = z0Var2 != null;
                    }
                    if (G(o0Var.f14105e, 4294967296L)) {
                        ((w1) this.f14134c).f14108a.C = o0Var.f14105e.f14048a0;
                    }
                    if (G(o0Var.f14105e, 6442450944L)) {
                        w1 w1Var4 = (w1) this.f14134c;
                        X(w1Var4, z10, w1Var4.f14108a.B);
                        return;
                    }
                    return;
                }
                if (G(o0Var.f14105e, 2147483648L)) {
                    w1 w1Var5 = (w1) this.f14134c;
                    q0 q0Var3 = w1Var5.f14108a;
                    z0 z0Var3 = o0Var.f14105e.Z;
                    q0Var3.D = z0Var3;
                    w1Var5.f14110c = z0Var3 != null;
                }
                if (G(o0Var.f14105e, 4294967296L)) {
                    ((w1) this.f14134c).f14108a.E = o0Var.f14105e.f14048a0;
                }
                if (G(o0Var.f14105e, 6442450944L)) {
                    w1 w1Var6 = (w1) this.f14134c;
                    X(w1Var6, z10, w1Var6.f14108a.D);
                    return;
                }
                return;
            }
            return;
        }
        b1 b1Var = (b1) w0VarE;
        String str2 = b1Var.l;
        if (str2 != null) {
            y(b1Var, str2);
        }
        Boolean bool2 = b1Var.f14117i;
        boolean z13 = bool2 != null && bool2.booleanValue();
        w1 w1Var7 = (w1) this.f14134c;
        Paint paint2 = z10 ? w1Var7.f14111d : w1Var7.f14112e;
        if (z13) {
            c0 c0Var9 = new c0(50.0f, 9);
            c0 c0Var10 = b1Var.m;
            float fD3 = c0Var10 != null ? c0Var10.d(this) : c0Var9.d(this);
            c0 c0Var11 = b1Var.f13957n;
            fB = c0Var11 != null ? c0Var11.e(this) : c0Var9.e(this);
            c0 c0Var12 = b1Var.f13958o;
            fB2 = c0Var12 != null ? c0Var12.a(this) : c0Var9.a(this);
            f3 = fD3;
        } else {
            c0 c0Var13 = b1Var.m;
            float fB7 = c0Var13 != null ? c0Var13.b(this, 1.0f) : 0.5f;
            c0 c0Var14 = b1Var.f13957n;
            fB = c0Var14 != null ? c0Var14.b(this, 1.0f) : 0.5f;
            c0 c0Var15 = b1Var.f13958o;
            f3 = fB7;
            fB2 = c0Var15 != null ? c0Var15.b(this, 1.0f) : 0.5f;
        }
        float f17 = fB;
        a0();
        this.f14134c = B(b1Var);
        Matrix matrix3 = new Matrix();
        if (!z13) {
            matrix3.preTranslate(aVar.f6540b, aVar.f6541c);
            matrix3.preScale(aVar.f6542d, aVar.f6543e);
        }
        Matrix matrix4 = b1Var.f14118j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = b1Var.f14116h.size();
        if (size2 == 0) {
            Z();
            if (z10) {
                ((w1) this.f14134c).f14109b = false;
                return;
            } else {
                ((w1) this.f14134c).f14110c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = b1Var.f14116h.iterator();
        int i13 = 0;
        float f18 = -1.0f;
        while (it2.hasNext()) {
            p0 p0Var2 = (p0) ((y0) it2.next());
            Float f19 = p0Var2.f14043h;
            float fFloatValue2 = f19 != null ? f19.floatValue() : 0.0f;
            if (i13 == 0 || fFloatValue2 >= f18) {
                fArr2[i13] = fFloatValue2;
                f18 = fFloatValue2;
            } else {
                fArr2[i13] = f18;
            }
            a0();
            e0((w1) this.f14134c, p0Var2);
            q0 q0Var4 = ((w1) this.f14134c).f14108a;
            t tVar3 = (t) q0Var4.V;
            if (tVar3 == null) {
                tVar3 = tVar;
            }
            iArr2[i13] = p(q0Var4.W.floatValue(), tVar3.A);
            i13++;
            Z();
        }
        if (fB2 == 0.0f || size2 == 1) {
            Z();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i14 = b1Var.f14119k;
        if (i14 != 0) {
            if (i14 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i14 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        Z();
        RadialGradient radialGradient = new RadialGradient(f3, f17, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((w1) this.f14134c).f14108a.C.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public boolean r() {
        Boolean bool = ((w1) this.f14134c).f14108a.T;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void s(v0 v0Var, Path path) {
        float fD;
        float fE;
        float fE2;
        float fD2;
        boolean z10;
        boolean z11;
        Canvas canvas = (Canvas) this.f14132a;
        z0 z0Var = ((w1) this.f14134c).f14108a.B;
        if (z0Var instanceof h0) {
            w0 w0VarE = ((p1) this.f14133b).E(((h0) z0Var).A);
            if (w0VarE instanceof k0) {
                k0 k0Var = (k0) w0VarE;
                Boolean bool = k0Var.f14003p;
                boolean z12 = bool != null && bool.booleanValue();
                String str = k0Var.f14010w;
                if (str != null) {
                    A(k0Var, str);
                }
                if (z12) {
                    c0 c0Var = k0Var.f14006s;
                    fD = c0Var != null ? c0Var.d(this) : 0.0f;
                    c0 c0Var2 = k0Var.f14007t;
                    fE2 = c0Var2 != null ? c0Var2.e(this) : 0.0f;
                    c0 c0Var3 = k0Var.f14008u;
                    fD2 = c0Var3 != null ? c0Var3.d(this) : 0.0f;
                    c0 c0Var4 = k0Var.f14009v;
                    fE = c0Var4 != null ? c0Var4.e(this) : 0.0f;
                } else {
                    c0 c0Var5 = k0Var.f14006s;
                    float fB = c0Var5 != null ? c0Var5.b(this, 1.0f) : 0.0f;
                    c0 c0Var6 = k0Var.f14007t;
                    float fB2 = c0Var6 != null ? c0Var6.b(this, 1.0f) : 0.0f;
                    c0 c0Var7 = k0Var.f14008u;
                    float fB3 = c0Var7 != null ? c0Var7.b(this, 1.0f) : 0.0f;
                    c0 c0Var8 = k0Var.f14009v;
                    float fB4 = c0Var8 != null ? c0Var8.b(this, 1.0f) : 0.0f;
                    h2.a aVar = v0Var.f14093h;
                    float f3 = aVar.f6540b;
                    float f10 = aVar.f6542d;
                    fD = (fB * f10) + f3;
                    float f11 = aVar.f6541c;
                    float f12 = aVar.f6543e;
                    float f13 = fB3 * f10;
                    fE = fB4 * f12;
                    fE2 = (fB2 * f12) + f11;
                    fD2 = f13;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                q qVar = k0Var.f13946n;
                if (qVar == null) {
                    qVar = q.f14045d;
                }
                a0();
                canvas.clipPath(path);
                w1 w1Var = new w1();
                d0(w1Var, q0.a());
                w1Var.f14108a.O = Boolean.FALSE;
                C(k0Var, w1Var);
                this.f14134c = w1Var;
                h2.a aVar2 = v0Var.f14093h;
                Matrix matrix = k0Var.f14005r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (k0Var.f14005r.invert(matrix2)) {
                        h2.a aVar3 = v0Var.f14093h;
                        float f14 = aVar3.f6540b;
                        float f15 = aVar3.f6541c;
                        float fC = aVar3.c();
                        z10 = true;
                        h2.a aVar4 = v0Var.f14093h;
                        z11 = false;
                        float f16 = aVar4.f6541c;
                        float fC2 = aVar4.c();
                        float fD3 = v0Var.f14093h.d();
                        h2.a aVar5 = v0Var.f14093h;
                        float[] fArr = {f14, f15, fC, f16, fC2, fD3, aVar5.f6540b, aVar5.d()};
                        matrix2.mapPoints(fArr);
                        float f17 = fArr[0];
                        float f18 = fArr[1];
                        RectF rectF = new RectF(f17, f18, f17, f18);
                        for (int i10 = 2; i10 <= 6; i10 += 2) {
                            float f19 = fArr[i10];
                            if (f19 < rectF.left) {
                                rectF.left = f19;
                            }
                            if (f19 > rectF.right) {
                                rectF.right = f19;
                            }
                            float f20 = fArr[i10 + 1];
                            if (f20 < rectF.top) {
                                rectF.top = f20;
                            }
                            if (f20 > rectF.bottom) {
                                rectF.bottom = f20;
                            }
                        }
                        float f21 = rectF.left;
                        float f22 = rectF.top;
                        aVar2 = new h2.a(f21, f22, rectF.right - f21, rectF.bottom - f22);
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                } else {
                    z10 = true;
                    z11 = false;
                }
                float fFloor = (((float) Math.floor((aVar2.f6540b - fD) / fD2)) * fD2) + fD;
                float fC3 = aVar2.c();
                float fD4 = aVar2.d();
                h2.a aVar6 = new h2.a(0.0f, 0.0f, fD2, fE);
                boolean zO = O();
                for (float fFloor2 = (((float) Math.floor((aVar2.f6541c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f23 = fFloor;
                    while (f23 < fC3) {
                        aVar6.f6540b = f23;
                        aVar6.f6541c = fFloor2;
                        a0();
                        if (!((w1) this.f14134c).f14108a.O.booleanValue()) {
                            V(aVar6.f6540b, aVar6.f6541c, aVar6.f6542d, aVar6.f6543e);
                        }
                        h2.a aVar7 = k0Var.f13962o;
                        if (aVar7 != null) {
                            canvas.concat(l(aVar6, aVar7, qVar));
                        } else {
                            Boolean bool2 = k0Var.f14004q;
                            boolean z13 = (bool2 == null || bool2.booleanValue()) ? z10 : z11;
                            canvas.translate(f23, fFloor2);
                            if (!z13) {
                                h2.a aVar8 = v0Var.f14093h;
                                canvas.scale(aVar8.f6542d, aVar8.f6543e);
                            }
                        }
                        Iterator it = k0Var.f14085i.iterator();
                        while (it.hasNext()) {
                            Q((y0) it.next());
                        }
                        Z();
                        f23 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zO) {
                    N(k0Var.f14093h);
                }
                Z();
                return;
            }
        }
        canvas.drawPath(path, ((w1) this.f14134c).f14111d);
    }

    public void t(Path path) {
        Canvas canvas = (Canvas) this.f14132a;
        w1 w1Var = (w1) this.f14134c;
        if (w1Var.f14108a.f14059l0 != 2) {
            canvas.drawPath(path, w1Var.f14112e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((w1) this.f14134c).f14112e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((w1) this.f14134c).f14112e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void u(j1 j1Var, p30.f fVar) {
        float f3;
        float fE;
        float fD;
        int iD;
        if (r()) {
            Iterator it = j1Var.f14085i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                if (y0Var instanceof m1) {
                    fVar.l0(b0(((m1) y0Var).f14024c, z10, !it.hasNext()));
                } else if (fVar.b0((j1) y0Var)) {
                    float fE2 = 0.0f;
                    if (y0Var instanceof k1) {
                        a0();
                        k1 k1Var = (k1) y0Var;
                        e0((w1) this.f14134c, k1Var);
                        if (r() && g0()) {
                            w0 w0VarE = k1Var.f14129a.E(k1Var.f14011n);
                            if (w0VarE == null) {
                                v("TextPath reference '%s' not found", k1Var.f14011n);
                            } else {
                                i0 i0Var = (i0) w0VarE;
                                s1 s1Var = new s1(i0Var.f13999o);
                                Matrix matrix = i0Var.f14128n;
                                Path path = s1Var.f14082a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                c0 c0Var = k1Var.f14012o;
                                fE2 = c0Var != null ? c0Var.b(this, pathMeasure.getLength()) : 0.0f;
                                int iD2 = D();
                                if (iD2 != 1) {
                                    float fK = k(k1Var);
                                    if (iD2 == 2) {
                                        fK /= 2.0f;
                                    }
                                    fE2 -= fK;
                                }
                                n(k1Var.f14013p);
                                boolean zO = O();
                                u(k1Var, new t1(this, path, fE2));
                                if (zO) {
                                    N(k1Var.f14093h);
                                }
                            }
                        }
                        Z();
                    } else if (y0Var instanceof g1) {
                        a0();
                        g1 g1Var = (g1) y0Var;
                        e0((w1) this.f14134c, g1Var);
                        if (r()) {
                            ArrayList arrayList = g1Var.f14018n;
                            boolean z11 = arrayList != null && arrayList.size() > 0;
                            boolean z12 = fVar instanceof u1;
                            if (z12) {
                                float fD2 = !z11 ? ((u1) fVar).f14090b : ((c0) g1Var.f14018n.get(0)).d(this);
                                ArrayList arrayList2 = g1Var.f14019o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((u1) fVar).f14091c : ((c0) g1Var.f14019o.get(0)).e(this);
                                ArrayList arrayList3 = g1Var.f14020p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) g1Var.f14020p.get(0)).d(this);
                                ArrayList arrayList4 = g1Var.f14021q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((c0) g1Var.f14021q.get(0)).e(this);
                                }
                                float f10 = fD2;
                                f3 = fE2;
                                fE2 = f10;
                            } else {
                                f3 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z11 && (iD = D()) != 1) {
                                float fK2 = k(g1Var);
                                if (iD == 2) {
                                    fK2 /= 2.0f;
                                }
                                fE2 -= fK2;
                            }
                            n(g1Var.f13986r);
                            if (z12) {
                                u1 u1Var = (u1) fVar;
                                u1Var.f14090b = fE2 + fD;
                                u1Var.f14091c = fE + f3;
                            }
                            boolean zO2 = O();
                            u(g1Var, fVar);
                            if (zO2) {
                                N(g1Var.f14093h);
                            }
                        }
                        Z();
                    } else if (y0Var instanceof f1) {
                        a0();
                        f1 f1Var = (f1) y0Var;
                        e0((w1) this.f14134c, f1Var);
                        if (r()) {
                            n(f1Var.f13984o);
                            w0 w0VarE2 = y0Var.f14129a.E(f1Var.f13983n);
                            if (w0VarE2 == null || !(w0VarE2 instanceof j1)) {
                                v("Tref reference '%s' not found", f1Var.f13983n);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                w((j1) w0VarE2, sb2);
                                if (sb2.length() > 0) {
                                    fVar.l0(sb2.toString());
                                }
                            }
                        }
                        Z();
                    }
                }
                z10 = false;
            }
        }
    }

    public void w(j1 j1Var, StringBuilder sb2) {
        Iterator it = j1Var.f14085i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var instanceof j1) {
                w((j1) y0Var, sb2);
            } else if (y0Var instanceof m1) {
                sb2.append(b0(((m1) y0Var).f14024c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public Task x(Task task) {
        return task.h(new f5.d(0), new b3(this, 29));
    }
}
