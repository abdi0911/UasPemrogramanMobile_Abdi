package com.example.uaspemrogramanmobile_abdi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.uaspemrogramanmobile_abdi.Data.KabKota
import com.example.uaspemrogramanmobile_abdi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan data dari intent
        val kabKota = intent.getParcelableExtra<KabKota>("EXTRA_KABKOTA")

        // Menampilkan data pada layout
        kabKota?.let {
            Glide.with(this)
                .load(it.gambar)
                .into(binding.imgDetailPhoto)

            binding.tvDetailName.text = it.nama
            binding.tvDetailPusatPemerintahan.text = "Lokasi: ${it.lokasi}"
            binding.tvDetailBupatiWalikota.text = "Detail: ${it.detail}"
            binding.tvDetailLuasWilayah.text = "Rating: ${it.rating} "
            binding.tvDetailJumlahPenduduk.text = "Ulasan: ${it.ulasan}"
//            binding.tvDetailJumlahKecamatan.text = "Gambar: ${it.jumlah_kecamatan}"
//            binding.tvDetailJumlahKelurahan.text = "Jumlah Kelurahan: ${it.jumlah_kelurahan}"
//            binding.tvDetailJumlahDesa.text = "Jumlah Desa: ${it.jumlah_desa}"
//            binding.tvDetailUrlPeta.text = "URL Peta Wilayah: ${it.url_peta_wilayah}"
//            binding.tvDetailDeskripsi.text = it.deskripsi
        }
    }
}