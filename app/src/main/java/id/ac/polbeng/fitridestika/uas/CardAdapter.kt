package id.ac.polbeng.nurifdayanti.uas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.polbeng.fitridestika.uas.Wisata
import id.ac.polbeng.fitridestika.uas.databinding.ItemCardBinding

class CardAdapter(
    private val data: List<Wisata>, // Ganti dengan model Wisata
    private val onClick: (Wisata) -> Unit // Ganti dengan tipe data Wisata
) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    // Gunakan Binding di ViewHolder
    class ViewHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wisata = data[position] // Ambil data wisata berdasarkan posisi
        with(holder.binding) {
            // Set data dari objek Wisata ke tampilan
            imgItemPhoto.setImageResource(wisata.gambar)
            nama.text = wisata.nama // Nama Wisata
            lokasi.text = wisata.lokasi

            // Mengatur gambar
           // Menggunakan gambar dari resource ID
        }

        holder.itemView.setOnClickListener { onClick(wisata) } // Set klik event
    }


    override fun getItemCount() = data.size // Menampilkan jumlah item
}
