package o20;

import java.util.Iterator;

public final class x implements Iterator {
    public final w A;
    public androidx.datastore.preferences.protobuf.d B;
    public int C;

    public x(y yVar) {
        w wVar = new w(yVar);
        this.A = wVar;
        this.B = new androidx.datastore.preferences.protobuf.d(wVar.next());
        this.C = yVar.B;
    }

    @Override
    public final boolean hasNext() {
        return this.C > 0;
    }

    @Override
    public final Object next() {
        if (!this.B.hasNext()) {
            this.B = new androidx.datastore.preferences.protobuf.d(this.A.next());
        }
        this.C--;
        return Byte.valueOf(this.B.nextByte());
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
