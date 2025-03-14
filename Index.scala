package files

import scalatags.Text.all._
import scalatags.Text.tags2.main
import ba.sake.hepek.html.statik.StaticPage
import ba.sake.hepek.plain.component.PlainUtilComponents

// PlainUtilComponents adds markdown .md function
object Index extends StaticPage with PlainUtilComponents {

  override def pageSettings =
    super.pageSettings
      .withTitle("Home")
      .withDescription("my blog")

  override def styleURLs =
    super.styleURLs.appended("https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.classless.min.css")

  override def pageContent = main(
    """
    # Hello World! 🌍
    
    Welcome to my blog!
    """.md
  )

}
