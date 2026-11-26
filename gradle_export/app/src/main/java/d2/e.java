package d2;

import kotlin.jvm.internal.m;
import me.i;

public final class e {

    public final int f4588a;

    public final long f4589b;

    public final f f4590c;

    public final i f4591d;

    public e(int i10, long j9, f fVar, i iVar) {
        this.f4588a = i10;
        this.f4589b = j9;
        this.f4590c = fVar;
        this.f4591d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4588a == eVar.f4588a && this.f4589b == eVar.f4589b && this.f4590c == eVar.f4590c && m.a(this.f4591d, eVar.f4591d);
    }

    public final int hashCode() {
        int iHashCode = (this.f4590c.hashCode() + w.c.f(Integer.hashCode(this.f4588a) * 31, this.f4589b, 31)) * 31;
        i iVar = this.f4591d;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f4588a + ", timestamp=" + this.f4589b + ", type=" + this.f4590c + ", structureCompat=" + this.f4591d + ')';
    }
}
