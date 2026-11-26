package wj;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import q0.f2;

public final class a0 {

    public final Context f16108a;

    public final g00.p f16109b;

    public final int f16110c;

    public final g00.p f16111d;

    public final g00.p f16112e;

    public boolean f16113f;

    public a0(Context context, c1 c1Var) {
        kotlin.jvm.internal.m.e(context, "appContext");
        kotlin.jvm.internal.m.e(c1Var, "uuidGenerator");
        this.f16108a = context;
        final int i10 = 0;
        this.f16109b = rd.a.J(new u00.a(this) {
            public final a0 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                int i11 = i10;
                a0 a0Var = this.B;
                switch (i11) {
                    case 0:
                        return ((c0) a0Var.f16112e.getValue()).f16127a;
                    default:
                        return r.b(a0Var.f16108a);
                }
            }
        });
        this.f16110c = Process.myPid();
        this.f16111d = rd.a.J(new f2(c1Var, 14));
        final int i11 = 1;
        this.f16112e = rd.a.J(new u00.a(this) {
            public final a0 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                int i12 = i11;
                a0 a0Var = this.B;
                switch (i12) {
                    case 0:
                        return ((c0) a0Var.f16112e.getValue()).f16127a;
                    default:
                        return r.b(a0Var.f16108a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f16109b.getValue();
    }

    public final Map b(Map map) {
        g00.p pVar = this.f16111d;
        if (map == null) {
            return h00.d0.Q(new g00.k(a(), new y(Process.myPid(), (String) pVar.getValue())));
        }
        LinkedHashMap linkedHashMapB0 = h00.d0.b0(map);
        linkedHashMapB0.put(a(), new y(Process.myPid(), (String) pVar.getValue()));
        return h00.d0.Z(linkedHashMapB0);
    }
}
