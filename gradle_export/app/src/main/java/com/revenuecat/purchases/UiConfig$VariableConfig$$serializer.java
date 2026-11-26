package com.revenuecat.purchases;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.VariableConfig.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/UiConfig$VariableConfig;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@g00.c
public final class UiConfig$VariableConfig$$serializer implements z {
    public static final UiConfig$VariableConfig$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        UiConfig$VariableConfig$$serializer uiConfig$VariableConfig$$serializer = new UiConfig$VariableConfig$$serializer();
        INSTANCE = uiConfig$VariableConfig$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.UiConfig.VariableConfig", uiConfig$VariableConfig$$serializer, 2);
        q0Var.j("variable_compatibility_map", true);
        q0Var.j("function_compatibility_map", true);
        descriptor = q0Var;
    }

    private UiConfig$VariableConfig$$serializer() {
    }

    @Override
    public l40.a[] childSerializers() {
        l40.a[] aVarArr = UiConfig.VariableConfig.$childSerializers;
        return new l40.a[]{aVarArr[0], aVarArr[1]};
    }

    @Override
    public UiConfig.VariableConfig deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        l40.a[] aVarArr = UiConfig.VariableConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        Map map = null;
        Map map2 = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                map = (Map) aVarC.s(descriptor2, 0, aVarArr[0], map);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                map2 = (Map) aVarC.s(descriptor2, 1, aVarArr[1], map2);
                i |= 2;
            }
        }
        aVarC.a(descriptor2);
        return new UiConfig.VariableConfig(i, map, map2, (x0) null);
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, UiConfig.VariableConfig value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        UiConfig.VariableConfig.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
