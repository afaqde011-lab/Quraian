package t5;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import g00.b0;
import h00.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import s5.h;

public final class g implements Serializer {
    public static final g A = new g();

    @Override
    public final Object getDefaultValue() {
        return new b(true);
    }

    @Override
    public final Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException, NoWhenBranchMatchedException {
        byte[] bArr;
        m.e(inputStream, "input");
        try {
            s5.d dVarO = s5.d.o(inputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            m.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapM = dVarO.m();
            m.d(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                h hVar = (h) entry.getValue();
                m.d(str, "name");
                m.d(hVar, "value");
                int iC = hVar.C();
                switch (iC == 0 ? -1 : f.f14358a[e4.f.b(iC)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null, 2, null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        bVar.f(new d(str), Boolean.valueOf(hVar.t()));
                        break;
                    case 2:
                        bVar.f(new d(str), Float.valueOf(hVar.x()));
                        break;
                    case 3:
                        bVar.f(new d(str), Double.valueOf(hVar.w()));
                        break;
                    case 4:
                        bVar.f(new d(str), Integer.valueOf(hVar.y()));
                        break;
                    case 5:
                        bVar.f(va.a.U(str), Long.valueOf(hVar.z()));
                        break;
                    case 6:
                        d dVar = new d(str);
                        String strA = hVar.A();
                        m.d(strA, "value.string");
                        bVar.f(dVar, strA);
                        break;
                    case 7:
                        d dVarI0 = va.a.i0(str);
                        w wVarN = hVar.B().n();
                        m.d(wVarN, "value.stringSet.stringsList");
                        bVar.f(dVarI0, q.r1(wVarN));
                        break;
                    case 8:
                        d dVar2 = new d(str);
                        androidx.datastore.preferences.protobuf.g gVarU = hVar.u();
                        int size = gVarU.size();
                        if (size == 0) {
                            bArr = x.f685b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            gVarU.e(size, bArr2);
                            bArr = bArr2;
                        }
                        m.d(bArr, "value.bytes.toByteArray()");
                        bVar.f(dVar2, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null, 2, null);
                }
            }
            return bVar.h();
        } catch (InvalidProtocolBufferException e3) {
            throw new CorruptionException("Unable to parse preferences proto.", e3);
        }
    }

    @Override
    public final Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) throws IOException {
        v vVarA;
        Map mapA = ((b) obj).a();
        s5.b bVarN = s5.d.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f14357a;
            if (value instanceof Boolean) {
                s5.g gVarD = h.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                gVarD.c();
                h.q((h) gVarD.B, zBooleanValue);
                vVarA = gVarD.a();
            } else if (value instanceof Float) {
                s5.g gVarD2 = h.D();
                float fFloatValue = ((Number) value).floatValue();
                gVarD2.c();
                h.r((h) gVarD2.B, fFloatValue);
                vVarA = gVarD2.a();
            } else if (value instanceof Double) {
                s5.g gVarD3 = h.D();
                double dDoubleValue = ((Number) value).doubleValue();
                gVarD3.c();
                h.o((h) gVarD3.B, dDoubleValue);
                vVarA = gVarD3.a();
            } else if (value instanceof Integer) {
                s5.g gVarD4 = h.D();
                int iIntValue = ((Number) value).intValue();
                gVarD4.c();
                h.s((h) gVarD4.B, iIntValue);
                vVarA = gVarD4.a();
            } else if (value instanceof Long) {
                s5.g gVarD5 = h.D();
                long jLongValue = ((Number) value).longValue();
                gVarD5.c();
                h.l((h) gVarD5.B, jLongValue);
                vVarA = gVarD5.a();
            } else if (value instanceof String) {
                s5.g gVarD6 = h.D();
                gVarD6.c();
                h.m((h) gVarD6.B, (String) value);
                vVarA = gVarD6.a();
            } else if (value instanceof Set) {
                s5.g gVarD7 = h.D();
                s5.e eVarO = s5.f.o();
                eVarO.c();
                s5.f.l((s5.f) eVarO.B, (Set) value);
                gVarD7.c();
                h.n((h) gVarD7.B, (s5.f) eVarO.a());
                vVarA = gVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                s5.g gVarD8 = h.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g gVarC = androidx.datastore.preferences.protobuf.g.c(0, bArr.length, bArr);
                gVarD8.c();
                h.p((h) gVarD8.B, gVarC);
                vVarA = gVarD8.a();
            }
            bVarN.getClass();
            str.getClass();
            bVarN.c();
            s5.d.l((s5.d) bVarN.B).put(str, (h) vVarA);
        }
        s5.d dVar2 = (s5.d) bVarN.a();
        int iA = dVar2.a(null);
        Logger logger = l.f639g;
        if (iA > 4096) {
            iA = 4096;
        }
        l lVar = new l(outputStream, iA);
        dVar2.b(lVar);
        if (lVar.f644e > 0) {
            lVar.Y();
        }
        return b0.a;
    }
}
