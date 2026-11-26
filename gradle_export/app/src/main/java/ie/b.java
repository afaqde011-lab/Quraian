package ie;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.d0;
import ff.d;
import h7.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import pe.f;

public class b {

    public pe.a f7619a;

    public d f7620b;

    public boolean f7621c;

    public final Object f7622d = new Object();

    public c f7623e;

    public final Context f7624f;

    public final long f7625g;

    public b(Context context) {
        d0.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f7624f = applicationContext != null ? applicationContext : context;
        this.f7621c = false;
        this.f7625g = -1L;
    }

    public static a a(Context context) {
        b bVar = new b(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.c();
            a aVarE = bVar.e();
            d(aVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            bVar.b();
            return aVarE;
        } catch (Throwable th2) {
            try {
                d(null, -1L, th2);
                throw th2;
            } catch (Throwable th3) {
                bVar.b();
                throw th3;
            }
        }
    }

    public static void d(a aVar, long j9, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f7618b ? "0" : "1");
                String str = aVar.f7617a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j9));
            new g(map, 2).start();
        }
    }

    public final void b() {
        d0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f7624f == null || this.f7619a == null) {
                    return;
                }
                try {
                    if (this.f7621c) {
                        ue.a.b().c(this.f7624f, this.f7619a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f7621c = false;
                this.f7620b = null;
                this.f7619a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        d0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f7621c) {
                    b();
                }
                Context context = this.f7624f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f12493b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    pe.a aVar = new pe.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ue.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f7619a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i10 = ff.c.f5640e;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f7620b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new ff.b(iBinderA);
                            this.f7621c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final a e() {
        a aVar;
        d0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f7621c) {
                    synchronized (this.f7622d) {
                        c cVar = this.f7623e;
                        if (cVar == null || !cVar.D) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f7621c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e3) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                    }
                }
                d0.h(this.f7619a);
                d0.h(this.f7620b);
                try {
                    ff.b bVar = (ff.b) this.f7620b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z10 = true;
                    Parcel parcelD = bVar.d(1, parcelObtain);
                    String string = parcelD.readString();
                    parcelD.recycle();
                    ff.b bVar2 = (ff.b) this.f7620b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = ff.a.f5638a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelD2 = bVar2.d(2, parcelObtain2);
                    if (parcelD2.readInt() == 0) {
                        z10 = false;
                    }
                    parcelD2.recycle();
                    aVar = new a(string, z10);
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f7622d) {
            c cVar2 = this.f7623e;
            if (cVar2 != null) {
                cVar2.C.countDown();
                try {
                    this.f7623e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j9 = this.f7625g;
            if (j9 > 0) {
                this.f7623e = new c(this, j9);
            }
        }
        return aVar;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
