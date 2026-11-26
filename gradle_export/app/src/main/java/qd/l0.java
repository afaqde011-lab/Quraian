package qd;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.w0;
import com.google.android.gms.internal.play_billing.w3;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class l0 extends b {
    public final Context I;
    public volatile int J;
    public volatile com.google.android.gms.internal.play_billing.h K;
    public volatile bh.k L;
    public volatile ScheduledExecutorService M;

    public l0(a8.o0 o0Var, Context context, ki.b bVar) {
        super(o0Var, context, bVar);
        this.J = 0;
        this.I = context;
    }

    public l0(a8.o0 o0Var, Context context, u uVar, ki.b bVar) {
        super(o0Var, context, uVar, bVar);
        this.J = 0;
        this.I = context;
    }

    public final synchronized boolean S() {
        return (this.J != 2 || this.K == null || this.L == null) ? false : true;
    }

    public final com.google.android.gms.internal.play_billing.t0 T(int i10) {
        if (!S()) {
            com.google.android.gms.internal.play_billing.q.h("BillingClientTesting", "Billing Override Service is not ready.");
            U(94, 28, o0.a(-1, "Billing Override Service connection is disconnected."));
            return new com.google.android.gms.internal.play_billing.s0(0);
        }
        j0 j0Var = new j0(this, i10, 0);
        q4 q4Var = new q4();
        q4Var.f4040c = new t4();
        s4 s4Var = new s4(q4Var);
        q4Var.f4039b = s4Var;
        q4Var.f4038a = j0.class;
        try {
            j0Var.r(q4Var);
            q4Var.f4038a = "billingOverrideService.getBillingOverride";
            return s4Var;
        } catch (Exception e3) {
            s1 s1Var = new s1(e3);
            v1 v1Var = p4.F;
            r4 r4Var = s4Var.B;
            if (v1Var.u(r4Var, null, s1Var)) {
                p4.d(r4Var);
            }
            return s4Var;
        }
    }

    public final void U(int i10, int i11, h hVar) {
        int i12 = m0.f12911a;
        m3 m3VarB = m0.b(i10, i11, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(m3VarB, "ApiFailure should not be null");
        this.f12846h.w(m3VarB);
    }

    public final void V(int i10) {
        int i11 = m0.f12911a;
        o3 o3VarC = m0.c(i10, s3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(o3VarC, "ApiSuccess should not be null");
        q3.e0 e0Var = this.f12846h;
        e0Var.getClass();
        try {
            e0Var.H(o3VarC, (w3) e0Var.B);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void W(int i10, y4.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        com.google.android.gms.internal.play_billing.t0 t0VarT = T(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.M == null) {
                    this.M = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!t0VarT.isDone()) {
            w0 w0Var = new w0();
            w0Var.H = t0VarT;
            com.google.android.gms.internal.play_billing.u0 u0Var = new com.google.android.gms.internal.play_billing.u0();
            u0Var.A = w0Var;
            w0Var.I = scheduledExecutorService.schedule(u0Var, 28500L, timeUnit);
            t0VarT.c(u0Var, com.google.android.gms.internal.play_billing.q0.A);
            t0VarT = w0Var;
        }
        oe.o oVar = new oe.o(this, i10, aVar, runnable);
        t0VarT.c(new com.google.android.gms.internal.play_billing.r0(t0VarT, oVar, 0), j());
    }

    @Override
    public final void a(bh.f fVar, com.revenuecat.purchases.google.usecase.a aVar) {
        W(3, new h0(aVar, 1), new ca.u(this, fVar, aVar, 6));
    }

    @Override
    public final void b(final com.revenuecat.purchases.google.usecase.a aVar, final eh.l lVar) {
        W(4, new y4.a() {
            @Override
            public final void accept(Object obj) {
                String str = lVar.B;
                aVar.d((h) obj, str);
            }
        }, new ca.u(this, lVar, aVar, 5));
    }

    @Override
    public final void c() {
        synchronized (this) {
            V(27);
            try {
                try {
                    if (this.L != null && this.K != null) {
                        com.google.android.gms.internal.play_billing.q.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.I.unbindService(this.L);
                        this.L = new bh.k(this, 2);
                    }
                    this.K = null;
                    if (this.M != null) {
                        this.M.shutdownNow();
                        this.M = null;
                    }
                } catch (RuntimeException e3) {
                    com.google.android.gms.internal.play_billing.q.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e3);
                }
                this.J = 3;
            } catch (Throwable th2) {
                this.J = 3;
                throw th2;
            }
        }
        super.c();
    }

    @Override
    public final h e(Activity activity, g gVar) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) T(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e3) {
            U(MediaError.DetailedErrorCode.MEDIA_DECODE, 28, o0.F);
            com.google.android.gms.internal.play_billing.q.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e3);
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            U(95, 28, o0.F);
            com.google.android.gms.internal.play_billing.q.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
        }
        if (iIntValue > 0) {
            h hVarA = o0.a(iIntValue, "Billing override value was set by a license tester.");
            U(93, 2, hVarA);
            O(hVarA);
            return hVarA;
        }
        try {
            return super.e(activity, gVar);
        } catch (Exception e11) {
            h hVar = o0.f12932h;
            U(MediaError.DetailedErrorCode.MEDIA_NETWORK, 2, hVar);
            com.google.android.gms.internal.play_billing.q.i("BillingClientTesting", "An internal error occurred.", e11);
            return hVar;
        }
    }

    @Override
    public final void f(w wVar, com.revenuecat.purchases.google.usecase.c cVar) {
        W(7, new h0(cVar, 0), new ca.u(this, wVar, cVar, 4));
    }

    @Override
    public final void i(c cVar) {
        synchronized (this) {
            if (S()) {
                com.google.android.gms.internal.play_billing.q.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                V(26);
            } else {
                int i10 = 1;
                if (this.J == 1) {
                    com.google.android.gms.internal.play_billing.q.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.J == 3) {
                    com.google.android.gms.internal.play_billing.q.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    U(38, 26, o0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.J = 1;
                    com.google.android.gms.internal.play_billing.q.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.L = new bh.k(this, 2);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.I;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                com.google.android.gms.internal.play_billing.q.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.L, 1)) {
                                    com.google.android.gms.internal.play_billing.q.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    com.google.android.gms.internal.play_billing.q.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i10 = 39;
                        }
                    }
                    this.J = 0;
                    com.google.android.gms.internal.play_billing.q.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    U(i10, 26, o0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        J(cVar);
    }
}
