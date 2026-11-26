package x5;

import android.text.InputFilter;
import android.widget.TextView;

public final class g extends a.a {

    public final f f16465a;

    public g(TextView textView) {
        this.f16465a = new f(textView);
    }

    @Override
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !v5.g.d() ? inputFilterArr : this.f16465a.A(inputFilterArr);
    }

    @Override
    public final void b0(boolean z10) {
        if (v5.g.d()) {
            this.f16465a.b0(z10);
        }
    }

    @Override
    public final void c0(boolean z10) {
        boolean zD = v5.g.d();
        f fVar = this.f16465a;
        if (zD) {
            fVar.c0(z10);
        } else {
            fVar.f16464c = z10;
        }
    }
}
