fun setCheck(first: String, second: String){
   val firstDeletePoint: String = first.dropLast(1)
   val secondDeletePoint: String = second.dropLast(1)

   val list1: MutableList<String> = firstDeletePoint.split(", ").toMutableList()
   val list2: MutableList<String> = secondDeletePoint.split(", ").toMutableList()

   for(person in list1.indices){
      val personData = list1[person].split(" ")
      val firstIsSurname: Boolean = personData[0].contains("ов")
      if( firstIsSurname ){
         list1[person] = "${personData[1]} ${personData[0]}"
      }
   }

   for(person in list2.indices){
      val personData = list2[person].split(" ")
      val firstIsSurname: Boolean = personData[0].contains("ов")
      if( firstIsSurname ){
         list2[person] = "${personData[1]} ${personData[0]}"
      }
   }

   if(list1.sorted() == list2.sorted()) { println("YES") }
   else { println("NO") }
}

fun main(){
   val str1 = readLine().toString()
   val str2 = readLine().toString()

   setCheck(str1, str2)
}