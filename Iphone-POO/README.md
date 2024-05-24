
# POO - Trilha Java Básico

classDiagram
    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
    <<Interface>> ReprodutorMusical
    <<Interface>> AparelhoTelefonico
    <<Interface>> NavegadorInternet
    class Iphone{
        +verificarTocando()
    }
    class ReprodutorMusical{
      +selecionarMusica(String musica)
      +tocar()
      +pausar()
    }
    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo