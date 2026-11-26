package xb;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.m;

public final class c implements h {
    public final Context A;

    public c(Context context) {
        this.A = context;
    }

    @Override
    public final Object d(lb.h hVar) {
        DisplayMetrics displayMetrics = this.A.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m.a(this.A, ((c) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
