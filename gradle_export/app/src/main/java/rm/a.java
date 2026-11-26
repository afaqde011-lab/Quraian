package rm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c3.w2;
import kotlin.jvm.internal.m;

public final class a implements w2 {
    public final Context a;

    public a(Context context) {
        m.e(context, "context");
        this.a = context;
    }

    public final void a(String uri) {
        m.e(uri, "uri");
        this.a.startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(uri)), null));
    }
}
