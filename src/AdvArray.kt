fun main() {
    //Define the two separate arrays then combine them
    val ingredients = arrayOf<String>("Bun","Beef","Cheese","Ketchup","Mustard","Mayo","Lettuce")
    val amount = arrayOf("15","20","10","2","1","4","40")
    var total = arrayOf<Array<String>>()
    var a_ing: String
    var a_amo: String

    total+= ingredients
    total+= amount

    val rowcount = total[0].size -1

    //print out all options in the array
    for(i in 0..rowcount){
        a_ing = total[0][i]
        a_amo = total[1][i]
        println("$a_ing has $a_amo items.")
    }

    println("\n What item are you looking for?")
    var userInput = readLine()!!

    for(i in 0..rowcount){
        a_ing = total[0][i]
        a_amo = total[1][i]
        var result = userInput.compareTo(a_ing, true)
        if(result == 0){
            println("You selected ${a_ing} it has ${a_amo} in storage")
            println("\n Would you like to change the amount of this item? Type N for No and Y for Yes")
            userInput = readLine()!!
            result = userInput.compareTo("N", true)
            if(result == 0)
                break
            else{
                println("\n Would you like to add or subtract from the original total?")
                userInput = readLine()!!
                result = userInput.compareTo("Add",true)
                if(result == 0) {
                    println("\n How much would you like to add?")
                    val userInputInt = readLine()!!.toInt()
                    val int_amo = a_amo.toInt()
                    val new_amo = int_amo + userInputInt

                    println("You have selected $a_ing which had $a_amo and have added $userInputInt which brings the total to: $new_amo")
                    break
                }
                else {
                    println("\n How much would you like to subtract?")
                    val userInputInt = readLine()!!.toInt()
                    val int_amo = a_amo.toInt()
                    val new_amo = int_amo - userInputInt

                    if(new_amo > 0) {
                        println("You have selected $a_ing which had $a_amo and have subtracted $userInputInt which brings the total to: $new_amo")
                        break
                    }
                    else {
                        println("Sorry you can not have a negative amount please try again")
                        break
                    }
                }
            }
        }
    }
}