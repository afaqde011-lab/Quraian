package s7;

import androidx.media3.common.l2;
import com.google.protobuf.RuntimeVersion;
import fh.d2;

public final class l1 {

    public static final l1 f13708d = new l1(new l2[0]);

    public static final String f13709e;

    public final int f13710a;

    public final d2 f13711b;

    public int f13712c;

    static {
        String str = e7.i0.f5136a;
        f13709e = Integer.toString(0, 36);
    }

    public l1(l2... l2VarArr) {
        d2 d2VarP = fh.t0.p(l2VarArr);
        this.f13711b = d2VarP;
        this.f13710a = l2VarArr.length;
        int i10 = 0;
        while (i10 < d2VarP.D) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < d2VarP.D; i12++) {
                if (((l2) d2VarP.get(i10)).equals(d2VarP.get(i12))) {
                    e7.a.e("TrackGroupArray", RuntimeVersion.SUFFIX, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final l2 a(int i10) {
        return (l2) this.f13711b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f13710a == l1Var.f13710a && this.f13711b.equals(l1Var.f13711b);
    }

    public final int hashCode() {
        if (this.f13712c == 0) {
            this.f13712c = this.f13711b.hashCode();
        }
        return this.f13712c;
    }

    public final String toString() {
        return this.f13711b.toString();
    }
}
