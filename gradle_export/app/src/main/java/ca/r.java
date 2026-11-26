package ca;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class r {

    public final a10.d f3073a;

    public final Context f3074b;

    public final String f3075c;

    public Executor f3078f;

    public Executor f3079g;

    public ab.r f3080h;

    public boolean f3081i;

    public boolean f3087q;

    public boolean f3088r;

    public final ArrayList f3076d = new ArrayList();

    public final ArrayList f3077e = new ArrayList();

    public final s f3082j = s.A;

    public final long f3083k = -1;
    public final me.i l = new me.i(14);
    public final LinkedHashSet m = new LinkedHashSet();

    public final LinkedHashSet f3084n = new LinkedHashSet();

    public final ArrayList f3085o = new ArrayList();

    public boolean f3086p = true;

    public final boolean f3089s = true;

    public r(Context context, Class cls, String str) {
        this.f3073a = k00.f.I(cls);
        this.f3074b = context;
        this.f3075c = str;
    }

    public final void a(fa.a... aVarArr) {
        for (fa.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.f5578a);
            LinkedHashSet linkedHashSet = this.f3084n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f5579b));
        }
        fa.a[] aVarArr2 = (fa.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        me.i iVar = this.l;
        iVar.getClass();
        kotlin.jvm.internal.m.e(aVarArr2, "migrations");
        for (fa.a aVar2 : aVarArr2) {
            iVar.z(aVar2);
        }
    }

    public final t b() {
        String name;
        ba.y yVar;
        na.c cVarA;
        na.c cVarA2;
        boolean zContainsKey;
        Executor executor = this.f3078f;
        if (executor == null && this.f3079g == null) {
            f5.d dVar = q.a.f12554c;
            this.f3079g = dVar;
            this.f3078f = dVar;
        } else if (executor != null && this.f3079g == null) {
            this.f3079g = executor;
        } else if (executor == null) {
            this.f3078f = this.f3079g;
        }
        LinkedHashSet linkedHashSet = this.f3084n;
        kotlin.jvm.internal.m.e(linkedHashSet, "migrationStartAndEndVersions");
        LinkedHashSet linkedHashSet2 = this.m;
        kotlin.jvm.internal.m.e(linkedHashSet2, "migrationsNotRequiredFrom");
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(g4.c.f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        na.b fVar = this.f3080h;
        if (fVar == null) {
            fVar = new hb.f();
        }
        na.b bVar = fVar;
        if (this.f3083k > 0) {
            if (this.f3075c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z10 = this.f3081i;
        s sVar = this.f3082j;
        sVar.getClass();
        Context context = this.f3074b;
        kotlin.jvm.internal.m.e(context, "context");
        if (sVar == s.A) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            sVar = (activityManager == null || activityManager.isLowRamDevice()) ? s.B : s.C;
        }
        Executor executor2 = this.f3078f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f3079g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a aVar = new a(context, this.f3075c, bVar, this.l, this.f3076d, z10, sVar, executor2, executor3, null, this.f3086p, this.f3087q, linkedHashSet2, null, null, null, this.f3077e, this.f3085o, this.f3088r, null, null);
        aVar.f3034v = this.f3089s;
        Class clsD = k00.f.D(this.f3073a);
        Package r4 = clsD.getPackage();
        if (r4 == null || (name = r4.getName()) == null) {
            name = RuntimeVersion.SUFFIX;
        }
        String canonicalName = clsD.getCanonicalName();
        kotlin.jvm.internal.m.b(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            kotlin.jvm.internal.m.d(canonicalName, "substring(...)");
        }
        String strConcat = r30.r.u0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader());
            kotlin.jvm.internal.m.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            t tVar = (t) cls.getDeclaredConstructor(null).newInstance(null);
            tVar.getClass();
            tVar.f3100k = aVar.f3034v;
            try {
                ba.y yVarE = tVar.e();
                kotlin.jvm.internal.m.c(yVarE, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                yVar = yVarE;
            } catch (g00.j unused) {
                yVar = null;
            }
            if (yVar == null) {
                new p(aVar, new bw.b(tVar), new av.b(2, tVar, v.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                throw null;
            }
            tVar.f3094e = new p(aVar, yVar, new av.b(2, tVar, v.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
            tVar.f3095f = tVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setI = tVar.i();
            List list = aVar.f3030r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setI.iterator();
            while (true) {
                int i10 = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i11 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size2 = i11;
                        }
                    }
                    for (fa.a aVar2 : tVar.c(linkedHashMap)) {
                        int i12 = aVar2.f5578a;
                        int i13 = aVar2.f5579b;
                        me.i iVar = aVar.f3018d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) iVar.B;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            h00.y yVar2 = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (yVar2 == null) {
                                yVar2 = h00.y.A;
                            }
                            zContainsKey = yVar2.containsKey(Integer.valueOf(i13));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            iVar.z(aVar2);
                        }
                    }
                    LinkedHashMap linkedHashMapJ = tVar.j();
                    List list2 = aVar.f3029q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                        a10.d dVar2 = (a10.d) entry.getKey();
                        for (a10.d dVar3 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i14 = size3 - 1;
                                if (dVar3.u(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i14 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i14;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + dVar3.m() + ") for " + dVar2.m() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size3);
                            kotlin.jvm.internal.m.e(dVar3, "kclass");
                            kotlin.jvm.internal.m.e(obj, "converter");
                            tVar.f3099j.put(dVar3, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i15 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException(x5.l(list2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size4 = i15;
                        }
                    }
                    tVar.f3092c = aVar.f3022h;
                    tVar.f3093d = new z(aVar.f3023i, 0);
                    Executor executor4 = tVar.f3092c;
                    if (executor4 == null) {
                        kotlin.jvm.internal.m.k("internalQueryExecutor");
                        throw null;
                    }
                    f40.c cVarC = a40.c0.c(rd.a.P(a40.c0.o(executor4), a40.c0.e()));
                    tVar.f3090a = cVarC;
                    k00.i iVar2 = cVarC.A;
                    z zVar = tVar.f3093d;
                    if (zVar == null) {
                        kotlin.jvm.internal.m.k("internalTransactionExecutor");
                        throw null;
                    }
                    tVar.f3091b = iVar2.plus(a40.c0.o(zVar));
                    tVar.f3097h = aVar.f3020f;
                    p pVar = tVar.f3094e;
                    if (pVar == null) {
                        kotlin.jvm.internal.m.k("connectionManager");
                        throw null;
                    }
                    na.c cVar = (na.c) pVar.f3071h;
                    if (cVar == null) {
                        cVarA = null;
                        break;
                    }
                    cVarA = cVar;
                    while (!(cVarA instanceof ga.b)) {
                        if (!(cVarA instanceof b)) {
                            cVarA = null;
                            break;
                        }
                        cVarA = ((b) cVarA).a();
                    }
                    p pVar2 = tVar.f3094e;
                    if (pVar2 == null) {
                        kotlin.jvm.internal.m.k("connectionManager");
                        throw null;
                    }
                    na.c cVar2 = (na.c) pVar2.f3071h;
                    if (cVar2 == null) {
                        cVarA2 = null;
                        break;
                    }
                    cVarA2 = cVar2;
                    while (!(cVarA2 instanceof ga.a)) {
                        if (!(cVarA2 instanceof b)) {
                            cVarA2 = null;
                            break;
                        }
                        cVarA2 = ((b) cVarA2).a();
                    }
                    return tVar;
                }
                a10.d dVar4 = (a10.d) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i16 = size5 - 1;
                        if (dVar4.u(list.get(size5))) {
                            zArr[size5] = true;
                            i10 = size5;
                            break;
                        }
                        if (i16 < 0) {
                            break;
                        }
                        size5 = i16;
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + dVar4.m() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(dVar4, list.get(i10));
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e3);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(a1.b.m(clsD, new StringBuilder("Cannot access the constructor ")), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(a1.b.m(clsD, new StringBuilder("Failed to create an instance of ")), e11);
        }
    }
}
