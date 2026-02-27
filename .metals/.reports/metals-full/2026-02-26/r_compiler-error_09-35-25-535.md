error id: EE0690F04954E85BAE926212D2127521
file:///c:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/Main.scala
### dotty.tools.dotc.MissingCoreLibraryException: Could not find package scala from compiler core libraries.
Make sure the compiler core libraries are on the classpath.
   

occurred in the presentation compiler.



action parameters:
offset: 9
uri: file:///c:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/Main.scala
text:
```scala
object Ma@@

```


presentation compiler configuration:
Scala version: 3.8.1-bin-nonbootstrapped
Classpath:
<WORKSPACE>\.scala-build\ejerciciosScala_d5c0a6989e-04ff8441af\classes\main\META-INF\best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE> -Ywith-best-effort-tasty




#### Error stacktrace:

```
dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1325)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1353)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1355)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1359)
	dotty.tools.dotc.core.Symbols$.requiredPackage(Symbols.scala:1008)
	dotty.tools.dotc.core.Definitions.ScalaPackageVal(Definitions.scala:215)
	dotty.tools.dotc.core.Definitions.ScalaPackageClass(Definitions.scala:218)
	dotty.tools.dotc.core.Definitions.AnyClass(Definitions.scala:282)
	dotty.tools.dotc.core.Definitions.syntheticScalaClasses(Definitions.scala:2112)
	dotty.tools.dotc.core.Definitions.syntheticCoreClasses(Definitions.scala:2126)
	dotty.tools.dotc.core.Definitions.init(Definitions.scala:2142)
	dotty.tools.dotc.core.Contexts$ContextBase.initialize(Contexts.scala:937)
	dotty.tools.dotc.core.Contexts$Context.initialize(Contexts.scala:549)
	dotty.tools.dotc.interactive.InteractiveDriver.<init>(InteractiveDriver.scala:45)
	dotty.tools.pc.CachingDriver.<init>(CachingDriver.scala:30)
	dotty.tools.pc.ScalaPresentationCompiler.$init$$$anonfun$1(ScalaPresentationCompiler.scala:132)
	scala.meta.internal.pc.CompilerAccess.loadCompiler(CompilerAccess.scala:41)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:149)
	scala.meta.internal.pc.CompilerAccess.withNonInterruptableCompiler$$anonfun$1(CompilerAccess.scala:133)
	scala.meta.internal.pc.CompilerAccess.onCompilerJobQueue$$anonfun$1(CompilerAccess.scala:210)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:153)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	java.base/java.lang.Thread.run(Thread.java:1583)
```
#### Short summary: 

dotty.tools.dotc.MissingCoreLibraryException: Could not find package scala from compiler core libraries.
Make sure the compiler core libraries are on the classpath.
   