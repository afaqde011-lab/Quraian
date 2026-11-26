package vg;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

public final class t extends o {

    public final int f15695e;

    public EditText f15696f;

    public final androidx.mediarouter.app.c f15697g;

    public t(n nVar, int i10) {
        super(nVar);
        this.f15695e = 2131230953;
        this.f15697g = new androidx.mediarouter.app.c(this, 9);
        if (i10 != 0) {
            this.f15695e = i10;
        }
    }

    @Override
    public final void b() {
        p();
    }

    @Override
    public final int c() {
        return 2131887003;
    }

    @Override
    public final int d() {
        return this.f15695e;
    }

    @Override
    public final View.OnClickListener f() {
        return this.f15697g;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        EditText editText = this.f15696f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override
    public final void l(EditText editText) {
        this.f15696f = editText;
        p();
    }

    @Override
    public final void q() {
        EditText editText = this.f15696f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15696f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override
    public final void r() {
        EditText editText = this.f15696f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
