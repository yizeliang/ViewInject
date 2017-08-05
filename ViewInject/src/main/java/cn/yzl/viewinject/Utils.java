package cn.yzl.viewinject;

import android.view.View;

/**
 * Created by YZL on 2017/8/4.
 */
public class Utils {
    public static <T> T getViewById(View parentView, int id) {
        return (T) parentView.findViewById(id);
    }
}
