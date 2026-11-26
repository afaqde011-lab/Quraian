package r40;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import l1.q1;
import p40.a0;
import p40.s0;

public class m implements q40.p, o40.d, o40.b {
    public final ArrayList a;
    public final q40.c b;
    public final u00.k c;
    public final q1 d;
    public String e;
    public String f;
    public final int g;
    public Object h;

    public m(q40.c cVar, u00.k kVar, char c) {
        this.a = new ArrayList();
        this.b = cVar;
        this.c = kVar;
        this.d = cVar.a;
    }

    public m(q40.c json, u00.k nodeConsumer, int i) {
        this(json, nodeConsumer, (char) 0);
        this.g = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.m.e(json, "json");
                kotlin.jvm.internal.m.e(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                kotlin.jvm.internal.m.e(json, "json");
                kotlin.jvm.internal.m.e(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                kotlin.jvm.internal.m.e(json, "json");
                kotlin.jvm.internal.m.e(nodeConsumer, "nodeConsumer");
                this.a.add("primitive");
                break;
        }
    }

    @Override
    public final o40.b A(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return c(descriptor);
    }

    @Override
    public final void B(n40.e descriptor, int i, double d) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        F(J(descriptor, i), d);
    }

    @Override
    public final void C(n40.e descriptor, int i, l40.a serializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.a.add(J(descriptor, i));
        y(serializer, obj);
    }

