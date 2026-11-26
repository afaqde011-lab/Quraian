package p;

import android.content.Context;
import android.view.View;
import android.view.Window;

public final class r2 implements View.OnClickListener {
    public final o.a A;
    public final s2 B;

    public r2(s2 s2Var) {
        this.B = s2Var;
        Context context = s2Var.f12208a.getContext();
        CharSequence charSequence = s2Var.f12215h;
        o.a aVar = new o.a();
        aVar.f11386e = 4096;
        aVar.f11388g = 4096;
        aVar.l = null;
        aVar.m = null;
        aVar.f11393n = false;
        aVar.f11394o = false;
        aVar.f11395p = 16;
        aVar.f11390i = context;
        aVar.f11382a = charSequence;
        this.A = aVar;
    }

    @Override
    public final void onClick(View view) {
        s2 s2Var = this.B;
        Window.Callback callback = s2Var.f12218k;
        if (callback == null || !s2Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.A);
    }
}
