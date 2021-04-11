import kotlin.math.abs
import kotlin.math.max

fun main() {
    val firsttask: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    firsttask[0] = arrayOf(1.0,0.55,-0.13,0.34)
    firsttask[1] = arrayOf(0.13,-0.17,0.33,0.17)
    firsttask[2] = arrayOf(0.11,0.18,-0.22,-0.11)
    firsttask[3] = arrayOf(0.13,-0.12,0.21,0.22)

    val aminusone: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    aminusone[0] = arrayOf(-1.53034,4.08854,12.0119,5.2117)
    aminusone[1] = arrayOf(4.45859,-1.68133,-20.0751,-15.6289)
    aminusone[2] = arrayOf(2.32367,4.46726,-11.3646,-12.7254)
    aminusone[3] = arrayOf(1.11821,-7.59725,-7.19997,5.08793)

    val a1minusone: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    a1minusone[0] = arrayOf(1.0,0.0,0.0,0.0)
    a1minusone[1] = arrayOf(0.764706,-5.88235,0.0,0.0)
    a1minusone[2] = arrayOf(1.12567,-4.81283,-4.54545,0.0)
    a1minusone[3] = arrayOf(-1.2483,1.38551,4.33884,4.54545)

    val a2: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    a2[0] = arrayOf(0.0,0.55,-0.13,0.34)
    a2[1] = arrayOf(0.0,0.0,0.33,0.17)
    a2[2] = arrayOf(0.0,0.0,0.0,-0.11)
    a2[3] = arrayOf(0.0,0.0,0.0,0.0)

    val numbers: Array<Double> = arrayOf(0.13,0.11, 1.0, 0.18)

    for (i in 0..3){
        for (k in 0..3){
            firsttask[i][k] =firsttask[i][k]*(0.2)
            if (i==k){
                firsttask[i][k]+=1.0
            }
        }
    }
    println(det4(firsttask))
    for (i in 0..3){
        for (k in 0..3){
            print(firsttask[i][k])
            print(' ')
        }
        println(' ')
    }

    print("x = ")
    for (i in 0..3){
        print(aminusone[i][0]*numbers[0]+aminusone[i][1]*numbers[1]+aminusone[i][2]*numbers[2]+aminusone[i][3]*numbers[3])
        print(" ")
    }

    println(" ")
    val a: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    println("-A_1^{-1}*A_2 = ")
    for (i in 0..3){
        for(k in 0..3){
            a[i][k] = a1minusone[i][1]*a2[1][k]+a1minusone[i][2]*a2[2][k]+a1minusone[i][3]*a2[3][k]+a1minusone[i][0]*a2[0][k]
            print(a[i][k])
            print(" ")
        }
        println(" ")
    }
    val at: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    for (i in 0..3){
        for(k in 0..3){
            at[i][k] = a[k][i]
        }
    }
    val aa: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    println("aa* = ")
    for (i in 0..3){
        for(k in 0..3){
            aa[i][k] = a[i][1]*at[1][k]+a[i][2]*at[2][k]+a[i][3]*at[3][k]+a[i][0]*at[0][k]
            print(aa[i][k])
            print(" ")
        }
        println(" ")
    }
    val frt: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    for (i in 0..3){
        for(k in 0..3){
            frt[i][k] = firsttask[k][i]
        }
    }
    println("a*at")
    for (i in 0..3){
        for(k in 0..3){
            aa[i][k] = firsttask[i][1]*frt[1][k]+firsttask[i][2]*frt[2][k]+firsttask[i][3]*frt[3][k]+firsttask[i][0]*frt[0][k]
            print(aa[i][k])
            print(" ")
        }
        println(" ")
    }
    print("определитель для 3 теоремы = ")
    println(det4(aa))


    val aa1minusone: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    aa1minusone[0] = arrayOf(0.686153,0.0,0.0,0.0)
    aa1minusone[1] = arrayOf(-0.100844,1.06457,0.0,0.0)
    aa1minusone[2] = arrayOf(0.00775158,-0.113517,1.09146,0.0)
    aa1minusone[3] = arrayOf(-0.0604787,-0.0135963,-0.016869,0.914953)


    val aa2: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    aa2[0] = arrayOf(0.0,0.138056,0.004008,0.09846)
    aa2[1] = arrayOf(0.0,0.0,0.097696,0.01576)
    aa2[2] = arrayOf(0.0,0.0,0.0,0.016892)
    aa2[3] = arrayOf(0.0,0.0,0.0,0.0)

    val aa1aa2: Array<Array<Double>> = Array(4, { Array(4, {0.0}) })
    println("aa1aa2* = ")
    for (i in 0..3){
        for(k in 0..3){
            aa1aa2[i][k] = aa1minusone[i][1]*aa2[1][k]+aa1minusone[i][2]*aa2[2][k]+aa1minusone[i][3]*aa2[3][k]+aa1minusone[i][0]*aa2[0][k]
            print(aa1aa2[i][k])
            print(" ")
        }
        println(" ")
    }


    val numbers1: Array<Double> = matrnavec(frt,numbers)
    print("ynew = ")
    for (i in 0..3){
        print(numbers1[i])
        print(" ")
    }
    println(" ")

    val x1: Array<Double> = arrayOf(0.11166,0.034243,1.04924,0.136549)

    val x2: Array<Double> = arrayOf(0.08919,0.10399, 1.07998, 0.13846)
    println("x1 = ")
    for (i in 0..3){
        x2[i] = -aa1aa2[i][0]*x1[0]-aa1aa2[i][1]*x1[1]-aa1aa2[i][2]*x1[2]-aa1aa2[i][3]*x1[3]+  aa1minusone[i][0]*numbers1[0]+ aa1minusone[i][1]*numbers1[1]+ aa1minusone[i][2]*numbers1[2]+ aa1minusone[i][3]*numbers1[3]
        print(x2[i])
        print(" ")
    }

}
fun det4(A: Array<Array<Double>>): Double {
    return A[0][0]*(A[1][1]*A[2][2]*A[3][3]+A[1][2]*A[2][3]*A[3][1]+A[3][2]*A[1][3]*A[2][1]-A[1][3]*A[2][2]*A[3][1]-A[1][1]*A[3][2]*A[2][3]-A[1][2]*A[2][1]*A[3][3])-
            A[1][0]*(A[0][1]*A[2][2]*A[3][3]+A[0][2]*A[2][3]*A[3][1]+A[3][2]*A[0][3]*A[2][1]-A[0][3]*A[2][2]*A[3][1]-A[0][1]*A[3][2]*A[2][3]-A[0][2]*A[2][1]*A[3][3])+
            A[2][0]*(A[0][1]*A[1][2]*A[3][3]+A[0][2]*A[1][3]*A[3][1]+A[3][2]*A[0][3]*A[1][1]-A[0][3]*A[1][2]*A[3][1]-A[0][1]*A[3][2]*A[1][3]-A[0][2]*A[1][1]*A[3][3])-
            A[3][0]*(A[0][1]*A[1][2]*A[2][3]+A[0][2]*A[1][3]*A[2][1]+A[2][2]*A[0][3]*A[1][1]-A[0][3]*A[1][2]*A[2][1]-A[0][1]*A[2][2]*A[1][3]-A[0][2]*A[1][1]*A[2][3])
}
fun firtsnorm(A: Array<Array<Double>>):Double{
    var x1:Double = 0.0
    var x2:Double = 0.0
    var x3:Double = 0.0
    var x4:Double = 0.0
    for (i in 0..3){
        x1 += abs(A[0][i])
    }
    for (i in 0..3){
        x2 += abs(A[1][i])
    }
    for (i in 0..3){
        x3 += abs(A[2][i])
    }
    for (i in 0..3){
        x4 += abs(A[3][i])
    }
    val x = max(max(x1,x2), max(x3,x4))
    return x
}
fun matrnavec(A: Array<Array<Double>>,B:Array<Double>):Array<Double>{
    val r: Array<Double> = arrayOf(0.0,0.0, 0.0, 0.0)
    for (i in 0..3){
        r[i] = A[i][0]*B[0]+A[i][1]*B[1]+A[i][2]*B[2]+A[i][3]*B[3]
    }
    return r
}