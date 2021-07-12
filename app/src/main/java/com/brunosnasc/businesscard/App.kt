package com.brunosnasc.businesscard

import android.app.Application
import com.brunosnasc.businesscard.data.AppDatabase
import com.brunosnasc.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDataBase(this) }
    val repository by lazy { BusinessCardRepository( database.businessDao()) }
}