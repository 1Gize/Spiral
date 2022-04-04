object Spiral extends App{
  spiral(4).foreach{c => c.foreach{ s => print(s + " ")}
    println()
  }
  def spiral(n: Int)={
    val arr = Array.ofDim[Int](n,n)
    var direction = "right"
    var counter = 0
    var iteration = 1
    var lastX = 0
    var lastY = 0
    var y = 0
    while(y <= n) {
        direction match {
          case "right" =>
            if(y < 1){
              var x = 0
              while(x < n){
                counter += 1
                arr(0)(x) = counter
                x += 1
              }
              lastY = x - 1

              y += 1
              direction = "down"

            }else{
              var x = 0
              while (x + y  < n){
                counter += 1
                arr(lastX)(lastY + 1 + x) = counter
                x += 1
              }
              lastY = lastY  + x
              if(iteration == 2){
                iteration = 1
                y += 1
                direction = "down"
              }else{
                iteration += 1
                direction = "down"
              }


            }
          case "down" =>

            var x = 0
            while(x + y  < n){
              counter += 1
              arr(lastX +x + 1)(lastY) = counter
              x += 1
            }
            if(iteration == 2 ){
              iteration = 1
              y += 1
              direction = "left"
            }else{
              iteration += 1
              direction = "left"
            }
            lastX  = lastX + x

          case "left" =>
            var x = 0

            while(x + y < n){
              counter += 1
              arr(lastX)(lastY - x - 1 ) = counter
              x += 1
            }
            lastY = lastY - (x+y) + 1
            if(iteration == 2 ){
              iteration = 1
              y += 1
              direction = "up"
            }else{
              iteration += 1
              direction = "up"
            }

          case "up" =>
            var x = 0

            while((x + y) < n){
              counter += 1
             // println(x)
              arr(lastX - x - 1)(lastY) = counter
              x += 1
            }
            lastX = y-x +1

            if(iteration == 2 ){
              iteration = 1
              y += 1
              direction = "right"
            }else{
              iteration += 1
              direction = "right"
            }
          case _ => println("jestem klaunem :)")
          y += 1
        }
      }
    arr
    }
}
