package c50;

import a8.j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.media3.common.t;
import c3.c3;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.a3;
import com.google.android.gms.internal.cast.p5;
import com.google.android.gms.internal.cast.q5;
import com.google.android.gms.internal.cast.r4;
import com.google.android.gms.internal.cast.v9;
import e7.e0;
import e7.i0;
import e7.u;
import eh.v;
import eh.w;
import fh.i2;
import fh.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import k9.a2;
import k9.n1;
import k9.s1;
import k9.t2;
import k9.x0;
import kh.q;
import kh.r;
import kotlin.jvm.internal.m;
import l0.i;
import l0.k;
import oj.l;
import org.xmlpull.v1.XmlPullParserException;
import p.e1;
import qd.s0;
import s7.a0;
import s7.d0;
import s7.f0;
import u.c0;
import u.n0;
import u00.p;
import x40.x;
import z4.h0;
import z4.j0;

public class h implements xf.e, j, q {
    public final int A;
    public int B;
    public Object C;
    public Object D;

    public h(char c, int i) {
        this.A = i;
    }

    public h(int i, byte b) {
        this.A = i;
        switch (i) {
            case 13:
                this.C = new m1.e(0, new k[16]);
                break;
            default:
                this.C = Collections.synchronizedMap(new u.e(0));
                this.B = 0;
                break;
        }
    }

    public h(int i, int i2) {
        this.A = i2;
        switch (i2) {
            case 7:
                this.C = new Object[i * 2];
                this.B = 0;
                break;
            default:
                this.B = i;
                break;
        }
    }

    public h(int i, int i2, Object obj, String str) {
        this.A = i2;
        this.C = obj;
        this.B = i;
        this.D = str;
    }

    public h(int i, e0 e0Var) {
        this.A = 8;
        this.B = i;
        this.C = e0Var;
        this.D = new u();
    }

    public h(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.A = 9;
        this.B = i2;
        this.C = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.D = bArr;
    }

    public h(ImageView imageView) {
        this.A = 16;
        this.B = 0;
        this.C = imageView;
    }

    public h(c3 c3Var) {
        this.A = 5;
        this.C = c3Var;
    }

    public h(w wVar) {
        this.A = 6;
        eh.c cVar = eh.c.F;
        this.D = wVar;
        this.C = cVar;
        this.B = Integer.MAX_VALUE;
    }

    public h(g7.e eVar) {
        this.A = 15;
        androidx.media3.common.q qVar = new androidx.media3.common.q(11);
        qVar.C = new tf.w(20);
        this.D = qVar;
        this.C = eVar;
        this.B = 1;
    }

    public h(Object obj, Object obj2, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.D = obj2;
        this.B = i;
    }

