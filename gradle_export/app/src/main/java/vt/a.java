package vt;

import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mchutov.quranify.DownloadedSurahModel;
import g00.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k00.c;
import kotlin.jvm.internal.m;

public final class a implements Serializer {
    public static final a A = new a();
    public static final DownloadedSurahModel B;

    static {
        DownloadedSurahModel defaultInstance = DownloadedSurahModel.getDefaultInstance();
        m.d(defaultInstance, "getDefaultInstance(...)");
        B = defaultInstance;
    }

    public final Object getDefaultValue() {
        return B;
    }

    public final Object readFrom(InputStream inputStream, c cVar) throws IOException {
        try {
            DownloadedSurahModel from = DownloadedSurahModel.parseFrom(inputStream);
            m.b(from);
            return from;
        } catch (InvalidProtocolBufferException unused) {
            return B;
        }
    }

    public final Object writeTo(Object obj, OutputStream outputStream, c cVar) {
        ((DownloadedSurahModel) obj).writeTo(outputStream);
        return b0.a;
    }
}
