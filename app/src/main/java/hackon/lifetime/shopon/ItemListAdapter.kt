<<<<<<< Updated upstream
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
=======
package hackon.lifetime.shopon

import android.content.Intent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.findNavController


class ItemListAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
        val imageView = findViewById<ImageView>(R.id.kit)

        imageView.setOnClickListener {
            // Navigate to the dedicated page when imageView1 is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val imageViewGadget = findViewById<ImageView>(R.id.living)
        imageViewGadget.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }
        val imageViewOffice = findViewById<ImageView>(R.id.office)
        imageViewOffice.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val imageViewElectrical = findViewById<ImageView>(R.id.elect)
        imageViewElectrical.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val imageViewAll = findViewById<TextView>(R.id.all)

        // Set an OnClickListener to the TextView
        imageViewAll.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val imageViewAlll= findViewById<TextView>(R.id.all2)

        // Set an OnClickListener to the TextView
        imageViewAlll.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
>>>>>>> Stashed changes
