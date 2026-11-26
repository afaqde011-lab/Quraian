package d6;

public final class n1 implements u00.n {
    public static final n1 B = new n1(0);
    public static final n1 C = new n1(1);
    public static final n1 D = new n1(2);
    public static final n1 E = new n1(3);
    public static final n1 F = new n1(4);
    public static final n1 G = new n1(5);
    public static final n1 H = new n1(6);
    public static final n1 I = new n1(7);
    public static final n1 J = new n1(8);
    public static final n1 K = new n1(9);
    public static final n1 L = new n1(10);
    public static final n1 M = new n1(11);
    public static final n1 N = new n1(12);
    public static final n1 O = new n1(13);
    public static final n1 P = new n1(14);
    public static final n1 Q = new n1(15);
    public static final n1 R = new n1(16);
    public static final n1 S = new n1(17);
    public static final n1 T = new n1(18);
    public final int A;

    public n1(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        b6.m mVarD;
        switch (this.A) {
            case 0:
                b6.l lVar = (b6.l) obj2;
                return lVar instanceof j6.s ? lVar : obj;
            case 1:
                b6.l lVar2 = (b6.l) obj2;
                return lVar2 instanceof j6.m ? lVar2 : obj;
            case 2:
                b6.l lVar3 = (b6.l) obj2;
                return lVar3 instanceof j6.s ? lVar3 : obj;
            case 3:
                b6.l lVar4 = (b6.l) obj2;
                return lVar4 instanceof j6.m ? lVar4 : obj;
            case 4:
                b6.l lVar5 = (b6.l) obj2;
                return lVar5 instanceof a ? lVar5 : obj;
            case 5:
                b6.l lVar6 = (b6.l) obj2;
                return lVar6 instanceof j6.s ? lVar6 : obj;
            case 6:
                b6.l lVar7 = (b6.l) obj2;
                return lVar7 instanceof j6.m ? lVar7 : obj;
            case 7:
                g00.k kVar = (g00.k) obj;
                b6.l lVar8 = (b6.l) obj2;
                return lVar8 instanceof c6.b ? new g00.k(lVar8, kVar.B) : new g00.k(kVar.A, ((b6.m) kVar.B).d(lVar8));
            case 8:
                b6.l lVar9 = (b6.l) obj2;
                return lVar9 instanceof j6.m ? lVar9 : obj;
            case 9:
                b6.l lVar10 = (b6.l) obj2;
                return lVar10 instanceof j6.s ? lVar10 : obj;
            case 10:
                b6.l lVar11 = (b6.l) obj2;
                return lVar11 instanceof j6.m ? lVar11 : obj;
            case 11:
                b6.l lVar12 = (b6.l) obj2;
                return lVar12 instanceof j6.s ? lVar12 : obj;
            case 12:
                b6.m mVar = (b6.m) obj;
                b6.m mVar2 = (b6.m) obj2;
                return ((!(mVar2 instanceof c6.b) ? mVar2 : null) == null || (mVarD = mVar.d(mVar2)) == null) ? mVar : mVarD;
            case 13:
                g00.k kVar2 = (g00.k) obj;
                b6.l lVar13 = (b6.l) obj2;
                return lVar13 instanceof b6.c ? new g00.k(lVar13, kVar2.B) : new g00.k(kVar2.A, ((b6.m) kVar2.B).d(lVar13));
            case 14:
                g00.k kVar3 = (g00.k) obj;
                b6.l lVar14 = (b6.l) obj2;
                return lVar14 instanceof c6.b ? new g00.k(lVar14, kVar3.B) : new g00.k(kVar3.A, ((b6.m) kVar3.B).d(lVar14));
            case 15:
                b6.l lVar15 = (b6.l) obj2;
                return lVar15 instanceof c6.b ? lVar15 : obj;
            case 16:
                return obj;
            case 17:
                b6.l lVar16 = (b6.l) obj2;
                return lVar16 instanceof j6.s ? lVar16 : obj;
            default:
                b6.l lVar17 = (b6.l) obj2;
                return lVar17 instanceof j6.m ? lVar17 : obj;
        }
    }
}
