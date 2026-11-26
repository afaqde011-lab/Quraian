package q4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import ca.u;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.internal.play_billing.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kh.o;
import o9.q;
import oi.p;
import p4.f;
import qd.h0;
import s10.w0;
import u.s;
import u.s0;
import v4.g;

public abstract class d {

    public static final e f12761a;

    public static final s f12762b;

    public static Paint f12763c;

    static {
        o.n("TypefaceCompat static init");
        f12761a = new e();
        f12762b = new s(16);
        f12763c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, g[] gVarArr, int i10) {
        o.n("TypefaceCompat.createFromFontInfo");
        try {
            e eVar = f12761a;
            eVar.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyQ = eVar.Q(gVarArr, context.getContentResolver());
                if (fontFamilyQ != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(e.P(fontFamilyQ, i10).getStyle()).build();
                }
            } catch (Exception e3) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            }
            Trace.endSection();
            return typefaceBuild;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static Typeface b(Context context, p4.c cVar, Resources resources, int i10, String str, int i11, int i12, p4.a aVar, boolean z10) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i13 = 3;
        int i14 = -3;
        Typeface typefaceBuild2 = null;
        Object[] objArr = 0;
        if (cVar instanceof f) {
            f fVar = (f) cVar;
            String str2 = fVar.f12329d;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = e(str2)) == null) {
                ArrayList arrayList = fVar.f12326a;
                if (arrayList.size() != 1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            int i16 = 0;
                            Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                            while (true) {
                                if (i16 < arrayList.size()) {
                                    v4.c cVar2 = (v4.c) arrayList.get(i16);
                                    if (i16 == arrayList.size() - 1 && TextUtils.isEmpty(cVar2.f15439f)) {
                                        customFallbackBuilder.setSystemFallback(cVar2.f15438e);
                                    } else {
                                        String str3 = cVar2.f15438e;
                                        String str4 = cVar2.f15439f;
                                        Font fontF = f(e(str3));
                                        if (fontF == null) {
                                            Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar2.f15438e + ". Falling back to provider font.");
                                        } else {
                                            if (TextUtils.isEmpty(str4)) {
                                                fontFamilyBuild = new FontFamily.Builder(fontF).build();
                                            } else {
                                                try {
                                                    fontFamilyBuild = new FontFamily.Builder(new Font.Builder(fontF).setFontVariationSettings(str4).build()).build();
                                                } catch (IOException unused) {
                                                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                }
                                            }
                                            if (customFallbackBuilder == null) {
                                                customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                            } else {
                                                customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                            }
                                            i16++;
                                        }
                                    }
                                }
                                typefaceBuild = customFallbackBuilder.build();
                                break;
                            }
                        }
                        if (e(((v4.c) arrayList.get(i15)).f15438e) != null) {
                            i15++;
                        }
                        typefaceBuild = null;
                        break;
                    }
                }
                typefaceBuild = e(((v4.c) arrayList.get(0)).f15438e);
            }
            if (typefaceBuild != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new p(aVar, typefaceBuild, i13));
                }
                f12762b.d(d(resources, i10, str, i11, i12), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr2 = !z10 ? aVar != null : fVar.f12328c != 0;
            int i17 = z10 ? fVar.f12327b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            q qVar = new q(9, (boolean) (objArr == true ? 1 : 0));
            qVar.B = aVar;
            ArrayList arrayList2 = fVar.f12326a;
            int i18 = 2;
            b0 b0Var = new b0(handler, 2);
            w0 w0Var = new w0(qVar, b0Var, 10);
            int i19 = 23;
            if (objArr2 != true) {
                String strA = v4.f.a(i12, arrayList2);
                Typeface typeface = (Typeface) v4.f.f15448a.c(strA);
                if (typeface != null) {
                    b0Var.execute(new r0(qVar, typeface, i19));
                    typefaceBuild2 = typeface;
                } else {
                    h0 h0Var = new h0(w0Var, i18);
                    synchronized (v4.f.f15450c) {
                        try {
                            s0 s0Var = v4.f.f15451d;
                            ArrayList arrayList3 = (ArrayList) s0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(h0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(h0Var);
                                s0Var.put(strA, arrayList4);
                                v4.d dVar = new v4.d(strA, context, arrayList2, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = v4.f.f15449b;
                                h0 h0Var2 = new h0(strA, i13);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                u uVar = new u();
                                uVar.B = dVar;
                                uVar.C = h0Var2;
                                uVar.D = handler2;
                                threadPoolExecutor.execute(uVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                v4.c cVar3 = (v4.c) arrayList2.get(0);
                s sVar = v4.f.f15448a;
                String strA2 = v4.f.a(i12, List.of(cVar3));
                Typeface typeface2 = (Typeface) v4.f.f15448a.c(strA2);
                if (typeface2 != null) {
                    b0Var.execute(new r0(qVar, typeface2, i19));
                    typefaceBuild2 = typeface2;
                } else if (i17 == -1) {
                    v4.e eVarB = v4.f.b(strA2, context, List.of(cVar3), i12);
                    w0Var.p(eVarB);
                    typefaceBuild2 = eVarB.f15446a;
                } else {
                    try {
                        try {
                            try {
                                v4.e eVar = (v4.e) v4.f.f15449b.submit(new v4.d(strA2, context, cVar3, i12, 0)).get(i17, TimeUnit.MILLISECONDS);
                                w0Var.p(eVar);
                                typefaceBuild2 = eVar.f15446a;
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((b0) w0Var.C).execute(new y((q) w0Var.B, i14, i18));
                    }
                }
            }
        } else {
            p4.d dVar2 = (p4.d) cVar;
            f12761a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (p4.e eVar2 : dVar2.f12320a) {
                    try {
                        try {
                            try {
                                Font fontBuild = new Font.Builder(resources, eVar2.f12325e).setWeight(eVar2.f12321a).setSlant(eVar2.f12322b ? 1 : 0).setTtcIndex(eVar2.f12324d).setFontVariationSettings(eVar2.f12323c).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                            } catch (IOException unused4) {
                            }
                        } catch (Exception e11) {
                            e = e11;
                            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                            if (aVar != null) {
                                if (typefaceBuild2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new p(aVar, typefaceBuild2, i13));
                                } else {
                                    aVar.a(-3);
                                }
                            }
                            if (typefaceBuild2 != null) {
                                f12762b.d(d(resources, i10, str, i11, i12), typefaceBuild2);
                            }
                            return typefaceBuild2;
                        }
                    } catch (IOException unused5) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(e.P(fontFamilyBuild2, i12).getStyle()).build();
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (aVar != null) {
                if (typefaceBuild2 != null) {
                    new Handler(Looper.getMainLooper()).post(new p(aVar, typefaceBuild2, i13));
                } else {
                    aVar.a(-3);
                }
            }
        }
        if (typefaceBuild2 != null) {
            f12762b.d(d(resources, i10, str, i11, i12), typefaceBuild2);
        }
        return typefaceBuild2;
    }

    public static Typeface c(Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceBuild;
        f12761a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f12762b.d(d(resources, i10, str, i11, i12), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font f(Typeface typeface) {
        if (f12763c == null) {
            f12763c = new Paint();
        }
        f12763c.setTextSize(10.0f);
        f12763c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f12763c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
