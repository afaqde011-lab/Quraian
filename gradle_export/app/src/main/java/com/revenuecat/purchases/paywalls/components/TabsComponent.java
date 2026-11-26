package com.revenuecat.purchases.paywalls.components;

import a10.d;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import g00.c;
import h00.x;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.b1;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 S2\u00020\u0001:\u0004TSUVB¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0015¢\u0006\u0004\b\u001d\u0010\u001eB³\u0001\b\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u00105R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010N\u0012\u0004\bQ\u0010;\u001a\u0004\bO\u0010PR#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bR\u0010M¨\u0006W"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "control", "", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "tabs", "", "defaultTabId", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "overrides", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "getControl", "()Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Ljava/lang/String;", "getDefaultTabId", "()Ljava/lang/String;", "getDefaultTabId$annotations", "getOverrides", "Companion", "$serializer", "Tab", "TabControl", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabsComponent implements PaywallComponent {
    private static final a[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final TabControl control;
    private final String defaultTabId;
    private final Padding margin;
    private final List<ComponentOverride<PartialTabsComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final List<Tab> tabs;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TabsComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "", "", DiagnosticsEntry.ID_KEY, "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Tab {

        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final StackComponent stack;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return TabsComponent$Tab$$serializer.INSTANCE;
            }
        }

        @c
        public Tab(int i, String str, StackComponent stackComponent, x0 x0Var) {
            if (3 != (i & 3)) {
                o0.g(i, 3, TabsComponent$Tab$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.stack = stackComponent;
        }

        public Tab(String id, StackComponent stack) {
            m.e(id, "id");
            m.e(stack, "stack");
            this.id = id;
            this.stack = stack;
        }

        public static final void write$Self$purchases_defaultsBc8Release(Tab self, b output, e serialDesc) {
            output.i(serialDesc, 0, self.id);
            output.C(serialDesc, 1, StackComponent$$serializer.INSTANCE, self.stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return m.a(this.id, tab.id) && m.a(this.stack, tab.stack);
        }

        public final String getId() {
            return this.id;
        }

        public final StackComponent getStack() {
            return this.stack;
        }

        public int hashCode() {
            return this.stack.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "Tab(id=" + this.id + ", stack=" + this.stack + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "", "Buttons", "Companion", "Toggle", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TabControl {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Buttons implements TabControl {

            public static final Companion INSTANCE = new Companion(null);
            private final StackComponent stack;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return TabsComponent$TabControl$Buttons$$serializer.INSTANCE;
                }
            }

            @c
            public Buttons(int i, StackComponent stackComponent, x0 x0Var) {
                if (1 == (i & 1)) {
                    this.stack = stackComponent;
                } else {
                    o0.g(i, 1, TabsComponent$TabControl$Buttons$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public Buttons(StackComponent stack) {
                m.e(stack, "stack");
                this.stack = stack;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Buttons) && m.a(this.stack, ((Buttons) obj).stack);
            }

            public final StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Buttons(stack=" + this.stack + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                b0 b0Var = a0.a;
                return new l40.c("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", b0Var.b(TabControl.class), new d[]{b0Var.b(Buttons.class), b0Var.b(Toggle.class)}, new a[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Toggle implements TabControl {

            public static final Companion INSTANCE = new Companion(null);
            private final StackComponent stack;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return TabsComponent$TabControl$Toggle$$serializer.INSTANCE;
                }
            }

            @c
            public Toggle(int i, StackComponent stackComponent, x0 x0Var) {
                if (1 == (i & 1)) {
                    this.stack = stackComponent;
                } else {
                    o0.g(i, 1, TabsComponent$TabControl$Toggle$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public Toggle(StackComponent stack) {
                m.e(stack, "stack");
                this.stack = stack;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Toggle) && m.a(this.stack, ((Toggle) obj).stack);
            }

            public final StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Toggle(stack=" + this.stack + ')';
            }
        }
    }

    static {
        b0 b0Var = a0.a;
        $childSerializers = new a[]{null, null, null, null, null, null, null, null, null, new l40.c("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", b0Var.b(TabControl.class), new d[]{b0Var.b(TabControl.Buttons.class), b0Var.b(TabControl.Toggle.class)}, new a[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]), new p40.c(TabsComponent$Tab$$serializer.INSTANCE), null, new p40.c(ComponentOverride.INSTANCE.serializer(PartialTabsComponent$$serializer.INSTANCE))};
    }

    @c
    public TabsComponent(int i, Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, x0 x0Var) {
        if (1536 != (i & 1536)) {
            o0.g(i, 1536, TabsComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 2) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 4) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 8) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 32) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i & 64) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 128) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 256) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        this.control = tabControl;
        this.tabs = list;
        if ((i & 2048) == 0) {
            this.defaultTabId = null;
        } else {
            this.defaultTabId = str;
        }
        this.overrides = (i & 4096) == 0 ? x.A : list2;
    }

    public TabsComponent(Boolean bool, Size size, Padding padding, Padding margin, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl control, List<Tab> tabs, String str, List<ComponentOverride<PartialTabsComponent>> overrides) {
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(control, "control");
        m.e(tabs, "tabs");
        m.e(overrides, "overrides");
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.control = control;
        this.tabs = tabs;
        this.defaultTabId = str;
        this.overrides = overrides;
    }

    public TabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, int i, f fVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 4) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 8) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : background, (i & 64) != 0 ? null : shape, (i & 128) != 0 ? null : border, (i & 256) != 0 ? null : shadow, tabControl, list, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? x.A : list2);
    }

    public static void getBackgroundColor$annotations() {
    }

    public static void getDefaultTabId$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(TabsComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 0, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.C(serialDesc, 1, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.k(serialDesc) || self.backgroundColor != null) {
            output.x(serialDesc, 4, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.k(serialDesc) || self.background != null) {
            output.x(serialDesc, 5, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.k(serialDesc) || self.shape != null) {
            output.x(serialDesc, 6, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.k(serialDesc) || self.border != null) {
            output.x(serialDesc, 7, Border$$serializer.INSTANCE, self.border);
        }
        if (output.k(serialDesc) || self.shadow != null) {
            output.x(serialDesc, 8, Shadow$$serializer.INSTANCE, self.shadow);
        }
        output.C(serialDesc, 9, aVarArr[9], self.control);
        output.C(serialDesc, 10, aVarArr[10], self.tabs);
        if (output.k(serialDesc) || self.defaultTabId != null) {
            output.x(serialDesc, 11, b1.a, self.defaultTabId);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 12, aVarArr[12], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsComponent)) {
            return false;
        }
        TabsComponent tabsComponent = (TabsComponent) obj;
        return m.a(this.visible, tabsComponent.visible) && m.a(this.size, tabsComponent.size) && m.a(this.padding, tabsComponent.padding) && m.a(this.margin, tabsComponent.margin) && m.a(this.backgroundColor, tabsComponent.backgroundColor) && m.a(this.background, tabsComponent.background) && m.a(this.shape, tabsComponent.shape) && m.a(this.border, tabsComponent.border) && m.a(this.shadow, tabsComponent.shadow) && m.a(this.control, tabsComponent.control) && m.a(this.tabs, tabsComponent.tabs) && m.a(this.defaultTabId, tabsComponent.defaultTabId) && m.a(this.overrides, tabsComponent.overrides);
    }

    public final Background getBackground() {
        return this.background;
    }

    public final ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final TabControl getControl() {
        return this.control;
    }

    public final String getDefaultTabId() {
        return this.defaultTabId;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final Size getSize() {
        return this.size;
    }

    public final List getTabs() {
        return this.tabs;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (this.margin.hashCode() + ((this.padding.hashCode() + ((this.size.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31)) * 31)) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode3 = (iHashCode2 + (background == null ? 0 : background.hashCode())) * 31;
        Shape shape = this.shape;
        int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iA = g4.c.a((this.control.hashCode() + ((iHashCode5 + (shadow == null ? 0 : shadow.hashCode())) * 31)) * 31, 31, this.tabs);
        String str = this.defaultTabId;
        return this.overrides.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TabsComponent(visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", control=");
        sb.append(this.control);
        sb.append(", tabs=");
        sb.append(this.tabs);
        sb.append(", defaultTabId=");
        sb.append(this.defaultTabId);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
