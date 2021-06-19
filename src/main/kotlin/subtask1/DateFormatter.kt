package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {


        val dayInt = day.toInt()
        var monthInt = month.toInt()
        val centuryInt = year.substring(0,2).toInt()
        var yearInt = year.substring(2).toInt()

        if(monthInt>12){
            return "Такого дня не существует"
        }


        if(monthInt < 3) {
            monthInt += 12
            yearInt--
        }

        if(dayInt > 31 || (dayInt > 28 && monthInt == 14 && yearInt%4 != 0)){
            return "Такого дня не существует"
        }
       val  a = (((monthInt + 1) * 26 / 10) + dayInt + yearInt + (yearInt/4) + (centuryInt / 4) - 2 * centuryInt) % 7 - 1


        val mapWeekDays = mapOf(0 to "воскресенье", 1 to "понедельник", 2 to "вторник", 3 to "среда", 4 to "четверг", 5 to "пятница", 6 to "суббота")
        val text_month = when(month) {
            "1" -> "января"
            "2" -> "февраля"
            "3" -> "марта"
            "4" -> "апреля"
            "5" -> "мая"
            "6" -> "июня"
            "7" -> "июля"
            "8" -> "августа"
            "9" -> "сентября"
            "10" -> "октября"
            "11" -> "ноября"
            "12" -> "декабря"
            else -> "Такого дня не существует"
        }
        val text_day_of_the_week = mapWeekDays[a]

        return "$day $text_month, $text_day_of_the_week"

       //throw NotImplementedError("Not implemented")
    }
}
