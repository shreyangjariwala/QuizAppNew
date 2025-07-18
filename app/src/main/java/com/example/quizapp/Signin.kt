import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = FirebaseAuth.getInstance()

        findViewById<Button>(R.id.sighin).setOnClickListener {
            signIn()
        }
        findViewById<Button>(R.id.register).setOnClickListener {
            register()
        }
    }

    private fun signIn() {

    }

    private fun register() {

    }
}
