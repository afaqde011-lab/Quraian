package oe;

import a1.n0;
import a1.w2;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.cast.d8;
import com.google.android.gms.internal.cast.ga;
import com.google.android.gms.internal.cast.r4;
import com.google.android.gms.internal.cast.u4;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.play_billing.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import qd.c0;
import qd.l0;
import qd.o0;
import zh.r;

public final class o implements n0, xf.e, xh.a {
    public static o E;
    public int A;
    public final Object B;
    public Object C;
    public Object D;

    public o() {
        this.B = new Object();
        this.C = null;
        this.D = null;
        this.A = 0;
    }

    public o(int i10, c40.a aVar, d40.i iVar, k00.i iVar2) {
        this.B = iVar;
        this.A = i10;
        this.C = aVar;
        this.D = iVar2;
    }

    public o(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.A = i10;
        this.D = str;
        this.B = arrayList;
        this.C = arrayList2;
    }

    public o(w2 w2Var) {
        this.B = w2Var;
        this.D = new m1.e(0, new u00.k[16]);
    }

    public o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.D = new m(this);
        this.A = 1;
        this.C = scheduledExecutorService;
        this.B = context.getApplicationContext();
    }

    public o(r4 r4Var, String str, int i10, SharedPreferences sharedPreferences) {
        this.B = r4Var;
        this.C = str;
        this.A = i10;
        this.D = sharedPreferences;
    }

    public o(f4 f4Var) {
        Context context = (Context) f4Var.C;
        this.B = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.C = notificationManager;
        this.A = 2131231530;
    }

    public o(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        r rVar = new r(this);
        this.B = rVar;
        if (!oi.k.b(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.C = str;
        this.D = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.A = 20;
                break;
            case "HMACSHA224":
                this.A = 28;
                break;
            case "HMACSHA256":
                this.A = 32;
                break;
            case "HMACSHA384":
                this.A = 48;
                break;
            case "HMACSHA512":
                this.A = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        rVar.get();
    }

    public o(l0 l0Var, int i10, y4.a aVar, Runnable runnable) {
        this.A = i10;
        this.B = aVar;
        this.C = runnable;
        this.D = l0Var;
    }

    public o(rc.c cVar) {
        this.B = cVar;
        rc.g gVar = cVar.f13151a;
        this.D = cVar.f();
        SharedPreferences sharedPreferences = gVar.f13173b.getSharedPreferences("amplitude-android-" + gVar.f13176e, 0);
        kotlin.jvm.internal.m.d(sharedPreferences, "getSharedPreferences(...)");
        this.C = sharedPreferences;
        this.A = sharedPreferences.getInt("storage_version", 0);
    }

    public static synchronized o i(Context context) {
        try {
            if (E == null) {
                E = new o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new c0("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return E;
    }

    @Override
    public int a() {
        z0.a aVar = (z0.a) this.C;
        return aVar != null ? aVar.B.length() : ((w2) this.B).d().C.length();
    }

    @Override
    public long b(long j9) {
        w2 w2Var = (w2) this.B;
        return w2Var.f137c != null ? w2Var.e(j9) : j9;
    }

    @Override
    public byte[] c(int i10, byte[] bArr) throws InvalidAlgorithmParameterException {
        r rVar = (r) this.B;
        if (i10 > this.A) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) rVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) rVar.get()).doFinal(), i10);
    }

    @Override
    public long d(long j9) {
        w2 w2Var = (w2) this.B;
        return w2Var.f137c != null ? w2Var.f(j9) : j9;
    }

    public boolean e() {
        w2 w2Var = (w2) this.B;
        m1.e eVar = (m1.e) this.D;
        int i10 = this.A - 1;
        this.A = i10;
        if (i10 == 0 && eVar.C != 0) {
            z0.g gVar = w2Var.f135a;
            h1.l lVar = w2Var.f136b;
            c1.c cVar = c1.c.A;
            gVar.f16994b.a().w();
            z0.a aVar = gVar.f16994b;
            if (w2Var.f137c == null) {
                this.C = aVar;
            }
            Object[] objArr = eVar.A;
            int i11 = eVar.C;
            for (int i12 = 0; i12 < i11; i12++) {
                ((u00.k) objArr[i12]).invoke(aVar);
            }
            w2Var.l(aVar);
            z0.g.a(gVar, lVar, false, cVar);
            gVar.f(true);
            eVar.g();
        }
        return this.A > 0;
    }

    public void f() {
        HandlerThread handlerThread;
        synchronized (this.B) {
            try {
                ta.c0.A(this.A > 0);
                int i10 = this.A - 1;
                this.A = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.D) != null) {
                    handlerThread.quit();
                    this.D = null;
                    this.C = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public java.lang.Object g(m00.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: oe.o.g(m00.c):java.lang.Object");
    }

    public void h(Throwable th2) {
        l0 l0Var = (l0) this.D;
        if (th2 instanceof TimeoutException) {
            l0Var.U(MediaError.DetailedErrorCode.MEDIA_DECODE, 28, o0.F);
            q.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            l0Var.U(95, 28, o0.F);
            q.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.C).run();
    }

    public synchronized xf.n j(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((m) this.D).d(nVar)) {
                m mVar = new m(this);
                this.D = mVar;
                mVar.d(nVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return nVar.f11951b.f16565a;
    }

    @Override
    public void onSuccess(Object obj) {
        ce.c cVar;
        r4 r4Var = (r4) this.B;
        String str = (String) this.C;
        int i10 = this.A;
        SharedPreferences sharedPreferences = (SharedPreferences) this.D;
        Bundle bundle = (Bundle) obj;
        SessionManager sessionManager = r4Var.f3528a;
        d0.h(sessionManager);
        z0 z0Var = r4Var.f3529b;
        if (i10 == 3) {
            cVar = new ce.c(r4Var, r4Var.f3530c, str);
            sessionManager.addSessionManagerListener(new d8(cVar), CastSession.class);
            if (z0Var != null) {
                z0Var.a(new u4(cVar, 1));
            }
        } else if (i10 == 2) {
            i10 = 2;
            cVar = new ce.c(r4Var, r4Var.f3530c, str);
            sessionManager.addSessionManagerListener(new d8(cVar), CastSession.class);
            if (z0Var != null) {
                z0Var.a(new u4(cVar, 1));
            }
        }
        if (i10 == 1 || i10 == 2) {
            w4 w4Var = new w4(sharedPreferences, r4Var, r4Var.f3530c, bundle, str);
            sessionManager.addSessionManagerListener(new ga(w4Var, 5), CastSession.class);
            if (z0Var != null) {
                z0Var.a(new u4(w4Var, 0));
            }
        }
    }
}
