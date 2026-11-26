package ii;

import java.util.Set;

public interface c {
    default Object a(Class cls) {
        return g(p.a(cls));
    }

    n b(p pVar);

    ij.b c(p pVar);

    default ij.b d(Class cls) {
        return e(p.a(cls));
    }

    ij.b e(p pVar);

    default Set f(p pVar) {
        return (Set) c(pVar).get();
    }

    default Object g(p pVar) {
        ij.b bVarE = e(pVar);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }
}
