package x;

public interface s1 {
    boolean a();

    long b(o oVar, o oVar2, o oVar3);

    o c(long j9, o oVar, o oVar2, o oVar3);

    default o m(o oVar, o oVar2, o oVar3) {
        return c(b(oVar, oVar2, oVar3), oVar, oVar2, oVar3);
    }

    o r(long j9, o oVar, o oVar2, o oVar3);
}
