package jf;

public abstract class b {

    public static final pe.d f8274a;

    public static final pe.d f8275b;

    public static final pe.d f8276c;

    public static final pe.d f8277d;

    public static final pe.d[] f8278e;

    static {
        pe.d dVar = new pe.d("auth_blockstore", 3L);
        pe.d dVar2 = new pe.d("blockstore_data_transfer", 1L);
        pe.d dVar3 = new pe.d("blockstore_notify_app_restore", 1L);
        pe.d dVar4 = new pe.d("blockstore_store_bytes_with_options", 2L);
        f8274a = dVar4;
        pe.d dVar5 = new pe.d("blockstore_is_end_to_end_encryption_available", 1L);
        pe.d dVar6 = new pe.d("blockstore_enable_cloud_backup", 1L);
        f8275b = dVar6;
        pe.d dVar7 = new pe.d("blockstore_delete_bytes", 2L);
        f8276c = dVar7;
        pe.d dVar8 = new pe.d("blockstore_retrieve_bytes_with_options", 3L);
        f8277d = dVar8;
        f8278e = new pe.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new pe.d("auth_clear_restore_credential", 1L), new pe.d("auth_create_restore_credential", 1L), new pe.d("auth_get_restore_credential", 1L)};
    }
}
