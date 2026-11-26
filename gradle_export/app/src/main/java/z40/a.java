package z40;

import x40.a0;
import x40.b0;

public final class a {
    public static final b0 a(b0 b0Var) {
        if ((b0Var != null ? b0Var.G : null) == null) {
            return b0Var;
        }
        a0 a0VarL = b0Var.l();
        a0VarL.g = null;
        return a0VarL.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
