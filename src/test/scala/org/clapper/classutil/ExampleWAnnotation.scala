package org.clapper.classutil

/**
 * An Example class with an Annotation,
 *   to make sure we find Annotations correctly
 */
@Example(exampleStrField="Hey Yah!!", exampleIntField=200)
class ExampleWAnnotation {
  
    @MethodExample(methodStrField="This is the Method")
    def myMethod() = { println("Hello there")}
  
}