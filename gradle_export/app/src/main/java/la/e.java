package la;

import android.security.keystore.KeyGenParameterSpec;

public abstract class e {

    public static final KeyGenParameterSpec f10197a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
