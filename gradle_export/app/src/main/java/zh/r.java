package zh;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class r extends ThreadLocal {

    public final oe.o f17499a;

    public r(oe.o oVar) {
        this.f17499a = oVar;
    }

    @Override
    public final Object initialValue() {
        oe.o oVar = this.f17499a;
        try {
            o oVar2 = o.f17496c;
            Mac mac = (Mac) oVar2.f17498a.d((String) oVar.C);
            mac.init((SecretKeySpec) oVar.D);
            return mac;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
