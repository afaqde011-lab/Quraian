package z2;

public interface t0 {
    a0 a(a0 a0Var);

    default long d(a0 a0Var, a0 a0Var2) {
        a0 a0VarA = a(a0Var);
        a0 a0VarA2 = a(a0Var2);
        if (a0VarA instanceof s0) {
            return ((s0) a0VarA).o(a0VarA2, 0L, true);
        }
        return a0VarA2 instanceof s0 ? ((s0) a0VarA2).o(a0VarA, 0L, true) ^ (-9223372034707292160L) : a0VarA.o(a0VarA, 0L, true);
    }
}
