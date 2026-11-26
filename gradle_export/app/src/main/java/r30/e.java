package r30;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator, v00.a {
    public final CharSequence A;
    public int B;
    public int C;
    public int D;
    public int E;

    public e(CharSequence string) {
        kotlin.jvm.internal.m.e(string, "string");
        this.A = string;
    }

    @Override
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.B;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.E < 0) {
            this.B = 2;
            return false;
        }
        CharSequence charSequence = this.A;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.C; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.B = 1;
                this.E = i;
                this.D = length;
                return true;
            }
        }
        i = -1;
        this.B = 1;
        this.E = i;
        this.D = length;
        return true;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.B = 0;
        int i = this.D;
        int i2 = this.C;
        this.C = this.E + i;
        return this.A.subSequence(i2, i).toString();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
