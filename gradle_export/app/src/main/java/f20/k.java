package f20;

import g00.b0;

public final class k implements u00.k {
    public final int A;
    public final String B;
    public final String C;

    public k(String str, String str2, int i) {
        this.A = i;
        this.B = str;
        this.C = str2;
    }

    @Override
    public final Object invoke(Object obj) {
        p function = (p) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(function, "$this$function");
                e eVar = m.b;
                String str = this.B;
                function.a(str, eVar);
                e eVar2 = m.a;
                function.a(this.C, eVar, eVar, eVar2, eVar2);
                function.b(str, eVar2);
                break;
            case 1:
                kotlin.jvm.internal.m.e(function, "$this$function");
                e eVar3 = m.b;
                String str2 = this.B;
                function.a(str2, eVar3);
                function.a(this.C, eVar3, eVar3, eVar3);
                function.b(str2, eVar3);
                break;
            case 2:
                kotlin.jvm.internal.m.e(function, "$this$function");
                e eVar4 = m.b;
                String str3 = this.B;
                function.a(str3, eVar4);
                e eVar5 = m.c;
                e eVar6 = m.a;
                function.a(this.C, eVar4, eVar4, eVar5, eVar6);
                function.b(str3, eVar6);
                break;
            case 3:
                kotlin.jvm.internal.m.e(function, "$this$function");
                e eVar7 = m.b;
                String str4 = this.B;
                function.a(str4, eVar7);
                e eVar8 = m.c;
                function.a(str4, eVar8);
                e eVar9 = m.a;
                function.a(this.C, eVar7, eVar8, eVar8, eVar9);
                function.b(str4, eVar9);
                break;
            case 4:
                kotlin.jvm.internal.m.e(function, "$this$function");
                e eVar10 = m.c;
                function.a(this.B, eVar10);
                function.b(this.C, m.b, eVar10);
                q20.l lVar = q20.l.A;
                break;
            default:
                kotlin.jvm.internal.m.e(function, "$this$function");
                function.a(this.B, m.a);
                function.b(this.C, m.b, m.c);
                q20.l lVar2 = q20.l.A;
                break;
        }
        return b0.a;
    }
}
