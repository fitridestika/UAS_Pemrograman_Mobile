package id.ac.polbeng.fitridestika.uas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.fitridestika.uas.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding // Deklarasi binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater) // Menginisialisasi binding
        setContentView(binding.root) // Set content view dengan root dari binding

        // Menerima data wisata dari Intent
        val wisata = intent.getSerializableExtra("WISATA") as Wisata

        // Set data ke tampilan menggunakan binding
        binding.imgItemPhoto.setImageResource(wisata.gambar)
        binding.tvNama.text = wisata.nama
        binding.lokasi.text = wisata.lokasi
        binding.detail.text = wisata.detail
        binding.rating.text = "${wisata.rating} (${wisata.ulasan} Ulasan)"

    }
}
