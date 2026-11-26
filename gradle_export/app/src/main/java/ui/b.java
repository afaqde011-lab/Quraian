package ui;

import a30.b0;
import a30.c0;
import a30.d0;
import a30.i;
import a30.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.work.impl.WorkDatabase;
import b50.o;
import c30.v;
import ca.u;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion;
import e30.a0;
import e30.a1;
import e30.h0;
import e30.m0;
import e30.w;
import g20.l;
import h00.q;
import h00.r;
import h00.x;
import h00.y;
import h9.f;
import hb.p;
import i20.s0;
import i20.u0;
import i20.z0;
import j10.n0;
import j10.r0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k9.b3;
import k9.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l9.f0;
import li.c;
import oi.g;
import oi.j;
import oi.t;
import pi.e;
import q3.e0;
import qi.d;
import qi.h;
import qi.n;
import ri.c1;
import ri.c2;
import ri.d1;
import ri.f1;
import ri.g1;
import ri.j2;
import ri.o0;
import ri.p0;
import ri.q0;
import ri.t0;
import ri.v0;
import s10.w0;
import wj.b1;
import yh.e1;
import yh.j1;
import yh.y0;

public final class b implements zd.b, l, yj.b {
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;

    public b(int i10) {
        this.A = i10;
        switch (i10) {
            case 5:
                this.B = new LinkedHashMap();
                this.C = new LinkedHashMap();
                this.D = new LinkedHashMap();
                this.E = new LinkedHashMap();
                this.F = new LinkedHashMap();
                this.G = new LinkedHashMap();
                this.H = new LinkedHashMap();
                break;
            case 9:
                this.C = null;
                this.B = null;
                this.D = null;
                this.E = null;
                this.F = null;
                this.G = null;
                break;
            default:
                this.B = new AtomicBoolean();
                this.C = null;
                this.D = new HashMap(16, 1.0f);
                this.E = new HashMap(16, 1.0f);
                this.F = new HashMap(16, 1.0f);
                this.G = new HashMap(16, 1.0f);
                this.H = null;
                break;
        }
    }

    public b(k kVar, b bVar, List list, String str, String str2) {
        y linkedHashMap;
        this.A = 1;
        m.e(list, "typeParameterProtos");
        m.e(str, "debugName");
        this.C = kVar;
        this.D = bVar;
        this.B = str;
        this.E = str2;
        d30.l lVar = ((i) kVar.a).a;
        this.F = lVar.c(new b0(this, 0));
        this.G = lVar.c(new b0(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = y.A;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                z0 z0Var = (z0) it.next();
                linkedHashMap.put(Integer.valueOf(z0Var.D), new v((k) this.C, z0Var, i10));
                i10++;
            }
        }
        this.H = linkedHashMap;
    }

    public b(Context context) {
        String string;
        this.A = 0;
        String str = ((ri.z0) c.f10297b.d(context)).f13581a;
        this.B = str;
        File filesDir = context.getFilesDir();
        this.C = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            sb2.append(str.length() > 40 ? g.h(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb2.toString();
        }
        File file = new File(filesDir, string);
        t(file);
        this.D = file;
        File file2 = new File(file, "open-sessions");
        t(file2);
        this.E = file2;
        File file3 = new File(file, "reports");
        t(file3);
        this.F = file3;
        File file4 = new File(file, "priority-reports");
        t(file4);
        this.G = file4;
        File file5 = new File(file, "native-reports");
        t(file5);
        this.H = file5;
    }

    public b(Context context, za.b bVar, jb.b bVar2, gb.a aVar, WorkDatabase workDatabase, p pVar, ArrayList arrayList) {
        this.A = 2;
        m.e(context, "context");
        m.e(aVar, "foregroundProcessor");
        this.B = bVar;
        this.C = bVar2;
        this.D = aVar;
        this.E = workDatabase;
        this.F = pVar;
        this.G = arrayList;
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "getApplicationContext(...)");
        this.H = applicationContext;
        new w0(22);
    }

