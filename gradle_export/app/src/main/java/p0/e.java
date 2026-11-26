package p0;

import c7.i;
import i2.j0;
import i2.k0;
import i2.l0;
import y3.m;

public final class e extends a {
    @Override
    public final a b(b bVar, b bVar2, b bVar3, b bVar4) {
        return new e(bVar, bVar2, bVar3, bVar4);
    }

    @Override
    public final l0 d(long j9, float f3, float f10, float f11, float f12, m mVar) {
        if (f3 + f10 + f11 + f12 == 0.0f) {
            return new j0(bi.b.g(0L, j9));
        }
        h2.c cVarG = bi.b.g(0L, j9);
        m mVar2 = m.A;
        float f13 = mVar == mVar2 ? f3 : f10;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32);
        float f14 = mVar == mVar2 ? f10 : f3;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
        float f15 = mVar == mVar2 ? f11 : f12;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        float f16 = mVar == mVar2 ? f12 : f11;
        return new k0(i.d(cVarG, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f12239a, eVar.f12239a) && kotlin.jvm.internal.m.a(this.f12240b, eVar.f12240b) && kotlin.jvm.internal.m.a(this.f12241c, eVar.f12241c) && kotlin.jvm.internal.m.a(this.f12242d, eVar.f12242d);
    }

    public final int hashCode() {
        return this.f12242d.hashCode() + ((this.f12241c.hashCode() + ((this.f12240b.hashCode() + (this.f12239a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f12239a + ", topEnd = " + this.f12240b + ", bottomEnd = " + this.f12241c + ", bottomStart = " + this.f12242d + ')';
    }
}
