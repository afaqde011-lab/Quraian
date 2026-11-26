package c3;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

public final class k0 {

    public static final k0 f2687a = new k0();

    public final void a(View view, v2.p pVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = pVar instanceof v2.a ? PointerIcon.getSystemIcon(context, ((v2.a) pVar).f15350b) : PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.m.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
