import org.scalajs.dom
import org.scalajs.dom.document

object App {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val div = document.createElement("div")
    div.innerHTML = "Hello World!"
    document.body.appendChild(div)
  }
}