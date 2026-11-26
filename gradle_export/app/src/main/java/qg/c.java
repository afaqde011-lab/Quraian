package qg;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.b5;

public final class c extends b5 {

    public final Context f12987b;

    public final TextPaint f12988c;

    public final b5 f12989d;

    public final d f12990e;

    public c(d dVar, Context context, TextPaint textPaint, b5 b5Var) {
        this.f12990e = dVar;
        this.f12987b = context;
        this.f12988c = textPaint;
        this.f12989d = b5Var;
    }

    @Override
    public final void E(int i10) {
        this.f12989d.E(i10);
    }

    @Override
    public final void F(Typeface typeface, boolean z10) {
        this.f12990e.f(this.f12987b, this.f12988c, typeface);
        this.f12989d.F(typeface, z10);
    }
}
