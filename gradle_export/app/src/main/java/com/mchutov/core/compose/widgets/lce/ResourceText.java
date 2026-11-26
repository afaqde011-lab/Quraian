package com.mchutov.core.compose.widgets.lce;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/mchutov/core/compose/widgets/lce/ResourceText;", "", "String", "Res", "Lcom/mchutov/core/compose/widgets/lce/ResourceText$Res;", "Lcom/mchutov/core/compose/widgets/lce/ResourceText$String;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ResourceText {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/mchutov/core/compose/widgets/lce/ResourceText$Res;", "Lcom/mchutov/core/compose/widgets/lce/ResourceText;", "value", "", "args", "", "", "<init>", "(I[Ljava/lang/Object;)V", "getValue", "()I", "getArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", "other", "hashCode", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Res implements ResourceText {
        public static final int $stable = 0;
        private final Object[] args;
        private final int value;

        public Res(int i, Object... args) {
            m.e(args, "args");
            this.value = i;
            this.args = args;
        }

        public Res(int i, Object[] objArr, int i2, f fVar) {
            this(i, (i2 & 2) != 0 ? new Object[0] : objArr);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Res.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            m.c(other, "null cannot be cast to non-null type com.mchutov.core.compose.widgets.lce.ResourceText.Res");
            Res res = (Res) other;
            return this.value == res.value && Arrays.equals(this.args, res.args);
        }

        public final Object[] getArgs() {
            return this.args;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Arrays.hashCode(this.args) + (this.value * 31);
        }

        public java.lang.String toString() {
            return java.lang.String.valueOf(this.value);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/mchutov/core/compose/widgets/lce/ResourceText$String;", "Lcom/mchutov/core/compose/widgets/lce/ResourceText;", "value", "", "args", "", "", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getValue", "()Ljava/lang/String;", "getArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class String implements ResourceText {
        public static final int $stable = 0;
        private final Object[] args;
        private final java.lang.String value;

        public String(java.lang.String value, Object... args) {
            m.e(value, "value");
            m.e(args, "args");
            this.value = value;
            this.args = args;
        }

        public String(java.lang.String str, Object[] objArr, int i, f fVar) {
            this(str, (i & 2) != 0 ? new Object[0] : objArr);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!String.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            m.c(other, "null cannot be cast to non-null type com.mchutov.core.compose.widgets.lce.ResourceText.String");
            String string = (String) other;
            return m.a(this.value, string.value) && Arrays.equals(this.args, string.args);
        }

        public final Object[] getArgs() {
            return this.args;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Arrays.hashCode(this.args) + (this.value.hashCode() * 31);
        }

        public java.lang.String toString() {
            return this.value;
        }
    }
}
