/*
 * Copyright (C) 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.support.annotation.NonNull;
import android.support.v7.app.MediaRouteDialogFactory;
import android.util.Log;

/**
 * A factory for the MediaRoute Dialog.
 */
public class VideoMediaRouteDialogFactory extends MediaRouteDialogFactory {

    @Override
    public VideoMediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new VideoMediaRouteControllerDialogFragment();
    }

    @Override
    @NonNull
    public CustomMediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        Log.d("CustomizeChooser", "CustomMediaRouteChooserDialogFragment");
        return new CustomMediaRouteChooserDialogFragment();
    }

}