    public h(String str, String[] strArr) {
        String string;
        this.A = 23;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.C = string;
        this.D = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.D, i)) {
            i++;
        }
        this.B = i;
    }

    public h(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.A = 19;
        this.C = arrayList;
        this.B = i;
        this.D = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    public h(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.A = 24;
        this.C = uuid;
        this.B = i;
        this.D = bArr;
    }

    public h(CopyOnWriteArrayList copyOnWriteArrayList, int i, a0 a0Var) {
        this.A = 20;
        this.D = copyOnWriteArrayList;
        this.B = i;
        this.C = a0Var;
    }

    public h(t2 t2Var, a2 a2Var, int i) {
        this.A = 12;
        this.D = t2Var;
        this.C = a2Var;
        this.B = i;
    }

    public h(l lVar) {
        this.A = 21;
        this.C = new SparseArray();
        this.D = lVar;
        this.B = -1;
    }

    public h(z00.e eVar, l0.q qVar) {
        Object iVar;
        this.A = 14;
        h hVarK = qVar.k();
        int i = eVar.A;
        if (i < 0) {
            g0.a.c("negative nearestRange.first");
        }
        int iMin = Math.min(eVar.B, hVarK.B - 1);
        if (iMin < i) {
            c0 c0Var = n0.a;
            m.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.C = c0Var;
            this.D = new Object[0];
            this.B = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.D = new Object[i2];
        this.B = i;
        c0 c0Var2 = new c0(i2);
        m1.e eVar2 = (m1.e) hVarK.C;
        if (i < 0 || i >= hVarK.B) {
            StringBuilder sbQ = oi.k.q("Index ", i, ", size ");
            sbQ.append(hVarK.B);
            g0.a.e(sbQ.toString());
        }
        if (iMin < 0 || iMin >= hVarK.B) {
            StringBuilder sbQ2 = oi.k.q("Index ", iMin, ", size ");
            sbQ2.append(hVarK.B);
            g0.a.e(sbQ2.toString());
        }
        if (iMin < i) {
            g0.a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iE = l0.q.e(i, eVar2);
        int i3 = ((k) eVar2.A[iE]).a;
        while (i3 <= iMin) {
            k kVar = (k) eVar2.A[iE];
            u00.k key = kVar.c.getKey();
            int i4 = kVar.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (kVar.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        iVar = key.invoke(Integer.valueOf(iMax - i4));
                        iVar = iVar == null ? new i(iMax) : iVar;
                    }
                    c0Var2.g(iMax, iVar);
                    ((Object[]) this.D)[iMax - this.B] = iVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += kVar.b;
            iE++;
        }
        this.C = c0Var2;
    }

    public static h f(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        h7.b bVar;
        int i2;
        int i3;
        int i4;
        Object radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i5 = 17;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = p4.b.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new h(obj, colorStateListB, colorStateListB.getDefaultColor(), i5);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayG = p4.a.g(resources, theme, attributeSetAsAttributeSet, m4.a.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayG.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayG.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayG.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayG.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayG.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayG.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayG.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayG.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayG.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayG.getColor(1, 0) : 0;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayG.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayG.getFloat(5, 0.0f) : 0.0f;
        typedArrayG.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayG2 = p4.a.g(resources, theme, attributeSetAsAttributeSet, m4.a.f);
                boolean zHasValue = typedArrayG2.hasValue(0);
                boolean zHasValue2 = typedArrayG2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayG2.getColor(0, 0);
                float f12 = typedArrayG2.getFloat(1, 0.0f);
                typedArrayG2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f4 = f;
            f5 = f2;
        }
        if (arrayList2.size() > 0) {
            bVar = new h7.b();
            int size = arrayList2.size();
            bVar.A = new int[size];
            bVar.B = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                ((int[]) bVar.A)[i8] = ((Integer) arrayList2.get(i8)).intValue();
                ((float[]) bVar.B)[i8] = ((Float) arrayList.get(i8)).floatValue();
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            i3 = 1;
            i2 = 2;
        } else if (z) {
            bVar = new h7.b();
            bVar.A = new int[]{color, color2, color3};
            bVar.B = new float[]{0.0f, 0.5f, 1.0f};
            i3 = 1;
            i2 = 2;
        } else {
            bVar = new h7.b();
            bVar.A = new int[]{color, color3};
            i2 = 2;
            bVar.B = new float[]{0.0f, 1.0f};
            i3 = 1;
        }
        if (i6 == i3) {
            i4 = 0;
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f11, (int[]) bVar.A, (float[]) bVar.B, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != i2) {
            i4 = 0;
            radialGradient = new LinearGradient(f3, f, f2, f6, (int[]) bVar.A, (float[]) bVar.B, i7 != i3 ? i7 != i2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i4 = 0;
            radialGradient = new SweepGradient(f7, f8, (int[]) bVar.A, (float[]) bVar.B);
        }
        return new h(radialGradient, (Object) null, i4, 17);
    }

    public static h x(char c) {
        return new h((w) new me.i(new eh.f(c, 0), 23));
    }

    public static h y(String str) {
        ta.c0.r("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? x(str.charAt(0)) : new h((w) new eh.l(str, 1));
    }

    public h A(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.B) * 2;
            Object[] objArr = (Object[]) this.C;
            if (size > objArr.length) {
                this.C = Arrays.copyOf(objArr, fh.n0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            z(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public h B(Map map) {
        return A(map.entrySet());
    }

    public List C(CharSequence charSequence) {
        charSequence.getClass();
        v vVarK = ((w) this.D).k(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            v vVar = vVarK;
            if (!vVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) vVar.next());
        }
    }

    public void D(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.C;
        int i3 = this.B;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void E(int i, long j, int i2) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.C;
        long[] jArr2 = (long[]) this.D;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.B : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i11 = i7 + 2;
                long j3 = jArr[i11];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i12 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i12];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i12] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i11] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (k3.a.b & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void F(int i, p pVar) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.C;
        int i3 = this.B;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                pVar.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void G(com.google.android.gms.common.api.internal.v vVar) {
        Map map = (Map) this.C;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put("ConnectionlessLifecycleHelper", vVar);
        if (this.B > 0) {
            new a3(Looper.getMainLooper(), 4).post(new r(6, this, vVar, false));
        }
    }

    public void H(Bundle bundle) {
        this.B = 1;
        this.D = bundle;
        for (Map.Entry entry : ((Map) this.C).entrySet()) {
            ((com.google.android.gms.common.api.internal.v) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public a8.i H0(a8.r rVar, long j) {
        long j2;
        long position = rVar.getPosition();
        int iMin = (int) Math.min(112800, rVar.getLength() - position);
        u uVar = (u) this.D;
        uVar.K(iMin);
        rVar.a(0, iMin, uVar.a);
        int i = uVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (uVar.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = uVar.a;
            int i2 = uVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jO0 = s0.o0(uVar, i2, this.B);
            if (jO0 != j2) {
                long jB = ((e0) this.C).b(jO0);
                if (jB > j) {
                    return j5 == j2 ? new a8.i(-1, jB, position) : new a8.i(0, -9223372036854775807L, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new a8.i(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            uVar.N(i3);
            j3 = i3;
        }
        return j5 != j2 ? new a8.i(-2, j5, position + j3) : a8.i.d;
    }

    public void I(int i, int i2, Intent intent) {
        for (com.google.android.gms.common.api.internal.v vVar : ((Map) this.C).values()) {
            AtomicReference atomicReference = vVar.C;
            com.google.android.gms.common.api.internal.h hVar = vVar.G;
            AtomicReference atomicReference2 = vVar.C;
            w0 w0Var = (w0) atomicReference.get();
            if (i != 1) {
                if (i == 2) {
                    int iB = vVar.E.b(vVar.a(), pe.f.a);
                    if (iB == 0) {
                        atomicReference2.set(null);
                        a3 a3Var = hVar.N;
                        a3Var.sendMessage(a3Var.obtainMessage(3));
                    } else if (w0Var == null || (w0Var.b.B == 18 && iB == 18)) {
                    }
                }
                if (w0Var != null) {
                    pe.b bVar = w0Var.b;
                    int i3 = w0Var.a;
                    atomicReference2.set(null);
                    hVar.i(bVar, i3);
                }
            } else if (i2 == -1) {
                atomicReference2.set(null);
                a3 a3Var2 = hVar.N;
                a3Var2.sendMessage(a3Var2.obtainMessage(3));
            } else if (i2 == 0) {
                if (w0Var != null) {
                    pe.b bVar2 = new pe.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, (PendingIntent) null, w0Var.b.toString());
                    int i4 = w0Var.a;
                    atomicReference2.set(null);
                    hVar.i(bVar2, i4);
                }
            } else if (w0Var != null) {
                pe.b bVar3 = w0Var.b;
                int i5 = w0Var.a;
                atomicReference2.set(null);
                hVar.i(bVar3, i5);
            }
        }
    }

    public void J(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.C).entrySet()) {
            Bundle bundle2 = new Bundle();
            w0 w0Var = (w0) ((com.google.android.gms.common.api.internal.v) entry.getValue()).C.get();
            if (w0Var != null) {
                pe.b bVar = w0Var.b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", w0Var.a);
                bundle2.putInt("failed_status", bVar.B);
                bundle2.putParcelable("failed_resolution", bVar.C);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void a(int i, l0.w wVar) {
        if (i < 0) {
            g0.a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        k kVar = new k(this.B, i, wVar);
        this.B += i;
        ((m1.e) this.C).b(kVar);
    }

    public void b() {
        bd.f fVar;
        ImageView imageView = (ImageView) this.C;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i = e1.a;
        }
        if (drawable == null || (fVar = (bd.f) this.D) == null) {
            return;
        }
        p.r.e(drawable, fVar, imageView.getDrawableState());
    }

    public i2 c(boolean z) {
        v0 v0Var;
        v0 v0Var2;
        if (z && (v0Var2 = (v0) this.D) != null) {
            throw v0Var2.a();
        }
        i2 i2VarH = i2.h(this.B, (Object[]) this.C, this);
        if (!z || (v0Var = (v0) this.D) == null) {
            return i2VarH;
        }
        throw v0Var.a();
    }

    public fh.w0 d() {
        return c(false);
    }

    public fh.w0 e() {
        return c(true);
    }

    public void g(String str, Object... objArr) {
        if (this.B <= 3) {
            String str2 = (String) this.D;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.C).concat(str));
        }
    }

    public void h(e7.h hVar) {
        for (f0 f0Var : (CopyOnWriteArrayList) this.D) {
            i0.M(f0Var.a, new oi.p(hVar, f0Var.b, 7));
        }
    }

    public void h0(Throwable th) {
    }

    public void i(int i, t tVar, int i2, Object obj, long j) {
        h(new s7.c0(this, new s7.w(1, i, tVar, i2, obj, i0.W(j), -9223372036854775807L), 0));
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.C;
        if (this.B == -1) {
            this.B = 0;
        }
        while (true) {
            int i2 = this.B;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.B--;
        }
        while (this.B < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.B + 1)) {
            this.B++;
        }
        return sparseArray.valueAt(this.B);
    }

    public k k(int i) {
        if (i < 0 || i >= this.B) {
            StringBuilder sbQ = oi.k.q("Index ", i, ", size ");
            sbQ.append(this.B);
            g0.a.e(sbQ.toString());
        }
        k kVar = (k) this.D;
        if (kVar != null) {
            int i2 = kVar.a;
            if (i < kVar.b + i2 && i2 <= i) {
                return kVar;
            }
        }
        m1.e eVar = (m1.e) this.C;
        k kVar2 = (k) eVar.A[l0.q.e(i, eVar)];
        this.D = kVar2;
        return kVar2;
    }

    public int l(Object obj) {
        c0 c0Var = (c0) this.C;
        int iD = c0Var.d(obj);
        if (iD >= 0) {
            return c0Var.c[iD];
        }
        return -1;
    }

    public Object m(int i) {
        Object[] objArr = (Object[]) this.D;
        int i2 = i - this.B;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public String n() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.B + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.C)[i2];
            if (obj instanceof n40.e) {
                n40.e eVar = (n40.e) obj;
                if (!m.a(eVar.getKind(), n40.i.d)) {
                    int i3 = ((int[]) this.D)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(eVar.f(i3));
                    }
                } else if (((int[]) this.D)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.D)[i2]);
                    sb.append("]");
                }
            } else if (obj != r40.k.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public int o() {
        int i = this.B;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void onSuccess(Object obj) {
        switch (this.A) {
            case 3:
                r4 r4Var = (r4) this.C;
                q5 q5Var = (q5) this.D;
                int i = this.B;
                if (((Boolean) obj).booleanValue()) {
                    p5 p5VarN = q5.n(q5Var);
                    String str = r4Var.d;
                    p5VarN.a();
                    ((v9) p5VarN).B.q(str);
                    p5VarN.a();
                    ((v9) p5VarN).B.r(str);
                    Long l = r4Var.e;
                    if (l != null) {
                        int iLongValue = (int) l.longValue();
                        p5VarN.a();
                        ((v9) p5VarN).B.s(iLongValue);
                    }
                    q5 q5VarC = p5VarN.c();
                    int i2 = r4Var.i;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    int i4 = i - 1;
                    ud.d dVar = ud.d.B;
                    ud.a aVar = (i3 == 0 || i3 != 1) ? new ud.a(Integer.valueOf(i4), q5VarC, dVar, (ud.b) null) : new ud.a(Integer.valueOf(i4), q5VarC, ud.d.A, (ud.b) null);
                    r4.j.d("analytics event: %s", new Object[]{aVar});
                    ce.c cVar = r4Var.g;
                    if (cVar != null) {
                        cVar.D(aVar, new uh.k(13));
                        return;
                    }
                    return;
                }
                return;
            default:
                List list = (List) obj;
                s1 s1Var = ((t2) this.D).f;
                Handler handler = s1Var.l;
                a2 a2Var = (a2) this.C;
                i0.M(handler, new ji.a(s1Var, a2Var, new de.d(this.B, 2, this, list, a2Var)));
                return;
        }
    }

    public void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.C;
        int i8 = this.B;
        int i9 = i8 + 3;
        this.B = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            m.d(jArrCopyOf, "copyOf(...)");
            this.C = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.D, iMax);
            m.d(jArrCopyOf2, "copyOf(...)");
            this.D = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.C;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i12 = i7 != -1 ? i7 : i8 - 3; i12 >= 0; i12 -= 3) {
            int i13 = i12 + 2;
            long j = jArr2[i13];
            if ((((int) j) & 33554431) == i11) {
                jArr2[i13] = (((long) Math.min((i8 - i12) / 3, 1023)) << 50) | (j & k3.a.a);
                return;
            }
        }
    }

    public boolean r() {
        ColorStateList colorStateList;
        return ((Shader) this.C) == null && (colorStateList = (ColorStateList) this.D) != null && colorStateList.isStateful();
    }

    public void s(s7.r rVar, int i, int i2, t tVar, int i3, Object obj, long j, long j2) {
        h(new d0(this, rVar, new s7.w(i, i2, tVar, i3, obj, i0.W(j), i0.W(j2)), 1));
    }

    public void t(s7.r rVar, int i, int i2, t tVar, int i3, Object obj, long j, long j2) {
        h(new d0(this, rVar, new s7.w(i, i2, tVar, i3, obj, i0.W(j), i0.W(j2)), 0));
    }

    public String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((x) this.C) == x.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.B);
                sb.append(' ');
                sb.append((String) this.D);
                String string = sb.toString();
                m.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 18:
                return n();
            default:
                return super.toString();
        }
    }

    public void u(s7.r rVar, int i, int i2, t tVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new s7.e0(this, rVar, new s7.w(i, i2, tVar, i3, obj, i0.W(j), i0.W(j2)), iOException, z));
    }

    public void v(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.C;
        Context context = imageView.getContext();
        int[] iArr = j.a.f;
        x0 x0VarK = x0.K(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = j0.a;
        h0.b(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = p30.f.f0(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int i2 = e1.a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(x0VarK.t(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(e1.a(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            x0VarK.O();
        }
    }

    public void w(s7.r rVar, int i, int i2, t tVar, int i3, Object obj, long j, long j2, int i4) {
        h(new n1(this, rVar, new s7.w(i, i2, tVar, i3, obj, i0.W(j), i0.W(j2)), i4));
    }

    public h z(Object obj, Object obj2) {
        int i = (this.B + 1) * 2;
        Object[] objArr = (Object[]) this.C;
        if (i > objArr.length) {
            this.C = Arrays.copyOf(objArr, fh.n0.b(objArr.length, i));
        }
        fh.w.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.C;
        int i2 = this.B;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.B = i2 + 1;
        return this;
    }

    public void z0() {
        u uVar = (u) this.D;
        byte[] bArr = i0.b;
        uVar.getClass();
        uVar.L(bArr.length, bArr);
    }
}
