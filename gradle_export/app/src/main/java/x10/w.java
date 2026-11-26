package x10;

import h00.j0;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class w {
    public static final n20.c a;
    public static final n20.c b;
    public static final n20.c c;
    public static final n20.c d;
    public static final n20.c e;
    public static final n20.c f;
    public static final n20.c g;
    public static final n20.c h;
    public static final n20.c i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final n20.c p;

    static {
        n20.c cVar = new n20.c("org.jspecify.nullness.Nullable");
        n20.c cVar2 = new n20.c("org.jspecify.nullness.NullMarked");
        a = cVar2;
        n20.c cVar3 = new n20.c("org.jspecify.nullness.NullnessUnspecified");
        n20.c cVar4 = new n20.c("org.jspecify.annotations.NonNull");
        n20.c cVar5 = new n20.c("org.jspecify.annotations.Nullable");
        n20.c cVar6 = new n20.c("org.jspecify.annotations.NullMarked");
        b = cVar6;
        n20.c cVar7 = new n20.c("org.jspecify.annotations.NullnessUnspecified");
        n20.c cVar8 = new n20.c("org.jspecify.annotations.NullUnmarked");
        c = cVar8;
        d = new n20.c("javax.annotation.meta.TypeQualifier");
        e = new n20.c("javax.annotation.meta.TypeQualifierNickname");
        f = new n20.c("javax.annotation.meta.TypeQualifierDefault");
        n20.c cVar9 = new n20.c("javax.annotation.Nonnull");
        g = cVar9;
        n20.c cVar10 = new n20.c("javax.annotation.Nullable");
        n20.c cVar11 = new n20.c("javax.annotation.CheckForNull");
        h = new n20.c("javax.annotation.ParametersAreNonnullByDefault");
        i = new n20.c("javax.annotation.ParametersAreNullableByDefault");
        j = h00.n.X0(new n20.c[]{cVar9, cVar11});
        n20.c JETBRAINS_NOT_NULL_ANNOTATION = v.h;
        kotlin.jvm.internal.m.d(JETBRAINS_NOT_NULL_ANNOTATION, "JETBRAINS_NOT_NULL_ANNOTATION");
        Set setX0 = h00.n.X0(new n20.c[]{JETBRAINS_NOT_NULL_ANNOTATION, cVar4, new n20.c("android.annotation.NonNull"), new n20.c("androidx.annotation.NonNull"), new n20.c("androidx.annotation.RecentlyNonNull"), new n20.c("android.support.annotation.NonNull"), new n20.c("com.android.annotations.NonNull"), new n20.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new n20.c("org.checkerframework.checker.nullness.qual.NonNull"), new n20.c("edu.umd.cs.findbugs.annotations.NonNull"), new n20.c("io.reactivex.annotations.NonNull"), new n20.c("io.reactivex.rxjava3.annotations.NonNull"), new n20.c("org.eclipse.jdt.annotation.NonNull"), new n20.c("lombok.NonNull"), new n20.c("jakarta.annotation.Nonnull")});
        k = setX0;
        n20.c JETBRAINS_NULLABLE_ANNOTATION = v.i;
        kotlin.jvm.internal.m.d(JETBRAINS_NULLABLE_ANNOTATION, "JETBRAINS_NULLABLE_ANNOTATION");
        Set setX1 = h00.n.X0(new n20.c[]{JETBRAINS_NULLABLE_ANNOTATION, cVar, cVar5, cVar10, cVar11, new n20.c("android.annotation.Nullable"), new n20.c("androidx.annotation.Nullable"), new n20.c("androidx.annotation.RecentlyNullable"), new n20.c("android.support.annotation.Nullable"), new n20.c("com.android.annotations.Nullable"), new n20.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new n20.c("org.checkerframework.checker.nullness.qual.Nullable"), new n20.c("edu.umd.cs.findbugs.annotations.Nullable"), new n20.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new n20.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new n20.c("io.reactivex.annotations.Nullable"), new n20.c("io.reactivex.rxjava3.annotations.Nullable"), new n20.c("org.eclipse.jdt.annotation.Nullable"), new n20.c("jakarta.annotation.Nullable")});
        l = setX1;
        m = h00.n.X0(new n20.c[]{cVar3, cVar7});
        j0.r0(j0.r0(j0.r0(j0.r0(j0.q0(j0.q0(new LinkedHashSet(), setX0), setX1), cVar9), cVar2), cVar6), cVar8);
        n = h00.n.X0(new n20.c[]{v.k, v.l});
        o = h00.n.X0(new n20.c[]{v.j, v.m});
        h00.d0.R(new g00.k(v.c, g10.o.t), new g00.k(v.d, g10.o.w), new g00.k(v.e, g10.o.m), new g00.k(v.f, g10.o.x));
        p = new n20.c("kotlin.annotations.jvm.UnderMigration");
    }
}
