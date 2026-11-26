package ic;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;

public final class d {

    public final ArrayList f7600a;

    public final char f7601b;

    public final double f7602c;

    public final String f7603d;

    public final String f7604e;

    public d(ArrayList arrayList, char c10, double d3, String str, String str2) {
        this.f7600a = arrayList;
        this.f7601b = c10;
        this.f7602c = d3;
        this.f7603d = str;
        this.f7604e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + x5.e(c10 * 31, str, 31);
    }

    public final int hashCode() {
        return a(this.f7601b, this.f7604e, this.f7603d);
    }
}
