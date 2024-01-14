package com.example.truflag

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() , View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Question> ? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswer: Int = 0
    private var mUserName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName=intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestion().shuffled().take(15).toCollection(ArrayList())
        setQuestion()

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){
        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionView()

        if(mCurrentPosition==mQuestionList!!.size){
            btn_submit.text = "Finish"
        }
        else{
            btn_submit.text = "Submit"
        }

        progress_bar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + mQuestionList!!.size
        progress_bar.progressTintList = ColorStateList.valueOf(Color.BLACK);
        questionId.text= question.question
        iv_image.setImageResource(question.image)
        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour
    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0,optionOne)
        options.add(1,optionTwo)
        options.add(2,optionThree)
        options.add(3,optionFour)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.optionOne ->{
                selectedOptionView(optionOne,1)
            }
            R.id.optionTwo ->{
                selectedOptionView(optionTwo,2)
            }
            R.id.optionThree ->{
                selectedOptionView(optionThree,3)
            }
            R.id.optionFour ->{
                selectedOptionView(optionFour,4)
            }
            R.id.btn_submit->{
                if (mSelectedOptionPosition==0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition<=mQuestionList!!.size ->{
                            setQuestion()
                        }
                        else->{
                            Toast.makeText(this, "Check Your Result" , Toast.LENGTH_SHORT).show()
                            val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.TOTAL_QUESTION, mQuestionList!!.size)
                            intent.putExtra(Constants.CORRECT_ANSWER, mCorrectAnswer)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else{
                    val question = mQuestionList?.get(mCurrentPosition-1)

                    if(question!!.correctOption !=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border)
                    }
                    else{
                        mCorrectAnswer++
                    }
                    answerView(question.correctOption  ,R.drawable.correct_option_border)

                    if(mCurrentPosition==mQuestionList!!.size){
                        btn_submit.text = "Finish"
                    }
                    else{
                        btn_submit.text = "Next Question ➩"
                    }
                    mSelectedOptionPosition=0
                }
            }
        }
    }

    private fun answerView (answer : Int , drawableView : Int){
        when (answer) {
            1 -> {
                optionOne.background = ContextCompat.getDrawable(this, drawableView)
                optionOne.setTypeface(null, Typeface.BOLD)
            }
            2 -> {
                optionTwo.background = ContextCompat.getDrawable(this, drawableView)
                optionTwo.setTypeface(null, Typeface.BOLD)
            }
            3 -> {
                optionThree.background = ContextCompat.getDrawable(this, drawableView)
                optionThree.setTypeface(null, Typeface.BOLD)
            }
            4 -> {
                optionFour.background = ContextCompat.getDrawable(this, drawableView)
                optionFour.setTypeface(null, Typeface.BOLD)
            }
        }
    }

    private fun selectedOptionView(tv : TextView , selectedOptionNumber : Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNumber
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface , Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border)
    }


}