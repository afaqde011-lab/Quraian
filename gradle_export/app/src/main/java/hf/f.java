package hf;

public abstract class f {

    public static final pe.d f7051a;

    public static final pe.d f7052b;

    public static final pe.d[] f7053c;

    static {
        pe.d dVar = new pe.d("auth_api_credentials_begin_sign_in", 9L);
        pe.d dVar2 = new pe.d("auth_api_credentials_sign_out", 2L);
        pe.d dVar3 = new pe.d("auth_api_credentials_authorize", 1L);
        pe.d dVar4 = new pe.d("auth_api_credentials_revoke_access", 1L);
        pe.d dVar5 = new pe.d("auth_api_credentials_save_password", 4L);
        f7051a = dVar5;
        pe.d dVar6 = new pe.d("auth_api_credentials_get_sign_in_intent", 6L);
        f7052b = dVar6;
        f7053c = new pe.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, new pe.d("auth_api_credentials_save_account_linking_token", 3L), new pe.d("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
