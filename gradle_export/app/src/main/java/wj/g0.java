package wj;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class g0 implements Serializer {
    public final p0 A;

    public g0(p0 p0Var) {
        kotlin.jvm.internal.m.e(p0Var, "sessionGenerator");
        this.A = p0Var;
    }

    @Override
    public final Object getDefaultValue() {
        return new f0(this.A.a(null), null, null);
    }

    @Override
    public final Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException {
        try {
            q40.b bVar = q40.c.d;
            String strO0 = r30.r.o0(w50.c.a0(inputStream));
            bVar.getClass();
            return (f0) bVar.b(strO0, f0.Companion.serializer());
        } catch (Exception e3) {
            throw new CorruptionException("Cannot parse session data", e3);
        }
    }

    @Override
    public final Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) throws IOException {
        byte[] bytes = q40.c.d.d(f0.Companion.serializer(), (f0) obj).getBytes(r30.a.a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return g00.b0.a;
    }
}
