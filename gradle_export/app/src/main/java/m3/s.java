package m3;

public final class s {

    public final b f10525a;

    public final int f10526b;

    public final int f10527c;

    public final int f10528d;

    public final int f10529e;

    public final float f10530f;

    public final float f10531g;

    public s(b bVar, int i10, int i11, int i12, int i13, float f3, float f10) {
        this.f10525a = bVar;
        this.f10526b = i10;
        this.f10527c = i11;
        this.f10528d = i12;
        this.f10529e = i13;
        this.f10530f = f3;
        this.f10531g = f10;
    }

    public final h2.c a(h2.c cVar) {
        return cVar.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f10530f)) & 4294967295L));
    }

    public final long b(boolean z10, long j9) {
        if (z10) {
            long j10 = q0.f10518b;
            if (q0.c(j9, j10)) {
                return j10;
            }
        }
        int i10 = q0.f10519c;
        int i11 = this.f10526b;
        return h0.b(((int) (j9 >> 32)) + i11, ((int) (j9 & 4294967295L)) + i11);
    }

    public final h2.c c(h2.c cVar) {
        float f3 = -this.f10530f;
        return cVar.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public final int d(int i10) {
        int i11 = this.f10527c;
        int i12 = this.f10526b;
        return ab.a0.y(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f10525a.equals(sVar.f10525a) && this.f10526b == sVar.f10526b && this.f10527c == sVar.f10527c && this.f10528d == sVar.f10528d && this.f10529e == sVar.f10529e && Float.compare(this.f10530f, sVar.f10530f) == 0 && Float.compare(this.f10531g, sVar.f10531g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10531g) + w.c.c(this.f10530f, w.c.d(this.f10529e, w.c.d(this.f10528d, w.c.d(this.f10527c, w.c.d(this.f10526b, this.f10525a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f10525a);
        sb2.append(", startIndex=");
        sb2.append(this.f10526b);
        sb2.append(", endIndex=");
        sb2.append(this.f10527c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f10528d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f10529e);
        sb2.append(", top=");
        sb2.append(this.f10530f);
        sb2.append(", bottom=");
        return w.c.k(sb2, this.f10531g, ')');
    }
}
