fun main(vararg args: String)
{
    texto();
    enumTest();
}

//Métodos podem ser adicionados à biblioteca desejada
fun String.reply()
{
    println(toString())
}

fun texto()
{
    val a : String = "Olá"
    "$a mundo".reply();
}

fun enumTest()
{
    val a : EnumExample = EnumExample.ESPERANDO_PAGAMENTO;
    //Fluxo de decisão when pra possiveis valores.
    when(a)
    {
        EnumExample.ENTREGUE -> "Pedido já entregue, ${a.name}".reply()
        EnumExample.A_CAMINHO -> "Pedido a caminho, aguarde o prazo de entrega, ${a.name}".reply();
        EnumExample.ESPERANDO_PAGAMENTO -> "Pague o aluguel. ${a.name}".reply();
        else -> "Pedido não localizado".reply();
    }
}