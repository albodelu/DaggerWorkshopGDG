/**
 * Copyright (C) 2016 Sergi Castillo Open Source Project
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.smassive.daggerworkshopgdg.app.injector.component;

import com.smassive.daggerworkshopgdg.app.injector.module.ApplicationModule;
import com.smassive.daggerworkshopgdg.app.navigation.Navigator;
import com.smassive.daggerworkshopgdg.app.view.activity.BaseActivity;
import com.smassive.daggerworkshopgdg.domain.executor.PostExecutionThread;
import com.smassive.daggerworkshopgdg.domain.executor.ThreadExecutor;
import com.smassive.daggerworkshopgdg.domain.repository.ComicsRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    // where should I inject the dependencies?
    void inject(BaseActivity baseActivity);

    Navigator getNavigator();

    ThreadExecutor getThreadExecutor();

    PostExecutionThread getPostExecutionThread();

    ComicsRepository getComicsRepository();
}
