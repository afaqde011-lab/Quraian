package uo;

import a10.h0;
import ep.s;
import vo.z;

public final class g extends h0 {
    public static s X(z zVar) {
        String signupToken = zVar != null ? zVar.getSignupToken() : null;
        String stage = zVar != null ? zVar.getStage() : null;
        if (stage == null) {
            stage = "";
        }
        return new s(signupToken, stage, zVar != null ? zVar.getSignupExpiresIn() : null, zVar != null ? zVar.getResendIn() : null);
    }
}
