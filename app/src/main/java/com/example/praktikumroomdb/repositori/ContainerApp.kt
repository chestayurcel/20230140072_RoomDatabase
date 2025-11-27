package com.example.praktikumroomdb.repositori

import android.app.Application
import android.content.Context
import com.example.praktikumroomdb.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao())
    }
}

class AplikasiSiswa : Application() {

}