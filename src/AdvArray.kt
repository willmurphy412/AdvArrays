fun main() {
    //Define the two separate arrays then combine them
    var ingredients = arrayOf<String>("Bun","Beef","Cheese","Ketchup","Mustard","Mayo","Lettuce")
    var amount = arrayOf("15","20","10","2","1","4","40")
    var total = arrayOf<Array<String>>()
    var a_ing: String
    var a_amo: String
    var selection =

    total+= ingredients
    total+= amount

    var rowcount = total[0].size -1

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
            break
        }
    }
}