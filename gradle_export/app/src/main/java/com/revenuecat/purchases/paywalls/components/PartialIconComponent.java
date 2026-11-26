package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.x0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002>=Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b8\u00107R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00109\u0012\u0004\b<\u0010)\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "", "baseUrl", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "iconBackground", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getBaseUrl$annotations", "()V", "getIconName", "getIconName$annotations", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialIconComponent implements PartialComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final String baseUrl;
    private final ColorScheme color;
    private final IconComponent.Formats formats;
    private final IconComponent.IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PartialIconComponent$$serializer.INSTANCE;
        }
    }

    public PartialIconComponent() {
        this((Boolean) null, (String) null, (String) null, (IconComponent.Formats) null, (Size) null, (ColorScheme) null, (Padding) null, (Padding) null, (IconComponent.IconBackground) null, 511, (f) null);
    }

    @c
    public PartialIconComponent(int i, Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground, x0 x0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.baseUrl = null;
        } else {
            this.baseUrl = str;
        }
        if ((i & 4) == 0) {
            this.iconName = null;
        } else {
            this.iconName = str2;
        }
        if ((i & 8) == 0) {
            this.formats = null;
        } else {
            this.formats = formats;
        }
        if ((i & 16) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 32) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i & 64) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 256) == 0) {
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground;
        }
    }

    public PartialIconComponent(Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground) {
        this.visible = bool;
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats;
        this.size = size;
        this.color = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.iconBackground = iconBackground;
    }

    public PartialIconComponent(Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground, int i, f fVar) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : formats, (i & 16) != 0 ? null : size, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? null : padding, (i & 128) != 0 ? null : padding2, (i & 256) != 0 ? null : iconBackground);
    }

    public static void getBaseUrl$annotations() {
    }

    public static void getIconBackground$annotations() {
    }

    public static void getIconName$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PartialIconComponent self, b output, e serialDesc) {
        if (output.k(serialDesc) || !m.a(self.visible, Boolean.TRUE)) {
            output.x(serialDesc, 0, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || self.baseUrl != null) {
            output.x(serialDesc, 1, b1.a, self.baseUrl);
        }
        if (output.k(serialDesc) || self.iconName != null) {
            output.x(serialDesc, 2, b1.a, self.iconName);
        }
        if (output.k(serialDesc) || self.formats != null) {
            output.x(serialDesc, 3, IconComponent$Formats$$serializer.INSTANCE, self.formats);
        }
        if (output.k(serialDesc) || self.size != null) {
            output.x(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || self.color != null) {
            output.x(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.color);
        }
        if (output.k(serialDesc) || self.padding != null) {
            output.x(serialDesc, 6, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || self.margin != null) {
            output.x(serialDesc, 7, Padding$$serializer.INSTANCE, self.margin);
        }
        if (!output.k(serialDesc) && self.iconBackground == null) {
            return;
        }
        output.x(serialDesc, 8, IconComponent$IconBackground$$serializer.INSTANCE, self.iconBackground);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialIconComponent)) {
            return false;
        }
        PartialIconComponent partialIconComponent = (PartialIconComponent) obj;
        return m.a(this.visible, partialIconComponent.visible) && m.a(this.baseUrl, partialIconComponent.baseUrl) && m.a(this.iconName, partialIconComponent.iconName) && m.a(this.formats, partialIconComponent.formats) && m.a(this.size, partialIconComponent.size) && m.a(this.color, partialIconComponent.color) && m.a(this.padding, partialIconComponent.padding) && m.a(this.margin, partialIconComponent.margin) && m.a(this.iconBackground, partialIconComponent.iconBackground);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final ColorScheme getColor() {
        return this.color;
    }

    public final IconComponent.Formats getFormats() {
        return this.formats;
    }

    public final IconComponent.IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.baseUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconComponent.Formats formats = this.formats;
        int iHashCode4 = (iHashCode3 + (formats == null ? 0 : formats.hashCode())) * 31;
        Size size = this.size;
        int iHashCode5 = (iHashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        ColorScheme colorScheme = this.color;
        int iHashCode6 = (iHashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode7 = (iHashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode8 = (iHashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        IconComponent.IconBackground iconBackground = this.iconBackground;
        return iHashCode8 + (iconBackground != null ? iconBackground.hashCode() : 0);
    }

    public String toString() {
        return "PartialIconComponent(visible=" + this.visible + ", baseUrl=" + this.baseUrl + ", iconName=" + this.iconName + ", formats=" + this.formats + ", size=" + this.size + ", color=" + this.color + ", padding=" + this.padding + ", margin=" + this.margin + ", iconBackground=" + this.iconBackground + ')';
    }
}
