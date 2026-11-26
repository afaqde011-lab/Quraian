package o9;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k9.x0;

public final class c0 {

    public static f f11757c;

    public final Context f11758a;

    public final ArrayList f11759b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public c0(Context context) {
        this.f11758a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static f c() {
        f fVar = f11757c;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static c0 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (f11757c == null) {
            f11757c = new f(context.getApplicationContext());
        }
        ArrayList arrayList = f11757c.f11786i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                c0 c0Var = new c0(context);
                arrayList.add(new WeakReference(c0Var));
                return c0Var;
            }
            c0 c0Var2 = (c0) ((WeakReference) arrayList.get(size)).get();
            if (c0Var2 == null) {
                arrayList.remove(size);
            } else if (c0Var2.f11758a == context) {
                return c0Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        f fVar = f11757c;
        if (fVar == null) {
            return null;
        }
        x0 x0Var = fVar.D;
        if (x0Var != null) {
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) x0Var.B;
            if (tVar != null) {
                return tVar.f515a.f507c;
            }
            return null;
        }
        android.support.v4.media.session.t tVar2 = fVar.E;
        if (tVar2 != null) {
            return tVar2.f515a.f507c;
        }
        return null;
    }

    public static b0 f() {
        b();
        return c().h();
    }

    public static boolean g() {
        Bundle bundle;
        if (f11757c == null) {
            return false;
        }
        e0 e0Var = c().f11797v;
        return e0Var == null || (bundle = e0Var.f11777e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(v0 v0Var) {
        b();
        l lVar = c().f11794s;
        if (lVar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        a5.b.n(lVar.I, v0Var != null ? a5.b.p(v0Var) : null);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        f fVarC = c();
        b0 b0VarC = fVarC.c();
        if (fVarC.h() != b0VarC) {
            fVarC.l(b0VarC, i10, true);
        }
    }

    public final void a(u uVar, v vVar, int i10) {
        w wVar;
        u uVar2;
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (vVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f11759b;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((w) arrayList.get(i11)).f11884b == vVar) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            wVar = new w(this, vVar);
            arrayList.add(wVar);
        } else {
            wVar = (w) arrayList.get(i11);
        }
        boolean z11 = true;
        if (i10 != wVar.f11886d) {
            wVar.f11886d = i10;
            z10 = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        wVar.f11887e = jElapsedRealtime;
        u uVar3 = wVar.f11885c;
        uVar3.a();
        uVar.a();
        if (uVar3.f11878b.containsAll(uVar.f11878b)) {
            z11 = z10;
        } else {
            u uVar4 = wVar.f11885c;
            if (uVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            uVar4.a();
            ArrayList<String> arrayList2 = !uVar4.f11878b.isEmpty() ? new ArrayList<>(uVar4.f11878b) : null;
            ArrayList<String> arrayListC = uVar.c();
            if (!arrayListC.isEmpty()) {
                for (String str : arrayListC) {
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                uVar2 = u.f11876c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                uVar2 = new u(bundle, arrayList2);
            }
            wVar.f11885c = uVar2;
        }
        if (z11) {
            c().n();
        }
    }

    public final void h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f11759b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((w) arrayList.get(i10)).f11884b == vVar) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            c().n();
        }
    }
}
