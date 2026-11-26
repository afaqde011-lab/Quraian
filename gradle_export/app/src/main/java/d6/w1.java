package d6;

import android.widget.RemoteViews;

public final class w1 {

    public final RemoteViews f4710a;

    public final j1 f4711b;

    public w1(RemoteViews remoteViews, j1 j1Var) {
        this.f4710a = remoteViews;
        this.f4711b = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.m.a(this.f4710a, w1Var.f4710a) && kotlin.jvm.internal.m.a(this.f4711b, w1Var.f4711b);
    }

    public final int hashCode() {
        return this.f4711b.hashCode() + (this.f4710a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f4710a + ", view=" + this.f4711b + ')';
    }
}
