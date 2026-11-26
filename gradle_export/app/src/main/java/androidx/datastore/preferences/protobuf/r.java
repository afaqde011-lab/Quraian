package androidx.datastore.preferences.protobuf;

public final class r {
    public static final r B;
    public static final r C;
    public static final r[] D;
    public static final r[] E;
    public final int A;

    r EF0;

    static {
        y yVar = y.E;
        r rVar = new r("DOUBLE", 0, 0, 1, yVar);
        y yVar2 = y.D;
        r rVar2 = new r("FLOAT", 1, 1, 1, yVar2);
        y yVar3 = y.C;
        r rVar3 = new r("INT64", 2, 2, 1, yVar3);
        r rVar4 = new r("UINT64", 3, 3, 1, yVar3);
        y yVar4 = y.B;
        r rVar5 = new r("INT32", 4, 4, 1, yVar4);
        r rVar6 = new r("FIXED64", 5, 5, 1, yVar3);
        r rVar7 = new r("FIXED32", 6, 6, 1, yVar4);
        y yVar5 = y.F;
        r rVar8 = new r("BOOL", 7, 7, 1, yVar5);
        y yVar6 = y.G;
        r rVar9 = new r("STRING", 8, 8, 1, yVar6);
        y yVar7 = y.J;
        r rVar10 = new r("MESSAGE", 9, 9, 1, yVar7);
        y yVar8 = y.H;
        r rVar11 = new r("BYTES", 10, 10, 1, yVar8);
        r rVar12 = new r("UINT32", 11, 11, 1, yVar4);
        y yVar9 = y.I;
        r rVar13 = new r("ENUM", 12, 12, 1, yVar9);
        r rVar14 = new r("SFIXED32", 13, 13, 1, yVar4);
        r rVar15 = new r("SFIXED64", 14, 14, 1, yVar3);
        r rVar16 = new r("SINT32", 15, 15, 1, yVar4);
        r rVar17 = new r("SINT64", 16, 16, 1, yVar3);
        r rVar18 = new r("GROUP", 17, 17, 1, yVar7);
        r rVar19 = new r("DOUBLE_LIST", 18, 18, 2, yVar);
        r rVar20 = new r("FLOAT_LIST", 19, 19, 2, yVar2);
        r rVar21 = new r("INT64_LIST", 20, 20, 2, yVar3);
        r rVar22 = new r("UINT64_LIST", 21, 21, 2, yVar3);
        r rVar23 = new r("INT32_LIST", 22, 22, 2, yVar4);
        r rVar24 = new r("FIXED64_LIST", 23, 23, 2, yVar3);
        r rVar25 = new r("FIXED32_LIST", 24, 24, 2, yVar4);
        r rVar26 = new r("BOOL_LIST", 25, 25, 2, yVar5);
        r rVar27 = new r("STRING_LIST", 26, 26, 2, yVar6);
        r rVar28 = new r("MESSAGE_LIST", 27, 27, 2, yVar7);
        r rVar29 = new r("BYTES_LIST", 28, 28, 2, yVar8);
        r rVar30 = new r("UINT32_LIST", 29, 29, 2, yVar4);
        r rVar31 = new r("ENUM_LIST", 30, 30, 2, yVar9);
        r rVar32 = new r("SFIXED32_LIST", 31, 31, 2, yVar4);
        r rVar33 = new r("SFIXED64_LIST", 32, 32, 2, yVar3);
        r rVar34 = new r("SINT32_LIST", 33, 33, 2, yVar4);
        r rVar35 = new r("SINT64_LIST", 34, 34, 2, yVar3);
        r rVar36 = new r("DOUBLE_LIST_PACKED", 35, 35, 3, yVar);
        B = rVar36;
        r rVar37 = new r("FLOAT_LIST_PACKED", 36, 36, 3, yVar2);
        r rVar38 = new r("INT64_LIST_PACKED", 37, 37, 3, yVar3);
        r rVar39 = new r("UINT64_LIST_PACKED", 38, 38, 3, yVar3);
        r rVar40 = new r("INT32_LIST_PACKED", 39, 39, 3, yVar4);
        r rVar41 = new r("FIXED64_LIST_PACKED", 40, 40, 3, yVar3);
        r rVar42 = new r("FIXED32_LIST_PACKED", 41, 41, 3, yVar4);
        r rVar43 = new r("BOOL_LIST_PACKED", 42, 42, 3, yVar5);
        r rVar44 = new r("UINT32_LIST_PACKED", 43, 43, 3, yVar4);
        r rVar45 = new r("ENUM_LIST_PACKED", 44, 44, 3, yVar9);
        r rVar46 = new r("SFIXED32_LIST_PACKED", 45, 45, 3, yVar4);
        r rVar47 = new r("SFIXED64_LIST_PACKED", 46, 46, 3, yVar3);
        r rVar48 = new r("SINT32_LIST_PACKED", 47, 47, 3, yVar4);
        r rVar49 = new r("SINT64_LIST_PACKED", 48, 48, 3, yVar3);
        C = rVar49;
        E = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, new r("GROUP_LIST", 49, 49, 2, yVar7), new r("MAP", 50, 50, 4, y.A)};
        r[] rVarArrValues = values();
        D = new r[rVarArrValues.length];
        for (r rVar50 : rVarArrValues) {
            D[rVar50.A] = rVar50;
        }
    }

    public r(String str, int i10, int i11, int i12, y yVar) {
        super(str, i10);
        this.A = i11;
        int iB = e4.f.b(i12);
        if (iB == 1 || iB == 3) {
            yVar.getClass();
        }
        if (i12 == 1) {
            yVar.ordinal();
        }
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) E.clone();
    }
}
