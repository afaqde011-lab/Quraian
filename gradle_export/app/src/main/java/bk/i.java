package bk;

import com.google.protobuf.RuntimeVersion;

public final class i {

    public static final i f2550d = new i(RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, false);

    public final String f2551a;

    public final String f2552b;

    public final boolean f2553c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f2551a = str;
        this.f2552b = str2;
        this.f2553c = z10;
    }
}
