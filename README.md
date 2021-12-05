Example output of `mvn test`.

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running FooTest
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.126 s <<< FAILURE! - in FooTest
[ERROR] Running a test that fails  Time elapsed: 0.009 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: not equal but was: <Hello world!>
	at com.example.FooTest.thenFail(FooTest.java:29)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   FooTest.thenFail:29 expected: not equal but was: <Hello world!>
[INFO] 
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0
```
