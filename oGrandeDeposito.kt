import java.util.Scanner
import java.text.DecimalFormat

fun main() {
  val scanner = Scanner(System.
    `in`)
  val valor = scanner.nextDouble()
  val formatador = DecimalFormat("#,##0.00")
  val valorFormatado = formatador.format(valor)

  if (valor > 0) {
    //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
    println("Deposito realizado com sucesso!")
    println("Saldo atual: R$ $valorFormatado")
  } else if (valor < 0.0) {
    //TODO: Imprimir a mensagem de valor inválido.
    println("Valor invalido! Digite um valor maior que zero.")
  } else {
    //TODO: Imprimir a mensagem de encerrar o programa.
    println("Encerrando o programa...")
  }
}