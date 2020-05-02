164 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]>a[1]){
        println("safe")
    }else{
        println("unsafe")
    }
}
163 A
import kotlin.math.PI

fun main(args:Array<String>){
    val a = readLine()!!.toInt()
    println(2*a*PI)
}
162 A
fun main(args:Array<String>){
    val a=readLine()!!
    for (i in 0..a.length-1){
        if (a[i].toString() == "7"){
            println("Yes")
            return
        }
    }
    println("No")
} 
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
147 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]+a[1]+a[2]>=22){
        println("bust")
    }else{
        println("win")
    }
}
146 A
fun main (args:Array<String>){
    val a : MutableList<String> = mutableListOf("SUN","MON","TUE","WED","THU","FRI","SAT")
    val b = readLine()!!
    for (i in 0..6){
        if (b==a[i]){
            println(7-i)
        }
    }
}
fun main (args:Array<String>){
    val a : MutableList<String> = mutableListOf("SUN","MON","TUE","WED","THU","FRI","SAT")
    val b = readLine()!!
    println(7-a.indexOf(b))
}
145 A
fun main (args:Array<String>){
    val a=readLine()!!.toInt()
    println(a*a)
}
144 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]<=9 && a[1]<=9){
        println(a[0]*a[1])
    }else{
        println(-1)
    }
}
143 A
fun main(args:Array<String>){
    val a=readLine()!!.split(" ").map{it.toInt()}
    if (a[0]<=a[1]*2){
        println(0)
    }else{
        println(a[0]-a[1]*2)
    }
}
142 A
fun main(args:Array<String>){
    val a = readLine()!!.toFloat()
    if (a%2.0==0.0){
        println(0.5)
    }else{
        println(((a+1.0)/2.0)/a)
    }
}
141 A
fun main(args:Array<String>){
    val tenki=listOf("Sunny","Cloudy","Rainy","Sunny")
    val a=readLine()!!
    for (i in 0..2){
        if (a==tenki[i]){
            println(tenki[i+1])
        }
    }
}
88 A
fun main(args:Array<String>){
    val a=readLine()!!.toInt()
    val b=readLine()!!.toInt()
    if (a%500<=b){
        println("Yes")
    }else{
        println("No")
    }
}
159 B　×
fun main (args:Array<String>) {
    val a = readLine()!!
    val b = (a.length / 2) - 1
    if (a.length % 2 == 0) {
        if (Regex(a.slice(0..b)).matches(a.slice((a.length / 2)..(a.length - 1)))) {
            if (Regex(a.slice(0..((b / 2) - 1))).matches(a.slice((b / 2) + 1..b))) {
                println("Yes")
            } else {
                println("No")
            }
        } else {
            println("No")
        }
    }else if (a.length%2==1){
        if (Regex(a.slice(0..b)).matches(a.slice(((a.length / 2)+1)..(a.length - 1)))) {
            if (Regex(a.slice(0..((b / 2) - 1))).matches(a.slice((b / 2) + 1..b))) {
                println("Yes")
            } else {
                println("No")
            }
        } else {
            println("No")
        }
    }
}
fun main (args:Array<String>) {
    val a = readLine()!!
    if (a!=a.reversed()){
        println("No")
        return
    }
    val b=a.substring(0,(a.length-1)/2)
    if (b != b.reversed()) {
        println("No")
        return
    }

    val c = a.substring(((a.length + 3) / 2) - 1, a.length)
    if (c != c.reversed()) {
        println("No")
        return
    }
    println("Yes")
}

86 B
fun main(args:Array<String>){
    val a=readLine()!!.replace(" ","").toDouble()
    val b=Math.sqrt(a).toInt().toDouble()
    println(if (a==Math.pow(b,2.0)) "Yes" else "No")
}
85 B
fun main(args:Array<String>){
    val a=readLine()!!.toInt()
    val b= mutableSetOf<Int>()
    for (i in 1..a){
        b.add(readLine()!!.toInt())
    }
    println(b.size)
}
84 B
fun main(args:Array<String>){
    val (a,d)=readLine()!!.split(" ").map{it.toInt()}
    val b=readLine()!!
    val c="[0-9]{$a}-[0-9]{$d}".toRegex()
    if (c.matches(b)){
        println("Yes")
    }else{
        println("No")
    }
}