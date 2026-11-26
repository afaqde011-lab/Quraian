package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import q40.b0;
import q40.j;
import q40.l;
import q40.x;
import r30.q;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "<init>", "()V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;)V", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomVariableDefinitionSerializer implements l40.a {
    public static final CustomVariableDefinitionSerializer INSTANCE = new CustomVariableDefinitionSerializer();
    private static final n40.e descriptor = t1.k("CustomVariableDefinition", new n40.e[0], CustomVariableDefinitionSerializer$descriptor$1.INSTANCE);

    private CustomVariableDefinitionSerializer() {
    }

    @Override
    public UiConfig.CustomVariableDefinition deserialize(o40.c decoder) {
        String strA;
        Object objM0;
        m.e(decoder, "decoder");
        if (!(decoder instanceof j)) {
            throw new IllegalArgumentException("CustomVariableDefinition can only be deserialized from JSON");
        }
        x xVarG = q40.m.g(((j) decoder).m());
        l lVar = (l) xVarG.get("type");
        if (lVar == null || (strA = q40.m.h(lVar).a()) == null) {
            strA = "string";
        }
        Object obj = xVarG.get("default_value");
        Boolean bool = null;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var == null) {
            return new UiConfig.CustomVariableDefinition(strA, "");
        }
        int iHashCode = strA.hashCode();
        if (iHashCode != -1034364087) {
            if (iHashCode != -891985903) {
                if (iHashCode == 64711720 && strA.equals("boolean")) {
                    objM0 = q40.m.d(b0Var);
                    if (objM0 == null) {
                        String strA2 = b0Var.a();
                        m.e(strA2, "<this>");
                        if (strA2.equals("true")) {
                            bool = Boolean.TRUE;
                        } else if (strA2.equals("false")) {
                            bool = Boolean.FALSE;
                        }
                        objM0 = bool == null ? b0Var.a() : bool;
                    }
                } else {
                    objM0 = b0Var.a();
                }
            } else if (strA.equals("string")) {
                objM0 = b0Var.a();
            } else {
                objM0 = b0Var.a();
            }
        } else if (strA.equals("number")) {
            objM0 = q.m0(b0Var.a());
            if (objM0 == null && (objM0 = q.m0(b0Var.a())) == null) {
                objM0 = b0Var.a();
            }
        } else {
            objM0 = b0Var.a();
        }
        return new UiConfig.CustomVariableDefinition(strA, objM0);
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, UiConfig.CustomVariableDefinition value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new IllegalStateException("Serialization of CustomVariableDefinition is not implemented as it is not needed.");
    }
}
