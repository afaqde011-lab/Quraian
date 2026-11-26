package com.revenuecat.purchases.utils.serializers;

import com.google.android.gms.internal.measurement.x5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import q40.b0;
import q40.j;
import q40.l;
import q40.x;
import ri.t1;
import u00.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "", "T", "Ll40/a;", "", "serialName", "", "Lkotlin/Function0;", "serializerByType", "Lkotlin/Function1;", "defaultValue", "typeDiscriminator", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lu00/k;Ljava/lang/String;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/lang/Object;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/lang/Object;)V", "Ljava/lang/String;", "Ljava/util/Map;", "Lu00/k;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SealedDeserializerWithDefault<T> implements a {
    private final k defaultValue;
    private final e descriptor;
    private final String serialName;
    private final Map<String, u00.a> serializerByType;
    private final String typeDiscriminator;

    public SealedDeserializerWithDefault(String serialName, Map<String, ? extends u00.a> serializerByType, k defaultValue, String typeDiscriminator) {
        m.e(serialName, "serialName");
        m.e(serializerByType, "serializerByType");
        m.e(defaultValue, "defaultValue");
        m.e(typeDiscriminator, "typeDiscriminator");
        this.serialName = serialName;
        this.serializerByType = serializerByType;
        this.defaultValue = defaultValue;
        this.typeDiscriminator = typeDiscriminator;
        this.descriptor = t1.k(serialName, new e[0], new SealedDeserializerWithDefault$descriptor$1(this));
    }

    public SealedDeserializerWithDefault(String str, Map map, k kVar, String str2, int i, f fVar) {
        this(str, map, kVar, (i & 8) != 0 ? "type" : str2);
    }

    @Override
    public T deserialize(c decoder) {
        u00.a aVar;
        m.e(decoder, "decoder");
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            StringBuilder sb = new StringBuilder("Can only deserialize ");
            sb.append(this.serialName);
            sb.append(" from JSON, got: ");
            throw new SerializationException(x5.p(a0.a, decoder.getClass(), sb));
        }
        l lVarM = jVar.m();
        x xVar = lVarM instanceof x ? (x) lVarM : null;
        if (xVar == null) {
            return (T) this.defaultValue.invoke("null");
        }
        Object obj = xVar.get(this.typeDiscriminator);
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        String strA = b0Var != null ? b0Var.a() : null;
        if (strA == null || (aVar = this.serializerByType.get(strA)) == null) {
            return (T) this.defaultValue.invoke(strA != null ? strA : "null");
        }
        try {
            return (T) jVar.y().a((a) aVar.invoke(), xVar);
        } catch (Exception unused) {
            return (T) this.defaultValue.invoke(strA);
        }
    }

    @Override
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(d encoder, T value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new g00.j("Serialization is not implemented because it is not needed.");
    }
}
