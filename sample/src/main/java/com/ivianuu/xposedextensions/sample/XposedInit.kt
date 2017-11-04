/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.xposedextensions.sample

import android.app.Activity
import android.view.Window
import com.ivianuu.xposedextensions.*
import de.robv.android.xposed.callbacks.XC_LoadPackage
import de.robv.android.xposed.*

typealias ActivityRecord = Any
typealias ActivityStack = Any

/**
 * Xposed init
 */
class XposedInit: IXposedHookLoadPackage {

    private var Window.floating by additionalField<Boolean>("floatingWindow")

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        Activity::class.hook("onCreate") {
            after {
                it.instance<Activity>().window.floating = true
            }
        }

        Activity::class.hook("onDestroy") {
            after {
                it.instance<Activity>().window.floating
            }
        }
    }
}