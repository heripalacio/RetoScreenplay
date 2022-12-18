#language: es
Característica: categoria

  Antecedentes:
    Dado el usuario se encuentre en la pagina web e ingrese al boton cuenta
    Cuando registre sus datos de logueo correctamente
    Y ingrese a su perfil

  Escenario: buscar por categoria
    Dado el usuario se encuentre seleccionando un producto en la opcion de categoria
    Cuando  agregue tres cantidades del mismo pruducto al carro de compras luego agregue un segundo producto al carrito
    Y ingrese al carro de compras para eliminar los productos
    Entonces el usuario visualizara el carrito de compras vacio
