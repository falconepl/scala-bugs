package simple

import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpecLike, Matchers}
import org.virtuslab.unicorn.LongUnicornPlay.driver.simple._
import play.api.Application
import play.api.db.DB
import play.api.test.FakeApplication

class FooBaseTest extends FlatSpecLike with Matchers with MockitoSugar {

  implicit val app: Application = new FakeApplication

  val database = Database.forDataSource(DB.getDataSource("default"))

  val FooService = new FooService

}
