package bi;

import a1.u0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d0;
import java.util.Arrays;
import l9.f0;

public final class i {

    public final String f2541a;

    public final String f2542b;

    public final String f2543c;

    public final String f2544d;

    public final String f2545e;

    public final String f2546f;

    public final String f2547g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = ve.e.f15628a;
        d0.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f2542b = str;
        this.f2541a = str2;
        this.f2543c = str3;
        this.f2544d = str4;
        this.f2545e = str5;
        this.f2546f = str6;
        this.f2547g = str7;
    }

    public static i a(Context context) {
        u0 u0Var = new u0(context, 15);
        String strK = u0Var.K("google_app_id");
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        return new i(strK, u0Var.K("google_api_key"), u0Var.K("firebase_database_url"), u0Var.K("ga_trackingId"), u0Var.K("gcm_defaultSenderId"), u0Var.K("google_storage_bucket"), u0Var.K("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return d0.k(this.f2542b, iVar.f2542b) && d0.k(this.f2541a, iVar.f2541a) && d0.k(this.f2543c, iVar.f2543c) && d0.k(this.f2544d, iVar.f2544d) && d0.k(this.f2545e, iVar.f2545e) && d0.k(this.f2546f, iVar.f2546f) && d0.k(this.f2547g, iVar.f2547g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2542b, this.f2541a, this.f2543c, this.f2544d, this.f2545e, this.f2546f, this.f2547g});
    }

    public final String toString() {
        f0 f0Var = new f0(this);
        f0Var.a(this.f2542b, "applicationId");
        f0Var.a(this.f2541a, "apiKey");
        f0Var.a(this.f2543c, "databaseUrl");
        f0Var.a(this.f2545e, "gcmSenderId");
        f0Var.a(this.f2546f, "storageBucket");
        f0Var.a(this.f2547g, "projectId");
        return f0Var.toString();
    }
}
