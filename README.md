# Conversor de Divisas

Este es un proyecto de un conversor de divisas en Java que utiliza una API para obtener tasas de cambio en tiempo real. 
Los usuarios pueden ingresar la moneda base, la moneda de destino y la cantidad que desean convertir.

## Características

- Conversión de varias divisas.
- Interacción a través de la consola.
- Utiliza una API para obtener tasas de cambio actualizadas.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Apache HttpClient**: Biblioteca para realizar solicitudes HTTP.
- **JSON.org**: Biblioteca para manipular datos en formato JSON.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Maven para la gestión de dependencias.

## Instalación

1. Clona el repositorio:

''bash
git clone https://github.com/Dany1289/ConversorDeDivisa.git


Navega al directorio del proyecto:

''bash
cd ConversorDeDivisa
Compila el proyecto utilizando Maven:



mvn clean install

Uso
Asegúrate de tener una clave de API válida para el servicio de conversión de divisas que elijas.

Reemplaza YOUR_API_KEY en la clase ApiService con tu clave API.


Ejecuta la aplicación:

''bash
mvn exec:java -Dexec.mainClass="com.conversordemonedas.ConversorMonedas"

Sigue las instrucciones en la consola para realizar la conversión.


Ejemplo de Uso

java

Introduce la moneda base (ej. USD): 
USD

Introduce la moneda de destino (ej. EUR): 
EUR

Introduce la cantidad a convertir: 
100

Resultado: 85.00 EUR


Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

Realiza un fork del proyecto.
Crea una nueva rama (git checkout -b feature-nueva-funcionalidad).
Realiza tus cambios y haz commit (git commit -m 'Añadir nueva funcionalidad').
Haz push a la rama (git push origin feature-nueva-funcionalidad).
Abre un Pull Request.


Licencia

Este proyecto está licenciado bajo la Licencia MIT.
