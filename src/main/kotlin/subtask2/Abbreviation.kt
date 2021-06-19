package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val subB = a.toUpperCase()
        var subA: String = ""

        var countA = 0
        var countB = 0
       while(countA<a.length && countB<b.length){
           if(subB[countA]==b[countB]){
                subA += a[countA]
                countB++
                countA++
                continue
           }
           countA++
       }
        if(subA.toUpperCase().equals(b)){
            return "YES"
        } else{
            return "NO"
        }

        //throw NotImplementedError("Not implemented")
    }
}
