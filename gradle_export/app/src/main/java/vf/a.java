package vf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.k;

public final class a extends k implements com.google.android.gms.common.api.g {

    public final boolean f15632a;

    public final com.google.android.gms.common.internal.h f15633b;

    public final Bundle f15634c;

    public final Integer f15635d;

    public a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Bundle bundle, o oVar, p pVar) {
        super(context, looper, 44, hVar, oVar, pVar);
        this.f15632a = true;
        this.f15633b = hVar;
        this.f15634c = bundle;
        this.f15635d = hVar.f3276g;
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 3);
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.common.internal.h hVar = this.f15633b;
        boolean zEquals = getContext().getPackageName().equals(hVar.f3273d);
        Bundle bundle = this.f15634c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", hVar.f3273d);
        }
        return bundle;
    }

    @Override
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final boolean requiresSignIn() {
        return this.f15632a;
    }
}
