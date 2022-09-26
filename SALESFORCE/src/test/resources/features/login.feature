#language:es

@Login
Necesidad del negocio: realizar el login del aplicativo
  yo como usuario requiero ingresar al aplicativo de salesforce para validar sus procesos

  @Login_prueba
  Esquema del escenario: validar el ingreso al aplicativo
    Dado un usuario en la pag de salesforce
    Cuando ingrese sus credenciales
      | usuario   | password |
      | <usuario> | <pass>   |
    Entonces debera visualizar la pagina inicial
    Ejemplos:
      | usuario                               | pass               |
      | hapineda@azteca-comunicaciones.com.qa | Totalplay123452024 |

