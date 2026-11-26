package com.revenuecat.purchases.utils.serializers;

import g00.j;
import h00.d0;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.c;
import n40.e;
import o40.d;
import ri.t1;
import u00.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0007\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "", "T", "Ll40/a;", "", "", "valuesByType", "defaultValue", "<init>", "(Ljava/util/Map;Ljava/lang/Enum;)V", "Lkotlin/Function1;", "typeForValue", "(Ljava/lang/Enum;Lu00/k;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/lang/Enum;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/lang/Enum;)V", "Ljava/util/Map;", "Ljava/lang/Enum;", "kotlin.jvm.PlatformType", "enumName", "Ljava/lang/String;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EnumDeserializerWithDefault<T extends Enum<T>> implements a {
    private final T defaultValue;
    private final e descriptor;
    private final String enumName;
    private final Map<String, T> valuesByType;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "value", "invoke", "(Ljava/lang/Enum;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final String invoke(T value) {
            m.e(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    public EnumDeserializerWithDefault(T defaultValue, k typeForValue) {
        m.e(defaultValue, "defaultValue");
        m.e(typeForValue, "typeForValue");
        Object[] enumConstants = defaultValue.getClass().getEnumConstants();
        m.d(enumConstants, "defaultValue::class.java.enumConstants");
        int iP = d0.P(enumConstants.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj : enumConstants) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this(linkedHashMap, defaultValue);
    }

    public EnumDeserializerWithDefault(Enum r1, k kVar, int i, f fVar) {
        this(r1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : kVar);
    }

    public EnumDeserializerWithDefault(Map<String, ? extends T> valuesByType, T defaultValue) {
        m.e(valuesByType, "valuesByType");
        m.e(defaultValue, "defaultValue");
        this.valuesByType = valuesByType;
        this.defaultValue = defaultValue;
        String simpleName = defaultValue.getClass().getSimpleName();
        this.enumName = simpleName;
        this.descriptor = t1.e(simpleName, c.k);
    }

    @Override
    public T deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        T t = this.valuesByType.get(decoder.p());
        return t == null ? this.defaultValue : t;
    }

    @Override
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(d encoder, T value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new j("Serialization is not implemented because it is not needed.");
    }
}
