package p;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public final class u {

    public final TextView f12222a;

    public final wb.o f12223b;

    public u(TextView textView) {
        this.f12222a = textView;
        this.f12223b = new wb.o(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f12222a.getContext().obtainStyledAttributes(attributeSet, j.a.f7724i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        ((a.a) this.f12223b.A).b0(z10);
    }

    public final void c(boolean z10) {
        ((a.a) this.f12223b.A).c0(z10);
    }
}
