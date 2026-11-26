package c3;

import android.content.ClipboardManager;
import android.content.Context;

public final class j implements h1 {

    public final Context f2683a;

    public ClipboardManager f2684b;

    public j(Context context) {
        this.f2683a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.f2684b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f2683a.getSystemService("clipboard");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f2684b = clipboardManager2;
        return clipboardManager2;
    }
}
