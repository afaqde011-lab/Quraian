package com.mchutov.p000quranify;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Process;
import ax.j;
import bw.f;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.Quranify.R;
import com.mchutov.core.security.Obfuscated;
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
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import ny.g;
import org.koin.core.error.KoinApplicationAlreadyStartedException;
import pz.k;
import ta.c0;
import va.a;
import vn.r;
import vn.s;
import vp.x;
import ym.j0;

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
        bVarS.addAll(a.S(c.f6190a, d.f6191a));
        bVarS.addAll(a.S(qq.a.f17841a, cp.b.f5331a, wp.b.f22415a, hu.a.f9787a, xt.d.f23111b, e.f10600b, yq.b.f23569b, yp.a.f23567a, j.f2157b, f.f3260b, fo.c.f7676b, qs.f.f17928a, lt.b.f14078a, g.f15579a, yx.f.f23638a, ou.b.f16548a, fq.a.f7678a, xz.a.f23190a, vx.a.f21865a, an.a.f649a, sw.b.f19746a, kq.a.f13209a));
        j0 j0Var = new j0(this, a.k(bVarS), 0);
        synchronized (u50.a.f20576a) {
            s50.b bVar = new s50.b();
            if (u50.a.f20577b != null) {
                throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
            }
            u50.a.f20577b = bVar.f18922a;
            j0Var.invoke(bVar);
            bVar.f18922a.a();
        }
        e60.a aVar = c0.F(this).f18919c.f3755d;
        b0 b0Var = a0.f13204a;
        k00.c cVar = null;
        lb.f fVar = (lb.f) x5.i(b0Var, lb.f.class, aVar, null, null);
        synchronized (lb.a.class) {
            lb.a.f13892b = fVar;
        }
        String strDecode = Obfuscated.INSTANCE.decode("28cd1e7fbc77cc0240ad0ffbc26e12b94c3ece42bcfc73d959ab151eb11ff30a");
        Purchases.Companion companion = Purchases.INSTANCE;
        companion.configure(new PurchasesConfiguration.Builder(this, strDecode).build());
        companion.getSharedInstance().collectDeviceIdentifiers();
        int i11 = 3;
        NotificationChannel notificationChannel = new NotificationChannel("download_channel", "Downloads", 3);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        NotificationChannel notificationChannel2 = new NotificationChannel("push_channel", getString(R.string.push_notification_channel_name), 4);
        notificationChannel2.setDescription(getString(R.string.push_notification_channel_description));
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannels(a.S(notificationChannel, notificationChannel2));
        ((rw.a) x5.i(b0Var, rw.a.class, c0.F(this).f18919c.f3755d, null, null)).a();
        vn.b0 b0Var2 = (vn.b0) x5.i(b0Var, vn.b0.class, c0.F(this).f18919c.f3755d, null, null);
        a40.c0.y(b0Var2.f21657i, null, null, new a1.a0(new z(o.o(new z(new z0(b0Var2.f21654f.f22414c), new r(i11, cVar, 1))), new rm.c(b0Var2, cVar, 19), 1), cVar, 11), 3);
        s sVar = (s) x5.i(b0Var, s.class, c0.F(this).f18919c.f3755d, null, null);
        a40.c0.y(sVar.f21684h, null, null, new a1.a0(new z(o.o(new z(new z0(sVar.f21682f.f22414c), new r(i11, cVar, 0))), new k(sVar, cVar, 17), 1), cVar, 11), 3);
        gq.a aVar2 = (gq.a) x5.i(b0Var, gq.a.class, c0.F(this).f18919c.f3755d, null, null);
        if (((x) x5.i(b0Var, x.class, c0.F(this).f18919c.f3755d, null, null)).k()) {
            ((hq.b) aVar2).c();
        }
    }
}
