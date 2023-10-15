import java.util.Scanner

fun main() {
    //Esta linha está criando um objeto Scanner que lê a entrada do usuário a partir do console.
    val scanner = Scanner(System.`in`)
    
    //Esta linha está lendo a próxima linha de entrada do usuário e armazenando-a na variável entrada.
    val entrada = scanner.nextLine()
    
    //Esta linha está dividindo a string entrada em partes sempre que encontra uma vírgula (,). Cada parte é então armazenada como um elemento em um array, que é armazenado na variável partes.
    val partes = entrada.split(",".toRegex()).toTypedArray()
    

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao em uma linha (data,hora,descricao,valor).
    val data = partes[0]
    val hora = partes[1]
    val descricao = partes[2]
    val valor = partes[3].toDouble()
    val transacao = Transacao(data, hora, descricao, valor)
    transacao.imprimir()
}

class Transacao(private val data: String, private val hora: String, private val descricao: String, private val valor: Double) {

    fun imprimir() {
        println(descricao)
        println(data)
        println(hora)
        System.out.printf("%.2f", valor)
    }
}