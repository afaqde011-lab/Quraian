package o20;

import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class t extends e {
    public final byte[] B;
    public int C = 0;

    public t(byte[] bArr) {
        this.B = bArr;
    }

    @Override
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.B, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || size() != ((e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof t) {
            return s((t) obj, 0, size());
        }
        if (obj instanceof y) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(x5.n(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override
    public final int h() {
        return 0;
    }

    public final int hashCode() {
        int iM = this.C;
        if (iM == 0) {
            int size = size();
            iM = m(size, 0, size);
            if (iM == 0) {
                iM = 1;
            }
            this.C = iM;
        }
        return iM;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    @Override
    public final boolean k() {
        byte[] bArr = this.B;
        return c0.c(bArr, 0, bArr.length) == 0;
    }

    @Override
    public final int m(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.B[i4];
        }
        return i;
    }

    @Override
    public final int n(int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: o20.t.n(int, int, int):int");
    }

    @Override
    public final int o() {
        return this.C;
    }

    @Override
    public final String p() {
        byte[] bArr = this.B;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override
    public final void r(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.B, i, i2);
    }

    public final boolean s(t tVar, int i, int i2) {
        byte[] bArr = tVar.B;
        int length = bArr.length;
        byte[] bArr2 = this.B;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = tVar.B.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new IllegalArgumentException(x5.j(length3, ", ", sb2));
    }

    @Override
    public int size() {
        return this.B.length;
    }
}
