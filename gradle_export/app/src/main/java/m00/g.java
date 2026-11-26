package m00;

import k00.j;

public abstract class g extends a {
    public g(k00.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != j.A) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final k00.i getContext() {
        return j.A;
    }
}
