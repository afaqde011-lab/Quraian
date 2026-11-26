package a1;

import com.google.protobuf.RuntimeVersion;

public final class i0 {

    public final int f54a;

    public int f55b;

    public char[] f56c;

    public int f57d;

    public int f58e;

    public final int a() {
        int i10;
        int i11;
        switch (this.f54a) {
            case 0:
                i10 = this.f58e;
                i11 = this.f57d;
                break;
            default:
                i10 = this.f58e;
                i11 = this.f57d;
                break;
        }
        return i10 - i11;
    }

    public final String toString() {
        switch (this.f54a) {
        }
        return RuntimeVersion.SUFFIX;
    }
}
