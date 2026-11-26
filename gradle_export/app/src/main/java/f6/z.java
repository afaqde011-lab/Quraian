package f6;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import g00.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public final class z implements Serializer {
    public static final z A = new z();
    public static final s B;

    static {
        s sVarQ = s.q();
        kotlin.jvm.internal.m.d(sVarQ, "getDefaultInstance(...)");
        B = sVarQ;
    }

    @Override
    public final Object getDefaultValue() {
        return B;
    }

    @Override
    public final Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException {
        try {
            return s.t(inputStream);
        } catch (InvalidProtocolBufferException e3) {
            throw new CorruptionException("Cannot read proto.", e3);
        }
    }

    @Override
    public final Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) throws IOException {
        s sVar = (s) obj;
        sVar.getClass();
        int iB = sVar.b(null);
        Logger logger = androidx.glance.appwidget.protobuf.o.f932c;
        if (iB > 4096) {
            iB = 4096;
        }
        androidx.glance.appwidget.protobuf.n nVar = new androidx.glance.appwidget.protobuf.n(outputStream, iB);
        sVar.m(nVar);
        if (nVar.f928g > 0) {
            nVar.H0();
        }
        return b0.a;
    }
}
