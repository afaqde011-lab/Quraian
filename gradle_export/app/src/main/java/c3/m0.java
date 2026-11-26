package c3;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.z3;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

public abstract class m0 {

    public static final Class[] f2693a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(j3.s sVar) {
        return !sVar.k().A.c(j3.w.f7987j);
    }

    public static final int c(long j9) {
        int i10 = Math.abs(Float.intBitsToFloat((int) (j9 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j9 & 4294967295L))) >= 0.5f ? i10 | 2 : i10;
    }

    public static final boolean d(j3.s sVar, Resources resources) {
        Object objG = sVar.f7968d.A.g(j3.w.f7978a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !j3.v.g(sVar) && (sVar.f7968d.C || (sVar.q() && ((list != null ? (String) h00.q.N0(list) : null) != null || p(sVar) != null || o(sVar, resources) != null || n(sVar))));
    }

    public static final long e(int i10, int i11, int[] iArr, long j9) {
        float f3;
        float fIntBitsToFloat;
        float f10;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j9 >> 32)) - (i10 * (-1.0f));
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j9 & 4294967295L)) - (i11 * (-1.0f));
        int i12 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i12) >= 0.0f) {
            f3 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i12);
            if (f3 > fIntBitsToFloat) {
                f3 = fIntBitsToFloat;
            }
        } else {
            f3 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i12);
            if (f3 < fIntBitsToFloat) {
                f3 = fIntBitsToFloat;
            }
        }
        int i13 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i13) >= 0.0f) {
            f10 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            if (f10 > fIntBitsToFloat2) {
                f10 = fIntBitsToFloat2;
            }
        } else {
            f10 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            if (f10 < fIntBitsToFloat2) {
                f10 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final void f(a5.g gVar, j3.s sVar) {
        j3.o oVar = sVar.f7968d;
        u.i0 i0Var = oVar.A;
        Object objG = oVar.A.g(j3.w.f8001z);
        if (objG == null) {
            objG = null;
        }
        j3.k kVar = (j3.k) objG;
        if (b(sVar)) {
            if (kVar != null && kVar.f7937a == 8) {
                return;
            }
            Object objG2 = i0Var.g(j3.n.f7962y);
            if (objG2 == null) {
                objG2 = null;
            }
            j3.a aVar = (j3.a) objG2;
            if (aVar != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageUp, aVar.f7926a));
            }
            Object objG3 = i0Var.g(j3.n.A);
            if (objG3 == null) {
                objG3 = null;
            }
            j3.a aVar2 = (j3.a) objG3;
            if (aVar2 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageDown, aVar2.f7926a));
            }
            Object objG4 = i0Var.g(j3.n.f7963z);
            if (objG4 == null) {
                objG4 = null;
            }
            j3.a aVar3 = (j3.a) objG4;
            if (aVar3 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageLeft, aVar3.f7926a));
            }
            Object objG5 = i0Var.g(j3.n.B);
            j3.a aVar4 = (j3.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageRight, aVar4.f7926a));
            }
        }
    }

    public static final q1 g(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            y3.e eVarD = z3.d(context);
            long jB = f50.c.b(configuration.screenWidthDp, configuration.screenHeightDp);
            return new q1(kh.n.k0(eVarD.b1(jB)), jB);
        }
        xa.c.f16508a.getClass();
        xa.b bVar = xa.b.f16506a;
        xa.d dVar = xa.b.f16507b;
        kotlin.jvm.internal.m.e(dVar, "it");
        xa.a aVarA = (Build.VERSION.SDK_INT >= 34 ? ya.d.f16850a : ya.b.f16849c).a((ContextWrapper) baseContext, dVar.f16509b);
        long jWidth = (((long) aVarA.a().width()) << 32) | (((long) aVarA.a().height()) & 4294967295L);
        return new q1(jWidth, z3.d(baseContext).t(kh.n.m0(jWidth)));
    }

    public static final boolean h(Object obj) {
        if (obj instanceof z1.n) {
            z1.n nVar = (z1.n) obj;
            if (nVar.d() == l1.c.D || nVar.d() == l1.c.G || nVar.d() == l1.c.E) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return h(value);
            }
        } else {
            if ((obj instanceof g00.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f2693a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int i(float f3) {
        return w00.a.F(f3) * (-1);
    }

    public static final float j(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final int k(View view, int i10) {
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i10);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i12 = i11;
            }
            i11++;
            Object objE = bi.b.E(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return i12;
    }

    public static final View l(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(k(view, 2131363128), k(view, 2131363131));
        View view2 = view;
        int i10 = 0;
        View view3 = view2;
        while (view != null) {
            if (i10 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m(view) == null) {
                i10++;
                Object objE = bi.b.E(view);
                View view4 = view2;
                view2 = view;
                view = objE instanceof View ? (View) objE : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final n1 m(View view) {
        Object tag = view.getTag(2131361882);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (n1) weakReference.get();
        }
        return null;
    }

    public static final boolean n(j3.s sVar) {
        Object objG = sVar.f7968d.A.g(j3.w.L);
        if (objG == null) {
            objG = null;
        }
        l3.a aVar = (l3.a) objG;
        u.i0 i0Var = sVar.f7968d.A;
        Object objG2 = i0Var.g(j3.w.f8001z);
        if (objG2 == null) {
            objG2 = null;
        }
        j3.k kVar = (j3.k) objG2;
        boolean z10 = aVar != null;
        Object objG3 = i0Var.g(j3.w.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (kVar != null && kVar.f7937a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String o(j3.s sVar, Resources resources) throws NoWhenBranchMatchedException {
        int iY;
        j3.o oVar = sVar.f7968d;
        j3.o oVar2 = sVar.f7968d;
        Object objG = oVar.A.g(j3.w.f7979b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        u.i0 i0Var = oVar2.A;
        Object objG2 = i0Var.g(j3.w.L);
        if (objG2 == null) {
            objG2 = null;
        }
        l3.a aVar = (l3.a) objG2;
        Object objG3 = i0Var.g(j3.w.f8001z);
        if (objG3 == null) {
            objG3 = null;
        }
        j3.k kVar = (j3.k) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (objG == null) {
                        objG = resources.getString(2131886568);
                    }
                } else if (kVar != null && kVar.f7937a == 2 && objG == null) {
                    objG = resources.getString(2131887298);
                }
            } else if (kVar != null && kVar.f7937a == 2 && objG == null) {
                objG = resources.getString(2131887299);
            }
        }
        Object objG4 = i0Var.g(j3.w.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((kVar == null || kVar.f7937a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2131887204) : resources.getString(2131886919);
            }
        }
        Object objG5 = i0Var.g(j3.w.f7980c);
        if (objG5 == null) {
            objG5 = null;
        }
        j3.j jVar = (j3.j) objG5;
        if (jVar != null) {
            if (jVar != j3.j.f7934c) {
                if (objG == null) {
                    z00.a aVar2 = jVar.f7936b;
                    float f3 = aVar2.B;
                    float f10 = aVar2.A;
                    float f11 = f3 - f10 == 0.0f ? 0.0f : (jVar.f7935a - f10) / (aVar2.B - f10);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    if (f11 == 0.0f) {
                        iY = 0;
                    } else {
                        iY = f11 == 1.0f ? 100 : ab.a0.y(Math.round(f11 * 100), 1, 99);
                    }
                    objG = resources.getString(2131887340, Integer.valueOf(iY));
                }
            } else if (objG == null) {
                objG = resources.getString(2131886567);
            }
        }
        j3.z zVar = j3.w.G;
        if (i0Var.c(zVar)) {
            u.i0 i0Var2 = new j3.s(sVar.f7965a, true, sVar.f7967c, oVar2).k().A;
            Object objG6 = i0Var2.g(j3.w.f7978a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = i0Var2.g(j3.w.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = i0Var2.g(zVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(2131887297);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final m3.h p(j3.s sVar) {
        j3.o oVar = sVar.f7968d;
        j3.z zVar = j3.w.f7978a;
        m3.h hVar = (m3.h) j3.v.f(oVar, j3.w.G);
        List list = (List) j3.v.f(sVar.f7968d, j3.w.C);
        return hVar == null ? list != null ? (m3.h) h00.q.N0(list) : null : hVar;
    }

    public static final m3.n0 q(j3.o oVar) {
        u00.k kVar;
        ArrayList arrayList = new ArrayList();
        Object objG = oVar.A.g(j3.n.f7940a);
        if (objG == null) {
            objG = null;
        }
        j3.a aVar = (j3.a) objG;
        if (aVar == null || (kVar = aVar.f7927b) == null || !((Boolean) kVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (m3.n0) arrayList.get(0);
    }

    public static final boolean r(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f3 * f14) - (f10 * f13);
        float f26 = (f3 * f15) - (f11 * f13);
        float f27 = (f3 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f3) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f3) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f3 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == 0.0f);
    }

    public static final boolean s(float f3, float f10, i2.g gVar) {
        h2.c cVar = new h2.c(f3 - 0.005f, f10 - 0.005f, f3 + 0.005f, f10 + 0.005f);
        i2.g gVarA = i2.j.a();
        i2.g.b(gVarA, cVar);
        i2.g gVarA2 = i2.j.a();
        gVarA2.g(gVar, gVarA, 1);
        boolean zIsEmpty = gVarA2.f7128a.isEmpty();
        gVarA2.h();
        gVarA.h();
        return !zIsEmpty;
    }

    public static final boolean t(float f3, float f10, float f11, float f12, long j9) {
        float f13 = f3 - f11;
        float f14 = f10 - f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f13 * f13) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final l2 u(l1.j jVar) {
        View view = (View) ((l1.g0) jVar).k(o0.f2726f);
        l1.g0 g0Var = (l1.g0) jVar;
        c3 c3Var = (c3) g0Var.k(o1.f2744t);
        boolean zG = g0Var.g(view) | g0Var.g(c3Var);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            c3Var.c();
            objN = new l2(view);
            g0Var.n0(objN);
        }
        return (l2) objN;
    }

    public static final b4.j v(z0 z0Var, int i10) {
        Object next;
        Iterator<T> it = z0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b3.l0) ((Map.Entry) next).getKey()).B != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (b4.j) entry.getValue();
        }
        return null;
    }

    public static final String w(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('@');
        return a1.b.r(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1, "%07x", sb2);
    }

    public static final String x(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
