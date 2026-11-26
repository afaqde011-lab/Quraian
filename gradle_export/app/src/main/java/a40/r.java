package a40;

public final class r {
    public final Object a;
    public final i b;
    public final u00.o c;
    public final Object d;
    public final Throwable e;

    public r(Object obj, i iVar, u00.o oVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = iVar;
        this.c = oVar;
        this.d = obj2;
        this.e = th;
    }

    public r(Object obj, i iVar, u00.o oVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : oVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static r a(r rVar, i iVar, Throwable th, int i) {
        Object obj = rVar.a;
        if ((i & 2) != 0) {
            iVar = rVar.b;
        }
        i iVar2 = iVar;
        u00.o oVar = rVar.c;
        Object obj2 = rVar.d;
        if ((i & 16) != 0) {
            th = rVar.e;
        }
        return new r(obj, iVar2, oVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.a, rVar.a) && kotlin.jvm.internal.m.a(this.b, rVar.b) && kotlin.jvm.internal.m.a(this.c, rVar.c) && kotlin.jvm.internal.m.a(this.d, rVar.d) && kotlin.jvm.internal.m.a(this.e, rVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        u00.o oVar = this.c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}
