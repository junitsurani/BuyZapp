package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

val livingproducts = mutableListOf(
    Product(
        1, "Copper", "1,999", R.drawable.table,
        "100+ Bought in the last month",
        " Fast and efficient cooking for tender, flavorful meals..",
        4f, "895",
        "https://drive.google.com/uc?export=download&id=1aYpJpvXycby0_z2mA10u1hKxmxflZpV6"
    ),
    Product(
        2, "Pressure Cooker", "2,500", R.drawable.table,
        "1k+ Bought in the last month",
        " Fast and efficient cooking for tender, flavorful meals..",
        4f, "895",
        "https://drive.google.com/uc?export=download&id=1nlBK_s7tS_eL5q-3lDd-pUX-Ea5ewNZT"
    ),
    Product(
        3, "Gas Stove", "1,200", R.drawable.pedestal_fan,
        "200 Bought in the last month",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752",
        "https://drive.google.com/uc?export=download&id=14pROuxAYvHyXNjOmNHAkm36JDSxYtN2R"
    ),
    Product(
        4, "Glass Bowl", "500", R.drawable.tripod_image,
        "400 Bought in the last month",
        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=1vzNiyk84N7sXWjEGzzj3oaLygn6jS"
    ),

    )

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}