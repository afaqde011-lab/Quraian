package wd;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

public final class u {

    public final long f16064a;

    public u(long j9) {
        this.f16064a = j9;
    }

    public static u a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        u uVar = new u(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return uVar;
                    }
                    u uVar2 = new u(jsonReader.nextLong());
                    jsonReader.close();
                    return uVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof u) && this.f16064a == ((u) obj).f16064a;
    }

    public final int hashCode() {
        long j9 = this.f16064a;
        return ((int) ((j9 >>> 32) ^ j9)) ^ 1000003;
    }

    public final String toString() {
        return a1.b.k(this.f16064a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
