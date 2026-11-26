package x5;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class j implements TransformationMethod {
    public final TransformationMethod A;

    public j(TransformationMethod transformationMethod) {
        this.A = transformationMethod;
    }

    @Override
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || v5.g.a().c() != 1) {
            return charSequence;
        }
        v5.g gVarA = v5.g.a();
        gVarA.getClass();
        return gVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
