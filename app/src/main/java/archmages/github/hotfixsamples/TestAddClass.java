package archmages.github.hotfixsamples;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by liuzhenhui on 16/9/3.
 */
public class TestAddClass {
    public static final String TAG = TestAddClass.class.getSimpleName();

    public View getNewView(int imageId, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(context.getResources().getDrawable(imageId));
        return imageView;
    }
}
