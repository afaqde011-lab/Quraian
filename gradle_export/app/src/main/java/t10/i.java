package t10;

import h00.x;
import i20.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import u10.l;

public final class i {
    public final k20.g a;
    public final h9.f b;
    public final k20.j c;
    public final boolean d;
    public final i e;
    public final List f;
    public final LinkedHashMap g;
    public final List h;

    public i(k20.g gVar, h9.f fVar, k20.j jVar, boolean z, List list, int i) {
        this(gVar, fVar, jVar, z, (i) null, (i & 32) != 0 ? x.A : list);
    }

    public i(k20.g strings, h9.f types, k20.j versionRequirements, boolean z, i iVar, List contextExtensions) {
        m.e(strings, "strings");
        m.e(types, "types");
        m.e(versionRequirements, "versionRequirements");
        m.e(contextExtensions, "contextExtensions");
        this.a = strings;
        this.b = types;
        this.c = versionRequirements;
        this.d = z;
        this.e = iVar;
        this.f = contextExtensions;
        this.g = new LinkedHashMap();
        l.a.getClass();
        this.h = u10.k.a();
    }

    public final Integer a(int i) {
        Integer num = (Integer) this.g.get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        i iVar = this.e;
        if (iVar != null) {
            return iVar.a(i);
        }
        return null;
    }

    public final i b(List typeParameters) {
        m.e(typeParameters, "typeParameters");
        i iVar = new i(this.a, this.b, this.c, this.d, this, this.f);
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            iVar.g.put(Integer.valueOf(z0Var.E), Integer.valueOf(z0Var.D));
        }
        return iVar;
    }
}
