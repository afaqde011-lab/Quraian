package f5;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import b3.j0;
import java.util.concurrent.Executor;

public final class l implements i {

    public final CredentialManager f5483a;

    public l(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.f5483a = j.d(context.getSystemService("credential"));
    }

    @Override
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f5483a != null;
    }

    @Override
    public final void onGetCredential(Context context, n nVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.m.e(context, "context");
        f fVar = (f) gVar;
        j0 j0Var = new j0(fVar, 10);
        CredentialManager credentialManager = this.f5483a;
        if (credentialManager == null) {
            j0Var.invoke();
            return;
        }
        k kVar = new k(fVar, this);
        j.n();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderI = a1.j0.i(bundle);
        for (p pVar : nVar.f5484a) {
            j.C();
            pVar.getClass();
            builderI.addCredentialOption(a1.j0.h(pVar.f5486a, pVar.f5487b).setIsSystemProviderRequired(true).setAllowedProviders(pVar.f5488c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderI.build();
        kotlin.jvm.internal.m.d(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (d) executor, kVar);
    }
}
