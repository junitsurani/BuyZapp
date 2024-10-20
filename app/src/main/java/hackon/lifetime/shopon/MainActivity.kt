<<<<<<< Updated upstream
package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

val products = mutableListOf(
    Product(
        1, "Wooden Chair", "3,999", R.drawable.wooden_chair,
        "100+ Bought in the last month",
        "Acacia Wood and Natural Cane Weaving",
        4.5f, "1,210",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/chair.glb?alt=media&token=e32cf525-ee71-4490-a38e-0c42f49be3b2"
    ),
    Product(
        2, "Canteen Table", "3,500", R.drawable.table,
        "1k+ Bought in the last month",
        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    Product(
        3, "Pedestal Fan", "1,200", R.drawable.pedestal_fan,
        "200 Bought in the last month",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/coolerfan(without-defense).glb?alt=media&token=9ec989b7-82da-4892-b2b6-926fa7dd3f92"
    ),
    Product(
        4, "Mobile Tripod", "500", R.drawable.tripod_image,
        "400 Bought in the last month",
        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
        4f, "14,396",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Tripod%20Grip.glb?alt=media&token=c8c8650f-8980-4848-ba46-130b7d90cc83"
    ),
    Product(
        5, "Office Chair", "7,880", R.drawable.office_chair,
        "215 Bought in the last month",
        "Chair with lumbar support and pneumatic gas lift for height adjustment and 360 degree swivel.",
        4.5f, "257",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/chair.glb?alt=media&token=ca3b84fa-e8b2-4c85-bff1-1b0b63272c1e"
    ),
    Product(
        6, "Bar Chair", "5,500", R.drawable.bar_chair,
        "1k+ Bought in the last month",
        "Stable And Sturdy Bar chair - With a built-in 360 degree swivel. High density foam upholstered in leatherette.",
        4f, "1,664",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/bar_chair.glb?alt=media&token=f17deee7-1bff-4ff0-86ea-9542f68146cb"
    ),
    Product(
        7, "Park Bench", "9,500", R.drawable.park_bench_photo,
        "100+ Bought in the last month",
        "The large garden bench seat pad offers the perfect mix of appearance and functionality",
        3.5f, "578",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/park_bench.glb?alt=media&token=8afb7436-7dc2-411e-9b9a-3583c076fc8f"
    ),
    Product(
        8, "Microwave Oven", "8,000", R.drawable.oven_photo,
        "1k+ Bought in the last month",
        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
        4.5f, "734",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/oven.glb?alt=media&token=116d796f-9619-45c2-b170-9704520c7582"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
=======
package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

val products = mutableListOf(
   Product(
        1, "Chair ", "1,999", R.drawable.img_17,
        "100+ Bought recently",
        " Stylish and durable black chair with ergonomic design for ultimate comfort.",
        4f, "895",
        "https://drive.google.com/uc?export=download&id=1np9qz1m8kRAGo8rQRNyvO0gXFNK6kK3r"
    ),
    Product(
        2, "LED TV", "900", R.drawable.img_16,
        "1k+ Bought Recently",
        "Experience stunning visuals with our LED TV, featuring a crystal-clear display and vibrant colors that bring every scene to life. With a sleek, modern design, this TV seamlessly fits into any living space. Equipped with advanced technology, it delivers sharp images, smooth motion, and rich sound, making it perfect for movies, gaming, and streaming",
        4f, "895",
        "https://drive.google.com/uc?export=download&id=1hyND3t8AGUesaZIPwZ1oegtbgX_0Zue-"
    ),
    Product(
        3, "Gas Stove", "3200", R.drawable.img_9,
        "200 Bought Recently",
        "Cook with confidence using our advanced gas stove, designed for efficiency and precision. Featuring multiple burners with adjustable heat settings, this stove provides even heat distribution for consistent cooking results.",
        3.5f, "4,752",
        "https://drive.google.com/uc?export=download&id=14pROuxAYvHyXNjOmNHAkm36JDSxYtN2R"
    ),
    Product(
        4, "Glass Bowl", "500", R.drawable.img_7,
        "400 Bought Recently",
        "This elegant glass bowl combines functionality with style, perfect for serving, mixing, or storing. Crafted from high-quality, durable glass, it is resistant to heat and stains, making it versatile for both hot and cold dishes. Its sleek, transparent design allows you to easily view contents and adds a touch of sophistication to your table setting.",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=1vzNiyk84N7sXWjEGzzj3oaLygn6jS-02"
    ),
    Product(
        5, "Macbook", "67,999", R.drawable.img_12,
        "900 Bought Recently",
        "Power through tasks with our high-performance laptop, designed for both productivity and entertainment. Featuring a sleek, lightweight design, it offers a high-resolution display for crisp visuals and vibrant colors. Equipped with a fast processor and ample storage, this laptop ensures smooth multitasking and efficient performance, whether you're working, streaming, or gaming. ",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=1yYZby7nam-mN-Zv5rJ_ABah3-3CNxO-k"
    ),

    Product(
        6, "Outdoor Couch", "900", R.drawable.img_14,
        "400 Bought Recently",
        "Transform your outdoor space into a stylish retreat with this comfortable and durable outdoor couch. Featuring a weather-resistant frame and plush cushions, it’s designed to withstand the elements while providing luxurious comfort.",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=1-vgxZtyU_iydLHANq32WcoRkyVPLKDrD"
    ),
    Product(
        7, "Clock", "340", R.drawable.clock,
        "1K+ Bought Recently",
        "Add a touch of sophistication to your space with this elegantly designed clock. Featuring a sleek, contemporary face and precise timekeeping mechanism, it ensures accurate and stylish time display. The clear, easy-to-read numbers and minimalist design make it a perfect addition to any room, from modern offices to cozy living spaces.",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=1ofp8T3VW1lSl2DKODdKVj5GC7Go0WqEb"
    ),
    Product(
        8, "Washing Machine", "15,000", R.drawable.washing,
        "1k+ Bought Recently",
        "Revolutionize your laundry routine with this high-efficiency washing machine, designed for optimal performance and convenience. With a spacious drum capacity, it accommodates large loads, reducing the need for multiple cycles. ",
        4f, "895",
        "https://drive.google.com/uc?export=download&id=1FiVXF7gSSAEZ0VfM37-MirUE4t_QZLd2"
    ),
    Product(
        9, "Microwave Ove", "21,000", R.drawable.oven_photo,
        "200 Bought Recently",
        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/oven.glb?alt=media&token=116d796f-9619-45c2-b170-9704520c7582"
    ),
    Product(
        10, "Wall Hanging", "16,000", R.drawable.img_15,
        "400 Bought Recently",
        "Cool Wall Hanging",
        4f, "14,396",
        "https://drive.google.com/uc?export=download&id=16DdpU1BiW7pyu6PgmigGxYjxtZ_7HnFd"
    ),
    Product(
        11, "Wooden Chair", "3,999", R.drawable.woodenchair,
        "100+ Bought Recently",
        "Elevate your seating experience with this beautifully crafted wooden chair, designed to combine classic elegance with lasting durability. Made from high-quality acacia wood, it features a natural finish that highlights the unique grain patterns and adds a touch of sophistication to any room. The ergonomic design ensures comfortable seating, making it ideal for dining, reading, or relaxing. ",
        4.5f, "1,210",
        "https://drive.google.com/uc?export=download&id=1aYpJpvXycby0_z2mA10u1hKxmxflZpV6"
    ),
    Product(
        12, "Office Table", "3,500", R.drawable.officetable,
        "1k+ Bought Recently",
        "Enhance your workspace with this stylish and functional office table, crafted for both form and function. Featuring a sleek oak wood finish with a rich woodgrain texture, it offers a spacious surface for your computer, documents, and office essentials.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    Product(
        13, "Coffee Machine", "9,200", R.drawable.img_13,
        "200 Bought Recently",
        "Start your day with the perfect brew using this advanced coffee machine, designed to deliver rich, aromatic coffee with ease. Featuring programmable settings, you can customize brew strength and start times to suit your preferences. Its user-friendly interface and quick brewing technology ensure that you get a fresh cup of coffee in minutes.",
        3.5f, "4,752",
        "https://drive.google.com/uc?export=download&id=1-5F-0B-UCJhSoqpeoqGPNYmsPavOJaOF"
    ),
    Product(
        14, "Photo Frame", "500", R.drawable.frame,
        "200 Bought Recently",
        "Showcase your cherished memories with this elegant photo frame, crafted to highlight and protect your favorite photographs. Made from high-quality materials with a sleek finish, it adds a touch of sophistication to any room. The versatile design allows for easy insertion of photos and accommodates various sizes, making it perfect for displaying family portraits, travel snapshots, or artistic prints.",
        3.5f, "4,752",
        "https://drive.google.com/uc?export=download&id=1EaNPNo7SVXuaetU8xhQGgDqD-DpZTeRo"
    ),

    )

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
>>>>>>> Stashed changes
