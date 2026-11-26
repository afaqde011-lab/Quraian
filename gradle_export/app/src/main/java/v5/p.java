package v5;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class p implements TextWatcher, SpanWatcher {
    public final Object A;
    public final AtomicInteger B = new AtomicInteger(0);

    public p(Object obj) {
        this.A = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.A).afterTextChanged(editable);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.A).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (this.B.get() <= 0 || !(obj instanceof s)) {
            ((SpanWatcher) this.A).onSpanAdded(spannable, obj, i10, i11);
        }
    }

    @Override
    public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        if (this.B.get() <= 0 || !(obj instanceof s)) {
            ((SpanWatcher) this.A).onSpanChanged(spannable, obj, i10, i11, i12, i13);
        }
    }

    @Override
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        if (this.B.get() <= 0 || !(obj instanceof s)) {
            ((SpanWatcher) this.A).onSpanRemoved(spannable, obj, i10, i11);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.A).onTextChanged(charSequence, i10, i11, i12);
    }
}
