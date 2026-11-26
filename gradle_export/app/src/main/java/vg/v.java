package vg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class v implements TextWatcher {
    public int A;
    public final EditText B;
    public final TextInputLayout C;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.C = textInputLayout;
        this.B = editText;
        this.A = editText.getLineCount();
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.C;
        textInputLayout.w(!textInputLayout.f4204b1, false);
        if (textInputLayout.L) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.T) {
            textInputLayout.x(editable);
        }
        EditText editText = this.B;
        int lineCount = editText.getLineCount();
        int i10 = this.A;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.U0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.A = lineCount;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
