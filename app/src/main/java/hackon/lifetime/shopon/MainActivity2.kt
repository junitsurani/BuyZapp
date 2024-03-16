package hackon.lifetime.shopon;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initialize RecyclerViews
        val mainRecycler = findViewById<RecyclerView>(R.id.main_recycler)
        val mainRecyclerView = findViewById<RecyclerView>(R.id.main_recycler_view)

        // Set layout managers for RecyclerViews
        mainRecycler.layoutManager = LinearLayoutManager(this)
        mainRecyclerView.layoutManager = LinearLayoutManager(this)

        // Set adapters for RecyclerViews (if needed)
        // mainRecycler.adapter = ...
        // mainRecyclerView.adapter = ...
    }
}
