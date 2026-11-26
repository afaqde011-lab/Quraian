package gf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import h1.l;
import hf.i;
import je.c;

public final class a extends k {

    public final int f6316a = 0;

    public final Object f6317b;

    public a(Context context, Looper looper, h hVar, g gVar, n nVar) {
        super(context, looper, 16, hVar, gVar, nVar);
        this.f6317b = new Bundle();
    }

    public a(Context context, Looper looper, h hVar, c cVar, o oVar, p pVar) {
        super(context, looper, 68, hVar, oVar, pVar);
        cVar = cVar == null ? c.C : cVar;
        l lVar = new l();
        lVar.A = Boolean.FALSE;
        c cVar2 = c.C;
        cVar.getClass();
        lVar.A = Boolean.valueOf(cVar.A);
        lVar.B = cVar.B;
        lVar.B = hf.g.a();
        this.f6317b = new c(lVar);
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        switch (this.f6316a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                return iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new i(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
        }
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        switch (this.f6316a) {
            case 0:
                return (Bundle) this.f6317b;
            default:
                c cVar = (c) this.f6317b;
                cVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("consumer_package", null);
                bundle.putBoolean("force_save_dialog", cVar.A);
                bundle.putString("log_session_id", cVar.B);
                return bundle;
        }
    }

    @Override
    public final int getMinApkVersion() {
        switch (this.f6316a) {
            case 0:
                return 12451000;
            default:
                return 12800000;
        }
    }

    @Override
    public final String getServiceDescriptor() {
        switch (this.f6316a) {
            case 0:
                return "com.google.android.gms.auth.api.internal.IAuthService";
            default:
                return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
        }
    }

    @Override
    public final String getStartServiceAction() {
        switch (this.f6316a) {
            case 0:
                return "com.google.android.gms.auth.service.START";
            default:
                return "com.google.android.gms.auth.api.credentials.service.START";
        }
    }

    @Override
    public boolean requiresSignIn() {
        switch (this.f6316a) {
            case 0:
                h clientSettings = getClientSettings();
                clientSettings.getClass();
                if (!TextUtils.isEmpty(null)) {
                    if (clientSettings.f3272c.get(je.b.f8272a) != null) {
                        throw new ClassCastException();
                    }
                    if (!clientSettings.f3270a.isEmpty()) {
                        return true;
                    }
                }
                return false;
            default:
                return super.requiresSignIn();
        }
    }

    @Override
    public boolean usesClientTelemetry() {
        switch (this.f6316a) {
            case 0:
                return true;
            default:
                return super.usesClientTelemetry();
        }
    }
}
