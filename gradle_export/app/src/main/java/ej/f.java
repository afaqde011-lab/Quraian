package ej;

import com.google.android.gms.cast.Cast;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f implements bj.d {

    public static final Charset f5383f = Charset.forName("UTF-8");

    public static final bj.b f5384g = new bj.b("key", w.c.p(w.c.o(e.class, new a(1))));

    public static final bj.b f5385h = new bj.b("value", w.c.p(w.c.o(e.class, new a(2))));

    public static final dj.a f5386i = new dj.a(1);

    public OutputStream f5387a;

    public final HashMap f5388b;

    public final HashMap f5389c;

    public final bj.c f5390d;

    public final h f5391e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, bj.c cVar) {
        this.f5387a = byteArrayOutputStream;
        this.f5388b = map;
        this.f5389c = map2;
        this.f5390d = cVar;
    }

    public static int j(bj.b bVar) {
        e eVar = (e) ((Annotation) bVar.f2549b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f5382a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(bj.b bVar, double d3, boolean z10) throws IOException {
        if (z10 && d3 == 0.0d) {
            return;
        }
        k((j(bVar) << 3) | 1);
        this.f5387a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d3).array());
    }

    public final void b(bj.b bVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f2549b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).f5382a << 3);
        k(i10);
    }

    @Override
    public final bj.d c(bj.b bVar, double d3) throws IOException {
        a(bVar, d3, true);
        return this;
    }

    @Override
    public final bj.d d(bj.b bVar, int i10) {
        b(bVar, i10, true);
        return this;
    }

    @Override
    public final bj.d e(bj.b bVar, long j9) throws IOException {
        if (j9 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) bVar.f2549b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).f5382a << 3);
        l(j9);
        return this;
    }

    @Override
    public final bj.d f(bj.b bVar, Object obj) {
        h(bVar, obj, true);
        return this;
    }

    @Override
    public final bj.d g(bj.b bVar, boolean z10) {
        b(bVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void h(bj.b bVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f5383f);
            k(bytes.length);
            this.f5387a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f5386i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(bVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            k((j(bVar) << 3) | 5);
            this.f5387a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) bVar.f2549b.get(e.class));
            if (eVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            k(((a) eVar).f5382a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            k(bArr.length);
            this.f5387a.write(bArr);
            return;
        }
        bj.c cVar = (bj.c) this.f5388b.get(obj.getClass());
        if (cVar != null) {
            i(cVar, bVar, obj, z10);
            return;
        }
        bj.e eVar2 = (bj.e) this.f5389c.get(obj.getClass());
        if (eVar2 != null) {
            h hVar = this.f5391e;
            hVar.f5393a = false;
            hVar.f5395c = bVar;
            hVar.f5394b = z10;
            eVar2.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(bVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(bVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f5390d, bVar, obj, z10);
        }
    }

    public final void i(bj.c cVar, bj.b bVar, Object obj, boolean z10) throws IOException {
        b bVar2 = new b();
        bVar2.A = 0L;
        try {
            OutputStream outputStream = this.f5387a;
            this.f5387a = bVar2;
            try {
                cVar.a(obj, this);
                this.f5387a = outputStream;
                long j9 = bVar2.A;
                bVar2.close();
                if (z10 && j9 == 0) {
                    return;
                }
                k((j(bVar) << 3) | 2);
                l(j9);
                cVar.a(obj, this);
            } catch (Throwable th2) {
                this.f5387a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f5387a.write((i10 & 127) | Cast.MAX_NAMESPACE_LENGTH);
            i10 >>>= 7;
        }
        this.f5387a.write(i10 & 127);
    }

    public final void l(long j9) throws IOException {
        while (((-128) & j9) != 0) {
            this.f5387a.write((((int) j9) & 127) | Cast.MAX_NAMESPACE_LENGTH);
            j9 >>>= 7;
        }
        this.f5387a.write(((int) j9) & 127);
    }
}
