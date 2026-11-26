package f7;

import com.google.protobuf.RuntimeVersion;
import java.util.List;
import q3.e0;
import z4.j1;
import z4.q0;

public abstract class e {
    public final int A;
    public int B;

    public e() {
        this.A = 2;
    }

    public e(int i10, int i11) {
        this.A = i11;
        this.B = i10;
    }

    public static String b(int i10) {
        return RuntimeVersion.SUFFIX + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public void a(int i10) {
        this.B = i10 | this.B;
    }

    public boolean c(int i10) {
        return (this.B & i10) == i10;
    }

    public abstract int f();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public void m(q0 q0Var) {
    }

    public void n(q0 q0Var) {
    }

    public abstract j1 o(j1 j1Var, List list);

    public abstract e0 p(q0 q0Var, e0 e0Var);

    public String toString() {
        switch (this.A) {
            case 0:
                return b(this.B);
            default:
                return super.toString();
        }
    }
}
