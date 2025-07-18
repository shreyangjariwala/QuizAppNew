import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R

class QuizActivity : AppCompatActivity() {
    private lateinit var quizType: String
    private var questionIndex = 0
    private var score = 0
    private lateinit var questions: List<Question>

    annotation class Question

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizType = intent.getStringExtra("quizType") ?: "animal"
        fetchQuizData()


    }

    private fun fetchQuizData() {

    }

    private fun displayQuestion() {

    }

    private fun checkAnswer(selectedOption: String) {

    }
}
