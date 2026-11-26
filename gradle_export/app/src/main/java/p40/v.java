package p40;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

public final class v implements l40.a {
    public final int a = 1;
    public final Object b;
    public Object c;
    public final Object d;

    public v(String str, Object objectInstance) {
        kotlin.jvm.internal.m.e(objectInstance, "objectInstance");
        this.b = objectInstance;
        this.c = h00.x.A;
        this.d = rd.a.I(g00.i.B, new l6.c(str, this, 9));
    }

    public v(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        kotlin.jvm.internal.m.e(objectInstance, "objectInstance");
        this.c = h00.n.k0(annotationArr);
    }

    public v(String str, Enum[] values) {
        kotlin.jvm.internal.m.e(values, "values");
        this.b = values;
        this.d = rd.a.J(new l6.c(this, str, 8));
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        switch (this.a) {
            case 0:
                Enum[] enumArr = (Enum[]) this.b;
                kotlin.jvm.internal.m.e(decoder, "decoder");
                int iD = decoder.d(getDescriptor());
                if (iD >= 0 && iD < enumArr.length) {
                    return enumArr[iD];
                }
                throw new SerializationException(iD + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                kotlin.jvm.internal.m.e(decoder, "decoder");
                n40.e descriptor = getDescriptor();
                o40.a aVarC = decoder.c(descriptor);
                int iL = aVarC.l(getDescriptor());
                if (iL != -1) {
                    throw new SerializationException(g4.c.f(iL, "Unexpected index "));
                }
                aVarC.a(descriptor);
                return this.b;
        }
    }

    @Override
    public final n40.e getDescriptor() {
        switch (this.a) {
            case 0:
                return (n40.e) ((g00.p) this.d).getValue();
            default:
                return (n40.e) this.d.getValue();
        }
    }

    @Override
    public final void serialize(o40.d encoder, Object value) {
        switch (this.a) {
            case 0:
                Enum value2 = (Enum) value;
                kotlin.jvm.internal.m.e(encoder, "encoder");
                kotlin.jvm.internal.m.e(value2, "value");
                Enum[] enumArr = (Enum[]) this.b;
                int iJ0 = h00.n.J0(value2, enumArr);
                if (iJ0 != -1) {
                    encoder.q(getDescriptor(), iJ0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value2);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().a());
                sb.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                kotlin.jvm.internal.m.d(string, "toString(...)");
                sb.append(string);
                throw new SerializationException(sb.toString());
            default:
                kotlin.jvm.internal.m.e(encoder, "encoder");
                kotlin.jvm.internal.m.e(value, "value");
                encoder.c(getDescriptor()).a(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }
}
