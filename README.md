# Simulador-de-Batalha-Pokemon

<p align="center"> •
<a href="#sobre">Sobre</a> •
<a href="#instruções">Instruções</a> •
<a href="#tecnologias">Tecnologias</a> •
<a href="#pré-requisitos">Pré-requisitos</a> •
<a href="#autor">Autor</a>
</p>

# Sobre
 Avaliação Continuada AC1, da disciplina de Linguagens de Programação do Curso de Análise e Desenvolvimento de Sistemas, segundo semestre!

# Instruções

• Declare uma classe Pokemon, com os seguintes atributos (lembre-se de torná-los privados e de fazer getters públicos para eles):
<br /> String nome;
<br /> String tipo;
<br /> int vida;

• A classe Pokemon deve ter os métodos:

• Construtor, que deve receber dois parâmetros: String nome, String tipo. Esse construtor deve atribuir um valor para o atributo vida conforme o tipo:
<br /> tipo = "fogo": vida = 180;
<br /> tipo = "agua": vida = 195;
<br /> tipo = "terra": vida = 220;
<br /> tipo = "ar": vida = 225;
<br /> outro tipo qualquer: vida = 200;

• Método imprime(), que deve exibir um JOptionPane.showMessageDialog() com uma mensagem mostrando o Nome, Tipo e Vida do Pokemon em questão.

• Construa uma tela (JFrame) chamada Batalha, que deve mostrar algo assim:

• A ideia é que quando o Nome e Tipo for preenchido, o botão "Imprime" de cada Pokemón deve instanciar um objeto diferente (pokemon1 ou pokemon2), passando o nome e tipo no construtor, e chamar o método imprime() correspondente.
Quando o botão "Batalha!" for apertado, deve ser exibida uma mensagem assim: "O Pokemón 1 ganhou!" ou "O Pokemón 2 ganhou!":
Instancie os dois Pokemóns. Faça uma comparação (if) do atributo vida de cada Pokemón (pokemon1 e pokemon2), ganha o que tiver maior vida.
Use um JOptionPane.showMessageDialog() para exibir essa mensagem.

# Tecnologias
<p> As seguintes ferramentas foram usadas na construção desse projeto:</p>
<p>• Java </p>
<p>• Swing </p>

# Pré-requisitos
<p>• <a href="https://netbeans.apache.org">Apache Netbeans </a></p>

<h1 align="center"> Demonstração prática</h1>

![Animação](https://user-images.githubusercontent.com/99789822/193953441-73d6139c-8889-4636-b77d-928c91aedbb7.gif)

# Autor
<p> JOÃO VICTOR 👋 <a href="https://www.linkedin.com/in/ojoaovictor/"> Entre em Contato!</a> </p>
