package hc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

public final class a {

    public static final Object f7035d = new Object();

    public final Context f7036a;

    public final String f7037b;

    public final Map f7038c;

    public a(Drawable.Callback callback, HashMap map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.f7037b = null;
        this.f7038c = map;
        if (callback instanceof View) {
            this.f7036a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f7036a = null;
        }
    }
}
