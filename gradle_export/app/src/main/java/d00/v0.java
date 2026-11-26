package d00;

import b3.e1;
import c3.d2;
import c3.y2;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld00/v0;", "Lb3/e1;", "Ld00/w0;", "haze_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends e1 {
    public final x0 B;

    public v0(x0 x0Var) {
        this.B = x0Var;
    }

    public final b2.q d() {
        return new w0(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && this.B.equals(((v0) obj).B) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final void h(d2 d2Var) {
        d2Var.a = "hazeSource";
        y2 y2Var = d2Var.c;
        y2Var.c(Float.valueOf(0.0f), "zIndex");
        y2Var.c((Object) null, SubscriberAttributeKt.JSON_NAME_KEY);
    }

    public final int hashCode() {
        return w.c.c(0.0f, this.B.hashCode() * 31, 31);
    }

    public final void i(b2.q qVar) {
        w0 node = (w0) qVar;
        kotlin.jvm.internal.m.e(node, "node");
        z1.p pVar = node.P.c;
        c area = node.O;
        boolean zContains = pVar.contains(area);
        if (zContains) {
            x0 x0Var = node.P;
            x0Var.getClass();
            kotlin.jvm.internal.m.e(area, "area");
            x0Var.c.remove(area);
        }
        x0 x0Var2 = this.B;
        node.P = x0Var2;
        if (zContains) {
            kotlin.jvm.internal.m.e(area, "area");
            x0Var2.c.add(area);
        }
        area.c.i(0.0f);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.B + ", zIndex=0.0, key=null)";
    }
}
