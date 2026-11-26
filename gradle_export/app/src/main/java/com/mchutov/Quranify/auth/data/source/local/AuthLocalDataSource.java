package com.mchutov.quranify.auth.data.source.local;

import android.content.SharedPreferences;
import com.mchutov.core.security.Obfuscated;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ep.g;
import ep.h;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r30.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010-\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u00100\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00101\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u00102\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u0010&R\u0014\u00103\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u0010&R\u0014\u00104\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u0010&R\u0014\u00105\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u0010&R\u0014\u00106\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u0010&¨\u00067"}, d2 = {"Lcom/mchutov/quranify/auth/data/source/local/AuthLocalDataSource;", "", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Landroid/content/SharedPreferences$Editor;", "Lg00/b0;", "removeTokenData", "(Landroid/content/SharedPreferences$Editor;)V", "Lep/g;", "tokens", "saveSession", "(Lep/g;)V", "getSession", "()Lep/g;", "", "isAuthorized", "()Z", "cleanTokenData", "()V", "clearSession", "isAuthBannerDismissed", "isDismissed", "setAuthBannerDismissed", "(Z)V", "isHomeAuthBannerDismissed", "setHomeAuthBannerDismissed", "isPremiumDevicesBannerDismissed", "setPremiumDevicesBannerDismissed", "", "getPremiumAuthPromptLastSeenVersion", "()Ljava/lang/String;", DiagnosticsEntry.VERSION_KEY, "setPremiumAuthPromptLastSeenVersion", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "accessTokenKey", "Ljava/lang/String;", "refreshTokenKey", "tokenTypeKey", "expiresInKey", "userIdKey", "userEmailKey", "userEmailVerifiedAtKey", "userProvidersKey", "userUsernameKey", "userSexKey", "userBirthDateKey", "providersSeparator", "userHasDataKey", "authBannerDismissedKey", "homeAuthBannerDismissedKey", "premiumDevicesBannerDismissedKey", "premiumAuthPromptLastSeenVersionKey", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthLocalDataSource {
    public static final int $stable = 8;
    private final String accessTokenKey;
    private final String authBannerDismissedKey;
    private final String expiresInKey;
    private final String homeAuthBannerDismissedKey;
    private final SharedPreferences preferences;
    private final String premiumAuthPromptLastSeenVersionKey;
    private final String premiumDevicesBannerDismissedKey;
    private final String providersSeparator;
    private final String refreshTokenKey;
    private final String tokenTypeKey;
    private final String userBirthDateKey;
    private final String userEmailKey;
    private final String userEmailVerifiedAtKey;
    private final String userHasDataKey;
    private final String userIdKey;
    private final String userProvidersKey;
    private final String userSexKey;
    private final String userUsernameKey;

    public AuthLocalDataSource(SharedPreferences preferences) {
        m.e(preferences, "preferences");
        this.preferences = preferences;
        Obfuscated obfuscated = Obfuscated.INSTANCE;
        this.accessTokenKey = obfuscated.decode("2ec1127d9076c31f429c21ec");
        this.refreshTokenKey = obfuscated.decode("3dc7176a8676f43459982fe7df");
        this.tokenTypeKey = obfuscated.decode("3bcd1a7d8d5ae8125d92");
        this.expiresInKey = obfuscated.decode("2ada01719160ef344499");
        this.userIdKey = obfuscated.decode("3ad1146abc6cf8");
        this.userEmailKey = obfuscated.decode("3ad1146abc60f10a449b");
        this.userEmailVerifiedAtKey = obfuscated.decode("3ad1146abc60f10a449b1bf4d44b09a86e3fcf7eb5e2");
        this.userProvidersKey = obfuscated.decode("3ad1146abc75ee045b9e20e7c34a");
        this.userUsernameKey = obfuscated.decode("3ad1146abc70ef0e5f9925efd4");
        this.userSexKey = obfuscated.decode("3ad1146abc76f913");
        this.userBirthDateKey = obfuscated.decode("3ad1146abc67f519599f1be6d04d05");
        this.providersSeparator = obfuscated.decode("63");
        this.userHasDataKey = "user_has_data";
        this.authBannerDismissedKey = "auth_banner_dismissed";
        this.homeAuthBannerDismissedKey = "auth_banner_dismissed.home";
        this.premiumDevicesBannerDismissedKey = "premium_devices_banner_dismissed";
        this.premiumAuthPromptLastSeenVersionKey = "premium_auth_prompt_last_seen_version";
    }

    private final void removeTokenData(SharedPreferences.Editor editor) {
        editor.remove(this.accessTokenKey);
        editor.remove(this.refreshTokenKey);
        editor.remove(this.tokenTypeKey);
        editor.remove(this.expiresInKey);
    }

    public final void cleanTokenData() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        removeTokenData(editorEdit);
        editorEdit.apply();
    }

    public final void clearSession() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        removeTokenData(editorEdit);
        editorEdit.remove(this.userIdKey);
        editorEdit.remove(this.userEmailKey);
        editorEdit.remove(this.userEmailVerifiedAtKey);
        editorEdit.remove(this.userUsernameKey);
        editorEdit.remove(this.userSexKey);
        editorEdit.remove(this.userBirthDateKey);
        editorEdit.remove(this.userProvidersKey);
        editorEdit.remove(this.userHasDataKey);
        editorEdit.remove("user_purchase_device_name");
        editorEdit.remove("user_purchase_device_city");
        editorEdit.remove("user_purchase_device_country");
        editorEdit.remove("purchase_device_model");
        editorEdit.remove("purchase_device_product_id");
        editorEdit.remove("purchase_device_plan_id");
        editorEdit.apply();
    }

    public final String getPremiumAuthPromptLastSeenVersion() {
        return this.preferences.getString(this.premiumAuthPromptLastSeenVersionKey, null);
    }

    public final g getSession() {
        String string = this.preferences.getString(this.accessTokenKey, "");
        String str = string == null ? "" : string;
        if (str.length() == 0) {
            return null;
        }
        String string2 = this.preferences.getString(this.refreshTokenKey, "");
        String str2 = string2 == null ? "" : string2;
        String string3 = this.preferences.getString(this.tokenTypeKey, "");
        String str3 = string3 == null ? "" : string3;
        int i = this.preferences.getInt(this.expiresInKey, 0);
        String string4 = this.preferences.getString(this.userIdKey, "");
        String str4 = string4 == null ? "" : string4;
        String string5 = this.preferences.getString(this.userEmailKey, "");
        String str5 = string5 == null ? "" : string5;
        String string6 = this.preferences.getString(this.userEmailVerifiedAtKey, "");
        String str6 = string6 == null ? "" : string6;
        String string7 = this.preferences.getString(this.userUsernameKey, "");
        String str7 = string7 == null ? "" : string7;
        String string8 = this.preferences.getString(this.userSexKey, "");
        String str8 = string8 == null ? "" : string8;
        String string9 = this.preferences.getString(this.userBirthDateKey, "");
        String str9 = string9 == null ? "" : string9;
        String string10 = this.preferences.getString(this.userProvidersKey, "");
        List listW0 = k.W0(string10 != null ? string10 : "", new String[]{this.providersSeparator}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (!k.L0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new g(str, str2, str3, i, new h(str4, str5, str6, str7, str8, str9, arrayList, this.preferences.contains(this.userHasDataKey) ? Boolean.valueOf(this.preferences.getBoolean(this.userHasDataKey, false)) : null, 896));
    }

    public final boolean isAuthBannerDismissed() {
        return this.preferences.getBoolean(this.authBannerDismissedKey, false);
    }

    public final boolean isAuthorized() {
        String string = this.preferences.getString(this.accessTokenKey, "");
        return (string != null ? string : "").length() > 0;
    }

    public final boolean isHomeAuthBannerDismissed() {
        return this.preferences.getBoolean(this.homeAuthBannerDismissedKey, false);
    }

    public final boolean isPremiumDevicesBannerDismissed() {
        return this.preferences.getBoolean(this.premiumDevicesBannerDismissedKey, false);
    }

    public final void saveSession(g tokens) {
        m.e(tokens, "tokens");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(this.accessTokenKey, tokens.a);
        editorEdit.putString(this.refreshTokenKey, tokens.b);
        editorEdit.putString(this.tokenTypeKey, tokens.c);
        editorEdit.putInt(this.expiresInKey, tokens.d);
        String str = this.userIdKey;
        h hVar = tokens.e;
        editorEdit.putString(str, hVar.a);
        editorEdit.putString(this.userEmailKey, hVar.b);
        editorEdit.putString(this.userEmailVerifiedAtKey, hVar.c);
        editorEdit.putString(this.userUsernameKey, hVar.d);
        editorEdit.putString(this.userSexKey, hVar.e);
        editorEdit.putString(this.userBirthDateKey, hVar.f);
        editorEdit.putString(this.userProvidersKey, q.R0(hVar.g, this.providersSeparator, null, null, null, 62));
        Boolean bool = hVar.k;
        if (bool == null) {
            editorEdit.remove(this.userHasDataKey);
        } else {
            editorEdit.putBoolean(this.userHasDataKey, bool.booleanValue());
        }
        editorEdit.remove("user_purchase_device_name");
        editorEdit.remove("user_purchase_device_city");
        editorEdit.remove("user_purchase_device_country");
        editorEdit.remove("purchase_device_model");
        editorEdit.remove("purchase_device_product_id");
        editorEdit.remove("purchase_device_plan_id");
        editorEdit.apply();
    }

    public final void setAuthBannerDismissed(boolean isDismissed) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(this.authBannerDismissedKey, isDismissed);
        editorEdit.apply();
    }

    public final void setHomeAuthBannerDismissed(boolean isDismissed) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(this.homeAuthBannerDismissedKey, isDismissed);
        editorEdit.apply();
    }

    public final void setPremiumAuthPromptLastSeenVersion(String version) {
        m.e(version, "version");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(this.premiumAuthPromptLastSeenVersionKey, version);
        editorEdit.apply();
    }

    public final void setPremiumDevicesBannerDismissed(boolean isDismissed) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(this.premiumDevicesBannerDismissedKey, isDismissed);
        editorEdit.apply();
    }
}
