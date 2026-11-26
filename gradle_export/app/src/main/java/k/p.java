package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.cast.Cast;
import java.lang.ref.WeakReference;

public abstract class p {
    public static final ca.z A = new ca.z(new fi.d(1));
    public static final int B = -100;
    public static Boolean C = null;
    public static boolean D = false;
    public static final u.f E = new u.f(null);
    public static final Object F = new Object();
    public static final Object G = null;

    public static boolean c(Context context) {
        if (C == null) {
            try {
                int i10 = i0.A;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) i0.class), h0.a() | Cast.MAX_NAMESPACE_LENGTH).metaData;
                if (bundle != null) {
                    C = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                C = Boolean.FALSE;
            }
        }
        return C.booleanValue();
    }

    public static void f(b0 b0Var) {
        synchronized (F) {
            try {
                u.f fVar = E;
                fVar.getClass();
                u.a aVar = new u.a(fVar);
                while (aVar.hasNext()) {
                    p pVar = (p) ((WeakReference) aVar.next()).get();
                    if (pVar == b0Var || pVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i10);

    public abstract void h(int i10);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);

    public abstract n.b l(n.a aVar);
}
