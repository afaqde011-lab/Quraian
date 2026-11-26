package l40;

import a10.d;
import g00.i;
import h00.d0;
import h00.n;
import h00.x;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import n40.e;
import z.f0;

public final class c implements a {
    public final d a;
    public final List b;
    public final Object c;
    public final Map d;
    public final LinkedHashMap e;

    public c(String str, d baseClass, d[] dVarArr, a[] aVarArr, Annotation[] annotationArr) {
        m.e(baseClass, "baseClass");
        this.a = baseClass;
        this.b = x.A;
        this.c = rd.a.I(i.B, new f0(1, str, this));
        if (dVarArr.length != aVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.n() + " should be marked @Serializable");
        }
        Map mapY = d0.Y(n.Y0(dVarArr, aVarArr));
        this.d = mapY;
        Set<Map.Entry> setEntrySet = mapY.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((a) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + strA + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d0.P(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (a) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = n.k0(annotationArr);
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor = getDescriptor();
        o40.a aVarC = decoder.c(descriptor);
        Object objS = null;
        String strT = null;
        while (true) {
            int iL = aVarC.l(getDescriptor());
            if (iL == -1) {
                if (objS == null) {
                    throw new IllegalArgumentException(a1.b.o("Polymorphic value has not been read for class ", strT).toString());
                }
                aVarC.a(descriptor);
                return objS;
            }
            if (iL == 0) {
                strT = aVarC.t(getDescriptor(), iL);
            } else {
                if (iL != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strT == null) {
                        strT = "unknown class";
                    }
                    sb.append(strT);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iL);
                    throw new SerializationException(sb.toString());
                }
                if (strT == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objS = aVarC.s(getDescriptor(), iL, va.a.I(this, aVarC, strT), null);
            }
        }
    }

    @Override
    public final e getDescriptor() {
        return (e) this.c.getValue();
    }

    @Override
    public final void serialize(o40.d encoder, Object value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        a aVarJ = va.a.J(this, encoder, value);
        e descriptor = getDescriptor();
        o40.b bVarC = encoder.c(descriptor);
        bVarC.i(getDescriptor(), 0, aVarJ.getDescriptor().a());
        bVarC.C(getDescriptor(), 1, aVarJ, value);
        bVarC.a(descriptor);
    }
}
