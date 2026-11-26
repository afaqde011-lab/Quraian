package x5;

import android.text.Editable;
import v5.q;

public final class a extends Editable.Factory {

    public static final Object f16453a = new Object();

    public static volatile a f16454b;

    public static Class f16455c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f16455c;
        return cls != null ? new q(cls, charSequence) : super.newEditable(charSequence);
    }
}
