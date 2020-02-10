package com.example.swipequiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_question.view.*

public class QuestionAdapter(private val questions: List<Question>) : RecyclerView.Adapter<QuestionAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_question, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return questions.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(questions[position])
    }

    lateinit var context: Context

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        init{
            itemView.setOnClickListener{
                //change toast
                Toast.makeText(context,"The correct answer is: " + {questions}, Toast.LENGTH_SHORT).show()
            }
        }

        fun bind(question: Question) {
            itemView.tvQuestions.text = question.question
        }
    }
}
