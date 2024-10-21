fun main() {
    val cursos = mutableListOf<Formacao>()

    cursos.apply{
        add(
            Formacao(
                nome = "Introdução a Lógica de Programação",
                conteudos = listOf(
                    ConteudoEducacional("Variaveis"),
                    ConteudoEducacional("Estruturas Condicionais"),
                    ConteudoEducacional("Estruturas de Repetições"),
                    ConteudoEducacional("Arrays"),
                    ConteudoEducacional("Funções")
                ),Nivel.BASICO
            )
        )
        add(
            Formacao(
                nome = "Programação Android",
                conteudos = listOf(
                    ConteudoEducacional("Instalando e conhecendo Android Studio",60),
                    ConteudoEducacional("Criando o primeiro aplicativo",240),
                    ConteudoEducacional("Utilizando API Google",120),
                    ConteudoEducacional("Postando o aplicativo no Google Play",30)
                ),Nivel.INTERMEDIARIO
            )
        )
        add(
            Formacao(
                nome = "Implementando a Arquitetura MVVM",
                conteudos = listOf(
                    ConteudoEducacional("O que são Model",60),
                    ConteudoEducacional("View",90),
                    ConteudoEducacional("ViewModel",120),
                    ConteudoEducacional("Implementado",100)
                ),Nivel.AVANCADO
            )
        )
    }

    val Eduardo = Usuario("Eduardo",1)
    val Alice = Usuario("Alice",2)
    val Pedro = Usuario("Pedro",3)
    val Roberto = Usuario("Roberto",4)
    val Maria = Usuario("Maria",5)
    val Yasmin = Usuario("Yasmin",6)

    cursos[0].matricular(Eduardo)
    cursos[0].matricular(Roberto)

    cursos[1].matricular(Pedro)
    cursos[1].matricular(Eduardo,Pedro,Alice, Yasmin)

    cursos[2].matricular(Maria)
    cursos[2].matricular(Maria,Yasmin)

    cursos.forEach { println("\n$it") }

}