package xd;

import java.util.Set;

public final class o implements ud.f {

    public final Set f16554a;

    public final i f16555b;

    public final p f16556c;

    public o(Set set, i iVar, p pVar) {
        this.f16554a = set;
        this.f16555b = iVar;
        this.f16556c = pVar;
    }

    public final ce.c a(String str, ud.c cVar, ud.e eVar) {
        Set set = this.f16554a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        return new ce.c(this.f16555b, str, cVar, eVar, this.f16556c, 19);
    }
}
