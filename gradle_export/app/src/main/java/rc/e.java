package rc;

import java.util.Set;

public final class e {
    public static final d A;
    public static final Set B;
    public static final e C;
    public static final e D;
    public static final e E;
    public static final e F;
    public static final e G;
    public static final e H;
    public static final e[] I;

    static {
        e eVar = new e("SESSIONS", 0);
        C = eVar;
        e eVar2 = new e("APP_LIFECYCLES", 1);
        D = eVar2;
        e eVar3 = new e("DEEP_LINKS", 2);
        E = eVar3;
        e eVar4 = new e("SCREEN_VIEWS", 3);
        F = eVar4;
        e eVar5 = new e("ELEMENT_INTERACTIONS", 4);
        G = eVar5;
        e eVar6 = new e("FRUSTRATION_INTERACTIONS", 5);
        H = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        I = eVarArr;
        f50.c.v(eVarArr);
        A = new d(0);
        h00.n.X0(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6});
        B = h00.n.X0(new e[]{eVar2, eVar4, eVar5, eVar3});
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) I.clone();
    }
}
