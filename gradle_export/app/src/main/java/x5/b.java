package x5;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import tf.x;

public final class b extends InputConnectionWrapper {

    public final EditText f16456a;

    public final x f16457b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        x xVar = new x(18);
        super(inputConnection, false);
        this.f16456a = editText;
        this.f16457b = xVar;
        if (v5.g.d()) {
            v5.g.a().i(editorInfo);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f16456a.getEditableText();
        this.f16457b.getClass();
        return x.n(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f16456a.getEditableText();
        this.f16457b.getClass();
        return x.n(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