    public b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
        this.G = obj6;
        this.H = obj7;
    }

    public b(String str, b bVar, e eVar) {
        this.A = 8;
        this.E = new c7.c(this, false);
        this.F = new c7.c(this, true);
        this.G = new o();
        this.H = new AtomicMarkableReference(null, false);
        this.B = str;
        this.C = new h(bVar);
        this.D = eVar;
    }

    public b(th.o oVar, j10.e eVar, n20.b bVar, List list, n0 n0Var) {
        this.A = 6;
        this.D = oVar;
        this.E = eVar;
        this.F = bVar;
        this.G = list;
        this.H = n0Var;
        this.B = oVar;
        this.C = new HashMap();
    }

    public static final ArrayList D(u0 u0Var, b bVar) {
        List list = u0Var.D;
        m.d(list, "getArgumentList(...)");
        u0 u0VarX = w50.c.X(u0Var, (f) ((k) bVar.C).d);
        ArrayList arrayListD = u0VarX != null ? D(u0VarX, bVar) : null;
        if (arrayListD == null) {
            arrayListD = x.A;
        }
        return q.Y0(arrayListD, list);
    }

    public static h0 E(List list, k10.h hVar, m0 m0Var, j10.k kVar) {
        h0 h0VarE;
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e30.k) it.next()).getClass();
            if (hVar.isEmpty()) {
                h0.B.getClass();
                h0VarE = h0.C;
            } else {
                f0 f0Var = h0.B;
                List listR = va.a.R(new e30.g(hVar));
                f0Var.getClass();
                h0VarE = f0.e(listR);
            }
            arrayList.add(h0VarE);
        }
        ArrayList arrayListR0 = r.r0(arrayList);
        h0.B.getClass();
        return f0.e(arrayListR0);
    }

    public static final j10.e G(b bVar, u0 u0Var, int i10) {
        k kVar = (k) bVar.C;
        n20.b bVarZ = z3.z((k20.g) kVar.b, i10);
        q30.r rVarR0 = q30.l.r0(q30.l.n0(u0Var, new b0(bVar, 2)), c0.B);
        ArrayList arrayList = new ArrayList();
        q30.q it = rVarR0.iterator();
        while (true) {
            q30.q qVar = it;
            if (!qVar.hasNext()) {
                break;
            }
            arrayList.add(qVar.next());
        }
        int iK0 = q30.l.k0(q30.l.n0(bVarZ, d0.B));
        while (arrayList.size() < iK0) {
            arrayList.add(0);
        }
        return ((i) kVar.a).l.B(bVarZ, arrayList);
    }

    public static p0 b(p0 p0Var, qi.f fVar, b bVar, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        o0 o0VarA = p0Var.a();
        String strF = ((d) fVar.B).f();
        if (strF != null) {
            o0VarA.f13481e = new c1(strF);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        c7.c cVar = (c7.c) bVar.E;
        if (map.isEmpty()) {
            qi.e eVar = (qi.e) ((AtomicMarkableReference) cVar.B).getReference();
            synchronized (eVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.f13021a));
            }
        } else {
            qi.e eVar2 = (qi.e) ((AtomicMarkableReference) cVar.B).getReference();
            synchronized (eVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f13021a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = qi.e.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, qi.e.a(1024, (String) entry.getValue()));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listQ = q(mapUnmodifiableMap2);
        qi.e eVar3 = (qi.e) ((AtomicMarkableReference) ((c7.c) bVar.F).B).getReference();
        synchronized (eVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.f13021a));
        }
        List listQ2 = q(mapUnmodifiableMap3);
        if (!listQ.isEmpty() || !listQ2.isEmpty()) {
            q0 q0Var = (q0) p0Var.f13490c;
            o0VarA.f13479c = new q0(q0Var.f13500a, listQ, listQ2, q0Var.f13503d, q0Var.f13504e, q0Var.f13505f, q0Var.f13506g);
        }
        return o0VarA.a();
    }

    public static j2 c(p0 p0Var, b bVar) {
        List listA = ((o) bVar.G).a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            n nVar = (n) listA.get(i10);
            nVar.getClass();
            d1 d1Var = new d1();
            qi.b bVar2 = (qi.b) nVar;
            String str = bVar2.f13016e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar2.f13013b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.f13317a = new f1(str2, str);
            String str3 = bVar2.f13014c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.f13318b = str3;
            String str4 = bVar2.f13015d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.f13319c = str4;
            d1Var.f13320d = bVar2.f13017f;
            d1Var.f13321e = (byte) (d1Var.f13321e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0VarA = p0Var.a();
        o0VarA.f13482f = new g1(arrayList);
        return o0VarA.a();
    }

    public static String g(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static b i(Context context, oi.x xVar, b bVar, oi.a aVar, qi.f fVar, b bVar2, e0 e0Var, k kVar, h7.b bVar3, j jVar, e eVar) {
        t tVar = new t(context, xVar, aVar, e0Var, kVar);
        a aVar2 = new a(bVar, kVar, jVar);
        si.a aVar3 = vi.a.f15698b;
        xd.p.b(context);
        return new b(tVar, aVar2, new vi.a(new vi.b(xd.p.a().c(new vd.a(vi.a.f15699c, vi.a.f15700d)).a("FIREBASE_CRASHLYTICS_REPORT", new ud.c("json"), vi.a.f15701e), kVar.d(), bVar3)), fVar, bVar2, xVar, eVar, 7);
    }

    public static a0 l(a0 a0Var, w wVar) {
        g10.i iVarC0 = ab.a0.c0(a0Var);
        k10.h annotations = a0Var.getAnnotations();
        w wVarP = w50.c.P(a0Var);
        List listJ = w50.c.J(a0Var);
        List listI0 = q.I0(w50.c.Q(a0Var));
        ArrayList arrayList = new ArrayList(r.q0(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(((e30.p0) it.next()).b());
        }
        return w50.c.x(iVarC0, annotations, wVarP, listJ, arrayList, wVar, true).C0(a0Var.t0());
    }

    public static List q(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new ri.f0(str, str2));
        }
        Collections.sort(arrayList, new b3.c0(11));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static byte[] u(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return zh.i.e(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(a1.b.p("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static mh.f v(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new mh.f((yh.c1) ((yh.f1) x0.r(yh.f1.C(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p.a())).B).u(), 4);
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static boolean y(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                y(file2);
            }
        }
        return file.delete();
    }

    public static List z(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public xf.n A(String str, Executor executor) {
        oi.b bVar;
        xf.g gVar;
        ArrayList<File> arrayListB = ((a) this.C).b();
        ArrayList<oi.b> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                si.a aVar = a.f15297g;
                String strE = a.e(file);
                aVar.getClass();
                arrayList.add(new oi.b(si.a.i(strE), file.getName(), file));
            } catch (IOException e3) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e3);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (oi.b bVar2 : arrayList) {
            if (str == null || str.equals(bVar2.f11988b)) {
                vi.a aVar2 = (vi.a) this.D;
                ri.b0 b0Var = bVar2.f11987a;
                if (b0Var.f13271f == null || b0Var.f13272g == null) {
                    oi.w wVarB = ((oi.x) this.G).b(true);
                    ri.b0 b0Var2 = bVar2.f11987a;
                    String str2 = wVarB.f12058a;
                    ri.a0 a0VarA = b0Var2.a();
                    a0VarA.f13243e = str2;
                    ri.b0 b0VarA = a0VarA.a();
                    String str3 = wVarB.f12059b;
                    ri.a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f13244f = str3;
                    bVar = new oi.b(a0VarA2.a(), bVar2.f11988b, bVar2.f11989c);
                } else {
                    bVar = bVar2;
                }
                boolean z10 = str != null;
                vi.b bVar3 = aVar2.f15702a;
                synchronized (bVar3.f15708f) {
                    try {
                        gVar = new xf.g();
                        if (z10) {
                            ((AtomicInteger) bVar3.f15711i.A).getAndIncrement();
                            if (bVar3.f15708f.size() < bVar3.f15707e) {
                                c cVar = c.f10296a;
                                cVar.b("Enqueueing report: " + bVar.f11988b);
                                cVar.b("Queue size: " + bVar3.f15708f.size());
                                bVar3.f15709g.execute(new u(bVar3, bVar, gVar, false, 17));
                                cVar.b("Closing task for report: " + bVar.f11988b);
                                gVar.d(bVar);
                            } else {
                                bVar3.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f11988b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) bVar3.f15711i.B).getAndIncrement();
                                gVar.d(bVar);
                            }
                        } else {
                            bVar3.b(bVar, gVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                arrayList2.add(gVar.f16565a.h(executor, new b3(this, 25)));
            }
        }
        return Tasks.e(arrayList2);
    }

    public void B(String str) {
        c7.c cVar = (c7.c) this.F;
        synchronized (cVar) {
            try {
                if (((qi.e) ((AtomicMarkableReference) cVar.B).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) cVar.B;
                    atomicMarkableReference.set((qi.e) atomicMarkableReference.getReference(), true);
                    m9.f fVar = new m9.f(cVar, 11);
                    if (((AtomicReference) cVar.C).compareAndSet(null, fVar)) {
                        ((e) ((b) cVar.D).D).f12530b.a(fVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a0 C(u0 u0Var, boolean z10) throws NoWhenBranchMatchedException {
        m0 m0VarD;
        j10.e eVarG;
        Object next;
        h0 h0VarE;
        ArrayList arrayList;
        int i10;
        List listN1;
        a0 a0VarU;
        a0 a0VarP;
        boolean z11;
        int size;
        a0 a0VarU2;
        j10.h hVarG;
        h10.k kVarL;
        e30.p0 p0Var;
        w wVarB;
        j10.h hVarG2;
        n20.c cVarG;
        w wVarB2;
        j10.b bVar;
        n20.c cVarC;
        int size2;
        u0 u0VarJ;
        int i11;
        s0 s0Var;
        r0 r0Var;
        i20.r0 r0Var2;
        int iOrdinal;
        char c10;
        a1 a1Var;
        u0 u0VarJ0;
        e30.e0 f0Var;
        k kVar = (k) this.C;
        f fVar = (f) kVar.d;
        i iVar = (i) kVar.a;
        j10.b bVar2 = (j10.k) kVar.c;
        m.e(u0Var, "proto");
        if (u0Var.n()) {
            if (z3.z((k20.g) kVar.b, u0Var.I).c) {
                ((i) kVar.a).g.getClass();
            }
        } else if ((u0Var.C & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            if (z3.z((k20.g) kVar.b, u0Var.L).c) {
                ((i) kVar.a).g.getClass();
            }
        }
        if (!u0Var.n()) {
            int i12 = u0Var.C;
            if ((i12 & 32) == 32) {
                eVarG = r(u0Var.J);
                if (eVarG == null) {
                    g30.l lVar = g30.l.a;
                    m0VarD = g30.l.d(g30.k.O, new String[]{String.valueOf(u0Var.J), (String) this.E});
                }
            } else if ((i12 & 64) == 64) {
                String string = ((k20.g) kVar.b).getString(u0Var.K);
                Iterator it = o().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!m.a(((r0) next).getName().b(), string));
                j10.e eVar = (r0) next;
                if (eVar == null) {
                    g30.l lVar2 = g30.l.a;
                    m0VarD = g30.l.d(g30.k.P, new String[]{string, bVar2.toString()});
                } else {
                    eVarG = eVar;
                }
            } else if ((i12 & Cast.MAX_NAMESPACE_LENGTH) == 128) {
                eVarG = (j10.h) ((d30.j) this.G).invoke(Integer.valueOf(u0Var.L));
                if (eVarG == null) {
                    eVarG = G(this, u0Var, u0Var.L);
                }
            } else {
                g30.l lVar3 = g30.l.a;
                m0VarD = g30.l.d(g30.k.R, new String[0]);
            }
            boolean z12 = true;
            if (g30.l.f(m0VarD.g())) {
                g30.l lVar4 = g30.l.a;
                return g30.l.e(g30.k.W, x.A, m0VarD, (String[]) Arrays.copyOf(new String[]{m0VarD.toString()}, 1));
            }
            c30.a aVar = new c30.a(iVar.a, new a20.a(this, u0Var, 3));
            h0VarE = E(iVar.r, aVar, m0VarD, bVar2);
            ArrayList arrayListD = D(u0Var, this);
            Object obj = null;
            arrayList = new ArrayList(r.q0(arrayListD, 10));
            i10 = 0;
            for (Object obj2 : arrayListD) {
                i11 = i10 + 1;
                if (i10 >= 0) {
                    va.a.k0();
                    throw null;
                }
                s0Var = (s0) obj2;
                List parameters = m0VarD.getParameters();
                m.d(parameters, "getParameters(...)");
                r0Var = (r0) q.O0(i10, parameters);
                r0Var2 = s0Var.C;
                if (r0Var2 == i20.r0.E) {
                    if (r0Var == null) {
                        f0Var = new e30.e0(iVar.b.d());
                    } else {
                        f0Var = new e30.f0(r0Var);
                    }
                    c10 = 3;
                } else {
                    m.d(r0Var2, "getProjection(...)");
                    iOrdinal = r0Var2.ordinal();
                    if (iOrdinal != 0) {
                        c10 = 3;
                        a1Var = a1.D;
                    } else if (iOrdinal != 1) {
                        c10 = 3;
                        a1Var = a1.E;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + r0Var2);
                        }
                        c10 = 3;
                        a1Var = a1.C;
                    }
                    u0VarJ0 = w50.c.j0(s0Var, fVar);
                    if (u0VarJ0 == null) {
                        f0Var = new e30.f0(g30.l.c(g30.k.b0, new String[]{s0Var.toString()}));
                    } else {
                        f0Var = new e30.f0(F(u0VarJ0), a1Var);
                    }
                }
                arrayList.add(f0Var);
                i10 = i11;
            }
            listN1 = q.n1(arrayList);
            m10.f fVarG = m0VarD.g();
            if (!z10 && (fVarG instanceof j10.q0)) {
                m10.f fVar2 = (j10.q0) fVarG;
                e30.d dVar = new e30.d();
                List parameters2 = fVar2.I.getParameters();
                ArrayList arrayList2 = new ArrayList(r.q0(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((r0) it2.next()).a());
                }
                oj.q qVar = new oj.q(obj, fVar2, listN1, h00.d0.Y(q.t1(arrayList2, listN1)), 11);
                h0.B.getClass();
                h0 h0Var = h0.C;
                m.e(h0Var, "attributes");
                a0 a0VarI = dVar.i(qVar, h0Var, false, 0, true);
                List list = iVar.r;
                ArrayList arrayListW0 = q.W0(aVar, a0VarI.getAnnotations());
                h0 h0VarE2 = E(list, arrayListW0.isEmpty() ? k10.g.a : new k10.i(0, arrayListW0), m0VarD, bVar2);
                if (!e30.x0.e(a0VarI) && !u0Var.E) {
                    z12 = false;
                }
                a0VarU = a0VarI.C0(z12).D0(h0VarE2);
            } else if (k20.e.a.g(u0Var.Q).booleanValue()) {
                z11 = u0Var.E;
                size = m0VarD.getParameters().size() - listN1.size();
                if (size == 0) {
                    a0VarU2 = e30.c.u(h0VarE, m0VarD, listN1, z11);
                    hVarG = a0VarU2.m0().g();
                    if (hVarG == null && (hVarG instanceof j10.e) && g10.i.J(hVarG)) {
                        kVarL = w50.c.L(u20.d.h(hVarG));
                    } else {
                        kVarL = null;
                    }
                    if (m.a(kVarL, h10.g.c) || (p0Var = (e30.p0) q.U0(w50.c.Q(a0VarU2))) == null || (wVarB = p0Var.b()) == null) {
                        a0VarU2 = null;
                    } else {
                        hVarG2 = wVarB.m0().g();
                        if (hVarG2 != null) {
                            cVarG = u20.d.g(hVarG2);
                        } else {
                            cVarG = null;
                        }
                        if (wVarB.e0().size() == 1 && (m.a(cVarG, g10.p.g) || m.a(cVarG, a30.e0.a))) {
                            wVarB2 = ((e30.p0) q.d1(wVarB.e0())).b();
                            m.d(wVarB2, "getType(...)");
                            if (bVar2 instanceof j10.b) {
                                bVar = bVar2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                cVarC = u20.d.c(bVar);
                            } else {
                                cVarC = null;
                            }
                            if (m.a(cVarC, a30.a0.a)) {
                                a0VarU2 = l(a0VarU2, wVarB2);
                            } else {
                                a0VarU2 = l(a0VarU2, wVarB2);
                            }
                        }
                    }
                } else if (size != 1 && (size2 = listN1.size() - 1) >= 0) {
                    m0 m0VarF = m0VarD.d().w(size2).f();
                    m.d(m0VarF, "getTypeConstructor(...)");
                    a0VarU2 = e30.c.u(h0VarE, m0VarF, listN1, z11);
                } else {
                    a0VarU2 = null;
                }
                if (a0VarU2 == null) {
                    g30.l lVar5 = g30.l.a;
                    a0VarU = g30.l.e(g30.k.Q, listN1, m0VarD, new String[0]);
                } else {
                    a0VarU = a0VarU2;
                }
            } else {
                a0VarU = e30.c.u(h0VarE, m0VarD, listN1, u0Var.E);
                if (k20.e.b.g(u0Var.Q).booleanValue()) {
                    a0VarP = e30.d.p(a0VarU, true);
                    if (a0VarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarU + '\'').toString());
                    }
                    a0VarU = a0VarP;
                }
            }
            u0VarJ = w50.c.j(u0Var, fVar);
            if (u0VarJ != null) {
                return e30.c.H(a0VarU, C(u0VarJ, false));
            }
            return a0VarU;
        }
        eVarG = (j10.h) ((d30.j) this.F).invoke(Integer.valueOf(u0Var.I));
        if (eVarG == null) {
            eVarG = G(this, u0Var, u0Var.I);
        }
        m0VarD = eVarG.f();
        m.d(m0VarD, "getTypeConstructor(...)");
        boolean z13 = true;
        if (g30.l.f(m0VarD.g())) {
            g30.l lVar6 = g30.l.a;
            return g30.l.e(g30.k.W, x.A, m0VarD, (String[]) Arrays.copyOf(new String[]{m0VarD.toString()}, 1));
        }
        c30.a aVar2 = new c30.a(iVar.a, new a20.a(this, u0Var, 3));
        h0VarE = E(iVar.r, aVar2, m0VarD, bVar2);
        ArrayList arrayListD2 = D(u0Var, this);
        Object obj3 = null;
        arrayList = new ArrayList(r.q0(arrayListD2, 10));
        i10 = 0;
        while (r10.hasNext()) {
            i11 = i10 + 1;
            if (i10 >= 0) {
                va.a.k0();
                throw null;
            }
            s0Var = (s0) obj2;
            List parameters3 = m0VarD.getParameters();
            m.d(parameters3, "getParameters(...)");
            r0Var = (r0) q.O0(i10, parameters3);
            r0Var2 = s0Var.C;
            if (r0Var2 == i20.r0.E) {
                if (r0Var == null) {
                    f0Var = new e30.e0(iVar.b.d());
                } else {
                    f0Var = new e30.f0(r0Var);
                }
                c10 = 3;
            } else {
                m.d(r0Var2, "getProjection(...)");
                iOrdinal = r0Var2.ordinal();
                if (iOrdinal != 0) {
                    c10 = 3;
                    a1Var = a1.D;
                } else if (iOrdinal != 1) {
                    c10 = 3;
                    a1Var = a1.E;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + r0Var2);
                    }
                    c10 = 3;
                    a1Var = a1.C;
                }
                u0VarJ0 = w50.c.j0(s0Var, fVar);
                if (u0VarJ0 == null) {
                    f0Var = new e30.f0(g30.l.c(g30.k.b0, new String[]{s0Var.toString()}));
                } else {
                    f0Var = new e30.f0(F(u0VarJ0), a1Var);
                }
            }
            arrayList.add(f0Var);
            i10 = i11;
        }
        listN1 = q.n1(arrayList);
        m10.f fVarG2 = m0VarD.g();
        if (!z10) {
            if (k20.e.a.g(u0Var.Q).booleanValue()) {
                z11 = u0Var.E;
                size = m0VarD.getParameters().size() - listN1.size();
                if (size == 0) {
                    a0VarU2 = e30.c.u(h0VarE, m0VarD, listN1, z11);
                    hVarG = a0VarU2.m0().g();
                    if (hVarG == null) {
                        kVarL = null;
                    } else {
                        kVarL = null;
                    }
                    if (m.a(kVarL, h10.g.c)) {
                        a0VarU2 = null;
                    } else {
                        hVarG2 = wVarB.m0().g();
                        if (hVarG2 != null) {
                            cVarG = u20.d.g(hVarG2);
                        } else {
                            cVarG = null;
                        }
                        if (wVarB.e0().size() == 1) {
                            wVarB2 = ((e30.p0) q.d1(wVarB.e0())).b();
                            m.d(wVarB2, "getType(...)");
                            if (bVar2 instanceof j10.b) {
                                bVar = bVar2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                cVarC = u20.d.c(bVar);
                            } else {
                                cVarC = null;
                            }
                            if (m.a(cVarC, a30.a0.a)) {
                                a0VarU2 = l(a0VarU2, wVarB2);
                            } else {
                                a0VarU2 = l(a0VarU2, wVarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    a0VarU2 = null;
                } else {
                    m0 m0VarF2 = m0VarD.d().w(size2).f();
                    m.d(m0VarF2, "getTypeConstructor(...)");
                    a0VarU2 = e30.c.u(h0VarE, m0VarF2, listN1, z11);
                }
                if (a0VarU2 == null) {
                    g30.l lVar7 = g30.l.a;
                    a0VarU = g30.l.e(g30.k.Q, listN1, m0VarD, new String[0]);
                } else {
                    a0VarU = a0VarU2;
                }
            } else {
                a0VarU = e30.c.u(h0VarE, m0VarD, listN1, u0Var.E);
                if (k20.e.b.g(u0Var.Q).booleanValue()) {
                    a0VarP = e30.d.p(a0VarU, true);
                    if (a0VarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarU + '\'').toString());
                    }
                    a0VarU = a0VarP;
                }
            }
        } else if (k20.e.a.g(u0Var.Q).booleanValue()) {
            z11 = u0Var.E;
            size = m0VarD.getParameters().size() - listN1.size();
            if (size == 0) {
                a0VarU2 = e30.c.u(h0VarE, m0VarD, listN1, z11);
                hVarG = a0VarU2.m0().g();
                if (hVarG == null) {
                    kVarL = null;
                } else {
                    kVarL = null;
                }
                if (m.a(kVarL, h10.g.c)) {
                    a0VarU2 = null;
                } else {
                    hVarG2 = wVarB.m0().g();
                    if (hVarG2 != null) {
                        cVarG = u20.d.g(hVarG2);
                    } else {
                        cVarG = null;
                    }
                    if (wVarB.e0().size() == 1) {
                        wVarB2 = ((e30.p0) q.d1(wVarB.e0())).b();
                        m.d(wVarB2, "getType(...)");
                        if (bVar2 instanceof j10.b) {
                            bVar = bVar2;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            cVarC = u20.d.c(bVar);
                        } else {
                            cVarC = null;
                        }
                        if (m.a(cVarC, a30.a0.a)) {
                            a0VarU2 = l(a0VarU2, wVarB2);
                        } else {
                            a0VarU2 = l(a0VarU2, wVarB2);
                        }
                    }
                }
            } else if (size != 1) {
                a0VarU2 = null;
            } else {
                m0 m0VarF3 = m0VarD.d().w(size2).f();
                m.d(m0VarF3, "getTypeConstructor(...)");
                a0VarU2 = e30.c.u(h0VarE, m0VarF3, listN1, z11);
            }
            if (a0VarU2 == null) {
                g30.l lVar8 = g30.l.a;
                a0VarU = g30.l.e(g30.k.Q, listN1, m0VarD, new String[0]);
            } else {
                a0VarU = a0VarU2;
            }
        } else {
            a0VarU = e30.c.u(h0VarE, m0VarD, listN1, u0Var.E);
            if (k20.e.b.g(u0Var.Q).booleanValue()) {
                a0VarP = e30.d.p(a0VarU, true);
                if (a0VarP == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarU + '\'').toString());
                }
                a0VarU = a0VarP;
            }
        }
        u0VarJ = w50.c.j(u0Var, fVar);
        if (u0VarJ != null) {
            return e30.c.H(a0VarU, C(u0VarJ, false));
        }
        return a0VarU;
    }

    public w F(u0 u0Var) throws NoWhenBranchMatchedException {
        k kVar = (k) this.C;
        m.e(u0Var, "proto");
        if ((u0Var.C & 2) != 2) {
            return C(u0Var, true);
        }
        String string = ((k20.g) kVar.b).getString(u0Var.F);
        a0 a0VarC = C(u0Var, true);
        u0 u0VarG = w50.c.G(u0Var, (f) kVar.d);
        m.b(u0VarG);
        return ((i) kVar.a).j.b(u0Var, string, a0VarC, C(u0VarG, true));
    }

    public void a() {
        th.o oVar = (th.o) this.D;
        n20.b bVar = (n20.b) this.F;
        HashMap map = (HashMap) this.C;
        m.e(map, "arguments");
        boolean zC = false;
        if (bVar.equals(f10.a.b)) {
            Object obj = map.get(n20.e.e("value"));
            s20.t tVar = obj instanceof s20.t ? (s20.t) obj : null;
            if (tVar != null) {
                Object obj2 = ((s20.g) tVar).a;
                s20.r rVar = obj2 instanceof s20.r ? (s20.r) obj2 : null;
                if (rVar != null) {
                    zC = oVar.C(rVar.a.a);
                }
            }
        }
        if (zC || oVar.C(bVar)) {
            return;
        }
        ((List) this.G).add(new k10.c(((j10.e) this.E).n(), map, (n0) this.H));
    }

    public synchronized sh.a d() {
        sh.a aVar;
        try {
            if (((String) this.B) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (sh.a.f14236b) {
                try {
                    byte[] bArrU = u((Context) this.C, (String) this.B, (String) this.D);
                    if (bArrU == null) {
                        if (((String) this.E) != null) {
                            this.F = x();
                        }
                        this.H = m();
                    } else if (((String) this.E) != null) {
                        this.H = w(bArrU);
                    } else {
                        this.H = v(bArrU);
                    }
                    aVar = new sh.a(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return aVar;
    }

    public void e(String str) {
        File file = new File((File) this.C, str);
        if (file.exists() && y(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public g20.m f(n20.e eVar) {
        return new oj.q((th.o) this.B, eVar, this);
    }

    public Object get() {
        switch (this.A) {
            case 4:
                Context context = (Context) ((f00.a) this.B).get();
                yd.d dVar = (yd.d) ((f00.a) this.C).get();
                ee.d dVar2 = (ee.d) ((f00.a) this.D).get();
                a1.i iVar = (a1.i) ((a1.i) this.E).get();
                Executor executor = (Executor) ((f00.a) this.F).get();
                fe.b bVar = (fe.b) ((f00.a) this.G).get();
                sg.f fVar = new sg.f();
                hb.f fVar2 = new hb.f();
                ee.c cVar = (ee.c) ((f00.a) this.H).get();
                k kVar = new k();
                kVar.a = context;
                kVar.b = dVar;
                kVar.c = dVar2;
                kVar.d = iVar;
                kVar.e = executor;
                kVar.f = bVar;
                kVar.g = fVar;
                kVar.h = fVar2;
                kVar.i = cVar;
                return kVar;
            default:
                return new wj.x0((zj.j) ((f00.a) this.B).get(), (wj.p0) ((f00.a) this.C).get(), (wj.m0) ((f00.a) this.D).get(), (b1) ((f00.a) this.E).get(), (DataStore) ((f00.a) this.F).get(), (wj.a0) ((yj.c) this.G).get(), (k00.i) ((f00.a) this.H).get());
        }
    }

    public l h(n20.b bVar, n20.e eVar) {
        ArrayList arrayList = new ArrayList();
        return new ce.c(((th.o) this.B).E(bVar, n0.n, arrayList), this, eVar, arrayList);
    }

    public void j(n20.e eVar, s20.f fVar) {
        ((HashMap) this.C).put(eVar, new s20.t(new s20.r(fVar)));
    }

    public void k(n20.e eVar, Object obj) {
        ((HashMap) this.C).put(eVar, th.o.g((th.o) this.B, eVar, obj));
    }

    public mh.f m() throws GeneralSecurityException, IOException {
        if (((mh.f) this.G) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        mh.f fVar = new mh.f(yh.f1.B(), 4);
        mh.f fVar2 = (mh.f) this.G;
        synchronized (fVar) {
            fVar.a((yh.a1) fVar2.f10911b);
        }
        int iZ = mh.n.a((yh.f1) fVar.d().B).x().z();
        synchronized (fVar) {
            for (int i10 = 0; i10 < ((yh.f1) ((yh.c1) fVar.f10911b).B).y(); i10++) {
                try {
                    e1 e1VarX = ((yh.f1) ((yh.c1) fVar.f10911b).B).x(i10);
                    if (e1VarX.A() == iZ) {
                        if (!e1VarX.C().equals(y0.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iZ);
                        }
                        yh.c1 c1Var = (yh.c1) fVar.f10911b;
                        c1Var.d();
                        yh.f1.v((yh.f1) c1Var.B, iZ);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new GeneralSecurityException("key not found: " + iZ);
        }
        Context context = (Context) this.C;
        String str = (String) this.B;
        String str2 = (String) this.D;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((sh.b) this.F) != null) {
            x0 x0VarD = fVar.d();
            sh.b bVar = (sh.b) this.F;
            byte[] bArr = new byte[0];
            yh.f1 f1Var = (yh.f1) x0VarD.B;
            byte[] bArrA = bVar.a(f1Var.d(), bArr);
            try {
                if (!yh.f1.D(bVar.b(bArrA, bArr), com.google.crypto.tink.shaded.protobuf.p.a()).equals(f1Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                yh.m0 m0VarY = yh.n0.y();
                com.google.crypto.tink.shaded.protobuf.h hVarC = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA.length, bArrA);
                m0VarY.d();
                yh.n0.v((yh.n0) m0VarY.B, hVarC);
                j1 j1VarA = mh.n.a(f1Var);
                m0VarY.d();
                yh.n0.w((yh.n0) m0VarY.B, j1VarA);
                if (!editorEdit.putString(str, zh.i.f(((yh.n0) m0VarY.a()).d())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, zh.i.f(((yh.f1) fVar.d().B).d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    public void n(n20.e eVar, n20.b bVar, n20.e eVar2) {
        ((HashMap) this.C).put(eVar, new s20.i(bVar, eVar2));
    }

    public List o() {
        return q.n1(this.H.values());
    }

    public File p(String str, String str2) {
        File file = new File((File) this.E, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public r0 r(int i10) {
        r0 r0Var = (r0) this.H.get(Integer.valueOf(i10));
        if (r0Var != null) {
            return r0Var;
        }
        b bVar = (b) this.D;
        if (bVar != null) {
            return bVar.r(i10);
        }
        return null;
    }

    public void s(Throwable th2, Thread thread, String str, qi.c cVar, boolean z10) {
        boolean zEquals = str.equals("crash");
        t tVar = (t) this.B;
        long j9 = cVar.f13019b;
        Context context = tVar.f12048a;
        int i10 = context.getResources().getConfiguration().orientation;
        e0 e0Var = tVar.f12051d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        p10.a aVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            aVar = new p10.a(th3.getLocalizedMessage(), th3.getClass().getName(), e0Var.f(th3.getStackTrace()), aVar);
        }
        o0 o0Var = new o0();
        o0Var.f13478b = str;
        o0Var.f13477a = j9;
        o0Var.f13483g = (byte) (o0Var.f13483g | 1);
        c2 c2VarD = c.f10297b.d(context);
        int i11 = ((ri.z0) c2VarD).f13583c;
        Boolean boolValueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList arrayListC = c.c(context);
        byte b7 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.C;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b10 = (byte) 1;
        List listD = t.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b10 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
        }
        arrayList.add(new v0(name, 4, listD));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrF = e0Var.f(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    List listD2 = t.d(stackTraceElementArrF, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b10 != 1) {
                        byte b11 = b10;
                        StringBuilder sb3 = new StringBuilder();
                        if (b11 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb3));
                    }
                    arrayList.add(new v0(name2, 0, listD2));
                }
                it = it;
                b10 = b10;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarC = t.c(aVar, 0);
        ri.u0 u0VarE = t.e();
        List listA = tVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        ri.r0 r0Var = new ri.r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b7 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b7 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(oi.k.j("Missing required properties:", sb4));
        }
        o0Var.f13479c = new q0(r0Var, null, null, bool, c2VarD, arrayListC, i10);
        o0Var.f13480d = tVar.b(i10);
        p0 p0VarA = o0Var.a();
        Map map = cVar.f13020c;
        qi.f fVar = (qi.f) this.E;
        b bVar = (b) this.F;
        j2 j2VarC = c(b(p0VarA, fVar, bVar, map), bVar);
        if (z10) {
            ((a) this.C).d(j2VarC, cVar.f13018a, zEquals);
        } else {
            ((e) this.H).f12530b.a(new com.revenuecat.purchases.c(this, j2VarC, cVar, zEquals, 4));
        }
    }

    public String toString() {
        String str;
        switch (this.A) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.B);
                b bVar = (b) this.D;
                if (bVar == null) {
                    str = RuntimeVersion.SUFFIX;
                } else {
                    str = ". Child of " + ((String) bVar.B);
                }
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public mh.f w(byte[] bArr) {
        try {
            this.F = new sh.c().c((String) this.E);
            try {
                return new mh.f((yh.c1) ((yh.f1) x0.N(new mh.f(new ByteArrayInputStream(bArr), 1), (sh.b) this.F).B).u(), 4);
            } catch (IOException | GeneralSecurityException e3) {
                try {
                    return v(bArr);
                } catch (IOException unused) {
                    throw e3;
                }
            }
        } catch (GeneralSecurityException | ProviderException e10) {
            try {
                mh.f fVarV = v(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                return fVarV;
            } catch (IOException unused2) {
                throw e10;
            }
        }
    }

    public sh.b x() throws KeyStoreException {
        sh.c cVar = new sh.c();
        try {
            boolean zA = sh.c.a((String) this.E);
            try {
                return cVar.c((String) this.E);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (!zA) {
                    throw new KeyStoreException(a1.b.p("the master key ", (String) this.E, " exists but is unusable"), e3);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e3);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
            return null;
        }
    }
}
