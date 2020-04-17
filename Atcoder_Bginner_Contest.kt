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
154 A
fun main(args:Array<String>){
    val a=readLine()!!.split( " ")
    val b=readLine()!!.split( " ").map{it.toInt()}
    val c=readLine()!!
   if (a[0]==c){
        when {
            b[0]-1>=1 ->{ println("$b[0]-1 $b[1]")}
            b[0]-1==0 ->{ println("0 $b[1]")}
        }
    }else if (a[1]==c){
        when {
            b[1] - 1 >= 1 -> { println("$b[0] $b[1]-1") }
            b[1] - 1 == 0 -> { println("0 $b[0]") }
        }
   }
}
153 A
fun main(args:Array<String>){
    val (a,b)=readLine()!!.split(" ").map{it.toInt()}
    if (a<=b){
        println(1)
    }else if (a>b){
        when {
            a%b==0 -> {println(a/b)}
            else   -> {println((a/b)+1)}
        }
    }
}
152 A
fun main(args:Array<String>){
    val (a,b)=readLine()!!.split(" ").map{it.toInt()}
    if (a==b){
        println("Yes")
    }else{
        println("No")
    }
}
151 A
fun main(args:Array<String>){
    val a=readLine()!!
    val b="abcdefghijklmnopqrstuvwxyz"
    for (i in 0..25){
        if (a == b[i].toString()){
            println("${b[i+1]}")
        }
    }
}
150 A
fun main (args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (500*a[0]>=a[1]){
        println("Yes")
    }else {
        println("No")
    }
}
149 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ")
    println("${a[1]}${a[0]}")
}
148 A
fun main(args:Array<String>){
    val ans : MutableList<Int> = mutableListOf(1,2,3)
    val a=readLine()!!.toInt()
    val b=readLine()!!.toInt()
    ans.remove(a)
    ans.remove(b)
    println(ans[0])
}
fun main(args:Array<String>){
    val a = listOf(1,2,3)
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println((a.filterNot{it==b}.filterNot{it==c})[0])
}
