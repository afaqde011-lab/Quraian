package zj;

import a40.c0;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.g4;
import com.google.protobuf.RuntimeVersion;
import d40.l1;
import g00.b0;
import h00.d0;
import java.util.Map;
import l6.v;
import ri.t1;
import wj.b1;
import wj.p;
import wj.u;

public final class c implements n {

    public static final int f17504g;

    public static final r30.j f17505h;

    public final b1 f17506a;

    public final jj.d f17507b;

    public final wj.b f17508c;

    public final d f17509d;

    public final m f17510e;

    public final j40.c f17511f;

    static {
        s30.a aVar = s30.b.B;
        f17504g = (int) s30.b.i(g4.b0(24, s30.d.G), s30.d.E);
        f17505h = new r30.j("/");
    }

    public c(b1 b1Var, jj.d dVar, wj.b bVar, d dVar2, m mVar) {
        kotlin.jvm.internal.m.e(b1Var, "timeProvider");
        kotlin.jvm.internal.m.e(dVar, "firebaseInstallationsApi");
        kotlin.jvm.internal.m.e(bVar, "appInfo");
        kotlin.jvm.internal.m.e(dVar2, "configsFetcher");
        kotlin.jvm.internal.m.e(mVar, "settingsCache");
        this.f17506a = b1Var;
        this.f17507b = dVar;
        this.f17508c = bVar;
        this.f17509d = dVar2;
        this.f17510e = mVar;
        this.f17511f = j40.d.a();
    }

    @Override
    public final Boolean a() {
        return this.f17510e.a().f17515a;
    }

    @Override
    public final s30.b b() {
        Integer num = this.f17510e.a().f17517c;
        if (num == null) {
            return null;
        }
        s30.a aVar = s30.b.B;
        return new s30.b(g4.b0(num.intValue(), s30.d.E));
    }

    @Override
    public final Double c() {
        return this.f17510e.a().f17516b;
    }

    @Override
    public final Object d(k00.c cVar) throws Throwable {
        b bVar;
        j40.a aVar;
        j40.a aVar2;
        j40.a aVar3;
        String str;
        Object objJ;
        c cVar2 = this;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.E = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar2, (m00.c) cVar);
            }
        } else {
            bVar = new b(cVar2, (m00.c) cVar);
        }
        Object obj = bVar.C;
        l00.a aVar4 = l00.a.A;
        int i11 = bVar.E;
        b0 b0Var = b0.a;
        k00.c cVar3 = null;
        try {
            if (i11 == 0) {
                t1.O(obj);
                aVar = cVar2.f17511f;
                if (!aVar.e() && !cVar2.f17510e.b()) {
                    return b0Var;
                }
                bVar.A = cVar2;
                bVar.B = aVar;
                bVar.E = 1;
                if (aVar.l(bVar) != aVar4) {
                }
                return aVar4;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    aVar3 = bVar.B;
                    cVar2 = (c) bVar.A;
                    try {
                        t1.O(obj);
                        str = ((u) obj).f16213a;
                        if (str.equals(RuntimeVersion.SUFFIX)) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            aVar3.i((Object) null);
                            return b0Var;
                        }
                        g00.k kVar = new g00.k("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        cVar2.getClass();
                        r30.j jVar = f17505h;
                        g00.k kVar2 = new g00.k("X-Crashlytics-Device-Model", jVar.c(str2, RuntimeVersion.SUFFIX));
                        String str3 = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.m.d(str3, "INCREMENTAL");
                        g00.k kVar3 = new g00.k("X-Crashlytics-OS-Build-Version", jVar.c(str3, RuntimeVersion.SUFFIX));
                        String str4 = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.m.d(str4, "RELEASE");
                        g00.k kVar4 = new g00.k("X-Crashlytics-OS-Display-Version", jVar.c(str4, RuntimeVersion.SUFFIX));
                        cVar2.f17508c.getClass();
                        Map mapR = d0.R(new g00.k[]{kVar, kVar2, kVar3, kVar4, new g00.k("X-Crashlytics-API-Client-Version", "3.0.3")});
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        d dVar = cVar2.f17509d;
                        z.b bVar2 = new z.b(cVar2, cVar3, 3);
                        l1 l1Var = new l1(2, (k00.c) null, 17);
                        bVar.A = aVar3;
                        bVar.B = null;
                        bVar.E = 3;
                        objJ = c0.J(new v(dVar, mapR, bVar2, l1Var, (k00.c) null, 13), dVar.f17513b, bVar);
                        if (objJ != aVar4) {
                            objJ = b0Var;
                        }
                        if (objJ != aVar4) {
                            aVar2 = aVar3;
                            aVar2.i((Object) null);
                            return b0Var;
                        }
                        return aVar4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (j40.a) bVar.A;
                    try {
                        t1.O(obj);
                        aVar2.i((Object) null);
                        return b0Var;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                aVar2.i((Object) null);
                throw th;
            }
            j40.a aVar5 = bVar.B;
            c cVar4 = (c) bVar.A;
            t1.O(obj);
            aVar = aVar5;
            cVar2 = cVar4;
            if (!cVar2.f17510e.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                aVar.i((Object) null);
                return b0Var;
            }
            p pVar = u.f16212c;
            jj.d dVar2 = cVar2.f17507b;
            bVar.A = cVar2;
            bVar.B = aVar;
            bVar.E = 2;
            Object objA = pVar.a(dVar2, bVar);
            if (objA != aVar4) {
                aVar3 = aVar;
                obj = objA;
                str = ((u) obj).f16213a;
                if (str.equals(RuntimeVersion.SUFFIX)) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    aVar3.i((Object) null);
                    return b0Var;
                }
                g00.k kVar5 = new g00.k("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                cVar2.getClass();
                r30.j jVar2 = f17505h;
                g00.k kVar6 = new g00.k("X-Crashlytics-Device-Model", jVar2.c(str5, RuntimeVersion.SUFFIX));
                String str6 = Build.VERSION.INCREMENTAL;
                kotlin.jvm.internal.m.d(str6, "INCREMENTAL");
                g00.k kVar7 = new g00.k("X-Crashlytics-OS-Build-Version", jVar2.c(str6, RuntimeVersion.SUFFIX));
                String str7 = Build.VERSION.RELEASE;
                kotlin.jvm.internal.m.d(str7, "RELEASE");
                g00.k kVar8 = new g00.k("X-Crashlytics-OS-Display-Version", jVar2.c(str7, RuntimeVersion.SUFFIX));
                cVar2.f17508c.getClass();
                Map mapR2 = d0.R(new g00.k[]{kVar5, kVar6, kVar7, kVar8, new g00.k("X-Crashlytics-API-Client-Version", "3.0.3")});
                Log.d("FirebaseSessions", "Fetching settings from server.");
                d dVar3 = cVar2.f17509d;
                z.b bVar3 = new z.b(cVar2, cVar3, 3);
                l1 l1Var2 = new l1(2, (k00.c) null, 17);
                bVar.A = aVar3;
                bVar.B = null;
                bVar.E = 3;
                objJ = c0.J(new v(dVar3, mapR2, bVar3, l1Var2, (k00.c) null, 13), dVar3.f17513b, bVar);
                if (objJ != aVar4) {
                    objJ = b0Var;
                }
                if (objJ != aVar4) {
                    aVar2 = aVar3;
                    aVar2.i((Object) null);
                    return b0Var;
                }
            }
            return aVar4;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
        }
    }
}
