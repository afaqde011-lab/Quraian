package jl;

import ab.a0;
import c4.b0;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import q30.j;
import u00.n;
import y3.g;
import y3.k;

public final class d implements b0 {
    public final long A;
    public final y3.c B;
    public final boolean C;
    public final n D;

    public d(long j, y3.c density, boolean z, n onPositionCalculated) {
        m.e(density, "density");
        m.e(onPositionCalculated, "onPositionCalculated");
        this.A = j;
        this.B = density;
        this.C = z;
        this.D = onPositionCalculated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.A == dVar.A && m.a(this.B, dVar.B) && this.C == dVar.C && m.a(this.D, dVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final long f(k anchorBounds, long j, y3.m layoutDirection, long j2) {
        j jVarL0;
        Object next;
        m.e(anchorBounds, "anchorBounds");
        m.e(layoutDirection, "layoutDirection");
        float f = c.b;
        y3.c cVar = this.B;
        int iR0 = cVar.R0(f);
        long j3 = this.A;
        int iR1 = cVar.R0(g.a(j3));
        int iR2 = cVar.R0(g.b(j3));
        int i = anchorBounds.a;
        int i2 = i + iR1;
        int i3 = anchorBounds.c;
        int i4 = (int) (j2 >> 32);
        int iIntValue = (i3 - iR1) - i4;
        int i5 = (int) (j >> 32);
        int i6 = i5 - i4;
        Object obj = null;
        if (this.C) {
            iIntValue = a0.y(((anchorBounds.d() - i4) / 2) + i + iR1, 0, i6);
        } else {
            if (layoutDirection == y3.m.A) {
                Integer numValueOf = Integer.valueOf(i2);
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                if (i < 0) {
                    i6 = 0;
                }
                jVarL0 = h00.n.l0(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i6)});
            } else {
                Integer numValueOf3 = Integer.valueOf(iIntValue);
                Integer numValueOf4 = Integer.valueOf(i2);
                if (i3 <= i5) {
                    i6 = 0;
                }
                jVarL0 = h00.n.l0(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i6)});
            }
            Iterator it = jVarL0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 >= 0 && iIntValue2 + i4 <= i5) {
                    break;
                }
            }
            Integer num = (Integer) next;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        int iMax = Math.max(anchorBounds.d + iR2, iR0);
        int i7 = anchorBounds.b;
        int i8 = (int) (j2 & 4294967295L);
        int iIntValue3 = (i7 - iR2) - i8;
        int i9 = (int) (j & 4294967295L);
        for (Object obj2 : h00.n.l0(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i7 - (i8 / 2)), Integer.valueOf((i9 - i8) - iR0)})) {
            int iIntValue4 = ((Number) obj2).intValue();
            if (iIntValue4 >= iR0 && iIntValue4 + i8 <= i9 - iR0) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.D.invoke(anchorBounds, new k(iIntValue, iIntValue3, i4 + iIntValue, i8 + iIntValue3));
        return (((long) iIntValue) << 32) | (((long) iIntValue3) & 4294967295L);
    }

    public final int hashCode() {
        return this.D.hashCode() + w.c.e((this.B.hashCode() + (Long.hashCode(this.A) * 31)) * 31, 31, this.C);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + g.c(this.A) + ", density=" + this.B + ", centerOnAnchor=" + this.C + ", onPositionCalculated=" + this.D + ")";
    }
}
