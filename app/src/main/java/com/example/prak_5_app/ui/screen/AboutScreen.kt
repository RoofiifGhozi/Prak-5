package com.example.prak_5_app.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen(onBack: () -> Unit) {
    ScreenLayout(
        title = "Tentang aplikasi",
        description = "Informasi singkat tentang aplikasi."
    ) {
        ElevatedCard(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Navigasi", style = MaterialTheme.typography.titleMedium)
                Text(
                    "Aplikasi ini memiliki halaman Beranda, Detail Mahasiswa, Profil, dan Tentang. Semua halaman dibuka dalam aplikasi yang sama.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        Button(onClick = onBack, modifier = Modifier.fillMaxWidth()) {
            Text("Kembali")
        }
    }
}
