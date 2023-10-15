fun main() {
  // Entrada de dados
  var saldoTotal = readLine() !!.toInt()
  val valorSaque = readLine() !!.toInt()

  //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  if (saldoTotal >= valorSaque){
    saldoTotal = saldoTotal - valorSaque
    println ("Saque realizado com sucesso. Novo saldo: $saldoTotal")
    }
    else{
    println("Saldo insuficiente. Saque nao realizado!")
  }
}