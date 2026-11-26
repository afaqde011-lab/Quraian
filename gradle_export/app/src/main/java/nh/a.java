package nh;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import yh.b0;
import yh.j0;
import yh.l1;
import yh.o1;
import yh.r1;
import yh.t1;

public abstract class a {
    static {
        f[] fVarArr = {new f(0, mh.a.class)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f11318a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f11318a;
        Collections.unmodifiableMap(map);
        f[] fVarArr2 = {new f(3, mh.a.class)};
        HashMap map2 = new HashMap();
        f fVar2 = fVarArr2[0];
        Class cls3 = fVar2.f11318a;
        if (map2.containsKey(cls3)) {
            throw new IllegalArgumentException(a1.b.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls3, fVar2);
        Class cls4 = fVarArr2[0].f11318a;
        Collections.unmodifiableMap(map2);
        f[] fVarArr3 = {new f(4, mh.a.class)};
        HashMap map3 = new HashMap();
        f fVar3 = fVarArr3[0];
        Class cls5 = fVar3.f11318a;
        if (map3.containsKey(cls5)) {
            throw new IllegalArgumentException(a1.b.m(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map3.put(cls5, fVar3);
        Class cls6 = fVarArr3[0].f11318a;
        Collections.unmodifiableMap(map3);
        f[] fVarArr4 = {new f(2, mh.a.class)};
        HashMap map4 = new HashMap();
        f fVar4 = fVarArr4[0];
        Class cls7 = fVar4.f11318a;
        if (map4.containsKey(cls7)) {
            throw new IllegalArgumentException(a1.b.m(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map4.put(cls7, fVar4);
        Class cls8 = fVarArr4[0].f11318a;
        Collections.unmodifiableMap(map4);
        f[] fVarArr5 = {new f(6, mh.a.class)};
        HashMap map5 = new HashMap();
        f fVar5 = fVarArr5[0];
        Class cls9 = fVar5.f11318a;
        if (map5.containsKey(cls9)) {
            throw new IllegalArgumentException(a1.b.m(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map5.put(cls9, fVar5);
        Class cls10 = fVarArr5[0].f11318a;
        Collections.unmodifiableMap(map5);
        f[] fVarArr6 = {new f(7, mh.a.class)};
        HashMap map6 = new HashMap();
        f fVar6 = fVarArr6[0];
        Class cls11 = fVar6.f11318a;
        if (map6.containsKey(cls11)) {
            throw new IllegalArgumentException(a1.b.m(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map6.put(cls11, fVar6);
        Class cls12 = fVarArr6[0].f11318a;
        Collections.unmodifiableMap(map6);
        f[] fVarArr7 = {new f(5, mh.a.class)};
        HashMap map7 = new HashMap();
        f fVar7 = fVarArr7[0];
        Class cls13 = fVar7.f11318a;
        if (map7.containsKey(cls13)) {
            throw new IllegalArgumentException(a1.b.m(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map7.put(cls13, fVar7);
        Class cls14 = fVarArr7[0].f11318a;
        Collections.unmodifiableMap(map7);
        f[] fVarArr8 = {new f(8, mh.a.class)};
        HashMap map8 = new HashMap();
        f fVar8 = fVarArr8[0];
        Class cls15 = fVar8.f11318a;
        if (map8.containsKey(cls15)) {
            throw new IllegalArgumentException(a1.b.m(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map8.put(cls15, fVar8);
        Class cls16 = fVarArr8[0].f11318a;
        Collections.unmodifiableMap(map8);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        mh.m.h(e.f11317b);
        uh.m.a();
        mh.m.f(new h(yh.h.class, new f[]{new f(0, mh.a.class)}, 0), true);
        mh.m.f(new h(yh.x.class, new f[]{new f(3, mh.a.class)}, 2), true);
        th.k kVar = o.f11347a;
        th.i iVar = th.i.f14800b;
        iVar.e(o.f11347a);
        iVar.d(o.f11348b);
        iVar.c(o.f11349c);
        iVar.b(o.f11350d);
        if (qh.a.a()) {
            return;
        }
        mh.m.f(new h(yh.r.class, new f[]{new f(2, mh.a.class)}, 1), true);
        iVar.e(l.f11339a);
        iVar.d(l.f11340b);
        iVar.c(l.f11341c);
        iVar.b(l.f11342d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            mh.m.f(new h(b0.class, new f[]{new f(4, mh.a.class)}, 3), true);
            iVar.e(r.f11353a);
            iVar.d(r.f11354b);
            iVar.c(r.f11355c);
            iVar.b(r.f11356d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        mh.m.f(new h(j0.class, new f[]{new f(5, mh.a.class)}, 4), true);
        th.k kVar2 = u.f11357a;
        th.i iVar2 = th.i.f14800b;
        iVar2.e(u.f11357a);
        iVar2.d(u.f11358b);
        iVar2.c(u.f11359c);
        iVar2.b(u.f11360d);
        mh.m.f(new h(l1.class, new f[]{new f(6, mh.a.class)}, 5), true);
        mh.m.f(new h(o1.class, new f[]{new f(7, mh.a.class)}, 6), true);
        mh.m.f(new h(t1.class, new f[]{new f(8, mh.a.class)}, 7), true);
        iVar2.e(y.f11364a);
        iVar2.d(y.f11365b);
        iVar2.c(y.f11366c);
        iVar2.b(y.f11367d);
    }
}
