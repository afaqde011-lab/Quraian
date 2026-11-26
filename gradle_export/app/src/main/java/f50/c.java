package f50;

import a10.p;
import a10.w;
import ab.a0;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import b2.r;
import b3.j0;
import b3.l1;
import c3.o0;
import c3.o1;
import c3.s0;
import c3.t2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.Constants;
import ct.i0;
import d10.i2;
import d10.u1;
import e30.a1;
import f50.c;
import g1.z6;
import g20.n;
import gz.z0;
import h0.z1;
import h00.v;
import h00.x;
import i2.b0;
import i2.t;
import i2.t0;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh.o;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.r1;
import m3.h0;
import m3.n0;
import m3.q;
import m3.r0;
import q3.u;
import x.y;
import z2.w0;

public abstract class c {
    public static d1.b A(d1.b bVar, y3.m mVar, r0 r0Var, y3.c cVar, q3.h hVar) {
        if (bVar != null && mVar == bVar.a && h0.j(r0Var, mVar).equals(bVar.b) && cVar.c() == bVar.c.A && hVar == bVar.d) {
            return bVar;
        }
        d1.b bVar2 = d1.b.h;
        if (bVar2 != null && mVar == bVar2.a && h0.j(r0Var, mVar).equals(bVar2.b) && cVar.c() == bVar2.c.A && hVar == bVar2.d) {
            return bVar2;
        }
        d1.b bVar3 = new d1.b(mVar, h0.j(r0Var, mVar), new y3.d(cVar.c(), cVar.t0()), hVar);
        d1.b.h = bVar3;
        return bVar3;
    }

    public static int B(Context context) {
        return q4.a.c(-1, H(context, 2130968923)) >= 3.0d ? -1 : -570425344;
    }

