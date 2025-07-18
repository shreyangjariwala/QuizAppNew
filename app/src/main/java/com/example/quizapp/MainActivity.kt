import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()


        auth.currentUser?.let {

            startHomePageActivity()
        } ?: run {

            startSignInActivity()
        }


        setupListeners()
    }

    private fun setupListeners() {
        findViewById<Button>(R.id.btn_logout).setOnClickListener {
            auth.signOut()
            startSignInActivity()
        }
    }

    private fun startHomePageActivity() {
        startActivity(Intent(this, HomePageActivity::class.java))
        finish()
    }

    private fun startSignInActivity() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}
