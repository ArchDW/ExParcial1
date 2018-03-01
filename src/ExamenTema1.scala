import java.text.DecimalFormat;

object ExamenTema1 {
  var Estimacion = 0.0
  var Cuociente =0.0
  
  def Raiz(x: Double, Decimal: Int): Double ={  
    Estimacion = AproxInicial(x)
    var cont = 0
    while(cont!= Decimal){
      Cuociente = cociente(x, Estimacion)          // x/ Estimacion
                                                   // println(Cuociente)                     
      Estimacion = promedio(Cuociente, Estimacion) // (Cuociente + estimacion) / 2 
      cont += 1
    }
    
   return Estimacion
    
  }// end the Raiz
  
  def promedio(a: Double, b: Double): Double={
     return (a+b)/2.0
  }//end the promedio
  
  def AproxInicial(x: Double): Double={
    var y = x/2
    var w = Math.pow(y, 2)
    println()
    while(w>=x){
    y = y / 2
    w = Math.pow(y, 2)
    }
    
    return y
  }//end the AproxInicial
  
  def cociente(a:Double, b: Double): Double={
    return a/b
  }//end the Cociente
  
  
  def main(args: Array[String]): Unit = {
    println(Math.sqrt(2))
    println(Raiz(2, 5))
  }
}