    public static float C(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable D(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableF0 = p30.f.f0(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        if (O(context)) {
            drawableF0.setTint(context.getColor(2131100616));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableF0;
    }

    public static int E(Context context) {
        if (O(context)) {
            return B(context) == -570425344 ? 2131952419 : 2131952420;
        }
        return B(context) == -570425344 ? 2131952421 : 2131952418;
    }

    public static final long F(n0 n0Var, int i, boolean z, boolean z2) {
        q qVar = n0Var.b;
        long j = n0Var.c;
        int iD = qVar.d(i);
        if (iD >= qVar.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(a0.x(n0Var.e(i, n0Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == n0Var.i(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(a0.x(qVar.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final String G(String str) {
        Object objValueOf;
        kotlin.jvm.internal.m.e(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (Character.isUpperCase(cCharAt)) {
                if (i2 == 0) {
                    objValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    objValueOf = "_" + Character.toLowerCase(cCharAt);
                }
            } else if (!Character.isDigit(cCharAt)) {
                objValueOf = String.valueOf(cCharAt);
            } else if (i2 <= 0 || !Character.isLetter(str.charAt(i2 - 1))) {
                objValueOf = String.valueOf(cCharAt);
            } else {
                objValueOf = "_" + cCharAt;
            }
            arrayList.add(objValueOf);
            i++;
            i2 = i3;
        }
        return h00.q.R0(arrayList, "", null, null, null, 62);
    }

    public static int H(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int I(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Bitmap J(Context context, float f, int i, float f2, float f3, float f4, float f5) {
        int iC0 = c0(f, context);
        Bitmap bitmapS = s(iC0);
        Canvas canvas = new Canvas(bitmapS);
        Drawable drawableF0 = p30.f.f0(context, i);
        if (drawableF0 == null) {
            return bitmapS;
        }
        int iF = w00.a.F(f2);
        int i2 = iC0 - iF;
        drawableF0.setBounds(iF, iF, i2, i2);
        drawableF0.setAlpha(w00.a.F(f5 * 255.0f));
        if (f3 > 0.0f && f4 > 0.0f) {
            Bitmap bitmapS2 = s(iC0);
            drawableF0.draw(new Canvas(bitmapS2));
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setAlpha(w00.a.F(f4 * 255.0f));
            paint.setMaskFilter(new BlurMaskFilter(f3 * context.getResources().getDisplayMetrics().density, BlurMaskFilter.Blur.NORMAL));
            int[] iArr = new int[2];
            Bitmap bitmapExtractAlpha = bitmapS2.extractAlpha(paint, iArr);
            kotlin.jvm.internal.m.d(bitmapExtractAlpha, "extractAlpha(...)");
            canvas.drawBitmap(bitmapExtractAlpha, iArr[0], iArr[1], paint);
        }
        drawableF0.draw(canvas);
        return bitmapS;
    }

    public static int K(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(g4.c.f(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final long L(long j) {
        if (j < 0) {
            s30.a aVar = s30.b.B;
            return s30.b.D;
        }
        s30.a aVar2 = s30.b.B;
        return s30.b.C;
    }

    public static final boolean M(a10.c cVar) {
        e10.g gVarA;
        e10.g gVarE;
        if (cVar instanceof a10.m) {
            w wVar = (w) cVar;
            Field fieldE = k00.f.E(wVar);
            if (!(fieldE != null ? fieldE.isAccessible() : true)) {
                return false;
            }
            Method methodF = k00.f.F(wVar.b());
            if (!(methodF != null ? methodF.isAccessible() : true)) {
                return false;
            }
            Method methodF2 = k00.f.F(((a10.m) cVar).c());
            if (!(methodF2 != null ? methodF2.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof w) {
            w wVar2 = (w) cVar;
            Field fieldE2 = k00.f.E(wVar2);
            if (!(fieldE2 != null ? fieldE2.isAccessible() : true)) {
                return false;
            }
            Method methodF3 = k00.f.F(wVar2.b());
            if (!(methodF3 != null ? methodF3.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof p) {
            Field fieldE3 = k00.f.E(((p) cVar).g());
            if (!(fieldE3 != null ? fieldE3.isAccessible() : true)) {
                return false;
            }
            Method methodF4 = k00.f.F((a10.g) cVar);
            if (!(methodF4 != null ? methodF4.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof a10.h) {
            Field fieldE4 = k00.f.E(((a10.h) cVar).g());
            if (!(fieldE4 != null ? fieldE4.isAccessible() : true)) {
                return false;
            }
            Method methodF5 = k00.f.F((a10.g) cVar);
            if (!(methodF5 != null ? methodF5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof a10.g)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            a10.g gVar = (a10.g) cVar;
            Method methodF6 = k00.f.F(gVar);
            if (!(methodF6 != null ? methodF6.isAccessible() : true)) {
                return false;
            }
            u1 u1VarA = i2.a(cVar);
            Object objB = (u1VarA == null || (gVarE = u1VarA.e()) == null) ? null : gVarE.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            u1 u1VarA2 = i2.a(gVar);
            Member memberB = (u1VarA2 == null || (gVarA = u1VarA2.a()) == null) ? null : gVarA.b();
            Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static boolean N() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean O(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(2130969297, typedValue, true) && typedValue.data != 0;
    }

    public static Typeface P(Configuration configuration, Typeface typeface) {
        int i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, rd.a.k(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static Bitmap Q(Context context, float f, String str) {
        kotlin.jvm.internal.m.e(context, "context");
        int iC0 = c0(f, context);
        Bitmap bitmapS = s(iC0);
        Canvas canvas = new Canvas(bitmapS);
        float f2 = iC0;
        float f3 = f2 / 2.0f;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(w00.a.F(35.7f));
        canvas.drawCircle(f3, f3, f3, paint);
        if (str.length() > 0) {
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            paint2.setAlpha(w00.a.F(204.0f));
            paint2.setTextSize(f2 * 0.42f);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTypeface(Typeface.create("sans-serif-medium", 0));
            canvas.drawText(str, f3, f3 - ((paint2.ascent() + paint2.descent()) / 2.0f), paint2);
        }
        return bitmapS;
    }

    public static void R(n nVar, Annotation annotation) throws InvocationTargetException {
        Class clsD = k00.f.D(k00.f.z(annotation));
        g20.l lVarE = nVar.e(p10.d.a(clsD), new o10.a(annotation));
        if (lVarE != null) {
            S(lVarE, annotation, clsD);
        }
    }

    public static void S(g20.l lVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                kotlin.jvm.internal.m.b(objInvoke);
                n20.e eVarE = n20.e.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    lVar.j(eVarE, o((Class) objInvoke));
                } else if (o10.d.a.contains(enclosingClass)) {
                    lVar.k(eVarE, objInvoke);
                } else {
                    List list = p10.d.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        kotlin.jvm.internal.m.b(enclosingClass);
                        lVar.n(eVarE, p10.d.a(enclosingClass), n20.e.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        kotlin.jvm.internal.m.d(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) h00.n.R0(interfaces);
                        kotlin.jvm.internal.m.b(cls2);
                        g20.l lVarH = lVar.h(p10.d.a(cls2), eVarE);
                        if (lVarH != null) {
                            S(lVarH, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        g20.m mVarF = lVar.f(eVarE);
                        if (mVarF != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                n20.b bVarA = p10.d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    mVarF.l(bVarA, n20.e.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    mVarF.d(o((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    g20.l lVarI = mVarF.i(p10.d.a(componentType));
                                    if (lVarI != null) {
                                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        S(lVarI, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    mVarF.c(obj4);
                                }
                            }
                            mVarF.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.a();
    }

    public static pl.p T(pl.q qVar, float f) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        h2.c cVar = qVar.a;
        float f2 = cVar.d;
        float f3 = cVar.c;
        float f4 = cVar.b;
        float f5 = cVar.a;
        if (qVar.b) {
            float fMin = Math.min(f3 - f5, f2 - f4) / 2.0f;
            long jC = cVar.c();
            x00.c cVar2 = x00.d.A;
            float f6 = cVar2.f() * 6.2831855f;
            float fSqrt = ((float) Math.sqrt(cVar2.f())) * fMin;
            double d = f6;
            float fCos = (((float) Math.cos(d)) * fSqrt) + Float.intBitsToFloat((int) (jC >> 32));
            float fSin = (((float) Math.sin(d)) * fSqrt) + Float.intBitsToFloat((int) (jC & 4294967295L));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fCos);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fSin);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            x00.c cVar3 = x00.d.A;
            float fB = w.c.b(f3, f5, cVar3.f(), f5);
            float fB2 = w.c.b(f2, f4, cVar3.f(), f4);
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fB)) << 32;
            jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fB2)) & 4294967295L;
        }
        long j = jFloatToRawIntBits | jFloatToRawIntBits2;
        x00.c cVar4 = x00.d.A;
        float f7 = (cVar4.f() * 60.0f) + 30.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f8 = (cVar4.f() - 0.5f) * 0.8f * f;
        float f9 = (cVar4.f() - 0.5f) * 0.8f * f;
        int iC = x00.d.B.c();
        float f11 = ((cVar4.f() * 1.2f) + 0.4f) * f;
        float f12 = cVar4.f() * f7;
        pl.p pVar = new pl.p();
        pVar.a = fIntBitsToFloat;
        pVar.b = fIntBitsToFloat2;
        pVar.c = f8;
        pVar.d = f9;
        pVar.e = iC;
        pVar.f = f11;
        pVar.g = f12;
        pVar.h = f7;
        return pVar;
    }

    public static final long U(long j, long j2, s30.d dVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return g4.c0(j3, dVar);
        }
        s30.d dVar2 = s30.d.MILLISECONDS;
        if (dVar.compareTo(dVar2) >= 0) {
            return s30.b.k(L(j3));
        }
        long jO = b5.o(1L, dVar2, dVar);
        long j4 = (j / jO) - (j2 / jO);
        long j5 = (j % jO) - (j2 % jO);
        s30.a aVar = s30.b.B;
        return s30.b.h(g4.c0(j4, dVar2), g4.c0(j5, dVar));
    }

    public static final float V(float f, float f2, float f3, float f4) {
        return a0.C(new y3.f(f2 * f), new y3.f(f3), new y3.f(f4)).A;
    }

    public static final long W(float f, float f2, float f3, float f4) {
        return o.F(a0.x(f2 * f, f3, f4), 4294967296L);
    }

    public static void X(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(O(context) ? 2131100608 : 2131100607), PorterDuff.Mode.SRC_IN);
        }
    }

    public static List Y(float f, List list) {
        ArrayList<pl.q> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pl.q) obj).b() > 1.0f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return x.A;
        }
        Iterator it = arrayList.iterator();
        double dB = 0.0d;
        while (it.hasNext()) {
            dB += (double) ((pl.q) it.next()).b();
        }
        float f2 = (float) dB;
        int iY = a0.y((int) (f2 / 12.0f), 20, 800);
        ArrayList arrayList2 = new ArrayList();
        for (pl.q qVar : arrayList) {
            int iMax = Math.max((int) ((qVar.b() / f2) * iY), 1);
            ArrayList arrayList3 = new ArrayList(iMax);
            for (int i = 0; i < iMax; i++) {
                arrayList3.add(T(qVar, f));
            }
            v.u0(arrayList3, arrayList2);
        }
        return arrayList2;
    }

    public static Paint Z(float f) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public static final void a(int i, int i2, r rVar, l1.j jVar, u00.a onClick) {
        r rVar2;
        int i3;
        g0 g0Var;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(635616992);
        int i4 = (g0Var2.i(onClick) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i4 | (g0Var2.g(rVar2) ? 32 : 16);
        }
        if (g0Var2.S(i3 & 1, (i3 & 19) != 18)) {
            r rVar3 = i5 != 0 ? b2.o.A : rVar2;
            r rVarE = h0.c.E(w50.c.n(z.n.f(f2.h.c(z1.d(rVar3, 1.0f), p0.f.a(28)), dl.a.i, b0.b), true, onClick), 0.0f, 16, 1);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarE, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            r rVar4 = rVar3;
            z6.b(z3.U(g0Var2, 2131886249), (r) null, t.b, o.z(16), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597824, 48, 260010);
            g0Var = g0Var2;
            g0Var.r(true);
            rVar2 = rVar4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i0(onClick, rVar2, i, i2);
        }
    }

    public static final long a0(long j, String str) {
        if (str.length() <= 5) {
            return j;
        }
        return str.length() == 6 ? o.F(y3.o.c(j) * 0.85f, 4294967296L) : o.F(y3.o.c(j) * 0.72f, 4294967296L);
    }

    public static final long b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static Bitmap b0(Drawable drawable, int i) {
        int intrinsicWidth = (i & 1) != 0 ? drawable.getIntrinsicWidth() : 256;
        int intrinsicHeight = (i & 2) != 0 ? drawable.getIntrinsicHeight() : 256;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i2, i3, i4, i5);
        return bitmapCreateBitmap;
    }

    public static final void c(jp.x xVar, u00.k onAction, l1.j jVar, int i) {
        int i2;
        u00.k kVar;
        Integer num;
        jp.x uiState = xVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z = uiState.a;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-398232880);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i3 = i2;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            xk.d dVarR = c7.i.R(g0Var);
            q2.a aVar = (q2.a) g0Var.k(o1.l);
            String str = uiState.w;
            t2 t2Var = (t2) g0Var.k(o1.q);
            String str2 = uiState.u;
            String str3 = uiState.v;
            ep.f fVar = uiState.y;
            boolean zG = g0Var.g(str2) | g0Var.g(str3) | g0Var.e(fVar == null ? -1 : fVar.ordinal()) | g0Var.g(uiState.z) | g0Var.h(z);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = l1.q.r(new lp.g(uiState, 1));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            Integer numValueOf = Integer.valueOf(uiState.x);
            boolean zI = ((i3 & 14) == 4) | g0Var.i(aVar) | g0Var.i(dVarR);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                num = numValueOf;
                lp.j jVar2 = new lp.j(uiState, aVar, dVarR, null, 2);
                g0Var.n0(jVar2);
                objN2 = jVar2;
            } else {
                num = numValueOf;
            }
            l1.q.i(num, g0Var, (u00.n) objN2);
            String strU = z3.U(g0Var, 2131886159);
            boolean zBooleanValue = ((Boolean) p2Var.getValue()).booleanValue();
            boolean zG2 = g0Var.g(t2Var) | ((i3 & 112) == 32);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == obj) {
                objN3 = new ez.m(t2Var, onAction, 6);
                g0Var.n0(objN3);
            }
            ip.a aVar2 = new ip.a(strU, zBooleanValue, z, (u00.a) objN3);
            Object objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new a2.f(24);
                g0Var.n0(objN4);
            }
            kVar = onAction;
            uiState = xVar;
            up.f.a((u00.a) objN4, null, null, aVar2, false, v1.d.d(892532540, new z0(dVarR, xVar, kVar, p2Var, t2Var, str, 1), g0Var), g0Var, 221190, 6);
        } else {
            kVar = onAction;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new lp.b(uiState, kVar, i, 1);
        }
    }

    public static int c0(float f, Context context) {
        return a0.y(w00.a.F(context.getResources().getDisplayMetrics().density * f), 1, 512);
    }

    public static final void d(ln.b bVar, float f, float f2, b6.m mVar, l1.j jVar, int i) {
        b6.m mVar2;
        dn.e eVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-850783346);
        int i2 = i | (g0Var.e(bVar.ordinal()) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | 3072;
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) g0Var.k(b6.g.b);
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                eVar = dn.e.A;
            } else if (iOrdinal == 1) {
                eVar = dn.e.B;
            } else if (iOrdinal == 2) {
                eVar = dn.e.C;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = dn.e.D;
            }
            float f3 = f >= 0.02f ? f : 0.02f;
            kotlin.jvm.internal.m.e(context, "context");
            int iC0 = c0(f2, context);
            float f4 = context.getResources().getDisplayMetrics().density * 2.5f;
            Bitmap bitmapS = s(iC0);
            Canvas canvas = new Canvas(bitmapS);
            int iOrdinal2 = eVar.ordinal();
            if (iOrdinal2 == 0) {
                bitmapS = J(context, f2, 2131231425, context.getResources().getDisplayMetrics().density * 2.67f, 2.0f, 0.7f, 1.0f);
            } else if (iOrdinal2 == 1) {
                bitmapS = J(context, f2, 2131231426, context.getResources().getDisplayMetrics().density * 2.67f, 0.0f, 0.0f, 0.5f);
            } else if (iOrdinal2 == 2) {
                float f5 = (f4 / 2.0f) + (context.getResources().getDisplayMetrics().density * 4.0f);
                float f6 = iC0;
                float f7 = f6 - f5;
                RectF rectF = new RectF(f5, f5, f7, f7);
                float f8 = f6 / 2.0f;
                float fWidth = rectF.width() / 2.0f;
                Paint paintZ = Z(f4);
                paintZ.setColor(-1);
                paintZ.setAlpha(w00.a.F(102.0f));
                canvas.drawCircle(f8, f8, fWidth, paintZ);
                float fX = a0.x(f3, 0.0f, 1.0f) * 360.0f;
                Paint paintZ2 = Z(f4);
                paintZ2.setColor(-1);
                canvas.drawArc(rectF, -90.0f, fX, false, paintZ2);
            } else {
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                float f9 = (f4 / 2.0f) + (context.getResources().getDisplayMetrics().density * 4.0f);
                float f11 = iC0;
                float f12 = f11 - f9;
                float f13 = f11 / 2.0f;
                float fWidth2 = new RectF(f9, f9, f12, f12).width() / 2.0f;
                Paint paintZ3 = Z(f4);
                paintZ3.setColor(-1);
                paintZ3.setAlpha(w00.a.F(102.0f));
                canvas.drawCircle(f13, f13, fWidth2, paintZ3);
            }
            w50.c.d(new b6.d(bitmapS), null, ze.d.R(f2), 0, null, g0Var, 48, 24);
            mVar2 = b6.k.a;
        } else {
            g0Var.V();
            mVar2 = mVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kn.a(bVar, f, f2, mVar2, i);
        }
    }

    public static void d0(List particles, List list, float f) {
        kotlin.jvm.internal.m.e(particles, "particles");
        ArrayList<pl.q> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pl.q) obj).b() > 1.0f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = particles.iterator();
        while (it.hasNext()) {
            pl.p pVar = (pl.p) it.next();
            float f2 = pVar.a;
            float f3 = pVar.h;
            pVar.a = f2 + pVar.c;
            pVar.b += pVar.d;
            float f4 = pVar.g + 1.0f;
            pVar.g = f4;
            pVar.e = l(f4 / f3);
            boolean z = false;
            if (!arrayList.isEmpty()) {
                for (pl.q qVar : arrayList) {
                    float f5 = pVar.a;
                    if (qVar.a((((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32))) {
                        z = true;
                        break;
                    }
                }
            }
            if (pVar.g >= f3 || !z) {
                it.remove();
                x00.c cVar = x00.d.A;
                arrayList2.add(T((pl.q) h00.q.a1(arrayList), f));
            }
        }
        particles.addAll(arrayList2);
    }

    public static final void e(final float f, final b6.m mVar, l1.j jVar, final int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1524083237);
        int i2 = i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) g0Var.k(b6.g.b);
            kotlin.jvm.internal.m.e(context, "context");
            w50.c.d(new b6.d(J(context, f, 2131231425, 0.0f, 3.0f, 0.4f, 1.0f)), null, ze.d.R(f), 0, null, g0Var, 48, 24);
            mVar = b6.k.a;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i3 = 1;
            r1VarT.d = new u00.n(f, mVar, i, i3) {
                public final int A;
                public final float B;
                public final b6.m C;

                {
                    this.A = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            kh.n.p(this.B, this.C, jVar2, l1.q.K(7));
                            break;
                        default:
                            f50.c.e(this.B, this.C, jVar2, l1.q.K(7));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static void e0(List particles, float f, float f2, float f3, float f4, float f5, List regions, float f6) {
        boolean z;
        kotlin.jvm.internal.m.e(particles, "particles");
        kotlin.jvm.internal.m.e(regions, "regions");
        float f7 = f * f;
        float f8 = f2 * f2;
        float fSqrt = (float) Math.sqrt(f7 + f8);
        float f9 = f3 - f;
        float f11 = f9 * f9;
        float f12 = f4 - f2;
        float f13 = f12 * f12;
        float[] fArr = {(float) Math.sqrt(f8 + f11), (float) Math.sqrt(f7 + f13), (float) Math.sqrt(f11 + f13)};
        for (int i = 0; i < 3; i++) {
            fSqrt = Math.max(fSqrt, fArr[i]);
        }
        float f14 = 1.0f - f5;
        float f15 = (fSqrt + 40.0f) * (1.0f - (f14 * f14));
        Iterator it = particles.iterator();
        while (it.hasNext()) {
            pl.p pVar = (pl.p) it.next();
            float f16 = pVar.a;
            float f17 = pVar.h;
            float f18 = f16 - f;
            float f19 = pVar.b - f2;
            float fSqrt2 = (float) Math.sqrt((f19 * f19) + (f18 * f18));
            if (fSqrt2 < f15 - 30.0f) {
                it.remove();
            } else if (fSqrt2 < f15) {
                int iY = a0.y((int) ((1.0f - ((f15 - fSqrt2) / 30.0f)) * pVar.e), 0, 255);
                pVar.e = iY;
                if (iY < 2) {
                    it.remove();
                }
            } else {
                pVar.a += pVar.c;
                pVar.b += pVar.d;
                float f21 = pVar.g + 1.0f;
                pVar.g = f21;
                pVar.e = l(f21 / f17);
                ArrayList arrayList = new ArrayList();
                for (Object obj : regions) {
                    if (((pl.q) obj).b() > 1.0f) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = true;
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((pl.q) it2.next()).a((((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(pVar.a)) << 32))) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                }
                if (pVar.g >= f17 || !z) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : regions) {
            if (((pl.q) obj2).b() > 1.0f) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty() || particles.size() >= 20) {
            return;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            x00.c cVar = x00.d.A;
            particles.add(T((pl.q) h00.q.a1(arrayList2), f6));
        }
    }

    public static final void f(float f, float f2, b6.m mVar, l1.j jVar, int i) {
        b6.m mVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1746861283);
        int i2 = i | (g0Var.d(f) ? 4 : 2) | (g0Var.d(f2) ? 32 : 16) | 384;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) g0Var.k(b6.g.b);
            float f3 = f >= 0.015f ? f : 0.015f;
            kotlin.jvm.internal.m.e(context, "context");
            int iC0 = c0(f2, context);
            float f4 = 12.0f * context.getResources().getDisplayMetrics().density;
            Bitmap bitmapS = s(iC0);
            Canvas canvas = new Canvas(bitmapS);
            float f5 = f4 / 2.0f;
            float f6 = iC0;
            float f7 = f6 - f5;
            RectF rectF = new RectF(f5, f5, f7, f7);
            float f8 = f6 / 2.0f;
            float fWidth = rectF.width() / 2.0f;
            Paint paintZ = Z(f4);
            paintZ.setColor(-1);
            paintZ.setAlpha(w00.a.F(45.9f));
            canvas.drawCircle(f8, f8, fWidth, paintZ);
            float fX = a0.x(f3, 0.0f, 1.0f) * 360.0f;
            Paint paintZ2 = Z(f4);
            paintZ2.setColor(-1);
            canvas.drawArc(rectF, -90.0f, fX, false, paintZ2);
            w50.c.d(new b6.d(bitmapS), null, ze.d.R(f2), 0, null, g0Var, 48, 24);
            mVar2 = b6.k.a;
        } else {
            g0Var.V();
            mVar2 = mVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.b(f, f2, i, 1, mVar2);
        }
    }

    public static com.google.android.gms.internal.measurement.n f0(com.google.android.gms.internal.measurement.d dVar, oj.q qVar, ArrayList arrayList, boolean z) {
        com.google.android.gms.internal.measurement.n nVarD;
        k00.f.W("reduce", 1, arrayList);
        k00.f.X(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.h hVarC = ((com.google.android.gms.internal.measurement.t) qVar.C).c(qVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
        if (!(hVarC instanceof com.google.android.gms.internal.measurement.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVarD = ((com.google.android.gms.internal.measurement.t) qVar.C).c(qVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
            if (nVarD instanceof com.google.android.gms.internal.measurement.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVarD = null;
        }
        com.google.android.gms.internal.measurement.h hVar = hVarC;
        int iM = dVar.m();
        int i = z ? 0 : iM - 1;
        int i2 = z ? iM - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (nVarD == null) {
            nVarD = dVar.n(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (dVar.p(i)) {
                nVarD = hVar.d(qVar, Arrays.asList(nVarD, dVar.n(i), new com.google.android.gms.internal.measurement.g(Double.valueOf(i)), dVar));
                if (nVarD instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return nVarD;
    }

    public static final void g(cc.a aVar, r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(185154698);
        g0Var.d0(-180607681);
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
        }
        g0Var.d0(-610207901);
        g0Var.d0(-3687241);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.a;
        if (objN == cVar) {
            objN = new gc.g();
            g0Var.n0(objN);
        }
        g0Var.r(false);
        gc.g gVar = (gc.g) objN;
        g0Var.r(false);
        g0Var.d0(-3687241);
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = l1.q.z(true);
            g0Var.n0(objN2);
        }
        g0Var.r(false);
        l1.z0 z0Var = (l1.z0) objN2;
        g0Var.d0(-180606834);
        Context context = (Context) g0Var.k(o0.b);
        s0 s0Var = oc.e.a;
        float f = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        g0Var.r(false);
        l1.q.j(new Object[]{aVar, true, null, Float.valueOf(f), Integer.MAX_VALUE}, new gc.a(gVar, aVar, f, 1, z0Var, (k00.c) null), g0Var);
        g0Var.r(false);
        g0Var.d0(-3686930);
        boolean zG = g0Var.g(gVar);
        Object objN3 = g0Var.N();
        if (zG || objN3 == cVar) {
            objN3 = new j0(gVar, 12);
            g0Var.n0(objN3);
        }
        g0Var.r(false);
        h(aVar, (u00.a) objN3, rVar, g0Var, 134218120, 512);
        r1 r1VarT = g0Var.t();
        if (r1VarT == null) {
            return;
        }
        r1VarT.d = new l1(aVar, rVar, i, 2);
    }

    public static com.google.android.gms.internal.measurement.d g0(com.google.android.gms.internal.measurement.d dVar, oj.q qVar, com.google.android.gms.internal.measurement.m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator itL = dVar.l();
        while (itL.hasNext()) {
            int iIntValue = ((Integer) itL.next()).intValue();
            if (dVar.p(iIntValue)) {
                com.google.android.gms.internal.measurement.n nVarD = mVar.d(qVar, Arrays.asList(dVar.n(iIntValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(iIntValue)), dVar));
                if (nVarD.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarD.zze().equals(bool2)) {
                    dVar2.o(iIntValue, nVarD);
                }
            }
        }
        return dVar2;
    }

    public static final void h(cc.a aVar, u00.a progress, r rVar, l1.j jVar, int i, int i2) {
        kotlin.jvm.internal.m.e(progress, "progress");
        g0 g0Var = (g0) jVar;
        g0Var.e0(185150686);
        g0Var.d0(-3687241);
        Object objN = g0Var.N();
        Object obj = l1.i.a;
        if (objN == obj) {
            objN = new cc.i();
            g0Var.n0(objN);
        }
        g0Var.r(false);
        cc.i iVar = (cc.i) objN;
        g0Var.d0(-3687241);
        Object objN2 = g0Var.N();
        if (objN2 == obj) {
            objN2 = new Matrix();
            g0Var.n0(objN2);
        }
        g0Var.r(false);
        Matrix matrix = (Matrix) objN2;
        g0Var.d0(-3687241);
        Object objN3 = g0Var.N();
        if (objN3 == obj) {
            objN3 = l1.q.z((Object) null);
            g0Var.n0(objN3);
        }
        g0Var.r(false);
        l1.z0 z0Var = (l1.z0) objN3;
        g0Var.d0(185151463);
        if (aVar == null || aVar.b() == 0.0f) {
            g0Var.r(false);
            r1 r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new gc.h(aVar, progress, rVar, i, i2, 0);
            }
            h0.o.a(rVar, g0Var, (i >> 6) & 14);
            return;
        }
        g0Var.r(false);
        float fC = oc.e.c();
        z.n.b(0, z1.n(rVar, aVar.i.width() / fC, aVar.i.height() / fC), g0Var, new c4.g(aVar, matrix, iVar, progress, z0Var));
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 == null) {
            return;
        }
        r1VarT2.d = new gc.h(aVar, progress, rVar, i, i2, 1);
    }

    public static final void i(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(419613330);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            r rVarD = h0.c.D(z.n.f(f2.h.c(b2.o.A, p0.f.a(32)), dl.a.C, b0.b), 6, 2);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            z6.b(z3.U(g0Var, 2131886909), (r) null, dl.a.i, o.z(9), u.F, (q3.i) null, 0L, (x3.l) null, (x3.k) null, o.z(9), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar, i, 3);
        }
    }

    public static final void j(final boolean z, final long j, final r rVar, float f, l1.j jVar, final int i) {
        final float f2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-871226213);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.f(j) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128) | 3072;
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            float f3 = 24;
            h0.o.a(z.n.e(f2.h.a(z1.e(z1.d(rVar, 1.0f), f3), ((Number) x.d.b(z ? 1.0f : 0.0f, (y) null, (String) null, g0Var, 0, 30).getValue()).floatValue()), sg.f.P(va.a.S(new t[]{new t(j), new t(t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 0);
            f2 = f3;
        } else {
            g0Var.V();
            f2 = f;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(f2, i, j, rVar, z) {
                public final boolean A;
                public final long B;
                public final r C;
                public final float D;

                {
                    this.A = z;
                    this.B = j;
                    this.C = rVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    c.j(this.A, this.B, this.C, this.D, (j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void k(boolean z, u00.n onConfirm, u00.a onDismiss, r rVar, int i, int i2, l1.j jVar, int i3) {
        l1.j jVar2;
        r rVar2;
        kotlin.jvm.internal.m.e(onConfirm, "onConfirm");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(13473635);
        int i4 = i3 | (jVar3.h(z) ? 4 : 2) | (jVar3.i(onConfirm) ? 32 : 16) | (jVar3.i(onDismiss) ? 256 : 128) | 3072 | (jVar3.e(i) ? 16384 : 8192) | (jVar3.e(i2) ? 131072 : 65536);
        if (jVar3.S(i4 & 1, (74899 & i4) != 74898)) {
            if (z) {
                jVar3.c0(1961484764);
                Object objN = jVar3.N();
                if (objN == l1.i.a) {
                    objN = l1.q.z(Boolean.TRUE);
                    jVar3.n0(objN);
                }
                jVar2 = jVar3;
                qd.s0.G(onDismiss, (c4.v) null, v1.d.d(-1602441323, new ct.a(i, i2, (l1.z0) objN, onDismiss, onConfirm), jVar3), jVar2, ((i4 >> 6) & 14) | 384, 2);
                jVar2.r(false);
            } else {
                jVar2 = jVar3;
                jVar2.c0(1964993375);
                jVar2.r(false);
            }
            rVar2 = b2.o.A;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.y(z, onConfirm, onDismiss, rVar2, i, i2, i3);
        }
    }

    public static int l(float f) {
        int i;
        if (f < 0.2f) {
            i = (int) ((f / 0.2f) * 200.0f);
        } else {
            i = f > 0.8f ? (int) ((1.0f - ((f - 0.8f) / 0.2f)) * 200.0f) : 200;
        }
        return a0.y(i, 0, 255);
    }

    public static ArrayList m(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((x40.x) obj) != x40.x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x40.x) it.next()).A);
        }
        return arrayList2;
    }

    public static final Bundle n(g00.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (g00.k kVar : kVarArr) {
            String str = (String) kVar.A;
            Object obj = kVar.B;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.m.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static s20.f o(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.m.d(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            n20.b bVarA = p10.d.a(cls);
            String str = i10.d.a;
            n20.c fqName = bVarA.a();
            kotlin.jvm.internal.m.e(fqName, "fqName");
            n20.b bVar = (n20.b) i10.d.h.get(fqName.a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new s20.f(bVarA, i);
        }
        if (cls.equals(Void.TYPE)) {
            n20.c cVarI = g10.o.d.i();
            return new s20.f(new n20.b(cVarI.b(), cVarI.a.g()), i);
        }
        g10.k kVarD = v20.c.b(cls.getName()).d();
        kotlin.jvm.internal.m.d(kVarD, "getPrimitiveType(...)");
        if (i > 0) {
            n20.c topLevelFqName = (n20.c) kVarD.D.getValue();
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            return new s20.f(new n20.b(topLevelFqName.b(), topLevelFqName.a.g()), i - 1);
        }
        n20.c topLevelFqName2 = (n20.c) kVarD.C.getValue();
        kotlin.jvm.internal.m.e(topLevelFqName2, "topLevelFqName");
        return new s20.f(new n20.b(topLevelFqName2.b(), topLevelFqName2.a.g()), i);
    }

    public static byte[] p(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        k50.i iVar = new k50.i();
        for (String str : m(protocols)) {
            iVar.q0(str.length());
            iVar.w0(str);
        }
        return iVar.O(iVar.B);
    }

    public static final h30.p q(a1 a1Var) {
        int iOrdinal = a1Var.ordinal();
        if (iOrdinal == 0) {
            return h30.p.INV;
        }
        if (iOrdinal == 1) {
            return h30.p.IN;
        }
        if (iOrdinal == 2) {
            return h30.p.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static x20.n r(String debugName, List list) {
        x20.m mVar;
        kotlin.jvm.internal.m.e(debugName, "debugName");
        n30.f fVar = new n30.f();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = x20.m.b;
            if (!zHasNext) {
                break;
            }
            x20.n nVar = (x20.n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof x20.a) {
                    v.v0(fVar, ((x20.a) nVar).c);
                } else {
                    fVar.add(nVar);
                }
            }
        }
        int i = fVar.A;
        if (i != 0) {
            return i != 1 ? new x20.a(debugName, (x20.n[]) fVar.toArray(new x20.n[0])) : (x20.n) fVar.get(0);
        }
        return mVar;
    }

    public static Bitmap s(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static ContextThemeWrapper t(Context context, int i, boolean z) {
        if (i == 0) {
            i = I(context, !z ? 2130969048 : 2130968625);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return I(contextThemeWrapper, 2130969554) != 0 ? new ContextThemeWrapper(contextThemeWrapper, E(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static void u(k2.d drawScope, List particles, long j, List regions) {
        kotlin.jvm.internal.m.e(drawScope, "drawScope");
        kotlin.jvm.internal.m.e(particles, "particles");
        kotlin.jvm.internal.m.e(regions, "regions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : regions) {
            if (((pl.q) obj).b() > 1.0f) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Iterator it = particles.iterator();
        while (it.hasNext()) {
            pl.p pVar = (pl.p) it.next();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(pVar.a)) << 32) | (((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L);
            if (!zIsEmpty) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((pl.q) it2.next()).a(jFloatToRawIntBits)) {
                            }
                        }
                    }
                }
            }
            k2.d.M(drawScope, t.b(pVar.e / 255.0f, j), pVar.f, jFloatToRawIntBits, 0, 120);
        }
    }

    public static final n00.b v(Enum[] entries) {
        kotlin.jvm.internal.m.e(entries, "entries");
        return new n00.b(entries);
    }

    public static final String w(long j) {
        double d;
        String str;
        if (j <= 0) {
            return "0 B";
        }
        double d2 = 1024;
        double d3 = d2 * 1024.0d;
        double d4 = d2 * d3;
        double d5 = j;
        if (d5 >= d4) {
            d = d5 / d4;
            str = "GB";
        } else if (d5 >= d3) {
            d = d5 / d3;
            str = "MB";
        } else {
            if (d5 < 1024.0d) {
                return j + " B";
            }
            d = d5 / 1024.0d;
            str = "KB";
        }
        return String.format(Locale.ENGLISH, "%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d), str}, 2));
    }

    public static final String x(int i, int i2) {
        return x5.m(i < 10 ? g4.c.f(i, "0") : String.valueOf(i), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, i2 < 10 ? g4.c.f(i2, "0") : String.valueOf(i2));
    }

    public static final String y(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        return j3 > 0 ? String.format(Locale.ENGLISH, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3)) : String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
    }

    public static final String z(LocalDate localDate) {
        return String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue()), Integer.valueOf(localDate.getDayOfMonth())}, 3));
    }
}
