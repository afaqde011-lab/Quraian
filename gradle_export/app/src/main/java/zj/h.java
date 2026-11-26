package zj;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import g00.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import r30.r;

public final class h implements Serializer {
    public static final h A = new h();
    public static final g B = new g(null, null, null, null, null);

    @Override
    public final Object getDefaultValue() {
        return B;
    }

    @Override
    public final Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException {
        try {
            q40.b bVar = q40.c.d;
            String strO0 = r.o0(w50.c.a0(inputStream));
            bVar.getClass();
            return (g) bVar.b(strO0, g.Companion.serializer());
        } catch (Exception e3) {
            throw new CorruptionException("Cannot parse session configs", e3);
        }
    }

    @Override
    public final Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) throws IOException {
        byte[] bytes = q40.c.d.d(g.Companion.serializer(), (g) obj).getBytes(r30.a.a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return b0.a;
    }
}
