package m20;

import com.google.android.gms.internal.measurement.x5;
import g00.k;
import h00.q;
import h00.r;
import i20.b0;
import i20.c1;
import i20.f0;
import i20.j0;
import i20.n;
import i20.u0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import l20.i;
import l20.j;
import o20.h;

public final class g {
    public static final h a;

    static {
        h hVar = new h();
        hVar.a(j.a);
        hVar.a(j.b);
        hVar.a(j.c);
        hVar.a(j.d);
        hVar.a(j.e);
        hVar.a(j.f);
        hVar.a(j.g);
        hVar.a(j.h);
        hVar.a(j.i);
        hVar.a(j.j);
        hVar.a(j.k);
        hVar.a(j.l);
        a = hVar;
    }

    public static e a(n proto, k20.g nameResolver, h9.f typeTable) {
        String strR0;
        m.e(proto, "proto");
        m.e(nameResolver, "nameResolver");
        m.e(typeTable, "typeTable");
        o20.n constructorSignature = j.a;
        m.d(constructorSignature, "constructorSignature");
        l20.c cVar = (l20.c) w00.a.u(proto, constructorSignature);
        String string = (cVar == null || (cVar.B & 1) != 1) ? "<init>" : nameResolver.getString(cVar.C);
        if (cVar == null || (cVar.B & 2) != 2) {
            List<c1> list = proto.E;
            m.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(r.q0(list, 10));
            for (c1 c1Var : list) {
                m.b(c1Var);
                String strE = e(w50.c.k0(c1Var, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strR0 = q.R0(arrayList, "", "(", ")V", null, 56);
        } else {
            strR0 = nameResolver.getString(cVar.D);
        }
        return new e(string, strR0);
    }

    public static m20.d b(i20.j0 r4, k20.g r5, h9.f r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: m20.g.b(i20.j0, k20.g, h9.f, boolean):m20.d");
    }

    public static e c(b0 proto, k20.g nameResolver, h9.f typeTable) {
        String strN;
        m.e(proto, "proto");
        m.e(nameResolver, "nameResolver");
        m.e(typeTable, "typeTable");
        o20.n methodSignature = j.b;
        m.d(methodSignature, "methodSignature");
        l20.c cVar = (l20.c) w00.a.u(proto, methodSignature);
        int i = (cVar == null || (cVar.B & 1) != 1) ? proto.F : cVar.C;
        if (cVar == null || (cVar.B & 2) != 2) {
            List listT = va.a.T(w50.c.b0(proto, typeTable));
            List<c1> list = proto.P;
            m.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(r.q0(list, 10));
            for (c1 c1Var : list) {
                m.b(c1Var);
                arrayList.add(w50.c.k0(c1Var, typeTable));
            }
            ArrayList arrayListY0 = q.Y0(arrayList, listT);
            ArrayList arrayList2 = new ArrayList(r.q0(arrayListY0, 10));
            Iterator it = arrayListY0.iterator();
            while (it.hasNext()) {
                String strE = e((u0) it.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(w50.c.e0(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strN = x5.n(new StringBuilder(), q.R0(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strN = nameResolver.getString(cVar.D);
        }
        return new e(nameResolver.getString(i), strN);
    }

    public static final boolean d(j0 proto) {
        m.e(proto, "proto");
        k20.b bVar = c.a;
        Object objI = proto.i(j.e);
        m.d(objI, "getExtension(...)");
        return bVar.e(((Number) objI).intValue()).booleanValue();
    }

    public static String e(u0 u0Var, k20.g gVar) {
        if (u0Var.n()) {
            return b.b(gVar.a(u0Var.I));
        }
        return null;
    }

    public static final k f(String[] strArr, String[] strings) throws InvalidProtocolBufferException {
        m.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarH = h(byteArrayInputStream, strings);
        i20.a aVar = i20.k.h0;
        aVar.getClass();
        o20.f fVar = new o20.f(byteArrayInputStream);
        o20.b bVar = (o20.b) aVar.a(fVar, a);
        try {
            fVar.a(0);
            if (bVar.isInitialized()) {
                return new k(fVarH, (i20.k) bVar);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.A = bVar;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.A = bVar;
            throw e;
        }
    }

    public static final k g(String[] strArr, String[] strings) {
        m.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarH = h(byteArrayInputStream, strings);
        i20.a aVar = b0.Z;
        aVar.getClass();
        o20.f fVar = new o20.f(byteArrayInputStream);
        o20.b bVar = (o20.b) aVar.a(fVar, a);
        try {
            fVar.a(0);
            if (bVar.isInitialized()) {
                return new k(fVarH, (b0) bVar);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.A = bVar;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.A = bVar;
            throw e;
        }
    }

    public static f h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        i iVar = (i) i.H.b(byteArrayInputStream, a);
        m.d(iVar, "parseDelimitedFrom(...)");
        return new f(iVar, strArr);
    }

    public static final k i(String[] strArr, String[] strings) {
        m.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarH = h(byteArrayInputStream, strings);
        i20.a aVar = f0.L;
        aVar.getClass();
        o20.f fVar = new o20.f(byteArrayInputStream);
        o20.b bVar = (o20.b) aVar.a(fVar, a);
        try {
            fVar.a(0);
            if (bVar.isInitialized()) {
                return new k(fVarH, (f0) bVar);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.A = bVar;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.A = bVar;
            throw e;
        }
    }
}
