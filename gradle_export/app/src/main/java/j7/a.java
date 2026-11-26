package j7;

import androidx.media3.common.k2;
import java.util.Objects;
import s7.a0;

public final class a {

    public final long f8198a;

    public final k2 f8199b;

    public final int f8200c;

    public final a0 f8201d;

    public final long f8202e;

    public final k2 f8203f;

    public final int f8204g;

    public final a0 f8205h;

    public final long f8206i;

    public final long f8207j;

    public a(long j9, k2 k2Var, int i10, a0 a0Var, long j10, k2 k2Var2, int i11, a0 a0Var2, long j11, long j12) {
        this.f8198a = j9;
        this.f8199b = k2Var;
        this.f8200c = i10;
        this.f8201d = a0Var;
        this.f8202e = j10;
        this.f8203f = k2Var2;
        this.f8204g = i11;
        this.f8205h = a0Var2;
        this.f8206i = j11;
        this.f8207j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8198a == aVar.f8198a && this.f8200c == aVar.f8200c && this.f8202e == aVar.f8202e && this.f8204g == aVar.f8204g && this.f8206i == aVar.f8206i && this.f8207j == aVar.f8207j && Objects.equals(this.f8199b, aVar.f8199b) && Objects.equals(this.f8201d, aVar.f8201d) && Objects.equals(this.f8203f, aVar.f8203f) && Objects.equals(this.f8205h, aVar.f8205h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8198a), this.f8199b, Integer.valueOf(this.f8200c), this.f8201d, Long.valueOf(this.f8202e), this.f8203f, Integer.valueOf(this.f8204g), this.f8205h, Long.valueOf(this.f8206i), Long.valueOf(this.f8207j));
    }
}
