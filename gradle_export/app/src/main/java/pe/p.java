package pe;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import ri.t1;

public abstract class p {

    public static final k f12515a;

    public static final k f12516b;

    public static volatile c0 f12517c;

    public static final Object f12518d;

    public static Context f12519e;

    static {
        new k(0, l.l2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new k(1, l.l2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new k(2, l.l2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new k(3, l.l2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f12515a = new k(4, l.l2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f12516b = new k(5, l.l2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f12518d = new Object();
    }

    public static void a() {
        c0 a0Var;
        if (f12517c != null) {
            return;
        }
        d0.h(f12519e);
        synchronized (f12518d) {
            try {
                if (f12517c == null) {
                    IBinder iBinderB = ze.c.c(f12519e, ze.c.f17414e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = b0.f3259f;
                    if (iBinderB == null) {
                        a0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        a0Var = iInterfaceQueryLocalInterface instanceof c0 ? (c0) iInterfaceQueryLocalInterface : new a0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 4);
                    }
                    f12517c = a0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static s b(String str, m mVar, boolean z10, boolean z11) {
        try {
            a();
            d0.h(f12519e);
            try {
                c0 c0Var = f12517c;
                ye.b bVar = new ye.b(f12519e.getPackageManager());
                a0 a0Var = (a0) c0Var;
                Parcel parcelI2 = a0Var.i2();
                int i10 = mf.g.f10896a;
                boolean z12 = true;
                parcelI2.writeInt(1);
                int iG0 = t1.g0(20293, parcelI2);
                t1.b0(parcelI2, 1, str);
                t1.V(parcelI2, 2, mVar);
                t1.f0(parcelI2, 3, 4);
                parcelI2.writeInt(z10 ? 1 : 0);
                t1.f0(parcelI2, 4, 4);
                parcelI2.writeInt(z11 ? 1 : 0);
                t1.h0(iG0, parcelI2);
                mf.g.b(parcelI2, bVar);
                Parcel parcelG2 = a0Var.g2(5, parcelI2);
                if (parcelG2.readInt() == 0) {
                    z12 = false;
                }
                parcelG2.recycle();
                return z12 ? s.f12521d : new r(new n(z10, str, mVar));
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return s.c("module call", e3);
            }
        } catch (DynamiteModule$LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return s.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}
