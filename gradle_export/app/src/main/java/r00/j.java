package r00;

import c3.y2;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class j implements Iterator, v00.a {
    public String A;
    public boolean B;
    public final y2 C;

    public j(y2 y2Var) {
        this.C = y2Var;
    }

    @Override
    public final boolean hasNext() throws IOException {
        if (this.A == null && !this.B) {
            String line = ((BufferedReader) this.C.b).readLine();
            this.A = line;
            if (line == null) {
                this.B = true;
            }
        }
        return this.A != null;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.A;
        this.A = null;
        m.b(str);
        return str;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
