package a1;

import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;

public abstract class j0 {
    public static boolean B(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static CredentialOption.Builder h(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static GetCredentialRequest.Builder i(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static DeleteGesture o(Object obj) {
        return (DeleteGesture) obj;
    }

    public static DeleteRangeGesture p(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static SelectRangeGesture q(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static boolean w(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
