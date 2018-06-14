/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.direct2guests.d2gchallenge;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.JsonReader;

import com.android.volley.VolleyError;
import com.direct2guests.d2gchallenge.nonActivities.NetworkConnection;

import com.direct2guests.d2gchallenge.nonActivities.VolleyCallback;
import com.direct2guests.d2gchallenge.utils.ApiDataParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.logging.StreamHandler;

/*
 * MainActivity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }






}
