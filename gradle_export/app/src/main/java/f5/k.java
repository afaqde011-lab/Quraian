package f5;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import org.json.JSONObject;
import r30.r;

public final class k implements OutcomeReceiver {
    public final f A;

    public k(f fVar, l lVar) {
        this.A = fVar;
    }

    @Override
    public final void onError(Throwable th2) {
        GetCredentialCustomException getCredentialCustomException;
        Object objV;
        String string;
        GetCredentialException getCredentialExceptionH = j.h(th2);
        kotlin.jvm.internal.m.e(getCredentialExceptionH, "error");
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialExceptionH.getType();
        kotlin.jvm.internal.m.d(type, "error.type");
        String message = getCredentialExceptionH.getMessage();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    objV = new GetCredentialUnknownException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i10 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        try {
                            if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                throw new FrameworkClassParsingException();
                            }
                            int i11 = GetPublicKeyCredentialDomException.B;
                            objV = k00.f.v(type, string);
                        } catch (FrameworkClassParsingException unused) {
                            getCredentialCustomException = new GetCredentialCustomException(string, type);
                            objV = getCredentialCustomException;
                        }
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            case -408155724:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    objV = new GetCredentialUnsupportedException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i12 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i13 = GetPublicKeyCredentialDomException.B;
                        objV = k00.f.v(type, string);
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    objV = new GetCredentialInterruptedException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i14 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i15 = GetPublicKeyCredentialDomException.B;
                        objV = k00.f.v(type, string);
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    objV = new GetCredentialCancellationException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i16 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i17 = GetPublicKeyCredentialDomException.B;
                        objV = k00.f.v(type, string);
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    objV = new NoCredentialException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i18 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i19 = GetPublicKeyCredentialDomException.B;
                        objV = k00.f.v(type, string);
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            case 1594095913:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    objV = new GetCredentialProviderConfigurationException(message);
                } else {
                    if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i110 = GetPublicKeyCredentialException.A;
                        if (message != null) {
                            string = message.toString();
                        } else {
                            string = null;
                        }
                        if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i111 = GetPublicKeyCredentialDomException.B;
                        objV = k00.f.v(type, string);
                    } else {
                        getCredentialCustomException = new GetCredentialCustomException(message, type);
                    }
                    objV = getCredentialCustomException;
                }
                this.A.a(objV);
                return;
            default:
                if (r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i112 = GetPublicKeyCredentialException.A;
                    if (message != null) {
                        string = message.toString();
                    } else {
                        string = null;
                    }
                    if (!r.x0(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i113 = GetPublicKeyCredentialDomException.B;
                    objV = k00.f.v(type, string);
                    this.A.a(objV);
                    return;
                }
                getCredentialCustomException = new GetCredentialCustomException(message, type);
                objV = getCredentialCustomException;
                this.A.a(objV);
                return;
        }
    }

    @Override
    public final void onResult(Object obj) throws NoCredentialException {
        m mVar;
        m mVar2;
        GetCredentialResponse getCredentialResponseI = j.i(obj);
        kotlin.jvm.internal.m.e(getCredentialResponseI, "response");
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponseI.getCredential();
        kotlin.jvm.internal.m.d(credential, "response.credential");
        String type = credential.getType();
        kotlin.jvm.internal.m.d(type, "credential.type");
        Bundle data = credential.getData();
        kotlin.jvm.internal.m.d(data, "credential.data");
        try {
            switch (type.hashCode()) {
                case -1678407252:
                    if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            kotlin.jvm.internal.m.b(string);
                            mVar2 = new m("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", data);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    mVar = mVar2;
                                    this.A.b(new o(mVar));
                                    return;
                                } catch (Exception unused) {
                                    throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        mVar2 = new m("androidx.credentials.TYPE_RESTORE_CREDENTIAL", data);
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                mVar = mVar2;
                                this.A.b(new o(mVar));
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            kotlin.jvm.internal.m.b(string3);
                            kotlin.jvm.internal.m.b(string4);
                            mVar2 = new m(string4, 2, data);
                            mVar = mVar2;
                            this.A.b(new o(mVar));
                            return;
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            kotlin.jvm.internal.m.b(string5);
                            mVar = new m(string5, 3, data);
                            this.A.b(new o(mVar));
                            return;
                        } catch (Exception unused5) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused6) {
            mVar = new m(type, 0, data);
        }
    }
}
