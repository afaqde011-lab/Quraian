package zj;

import android.net.Uri;
import com.google.android.gms.cast.CredentialsData;
import java.net.URL;

public final class d {

    public final wj.b f17512a;

    public final k00.i f17513b;

    public d(wj.b bVar, k00.i iVar) {
        kotlin.jvm.internal.m.e(bVar, "appInfo");
        kotlin.jvm.internal.m.e(iVar, "blockingDispatcher");
        this.f17512a = bVar;
        this.f17513b = iVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(CredentialsData.CREDENTIALS_TYPE_ANDROID).appendPath("gmp");
        wj.b bVar = dVar.f17512a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f16117a).appendPath("settings");
        wj.a aVar = bVar.f16118b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f16105c).appendQueryParameter("display_version", aVar.f16104b).build().toString());
    }
}
