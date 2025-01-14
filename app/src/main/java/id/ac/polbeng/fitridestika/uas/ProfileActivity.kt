package id.ac.polbeng.fitridestika.uas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.fitridestika.uas.R
import id.ac.polbeng.fitridestika.uas.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    // Declare the binding variable
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using View Binding
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set data for profile
        val name = "Fitri Destika"
        val placeOfBirth = "Pedas"
        val dateOfBirth = "22 Desember 2003"
        val address = "Jl.Pusara"
        val phone = "085755315023"
        val email = "fitridestika@gmail.com"
        val kelas = "5C"
        val prodi = "Rekayasa Perangkat Lunak"
        val jurusan = "Teknik Informatika"

        // Set values to TextViews using View Binding
        binding.profileName.text = name
        binding.profilePlaceOfBirth.text = "Tempat Lahir: $placeOfBirth"
        binding.profileDob.text = "Tanggal Lahir: $dateOfBirth"
        binding.profileAddress.text = "Alamat: $address"
        binding.profilePhone.text = "Telepon: $phone"
        binding.profileEmail.text = "Email: $email"
        binding.Kelas.text = "Kelas: $kelas"
        binding.prodi.text = "Prodi: $prodi"
        binding.jurusan.text = "Jurusan: $jurusan"

        // Optionally, set image resource (replace with a valid drawable)
        binding.profileImage.setImageResource(R.drawable.fitri) // Replace with your actual image resource
    }
}
