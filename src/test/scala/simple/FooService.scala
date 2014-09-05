package simple

import org.virtuslab.unicorn.LongUnicornPlay._
import org.virtuslab.unicorn.LongUnicornPlay.driver.simple._

class FooService(implicit override val mapping: BaseColumnType[BarId])
  extends BaseIdRepository[BarId, BarRow, Bars](Bars.query)
