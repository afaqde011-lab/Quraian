package l40;

import g00.b0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import n40.e;
import n40.g;
import p40.b1;
import ri.t1;
import u00.k;

public final class b implements k {
    public final int A;
    public final c B;

    public b(c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj) {
        n40.a buildSerialDescriptor = (n40.a) obj;
        switch (this.A) {
            case 0:
                m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("type", b1.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                c cVar = this.B;
                sb.append(cVar.a.n());
                sb.append('>');
                b bVar = new b(cVar, 1);
                buildSerialDescriptor.a("value", t1.l(sb.toString(), g.c, new e[0], bVar));
                List list = cVar.b;
                m.e(list, "<set-?>");
                buildSerialDescriptor.b = list;
                break;
            default:
                m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.B.e.entrySet()) {
                    buildSerialDescriptor.a((String) entry.getKey(), ((a) entry.getValue()).getDescriptor());
                }
                break;
        }
        return b0.a;
    }
}
