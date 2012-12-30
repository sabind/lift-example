package code
package snippet

import net.liftweb._
import common._
import http._
import js.JsCmds._
import util._
import Helpers._
import scala.xml._
import code.model._

object Extract {

  def render = {
    val person: Person = Person.get
    "@person-name" #> Text(person.name) 
  }
}
