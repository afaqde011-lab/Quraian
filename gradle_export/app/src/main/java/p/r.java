package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public final class r {

    public static final PorterDuff.Mode f12193b = PorterDuff.Mode.SRC_IN;

    public static r f12194c;

    public d2 f12195a;

    public static synchronized r a() {
        try {
            if (f12194c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12194c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return d2.e(i10, mode);
    }

    public static synchronized void d() {
        if (f12194c == null) {
            r rVar = new r();
            f12194c = rVar;
            rVar.f12195a = d2.b();
            d2 d2Var = f12194c.f12195a;
            th.o oVar = new th.o();
            synchronized (d2Var) {
                d2Var.f12153e = oVar;
            }
        }
    }

    public static void e(Drawable drawable, bd.f fVar, int[] iArr) {
        PorterDuff.Mode mode = d2.f12146f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = fVar.B;
        if (!z10 && !fVar.A) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z10 ? (ColorStateList) fVar.C : null;
        PorterDuff.Mode mode2 = fVar.A ? (PorterDuff.Mode) fVar.D : d2.f12146f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = d2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f12195a.c(context, i10);
    }
}
