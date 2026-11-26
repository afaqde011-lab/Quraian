package o9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class t0 {

    public final Context f11867a;

    public final f f11868b;

    public final PackageManager f11870d;

    public boolean f11872f;

    public boolean f11873g;

    public final ArrayList f11871e = new ArrayList();

    public final androidx.mediarouter.app.g f11874h = new androidx.mediarouter.app.g(this, 8);

    public final a50.d f11875i = new a50.d(this, 12);

    public final Handler f11869c = new Handler();

    public t0(Context context, f fVar) {
        this.f11867a = context;
        this.f11868b = fVar;
        this.f11870d = context.getPackageManager();
    }

    public final void a() {
        Context context;
        f fVar;
        ArrayList arrayList;
        int i10;
        if (this.f11873g) {
            new ArrayList();
            Intent intent = new Intent("android.media.MediaRoute2ProviderService");
            ArrayList arrayList2 = new ArrayList();
            PackageManager packageManager = this.f11870d;
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                context = this.f11867a;
                if (!zHasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (!this.f11872f || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                    arrayList2.add(serviceInfo);
                }
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                fVar = this.f11868b;
                boolean z10 = true;
                arrayList = this.f11871e;
                if (!zHasNext2) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((c0.f11757c == null ? false : c0.c().i()) && !arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ServiceInfo serviceInfo3 = (ServiceInfo) it3.next();
                                if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i12 = -1;
                            break;
                        }
                        ComponentName componentName = ((s0) arrayList.get(i12)).I;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i12 < 0) {
                        s0 s0Var = new s0(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        s0Var.P = new k7.t(this, s0Var);
                        if (!s0Var.L) {
                            s0Var.L = true;
                            s0Var.l();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, s0Var);
                        fVar.a(s0Var, false);
                    } else if (i12 >= i11) {
                        s0 s0Var2 = (s0) arrayList.get(i12);
                        if (!s0Var2.L) {
                            s0Var2.L = true;
                            s0Var2.l();
                        }
                        if (s0Var2.N == null) {
                            if (!s0Var2.L || (s0Var2.E == null && s0Var2.K.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                s0Var2.k();
                                s0Var2.h();
                            }
                        }
                        i10 = i11 + 1;
                        Collections.swap(arrayList, i12, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i11; size2--) {
                    s0 s0Var3 = (s0) arrayList.get(size2);
                    a0 a0VarD = fVar.d(s0Var3);
                    if (a0VarD != null) {
                        s0Var3.getClass();
                        c0.b();
                        s0Var3.D = null;
                        s0Var3.g(null);
                        fVar.p(a0VarD, null);
                        fVar.f11778a.b(514, a0VarD);
                        fVar.m.remove(a0VarD);
                    }
                    arrayList.remove(s0Var3);
                    s0Var3.P = null;
                    if (s0Var3.L) {
                        s0Var3.L = false;
                        s0Var3.l();
                    }
                }
            }
        }
    }
}
