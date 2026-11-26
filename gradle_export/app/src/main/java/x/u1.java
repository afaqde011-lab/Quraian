package x;

public interface u1 extends v1 {
    @Override
    default long b(o oVar, o oVar2, o oVar3) {
        return ((long) (v() + q())) * 1000000;
    }

    int q();

    int v();
}
