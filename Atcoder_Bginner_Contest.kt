161 A
fun main(args: Array<String>) {
    val n = readLine()!!.split(" ").map{it.toInt()}
    println("${n[2]} ${n[0]} ${n[1]}")
}

160 A
fun main(args:Array<String>){
    val a=readLine()!!
    if (a[2]==a[3] && a[4]==a[5]){
        println("Yes")
    }else {
        println("No")
    }
}

159 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
        println((a[0] * (a[0] - 1) / 2) + (a[1] * (a[1] - 1) / 2))
}
158 A
fun main(args:Array<String>){
    val a=readLine()!!
    if(a[0]==a[1] && a[1]==a[2]){
        println("No")
    }else {
        println("Yes")
    }
}
157 A
fun main(args:Array<String>){
    val a=readLine()!!.toInt()
    if (a%2==0){
        println(a/2)
    }else if (a%2==1){
        println((a+1)/2)
    }
}
156 A
fun main(args:Array<String>){
    var a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]<=9){
        println(a[1]+(100*(10-a[0])))
    }else{
        println(a[1])
    }
}
155 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]==a[1] && a[1]==a[2]){
        println("No")
    }else if (a[0]!=a[1] && a[1]!=a[2] && a[2]!=a[0]){
        println("No")
    } else {
        println("Yes")
    }
}
