package com.revenuecat.purchases.paywalls.components.common;

import g00.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.o0;
import p40.q0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.Condition.SelectedPackage.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ComponentOverride$Condition$SelectedPackage$$serializer implements z {
    public static final ComponentOverride$Condition$SelectedPackage$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        ComponentOverride$Condition$SelectedPackage$$serializer componentOverride$Condition$SelectedPackage$$serializer = new ComponentOverride$Condition$SelectedPackage$$serializer();
        INSTANCE = componentOverride$Condition$SelectedPackage$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage", componentOverride$Condition$SelectedPackage$$serializer, 2);
        q0Var.j("operator", false);
        q0Var.j("packages", false);
        descriptor = q0Var;
    }

    private ComponentOverride$Condition$SelectedPackage$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = ComponentOverride.Condition.SelectedPackage.$childSerializers;
        return new a[]{aVarArr[0], aVarArr[1]};
    }

    @Override
    public ComponentOverride.Condition.SelectedPackage deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = ComponentOverride.Condition.SelectedPackage.$childSerializers;
        boolean z = true;
        int i = 0;
        ComponentOverride.ArrayOperator arrayOperator = null;
        List list = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                arrayOperator = (ComponentOverride.ArrayOperator) aVarC.s(descriptor2, 0, aVarArr[0], arrayOperator);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                list = (List) aVarC.s(descriptor2, 1, aVarArr[1], list);
                i |= 2;
            }
        }
        aVarC.a(descriptor2);
        return new ComponentOverride.Condition.SelectedPackage(i, arrayOperator, list, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, ComponentOverride.Condition.SelectedPackage value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        ComponentOverride.Condition.SelectedPackage.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
