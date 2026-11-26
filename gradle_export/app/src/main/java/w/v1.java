package w;

public final class v1 implements n1 {
    @Override
    public final i2.g a(r1 r1Var, h2.c cVar, y3.m mVar, y3.c cVar2) {
        k1 k1Var = (k1) r1Var.f15805c.getValue();
        if (k1Var == null) {
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        }
        k1 k1Var2 = k1Var.K;
        r1 r1Var2 = k1Var2 != null ? (r1) k1Var2.I.getValue() : null;
        if (r1Var2 == null) {
            return null;
        }
        k1 k1Var3 = (k1) r1Var2.f15805c.getValue();
        if (k1Var3 != null) {
            return k1Var3.J;
        }
        throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
    }
}
