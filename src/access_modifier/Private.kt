package access_modifier


class Private {
    private var name: String = " "

    fun setName(name:String){
        this.name = name
        //return name
    }
        fun GetName() {
            println(name)
        }

}
fun main(args: Array<String>) {
    val private = Private()
   //println(private.setName("utpal"))
    private.setName("utpal")
    private.GetName()
}