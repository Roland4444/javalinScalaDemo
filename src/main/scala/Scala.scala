


import io.javalin.{Context, Handler, Javalin}
import javax.servlet.http.HttpServletResponse
object Scala {
  val res_ = "<hi"
  val handler: Handler = new Handler {override def handle(context: Context): Unit ={context.result(res_)      }    }
  val handler2: Handler = new Handler {override def handle(context: Context): Unit ={context.render("fake.html")     }    }
  def main(args: Array[String]): Unit = {
    var app: Javalin = Javalin.create.start(7000)
    app.get("/", handler2)
  }
}