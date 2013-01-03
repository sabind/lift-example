package code
package snippet

import net.liftweb._
import common._
import http._
import js.JsCmds._
import util._
import Helpers._
import scala.xml._

import net.liftweb.sitemap._
 
case class Param(foo: String)
 
object Param {
  def parse(foo: String) = {
    println("in parse function")
    Full(Param(foo))
  }

  def encode(param: Param) = param.foo 

  lazy val index = Menu.param[Param]("Param", "Param", parse _, encode _) / "param" / * / "index" 
}


class Params(param: Param) {
  def render = {
    "@param" #> Text(param.foo)
  }
}
