package com.mchutov.quranify;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Process;
import ax.j;
import bw.f;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.security.Obfuscated;
import com.mchutov.quranify.QuranifyApplication;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import d40.o;
import d40.z;
import d40.z0;
import dm.c;
import dm.d;
import i00.b;
import ir.e;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import ny.g;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.KoinApplicationAlreadyStartedException;
import ta.c0;
import u00.k;
import va.a;
import vn.r;
import vn.s;
import vp.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/QuranifyApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class QuranifyApplication extends Application {
    public static final int A = 0;

    @Override
    public final void onCreate() {
        super.onCreate();
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                    return;
                }
            }
        }
        b bVarS = a.s();
        bVarS.addAll(a.S(new y50.a[]{c.a, d.a}));
        bVarS.addAll(a.S(new y50.a[]{qq.a.a, cp.b.a, wp.b.a, hu.a.a, xt.d.b, e.b, yq.b.b, yp.a.a, j.b, f.b, fo.c.b, qs.f.a, lt.b.a, g.a, yx.f.a, ou.b.a, fq.a.a, xz.a.a, vx.a.a, an.a.a, sw.b.a, kq.a.a}));
        final b bVarK = a.k(bVarS);
        final int i = 0;
        k kVar = new k() {
            @Override
            public final Object invoke(Object obj) throws DefinitionOverrideException {
                boolean z;
                int i2 = i;
                g00.b0 b0Var = g00.b0.a;
                Object obj2 = bVarK;
                Object obj3 = this;
                switch (i2) {
                    case 0:
                        List modules = (List) obj2;
                        s50.b startKoin = (s50.b) obj;
                        int i3 = QuranifyApplication.A;
                        kotlin.jvm.internal.m.e(startKoin, "$this$startKoin");
                        x50.a aVar = x50.a.B;
                        s50.a aVar2 = startKoin.a;
                        p50.a aVar3 = new p50.a(0);
                        ((f5.c) aVar3).B = aVar;
                        aVar2.getClass();
                        aVar2.a = aVar3;
                        Context applicationContext = ((QuranifyApplication) obj3).getApplicationContext();
                        kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
                        if (((x50.a) aVar2.a.B).compareTo(aVar) <= 0) {
                            f5.c cVar = aVar2.a;
                            cVar.getClass();
                            cVar.N0(aVar, "[init] declare Android Context");
                        }
                        h00.a aVar4 = new h00.a(applicationContext, 24);
                        y50.a aVar5 = new y50.a();
                        aVar4.invoke(aVar5);
                        aVar2.d(va.a.R(aVar5), true);
                        boolean z2 = startKoin.b;
                        kotlin.jvm.internal.m.e(modules, "modules");
                        if (((x50.a) aVar2.a.B).compareTo(aVar) <= 0) {
                            long jA = s30.f.a();
                            aVar2.d(modules, z2);
                            long jA2 = s30.g.a(jA);
                            int size = ((ConcurrentHashMap) aVar2.d.C).size();
                            f5.c cVar2 = aVar2.a;
                            StringBuilder sbQ = oi.k.q("Started ", size, " definitions in ");
                            s30.a aVar6 = s30.b.B;
                            sbQ.append(s30.b.i(jA2, s30.d.MICROSECONDS) / 1000.0d);
                            sbQ.append(" ms");
                            cVar2.F0(aVar, sbQ.toString());
                        } else {
                            aVar2.d(modules, z2);
                        }
                        return b0Var;
                    case 1:
                        ((f0.i) obj3).b((f0.j) obj2);
                        return b0Var;
                    case 2:
                        b3.o0 o0Var = (b3.o0) obj;
                        o0Var.a();
                        k2.d.P0(o0Var, (i2.g) obj3, (i2.q) obj2, 0.0f, (k2.h) null, 60);
                        return b0Var;
                    case 3:
                        b3.o0 o0Var2 = (b3.o0) obj;
                        o0Var2.a();
                        k2.d.P0(o0Var2, ((i2.i0) obj3).a, (i2.q) obj2, 0.0f, (k2.h) null, 60);
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj2;
                        z = vVar.A || ((z.i0) obj).H0((s2.b) obj3);
                        vVar.A = z;
                        break;
                    case 5:
                        kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj2;
                        z = vVar2.A || ((z.i0) obj).o1((v2.s) obj3);
                        vVar2.A = z;
                        break;
                    default:
                        ((f0.i) obj3).b((f0.h) obj2);
                        return b0Var;
                }
                return Boolean.valueOf(!z);
            }
        };
        synchronized (u50.a.a) {
            s50.b bVar = new s50.b();
            if (u50.a.b != null) {
                throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
            }
            u50.a.b = bVar.a;
            kVar.invoke(bVar);
            bVar.a.a();
        }
        e60.a aVar = c0.F(this).c.d;
        b0 b0Var = a0.a;
        lb.f fVar = (lb.f) x5.i(b0Var, lb.f.class, aVar, (b60.a) null, (a60.a) null);
        synchronized (lb.a.class) {
            lb.a.b = fVar;
        }
        String strDecode = Obfuscated.INSTANCE.decode("28cd1e7fbc77cc0240ad0ffbc26e12b94c3ece42bcfc73d959ab151eb11ff30a");
        Purchases.Companion companion = Purchases.INSTANCE;
        companion.configure(new PurchasesConfiguration.Builder(this, strDecode).build());
        companion.getSharedInstance().collectDeviceIdentifiers();
        NotificationChannel notificationChannel = new NotificationChannel("download_channel", "Downloads", 3);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        NotificationChannel notificationChannel2 = new NotificationChannel("push_channel", getString(2131887134), 4);
        notificationChannel2.setDescription(getString(2131887133));
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannels(a.S(new NotificationChannel[]{notificationChannel, notificationChannel2}));
        ((rw.a) x5.i(b0Var, rw.a.class, c0.F(this).c.d, (b60.a) null, (a60.a) null)).a();
        vn.b0 b0Var2 = (vn.b0) x5.i(b0Var, vn.b0.class, c0.F(this).c.d, (b60.a) null, (a60.a) null);
        a40.c0.y(b0Var2.i, null, null, new a1.a0(new z(o.o(new z(new z0(b0Var2.f.c), new r(3, null, 1))), new rm.c(b0Var2, null, 19), 1), (k00.c) null, 11), 3);
        s sVar = (s) x5.i(b0Var, s.class, c0.F(this).c.d, (b60.a) null, (a60.a) null);
        a40.c0.y(sVar.h, null, null, new a1.a0(new z(o.o(new z(new z0(sVar.f.c), new r(3, null, 0))), new pz.k(sVar, (k00.c) null, 17), 1), (k00.c) null, 11), 3);
        gq.a aVar2 = (gq.a) x5.i(b0Var, gq.a.class, c0.F(this).c.d, (b60.a) null, (a60.a) null);
        if (((x) x5.i(b0Var, x.class, c0.F(this).c.d, (b60.a) null, (a60.a) null)).k()) {
            ((hq.b) aVar2).c();
        }
    }
}
