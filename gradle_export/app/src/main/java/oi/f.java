package oi;

import java.util.HashMap;

public final class f {
    public static final f A;
    public static final HashMap B;
    public static final f[] C;

    f EF0;

    static {
        f fVar = new f("X86_32", 0);
        f fVar2 = new f("X86_64", 1);
        f fVar3 = new f("ARM_UNKNOWN", 2);
        f fVar4 = new f("PPC", 3);
        f fVar5 = new f("PPC64", 4);
        f fVar6 = new f("ARMV6", 5);
        f fVar7 = new f("ARMV7", 6);
        f fVar8 = new f("UNKNOWN", 7);
        A = fVar8;
        f fVar9 = new f("ARMV7S", 8);
        f fVar10 = new f("ARM64", 9);
        C = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        HashMap map = new HashMap(4);
        B = map;
        map.put("armeabi-v7a", fVar7);
        map.put("armeabi", fVar6);
        map.put("arm64-v8a", fVar10);
        map.put("x86", fVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) C.clone();
    }
}
