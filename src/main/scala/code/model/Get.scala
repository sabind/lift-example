package code
package model

import net.liftweb.common._
import net.liftweb.json.DefaultFormats
import net.liftweb.json.Formats
import scala.reflect.Manifest
import net.liftweb.json._

case class Person(name: String)

object Person extends Get[Person] { }

trait Get[A] { 
  implicit val formats = DefaultFormats
  
  val json: JValue = parse(""" { "name": "joe" } """)

  def get[A](implicit m: Manifest[A]): A = json.extract[A]
}
