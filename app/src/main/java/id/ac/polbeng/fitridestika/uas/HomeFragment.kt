package id.ac.polbeng.fitridestika.uas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.fitridestika.uas.databinding.FragmentHomeBinding
import id.ac.polbeng.nurifdayanti.uas.CardAdapter


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using View Binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Access RecyclerView via binding
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Mengambil data wisata dari WisataData
        val dataWisata = WisataData.listDataWisata

        // Set the adapter for the RecyclerView dengan data wisata
        recyclerView.adapter = CardAdapter(dataWisata) { selectedItem ->
            // Kirimkan data wisata ke DetailActivity
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("WISATA", selectedItem)
            startActivity(intent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Clean up binding reference to avoid memory leaks
        _binding = null
    }
}
