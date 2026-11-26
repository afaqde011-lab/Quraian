package yw;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mchutov.quranify.RecitersModel;
import g00.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;

public final class c implements Serializer {
    public static final c A = new c();
    public static final RecitersModel B;

    static {
        RecitersModel defaultInstance = RecitersModel.getDefaultInstance();
        m.d(defaultInstance, "getDefaultInstance(...)");
        B = defaultInstance;
    }

    public final Object getDefaultValue() {
        return B;
    }

    public final Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException, IOException {
        try {
            RecitersModel from = RecitersModel.parseFrom(inputStream);
            m.b(from);
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public final Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) {
        ((RecitersModel) obj).writeTo(outputStream);
        return b0.a;
    }
}
