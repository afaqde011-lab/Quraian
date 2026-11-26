package qd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.l4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.m4;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.r3;
import com.google.android.gms.internal.play_billing.v1;
import java.util.concurrent.TimeUnit;

public final class d0 implements ServiceConnection {
    public final c A;
    public final com.google.android.gms.internal.play_billing.l B;
    public final com.google.android.gms.internal.play_billing.l C;
    public final b D;

    public d0(b bVar, c cVar) {
        this.D = bVar;
        v1 v1Var = bVar.H;
        this.B = new com.google.android.gms.internal.play_billing.l(v1Var);
        this.C = new com.google.android.gms.internal.play_billing.l(v1Var);
        this.A = cVar;
    }

    public final Long a(boolean z10) {
        try {
            if (z10) {
                synchronized (this.D.f12839a) {
                    try {
                        com.google.android.gms.internal.play_billing.l lVar = this.B;
                        if (!lVar.f3998b) {
                            return null;
                        }
                        long jD = lVar.f3997a.d();
                        if (!lVar.f3998b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        lVar.f3998b = false;
                        long j9 = (jD - lVar.f4000d) + lVar.f3999c;
                        lVar.f3999c = j9;
                        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j9, TimeUnit.NANOSECONDS));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.D.f12839a) {
                try {
                    com.google.android.gms.internal.play_billing.l lVar2 = this.C;
                    if (!lVar2.f3998b) {
                        return null;
                    }
                    long jD2 = lVar2.f3997a.d();
                    if (!lVar2.f3998b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    lVar2.f3998b = false;
                    long j10 = (jD2 - lVar2.f4000d) + lVar2.f3999c;
                    lVar2.f3999c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception getting connection establishment duration.", th4);
            return null;
        }
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception getting connection establishment duration.", th4);
        return null;
    }

    public final void b(h hVar, int i10, String str, boolean z10, int i11) {
        try {
            p3 p3VarS = q3.s();
            p3VarS.f(hVar.f12892a);
            String str2 = hVar.f12894c;
            p3VarS.c();
            q3.u((q3) p3VarS.B, str2);
            p3VarS.e(i10);
            p3VarS.c();
            q3.v((q3) p3VarS.B, i11);
            if (str != null) {
                p3VarS.c();
                q3.t((q3) p3VarS.B, str);
            }
            Long lA = a(z10);
            b bVar = this.D;
            if (!z10) {
                j4 j4VarR = k4.r();
                j4VarR.c();
                k4.s((k4) j4VarR.B, (q3) p3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    j4VarR.c();
                    k4.t((k4) j4VarR.B, jLongValue);
                }
                bVar.f12846h.E((k4) j4VarR.a());
                return;
            }
            m4 m4VarR = n4.r();
            m4VarR.e(false);
            m4VarR.f();
            m4VarR.c();
            n4.v((n4) m4VarR.B, i11);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                m4VarR.c();
                n4.u((n4) m4VarR.B, jLongValue2);
            }
            l3 l3VarU = m3.u();
            l3VarU.e(p3VarS);
            l3VarU.g(6);
            l3VarU.f(m4VarR);
            bVar.F((m3) l3VarU.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(boolean z10, int i10) {
        try {
            Long lA = a(z10);
            b bVar = this.D;
            if (!z10) {
                j4 j4VarR = k4.r();
                p3 p3VarS = q3.s();
                p3VarS.f(0);
                p3VarS.c();
                q3.v((q3) p3VarS.B, i10);
                j4VarR.c();
                k4.s((k4) j4VarR.B, (q3) p3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    j4VarR.c();
                    k4.t((k4) j4VarR.B, jLongValue);
                }
                bVar.f12846h.E((k4) j4VarR.a());
                return;
            }
            n3 n3VarS = o3.s();
            n3VarS.c();
            o3.r((o3) n3VarS.B, 6);
            m4 m4VarR = n4.r();
            m4VarR.e(false);
            m4VarR.f();
            m4VarR.c();
            n4.v((n4) m4VarR.B, i10);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                m4VarR.c();
                n4.u((n4) m4VarR.B, jLongValue2);
            }
            n3VarS.c();
            o3.x((o3) n3VarS.B, (n4) m4VarR.a());
            bVar.G((o3) n3VarS.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void d(h hVar) {
        b bVar = this.D;
        synchronized (bVar.f12839a) {
            try {
                if (bVar.f12840b == 3) {
                    return;
                }
                try {
                    this.A.onBillingSetupFinished(hVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(Exception exc, boolean z10, int i10) {
        int i11;
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z11 = exc instanceof DeadObjectException;
        if (z11) {
            i11 = 132;
        } else if (exc instanceof RemoteException) {
            i11 = 134;
        } else {
            i11 = exc instanceof SecurityException ? 133 : 131;
        }
        int i12 = i11;
        String strA = m0.a(exc);
        this.D.I(0);
        b(z11 ? o0.f12934j : o0.f12932h, i12, strA, z10, i10);
        d(z11 ? o0.f12934j : o0.f12932h);
    }

    public final void f(Exception exc, boolean z10) {
        int i10;
        int i11;
        String strA;
        h hVar;
        h hVar2;
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z11 = exc instanceof DeadObjectException;
        if (z11) {
            i11 = 91;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i11 = 92;
                } else {
                    i10 = 42;
                }
                if (e4.f.a(i10, 42)) {
                    strA = m0.a(exc);
                } else {
                    strA = null;
                }
                String str = strA;
                this.D.I(0);
                if (z11) {
                    hVar = o0.f12934j;
                } else {
                    hVar = o0.f12932h;
                }
                b(hVar, i10, str, z10, 0);
                if (z11) {
                    hVar2 = o0.f12934j;
                } else {
                    hVar2 = o0.f12932h;
                }
                d(hVar2);
            }
            i11 = 90;
        }
        i10 = i11;
        if (e4.f.a(i10, 42)) {
            strA = m0.a(exc);
        } else {
            strA = null;
        }
        String str2 = strA;
        this.D.I(0);
        if (z11) {
            hVar = o0.f12934j;
        } else {
            hVar = o0.f12932h;
        }
        b(hVar, i10, str2, z10, 0);
        if (z11) {
            hVar2 = o0.f12934j;
        } else {
            hVar2 = o0.f12932h;
        }
        d(hVar2);
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        boolean z10;
        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.D;
            synchronized (bVar.f12839a) {
                z10 = true;
                if (bVar.f12840b != 1) {
                    z10 = false;
                }
            }
            if (z10) {
                q3.e0 e0Var = bVar.f12846h;
                l3 l3VarU = m3.u();
                l3VarU.g(6);
                p3 p3VarS = q3.s();
                p3VarS.e(MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE);
                l3VarU.e(p3VarS);
                m4 m4VarR = n4.r();
                m4VarR.e(false);
                m4VarR.f();
                l3VarU.f(m4VarR);
                e0Var.w((m3) l3VarU.a());
            } else {
                bVar.f12846h.B(r3.r());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.D;
        synchronized (bVar2.f12839a) {
            if (bVar2.f12840b != 3 && bVar2.f12840b != 0) {
                bVar2.I(0);
                bVar2.K();
                try {
                    this.A.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.q.g("BillingClient", "Billing service connected.");
        b bVar = this.D;
        synchronized (bVar.f12839a) {
            try {
                if (bVar.f12840b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f3948f;
                int i11 = 1;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    aVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.c ? (com.google.android.gms.internal.play_billing.c) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.a(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                bVar.f12847i = aVar;
                if (b.k(new ef.b(this, i11), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new a50.d(this, 18), bVar.l(), bVar.j()) == null) {
                    h hVarO = bVar.o();
                    bVar.H(25, hVarO);
                    d(hVarO);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.D;
            synchronized (bVar.f12839a) {
                z10 = true;
                if (bVar.f12840b != 1) {
                    z10 = false;
                }
            }
            if (z10) {
                q3.e0 e0Var = bVar.f12846h;
                l3 l3VarU = m3.u();
                l3VarU.g(6);
                p3 p3VarS = q3.s();
                p3VarS.e(109);
                l3VarU.e(p3VarS);
                m4 m4VarR = n4.r();
                m4VarR.e(false);
                m4VarR.f();
                l3VarU.f(m4VarR);
                e0Var.w((m3) l3VarU.a());
            } else {
                bVar.f12846h.F(l4.r());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.D;
        synchronized (bVar2.f12839a) {
            try {
                if (y3.f3924f) {
                    if (bVar2.f12840b != 3 && bVar2.f12840b != 0) {
                        com.google.android.gms.internal.play_billing.l lVar = this.C;
                        lVar.f3999c = 0L;
                        lVar.f3998b = false;
                        lVar.a();
                    }
                    return;
                }
                com.google.android.gms.internal.play_billing.l lVar2 = this.C;
                lVar2.f3999c = 0L;
                lVar2.f3998b = false;
                lVar2.a();
                if (bVar2.f12840b == 3) {
                    return;
                }
                bVar2.I(0);
                try {
                    this.A.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
