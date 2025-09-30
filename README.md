# Ruta Escolar — Dominio Hexagonal

Núcleo de dominio para **asignar un bus y un conductor** a una ruta usando **puertos y adaptadores**. Incluye **2 pruebas unitarias** con **JUnit 5**. Pensado para NetBeans o cualquier IDE Java.

## Estructura
pom.xml
src/
├─ main/java/co/edu/rutaescolar/desarrollo/pi/und2/
│ ├─ aplicacion/AsignarBusUseCase.java
│ └─ dominio/
│ ├─ entidades/{Bus.java, Conductor.java, Ruta.java}
│ ├─ eventos/AsignacionRealizada.java
│ ├─ excepciones/{SinBusDisponible.java, SinConductorDisponible.java}
│ ├─ puertos/{RepoBus.java, RepoConductor.java}
│ ├─ servicios/AsignadorDeRecursos.java
│ └─ vo/{Placa.java, Capacidad.java, Itinerario.java}
└─ test/java/co/edu/rutaescolar/desarrollo/pi/und2/aplicacion/AsignarBusUseCaseTest.java

Decisiones de diseño (resumen)

- Lenguaje ubicuo: Ruta, Bus, Conductor, Itinerario, Capacidad, Asignación.
- Hexagonal / DIP:
  * Puertos OUT: RepoBus, RepoConductor.
  * Caso de uso IN: AsignarBusUseCase.
  * Servicio de dominio: AsignadorDeRecursos.
  - Reglas clave:
  * Selección de bus con capacidad >= demandaMinima.
  * Requiere al menos un conductor disponible.
  * Ruta.asignarBus() evita doble asignación.
  - Pruebas sin infraestructura: dobles de puertos en memoria.

Pruebas sin infraestructura: dobles de puertos en memoria.
