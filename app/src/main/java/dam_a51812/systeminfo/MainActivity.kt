package dam_a51812.systeminfo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvSystemInfo = findViewById<TextView>(R.id.tvSystemInfo)

        val info = """
            Manufacturer: ${android.os.Build.MANUFACTURER}
            Model: ${android.os.Build.MODEL}
            Brand: ${android.os.Build.BRAND}
            Type: ${android.os.Build.TYPE}
            User: ${android.os.Build.USER}
            Base: ${android.os.Build.VERSION_CODES.BASE}
            Incremental: ${android.os.Build.VERSION.INCREMENTAL}
            SDK: ${android.os.Build.VERSION.SDK_INT}
            Version Code: ${android.os.Build.VERSION.RELEASE}
            Display: ${android.os.Build.DISPLAY}
        """.trimIndent()

        tvSystemInfo.text = info

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}