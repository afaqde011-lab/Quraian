package zv;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mchutov.quranify.PlaylistsModel;
import g00.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k00.c;
import kotlin.jvm.internal.m;

public final class a implements Serializer {
    public static final a A = new a();
    public static final PlaylistsModel B;

    static {
        PlaylistsModel defaultInstance = PlaylistsModel.getDefaultInstance();
        m.d(defaultInstance, "getDefaultInstance(...)");
        B = defaultInstance;
    }

    public final Object getDefaultValue() {
        return B;
    }

    public final Object readFrom(InputStream inputStream, c cVar) throws CorruptionException, IOException {
        try {
            PlaylistsModel from = PlaylistsModel.parseFrom(inputStream);
            m.b(from);
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public final Object writeTo(Object obj, OutputStream outputStream, c cVar) {
        ((PlaylistsModel) obj).writeTo(outputStream);
        return b0.a;
    }
}
