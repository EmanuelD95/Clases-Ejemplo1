class Perro {
    var nombre: String = ""
    var raza: String = ""
    var edad: Int = 0
    var estaVacunado: Boolean = false

    fun mostrarNombre() {
        println("$nombre $raza")
    }
    fun mostrarConSufijo(sufijo: String) {
        println("$nombre $raza $sufijo")
    }
    fun actualizarRaza(nuevaRaza: String) {
        raza = nuevaRaza
    }
    fun mostrarSiEsCachorro() {
        if (edad < 3)
            println("Su perro es cachoro")
    }
    fun mostrarSiCorrePeligro() {
        if (estaVacunado) println("Su perro no corre peligro de enfermedades")
        else println("A su perro le puede dar parvovirus o distemper")
    }
}