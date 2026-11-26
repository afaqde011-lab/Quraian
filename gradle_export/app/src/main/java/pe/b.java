package pe;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import java.util.Arrays;
import l9.f0;
import ri.t1;

public final class b extends re.a {
    public final int A;
    public final int B;
    public final PendingIntent C;
    public final String D;
    public final Integer E;
    public static final b F = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new le.b(12);

    public b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.A = i10;
        this.B = i11;
        this.C = pendingIntent;
        this.D = str;
        this.E = num;
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }

    public static String a(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case TYPE_SINT64_VALUE:
                        return "SERVICE_UPDATING";
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        return "SERVICE_MISSING_PERMISSION";
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        return "RESTRICTED_PROFILE";
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.B == bVar.B && d0.k(this.C, bVar.C) && d0.k(this.D, bVar.D) && d0.k(this.E, bVar.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.B), this.C, this.D, this.E});
    }

    public final String toString() {
        f0 f0Var = new f0(this);
        f0Var.a(a(this.B), "statusCode");
        f0Var.a(this.C, "resolution");
        f0Var.a(this.D, "message");
        f0Var.a(this.E, "clientMethodKey");
        return f0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        t1.a0(parcel, 3, this.C, i10);
        t1.b0(parcel, 4, this.D);
        t1.Y(parcel, 5, this.E);
        t1.h0(iG0, parcel);
    }
}
