package com.engineerskasa.crypto

import android.app.Application
import com.engineerskasa.crypto.di.component.DaggerAppComponent
import com.engineerskasa.crypto.di.modules.AppModule
import com.engineerskasa.crypto.di.modules.NetModule
import com.engineerskasa.crypto.utils.Constants
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class CryptoCurre