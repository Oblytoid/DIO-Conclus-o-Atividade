data class Formacao(
    val nome: String,
    var conteudos: List<ConteudoEducacional>,
    val dificuldade: Nivel
) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {

        for (user in usuarios) {
            if (inscritos.none { it.id == user.id }) {
                inscritos.add(user)
                println("${user.nome} com a ID ${user.id}, foi matriculado com sucesso.")
            } else {
                println("${user.nome} já está matriculado.")
            }
        }
        inscritos.sortBy { it.id }
    }

    fun exibirInscritos(): String {
        var str: String
        if (inscritos.isEmpty()) {
            str = "Nenhum inscrito na formação $nome."
        } else {
            str = "Inscritos na Formação $nome:\n ID:\t Nome:\n"
            inscritos.forEach { inscrito ->
                str += "- ${inscrito.id} \t ${inscrito.nome}\n"
            }
        }
        return str
    }

    override fun toString(): String {
        val conteudosString = conteudos.joinToString(separator = "\n") { conteudo ->
            "- ${conteudo.nome}, Duração: ${conteudo.duracao} minutos"
        }
        return "Formação: $nome, Dificuldade: $dificuldade\nConteúdos:\n$conteudosString\n${exibirInscritos()}"
    }
}