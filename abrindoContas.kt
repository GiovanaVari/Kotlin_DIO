import java.util.Scanner

class Bancaria(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
  fun getNumeroConta(): Int {
    return numeroConta
  }

  fun getNomeTitular(): String {
    return nomeTitular
  }

  fun getSaldo(): Double {
    return saldo
  }
}

fun main() {
  val scanner = Scanner(System.
    `in`)

  val numeroConta = scanner.nextInt()
  scanner.nextLine()

  val nomeTitular = scanner.nextLine()

  val saldo = scanner.nextDouble()

  //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada(Conta, Titular, saldo).
  val conta = Bancaria(numeroConta, nomeTitular, saldo)

  println("Informacoes:")
  
  //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
  println("Conta: ${conta.getNumeroConta()}")
  println("Titular: ${conta.getNomeTitular()}")
  println("Saldo: R$ ${conta.getSaldo()}")
}