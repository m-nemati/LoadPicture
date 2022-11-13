package ir.mnemati.loadpicture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import ir.mnemati.loadpicture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLoad.setOnClickListener {
            Picasso.get()
                .load("https://i.imgur.com/DvpvklR.png")
                .placeholder(R.drawable.holder)
                .error(R.drawable.error)
                .into(binding.imgPic)

        }

        binding.btnGlide.setOnClickListener {
            Glide.with(this)
                .load("https://i.imgur.com/DvpvklR.png")
                .into(binding.imgPic);
        }

    }
}