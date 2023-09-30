package com.example.quiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions() :ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1, "What country does this flag belong to? ",
            R.drawable.ic_flag_of_india,
            "India", "Pakistan", "Afghanistan", "Nepal",
            1
        )
        questionList.add(ques1)

        val ques2 = Question(
            2, "What country does this flag belong to? ",
            R.drawable.ic_flag_of_india,
            "India", "China", "Afghanistan", "Nepal",
            1
        )
        questionList.add(ques2)

        val ques3 = Question(
            3, "What country does this flag belong to? ",
            R.drawable.ic_flag_of_india,
            "India", "Pakistan", "Afghanistan", "Nepal",
            1
        )
        questionList.add(ques3)

        val ques4 = Question(
            4, "What country does this flag belong to? ",
            R.drawable.ic_flag_of_india,
            "India", "Pakistan", "Afghanistan", "Nepal",
            1
        )
        questionList.add(ques4)

        val ques5 = Question(
            5, "What country does this flag belong to? ",
            R.drawable.ic_flag_of_india,
            "India", "Pakistan", "Afghanistan", "Nepal",
            1
        )
        questionList.add(ques5)






        return questionList
        }
    }
