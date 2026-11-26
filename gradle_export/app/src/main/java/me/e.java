package me;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class e extends com.google.android.gms.common.internal.k {

    public final GoogleSignInOptions f10891a;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, GoogleSignInOptions googleSignInOptions, o oVar, p pVar) {
        le.a aVar;
        super(context, looper, 91, hVar, oVar, pVar);
        Set<Scope> set = hVar.f3271b;
        if (googleSignInOptions != null) {
            aVar = new le.a();
            aVar.f10282a = new HashSet();
            aVar.f10289h = new HashMap();
            aVar.f10282a = new HashSet(googleSignInOptions.B);
            aVar.f10283b = googleSignInOptions.E;
            aVar.f10284c = googleSignInOptions.F;
            aVar.f10285d = googleSignInOptions.D;
            aVar.f10286e = googleSignInOptions.G;
            aVar.f10287f = googleSignInOptions.C;
            aVar.f10288g = googleSignInOptions.H;
            aVar.f10289h = GoogleSignInOptions.b(googleSignInOptions.I);
            aVar.f10290i = googleSignInOptions.J;
        } else {
            aVar = new le.a();
            aVar.f10282a = new HashSet();
            aVar.f10289h = new HashMap();
        }
        aVar.f10290i = hf.g.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f10282a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f10282a;
        if (hashSet2.contains(GoogleSignInOptions.N)) {
            Scope scope2 = GoogleSignInOptions.M;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.f10285d && (aVar.f10287f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.L);
        }
        this.f10891a = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f10287f, aVar.f10285d, aVar.f10283b, aVar.f10284c, aVar.f10286e, aVar.f10288g, aVar.f10289h, aVar.f10290i);
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 2);
    }

    @Override
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f10895a.g("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f10891a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override
    public final boolean providesSignIn() {
        return true;
    }
}
