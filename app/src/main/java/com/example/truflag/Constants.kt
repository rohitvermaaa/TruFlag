package com.example.truflag

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_question"
    const val CORRECT_ANSWER : String = "correct_answers"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "India",
            "Peru",
            "Argentina",
            "Nepal",
            3
        )
        questionList.add(ques1)

        val ques2 = Question(
            2,
            "Which nation is represented by this flag?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Mexico",
            "Argentina",
            "Chile",
            1
        )
        questionList.add(ques2)

        val ques3 = Question(
            3,
            "Identify the country associated with this flag.",
            R.drawable.ic_flag_of_france,
            "Spain",
            "Italy",
            "France",
            "Germany",
            3
        )
        questionList.add(ques3)

        val ques4 = Question(
            4,
            "Determine the nation to which this flag belongs.",
            R.drawable.ic_flag_of_japan,
            "South Korea",
            "Japan",
            "China",
            "Vietnam",
            2
        )
        questionList.add(ques4)

        val ques5 = Question(
            5,
            "What is the country affiliated with this flag?",
            R.drawable.ic_flag_of_united_kingdom,
            "Canada",
            "Australia",
            "United Kingdom",
            "New Zealand",
            3
        )
        questionList.add(ques5)


        val ques6 = Question(
            6,
            "Tell me the nation that this flag signifies.",
            R.drawable.ic_flag_of_canada,
            "United States",
            "Mexico",
            "Brazil",
            "Canada",
            4
        )
        questionList.add(ques6)


        val ques7 = Question(
            7,
            "Point out the country owning this flag.",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Netherlands",
            "France",
            "Belgium",
            1
        )
        questionList.add(ques7)


        val ques8 = Question(
            8,
            "Specify the country that possesses this particular flag.",
            R.drawable.ic_flag_of_india,
            "Pakistan",
            "China",
            "Bangladesh",
            "India",
            4
        )
        questionList.add(ques8)


        val ques9 = Question(
            9,
            "Name the nation linked to this flag.",
            R.drawable.ic_flag_of_italy,
            "Spain",
            "Greece",
            "Italy",
            "Portugal",
            3
        )
        questionList.add(ques9)


        val ques10 = Question(
            10,
            "Recognize the country to which this flag is linked.",
            R.drawable.ic_flag_of_russia,
            "Russia",
            "Ukraine",
            "Poland",
            "Belarus",
            1
        )
        questionList.add(ques10)


        val ques11 = Question(
            11,
            "To which country does this intricately adorned flag belong?",
            R.drawable.ic_flag_of_morocco,
            "Tunisia",
            "Libya",
            "Morocco",
            "Algeria",
            3
        )
        questionList.add(ques11)

        val ques12 = Question(
            12,
            "Identify the nation with this uniquely detailed flag.",
            R.drawable.ic_flag_of_mongolia,
            "Kyrgyzstan",
            "Mongolia",
            "Uzbekistan",
            "Kazakhstan",
            2
        )
        questionList.add(ques12)

        val ques13 = Question(
            13,
            "Tell me the sophisticated nation represented by this flag.",
            R.drawable.ic_flag_of_south_korea,
            "China",
            "Japan",
            "South Korea",
            "North Korea",
            3
        )
        questionList.add(ques13)

        val ques14 = Question(
            14,
            "Name the country possessing this elaborately designed flag.",
            R.drawable.ic_flag_of_chile,
            "Argentina",
            "Chile",
            "Bolivia",
            "Peru",
            3
        )
        questionList.add(ques14)

        val ques15 = Question(
            15,
            "Which nation is indicated by this meticulously crafted flag?",
            R.drawable.ic_flag_of_united_arab_emirates,
            "Kuwait",
            "Saudi Arabia",
            "United Arab Emirates",
            "Qatar",
            3
        )
        questionList.add(ques15)


        val ques16 = Question(
            16,
            "Tell me the sophisticated nation represented by this flag.",
            R.drawable.ic_flag_of_hungary,
            "Hungary",
            "Austria",
            "Czech Republic",
            "Slovakia",
            1
        )
        questionList.add(ques16)


        val ques17 = Question(
            17,
            "Identify the nation with this uniquely detailed flag.",
            R.drawable.ic_flag_of_thailand,
            "Cambodia",
            "Laos",
            "Vietnam",
            "Thailand",
            4
        )
        questionList.add(ques17)


        val ques18 = Question(
            18,
            "What nation does this intricately designed flag pertain to?",
            R.drawable.ic_flag_of_cambodia,
            "Laos",
            "Cambodia",
            "Myanmar",
            "Thailand",
            2
        )
        questionList.add(ques18)


        val ques19 = Question(
            19,
            "Identify the nation with this uniquely detailed flag.",
            R.drawable.ic_flag_of_tanzania,
            "Kenya",
            "Rwanda",
            "Tanzania",
            "Uganda",
            3
        )
        questionList.add(ques19)


        val ques20 = Question(
            20,
            "Identify the nation with this uniquely detailed flag.",
            R.drawable.ic_flag_of_czech_republic,
            "Czech Republic",
            "Hungary",
            "Poland",
            "Slovakia",
            1
        )
        questionList.add(ques20)

        val ques21 = Question(
            21,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_ireland,
            "United Kingdom",
            "Ireland",
            "Scotland",
            "Wales",
            2
        )
        questionList.add(ques21)

        val ques22 = Question(
            22,
            "Name the nation with this flag.",
            R.drawable.ic_flag_of_indonesia,
            "Malaysia",
            "Singapore",
            "Brunei",
            "Indonesia",
            4
        )
        questionList.add(ques22)

        val ques23 = Question(
            23,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_egypt,
            "Iraq",
            "Egypt",
            "Saudi Arabia",
            "Jordan",
            2
        )
        questionList.add(ques23)


        val ques24 = Question(
            24,
            "What nation is associated with this flag?",
            R.drawable.ic_flag_of_colombia,
            "Colombia",
            "Ecuador",
            "Venezuela",
            "Peru",
            1
        )
        questionList.add(ques24)


        val ques25 = Question(
            25,
            "Which country owns this flag?",
            R.drawable.ic_flag_of_denmark,
            "Sweden",
            "Norway",
            "Denmark",
            "Finland",
            3
        )
        questionList.add(ques25)


        val ques26 = Question(
            26,
            "Name the country with this detailed flag.",
            R.drawable.ic_flag_of_pakistan,
            "India",
            "Pakistan",
            "Bangladesh",
            "Afghanistan",
            2
        )
        questionList.add(ques26)


        val ques27 = Question(
            27,
            "Identify the nation possessing this flag.",
            R.drawable.ic_flag_of_nigeria,
            "South Africa",
            "Kenya",
            "Ghana",
            "Nigeria",
            4
        )
        questionList.add(ques27)


        val ques28 = Question(
            28,
            "What is the country linked to this flag?",
            R.drawable.ic_flag_of_portugal,
            "Spain",
            "France",
            "Portugal",
            "Italy",
            3
        )
        questionList.add(ques28)


        val ques29 = Question(
            29,
            "Recognize the country with this flag.",
            R.drawable.ic_flag_of_peru,
            "Chile",
            "Peru",
            "Bolivia",
            "Ecuador",
            2
        )
        questionList.add(ques29)


        val ques30 = Question(
            30,
            "Identify the country with this intricately detailed flag.",
            R.drawable.ic_flag_of_ethiopia,
            "Ethiopia",
            "Eritrea",
            "Somalia",
            "Djibouti",
            1
        )
        questionList.add(ques30)

        // Questions 31-40
        val ques31 = Question(
            31,
            "Which nation does this flag represent?",
            R.drawable.ic_flag_of_switzerland,
            "Austria",
            "Switzerland",
            "Liechtenstein",
            "Luxembourg",
            2
        )
        questionList.add(ques31)

        val ques32 = Question(
            32,
            "Identify the country associated with this flag.",
            R.drawable.ic_flag_of_saudi_arabia,
            "Qatar",
            "United Arab Emirates",
            "Kuwait",
            "Saudi Arabia",
            4
        )
        questionList.add(ques32)

        val ques33 = Question(
            33,
            "What is the nation linked to this flag?",
            R.drawable.ic_flag_of_norway,
            "Norway",
            "Denmark",
            "Sweden",
            "Finland",
            1
        )
        questionList.add(ques33)

        val ques34 = Question(
            34,
            "Identify the South American nation with this flag.",
            R.drawable.ic_flag_of_bolivia,
            "Bolivia",
            "Paraguay",
            "Uruguay",
            "Argentina",
            1
        )
        questionList.add(ques34)

        val ques35 = Question(
            35,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_australia,
            "New Zealand",
            "Australia",
            "Papua New Guinea",
            "Fiji",
            2
        )
        questionList.add(ques35)

        val ques36 = Question(
            36,
            "Recognize the country to which this flag is linked.",
            R.drawable.ic_flag_of_south_africa,
            "Zimbabwe",
            "Namibia",
            "South Africa",
            "Botswana",
            3
        )
        questionList.add(ques36)

        val ques37 = Question(
            37,
            "Name the nation linked to this flag.",
            R.drawable.ic_flag_of_malaysia,
            "Thailand",
            "Malaysia",
            "Singapore",
            "Brunei",
            2
        )
        questionList.add(ques37)

        val ques38 = Question(
            43,
            "Which East Asian region is represented by this flag?",
            R.drawable.ic_flag_of_taiwan,
            "Taiwan",
            "China",
            "Japan",
            "South Korea",
            1
        )
        questionList.add(ques38)

        val ques39 = Question(
            39,
            "Specify the country that possesses this particular flag.",
            R.drawable.ic_flag_of_israel,
            "Jordan",
            "Lebanon",
            "Syria",
            "Israel",
            4
        )
        questionList.add(ques39)

        val ques40 = Question(
            40,
            "Determine the nation to which this flag belongs.",
            R.drawable.ic_flag_of_sri_lanka,
            "Maldives",
            "Sri Lanka",
            "Bangladesh",
            "Nepal",
            2
        )
        questionList.add(ques40)

        // Questions 41-50
        val ques41 = Question(
            41,
            "Identify the nation with this uniquely detailed flag.",
            R.drawable.ic_flag_of_burundi,
            "Brunei",
            "Burkina Faso",
            "Burundi ",
            "Chad",
            3
        )
        questionList.add(ques41)

        val ques42 = Question(
            42,
            "What nation is associated with this flag?",
            R.drawable.ic_flag_of_sweden,
            "Norway",
            "Denmark",
            "Finland",
            "Sweden",
            4
        )
        questionList.add(ques42)

        val ques43 = Question(
            43,
            "Name the territory possessing this distinctive flag.",
            R.drawable.ic_flag_of_puerto_rico,
            "Puerto Rico",
            "Dominican Republic",
            "Cuba",
            "Haiti",
            1
        )
        questionList.add(ques43)

        val ques44 = Question(
            44,
            "Recognize the country with this flag.",
            R.drawable.ic_flag_of_rwanda,
            "Uganda",
            "Tanzania",
            "Kenya",
            "Rwanda",
            4
        )
        questionList.add(ques44)

        val ques45 = Question(
            45,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_cuba,
            "Dominican Republic",
            "Cuba",
            "Haiti",
            "Puerto Rico",
            2
        )
        questionList.add(ques45)

        val ques46 = Question(
            46,
            "Which North African country is represented by this flag?",
            R.drawable.ic_flag_of_tunisia,
            "Algeria",
            "Morocco",
            "Libya",
            "Tunisia",
            4
        )
        questionList.add(ques46)

        val ques47 = Question(
            47,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_singapore,
            "Malaysia",
            "Indonesia",
            "Thailand",
            "Singapore",
            4
        )
        questionList.add(ques47)

        val ques48 = Question(
            48,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_ukraine,
            "Russia",
            "Poland",
            "Belarus",
            "Ukraine",
            4
        )
        questionList.add(ques48)

        val ques49 = Question(
            49,
            "Specify the country that possesses this particular flag.",
            R.drawable.ic_flag_of_ghana,
            "Nigeria",
            "Ghana",
            "Kenya",
            "South Africa",
            2
        )
        questionList.add(ques49)

        val ques50 = Question(
            50,
            "Recognize the country to which this flag is linked.",
            R.drawable.ic_flag_of_iraq,
            "Iran",
            "Syria",
            "Iraq",
            "Turkey",
            3
        )
        questionList.add(ques50)

        // Questions 51-60
        val ques51 = Question(
            51,
            "Identify the nation linked to this flag.",
            R.drawable.ic_flag_of_finland,
            "Sweden",
            "Norway",
            "Denmark",
            "Finland",
            4
        )
        questionList.add(ques51)

        val ques52 = Question(
            52,
            "What is the country affiliated with this flag?",
            R.drawable.ic_flag_of_venezuela,
            "Colombia",
            "Ecuador",
            "Venezuela",
            "Peru",
            3
        )
        questionList.add(ques52)

        val ques53 = Question(
            53,
            "Specify the country that possesses this particular flag.",
            R.drawable.ic_flag_of_croatia,
            "Serbia",
            "Bosnia and Herzegovina",
            "Slovenia",
            "Croatia",
            4
        )
        questionList.add(ques53)

        val ques54 = Question(
            54,
            "Determine the nation to which this flag belongs.",
            R.drawable.ic_flag_of_malta,
            "Malta",
            "Greece",
            "Italy",
            "Cyprus",
            1
        )
        questionList.add(ques54)

        val ques55 = Question(
            55,
            "Recognize the country with this flag.",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "New Zealand",
            "Fiji",
            "Papua New Guinea",
            2
        )
        questionList.add(ques55)

        val ques56 = Question(
            56,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_mexico,
            "Argentina",
            "Mexico",
            "Brazil",
            "Chile",
            2
        )
        questionList.add(ques56)

        val ques57 = Question(
            57,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_philippines,
            "Vietnam",
            "Thailand",
            "Indonesia",
            "Philippines",
            4
        )
        questionList.add(ques57)

        val ques58 = Question(
            58,
            "Name the nation linked to this flag.",
            R.drawable.ic_flag_of_eswatini,
            "Lesotho",
            "Eswatini",
            "Botswana",
            "Namibia",
            2
        )
        questionList.add(ques58)

        val ques59 = Question(
            59,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_azerbaijan,
            "Armenia",
            "Georgia",
            "Azerbaijan",
            "Iran",
            3
        )
        questionList.add(ques59)

        val ques60 = Question(
            60,
            "Recognize the country to which this flag is linked.",
            R.drawable.ic_flag_of_cote_divoire,
            "Ghana",
            "Liberia",
            "Côte d'Ivoire",
            "Senegal",
            3
        )
        questionList.add(ques60)

        // Questions 61-70
        val ques61 = Question(
            61,
            "What is the nation linked to this flag?",
            R.drawable.ic_flag_of_uzbekistan,
            "Uzbekistan",
            "Kazakhstan",
            "Turkmenistan",
            "Kyrgyzstan",
            1
        )
        questionList.add(ques61)

        val ques62 = Question(
            62,
            "Name the country possessing this elaborately designed flag.",
            R.drawable.ic_flag_of_albania,
            "Kosovo",
            "Montenegro",
            "North Macedonia",
            "Albania",
            4
        )
        questionList.add(ques62)

        val ques63 = Question(
            63,
            "Recognize the country with this flag.",
            R.drawable.ic_flag_of_maldives,
            "Sri Lanka",
            "Maldives",
            "Bangladesh",
            "Nepal",
            2
        )
        questionList.add(ques63)

        val ques64 = Question(
            64,
            "To which country does this flag belong?",
            R.drawable.ic_flag_of_bulgaria,
            "Bulgaria",
            "Romania",
            "Greece",
            "Serbia",
            1
        )
        questionList.add(ques64)

        val ques65 = Question(
            65,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_lithuania,
            "Latvia",
            "Lithuania",
            "Estonia",
            "Belarus",
            2
        )
        questionList.add(ques65)

        val ques66 = Question(
            66,
            "Determine the nation to which this flag belongs.",
            R.drawable.ic_flag_of_georgia,
            "Armenia",
            "Azerbaijan",
            "Georgia",
            "Turkey",
            3
        )
        questionList.add(ques66)

        val ques67 = Question(
            67,
            "Recognize the country to which this flag is linked.",
            R.drawable.ic_flag_of_slovakia,
            "Czech Republic",
            "Hungary",
            "Poland",
            "Slovakia",
            4
        )
        questionList.add(ques67)

        val ques68 = Question(
            68,
            "Name the nation linked to this flag.",
            R.drawable.ic_flag_of_latvia,
            "Lithuania",
            "Latvia",
            "Estonia",
            "Finland",
            2
        )
        questionList.add(ques68)

        val ques69 = Question(
            69,
            "Identify the nation with this flag.",
            R.drawable.ic_flag_of_slovenia,
            "Croatia",
            "Bosnia and Herzegovina",
            "Serbia",
            "Slovenia",
            4
        )
        questionList.add(ques69)

        val ques70 = Question(
            70,
            "What nation does this intricately designed flag pertain to?",
            R.drawable.ic_flag_of_botswana,
            "Botswana",
            "Namibia",
            "Senegal",
            "Eswatini",
            1
        )
        questionList.add(ques70)

        return questionList
    }
}