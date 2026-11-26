package r40;

import com.google.android.gms.internal.measurement.x5;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p40.o0;

public abstract class j {
    public static final k a = new k();

    public static final JsonEncodingException a(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str, -1)));
    }

    public static final JsonEncodingException b(n40.e keyDescriptor) {
        kotlin.jvm.internal.m.e(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i, String message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        kotlin.jvm.internal.m.e(message, "message");
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException d(String message, CharSequence input, int i) {
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(input, "input");
        return c(i, message + "\nJSON input: " + ((Object) m(input, i)));
    }

    public static final void e(l40.a aVar, l40.a aVar2, String str) {
        if (aVar instanceof l40.c) {
            n40.e descriptor = aVar2.getDescriptor();
            kotlin.jvm.internal.m.e(descriptor, "<this>");
            if (o0.b(descriptor).contains(str)) {
                StringBuilder sbS = a1.b.s("Sealed class '", aVar2.getDescriptor().a(), "' cannot be serialized as base class '", ((l40.c) aVar).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbS.append(str);
                sbS.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbS.toString().toString());
            }
        }
    }

    public static final n40.e f(n40.e eVar, ce.c module) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(module, "module");
        if (!kotlin.jvm.internal.m.a(eVar.getKind(), n40.g.c)) {
            return eVar.isInline() ? f(eVar.h(0), module) : eVar;
        }
        a10.d dVarF = rd.a.F(eVar);
        if (dVarF == null) {
            return eVar;
        }
        return eVar;
    }

    public static final byte g(char c) {
        if (c < '~') {
            return e.b[c];
        }
        return (byte) 0;
    }

    public static final void h(va.a kind) {
        kotlin.jvm.internal.m.e(kind, "kind");
        if (kind instanceof n40.h) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof n40.d) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof n40.b) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String i(n40.e eVar, q40.c json) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof q40.i) {
                return ((q40.i) annotation).discriminator();
            }
        }
        return (String) json.a.f;
    }

    public static final int j(n40.e eVar, q40.c json, String name) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(name, "name");
        n(eVar, json);
        int iD = eVar.d(name);
        if (iD != -3 || !json.a.d) {
            return iD;
        }
        o10.b bVar = json.c;
        l6.c cVar = new l6.c(eVar, json, 17);
        bVar.getClass();
        k kVar = a;
        Object objP = bVar.p(eVar, kVar);
        if (objP == null) {
            objP = cVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.B;
            Object concurrentHashMap2 = concurrentHashMap.get(eVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(kVar, objP);
        }
        Integer num = (Integer) ((Map) objP).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int k(n40.e eVar, q40.c json, String name, String suffix) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        int iJ = j(eVar, json, name);
        if (iJ != -3) {
            return iJ;
        }
        throw new SerializationException(eVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void l(a20.g gVar, String str) {
        gVar.t("Trailing comma before the end of JSON ".concat(str), gVar.B - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(CharSequence charSequence, int i) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbQ = x5.q(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbQ.append(charSequence.subSequence(i2, i3).toString());
                sbQ.append(str2);
                return sbQ.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void n(n40.e eVar, q40.c json) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.a(eVar.getKind(), n40.i.c);
    }

    public static final Object o(q40.c cVar, String discriminator, q40.x xVar, l40.a aVar) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        kotlin.jvm.internal.m.e(discriminator, "discriminator");
        return new n(cVar, xVar, discriminator, aVar.getDescriptor()).j(aVar);
    }

    public static final x p(n40.e desc, q40.c cVar) {
        kotlin.jvm.internal.m.e(desc, "desc");
        va.a kind = desc.getKind();
        if (kind instanceof n40.b) {
            return x.POLY_OBJ;
        }
        if (kotlin.jvm.internal.m.a(kind, n40.i.d)) {
            return x.LIST;
        }
        if (!kotlin.jvm.internal.m.a(kind, n40.i.e)) {
            return x.OBJ;
        }
        n40.e eVarF = f(desc.h(0), cVar.b);
        va.a kind2 = eVarF.getKind();
        if ((kind2 instanceof n40.d) || kotlin.jvm.internal.m.a(kind2, n40.h.c)) {
            return x.MAP;
        }
        throw b(eVarF);
    }

    public static final void q(a20.g gVar, Number number) {
        a20.g.u(gVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String r(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    public static final String s(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str2, -1));
    }
}
