package e10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public final class i extends w {
    public final int e;

    public i(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.e = i;
    }

    @Override
    public final Object call(Object[] args) {
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                Constructor constructor = (Constructor) this.a;
                db.g gVar = new db.g(2);
                gVar.f(args);
                gVar.a((Object) null);
                ArrayList arrayList = gVar.B;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                return ((Constructor) this.a).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
