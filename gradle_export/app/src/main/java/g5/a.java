package g5;

import com.google.android.gms.common.api.k;
import com.google.protobuf.RuntimeVersion;

public final class a {

    public final String f6208a;

    public a(int i10) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i10) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case 3:
                this("androidx.credentials.TYPE_DATA_ERROR");
                break;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                break;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                break;
            case 16:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                break;
            case k.RECONNECTION_TIMED_OUT:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case 24:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case RuntimeVersion.MINOR:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            default:
                break;
        }
    }

    public a(String str) {
        this.f6208a = str;
    }
}
