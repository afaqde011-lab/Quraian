package vg;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class m {

    public final n f15665a;

    public m(n nVar) {
        this.f15665a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f15665a;
        l lVar = nVar.V;
        if (nVar.S == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.S;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.S.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.S.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.S = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().l(nVar.S);
        nVar.j(nVar.b());
    }
}
