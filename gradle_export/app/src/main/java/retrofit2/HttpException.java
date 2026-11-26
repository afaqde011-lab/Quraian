package retrofit2;

import l60.o0;
import x40.b0;

public class HttpException extends RuntimeException {
    public final int A;
    public final transient o0 B;

    public HttpException(o0 o0Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        b0 b0Var = o0Var.a;
        int i = b0Var.D;
        sb.append(i);
        sb.append(" ");
        sb.append(b0Var.C);
        super(sb.toString());
        this.A = i;
        this.B = o0Var;
    }
}
