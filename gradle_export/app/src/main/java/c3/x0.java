package c3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class x0 implements w2 {

    public final Context f2767a;

    public x0(Context context) {
        this.f2767a = context;
    }

    @Override
    public final void a(String str) {
        try {
            this.f2767a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e3) {
            throw new IllegalArgumentException(oi.k.g('.', "Can't open ", str), e3);
        }
    }
}
