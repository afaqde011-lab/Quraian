package r40;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.a0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import l1.q1;
import p40.s0;
import q40.b0;

public abstract class a implements q40.j, o40.c, o40.a {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final q40.c c;
    public final String d;
    public final q1 e;

    public a(q40.c cVar, String str) {
        this.c = cVar;
        this.d = str;
        this.e = cVar.a;
    }

    @Override
    public final double A(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return K(S(descriptor, i));
    }

    @Override
    public final byte B() {
        return I(U());
    }

    @Override
    public final short C() {
        return P(U());
    }

    @Override
    public final float D() {
        return L(U());
    }

    @Override
    public final double E() {
        return K(U());
    }

    public abstract q40.l F(String str);

    public final q40.l G() {
        q40.l lVarF;
        String str = (String) h00.q.U0(this.a);
        return (str == null || (lVarF = F(str)) == null) ? T() : lVarF;
    }

    public final boolean H(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (lVarF instanceof b0) {
            b0 b0Var = (b0) lVarF;
            try {
                Boolean boolD = q40.m.d(b0Var);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                X(b0Var, "boolean", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(b0Var, "boolean", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var2 = a0.a;
        sb.append(b0Var2.b(b0.class).n());
        sb.append(", but had ");
        sb.append(b0Var2.b(lVarF.getClass()).n());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(W(tag));
        throw j.d(sb.toString(), lVarF.toString(), -1);
    }

    public final byte I(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        try {
            int iE = q40.m.e(b0Var2);
            Byte bValueOf = (-128 > iE || iE > 127) ? null : Byte.valueOf((byte) iE);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(b0Var2, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(b0Var2, "byte", tag);
            throw null;
        }
    }

    public final char J(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of char at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        try {
            String strA = b0Var2.a();
            kotlin.jvm.internal.m.e(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(b0Var2, "char", tag);
            throw null;
        }
    }

    public final double K(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of double at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        try {
            p40.a0 a0Var = q40.m.a;
            double d = Double.parseDouble(b0Var2.a());
            q1 q1Var = this.c.a;
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String output = G().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw j.c(-1, j.s(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(b0Var2, "double", tag);
            throw null;
        }
    }

    public final float L(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of float at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        try {
            p40.a0 a0Var = q40.m.a;
            float f = Float.parseFloat(b0Var2.a());
            q1 q1Var = this.c.a;
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String output = G().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw j.c(-1, j.s(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(b0Var2, "float", tag);
            throw null;
        }
    }

    public final o40.c M(Object obj, n40.e inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(inlineDescriptor, "inlineDescriptor");
        if (!v.a(inlineDescriptor)) {
            this.a.add(tag);
            return this;
        }
        q40.l lVarF = F(tag);
        String strA = inlineDescriptor.a();
        if (lVarF instanceof b0) {
            String source = ((b0) lVarF).a();
            q40.c json = this.c;
            kotlin.jvm.internal.m.e(json, "json");
            kotlin.jvm.internal.m.e(source, "source");
            return new h(new a20.g(source), json);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var = a0.a;
        sb.append(b0Var.b(b0.class).n());
        sb.append(", but had ");
        sb.append(b0Var.b(lVarF.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strA);
        sb.append(" at element: ");
        sb.append(W(tag));
        throw j.d(sb.toString(), lVarF.toString(), -1);
    }

    public final int N(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (lVarF instanceof b0) {
            b0 b0Var = (b0) lVarF;
            try {
                return q40.m.e(b0Var);
            } catch (IllegalArgumentException unused) {
                X(b0Var, "int", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var2 = a0.a;
        sb.append(b0Var2.b(b0.class).n());
        sb.append(", but had ");
        sb.append(b0Var2.b(lVarF.getClass()).n());
        sb.append(" as the serialized body of int at element: ");
        sb.append(W(tag));
        throw j.d(sb.toString(), lVarF.toString(), -1);
    }

    public final long O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (lVarF instanceof b0) {
            b0 b0Var = (b0) lVarF;
            try {
                p40.a0 a0Var = q40.m.a;
                try {
                    return new a20.g(b0Var.a()).o();
                } catch (JsonDecodingException e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                X(b0Var, "long", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var2 = a0.a;
        sb.append(b0Var2.b(b0.class).n());
        sb.append(", but had ");
        sb.append(b0Var2.b(lVarF.getClass()).n());
        sb.append(" as the serialized body of long at element: ");
        sb.append(W(tag));
        throw j.d(sb.toString(), lVarF.toString(), -1);
    }

    public final short P(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of short at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        try {
            int iE = q40.m.e(b0Var2);
            Short shValueOf = (-32768 > iE || iE > 32767) ? null : Short.valueOf((short) iE);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(b0Var2, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(b0Var2, "short", tag);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        if (!(lVarF instanceof b0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(b0.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarF.getClass()).n());
            sb.append(" as the serialized body of string at element: ");
            sb.append(W(tag));
            throw j.d(sb.toString(), lVarF.toString(), -1);
        }
        b0 b0Var2 = (b0) lVarF;
        if (!(b0Var2 instanceof q40.r)) {
            StringBuilder sbN = g4.c.n("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbN.append(W(tag));
            throw j.d(sbN.toString(), G().toString(), -1);
        }
        q40.r rVar = (q40.r) b0Var2;
        if (rVar.A) {
            return rVar.C;
        }
        q1 q1Var = this.c.a;
        StringBuilder sbN2 = g4.c.n("String literal for key '", tag, "' should be quoted at element: ");
        sbN2.append(W(tag));
        sbN2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw j.d(sbN2.toString(), G().toString(), -1);
    }

    public String R(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return descriptor.f(i);
    }

    public final String S(n40.e eVar, int i) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        String nestedName = R(eVar, i);
        kotlin.jvm.internal.m.e(nestedName, "nestedName");
        return nestedName;
    }

    public abstract q40.l T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(va.a.M(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : h00.q.R0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String currentTag) {
        kotlin.jvm.internal.m.e(currentTag, "currentTag");
        return V() + '.' + currentTag;
    }

    public final void X(b0 b0Var, String str, String str2) {
        throw j.d("Failed to parse literal '" + b0Var + "' as " + (r30.r.x0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2), G().toString(), -1);
    }

    @Override
    public void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
    }

    @Override
    public final ce.c b() {
        return this.c.b;
    }

    @Override
    public o40.a c(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        q40.l lVarG = G();
        va.a kind = descriptor.getKind();
        boolean zA = kotlin.jvm.internal.m.a(kind, n40.i.d);
        q40.c cVar = this.c;
        if (zA || (kind instanceof n40.b)) {
            String strA = descriptor.a();
            if (lVarG instanceof q40.e) {
                return new o(cVar, (q40.e) lVarG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(q40.e.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarG.getClass()).n());
            sb.append(" as the serialized body of ");
            sb.append(strA);
            sb.append(" at element: ");
            sb.append(V());
            throw j.d(sb.toString(), lVarG.toString(), -1);
        }
        if (!kotlin.jvm.internal.m.a(kind, n40.i.e)) {
            String strA2 = descriptor.a();
            if (lVarG instanceof q40.x) {
                return new n(cVar, (q40.x) lVarG, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var2 = a0.a;
            sb2.append(b0Var2.b(q40.x.class).n());
            sb2.append(", but had ");
            sb2.append(b0Var2.b(lVarG.getClass()).n());
            sb2.append(" as the serialized body of ");
            sb2.append(strA2);
            sb2.append(" at element: ");
            sb2.append(V());
            throw j.d(sb2.toString(), lVarG.toString(), -1);
        }
        n40.e eVarF = j.f(descriptor.h(0), cVar.b);
        va.a kind2 = eVarF.getKind();
        if (!(kind2 instanceof n40.d) && !kotlin.jvm.internal.m.a(kind2, n40.h.c)) {
            throw j.b(eVarF);
        }
        String strA3 = descriptor.a();
        if (lVarG instanceof q40.x) {
            return new p(cVar, (q40.x) lVarG);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var3 = a0.a;
        sb3.append(b0Var3.b(q40.x.class).n());
        sb3.append(", but had ");
        sb3.append(b0Var3.b(lVarG.getClass()).n());
        sb3.append(" as the serialized body of ");
        sb3.append(strA3);
        sb3.append(" at element: ");
        sb3.append(V());
        throw j.d(sb3.toString(), lVarG.toString(), -1);
    }

    @Override
    public final int d(n40.e enumDescriptor) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        String tag = (String) U();
        kotlin.jvm.internal.m.e(tag, "tag");
        q40.l lVarF = F(tag);
        String strA = enumDescriptor.a();
        if (lVarF instanceof b0) {
            return j.k(enumDescriptor, this.c, ((b0) lVarF).a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.b0 b0Var = a0.a;
        sb.append(b0Var.b(b0.class).n());
        sb.append(", but had ");
        sb.append(b0Var.b(lVarF.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strA);
        sb.append(" at element: ");
        sb.append(W(tag));
        throw j.d(sb.toString(), lVarF.toString(), -1);
    }

    @Override
    public final boolean e() {
        return H(U());
    }

    @Override
    public final char f() {
        return J(U());
    }

    @Override
    public final long g(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return O(S(descriptor, i));
    }

    @Override
    public final short h(s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return P(S(descriptor, i));
    }

    @Override
    public final byte i(s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return I(S(descriptor, i));
    }

    @Override
    public final Object j(l40.a deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        if (!(deserializer instanceof l40.c)) {
            return deserializer.deserialize(this);
        }
        q40.c cVar = this.c;
        q1 q1Var = cVar.a;
        l40.c cVar2 = (l40.c) deserializer;
        String strI = j.i(cVar2.getDescriptor(), cVar);
        q40.l lVarG = G();
        String strA = cVar2.getDescriptor().a();
        if (!(lVarG instanceof q40.x)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.b0 b0Var = a0.a;
            sb.append(b0Var.b(q40.x.class).n());
            sb.append(", but had ");
            sb.append(b0Var.b(lVarG.getClass()).n());
            sb.append(" as the serialized body of ");
            sb.append(strA);
            sb.append(" at element: ");
            sb.append(V());
            throw j.d(sb.toString(), lVarG.toString(), -1);
        }
        q40.x xVar = (q40.x) lVarG;
        q40.l lVar = (q40.l) xVar.get(strI);
        String strA2 = null;
        if (lVar != null) {
            b0 b0VarH = q40.m.h(lVar);
            if (!(b0VarH instanceof q40.u)) {
                strA2 = b0VarH.a();
            }
        }
        try {
            return j.o(cVar, strI, xVar, va.a.I((l40.c) deserializer, this, strA2));
        } catch (SerializationException e) {
            String message = e.getMessage();
            kotlin.jvm.internal.m.b(message);
            throw j.d(message, xVar.toString(), -1);
        }
    }

    @Override
    public final char k(s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return J(S(descriptor, i));
    }

    @Override
    public final q40.l m() {
        return G();
    }

    @Override
    public final int n() {
        return N(U());
    }

    @Override
    public final o40.c o(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (h00.q.U0(this.a) != null) {
            return M(U(), descriptor);
        }
        return new l(this.c, T(), this.d).o(descriptor);
    }

    @Override
    public final String p() {
        return Q(U());
    }

    @Override
    public final int q(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return N(S(descriptor, i));
    }

    @Override
    public final boolean r(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return H(S(descriptor, i));
    }

    @Override
    public final Object s(n40.e descriptor, int i, l40.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        this.a.add(S(descriptor, i));
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        Object objJ = j(deserializer);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objJ;
    }

    @Override
    public final String t(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return Q(S(descriptor, i));
    }

    @Override
    public final long u() {
        return O(U());
    }

    @Override
    public final Object v(n40.e descriptor, int i, l40.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        this.a.add(S(descriptor, i));
        Object objJ = (deserializer.getDescriptor().c() || w()) ? j(deserializer) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objJ;
    }

    @Override
    public boolean w() {
        return !(G() instanceof q40.u);
    }

    @Override
    public final float x(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return L(S(descriptor, i));
    }

    @Override
    public final q40.c y() {
        return this.c;
    }

    @Override
    public final o40.c z(s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return M(S(descriptor, i), descriptor.h(i));
    }
}
