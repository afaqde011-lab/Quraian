package vg;

import android.text.Editable;

public final class l extends ng.i {
    public final n A;

    public l(n nVar) {
        this.A = nVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.A.b().a();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.A.b().b();
    }
}
