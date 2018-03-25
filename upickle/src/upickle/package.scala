import ujson.{Js, StringRenderer, Transformable, transform}

package object upickle {
  val Js = ujson.Js
  object json {
    def read(s: Transformable): Js.Value = transform(s, Js)

    def write(t: Js.Value, indent: Int = -1): String = {
      transform(t, StringRenderer(indent)).toString
    }
  }
}
