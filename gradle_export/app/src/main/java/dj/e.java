package dj;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e implements bj.d, bj.f {

    public final boolean f4909a = true;

    public final JsonWriter f4910b;

    public final Map f4911c;

    public final Map f4912d;

    public final bj.c f4913e;

    public final boolean f4914f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z10) {
        this.f4910b = new JsonWriter(writer);
        this.f4911c = map;
        this.f4912d = map2;
        this.f4913e = aVar;
        this.f4914f = z10;
    }

    @Override
    public final bj.f a(String str) throws IOException {
        j();
        this.f4910b.value(str);
        return this;
    }

    @Override
    public final bj.f b(boolean z10) throws IOException {
        j();
        this.f4910b.value(z10);
        return this;
    }

    @Override
    public final bj.d c(bj.b bVar, double d3) throws IOException {
        String str = bVar.f2548a;
        j();
        JsonWriter jsonWriter = this.f4910b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d3);
        return this;
    }

    @Override
    public final bj.d d(bj.b bVar, int i10) throws IOException {
        String str = bVar.f2548a;
        j();
        JsonWriter jsonWriter = this.f4910b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override
    public final bj.d e(bj.b bVar, long j9) throws IOException {
        String str = bVar.f2548a;
        j();
        JsonWriter jsonWriter = this.f4910b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j9);
        return this;
    }

    @Override
    public final bj.d f(bj.b bVar, Object obj) throws IOException {
        i(obj, bVar.f2548a);
        return this;
    }

    @Override
    public final bj.d g(bj.b bVar, boolean z10) throws IOException {
        String str = bVar.f2548a;
        j();
        JsonWriter jsonWriter = this.f4910b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f4910b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e3) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            bj.c cVar = (bj.c) this.f4911c.get(obj.getClass());
            if (cVar != null) {
                jsonWriter.beginObject();
                cVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            bj.e eVar = (bj.e) this.f4912d.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f4913e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int number = ((f) obj).getNumber();
                j();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j9 = jArr[i10];
                j();
                jsonWriter.value(j9);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                h(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                h(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) throws IOException {
        boolean z10 = this.f4914f;
        JsonWriter jsonWriter = this.f4910b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f4909a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
