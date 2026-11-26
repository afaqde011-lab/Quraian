package d40;

public final class m1 implements h1 {
    public final long a;

    public m1(long j) {
        this.a = j;
        if (j < 0) {
            throw new IllegalArgumentException(oi.k.i("stopTimeout(", j, " ms) cannot be negative").toString());
        }
    }

    @Override
    public final i a(e40.u uVar) {
        return o.o(new z(o.y(uVar, new k1(this, null)), new l1(2, null, 0), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return this.a == ((m1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        i00.b bVar = new i00.b(2);
        long j = this.a;
        if (j > 0) {
            bVar.add("stopTimeout=" + j + "ms");
        }
        return g4.c.k(new StringBuilder("SharingStarted.WhileSubscribed("), h00.q.R0(va.a.k(bVar), null, null, null, null, 63), ')');
    }
}
