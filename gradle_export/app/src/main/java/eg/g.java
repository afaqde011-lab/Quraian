package eg;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import k.e0;

public class g extends e0 {
    @Override
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof f) {
            boolean z10 = ((f) dialog).f().I;
        }
        super.dismiss();
    }

    @Override
    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof f) {
            boolean z10 = ((f) dialog).f().I;
        }
        super.dismissAllowingStateLoss();
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        int theme = getTheme();
        if (theme == 0) {
            TypedValue typedValue = new TypedValue();
            theme = context.getTheme().resolveAttribute(2130968713, typedValue, true) ? typedValue.resourceId : 2131952337;
        }
        f fVar = new f(context, theme);
        fVar.K = true;
        fVar.L = true;
        fVar.Q = new av.h(fVar, 1);
        fVar.c().g(1);
        TypedArray typedArrayObtainStyledAttributes = fVar.getContext().getTheme().obtainStyledAttributes(new int[]{2130969094});
        fVar.O = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }
}
