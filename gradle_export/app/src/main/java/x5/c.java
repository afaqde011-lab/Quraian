package x5;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class c extends v5.e implements Runnable {
    public final WeakReference A;
    public final WeakReference B;

    public c(TextView textView, d dVar) {
        this.A = new WeakReference(textView);
        this.B = new WeakReference(dVar);
    }

    @Override
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.A.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.A.get();
        InputFilter inputFilter = (InputFilter) this.B.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    v5.g gVarA = v5.g.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        gVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceG = gVarA.g(0, length, 0, text);
                    if (text == charSequenceG) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceG);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                    textView.setText(charSequenceG);
                    if (charSequenceG instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceG;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
