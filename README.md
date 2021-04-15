# Patrón de Diseño - Estructural - Decorator

Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

El patrón decorator está diseñado para solucionar problemas donde la jerarquía con subclasificación no puede ser aplicada, o se requiere de un gran impacto en todas las clases de la jerarquía con el fin de poder lograr el comportamiento esperado. Decorator permite al usuario añadir nuevas funcionalidades a un objeto existente sin alterar su estructura, mediante la adición de nuevas clases que envuelven a la anterior dándole funcionamiento extra.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Composite/blob/master/img/composite-diagram.png?raw=true)

En la imagen podemos apreciar los distintos componentes que conforman el patrón de diseño Decorator los cuales se explican a continuación:

IComponent: Interface que define la estructura minina del componente o componentes que pueden ser decorados.
ConcreteComponent: Implementación de IComponent y define un objeto concreto que puede ser decorado.
ComponentDecorator: Por lo general es una clase abstracta que define la estructura mínima de un Decorador, el cual mínimamente deben de heredar de IComponent y contener alguna subclase de IComponent al cual decorarán.
ComponentDecoratorImpl: Representan todos los decoradores concretos que heredan de ComponentDecorator.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Composite/blob/master/img/composite-diagram.png?raw=true)

* El Cliente realiza una operación sobre el DecoratorA.
* El DecoratorA realiza la misma operación sobre DecoradorB.
* El decoradorB realiza una acción sobre ConcreteComponente.
* El DecoradorB ejecuta una operación de decoración.
* El DecoradorA ejecuta una operación de decoración.
* El Cliente recibe como resultado un objeto decorado por todos los Decoradores, los cuales encapsularon el Component en varias capas.

## Analogía en el mundo real

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Composite/blob/master/img/composite-diagram.png?raw=true)

Vestir ropa es un ejemplo del uso de decoradores. Cuando tienes frío, te cubres con un suéter. Si sigues teniendo frío a pesar del suéter, puedes ponerte una chaqueta encima. Si está lloviendo, puedes ponerte un impermeable. Todas estas prendas “extienden” tu comportamiento básico pero no son parte de ti, y puedes quitarte fácilmente cualquier prenda cuando lo desees.

