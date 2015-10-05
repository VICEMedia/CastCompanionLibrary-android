package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteChooserDialog;
import android.support.v7.app.MediaRouteChooserDialogFragment;
import android.util.Log;

/**
 * Created by oliverbudiardjo on 10/1/15.
 */
public class VideoMediaRouteChooserDialogFragment extends MediaRouteChooserDialogFragment {

    @Override
    public MediaRouteChooserDialog onCreateChooserDialog(
            Context context, Bundle savedInstanceState) {
        Log.d("CustomizeChooser", "MediaRouteChooserDialog set Theme");
        context.setTheme(android.R.style.Theme_Material);
        return new MediaRouteChooserDialog(context);
    }
}
