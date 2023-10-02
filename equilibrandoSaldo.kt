fun main() {
    var saldoAtual = readLine()!!.toFloat()
    var valorDeposito = readLine()!!.toFloat()
    var valorRetirada = readLine()!!.toFloat()

    //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    if (valorDeposito >= 0){
      saldoAtual = saldoAtual + valorDeposito;
    }
    
    if (valorRetirada <= saldoAtual){
      saldoAtual = saldoAtual - valorRetirada;
    }

  //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    println("Saldo atualizado na conta: $saldoAtual")

}