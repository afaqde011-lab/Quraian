package e50;

import java.io.IOException;

public abstract class o {
    public static int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(w.c.h(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
