package r30;

import java.util.Iterator;

public final class c implements q30.j {
    public final CharSequence a;
    public final int b;
    public final u00.n c;

    public c(CharSequence input, int i, u00.n nVar) {
        kotlin.jvm.internal.m.e(input, "input");
        this.a = input;
        this.b = i;
        this.c = nVar;
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
