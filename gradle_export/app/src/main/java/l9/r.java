package l9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.a2;
import k9.m1;
import tf.c3;
import tf.e4;
import tf.g4;
import tf.h1;
import tf.n1;
import tf.q0;
import tf.y3;

public final class r implements Runnable {
    public final int A;
    public final Object B;
    public final String C;
    public final Object D;
    public final Object E;
    public final Object F;

    public r(Object obj, Object obj2, String str, Object obj3, Parcelable parcelable, int i10) {
        this.A = i10;
        this.F = obj;
        this.D = obj2;
        this.C = str;
        this.E = obj3;
        this.B = parcelable;
    }

    public r(c3 c3Var, String str, String str2, g4 g4Var, com.google.android.gms.internal.measurement.l0 l0Var) {
        this.A = 3;
        this.C = str;
        this.D = str2;
        this.E = g4Var;
        this.B = l0Var;
        this.F = c3Var;
    }

    public r(n1 n1Var, g4 g4Var, Bundle bundle, tf.g0 g0Var, String str) {
        this.A = 1;
        this.D = n1Var;
        this.E = g4Var;
        this.B = bundle;
        this.F = g0Var;
        this.C = str;
    }

    @Override
    public final void run() {
        AtomicReference atomicReference;
        e4 e4Var;
        switch (this.A) {
            case 0:
                String str = this.C;
                IBinder binder = ((Messenger) ((h) this.D).f10149a).getBinder();
                h hVar = (h) this.F;
                l lVar = (l) ((m1) hVar.f10149a).E.get(binder);
                if (lVar == null) {
                    x5.x("addSubscription for callback that isn't registered id=", str, "MBServiceCompat");
                    return;
                }
                HashMap map = lVar.f10165f;
                m1 m1Var = (m1) hVar.f10149a;
                IBinder iBinder = (IBinder) this.E;
                Bundle bundle = (Bundle) this.B;
                List<y4.b> arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (y4.b bVar : arrayList) {
                    if (iBinder == bVar.f16603a) {
                        Bundle bundle2 = (Bundle) bVar.f16604b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            bundle2.getClass();
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                arrayList.add(new y4.b(iBinder, bundle));
                map.put(str, arrayList);
                m1Var.g(str, lVar, bundle, null);
                m1Var.F = lVar;
                a2 a2VarB = m1Var.b();
                if (a2VarB != null) {
                    if (TextUtils.isEmpty(str)) {
                        e7.a.m("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + a2VarB);
                    } else {
                        e7.i0.M(m1Var.M.l, new ab.k(m1Var, a2VarB, bundle, str, 4));
                    }
                }
                m1Var.F = null;
                return;
            case 1:
                n1 n1Var = (n1) this.D;
                g4 g4Var = (g4) this.E;
                Bundle bundle3 = (Bundle) this.B;
                tf.g0 g0Var = (tf.g0) this.F;
                String str2 = this.C;
                y3 y3Var = n1Var.f14673e;
                y3Var.x();
                try {
                    g0Var.F1(y3Var.a0(bundle3, g4Var));
                    return;
                } catch (RemoteException e3) {
                    y3Var.t().G.d("Failed to return trigger URIs for app", str2, e3);
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.D;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c3 c3Var = (c3) this.F;
                            tf.e0 e0Var = c3Var.E;
                            if (e0Var == null) {
                                q0 q0Var = ((h1) c3Var.B).F;
                                h1.g(q0Var);
                                q0Var.G.e("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.C, (String) this.E);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(e0Var.s0(this.C, (String) this.E, (g4) this.B));
                            } else {
                                atomicReference2.set(e0Var.a0(null, this.C, (String) this.E));
                            }
                            c3Var.i1();
                            atomicReference = (AtomicReference) this.D;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e10) {
                            q0 q0Var2 = ((h1) ((c3) this.F).B).F;
                            h1.g(q0Var2);
                            q0Var2.G.e("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.C, e10);
                            ((AtomicReference) this.D).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.D;
                        }
                    } catch (Throwable th2) {
                        ((AtomicReference) this.D).notify();
                        throw th2;
                    }
                }
                break;
            default:
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.B;
                String str3 = (String) this.D;
                String str4 = this.C;
                c3 c3Var2 = (c3) this.F;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        tf.e0 e0Var2 = c3Var2.E;
                        if (e0Var2 == null) {
                            h1 h1Var = (h1) c3Var2.B;
                            q0 q0Var3 = h1Var.F;
                            h1.g(q0Var3);
                            q0Var3.G.d("Failed to get conditional properties; not connected to service", str4, str3);
                            e4Var = h1Var.I;
                        } else {
                            arrayList2 = e4.K1(e0Var2.s0(str4, str3, (g4) this.E));
                            c3Var2.i1();
                            e4Var = ((h1) c3Var2.B).I;
                        }
                    } catch (RemoteException e11) {
                        q0 q0Var4 = ((h1) c3Var2.B).F;
                        h1.g(q0Var4);
                        q0Var4.G.e("Failed to get conditional properties; remote exception", str4, str3, e11);
                    }
                    h1.e(e4Var);
                    e4Var.J1(l0Var, arrayList2);
                    return;
                } catch (Throwable th3) {
                    e4 e4Var2 = ((h1) c3Var2.B).I;
                    h1.e(e4Var2);
                    e4Var2.J1(l0Var, arrayList2);
                    throw th3;
                }
        }
    }
}
