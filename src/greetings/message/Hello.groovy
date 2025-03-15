package greetings.message;
class Hello {
  static def Message(steps,String name="world"){
    println("Hello ${name}!")
    steps.echo("Hello ${name}, nice to meet you!")
  }
}