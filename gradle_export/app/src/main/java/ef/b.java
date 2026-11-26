package ef;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.os.OperationCanceledException;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.play_billing.c;
import com.google.android.gms.internal.play_billing.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import oi.k;
import qd.d0;
import qd.f0;
import qd.h;
import qd.o0;
import qd.s0;
import tf.a1;
import tf.n1;
import tf.s;
import tf.t0;
import tf.y3;

public final class b implements Callable {

    public final int f5373a;

    public final Object f5374b;

    public b(Object obj, int i10) {
        this.f5373a = i10;
        this.f5374b = obj;
    }

    public b(n1 n1Var, s sVar, String str) {
        this.f5373a = 3;
        this.f5374b = n1Var;
    }

    @Override
    public final Object call() {
        Bundle bundle;
        c cVar;
        int i10;
        switch (this.f5373a) {
            case 0:
                return ((Context) this.f5374b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                d0 d0Var = (d0) this.f5374b;
                qd.b bVar = d0Var.D;
                synchronized (bVar.f12839a) {
                    try {
                        if (bVar.f12840b != 3) {
                            int i11 = 0;
                            boolean z10 = true;
                            int i12 = 1;
                            if (bVar.f12840b != 1) {
                                z10 = false;
                            }
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                q.b(bundle, bVar.f12842d, bVar.G.longValue());
                            }
                            synchronized (bVar.f12839a) {
                                cVar = bVar.f12847i;
                                break;
                            }
                            if (cVar == null) {
                                qd.b bVar2 = d0Var.D;
                                bVar2.I(0);
                                h hVar = o0.f12934j;
                                bVar2.H(107, hVar);
                                d0Var.d(hVar);
                            } else {
                                String packageName = d0Var.D.f12845g.getPackageName();
                                try {
                                    com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                    if (aVar.p2(packageName, 25, "inapp") == 0) {
                                        qd.b bVar3 = d0Var.D;
                                        Context context = bVar3.f12845g;
                                        synchronized (s0.class) {
                                        }
                                        synchronized (s0.class) {
                                        }
                                        synchronized (s0.class) {
                                        }
                                        synchronized (s0.class) {
                                        }
                                        long jMin = 100;
                                        Exception e3 = null;
                                        while (true) {
                                            long j9 = i11;
                                            if (j9 <= 3) {
                                                try {
                                                    Boolean boolValueOf = Boolean.valueOf(z10);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("callingPackage", bVar3.f12845g.getPackageName());
                                                    q.b(bundle2, bVar3.f12842d, bVar3.G.longValue());
                                                    if (bVar3.D != null) {
                                                        bundle2.putBoolean("enablePendingPurchases", true);
                                                    }
                                                    a8.o0 o0Var = bVar3.D;
                                                    if (o0Var != null && o0Var.f304a) {
                                                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z10);
                                                    }
                                                    aVar.z2(bVar3.f12845g.getPackageName(), bundle2, new f0(bVar3, d0Var, boolValueOf, i11));
                                                } catch (SecurityException e10) {
                                                    d0Var.e(e10, z10, i11);
                                                } catch (Exception e11) {
                                                    e3 = e11;
                                                    if (j9 != 3) {
                                                        q.i("BillingClient", k.i("Transient error during initialize(), retrying in ", jMin, "ms"), e3);
                                                        try {
                                                            Thread.sleep(jMin);
                                                            jMin = (long) Math.min(jMin * 2.0d, 60000L);
                                                            i11++;
                                                        } catch (InterruptedException e12) {
                                                            Thread.currentThread().interrupt();
                                                            d0Var.e(e12, z10, i11);
                                                        }
                                                    } else {
                                                        d0Var.e(e3, z10, i11);
                                                    }
                                                }
                                            }
                                        }
                                        d0Var.e(e3, z10, i11);
                                    } else {
                                        int iP2 = 3;
                                        int i13 = 29;
                                        while (true) {
                                            if (i13 >= 3) {
                                                try {
                                                    q.g("BillingClient", bi.b.c0(i13, "trying subs apiVersion: "));
                                                    iP2 = bundle == null ? aVar.p2(packageName, i13, "subs") : aVar.q2(i13, packageName, "subs", bundle);
                                                    if (iP2 == 0) {
                                                        q.g("BillingClient", bi.b.c0(i13, "highestLevelSupportedForSubs: "));
                                                    } else {
                                                        i13--;
                                                    }
                                                } catch (Exception e13) {
                                                    d0Var.f(e13, z10);
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                        }
                                        qd.b bVar4 = d0Var.D;
                                        bVar4.l = i13 >= 5 ? z10 : false;
                                        bVar4.f12849k = i13 >= 3 ? z10 : false;
                                        if (i13 < 3) {
                                            q.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i12 = 9;
                                        }
                                        for (int i14 = 29; i14 >= 3; i14--) {
                                            q.g("BillingClient", bi.b.c0(i14, "trying inapp apiVersion: "));
                                            iP2 = bundle == null ? aVar.p2(packageName, i14, "inapp") : aVar.q2(i14, packageName, "inapp", bundle);
                                            if (iP2 == 0) {
                                                bVar4.m = i14;
                                                q.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                                qd.b.s(bVar4, bVar4.m);
                                                if (bVar4.m < 3) {
                                                    q.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                                    i12 = 36;
                                                }
                                                i10 = i12;
                                                qd.b.t(bVar4, iP2);
                                                if (iP2 == 0) {
                                                    d0Var.c(z10, 0);
                                                    d0Var.d(o0.f12933i);
                                                } else {
                                                    h hVar2 = o0.f12926b;
                                                    d0Var.b(hVar2, i10, null, z10, 0);
                                                    d0Var.d(hVar2);
                                                }
                                            }
                                        }
                                        qd.b.s(bVar4, bVar4.m);
                                        if (bVar4.m < 3) {
                                            q.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i12 = 36;
                                        }
                                        i10 = i12;
                                        qd.b.t(bVar4, iP2);
                                        if (iP2 == 0) {
                                            d0Var.c(z10, 0);
                                            d0Var.d(o0.f12933i);
                                        } else {
                                            h hVar3 = o0.f12926b;
                                            d0Var.b(hVar3, i10, null, z10, 0);
                                            d0Var.d(hVar3);
                                        }
                                    }
                                } catch (Exception e14) {
                                    d0Var.f(e14, z10);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 2:
                return new h4(((a1) this.f5374b).L);
            case 3:
                n1 n1Var = (n1) this.f5374b;
                n1Var.f14673e.x();
                t0 t0Var = n1Var.f14673e.H;
                y3.R(t0Var);
                t0Var.V0();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                y6.a aVar2 = (y6.a) this.f5374b;
                AtomicBoolean atomicBoolean = aVar2.D;
                aVar2.E.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        aVar2.G.c();
                        break;
                    } catch (OperationCanceledException e15) {
                        if (!atomicBoolean.get()) {
                            throw e15;
                        }
                    }
                    Binder.flushPendingCommands();
                    aVar2.a(null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        atomicBoolean.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        aVar2.a(null);
                        throw th4;
                    }
                }
        }
    }
}
