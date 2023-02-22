package mx.edu.itson.practica4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button = findViewById(R.id.btnantojitos) as Button
        var btnEspecialidades:Button = findViewById(R.id.btnEspecialidades) as Button
        var btnCombinations: Button = findViewById(R.id.btnCombinations) as Button
        var btnTortas:Button = findViewById(R.id.btnTortas) as Button
        var btnSopas:Button = findViewById(R.id.btnSopas) as Button
        var btnBebidas:Button = findViewById(R.id.btnDrinks) as Button


        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }

        btnCombinations.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }

        btnBebidas.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Bebidas")
            startActivity(intent)
        }
    }
}