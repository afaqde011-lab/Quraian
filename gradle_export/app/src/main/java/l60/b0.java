package l60;

import java.util.Objects;

public final class b0 extends w0 {
    public final int d;
    public final String e;
    public final a f;
    public final boolean g;

    public b0(String str, int i, boolean z) {
        this.d = i;
        switch (i) {
            case 1:
                a aVar = a.B;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = aVar;
                this.g = z;
                break;
            case 2:
                a aVar2 = a.B;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = aVar2;
                this.g = z;
                break;
            default:
                a aVar3 = a.B;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = aVar3;
                this.g = z;
                break;
        }
    }

    @Override
    public final void a(m0 m0Var, Object obj) {
        switch (this.d) {
            case 0:
                if (obj != null) {
                    this.f.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        m0Var.a(this.e, string, this.g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        m0Var.b(this.e, string2, this.g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        m0Var.d(this.e, string3, this.g);
                        break;
                    }
                }
                break;
        }
    }
}
