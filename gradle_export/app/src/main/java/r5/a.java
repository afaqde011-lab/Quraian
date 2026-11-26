package r5;

import android.content.Context;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final boolean a(Context context, String str) {
        m.e(context, "context");
        m.e(str, "name");
        return context.deleteSharedPreferences(str);
    }
}
