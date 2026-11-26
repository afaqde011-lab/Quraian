package qd;

import org.json.JSONObject;

public final class l {

    public final int f12902a;

    public final int f12903b;

    public l(JSONObject jSONObject) {
        this.f12902a = jSONObject.getInt("commitmentPaymentsCount");
        this.f12903b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
