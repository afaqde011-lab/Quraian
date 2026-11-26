package y8;

public final class h extends x8.h implements Comparable {
    public long K;

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (c(4) != hVar.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j9 = this.G - hVar.G;
        if (j9 == 0) {
            j9 = this.K - hVar.K;
            if (j9 == 0) {
                return 0;
            }
        }
        return j9 > 0 ? 1 : -1;
    }
}
