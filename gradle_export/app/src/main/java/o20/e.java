package o20;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

public abstract class e implements Iterable {
    public static final t A = new t(new byte[0]);

    public static e a(Iterator it, int i) {
        if (i == 1) {
            return (e) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static d l() {
        return new d();
    }

    public final e b(e eVar) {
        int size = size();
        int size2 = eVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = y.H;
        y yVar = this instanceof y ? (y) this : null;
        if (eVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return eVar;
        }
        int size3 = eVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = eVar.size();
            byte[] bArr = new byte[size4 + size5];
            c(bArr, 0, 0, size4);
            eVar.c(bArr, 0, size4, size5);
            return new t(bArr);
        }
        if (yVar != null) {
            e eVar2 = yVar.D;
            if (eVar.size() + eVar2.size() < 128) {
                int size6 = eVar2.size();
                int size7 = eVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                eVar2.c(bArr2, 0, 0, size6);
                eVar.c(bArr2, 0, size6, size7);
                return new y(yVar.C, new t(bArr2));
            }
        }
        if (yVar != null) {
            e eVar3 = yVar.D;
            e eVar4 = yVar.C;
            if (eVar4.h() > eVar3.h() && yVar.F > eVar.h()) {
                return new y(eVar4, new y(eVar3, eVar));
            }
        }
        if (size3 >= y.H[Math.max(h(), eVar.h()) + 1]) {
            return new y(this, eVar);
        }
        o10.b bVar = new o10.b(1);
        bVar.m(this);
        bVar.m(eVar);
        Stack stack = (Stack) bVar.B;
        e yVar2 = (e) stack.pop();
        while (!stack.isEmpty()) {
            yVar2 = new y((e) stack.pop(), yVar2);
        }
        return yVar2;
    }

    public final void c(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                e(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract int h();

    public abstract boolean i();

    public abstract boolean k();

    public abstract int m(int i, int i2, int i3);

    public abstract int n(int i, int i2, int i3);

    public abstract int o();

    public abstract String p();

    public final String q() {
        try {
            return p();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract void r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
