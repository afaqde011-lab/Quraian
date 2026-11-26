package tf;

public enum s1 {
    AD_STORAGE("ad_storage"),
    ANALYTICS_STORAGE("analytics_storage"),
    AD_USER_DATA("ad_user_data"),
    AD_PERSONALIZATION("ad_personalization");

    public final String A;

    s1(String str) {
        this.A = str;
    }
}
