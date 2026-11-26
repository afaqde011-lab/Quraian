package x10;

import s10.w0;

public abstract class q {
    public static final n20.c a;
    public static final n20.c[] b;
    public static final w0 c;
    public static final r d;

    static {
        n20.c cVar = new n20.c("org.jspecify.nullness");
        n20.c cVar2 = new n20.c("org.jspecify.annotations");
        a = cVar2;
        n20.c cVar3 = new n20.c("io.reactivex.rxjava3.annotations");
        n20.c cVar4 = new n20.c("org.checkerframework.checker.nullness.compatqual");
        String str = cVar3.a.a;
        b = new n20.c[]{new n20.c(w.c.j(str, ".Nullable")), new n20.c(w.c.j(str, ".NonNull"))};
        n20.c cVar5 = new n20.c("org.jetbrains.annotations");
        r rVar = r.d;
        g00.k kVar = new g00.k(cVar5, rVar);
        g00.k kVar2 = new g00.k(new n20.c("androidx.annotation"), rVar);
        g00.k kVar3 = new g00.k(new n20.c("android.support.annotation"), rVar);
        g00.k kVar4 = new g00.k(new n20.c("android.annotation"), rVar);
        g00.k kVar5 = new g00.k(new n20.c("com.android.annotations"), rVar);
        g00.k kVar6 = new g00.k(new n20.c("org.eclipse.jdt.annotation"), rVar);
        g00.k kVar7 = new g00.k(new n20.c("org.checkerframework.checker.nullness.qual"), rVar);
        g00.k kVar8 = new g00.k(cVar4, rVar);
        g00.k kVar9 = new g00.k(new n20.c("javax.annotation"), rVar);
        g00.k kVar10 = new g00.k(new n20.c("edu.umd.cs.findbugs.annotations"), rVar);
        g00.k kVar11 = new g00.k(new n20.c("io.reactivex.annotations"), rVar);
        n20.c cVar6 = new n20.c("androidx.annotation.RecentlyNullable");
        z zVar = z.WARN;
        g00.k kVar12 = new g00.k(cVar6, new r(zVar, 4));
        g00.k kVar13 = new g00.k(new n20.c("androidx.annotation.RecentlyNonNull"), new r(zVar, 4));
        g00.k kVar14 = new g00.k(new n20.c("lombok"), rVar);
        g00.g gVar = new g00.g(2, 1, 0);
        z zVar2 = z.STRICT;
        c = new w0(h00.d0.R(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, new g00.k(cVar, new r(zVar, gVar, zVar2)), new g00.k(cVar2, new r(zVar, new g00.g(2, 1, 0), zVar2)), new g00.k(cVar3, new r(zVar, new g00.g(1, 8, 0), zVar2)), new g00.k(new n20.c("jakarta.annotation"), new r(zVar, new g00.g(2, 4, 0), zVar2))));
        d = new r(zVar, 4);
    }
}
