package greetings.message;
class Hello {
  static def Message(steps,String name="world"){
    steps.echo("Hello ${name}, nice to meet you!")
  }
}