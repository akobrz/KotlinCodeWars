fun main(args: Array<String>) {
    assertEquals3("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
    assertEquals3("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
    assertEquals3("8aaaaaddddr", noSpace("8aaaaa dddd r     "))
}


fun noSpace(x: String) = x.filterNot { it.isWhitespace() }


fun assertEquals3(s1: String, s2: String) {
    println(s1.equals(s2))
}