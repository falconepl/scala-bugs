package simple

class FooServiceTest extends FooBaseTest {

  behavior of "FooService"

  it should "just compile" in database.withTransaction {
    implicit session =>
      // Type-annotated foobar doesn't cause a compilation error:
      // val foobar: BarRow = BarRow(foobarId = FooId(1))

      // Unannotated foobar does cause "unknown type" compilation error...
      val foobar = BarRow(foobarId = FooId(1))

      // ...when used here:
      val foobarId = FooService.save(foobar)

      // What's more interesting, if we change BarRow's 'foobarId' parameter's
      // name to e.g. 'foxbarId', the compilation error is gone.
  }

}
