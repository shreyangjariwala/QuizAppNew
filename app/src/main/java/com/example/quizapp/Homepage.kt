import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        findViewById<Button>(R.id.btn_animal_quiz).setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java).putExtra("quizType", "animal"))
        }

        findViewById<Button>(R.id.btn_sport_quiz).setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java).putExtra("quizType", "sport"))
        }
    }

    annotation class QuizActivity
}
