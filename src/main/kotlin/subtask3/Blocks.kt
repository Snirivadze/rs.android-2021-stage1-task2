package subtask3

//import com.sun.tools.javac.util.List
import kotlin.reflect.KClass
import java.time.LocalDate

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var sum = 0
        var str = ""
        val dateArray = mutableListOf<LocalDate>()

        for(i in blockA){
            if(i is Int){
                sum +=i
            }
            if(i is String){
                str +=i
            }
            if(i is LocalDate){
                dateArray.add(i)
            }
        }


         if(dateArray.isNotEmpty()) {
            var maxDate = dateArray[0]
             for (j in 1..dateArray.lastIndex) {

                 if (maxDate.isBefore(dateArray[j])) {
                     maxDate = dateArray[j]
                 }
             }

             val date = "${maxDate.dayOfMonth}.${maxDate.monthValue}.${maxDate.year}"

             if(blockB == LocalDate::class) {
                 return date
             }
         }
        return when(blockB){
            Int::class ->  sum
            String::class ->  str
            else -> "nun"
        }

        //throw NotImplementedError("Not implemented")
    }
}
