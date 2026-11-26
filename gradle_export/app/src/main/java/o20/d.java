package o20;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class d extends OutputStream {
    public static final byte[] F = new byte[0];
    public int C;
    public int E;
    public final int A = 128;
    public final ArrayList B = new ArrayList();
    public byte[] D = new byte[128];

    public final void a(int i) {
        this.B.add(new t(this.D));
        int length = this.C + this.D.length;
        this.C = length;
        this.D = new byte[Math.max(this.A, Math.max(i, length >>> 1))];
        this.E = 0;
    }

    public final void i() {
        int i = this.E;
        byte[] bArr = this.D;
        int length = bArr.length;
        ArrayList arrayList = this.B;
        if (i >= length) {
            arrayList.add(new t(this.D));
            this.D = F;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new t(bArr2));
        }
        this.C += this.E;
        this.E = 0;
    }

    public final synchronized e l() {
        ArrayList arrayList;
        i();
        arrayList = this.B;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? e.A : e.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.C + this.E;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override
    public final synchronized void write(int i) {
        try {
            if (this.E == this.D.length) {
                a(1);
            }
            byte[] bArr = this.D;
            int i2 = this.E;
            this.E = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.D;
            int length = bArr2.length;
            int i3 = this.E;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.E += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                a(i4);
                System.arraycopy(bArr, i + length2, this.D, 0, i4);
                this.E = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
