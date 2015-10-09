package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteChooserDialog;
import android.support.v7.media.MediaRouter;
import android.view.Window;

import com.google.android.libraries.cast.companionlibrary.R;

/**
 * Created by oliverbudiardjo on 10/5/15.
 */
public class VideoMediaRouteChooserDialog extends MediaRouteChooserDialog {

    public VideoMediaRouteChooserDialog(Context context) {
        super(context);
    }

    public VideoMediaRouteChooserDialog(Context context, int theme) {
        super(context, theme);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,
                R.drawable.ic_cast_white_24dp);
    }
}
