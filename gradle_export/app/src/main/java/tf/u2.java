package tf;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class u2 implements Runnable {
    public final int A = 0;
    public final String B;
    public final String C;
    public final g4 D;
    public final boolean E;
    public final c3 F;
    public final Object G;

    public u2(c3 c3Var, String str, String str2, g4 g4Var, boolean z10, com.google.android.gms.internal.measurement.l0 l0Var) {
        this.B = str;
        this.C = str2;
        this.D = g4Var;
        this.E = z10;
        this.G = l0Var;
        this.F = c3Var;
    }

    public u2(c3 c3Var, AtomicReference atomicReference, String str, String str2, g4 g4Var, boolean z10) {
        this.G = atomicReference;
        this.B = str;
        this.C = str2;
        this.D = g4Var;
        this.E = z10;
        this.F = c3Var;
    }

    @Override
    public final void run() throws Throwable {
        e4 e4Var;
        AtomicReference atomicReference;
        switch (this.A) {
            case 0:
                String str = this.C;
                String str2 = this.B;
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.G;
                c3 c3Var = this.F;
                Bundle bundle = new Bundle();
                try {
                    try {
                        e0 e0Var = c3Var.E;
                        h1 h1Var = (h1) c3Var.B;
                        if (e0Var == null) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.d("Failed to get user properties; not connected to service", str2, str);
                            e4Var = h1Var.I;
                            h1.e(e4Var);
                            e4Var.I1(l0Var, bundle);
                            return;
                        }
                        List<b4> listE0 = e0Var.E0(str2, str, this.E, this.D);
                        Bundle bundle2 = new Bundle();
                        if (listE0 != null) {
                            for (b4 b4Var : listE0) {
                                String str3 = b4Var.E;
                                String str4 = b4Var.B;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = b4Var.D;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d3 = b4Var.G;
                                        if (d3 != null) {
                                            bundle2.putDouble(str4, d3.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            c3Var.i1();
                            e4 e4Var2 = h1Var.I;
                            h1.e(e4Var2);
                            e4Var2.I1(l0Var, bundle2);
                            return;
                        } catch (RemoteException e3) {
                            e = e3;
                            bundle = bundle2;
                            q0 q0Var2 = ((h1) c3Var.B).F;
                            h1.g(q0Var2);
                            q0Var2.G.d("Failed to get user properties; remote exception", str2, e);
                            e4Var = ((h1) c3Var.B).I;
                            h1.e(e4Var);
                            e4Var.I1(l0Var, bundle);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bundle = bundle2;
                            e4 e4Var3 = ((h1) c3Var.B).I;
                            h1.e(e4Var3);
                            e4Var3.I1(l0Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e10) {
                        e = e10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.G;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c3 c3Var2 = this.F;
                            e0 e0Var2 = c3Var2.E;
                            if (e0Var2 == null) {
                                q0 q0Var3 = ((h1) c3Var2.B).F;
                                h1.g(q0Var3);
                                q0Var3.G.e("(legacy) Failed to get user properties; not connected to service", (Object) null, this.B, this.C);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(e0Var2.E0(this.B, this.C, this.E, this.D));
                            } else {
                                atomicReference2.set(e0Var2.q(null, this.B, this.C, this.E));
                            }
                            c3Var2.i1();
                            atomicReference = (AtomicReference) this.G;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e11) {
                            q0 q0Var4 = ((h1) this.F.B).F;
                            h1.g(q0Var4);
                            q0Var4.G.e("(legacy) Failed to get user properties; remote exception", (Object) null, this.B, e11);
                            ((AtomicReference) this.G).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.G;
                        }
                    } catch (Throwable th4) {
                        ((AtomicReference) this.G).notify();
                        throw th4;
                    }
                }
                break;
        }
    }
}
