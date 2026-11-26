package ft;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u000b\u0010\u001e¨\u0006!"}, d2 = {"Lft/b;", "", "", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "languageTitle", "b", "g", "languageCode", "c", "code", "d", "i", "title", "e", "author", "f", "fileUrl", "imageUrl", "countryCode", "", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "isDefault", "", "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DiagnosticsEntry.VERSION_KEY, "contentVersion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    @ck.b("language_title")
    private final String languageTitle;

    @ck.b("language_code")
    private final String languageCode;

    @ck.b("code")
    private final String code;

    @ck.b("title")
    private final String title;

    @ck.b("author")
    private final String author;

    @ck.b("file_url")
    private final String fileUrl;

    @ck.b("image_url")
    private final String imageUrl;

    @ck.b("country_code")
    private final String countryCode;

    @ck.b("is_default")
    private final Boolean isDefault;

    @ck.b(DiagnosticsEntry.VERSION_KEY)
    private final Integer version;

    @ck.b("content_version")
    private final Integer contentVersion;

    public final String getAuthor() {
        return this.author;
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getContentVersion() {
        return this.contentVersion;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.languageTitle, bVar.languageTitle) && m.a(this.languageCode, bVar.languageCode) && m.a(this.code, bVar.code) && m.a(this.title, bVar.title) && m.a(this.author, bVar.author) && m.a(this.fileUrl, bVar.fileUrl) && m.a(this.imageUrl, bVar.imageUrl) && m.a(this.countryCode, bVar.countryCode) && m.a(this.isDefault, bVar.isDefault) && m.a(this.version, bVar.version) && m.a(this.contentVersion, bVar.contentVersion);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getLanguageTitle() {
        return this.languageTitle;
    }

    public final int hashCode() {
        String str = this.languageTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.languageCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.author;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fileUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imageUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countryCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contentVersion;
        return iHashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    public final String toString() {
        String str = this.languageTitle;
        String str2 = this.languageCode;
        String str3 = this.code;
        String str4 = this.title;
        String str5 = this.author;
        String str6 = this.fileUrl;
        String str7 = this.imageUrl;
        String str8 = this.countryCode;
        Boolean bool = this.isDefault;
        Integer num = this.version;
        Integer num2 = this.contentVersion;
        StringBuilder sbS = a1.b.s("QuranTranslationApiModel(languageTitle=", str, ", languageCode=", str2, ", code=");
        a1.b.z(sbS, str3, ", title=", str4, ", author=");
        a1.b.z(sbS, str5, ", fileUrl=", str6, ", imageUrl=");
        a1.b.z(sbS, str7, ", countryCode=", str8, ", isDefault=");
        sbS.append(bool);
        sbS.append(", version=");
        sbS.append(num);
        sbS.append(", contentVersion=");
        sbS.append(num2);
        sbS.append(")");
        return sbS.toString();
    }
}
