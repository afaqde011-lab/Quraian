package hf;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.cast.v;
import ke.m;

public final class d extends n {

    public static final com.google.android.gms.common.api.i f7048b = new com.google.android.gms.common.api.i("Auth.Api.Identity.SignIn.API", new v(3), new com.google.android.gms.common.api.h());

    public final String f7049a;

    public d(Context context, m mVar) {
        super(context, null, f7048b, mVar, com.google.android.gms.common.api.m.f3251c);
        this.f7049a = g.a();
    }

    public d(HiddenActivity hiddenActivity, m mVar) {
        super(hiddenActivity, hiddenActivity, f7048b, mVar, com.google.android.gms.common.api.m.f3251c);
        this.f7049a = g.a();
    }

    public final ke.j c(Intent intent) throws ApiException {
        Status status = Status.G;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : va.a.G(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.I);
        }
        if (!status2.a()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<ke.j> creator2 = ke.j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        ke.j jVar = (ke.j) (byteArrayExtra2 != null ? va.a.G(byteArrayExtra2, creator2) : null);
        if (jVar != null) {
            return jVar;
        }
        throw new ApiException(status);
    }
}
