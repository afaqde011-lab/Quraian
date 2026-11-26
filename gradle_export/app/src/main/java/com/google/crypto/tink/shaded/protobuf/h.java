package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

public class h extends i {
    public final byte[] D;

    public h(byte[] bArr) {
        this.A = 0;
        bArr.getClass();
        this.D = bArr;
    }

    @Override
    public byte a(int i10) {
        return this.D[i10];
    }

    @Override
    public void e(int i10, byte[] bArr) {
        System.arraycopy(this.D, 0, bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i10 = this.A;
        int i11 = hVar.A;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder sbQ = oi.k.q("Ran off end of other: 0, ", size, ", ");
            sbQ.append(hVar.size());
            throw new IllegalArgumentException(sbQ.toString());
        }
        byte[] bArr = hVar.D;
        int i12 = i() + size;
        int i13 = i();
        int i14 = hVar.i();
        while (i13 < i12) {
            if (this.D[i13] != bArr[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }

    public int i() {
        return 0;
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public byte k(int i10) {
        return this.D[i10];
    }

    @Override
    public int size() {
        return this.D.length;
    }
}
