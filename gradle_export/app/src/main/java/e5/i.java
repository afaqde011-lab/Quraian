package e5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

public interface i {
    ColorStateList getSupportButtonTintList();

    void setSupportButtonTintList(ColorStateList colorStateList);

    void setSupportButtonTintMode(PorterDuff.Mode mode);
}
