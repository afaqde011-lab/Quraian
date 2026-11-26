package z4;

import android.graphics.Point;

public final class t {

    public final int f17223a;

    public final int f17224b;

    public final Point f17225c;

    public t(int i10, int i11, Point point) {
        int i12 = point.x;
        int i13 = point.y;
        this.f17223a = i10;
        this.f17224b = i11;
        this.f17225c = new Point(i12, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f17223a == tVar.f17223a && this.f17224b == tVar.f17224b && this.f17225c.equals(tVar.f17225c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17225c.hashCode() + (((this.f17223a * 31) + this.f17224b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i10 = this.f17223a;
        if (i10 == 0) {
            str = "TopLeft";
        } else if (i10 == 1) {
            str = "TopRight";
        } else if (i10 != 2) {
            str = i10 != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb2.append(str);
        sb2.append(", radius=");
        sb2.append(this.f17224b);
        sb2.append(", center=");
        sb2.append(this.f17225c);
        sb2.append('}');
        return sb2.toString();
    }
}
