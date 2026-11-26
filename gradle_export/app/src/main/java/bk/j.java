package bk;

import java.io.IOException;

public final class j extends a0 {

    public final int f2554a;

    @Override
    public final Object b(ik.a aVar) throws IOException {
        switch (this.f2554a) {
            case 0:
                if (aVar.t0() != 9) {
                    return Double.valueOf(aVar.Z());
                }
                aVar.p0();
                return null;
            case 1:
                if (aVar.t0() != 9) {
                    return Float.valueOf((float) aVar.Z());
                }
                aVar.p0();
                return null;
            default:
                aVar.z0();
                return null;
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        switch (this.f2554a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    m.a(dDoubleValue);
                    bVar.b0(dDoubleValue);
                } else {
                    bVar.G();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.n0(numberValueOf);
                } else {
                    bVar.G();
                }
                break;
            default:
                bVar.G();
                break;
        }
    }

    public String toString() {
        switch (this.f2554a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
