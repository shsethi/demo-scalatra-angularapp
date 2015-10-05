
import javax.servlet.ServletContext

import com.example.www.servlet.TestServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new TestServlet, "/*")
  }
}


