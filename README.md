<p align="center">
  <img src="https://github.com/hildocosta/hildocosta-Curso-Java--Nelio-Alves/blob/main/logo.png" width="300">
</p>

<h1 align="center">🚀 Explorando Exceções em Java</h1>

<p>🔥 Bem-vindo ao repositório dedicado à exploração do conceito de exceções na linguagem de programação Java. Aqui, você encontrará uma variedade de recursos para entender, praticar e dominar o uso de exceções para lidar com erros e situações inesperadas em seus programas.</p>

<p>🎓 Sou estudante de Engenharia de Computação no 3º semestre, e estou em busca de aprimorar minhas habilidades em Java, especialmente em tratamento de exceções. Este repositório serve como um ambiente de aprendizado, oferecendo exemplos práticos, exercícios desafiadores e projetos para aprofundar meu entendimento sobre o uso eficaz de exceções.</p>

<p>💡 O objetivo principal é entender como as exceções funcionam em Java, aprender a identificar e lidar com diferentes tipos de exceções, e aplicar boas práticas de tratamento de erros para tornar meus programas mais robustos e seguros.</p>

<h2 align="center">🔒 Licença</h2>

<p>⚖️ Este projeto está licenciado sob a <a href="LICENSE">Licença MIT</a>.</p>

<h2 align="center">📧 Contato</h2>

<h3>🔗 Redes Sociais e Contato</h3>

<ul>
  <li>📌 GitHub: <a href="https://github.com/hildocosta">hildocosta</a></li>
  <li>💼 LinkedIn: <a href="https://www.linkedin.com/in/hildo-costa-b83812231/">Hildo Costa</a></li>
  <li>✉️ Email: hildo.costa@pm.pr.gov.br</li>
</ul>

<p>Agora que estamos preparados, vamos explorar o mundo das exceções em Java!</p>

<h2 align="center">🚀 Vamos Começar</h2>

<h3>🔥 Tratamento de Exceções</h3>

<p>O tratamento de exceções em Java permite que você lide com situações inesperadas que podem ocorrer durante a execução de um programa. As exceções podem ocorrer devido a erros de programação, condições inesperadas durante a execução ou problemas externos, como falhas de rede ou acesso a arquivos.</p>

<p>Para lidar com exceções, você pode usar as palavras-chave <code>try</code>, <code>catch</code> e <code>finally</code>. O bloco <code>try</code> contém o código que pode gerar uma exceção. O bloco <code>catch</code> é usado para capturar e tratar a exceção, enquanto o bloco <code>finally</code> é opcional e é executado sempre, independentemente de ocorrer uma exceção ou não.</p>

<p>Além disso, em Java, as exceções são representadas por objetos das classes da hierarquia <code>Throwable</code>. Existem duas categorias principais de exceções: as exceções verificadas, que devem ser tratadas pelo programador, e as exceções não verificadas (também conhecidas como RuntimeExceptions), que podem ser tratadas opcionalmente.</p>

Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.

Em Java, uma exceção é um objeto herdado da classe:
java.lang.Exception - o compilador obriga a tratar ou propagar.
java.lang.RuntimeException - o compilador não obriga a tratar ou propagar.

Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado.

<p>Entender como trabalhar com exceções é essencial para escrever código robusto e confiável em Java.</p>

<h3>Hierarquia de Exceções em Java:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_01.png">
</p>

<h3>Por que exceções?</h3>

O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas.
Vantagens:

Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
A exceção pode carregar dados quaisquer.

<h2 align="center"> Estrutura try-catch</h2>

Bloco try
Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção.

Bloco catch

Contém o código a ser executado caso uma exceção ocorra.
Deve ser especificado o tipo de exceção a ser tratada (upcasting é permitido).

Demo <p align="center">

<img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_02.png" width="300">
</p>

<h2 align="center"> Bloco Finally</h2>

É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
Exemplo Clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.

<p align="center">
<img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_03.png" width="300">
</p>

<h3>Sugestão de Pacotes "model"</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_04.png">
</p>

<h2> Exercício 01 </h2>

<p>Nesse exercício iremos realizar 03 formas de resolução: (Versão-01, Versão-02 e Versão-03)</p>

<p>💥 Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva e mostrar novamente a reserva com os dados atualizados.</p>

<p>O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:</p>

Alterações de reserva só podem ocorrer para datas futuras.
A data de saída deve ser maior que a data de entrada.

<h3>Projeto UML:</h3> 

 <p align="center">
  <img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_05.png">
</p>

```
Room number: 8021
Check-in data (dd/MM/yyyy): 23/09/2019
Check-out data (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data update the reservation:
Check-in data (dd/MM/yyyy): 24/09/2019
Check-out data (dd/MM/yyyy): 29/09/2019
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights


Room number: 8021
Check-in data (dd/MM/yyyy): 23/09/2019
Check-out data (dd/MM/yyyy): 21/09/2019

Error in reservation: Check-out date must be after check-in date


Room number: 8021
Check-in data (dd/MM/yyyy): 23/09/2019
Check-out data (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data update the reservation:
Check-in data (dd/MM/yyyy): 24/09/2019
Check-out data (dd/MM/yyyy): 22/09/2019
Error in reservation: Check-out date must be after check-in date


Room number: 8021
Check-in data (dd/MM/yyyy): 23/09/2019
Check-out data (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data update the reservation:
Check-in data (dd/MM/yyyy): 24/09/2015
Check-out data (dd/MM/yyyy): 22/09/2015
Error in reservation: Reservation dates for updates must be future dates

```

<h2> Exercício 02 </h2>

<p>💥 Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.
<p>Implemente a conta bancária conforme projeto abaixo:</p>

<h3>Projeto UML:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Excecoes/blob/main/imagem_06.png">
</p>


<h3>Exemplo:</h3>


```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00


Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance

```
