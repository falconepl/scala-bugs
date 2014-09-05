package simple

import org.virtuslab.unicorn.LongUnicornPlay._
import org.virtuslab.unicorn.LongUnicornPlay.driver.simple._

case class FooId(id: Long) extends AnyVal with BaseId

object FooId extends IdCompanion[FooId]

case class BarId(id: Long) extends AnyVal with BaseId

object BarId extends IdCompanion[BarId]

case class BarRow(override val id: Option[BarId] = None,
                  foobarId: FooId) extends WithId[BarId]

class Bars(tag: Tag) extends IdTable[BarId, BarRow](tag, "phantom_bar_table") {

  def foobarId = column[FooId]("foobar_id")

  def * = (id.?, foobarId) <>(BarRow.tupled, BarRow.unapply)

}

object Bars {
  val query: TableQuery[Bars] = TableQuery[Bars]
}
