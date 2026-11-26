package x40;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class c0 extends Reader {
    public final k50.k A;
    public final Charset B;
    public boolean C;
    public InputStreamReader D;

    public c0(k50.k source, Charset charset) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(charset, "charset");
        this.A = source;
        this.B = charset;
    }

    @Override
    public final void close() throws IOException {
        g00.b0 b0Var;
        this.C = true;
        InputStreamReader inputStreamReader = this.D;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            b0Var = g00.b0.a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.A.close();
        }
    }

    @Override
    public final int read(char[] cbuf, int i, int i2) throws IOException {
        kotlin.jvm.internal.m.e(cbuf, "cbuf");
        if (this.C) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.D;
        if (inputStreamReader == null) {
            k50.k kVar = this.A;
            inputStreamReader = new InputStreamReader(kVar.l0(), y40.b.r(kVar, this.B));
            this.D = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i, i2);
    }
}
