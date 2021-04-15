# Patrón de Diseño - Estructural - Decorator

Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

El patrón decorator está diseñado para solucionar problemas donde la jerarquía con subclasificación no puede ser aplicada, o se requiere de un gran impacto en todas las clases de la jerarquía con el fin de poder lograr el comportamiento esperado. Decorator permite al usuario añadir nuevas funcionalidades a un objeto existente sin alterar su estructura, mediante la adición de nuevas clases que envuelven a la anterior dándole funcionamiento extra.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Decorator/blob/master/img/decorator-diagram.png?raw=true)

En la imagen podemos apreciar los distintos componentes que conforman el patrón de diseño Decorator los cuales se explican a continuación:

IComponent: Interface que define la estructura minina del componente o componentes que pueden ser decorados.
ConcreteComponent: Implementación de IComponent y define un objeto concreto que puede ser decorado.
ComponentDecorator: Por lo general es una clase abstracta que define la estructura mínima de un Decorador, el cual mínimamente deben de heredar de IComponent y contener alguna subclase de IComponent al cual decorarán.
ComponentDecoratorImpl: Representan todos los decoradores concretos que heredan de ComponentDecorator.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Decorator/blob/master/img/decorator-sequence.png?raw=true)

* El Cliente realiza una operación sobre el DecoratorA.
* El DecoratorA realiza la misma operación sobre DecoradorB.
* El decoradorB realiza una acción sobre ConcreteComponente.
* El DecoradorB ejecuta una operación de decoración.
* El DecoradorA ejecuta una operación de decoración.
* El Cliente recibe como resultado un objeto decorado por todos los Decoradores, los cuales encapsularon el Component en varias capas.

## Analogía en el mundo real

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Decorator/blob/master/img/decorator-comic-1.png?raw=true)

Vestir ropa es un ejemplo del uso de decoradores. Cuando tienes frío, te cubres con un suéter. Si sigues teniendo frío a pesar del suéter, puedes ponerte una chaqueta encima. Si está lloviendo, puedes ponerte un impermeable. Todas estas prendas “extienden” tu comportamiento básico pero no son parte de ti, y puedes quitarte fácilmente cualquier prenda cuando lo desees.

## Estructura de la composición del diseño

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Decorator/blob/master/img/structure.png?raw=true)

1.- El Componente declara la interfaz común tanto para wrappers como para objetos envueltos.

2.- Componente Concreto es una clase de objetos envueltos. Define el comportamiento básico, que los decoradores pueden alterar.

3.- La clase Decoradora Base tiene un campo para referenciar un objeto envuelto. El tipo del campo debe declararse como la interfaz del componente para que pueda contener tanto los componentes concretos como los decoradores. La clase decoradora base delega todas las operaciones al objeto envuelto.

4.- Los Decoradores Concretos definen funcionalidades adicionales que se pueden añadir dinámicamente a los componentes. Los decoradores concretos sobrescriben métodos de la clase decoradora base y ejecutan su comportamiento, ya sea antes o después de invocar al método padre.

5.- El Cliente puede envolver componentes en varias capas de decoradores, siempre y cuando trabajen con todos los objetos a través de la interfaz del componente.
