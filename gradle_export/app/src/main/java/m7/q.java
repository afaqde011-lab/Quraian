package m7;

public final class q {

    public final long f10628a;

    public final long f10629b;

    public q(long j9, long j10) {
        this.f10628a = j9;
        this.f10629b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f10628a == qVar.f10628a && this.f10629b == qVar.f10629b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10628a) * 31) + ((int) this.f10629b);
    }
}
