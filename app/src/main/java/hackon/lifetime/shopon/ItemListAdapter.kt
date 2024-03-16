package hackon.lifetime.shopon

import android.content.Intent

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.fragments.ListFragment
import hackon.lifetime.shopon.models.Product

class ItemListAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
        val imageView = findViewById<ImageView>(R.id.appliances)

        imageView.setOnClickListener {
            // Navigate to the dedicated page when imageView1 is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
