/**
 * TAREA-1:
 * Crear una clase "Perro" con atributos:
 * nombre
 * raza
 * edad
 * está vacunado
 *
 * Y con funciones:
 * mostrar nombre y raza
 * actualizar raza (Posteriormente mostrar otra vez nombre y raza)
 * mostrar "Su perro es cachorro" si su edad es menor que 3
 * mostrar "Su perro no corre peligro de enfermedades" si está vacunado,
 * sino mostrar "A su perro le puede dar Parvovirus o Distemper".
 *
 * ------ NOTA: 14 -------
 */
fun main() {
    val animal = Perro()
    animal.mostrarNombre()
    animal.nombre = "Doki"
    animal.raza = "Mastin"
    animal.mostrarConSufijo("animal")
    animal.actualizarRaza("chusco")
    animal.mostrarNombre()
    animal.edad = 2
    animal.estaVacunado = false
    animal.mostrarSiEsCachorro()
    animal.mostrarSiCorrePeligro()
    println("--------------")




    val animal2 = Perro()
    animal2.mostrarNombre()
    animal2.nombre = "Jei"
    animal2.raza = "Labrador"
    animal2.mostrarConSufijo("animal2")
    animal2.actualizarRaza("labrador no puro")
    animal2.mostrarNombre()
    animal2.edad = 4
    animal2.estaVacunado = true
    animal2.mostrarSiEsCachorro()
    animal2.mostrarSiCorrePeligro()


}
