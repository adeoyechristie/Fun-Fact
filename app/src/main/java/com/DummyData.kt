 package com

 import com.example.fun_fact.R

 object DummyData {
    val funFacts = listOf(
        FactModel(
           "Kotlin",
            R.drawable.kotlin_logo,
           "The name comes from Kotlin Island, near St. Petersburg.  Andrey Breslav mentioned that the team decided to name it after an island, just like Java was named after the Indonesian island of Java."
    ),
        FactModel(
            "Java",
             R.drawable.java_logo,
            "Java was initially named Oak after a tree outside one of the developer’s windows."
    ),
        FactModel(
            "Javascript",
             R.drawable.javascript_logo,
            "JavaScript was created by Brendan Eich in 1995 at Netscape — the company behind Navigator,"
     ),
        FactModel(
            "Swift",
             R.drawable.swift_logo,
            "Swift development at Apple in 2010 and was first released four years later. With its primary influence being Objective-C, Apple touts Swift as fast, easy to use, and safe by design."
     ),
        FactModel(
             "Python",
              R.drawable.python_logo,
             "Python was created by Guido van Rossum as a “hobby” programming project to keep him occupied during the Christmas holidays."
        )
    )
 }

