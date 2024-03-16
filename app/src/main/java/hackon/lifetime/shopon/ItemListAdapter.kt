package hackon.lifetime.shopon




import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class ItemListAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
    }
}
