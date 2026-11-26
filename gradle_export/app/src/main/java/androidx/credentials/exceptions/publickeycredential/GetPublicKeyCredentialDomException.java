package androidx.credentials.exceptions.publickeycredential;

import g5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "k00/f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public static final int B = 0;

    public GetPublicKeyCredentialDomException(a aVar, String str) {
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f6208a);
        m.e(strConcat, "type");
        super(str, strConcat);
        if (strConcat.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
