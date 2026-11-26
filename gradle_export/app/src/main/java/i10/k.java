package i10;

import java.util.List;

public final class k implements u00.a {
    public final int A;
    public final o B;

    public k(o oVar, int i) {
        this.A = i;
        this.B = oVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        o oVar = this.B;
        switch (i) {
            case 0:
                List listR = va.a.R(k10.e.a(oVar.a.E, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listR.isEmpty() ? k10.g.a : new k10.i(0, listR);
            default:
                return oVar.a.E.e();
        }
    }
}
