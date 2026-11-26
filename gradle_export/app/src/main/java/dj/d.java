package dj;

import java.util.Date;
import java.util.HashMap;

public final class d implements cj.a {

    public static final b f4902f;

    public static final b f4903g;

    public final HashMap f4905a;

    public final HashMap f4906b;

    public final a f4907c;

    public boolean f4908d;

    public static final a f4901e = new a(0);

    public static final c f4904h = new c();

    static {
        final int i10 = 0;
        f4902f = new bj.e() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((bj.f) obj2).a((String) obj);
                        break;
                    default:
                        ((bj.f) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f4903g = new bj.e() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((bj.f) obj2).a((String) obj);
                        break;
                    default:
                        ((bj.f) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f4905a = map;
        HashMap map2 = new HashMap();
        this.f4906b = map2;
        this.f4907c = f4901e;
        this.f4908d = false;
        map2.put(String.class, f4902f);
        map.remove(String.class);
        map2.put(Boolean.class, f4903g);
        map.remove(Boolean.class);
        map2.put(Date.class, f4904h);
        map.remove(Date.class);
    }

    public final cj.a a(Class cls, bj.c cVar) {
        this.f4905a.put(cls, cVar);
        this.f4906b.remove(cls);
        return this;
    }
}
