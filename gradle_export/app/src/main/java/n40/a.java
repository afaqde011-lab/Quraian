package n40;

import h00.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public List b;
    public final ArrayList c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public a(String serialName) {
        m.e(serialName, "serialName");
        this.a = serialName;
        this.b = x.A;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final void a(String elementName, e descriptor) {
        m.e(elementName, "elementName");
        m.e(descriptor, "descriptor");
        if (!this.d.add(elementName)) {
            StringBuilder sbN = g4.c.n("Element with name '", elementName, "' is already registered in ");
            sbN.append(this.a);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        this.c.add(elementName);
        this.e.add(descriptor);
        this.f.add(x.A);
        this.g.add(Boolean.FALSE);
    }
}
