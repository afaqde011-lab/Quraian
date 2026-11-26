package f;

import d.e0;
import s9.c;

public final class b {

    public final c f5470a;

    public final e0 f5471b;

    public b(c cVar, e0 e0Var) {
        this.f5470a = cVar;
        this.f5471b = e0Var;
        if ((cVar == null ? e0Var : cVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
