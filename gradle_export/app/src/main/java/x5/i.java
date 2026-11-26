package x5;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class i implements TextWatcher {
    public final EditText A;
    public h B;
    public boolean C = true;

    public i(EditText editText) {
        this.A = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            v5.g gVarA = v5.g.a();
            if (editableText == null) {
                length = 0;
            } else {
                gVarA.getClass();
                length = editableText.length();
            }
            gVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws Throwable {
        EditText editText = this.A;
        if (!editText.isInEditMode() && this.C && v5.g.d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iC = v5.g.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    v5.g.a().g(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            v5.g gVarA = v5.g.a();
            if (this.B == null) {
                this.B = new h(editText);
            }
            gVarA.h(this.B);
        }
    }
}
