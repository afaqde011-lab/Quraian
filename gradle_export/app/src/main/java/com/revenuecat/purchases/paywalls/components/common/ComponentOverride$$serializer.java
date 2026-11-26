package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import g00.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.q0;
import p40.x0;
import p40.z;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.$serializer", "T", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "<init>", "()V", "Ll40/a;", "typeSerial0", "(Ll40/a;)V", "", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;)V", "typeParametersSerializers", "getTypeSerial0", "()Ll40/a;", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ComponentOverride$$serializer<T> implements z {
    private final q0 descriptor;
    private final a typeSerial0;

    private ComponentOverride$$serializer() {
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        q0Var.j("conditions", false);
        q0Var.j(DiagnosticsEntry.PROPERTIES_KEY, false);
        this.descriptor = q0Var;
    }

    @c
    public ComponentOverride$$serializer(a typeSerial0) {
        this();
        m.e(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }

    private final a getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override
    public a[] childSerializers() {
        return new a[]{ComponentOverride.$childSerializers[0], this.typeSerial0};
    }

    @Override
    public ComponentOverride<T> deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor = getDescriptor();
        o40.a aVarC = decoder.c(descriptor);
        a[] aVarArr = ComponentOverride.$childSerializers;
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        List list = null;
        PartialComponent partialComponent = null;
        while (z) {
            int iL = aVarC.l(descriptor);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                list = (List) aVarC.s(descriptor, 0, aVarArr[0], list);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                partialComponent = (PartialComponent) aVarC.s(descriptor, 1, this.typeSerial0, partialComponent);
                i |= 2;
            }
        }
        aVarC.a(descriptor);
        return new ComponentOverride<>(i, list, partialComponent, x0Var);
    }

    @Override
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(d encoder, ComponentOverride<T> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor = getDescriptor();
        b bVarC = encoder.c(descriptor);
        ComponentOverride.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor, this.typeSerial0);
        bVarC.a(descriptor);
    }

    @Override
    public a[] typeParametersSerializers() {
        return new a[]{this.typeSerial0};
    }
}
