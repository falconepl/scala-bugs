scala-bugs
==========

Snippets providing a context for bugs reporting, allowing to reproduce them easily.

## 1. Unknown type compiler error

Issue `test:compile` command from `sbt` console to reproduce an error. You should see:

    [error] Unknown type: <error>, <error> [class scala.reflect.internal.Types$ErrorType$, class scala.reflect.internal.Types$ErrorType$] TypeRef? false
    [trace] Stack trace suppressed: run last test:compile for the full output.
    [error] (test:compile) scala.reflect.internal.FatalError: Unknown type: <error>, <error> [class scala.reflect.internal.Types$ErrorType$, class scala.reflect.internal.Types$ErrorType$] TypeRef? false

See `FooServiceTest.scala` for more details.