    @Override
    public final void D(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.b(value));
    }

    public final void E(n40.e descriptor, int i, l40.a serializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.a.add(J(descriptor, i));
        rd.a.z(this, serializer, obj);
    }

    public final void F(Object obj, double d) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Double.valueOf(d)));
        this.d.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            Double dValueOf = Double.valueOf(d);
            String output = I().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw new JsonEncodingException(j.s(dValueOf, tag, output));
        }
    }

    public final void G(Object obj, float f) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Float.valueOf(f)));
        this.d.getClass();
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            Float fValueOf = Float.valueOf(f);
            String output = I().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw new JsonEncodingException(j.s(fValueOf, tag, output));
        }
    }

    public final o40.d H(Object obj, n40.e inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(inlineDescriptor, "inlineDescriptor");
        if (v.a(inlineDescriptor)) {
            return new b(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(q40.m.a)) {
            return new b(this, tag, inlineDescriptor);
        }
        this.a.add(tag);
        return this;
    }

    public q40.l I() {
        switch (this.g) {
            case 0:
                q40.l lVar = (q40.l) this.h;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new q40.x((LinkedHashMap) this.h);
            default:
                return new q40.e((ArrayList) this.h);
        }
    }

    public final String J(n40.e descriptor, int i) {
        String nestedName;
        kotlin.jvm.internal.m.e(descriptor, "<this>");
        switch (this.g) {
            case 2:
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                nestedName = String.valueOf(i);
                break;
            default:
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                q40.c json = this.b;
                kotlin.jvm.internal.m.e(json, "json");
                j.n(descriptor, json);
                nestedName = descriptor.f(i);
                break;
        }
        kotlin.jvm.internal.m.e(nestedName, "nestedName");
        return nestedName;
    }

    public final Object K() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(va.a.M(arrayList));
    }

    public void L(String key, q40.l element) {
        switch (this.g) {
            case 0:
                kotlin.jvm.internal.m.e(key, "key");
                kotlin.jvm.internal.m.e(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((q40.l) this.h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.h = element;
                this.c.invoke(element);
                return;
            case 1:
                kotlin.jvm.internal.m.e(key, "key");
                kotlin.jvm.internal.m.e(element, "element");
                ((LinkedHashMap) this.h).put(key, element);
                return;
            default:
                kotlin.jvm.internal.m.e(key, "key");
                kotlin.jvm.internal.m.e(element, "element");
                ((ArrayList) this.h).add(Integer.parseInt(key), element);
                return;
        }
    }

    @Override
    public final void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (!this.a.isEmpty()) {
            K();
        }
        this.c.invoke(I());
    }

    @Override
    public final ce.c b() {
        return this.b.b;
    }

    @Override
    public final o40.b c(n40.e descriptor) {
        m mVar;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        u00.k nodeConsumer = h00.q.U0(this.a) == null ? this.c : new q0.a(this, 9);
        va.a kind = descriptor.getKind();
        boolean zA = kotlin.jvm.internal.m.a(kind, n40.i.d);
        q40.c cVar = this.b;
        if (zA || (kind instanceof n40.b)) {
            mVar = new m(cVar, nodeConsumer, 2);
        } else if (kotlin.jvm.internal.m.a(kind, n40.i.e)) {
            n40.e eVarF = j.f(descriptor.h(0), cVar.b);
            va.a kind2 = eVarF.getKind();
            if (!(kind2 instanceof n40.d) && !kotlin.jvm.internal.m.a(kind2, n40.h.c)) {
                throw j.b(eVarF);
            }
            kotlin.jvm.internal.m.e(nodeConsumer, "nodeConsumer");
            q qVar = new q(cVar, nodeConsumer, 1);
            qVar.j = true;
            mVar = qVar;
        } else {
            mVar = new m(cVar, nodeConsumer, 1);
        }
        String str = this.e;
        if (str != null) {
            if (mVar instanceof q) {
                q qVar2 = (q) mVar;
                qVar2.L(SubscriberAttributeKt.JSON_NAME_KEY, q40.m.b(str));
                String strA = this.f;
                if (strA == null) {
                    strA = descriptor.a();
                }
                qVar2.L("value", q40.m.b(strA));
            } else {
                String strA2 = this.f;
                if (strA2 == null) {
                    strA2 = descriptor.a();
                }
                mVar.L(str, q40.m.b(strA2));
            }
            this.e = null;
            this.f = null;
        }
        return mVar;
    }

    @Override
    public final void d() {
        String str = (String) h00.q.U0(this.a);
        if (str == null) {
            this.c.invoke(q40.u.INSTANCE);
        } else {
            L(str, q40.u.INSTANCE);
        }
    }

    @Override
    public final void e(double d) {
        F(K(), d);
    }

    @Override
    public final void f(short s) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Short.valueOf(s)));
    }

    @Override
    public final void g(byte b) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Byte.valueOf(b)));
    }

    @Override
    public final void h(boolean z) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z);
        a0 a0Var = q40.m.a;
        L(tag, new q40.r(boolValueOf, false, null));
    }

    @Override
    public final void i(n40.e descriptor, int i, String value) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(value, "value");
        L(J(descriptor, i), q40.m.b(value));
    }

    @Override
    public final void j(s0 descriptor, int i, byte b) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        L(J(descriptor, i), q40.m.a(Byte.valueOf(b)));
    }

    @Override
    public final boolean k(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.d.getClass();
        return false;
    }

    @Override
    public final void l(float f) {
        G(K(), f);
    }

    @Override
    public final o40.d m(s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return H(J(descriptor, i), descriptor.h(i));
    }

    @Override
    public final void n(s0 descriptor, int i, char c) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        L(J(descriptor, i), q40.m.b(String.valueOf(c)));
    }

    @Override
    public final o40.d o(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (h00.q.U0(this.a) == null) {
            return new m(this.b, this.c, 0).o(descriptor);
        }
        if (this.e != null) {
            this.f = descriptor.a();
        }
        return H(K(), descriptor);
    }

    @Override
    public final void p(char c) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.b(String.valueOf(c)));
    }

    @Override
    public final void q(n40.e enumDescriptor, int i) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.b(enumDescriptor.f(i)));
    }

    @Override
    public final void r(s0 descriptor, int i, short s) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        L(J(descriptor, i), q40.m.a(Short.valueOf(s)));
    }

    @Override
    public final void s(n40.e descriptor, int i, float f) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        G(J(descriptor, i), f);
    }

    @Override
    public final void t(n40.e descriptor, int i, long j) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        L(J(descriptor, i), q40.m.a(Long.valueOf(j)));
    }

    @Override
    public final void u(n40.e descriptor, int i, boolean z) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        String strJ = J(descriptor, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        a0 a0Var = q40.m.a;
        L(strJ, new q40.r(boolValueOf, false, null));
    }

    @Override
    public final void v(int i) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Integer.valueOf(i)));
    }

    @Override
    public final void w(int i, int i2, n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        L(J(descriptor, i), q40.m.a(Integer.valueOf(i2)));
    }

    @Override
    public void x(n40.e descriptor, int i, l40.a serializer, Object obj) {
        switch (this.g) {
            case 1:
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                kotlin.jvm.internal.m.e(serializer, "serializer");
                if (obj != null || this.d.c) {
                    E(descriptor, i, serializer, obj);
                }
                break;
            default:
                E(descriptor, i, serializer, obj);
                break;
        }
    }

    @Override
    public final void y(l40.a serializer, Object obj) {
        String strI;
        kotlin.jvm.internal.m.e(serializer, "serializer");
        Object objU0 = h00.q.U0(this.a);
        q40.c cVar = this.b;
        if (objU0 == null) {
            n40.e eVarF = j.f(serializer.getDescriptor(), cVar.b);
            if ((eVarF.getKind() instanceof n40.d) || eVarF.getKind() == n40.h.c) {
                new m(cVar, this.c, 0).y(serializer, obj);
                return;
            }
        }
        q1 q1Var = cVar.a;
        boolean z = serializer instanceof l40.c;
        if (!z) {
            int iOrdinal = ((q40.a) q1Var.g).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    va.a kind = serializer.getDescriptor().getKind();
                    strI = (kotlin.jvm.internal.m.a(kind, n40.i.c) || kotlin.jvm.internal.m.a(kind, n40.i.f)) ? j.i(serializer.getDescriptor(), cVar) : null;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (((q40.a) q1Var.g) != q40.a.A) {
        }
        if (z) {
            l40.c cVar2 = (l40.c) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + cVar2.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            l40.a aVarJ = va.a.J(cVar2, this, obj);
            if (strI != null) {
                j.e(serializer, aVarJ, strI);
            }
            j.h(aVarJ.getDescriptor().getKind());
            serializer = aVarJ;
        }
        if (strI != null) {
            String strA = serializer.getDescriptor().a();
            this.e = strI;
            this.f = strA;
        }
        serializer.serialize(this, obj);
    }

    @Override
    public final void z(long j) {
        String tag = (String) K();
        kotlin.jvm.internal.m.e(tag, "tag");
        L(tag, q40.m.a(Long.valueOf(j)));
    }
}
