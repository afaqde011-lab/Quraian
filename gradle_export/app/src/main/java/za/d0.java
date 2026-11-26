package za;

public final class d0 extends j0 {
    @Override
    public final k0 c() {
        if (this.f17383a && this.f17385c.f7013j.f17359d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        hb.p pVar = this.f17385c;
        if (pVar.f7018q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new e0(this.f17384b, pVar, this.f17386d);
    }

    @Override
    public final j0 d() {
        return this;
    }
}
