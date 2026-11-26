package j10;

public final class o {
    public final f1 a;
    public final int b;

    public o(f1 delegate, int i) {
        this.b = i;
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.a = delegate;
    }

    public final boolean a(y20.d dVar, n nVar, k kVar) {
        k kVarH;
        e eVar;
        switch (this.b) {
            case 0:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (q20.d.q(nVar) && q20.d.e(kVar) != o0.B) {
                    return p.d(nVar, kVar);
                }
                if (nVar instanceof j) {
                    ((j) nVar).l();
                }
                while (nVar != 0) {
                    nVar = nVar.l();
                    if (((nVar instanceof e) && !q20.d.k(nVar)) || (nVar instanceof e0)) {
                        if (nVar != 0) {
                            while (kVar != null) {
                                if (nVar != kVar) {
                                    if (kVar instanceof e0) {
                                        kVar = kVar.l();
                                    } else if ((nVar instanceof e0) || !((m10.c0) ((e0) nVar)).F.equals(((m10.c0) ((e0) kVar)).F) || !q20.d.c(kVar).equals(q20.d.c(nVar))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (nVar != 0) {
                    while (kVar != null) {
                        if (nVar != kVar) {
                            if (kVar instanceof e0) {
                                kVar = kVar.l();
                            } else if (nVar instanceof e0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (p.a.a(dVar, nVar, kVar)) {
                    if (dVar == p.l) {
                        return true;
                    }
                    if (dVar != p.k && (kVarH = q20.d.h(nVar, e.class, true)) != null && (dVar instanceof y20.c)) {
                        return ((y20.c) dVar).A.a().equals(kVarH.a());
                    }
                }
                return false;
            case 2:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                e eVar2 = (e) q20.d.h(nVar, e.class, true);
                e eVar3 = (e) q20.d.h(kVar, e.class, false);
                if (eVar3 != null) {
                    if (eVar2 != null && q20.d.k(eVar2) && (eVar = (e) q20.d.h(eVar2, e.class, true)) != null && q20.d.p(eVar3.n(), eVar.a())) {
                        return true;
                    }
                    ?? R = nVar instanceof c ? q20.d.r((c) nVar) : nVar;
                    e eVar4 = (e) q20.d.h(R, e.class, true);
                    if (eVar4 != null) {
                        if (q20.d.p(eVar3.n(), eVar4.a()) && dVar != p.m) {
                            if (!(R instanceof c) || (R instanceof j) || dVar == p.l) {
                                return true;
                            }
                            if (dVar != p.k && dVar != null) {
                                e30.w type = dVar.getType();
                                if (q20.d.p(type, eVar3)) {
                                    return true;
                                }
                                type.y0();
                            }
                        }
                        return a(dVar, nVar, eVar3.l());
                    }
                }
                return false;
            case 3:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!q20.d.c(kVar).v(q20.d.c(nVar))) {
                    return false;
                }
                p.n.getClass();
                return true;
            case 4:
                if (kVar != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (kVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (kVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (kVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (kVar != null) {
                    return x10.o.c(nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (kVar != null) {
                    return x10.o.b(dVar, nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (kVar != null) {
                    return x10.o.b(dVar, nVar, kVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.a.b();
    }
}
