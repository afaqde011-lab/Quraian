package a1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.RuntimeVersion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

public class u0 implements a30.a, a30.c, ma.b, xf.c, g7.e, x8.k {
    public final int A;
    public Object B;
    public Object C;

    public u0(int i10) {
        this.A = i10;
        switch (i10) {
            case 9:
                this.B = new u.s0(0);
                this.C = new u.q((Object) null);
                break;
            case 11:
                this.B = new m1.e(0, new Reference[16]);
                this.C = new ReferenceQueue();
                break;
            case 13:
                this.B = Collections.synchronizedMap(new WeakHashMap());
                this.C = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 28:
                this.B = new e7.u();
                this.C = new g9.a();
                break;
            default:
                this.B = new m1.e(0, new b3.l0[16]);
                break;
        }
    }

    public u0(int i10, boolean z10) {
        this.A = i10;
    }

    public u0(u0 u0Var) {
        m1.e eVar;
        this.A = 1;
        this.B = new m1.e(0, new q[16]);
        this.C = new m1.e(0, new q[16]);
        if (u0Var == null || (eVar = (m1.e) u0Var.B) == null) {
            return;
        }
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            q qVar = (q) objArr[i11];
            ((m1.e) this.B).b(new q(qVar.f112a, qVar.f113b, qVar.f114c, qVar.f115d));
        }
    }

    public u0(u0 u0Var, xf.g gVar) {
        this.A = 14;
        this.B = gVar;
        Objects.requireNonNull(u0Var);
        this.C = u0Var;
    }

    public u0(a8.l lVar) {
        this.A = 4;
        this.B = lVar;
        this.C = new Object();
    }

    public u0(a8.l lVar, String str) {
        this.A = 25;
        kotlin.jvm.internal.m.e(str, "className");
        this.C = lVar;
        this.B = str;
    }

    public u0(a8.n nVar) {
        this.A = 3;
        this.B = nVar;
        this.C = new AtomicBoolean(false);
    }

    public u0(Context context, int i10) {
        this.A = i10;
        switch (i10) {
            case 23:
                this.B = context;
                break;
            case 27:
                bg.b bVar = new bg.b(2);
                this.B = context.getApplicationContext();
                this.C = bVar;
                break;
            default:
                com.google.android.gms.common.internal.d0.h(context);
                Resources resources = context.getResources();
                this.B = resources;
                this.C = resources.getResourcePackageName(2131886350);
                break;
        }
    }

    public u0(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.A = 5;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.C = Collections.synchronizedSet(new HashSet());
        this.B = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
    }

    public u0(View view) {
        this.A = 0;
        this.B = view;
        this.C = rd.a.I(g00.i.C, new z(this, 1));
    }

    public u0(b3.l0 l0Var, z2.w0 w0Var) {
        this.A = 6;
        this.B = l0Var;
        this.C = l1.q.z(w0Var);
    }

    public u0(c20.e eVar) {
        this.A = 22;
        d30.l lVar = new d30.l("Type parameter upper bound erasure results");
        this.B = rd.a.J(new a30.l(this, 29));
        this.C = lVar.b(new a20.d(this, 13));
    }

    public u0(ca.p pVar, ma.b bVar) {
        this.A = 12;
        kotlin.jvm.internal.m.e(bVar, "actual");
        this.C = pVar;
        this.B = bVar;
    }

    public u0(j10.z zVar, oj.q qVar, z20.a aVar) {
        this.A = 2;
        kotlin.jvm.internal.m.e(zVar, "module");
        kotlin.jvm.internal.m.e(aVar, "protocol");
        this.B = aVar;
        this.C = new l9.f0(zVar, qVar);
    }

    public u0(Object obj) {
        this.A = 18;
        this.C = obj;
        this.B = Thread.currentThread();
    }

    public u0(String str) {
        this.A = 20;
        this.B = str.concat(".lck");
    }

    public u0(Map map, List list) {
        this.A = 21;
        this.B = map;
        this.C = list;
    }

    public u0(o10.b bVar, h7.b bVar2) {
        this.A = 29;
        this.C = bVar2;
        bVar.x(new gi.b(this, 0));
        this.B = new HashSet();
    }

    public u0(rc.c cVar) {
        this.A = 10;
        kotlin.jvm.internal.m.e(cVar, "amplitude");
        this.B = cVar;
        this.C = rd.a.J(new b3.j0(this, 3));
    }

    public u0(s50.a aVar) {
        this.A = 19;
        this.B = aVar;
        this.C = new ArrayList();
    }

    public u0(th.o oVar, HashMap map, HashMap map2) {
        this.A = 26;
        this.B = oVar;
        this.C = map;
    }

    public u0(u00.k kVar) {
        this.A = 17;
        this.B = kVar;
        this.C = new ConcurrentHashMap();
    }

    public static void o(u0 u0Var, boolean z10, boolean z11) {
        synchronized (u0Var) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) u0Var.C) == null) {
                    if (((Context) u0Var.B).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e7.a.m("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) u0Var.B).getSystemService("power");
                    if (powerManager == null) {
                        e7.a.m("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        u0Var.C = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) u0Var.C;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static String u(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static void z(b3.l0 l0Var) {
        if (l0Var.f2069q0 > 0) {
            if (l0Var.f2060h0.f2112d == b3.f0.E && !l0Var.q() && !l0Var.r() && !l0Var.f2070r0 && l0Var.K()) {
                b2.q qVar = (b2.q) l0Var.f2059g0.G;
                if ((qVar.D & 256) != 0) {
                    while (qVar != null) {
                        if ((qVar.C & 256) != 0) {
                            ?? E = qVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof b3.p) {
                                    b3.p pVar = (b3.p) E;
                                    pVar.W(b3.m.v(pVar, 256));
                                } else if ((E.C & 256) != 0 && (E instanceof b3.l)) {
                                    b2.q qVar2 = ((b3.l) E).P;
                                    int i10 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.C & 256) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                E = qVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.F;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                E = b3.m.e(eVar);
                            }
                        }
                        if ((qVar.D & 256) == 0) {
                            break;
                        } else {
                            qVar = qVar.F;
                        }
                    }
                }
            }
            l0Var.f2068p0 = false;
            m1.e eVarB = l0Var.B();
            Object[] objArr = eVarB.A;
            int i11 = eVarB.C;
            for (int i12 = 0; i12 < i11; i12++) {
                z((b3.l0) objArr[i12]);
            }
        }
    }

    public void A(int i10) {
        int[] iArr = (int[]) this.B;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.B = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.B = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.B;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void B(String str, String str2, u00.k kVar) {
        LinkedHashMap linkedHashMap = ((a8.l) this.C).A;
        f20.p pVar = new f20.p(this, str, str2);
        kVar.invoke(pVar);
        String str3 = (String) this.B;
        ArrayList arrayList = pVar.b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((g00.k) it.next()).A);
        }
        String strG = (String) pVar.c.A;
        kotlin.jvm.internal.m.e(strG, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        sb2.append(h00.q.R0(arrayList2, RuntimeVersion.SUFFIX, (String) null, (String) null, g20.q.A, 30));
        sb2.append(')');
        if (strG.length() > 1) {
            strG = oi.k.g(';', "L", strG);
        }
        sb2.append(strG);
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(str3, "internalName");
        kotlin.jvm.internal.m.e(string, "jvmDescriptor");
        String str4 = str3 + '.' + string;
        f20.r rVar = (f20.r) pVar.c.B;
        ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((f20.r) ((g00.k) it2.next()).B);
        }
        linkedHashMap.put(str4, new f20.n(rVar, arrayList3, pVar.a));
    }

    public dk.o C(TypeToken typeToken, boolean z10) {
        dk.o oVar;
        String str;
        dk.o aVar;
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.B;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        final int i10 = 1;
        final int i11 = 0;
        a8.n nVar = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            oVar = new dk.o() {
                @Override
                public final Object j() {
                    switch (i11) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                    }
                }
            };
        } else {
            oVar = rawType == EnumMap.class ? new dk.o() {
                @Override
                public final Object j() {
                    switch (i10) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                    }
                }
            } : null;
        }
        if (oVar != null) {
            return oVar;
        }
        dk.h.f((List) this.C);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            aVar = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                k00.f fVar = gk.c.f6361a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e3) {
                    str = "Failed making constructor '" + gk.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e3.getMessage() + gk.c.e(e3);
                }
                aVar = str != null ? new dk.a(str, i10) : new ab.r(declaredConstructor, 8);
            } catch (NoSuchMethodException unused) {
                aVar = null;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(ArrayList.class)) {
                nVar = new a8.n(25);
            } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                nVar = new a8.n(26);
            } else if (rawType.isAssignableFrom(TreeSet.class)) {
                nVar = new a8.n(27);
            } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                nVar = new a8.n(28);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(dk.n.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || dk.h.h(actualTypeArguments[0]) != String.class) {
                        if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                            nVar = new a8.n(21);
                        } else if (rawType.isAssignableFrom(TreeMap.class)) {
                            nVar = new a8.n(22);
                        } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                            nVar = new a8.n(23);
                        } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            nVar = new a8.n(24);
                        }
                    }
                }
                nVar = new a8.n(29);
            } else if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                nVar = new a8.n(21);
            } else if (rawType.isAssignableFrom(TreeMap.class)) {
                nVar = new a8.n(22);
            } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                nVar = new a8.n(23);
            } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                nVar = new a8.n(24);
            }
        }
        if (nVar != null) {
            return nVar;
        }
        String strU = u(rawType);
        if (strU != null) {
            return new dk.a(strU, i11);
        }
        if (z10) {
            return new ab.r(rawType, 9);
        }
        return new dk.a("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.", 2);
    }

    @Override
    public void D(byte[] bArr, int i10, int i11, x8.j jVar, e7.h hVar) {
        g9.c cVarD;
        String strTrim;
        int i12;
        String string;
        int i13;
        Matcher matcher;
        String strGroup;
        byte b7;
        boolean z10;
        u0 u0Var = this;
        e7.u uVar = (e7.u) u0Var.B;
        uVar.L(i10 + i11, bArr);
        uVar.N(i10);
        ArrayList arrayList = new ArrayList();
        try {
            g9.i.c(uVar);
            while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z11 = false;
                int i14 = -1;
                int i15 = 0;
                byte b10 = -1;
                while (true) {
                    int i16 = 1;
                    if (b10 == -1) {
                        i15 = uVar.f5183b;
                        String strN = uVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b10 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b10 = 2;
                        } else {
                            b10 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        uVar.N(i15);
                        if (b10 == 0) {
                            a10.h0.O(new i(arrayList2), jVar, hVar);
                            return;
                        }
                        if (b10 == 1) {
                            while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b10 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                uVar.n(StandardCharsets.UTF_8);
                                g9.a aVar = (g9.a) u0Var.C;
                                e7.u uVar2 = aVar.f6244a;
                                StringBuilder sb2 = aVar.f6245b;
                                sb2.setLength(0);
                                int i17 = uVar.f5183b;
                                while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
                                }
                                uVar2.L(uVar.f5183b, uVar.f5182a);
                                uVar2.N(i17);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    g9.a.c(uVar2);
                                    if (uVar2.a() >= 5 && "::cue".equals(uVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i18 = uVar2.f5183b;
                                        String strB = g9.a.b(uVar2, sb2);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            uVar2.N(i18);
                                            strTrim = RuntimeVersion.SUFFIX;
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i19 = uVar2.f5183b;
                                                int i20 = uVar2.f5184c;
                                                int i21 = z11 ? 1 : 0;
                                                while (i19 < i20 && i21 == 0) {
                                                    int i22 = i19 + 1;
                                                    i21 = ((char) uVar2.f5182a[i19]) == ')' ? i16 : z11 ? 1 : 0;
                                                    i19 = i22;
                                                }
                                                strTrim = uVar2.y((i19 - 1) - uVar2.f5183b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(g9.a.b(uVar2, sb2))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(g9.a.b(uVar2, sb2))) {
                                        g9.b bVar = new g9.b();
                                        bVar.f6246a = RuntimeVersion.SUFFIX;
                                        bVar.f6247b = RuntimeVersion.SUFFIX;
                                        bVar.f6248c = Collections.EMPTY_SET;
                                        bVar.f6249d = RuntimeVersion.SUFFIX;
                                        bVar.f6250e = str;
                                        bVar.f6252g = z11;
                                        bVar.f6254i = z11;
                                        bVar.f6255j = i14;
                                        bVar.f6256k = i14;
                                        bVar.l = i14;
                                        bVar.m = i14;
                                        bVar.f6257n = i14;
                                        bVar.f6259p = i14;
                                        bVar.f6260q = z11;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i14) {
                                                Matcher matcher2 = g9.a.f6242c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i16);
                                                    strGroup2.getClass();
                                                    bVar.f6249d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z11 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = e7.i0.f5136a;
                                            String[] strArrSplit = strTrim.split("\\.", i14);
                                            String str3 = strArrSplit[z11 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i14) {
                                                bVar.f6247b = str3.substring(z11 ? 1 : 0, iIndexOf2);
                                                bVar.f6246a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                bVar.f6247b = str3;
                                            }
                                            if (strArrSplit.length > i16) {
                                                int length = strArrSplit.length;
                                                ta.c0.s(length <= strArrSplit.length ? i16 : z11 ? 1 : 0);
                                                bVar.f6248c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i16, length)));
                                            }
                                        }
                                        ?? r10 = z11 ? 1 : 0;
                                        String strB2 = str;
                                        while (r10 == 0) {
                                            int i23 = uVar2.f5183b;
                                            strB2 = g9.a.b(uVar2, sb2);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i16 : z11;
                                            if (r15 == 0) {
                                                uVar2.N(i23);
                                                g9.a.c(uVar2);
                                                String strA = g9.a.a(uVar2, sb2);
                                                if (!strA.isEmpty() && ":".equals(g9.a.b(uVar2, sb2))) {
                                                    g9.a.c(uVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z12 = false;
                                                    while (true) {
                                                        if (z12) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i24 = uVar2.f5183b;
                                                            String strB3 = g9.a.b(uVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                uVar2.N(i24);
                                                                z12 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i12 = 1;
                                                    } else {
                                                        int i25 = uVar2.f5183b;
                                                        String strB4 = g9.a.b(uVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i13 = 1;
                                                                bVar.f6251f = e7.f.a(string, true);
                                                                bVar.f6252g = true;
                                                            } else {
                                                                i13 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f6253h = e7.f.a(string, true);
                                                                    bVar.f6254i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                        bVar.f6260q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i13 = 1;
                                                                            bVar.f6256k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f6250e = w00.a.I(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i13 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = g9.a.f6243d.matcher(w00.a.I(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b7 = 0;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i12);
                                                                                        strGroup3.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b7 = 1;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i12);
                                                                                        strGroup4.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b7 = 2;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i12);
                                                                                        strGroup5.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b7 = -1;
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup6 = matcher.group(i12);
                                                                                strGroup6.getClass();
                                                                                bVar.f6258o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                e7.a.m("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i13 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i12 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f6259p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f6259p = 2;
                                                                    i12 = 1;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            i12 = i13;
                                                        } else if ("}".equals(strB4)) {
                                                            uVar2.N(i25);
                                                            if ("color".equals(strA)) {
                                                                i13 = 1;
                                                                bVar.f6251f = e7.f.a(string, true);
                                                                bVar.f6252g = true;
                                                            } else {
                                                                i13 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f6253h = e7.f.a(string, true);
                                                                    bVar.f6254i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        bVar.f6260q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i13 = 1;
                                                                            bVar.f6256k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f6250e = w00.a.I(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i13 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = g9.a.f6243d.matcher(w00.a.I(string));
                                                                            if (matcher.matches()) {
                                                                                e7.a.m("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b7 = 0;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i12);
                                                                                        strGroup7.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b7 = 1;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i12);
                                                                                        strGroup8.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b7 = 2;
                                                                                        }
                                                                                        switch (b7) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f6257n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i12);
                                                                                        strGroup9.getClass();
                                                                                        bVar.f6258o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b7 = -1;
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i12 = 1;
                                                                                        bVar.f6257n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup10 = matcher.group(i12);
                                                                                strGroup10.getClass();
                                                                                bVar.f6258o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i13 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i12 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f6259p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f6259p = 2;
                                                                    i12 = 1;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            i12 = i13;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i12 = i16;
                                                }
                                            } else {
                                                i12 = i16;
                                            }
                                            i16 = i12;
                                            r10 = r15;
                                            z11 = false;
                                        }
                                        int i26 = i16;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(bVar);
                                        }
                                        i16 = i26;
                                        z11 = false;
                                        i14 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b10 == 3) {
                                Pattern pattern = g9.h.f6282a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = uVar.n(charset);
                                if (strN2 == null) {
                                    cVarD = null;
                                } else {
                                    Pattern pattern2 = g9.h.f6282a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        cVarD = g9.h.d(null, matcher3, uVar, arrayList);
                                    } else {
                                        cVarD = null;
                                        String strN3 = uVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                cVarD = g9.h.d(strN2.trim(), matcher4, uVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVarD != null) {
                                    arrayList2.add(cVarD);
                                }
                            }
                            u0Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public Object E(Class cls) {
        kotlin.jvm.internal.m.e(cls, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.C;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((u00.k) this.B).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    public e30.z0 F(c20.a aVar) {
        e30.z0 z0VarZ0;
        e30.a0 a0Var = aVar.f;
        return (a0Var == null || (z0VarZ0 = ab.a0.z0(a0Var)) == null) ? (g30.i) ((g00.p) this.B).getValue() : z0VarZ0;
    }

    public e30.w G(j10.r0 r0Var, c20.a aVar) {
        kotlin.jvm.internal.m.e(r0Var, "typeParameter");
        kotlin.jvm.internal.m.e(aVar, "typeAttr");
        return (e30.w) ((d30.e) this.C).invoke(new e30.o0(r0Var, aVar));
    }

    public a8.q H(Object... objArr) {
        Constructor constructorB;
        synchronized (((AtomicBoolean) this.C)) {
            if (!((AtomicBoolean) this.C).get()) {
                try {
                    constructorB = ((a8.n) this.B).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.C).set(true);
                    constructorB = null;
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            constructorB = null;
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (a8.q) constructorB.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public InputMethodManager I() {
        return (InputMethodManager) this.C.getValue();
    }

    public z2.w0 J() {
        return (z2.w0) ((l1.i1) this.C).getValue();
    }

    public String K(String str) {
        String str2 = (String) this.C;
        Resources resources = (Resources) this.B;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public k10.c L(i20.h hVar, k20.g gVar) {
        kotlin.jvm.internal.m.e(hVar, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        return ((l9.f0) this.C).f(hVar, gVar);
    }

    public void M() throws IOException {
        String str = (String) this.B;
        if (((FileChannel) this.C) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.C = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.C;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.C = null;
            throw new IllegalStateException(b.p("Unable to lock file: '", str, "'."), th2);
        }
    }

    public void N(int i10, int i11) {
        int[] iArr = (int[]) this.B;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        A(i12);
        int[] iArr2 = (int[]) this.B;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.B, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.C;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ba.l1 l1Var = (ba.l1) ((ArrayList) this.C).get(size);
            int i13 = l1Var.A;
            if (i13 >= i10) {
                l1Var.A = i13 + i11;
            }
        }
    }

    public void O(int i10, int i11) {
        int[] iArr = (int[]) this.B;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        A(i12);
        int[] iArr2 = (int[]) this.B;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.B;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.C;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ba.l1 l1Var = (ba.l1) ((ArrayList) this.C).get(size);
            int i13 = l1Var.A;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.C).remove(size);
                } else {
                    l1Var.A = i13 - i11;
                }
            }
        }
    }

    public androidx.media3.common.w0 P(ba.f1 f1Var, int i10) {
        ba.q1 q1Var;
        androidx.media3.common.w0 w0Var;
        u.s0 s0Var = (u.s0) this.B;
        int iE = s0Var.e(f1Var);
        if (iE >= 0 && (q1Var = (ba.q1) s0Var.j(iE)) != null) {
            int i11 = q1Var.f2397a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                q1Var.f2397a = i12;
                if (i10 == 4) {
                    w0Var = q1Var.f2398b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    w0Var = q1Var.f2399c;
                }
                if ((i12 & 12) == 0) {
                    s0Var.h(iE);
                    q1Var.f2397a = 0;
                    q1Var.f2398b = null;
                    q1Var.f2399c = null;
                    ba.q1.f2396d.c(q1Var);
                }
                return w0Var;
            }
        }
        return null;
    }

    public void Q(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.C).add(sVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        sVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.B;
        hVar.f496a.registerCallback(sVar.f1803a, handler);
        synchronized (hVar.f497b) {
            if (hVar.f500e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(sVar);
                hVar.f499d.put(sVar, gVar);
                sVar.f1805c = gVar;
                try {
                    hVar.f500e.a().s(gVar);
                    sVar.e(13, null, null);
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
                }
            } else {
                sVar.f1805c = null;
                hVar.f498c.add(sVar);
            }
        }
    }

    public ab.m R(hb.i iVar) {
        ab.m mVarC;
        kotlin.jvm.internal.m.e(iVar, "id");
        synchronized (this.C) {
            mVarC = ((a8.l) this.B).c(iVar);
        }
        return mVarC;
    }

    public void S(ba.f1 f1Var) {
        ba.q1 q1Var = (ba.q1) ((u.s0) this.B).get(f1Var);
        if (q1Var == null) {
            return;
        }
        q1Var.f2397a &= -2;
    }

    public void T(ba.f1 f1Var) {
        u.q qVar = (u.q) this.C;
        for (int iG = qVar.g() - 1; iG >= 0; iG--) {
            if (f1Var == qVar.h(iG)) {
                Object[] objArr = qVar.C;
                Object obj = objArr[iG];
                Object obj2 = u.r.f14887a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                qVar.A = true;
                break;
            }
        }
        ba.q1 q1Var = (ba.q1) ((u.s0) this.B).remove(f1Var);
        if (q1Var != null) {
            q1Var.f2397a = 0;
            q1Var.f2398b = null;
            q1Var.f2399c = null;
            ba.q1.f2396d.c(q1Var);
        }
    }

    public i00.i U(e30.u0 u0Var, List list, c20.a aVar) throws NoWhenBranchMatchedException {
        e30.z0 z0VarR;
        i00.i iVar = new i00.i();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            e30.w wVar = (e30.w) it.next();
            j10.r0 r0VarG = wVar.m0().g();
            if (r0VarG instanceof j10.e) {
                Set set = aVar.e;
                e30.q qVarY0 = wVar.y0();
                if (qVarY0 instanceof e30.q) {
                    e30.q qVar = qVarY0;
                    e30.a0 a0VarR = qVar.B;
                    if (!a0VarR.m0().getParameters().isEmpty() && a0VarR.m0().g() != null) {
                        List<j10.r0> parameters = a0VarR.m0().getParameters();
                        kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(h00.r.q0(parameters, 10));
                        for (j10.r0 r0Var : parameters) {
                            e30.f0 f0Var = (e30.p0) h00.q.O0(r0Var.getIndex(), wVar.e0());
                            boolean z10 = set != null && set.contains(r0Var);
                            if (f0Var == null || z10) {
                                f0Var = new e30.f0(r0Var);
                            } else {
                                e30.s0 s0VarF = u0Var.f();
                                e30.w wVarB = f0Var.b();
                                kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                                if (s0VarF.d(wVarB) == null) {
                                    f0Var = new e30.f0(r0Var);
                                }
                            }
                            arrayList.add(f0Var);
                        }
                        a0VarR = e30.c.r(a0VarR, arrayList, (e30.h0) null, 2);
                    }
                    e30.a0 a0VarR2 = qVar.C;
                    if (!a0VarR2.m0().getParameters().isEmpty() && a0VarR2.m0().g() != null) {
                        List<j10.r0> parameters2 = a0VarR2.m0().getParameters();
                        kotlin.jvm.internal.m.d(parameters2, "getParameters(...)");
                        ArrayList arrayList2 = new ArrayList(h00.r.q0(parameters2, 10));
                        for (j10.r0 r0Var2 : parameters2) {
                            e30.f0 f0Var2 = (e30.p0) h00.q.O0(r0Var2.getIndex(), wVar.e0());
                            boolean z11 = set != null && set.contains(r0Var2);
                            if (f0Var2 == null || z11) {
                                f0Var2 = new e30.f0(r0Var2);
                            } else {
                                e30.s0 s0VarF2 = u0Var.f();
                                e30.w wVarB2 = f0Var2.b();
                                kotlin.jvm.internal.m.d(wVarB2, "getType(...)");
                                if (s0VarF2.d(wVarB2) == null) {
                                    f0Var2 = new e30.f0(r0Var2);
                                }
                            }
                            arrayList2.add(f0Var2);
                        }
                        a0VarR2 = e30.c.r(a0VarR2, arrayList2, (e30.h0) null, 2);
                    }
                    z0VarR = e30.c.f(a0VarR, a0VarR2);
                } else {
                    if (!(qVarY0 instanceof e30.a0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e30.z0 z0Var = (e30.a0) qVarY0;
                    if (z0Var.m0().getParameters().isEmpty() || z0Var.m0().g() == null) {
                        z0VarR = z0Var;
                    } else {
                        List<j10.r0> parameters3 = z0Var.m0().getParameters();
                        kotlin.jvm.internal.m.d(parameters3, "getParameters(...)");
                        ArrayList arrayList3 = new ArrayList(h00.r.q0(parameters3, 10));
                        for (j10.r0 r0Var3 : parameters3) {
                            e30.f0 f0Var3 = (e30.p0) h00.q.O0(r0Var3.getIndex(), wVar.e0());
                            boolean z12 = set != null && set.contains(r0Var3);
                            if (f0Var3 == null || z12) {
                                f0Var3 = new e30.f0(r0Var3);
                            } else {
                                e30.s0 s0VarF3 = u0Var.f();
                                e30.w wVarB3 = f0Var3.b();
                                kotlin.jvm.internal.m.d(wVarB3, "getType(...)");
                                if (s0VarF3.d(wVarB3) == null) {
                                    f0Var3 = new e30.f0(r0Var3);
                                }
                            }
                            arrayList3.add(f0Var3);
                        }
                        z0VarR = e30.c.r(z0Var, arrayList3, (e30.h0) null, 2);
                    }
                }
                iVar.add(u0Var.g(e30.c.i(z0VarR, qVarY0), e30.a1.E));
            } else if (r0VarG instanceof j10.r0) {
                Set set2 = aVar.e;
                if (set2 == null || !set2.contains(r0VarG)) {
                    List upperBounds = r0VarG.getUpperBounds();
                    kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
                    iVar.addAll(U(u0Var, upperBounds, aVar));
                } else {
                    iVar.add(F(aVar));
                }
            }
        }
        return w50.c.m(iVar);
    }

    public ab.m V(hb.i iVar) {
        ab.m mVarE;
        synchronized (this.C) {
            mVarE = ((a8.l) this.B).e(iVar);
        }
        return mVarE;
    }

    public void W(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.C).remove(sVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.B).b(sVar);
        } finally {
            sVar.f(null);
        }
    }

    public oj.q X(n20.e eVar, String str) {
        kotlin.jvm.internal.m.e(eVar, "name");
        String strB = eVar.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return new oj.q(this, new g20.p(strB.concat(str)));
    }

    public void Y(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.B;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.C;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((xf.g) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public Object a(a30.x xVar, i20.j0 j0Var, e30.w wVar) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        i20.e eVar = (i20.e) w00.a.u(j0Var, ((z20.a) this.B).i);
        if (eVar == null) {
            return null;
        }
        return ((l9.f0) this.C).q(wVar, eVar, (k20.g) xVar.B);
    }

    public List b(a30.x xVar, o20.b bVar, int i10, int i11, i20.c1 c1Var) {
        kotlin.jvm.internal.m.e(bVar, "callableProto");
        g4.c.q(i10, "kind");
        kotlin.jvm.internal.m.e(c1Var, "proto");
        h00.x xVar2 = (List) c1Var.i(((z20.a) this.B).j);
        if (xVar2 == null) {
            xVar2 = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar2, 10));
        Iterator it = xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    public List c(a30.x xVar, o20.b bVar, int i10, int i11, i20.c1 c1Var) {
        kotlin.jvm.internal.m.e(bVar, "callableProto");
        g4.c.q(i10, "kind");
        List listB = c1Var != null ? b(xVar, bVar, i10, i11, c1Var) : null;
        return listB == null ? h00.x.A : listB;
    }

    public List d(a30.x xVar, i20.w wVar) {
        kotlin.jvm.internal.m.e(xVar, "container");
        h00.x xVar2 = (List) wVar.i(((z20.a) this.B).h);
        if (xVar2 == null) {
            xVar2 = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar2, 10));
        Iterator it = xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    public ArrayList e(a30.v vVar) {
        kotlin.jvm.internal.m.e(vVar, "container");
        h00.x xVar = (List) vVar.E.i(((z20.a) this.B).c);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar, 10));
        Iterator it = xVar.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) ((a30.x) vVar).B));
        }
        return arrayList;
    }

    public List f(a30.x xVar, o20.b bVar, int i10) {
        List list;
        z20.a aVar = (z20.a) this.B;
        kotlin.jvm.internal.m.e(bVar, "proto");
        g4.c.q(i10, "kind");
        if (bVar instanceof i20.n) {
            list = (List) ((i20.n) bVar).i(aVar.b);
        } else if (bVar instanceof i20.b0) {
            list = (List) ((i20.b0) bVar).i(aVar.d);
        } else {
            if (!(bVar instanceof i20.j0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int iB = e4.f.b(i10);
            if (iB == 1) {
                list = (List) ((i20.j0) bVar).i(aVar.e);
            } else if (iB == 2) {
                list = (List) ((i20.j0) bVar).i(aVar.f);
            } else {
                if (iB != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((i20.j0) bVar).i(aVar.g);
            }
        }
        if (list == null) {
            list = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    @Override
    public ma.a g(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        kotlin.jvm.internal.m.e(str, "fileName");
        ca.p pVar = (ca.p) this.C;
        if (!str.equals(":memory:")) {
            str = ((ca.a) pVar.f3067d).f3015a.getDatabasePath(str).getAbsolutePath();
            kotlin.jvm.internal.m.b(str);
        }
        boolean z10 = true;
        da.a aVar = new da.a(str, (pVar.f3065b || pVar.f3066c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f4842a;
        reentrantLock.lock();
        u0 u0Var = aVar.f4843b;
        if (u0Var != null) {
            try {
                u0Var.M();
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
            }
        }
        try {
            try {
                if (pVar.f3066c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                ma.a aVarG = ((ma.b) this.B).g(str);
                if (pVar.f3065b) {
                    ca.p.f(aVarG);
                    if (((ca.a) pVar.f3067d).f3021g == ca.s.C) {
                        a10.h0.v(aVarG, "PRAGMA synchronous = NORMAL");
                    } else {
                        a10.h0.v(aVarG, "PRAGMA synchronous = FULL");
                    }
                    ((ba.y) pVar.f3068e).s(aVarG);
                } else {
                    try {
                        pVar.f3066c = true;
                        ca.p.a(pVar, aVarG);
                        pVar.f3066c = false;
                    } catch (Throwable th3) {
                        pVar.f3066c = false;
                        throw th3;
                    }
                }
                if (u0Var != null && (fileChannel2 = (FileChannel) u0Var.C) != null) {
                    try {
                        fileChannel2.close();
                        u0Var.C = null;
                    } catch (Throwable th4) {
                        u0Var.C = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return aVarG;
            } catch (Throwable th5) {
                if (u0Var != null && (fileChannel = (FileChannel) u0Var.C) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        u0Var.C = null;
                    }
                }
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th = th6;
        try {
            if (z10) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th7) {
            reentrantLock.unlock();
            throw th7;
        }
    }

    public List h(a30.x xVar, i20.j0 j0Var) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        ((z20.a) this.B).getClass();
        h00.x xVar2 = h00.x.A;
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar2, 10));
        Iterator it = xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    public List i(a30.x xVar, i20.j0 j0Var) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        ((z20.a) this.B).getClass();
        h00.x xVar2 = h00.x.A;
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar2, 10));
        Iterator it = xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    public List j(a30.x xVar, o20.b bVar, int i10) {
        String str;
        z20.a aVar = (z20.a) this.B;
        kotlin.jvm.internal.m.e(bVar, "proto");
        g4.c.q(i10, "kind");
        if (bVar instanceof i20.b0) {
            aVar.getClass();
        } else {
            if (!(bVar instanceof i20.j0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int iB = e4.f.b(i10);
            if (iB != 1 && iB != 2 && iB != 3) {
                if (i10 == 1) {
                    str = "FUNCTION";
                } else if (i10 == 2) {
                    str = "PROPERTY";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            aVar.getClass();
        }
        h00.x xVar2 = h00.x.A;
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar2, 10));
        Iterator it = xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), (k20.g) xVar.B));
        }
        return arrayList;
    }

    public ArrayList k(i20.u0 u0Var, k20.g gVar) {
        kotlin.jvm.internal.m.e(u0Var, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        h00.x xVar = (List) u0Var.i(((z20.a) this.B).k);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar, 10));
        Iterator it = xVar.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), gVar));
        }
        return arrayList;
    }

    public ArrayList l(i20.z0 z0Var, k20.g gVar) {
        kotlin.jvm.internal.m.e(z0Var, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        h00.x xVar = (List) z0Var.i(((z20.a) this.B).l);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(xVar, 10));
        Iterator it = xVar.iterator();
        while (it.hasNext()) {
            arrayList.add(L((i20.h) it.next(), gVar));
        }
        return arrayList;
    }

    public Object n(a30.x xVar, i20.j0 j0Var, e30.w wVar) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        return null;
    }

    @Override
    public void onComplete(Task task) {
        ((Map) ((u0) this.C).C).remove((xf.g) this.B);
    }

    @Override
    public int p() {
        return 1;
    }

    @Override
    public boolean q() {
        return ((ma.b) this.B).q();
    }

    public void r(ba.f1 f1Var, androidx.media3.common.w0 w0Var) {
        u.s0 s0Var = (u.s0) this.B;
        ba.q1 q1VarA = (ba.q1) s0Var.get(f1Var);
        if (q1VarA == null) {
            q1VarA = ba.q1.a();
            s0Var.put(f1Var, q1VarA);
        }
        q1VarA.f2399c = w0Var;
        q1VarA.f2397a |= 8;
    }

    public void s(q qVar, int i10, int i11, int i12) {
        int i13;
        m1.e eVar = (m1.e) this.C;
        int i14 = eVar.C;
        if (i14 == 0) {
            i13 = 0;
        } else {
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            q qVar2 = (q) eVar.A[i14 - 1];
            i13 = qVar2.f113b - qVar2.f115d;
        }
        if (qVar == null) {
            int i15 = i10 - i13;
            qVar = new q(i10, i11 + i12, i15, (i11 - i10) + i15);
        } else {
            if (qVar.f112a > i10) {
                qVar.f112a = i10;
                qVar.f114c = i10;
            }
            int i16 = qVar.f113b;
            if (i11 > i16) {
                int i17 = i16 - qVar.f115d;
                qVar.f113b = i11;
                qVar.f115d = i11 - i17;
            }
            qVar.f113b += i12;
        }
        eVar.b(qVar);
    }

    @Override
    public g7.f t() {
        return new g7.k((Context) this.B, ((bg.b) this.C).t());
    }

    public String toString() {
        switch (this.A) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
                m1.e eVar = (m1.e) this.B;
                Object[] objArr = eVar.A;
                int i10 = eVar.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    q qVar = (q) objArr[i11];
                    sb2.append("(" + qVar.f114c + ',' + qVar.f115d + ")->(" + qVar.f112a + ',' + qVar.f113b + ')');
                    if (i11 < ((m1.e) this.B).C - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                return sb2.toString();
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return ((Map) this.B).toString();
            default:
                return super.toString();
        }
    }

    public void v() {
        int[] iArr = (int[]) this.B;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.C = null;
    }

    public void w() {
        ((m1.e) this.B).g();
    }

    public boolean x(hb.i iVar) {
        boolean zContainsKey;
        synchronized (this.C) {
            zContainsKey = ((a8.l) this.B).A.containsKey(iVar);
        }
        return zContainsKey;
    }

    public void y() {
        Object[] objArr;
        m1.e eVar = (m1.e) this.B;
        eVar.n(b3.x1.B);
        int i10 = eVar.C;
        b3.l0[] l0VarArr = (b3.l0[]) this.C;
        if (l0VarArr != null) {
            int length = l0VarArr.length;
            objArr = l0VarArr;
            if (length < i10) {
                objArr = new b3.l0[Math.max(16, i10)];
            }
        } else {
            objArr = new b3.l0[Math.max(16, i10)];
        }
        this.C = null;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.A[i11];
        }
        eVar.g();
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.C = objArr;
                return;
            }
            b3.l0 l0Var = objArr[i10];
            kotlin.jvm.internal.m.b(l0Var);
            if (l0Var.f2068p0) {
                z(l0Var);
            }
            objArr[i10] = 0;
        }
    }
}
