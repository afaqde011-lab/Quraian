package x8;

public final class f implements Comparable {
    public final long A;
    public final byte[] B;

    public f(byte[] bArr, long j9) {
        this.A = j9;
        this.B = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.A, ((f) obj).A);
    }
}
