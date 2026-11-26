package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import h00.y;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p40.b1;
import p40.e0;
import p40.g0;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 +2\u00020\u0001:\u0005,-+./BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBm\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\b\u0001\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR8\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010 \u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/UiConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "app", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "localizations", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "customVariables", "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Ljava/util/Map;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Ljava/util/Map;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "getApp", "()Lcom/revenuecat/purchases/UiConfig$AppConfig;", "Ljava/util/Map;", "getLocalizations", "()Ljava/util/Map;", "getLocalizations$annotations", "()V", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig", "()Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig$annotations", "getCustomVariables", "getCustomVariables$annotations", "Companion", "$serializer", "AppConfig", "CustomVariableDefinition", "VariableConfig", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UiConfig {
    private final AppConfig app;
    private final Map<String, CustomVariableDefinition> customVariables;
    private final Map<LocaleId, Map<VariableLocalizationKey, String>> localizations;
    private final VariableConfig variableConfig;

    public static final Companion INSTANCE = new Companion(null);
    private static final l40.a[] $childSerializers = {null, null, null, new g0(b1.a, CustomVariableDefinitionSerializer.INSTANCE)};

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001d\u001fB3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBG\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig;", "", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colors", "Lcom/revenuecat/purchases/FontAlias;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "fonts", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/Map;", "getColors", "()Ljava/util/Map;", "getFonts", "Companion", "$serializer", "FontsConfig", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppConfig {
        private final Map<ColorAlias, ColorScheme> colors;
        private final Map<FontAlias, FontsConfig> fonts;

        public static final Companion INSTANCE = new Companion(null);
        private static final l40.a[] $childSerializers = {new g0(ColorAlias$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE), new g0(FontAlias$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return UiConfig$AppConfig$$serializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "android", "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "getAndroid", "()Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "Companion", "$serializer", "FontInfo", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FontsConfig {
            private static final l40.a[] $childSerializers;

            public static final Companion INSTANCE = new Companion(null);
            private final FontInfo android;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final l40.a serializer() {
                    return UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "Companion", "GoogleFonts", "Name", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface FontInfo {

                public static final Companion INSTANCE = Companion.$$INSTANCE;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    static final Companion $$INSTANCE = new Companion();

                    private Companion() {
                    }

                    public final l40.a serializer() {
                        b0 b0Var = a0.a;
                        return new l40.c("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", b0Var.b(FontInfo.class), new a10.d[]{b0Var.b(GoogleFonts.class), b0Var.b(Name.class)}, new l40.a[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class GoogleFonts implements FontInfo {

                    public static final Companion INSTANCE = new Companion(null);
                    private final String value;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public Companion(f fVar) {
                            this();
                        }

                        public final l40.a serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE;
                        }
                    }

                    @g00.c
                    public GoogleFonts(int i, String str, x0 x0Var) {
                        if (1 == (i & 1)) {
                            this.value = str;
                        } else {
                            o0.g(i, 1, UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                    }

                    public GoogleFonts(String value) {
                        m.e(value, "value");
                        this.value = value;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof GoogleFonts) && m.a(this.value, ((GoogleFonts) obj).value);
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return g4.c.k(new StringBuilder("GoogleFonts(value="), this.value, ')');
                    }
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0011\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", "url", "hash", "family", "", "weight", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getUrl", "getHash", "getFamily", "Ljava/lang/Integer;", "getWeight", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Name implements FontInfo {

                    public static final Companion INSTANCE = new Companion(null);
                    private final String family;
                    private final String hash;
                    private final FontStyle style;
                    private final String url;
                    private final String value;
                    private final Integer weight;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public Companion(f fVar) {
                            this();
                        }

                        public final l40.a serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE;
                        }
                    }

                    @g00.c
                    public Name(int i, String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, x0 x0Var) {
                        if (1 != (i & 1)) {
                            o0.g(i, 1, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.value = str;
                        if ((i & 2) == 0) {
                            this.url = null;
                        } else {
                            this.url = str2;
                        }
                        if ((i & 4) == 0) {
                            this.hash = null;
                        } else {
                            this.hash = str3;
                        }
                        if ((i & 8) == 0) {
                            this.family = null;
                        } else {
                            this.family = str4;
                        }
                        if ((i & 16) == 0) {
                            this.weight = null;
                        } else {
                            this.weight = num;
                        }
                        if ((i & 32) == 0) {
                            this.style = null;
                        } else {
                            this.style = fontStyle;
                        }
                    }

                    public Name(String value, String str, String str2, String str3, Integer num, FontStyle fontStyle) {
                        m.e(value, "value");
                        this.value = value;
                        this.url = str;
                        this.hash = str2;
                        this.family = str3;
                        this.weight = num;
                        this.style = fontStyle;
                    }

                    public Name(String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, int i, f fVar) {
                        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : fontStyle);
                    }

                    public static final void write$Self$purchases_defaultsBc8Release(Name self, o40.b output, n40.e serialDesc) {
                        output.i(serialDesc, 0, self.value);
                        if (output.k(serialDesc) || self.url != null) {
                            output.x(serialDesc, 1, b1.a, self.url);
                        }
                        if (output.k(serialDesc) || self.hash != null) {
                            output.x(serialDesc, 2, b1.a, self.hash);
                        }
                        if (output.k(serialDesc) || self.family != null) {
                            output.x(serialDesc, 3, b1.a, self.family);
                        }
                        if (output.k(serialDesc) || self.weight != null) {
                            output.x(serialDesc, 4, e0.a, self.weight);
                        }
                        if (!output.k(serialDesc) && self.style == null) {
                            return;
                        }
                        output.x(serialDesc, 5, FontStyleDeserializer.INSTANCE, self.style);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Name)) {
                            return false;
                        }
                        Name name = (Name) obj;
                        return m.a(this.value, name.value) && m.a(this.url, name.url) && m.a(this.hash, name.hash) && m.a(this.family, name.family) && m.a(this.weight, name.weight) && this.style == name.style;
                    }

                    public final String getFamily() {
                        return this.family;
                    }

                    public final String getHash() {
                        return this.hash;
                    }

                    public final FontStyle getStyle() {
                        return this.style;
                    }

                    public final String getUrl() {
                        return this.url;
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public final Integer getWeight() {
                        return this.weight;
                    }

                    public int hashCode() {
                        int iHashCode = this.value.hashCode() * 31;
                        String str = this.url;
                        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.hash;
                        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.family;
                        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        Integer num = this.weight;
                        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                        FontStyle fontStyle = this.style;
                        return iHashCode5 + (fontStyle != null ? fontStyle.hashCode() : 0);
                    }

                    public String toString() {
                        return "Name(value=" + this.value + ", url=" + this.url + ", hash=" + this.hash + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
                    }
                }
            }

            static {
                b0 b0Var = a0.a;
                $childSerializers = new l40.a[]{new l40.c("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", b0Var.b(FontInfo.class), new a10.d[]{b0Var.b(FontInfo.GoogleFonts.class), b0Var.b(FontInfo.Name.class)}, new l40.a[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0])};
            }

            @g00.c
            public FontsConfig(int i, FontInfo fontInfo, x0 x0Var) {
                if (1 == (i & 1)) {
                    this.android = fontInfo;
                } else {
                    o0.g(i, 1, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public FontsConfig(FontInfo android) {
                m.e(android, "android");
                this.android = android;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FontsConfig) && m.a(this.android, ((FontsConfig) obj).android);
            }

            public final FontInfo getAndroid() {
                return this.android;
            }

            public int hashCode() {
                return this.android.hashCode();
            }

            public String toString() {
                return "FontsConfig(android=" + this.android + ')';
            }
        }

        public AppConfig() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
        }

        @g00.c
        public AppConfig(int i, Map map, Map map2, x0 x0Var) {
            int i2 = i & 1;
            y yVar = y.A;
            if (i2 == 0) {
                this.colors = yVar;
            } else {
                this.colors = map;
            }
            if ((i & 2) == 0) {
                this.fonts = yVar;
            } else {
                this.fonts = map2;
            }
        }

        public AppConfig(Map<ColorAlias, ColorScheme> colors, Map<FontAlias, FontsConfig> fonts) {
            m.e(colors, "colors");
            m.e(fonts, "fonts");
            this.colors = colors;
            this.fonts = fonts;
        }

        public AppConfig(Map map, Map map2, int i, f fVar) {
            int i2 = i & 1;
            y yVar = y.A;
            this(i2 != 0 ? yVar : map, (i & 2) != 0 ? yVar : map2);
        }

        public static final void write$Self$purchases_defaultsBc8Release(AppConfig self, o40.b output, n40.e serialDesc) {
            l40.a[] aVarArr = $childSerializers;
            boolean zK = output.k(serialDesc);
            y yVar = y.A;
            if (zK || !m.a(self.colors, yVar)) {
                output.C(serialDesc, 0, aVarArr[0], self.colors);
            }
            if (!output.k(serialDesc) && m.a(self.fonts, yVar)) {
                return;
            }
            output.C(serialDesc, 1, aVarArr[1], self.fonts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfig)) {
                return false;
            }
            AppConfig appConfig = (AppConfig) obj;
            return m.a(this.colors, appConfig.colors) && m.a(this.fonts, appConfig.fonts);
        }

        public final Map getColors() {
            return this.colors;
        }

        public final Map getFonts() {
            return this.fonts;
        }

        public int hashCode() {
            return this.fonts.hashCode() + (this.colors.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AppConfig(colors=");
            sb.append(this.colors);
            sb.append(", fonts=");
            return w.c.m(sb, this.fonts, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final l40.a serializer() {
            return UiConfig$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "", "type", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "getDefaultValue", "()Ljava/lang/Object;", "getType", "()Ljava/lang/String;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomVariableDefinition {

        public static final Companion INSTANCE = new Companion(null);
        private final Object defaultValue;
        private final String type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return CustomVariableDefinitionSerializer.INSTANCE;
            }
        }

        public CustomVariableDefinition(String type, Object defaultValue) {
            m.e(type, "type");
            m.e(defaultValue, "defaultValue");
            this.type = type;
            this.defaultValue = defaultValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomVariableDefinition)) {
                return false;
            }
            CustomVariableDefinition customVariableDefinition = (CustomVariableDefinition) obj;
            return m.a(this.type, customVariableDefinition.type) && m.a(this.defaultValue, customVariableDefinition.defaultValue);
        }

        public final Object getDefaultValue() {
            return this.defaultValue;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.defaultValue.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "CustomVariableDefinition(type=" + this.type + ", defaultValue=" + this.defaultValue + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB3\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "", "", "", "variableCompatibilityMap", "functionCompatibilityMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/Map;", "getVariableCompatibilityMap", "()Ljava/util/Map;", "getVariableCompatibilityMap$annotations", "()V", "getFunctionCompatibilityMap", "getFunctionCompatibilityMap$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VariableConfig {
        private static final l40.a[] $childSerializers;

        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, String> functionCompatibilityMap;
        private final Map<String, String> variableCompatibilityMap;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return UiConfig$VariableConfig$$serializer.INSTANCE;
            }
        }

        static {
            b1 b1Var = b1.a;
            $childSerializers = new l40.a[]{new g0(b1Var, b1Var), new g0(b1Var, b1Var)};
        }

        public VariableConfig() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
        }

        @g00.c
        public VariableConfig(int i, Map map, Map map2, x0 x0Var) {
            int i2 = i & 1;
            y yVar = y.A;
            if (i2 == 0) {
                this.variableCompatibilityMap = yVar;
            } else {
                this.variableCompatibilityMap = map;
            }
            if ((i & 2) == 0) {
                this.functionCompatibilityMap = yVar;
            } else {
                this.functionCompatibilityMap = map2;
            }
        }

        public VariableConfig(Map<String, String> variableCompatibilityMap, Map<String, String> functionCompatibilityMap) {
            m.e(variableCompatibilityMap, "variableCompatibilityMap");
            m.e(functionCompatibilityMap, "functionCompatibilityMap");
            this.variableCompatibilityMap = variableCompatibilityMap;
            this.functionCompatibilityMap = functionCompatibilityMap;
        }

        public VariableConfig(Map map, Map map2, int i, f fVar) {
            int i2 = i & 1;
            y yVar = y.A;
            this(i2 != 0 ? yVar : map, (i & 2) != 0 ? yVar : map2);
        }

        public static void getFunctionCompatibilityMap$annotations() {
        }

        public static void getVariableCompatibilityMap$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(VariableConfig self, o40.b output, n40.e serialDesc) {
            l40.a[] aVarArr = $childSerializers;
            boolean zK = output.k(serialDesc);
            y yVar = y.A;
            if (zK || !m.a(self.variableCompatibilityMap, yVar)) {
                output.C(serialDesc, 0, aVarArr[0], self.variableCompatibilityMap);
            }
            if (!output.k(serialDesc) && m.a(self.functionCompatibilityMap, yVar)) {
                return;
            }
            output.C(serialDesc, 1, aVarArr[1], self.functionCompatibilityMap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariableConfig)) {
                return false;
            }
            VariableConfig variableConfig = (VariableConfig) obj;
            return m.a(this.variableCompatibilityMap, variableConfig.variableCompatibilityMap) && m.a(this.functionCompatibilityMap, variableConfig.functionCompatibilityMap);
        }

        public final Map getFunctionCompatibilityMap() {
            return this.functionCompatibilityMap;
        }

        public final Map getVariableCompatibilityMap() {
            return this.variableCompatibilityMap;
        }

        public int hashCode() {
            return this.functionCompatibilityMap.hashCode() + (this.variableCompatibilityMap.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VariableConfig(variableCompatibilityMap=");
            sb.append(this.variableCompatibilityMap);
            sb.append(", functionCompatibilityMap=");
            return w.c.m(sb, this.functionCompatibilityMap, ')');
        }
    }

    public UiConfig() {
        this((AppConfig) null, (Map) null, (VariableConfig) null, (Map) null, 15, (f) null);
    }

    @g00.c
    public UiConfig(int i, AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, x0 x0Var) {
        int i2 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.app = (i & 1) == 0 ? new AppConfig((Map) null, (Map) (0 == true ? 1 : 0), i2, (f) (0 == true ? 1 : 0)) : appConfig;
        int i3 = i & 2;
        y yVar = y.A;
        if (i3 == 0) {
            this.localizations = yVar;
        } else {
            this.localizations = map;
        }
        if ((i & 4) == 0) {
            this.variableConfig = new VariableConfig((Map) (objArr3 == true ? 1 : 0), (Map) (objArr2 == true ? 1 : 0), i2, (f) (objArr == true ? 1 : 0));
        } else {
            this.variableConfig = variableConfig;
        }
        if ((i & 8) == 0) {
            this.customVariables = yVar;
        } else {
            this.customVariables = map2;
        }
    }

    public UiConfig(AppConfig app, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> localizations, VariableConfig variableConfig, Map<String, CustomVariableDefinition> customVariables) {
        m.e(app, "app");
        m.e(localizations, "localizations");
        m.e(variableConfig, "variableConfig");
        m.e(customVariables, "customVariables");
        this.app = app;
        this.localizations = localizations;
        this.variableConfig = variableConfig;
        this.customVariables = customVariables;
    }

    public UiConfig(AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, int i, f fVar) {
        int i2 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        appConfig = (i & 1) != 0 ? new AppConfig((Map) null, (Map) (0 == true ? 1 : 0), i2, (f) (0 == true ? 1 : 0)) : appConfig;
        int i3 = i & 2;
        y yVar = y.A;
        this(appConfig, i3 != 0 ? yVar : map, (i & 4) != 0 ? new VariableConfig((Map) (objArr3 == true ? 1 : 0), (Map) (objArr2 == true ? 1 : 0), i2, (f) (objArr == true ? 1 : 0)) : variableConfig, (i & 8) != 0 ? yVar : map2);
    }

    public static void getCustomVariables$annotations() {
    }

    public static void getLocalizations$annotations() {
    }

    public static void getVariableConfig$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(UiConfig self, o40.b output, n40.e serialDesc) {
        l40.a[] aVarArr = $childSerializers;
        int i = 3;
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (output.k(serialDesc) || !m.a(self.app, new AppConfig(map, (Map) (objArr5 == true ? 1 : 0), i, (f) (objArr4 == true ? 1 : 0)))) {
            output.C(serialDesc, 0, UiConfig$AppConfig$$serializer.INSTANCE, self.app);
        }
        boolean zK = output.k(serialDesc);
        y yVar = y.A;
        if (zK || !m.a(self.localizations, yVar)) {
            output.C(serialDesc, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, self.localizations);
        }
        if (output.k(serialDesc) || !m.a(self.variableConfig, new VariableConfig((Map) (objArr3 == true ? 1 : 0), (Map) (objArr2 == true ? 1 : 0), i, (f) (objArr == true ? 1 : 0)))) {
            output.C(serialDesc, 2, UiConfig$VariableConfig$$serializer.INSTANCE, self.variableConfig);
        }
        if (!output.k(serialDesc) && m.a(self.customVariables, yVar)) {
            return;
        }
        output.C(serialDesc, 3, aVarArr[3], self.customVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) obj;
        return m.a(this.app, uiConfig.app) && m.a(this.localizations, uiConfig.localizations) && m.a(this.variableConfig, uiConfig.variableConfig) && m.a(this.customVariables, uiConfig.customVariables);
    }

    public final AppConfig getApp() {
        return this.app;
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final Map getLocalizations() {
        return this.localizations;
    }

    public final VariableConfig getVariableConfig() {
        return this.variableConfig;
    }

    public int hashCode() {
        return this.customVariables.hashCode() + ((this.variableConfig.hashCode() + ((this.localizations.hashCode() + (this.app.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiConfig(app=");
        sb.append(this.app);
        sb.append(", localizations=");
        sb.append(this.localizations);
        sb.append(", variableConfig=");
        sb.append(this.variableConfig);
        sb.append(", customVariables=");
        return w.c.m(sb, this.customVariables, ')');
    }
}
